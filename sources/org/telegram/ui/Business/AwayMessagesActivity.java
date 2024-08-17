package org.telegram.ui.Business;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$BusinessAwayMessageSchedule;
import org.telegram.tgnet.TLRPC$TL_account_updateBusinessAwayMessage;
import org.telegram.tgnet.TLRPC$TL_boolFalse;
import org.telegram.tgnet.TLRPC$TL_businessAwayMessage;
import org.telegram.tgnet.TLRPC$TL_businessAwayMessageScheduleAlways;
import org.telegram.tgnet.TLRPC$TL_businessAwayMessageScheduleCustom;
import org.telegram.tgnet.TLRPC$TL_businessAwayMessageScheduleOutsideWorkHours;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.tgnet.TLRPC$TL_inputBusinessAwayMessage;
import org.telegram.tgnet.TLRPC$UserFull;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Business.QuickRepliesController;
import org.telegram.ui.Cells.TextCell;
import org.telegram.ui.Cells.TextCheckCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.CircularProgressDrawable;
import org.telegram.ui.Components.CrossfadeDrawable;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.UniversalRecyclerView;

public class AwayMessagesActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate {
    private int currentScheduleCustomEnd;
    private int currentScheduleCustomStart;
    public TLRPC$TL_businessAwayMessage currentValue;
    public int currentValueScheduleType;
    private ActionBarMenuItem doneButton;
    private CrossfadeDrawable doneButtonDrawable;
    public boolean enabled;
    public boolean exclude;
    private boolean hasHours;
    private UniversalRecyclerView listView;
    public boolean offline_only;
    private BusinessRecipientsHelper recipientsHelper;
    public int schedule;
    public int scheduleCustomEnd;
    public int scheduleCustomStart;
    private int shiftDp = -4;
    private boolean valueSet;

    @Override
    public View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.BusinessAway));
        this.actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() {
            @Override
            public void onItemClick(int i) {
                if (i == -1) {
                    if (AwayMessagesActivity.this.onBackPressed()) {
                        AwayMessagesActivity.this.lambda$onBackPressed$308();
                    }
                } else if (i == 1) {
                    AwayMessagesActivity.this.processDone();
                }
            }
        });
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i = Theme.key_actionBarDefaultIcon;
        mutate.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i), PorterDuff.Mode.MULTIPLY));
        this.doneButtonDrawable = new CrossfadeDrawable(mutate, new CircularProgressDrawable(Theme.getColor(i)));
        this.doneButton = this.actionBar.createMenu().addItemWithWidth(1, this.doneButtonDrawable, AndroidUtilities.dp(56.0f), LocaleController.getString("Done", R.string.Done));
        checkDone(false);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundGray));
        BusinessRecipientsHelper businessRecipientsHelper = new BusinessRecipientsHelper(this, new Runnable() {
            @Override
            public final void run() {
                AwayMessagesActivity.this.lambda$createView$0();
            }
        });
        this.recipientsHelper = businessRecipientsHelper;
        businessRecipientsHelper.setExclude(this.exclude);
        BusinessRecipientsHelper businessRecipientsHelper2 = this.recipientsHelper;
        if (businessRecipientsHelper2 != null) {
            TLRPC$TL_businessAwayMessage tLRPC$TL_businessAwayMessage = this.currentValue;
            businessRecipientsHelper2.setValue(tLRPC$TL_businessAwayMessage == null ? null : tLRPC$TL_businessAwayMessage.recipients);
        }
        UniversalRecyclerView universalRecyclerView = new UniversalRecyclerView(this, new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                AwayMessagesActivity.this.fillItems((ArrayList) obj, (UniversalAdapter) obj2);
            }
        }, new Utilities.Callback5() {
            @Override
            public final void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                AwayMessagesActivity.this.onClick((UItem) obj, (View) obj2, ((Integer) obj3).intValue(), ((Float) obj4).floatValue(), ((Float) obj5).floatValue());
            }
        }, null);
        this.listView = universalRecyclerView;
        frameLayout.addView(universalRecyclerView, LayoutHelper.createFrame(-1, -1.0f));
        setValue();
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    public void lambda$createView$0() {
        this.listView.adapter.update(true);
        checkDone(true);
    }

    private void setValue() {
        UniversalRecyclerView universalRecyclerView;
        UniversalAdapter universalAdapter;
        if (this.valueSet) {
            return;
        }
        TLRPC$UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
        if (userFull == null) {
            getMessagesController().loadUserInfo(getUserConfig().getCurrentUser(), true, getClassGuid());
            return;
        }
        TLRPC$TL_businessAwayMessage tLRPC$TL_businessAwayMessage = userFull.business_away_message;
        this.currentValue = tLRPC$TL_businessAwayMessage;
        this.hasHours = userFull.business_work_hours != null;
        this.enabled = tLRPC$TL_businessAwayMessage != null;
        this.exclude = tLRPC$TL_businessAwayMessage != null ? tLRPC$TL_businessAwayMessage.recipients.exclude_selected : true;
        this.offline_only = tLRPC$TL_businessAwayMessage != null ? tLRPC$TL_businessAwayMessage.offline_only : true;
        BusinessRecipientsHelper businessRecipientsHelper = this.recipientsHelper;
        if (businessRecipientsHelper != null) {
            businessRecipientsHelper.setValue(tLRPC$TL_businessAwayMessage == null ? null : tLRPC$TL_businessAwayMessage.recipients);
        }
        TLRPC$TL_businessAwayMessage tLRPC$TL_businessAwayMessage2 = this.currentValue;
        if (tLRPC$TL_businessAwayMessage2 != null) {
            TLRPC$BusinessAwayMessageSchedule tLRPC$BusinessAwayMessageSchedule = tLRPC$TL_businessAwayMessage2.schedule;
            if (tLRPC$BusinessAwayMessageSchedule instanceof TLRPC$TL_businessAwayMessageScheduleCustom) {
                this.currentValueScheduleType = 2;
                this.schedule = 2;
                TLRPC$TL_businessAwayMessageScheduleCustom tLRPC$TL_businessAwayMessageScheduleCustom = (TLRPC$TL_businessAwayMessageScheduleCustom) tLRPC$BusinessAwayMessageSchedule;
                int i = tLRPC$TL_businessAwayMessageScheduleCustom.start_date;
                this.currentScheduleCustomStart = i;
                this.scheduleCustomStart = i;
                int i2 = tLRPC$TL_businessAwayMessageScheduleCustom.end_date;
                this.currentScheduleCustomEnd = i2;
                this.scheduleCustomEnd = i2;
                universalRecyclerView = this.listView;
                if (universalRecyclerView != null && (universalAdapter = universalRecyclerView.adapter) != null) {
                    universalAdapter.update(true);
                }
                checkDone(true);
                this.valueSet = true;
            }
        }
        this.scheduleCustomStart = getConnectionsManager().getCurrentTime();
        this.scheduleCustomEnd = getConnectionsManager().getCurrentTime() + 86400;
        TLRPC$TL_businessAwayMessage tLRPC$TL_businessAwayMessage3 = this.currentValue;
        if (tLRPC$TL_businessAwayMessage3 != null && (tLRPC$TL_businessAwayMessage3.schedule instanceof TLRPC$TL_businessAwayMessageScheduleAlways)) {
            this.currentValueScheduleType = 0;
            this.schedule = 0;
        } else if (tLRPC$TL_businessAwayMessage3 != null && (tLRPC$TL_businessAwayMessage3.schedule instanceof TLRPC$TL_businessAwayMessageScheduleOutsideWorkHours)) {
            this.currentValueScheduleType = 1;
            this.schedule = 1;
        } else {
            this.currentValueScheduleType = 0;
            this.schedule = 0;
        }
        universalRecyclerView = this.listView;
        if (universalRecyclerView != null) {
            universalAdapter.update(true);
        }
        checkDone(true);
        this.valueSet = true;
    }

    public boolean hasChanges() {
        if (!this.valueSet) {
            return false;
        }
        boolean z = this.enabled;
        TLRPC$TL_businessAwayMessage tLRPC$TL_businessAwayMessage = this.currentValue;
        if (z != (tLRPC$TL_businessAwayMessage != null)) {
            return true;
        }
        if (z && tLRPC$TL_businessAwayMessage != null) {
            if (tLRPC$TL_businessAwayMessage.recipients.exclude_selected != this.exclude) {
                return true;
            }
            BusinessRecipientsHelper businessRecipientsHelper = this.recipientsHelper;
            if (businessRecipientsHelper != null && businessRecipientsHelper.hasChanges()) {
                return true;
            }
            int i = this.currentValueScheduleType;
            int i2 = this.schedule;
            if (i != i2 || this.currentValue.offline_only != this.offline_only) {
                return true;
            }
            if (i2 == 2 && (this.currentScheduleCustomStart != this.scheduleCustomStart || this.currentScheduleCustomEnd != this.scheduleCustomEnd)) {
                return true;
            }
        }
        return false;
    }

    private void checkDone(boolean z) {
        if (this.doneButton == null) {
            return;
        }
        boolean hasChanges = hasChanges();
        this.doneButton.setEnabled(hasChanges);
        if (z) {
            this.doneButton.animate().alpha(hasChanges ? 1.0f : 0.0f).scaleX(hasChanges ? 1.0f : 0.0f).scaleY(hasChanges ? 1.0f : 0.0f).setDuration(180L).start();
            return;
        }
        this.doneButton.setAlpha(hasChanges ? 1.0f : 0.0f);
        this.doneButton.setScaleX(hasChanges ? 1.0f : 0.0f);
        this.doneButton.setScaleY(hasChanges ? 1.0f : 0.0f);
    }

    public void processDone() {
        if (this.doneButtonDrawable.getProgress() > 0.0f) {
            return;
        }
        if (!hasChanges()) {
            lambda$onBackPressed$308();
            return;
        }
        QuickRepliesController.QuickReply findReply = QuickRepliesController.getInstance(this.currentAccount).findReply("away");
        boolean z = this.enabled;
        if (z && findReply == null) {
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
            View findViewByItemId = this.listView.findViewByItemId(2);
            int i = -this.shiftDp;
            this.shiftDp = i;
            AndroidUtilities.shakeViewSpring(findViewByItemId, i);
            UniversalRecyclerView universalRecyclerView = this.listView;
            universalRecyclerView.smoothScrollToPosition(universalRecyclerView.findPositionByItemId(2));
            return;
        }
        if (!z || this.recipientsHelper.validate(this.listView)) {
            this.doneButtonDrawable.animateToProgress(1.0f);
            TLRPC$UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
            TLRPC$TL_account_updateBusinessAwayMessage tLRPC$TL_account_updateBusinessAwayMessage = new TLRPC$TL_account_updateBusinessAwayMessage();
            if (this.enabled) {
                TLRPC$TL_inputBusinessAwayMessage tLRPC$TL_inputBusinessAwayMessage = new TLRPC$TL_inputBusinessAwayMessage();
                tLRPC$TL_account_updateBusinessAwayMessage.message = tLRPC$TL_inputBusinessAwayMessage;
                tLRPC$TL_inputBusinessAwayMessage.offline_only = this.offline_only;
                tLRPC$TL_inputBusinessAwayMessage.shortcut_id = findReply.id;
                tLRPC$TL_inputBusinessAwayMessage.recipients = this.recipientsHelper.getInputValue();
                int i2 = this.schedule;
                if (i2 == 0) {
                    tLRPC$TL_account_updateBusinessAwayMessage.message.schedule = new TLRPC$TL_businessAwayMessageScheduleAlways();
                } else if (i2 == 1) {
                    tLRPC$TL_account_updateBusinessAwayMessage.message.schedule = new TLRPC$TL_businessAwayMessageScheduleOutsideWorkHours();
                } else if (i2 == 2) {
                    TLRPC$TL_businessAwayMessageScheduleCustom tLRPC$TL_businessAwayMessageScheduleCustom = new TLRPC$TL_businessAwayMessageScheduleCustom();
                    tLRPC$TL_businessAwayMessageScheduleCustom.start_date = this.scheduleCustomStart;
                    tLRPC$TL_businessAwayMessageScheduleCustom.end_date = this.scheduleCustomEnd;
                    tLRPC$TL_account_updateBusinessAwayMessage.message.schedule = tLRPC$TL_businessAwayMessageScheduleCustom;
                }
                tLRPC$TL_account_updateBusinessAwayMessage.flags |= 1;
                if (userFull != null) {
                    userFull.flags2 |= 8;
                    TLRPC$TL_businessAwayMessage tLRPC$TL_businessAwayMessage = new TLRPC$TL_businessAwayMessage();
                    userFull.business_away_message = tLRPC$TL_businessAwayMessage;
                    tLRPC$TL_businessAwayMessage.offline_only = this.offline_only;
                    tLRPC$TL_businessAwayMessage.shortcut_id = findReply.id;
                    tLRPC$TL_businessAwayMessage.recipients = this.recipientsHelper.getValue();
                    userFull.business_away_message.schedule = tLRPC$TL_account_updateBusinessAwayMessage.message.schedule;
                }
            } else if (userFull != null) {
                userFull.flags2 &= -9;
                userFull.business_away_message = null;
            }
            getConnectionsManager().sendRequest(tLRPC$TL_account_updateBusinessAwayMessage, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    AwayMessagesActivity.this.lambda$processDone$2(tLObject, tLRPC$TL_error);
                }
            });
            getMessagesStorage().updateUserInfo(userFull, false);
        }
    }

    public void lambda$processDone$2(final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                AwayMessagesActivity.this.lambda$processDone$1(tLRPC$TL_error, tLObject);
            }
        });
    }

    public void lambda$processDone$1(TLRPC$TL_error tLRPC$TL_error, TLObject tLObject) {
        if (tLRPC$TL_error != null) {
            this.doneButtonDrawable.animateToProgress(0.0f);
            BulletinFactory.showError(tLRPC$TL_error);
        } else if (tLObject instanceof TLRPC$TL_boolFalse) {
            this.doneButtonDrawable.animateToProgress(0.0f);
            BulletinFactory.of(this).createErrorBulletin(LocaleController.getString(R.string.UnknownError)).show();
        } else {
            lambda$onBackPressed$308();
        }
    }

    @Override
    public boolean onBackPressed() {
        if (hasChanges()) {
            if (!this.enabled) {
                processDone();
                return false;
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity());
            builder.setTitle(LocaleController.getString(R.string.UnsavedChanges));
            builder.setMessage(LocaleController.getString(R.string.BusinessAwayUnsavedChanges));
            builder.setPositiveButton(LocaleController.getString("ApplyTheme", R.string.ApplyTheme), new DialogInterface.OnClickListener() {
                @Override
                public final void onClick(DialogInterface dialogInterface, int i) {
                    AwayMessagesActivity.this.lambda$onBackPressed$3(dialogInterface, i);
                }
            });
            builder.setNegativeButton(LocaleController.getString("PassportDiscard", R.string.PassportDiscard), new DialogInterface.OnClickListener() {
                @Override
                public final void onClick(DialogInterface dialogInterface, int i) {
                    AwayMessagesActivity.this.lambda$onBackPressed$4(dialogInterface, i);
                }
            });
            showDialog(builder.create());
            return false;
        }
        return super.onBackPressed();
    }

    public void lambda$onBackPressed$3(DialogInterface dialogInterface, int i) {
        processDone();
    }

    public void lambda$onBackPressed$4(DialogInterface dialogInterface, int i) {
        lambda$onBackPressed$308();
    }

    public void fillItems(ArrayList<UItem> arrayList, UniversalAdapter universalAdapter) {
        arrayList.add(UItem.asTopView(LocaleController.getString(R.string.BusinessAwayInfo), "RestrictedEmoji", "💤"));
        arrayList.add(UItem.asCheck(1, LocaleController.getString(R.string.BusinessAwaySend)).setChecked(this.enabled));
        arrayList.add(UItem.asShadow(null));
        if (this.enabled) {
            QuickRepliesController.QuickReply findReply = QuickRepliesController.getInstance(this.currentAccount).findReply("away");
            if (findReply != null) {
                arrayList.add(UItem.asLargeQuickReply(findReply));
            } else {
                arrayList.add(UItem.asButton(2, R.drawable.msg2_chats_add, LocaleController.getString(R.string.BusinessAwayCreate)).accent());
            }
            arrayList.add(UItem.asShadow(null));
            int i = R.string.BusinessAwaySchedule;
            arrayList.add(UItem.asHeader(LocaleController.getString(i)));
            arrayList.add(UItem.asRadio(3, LocaleController.getString(R.string.BusinessAwayScheduleAlways)).setChecked(this.schedule == 0));
            if (this.hasHours) {
                arrayList.add(UItem.asRadio(4, LocaleController.getString(R.string.BusinessAwayScheduleOutsideHours)).setChecked(this.schedule == 1));
            }
            arrayList.add(UItem.asRadio(5, LocaleController.getString(R.string.BusinessAwayScheduleCustom)).setChecked(this.schedule == 2));
            if (this.schedule == 2) {
                arrayList.add(UItem.asShadow(null));
                arrayList.add(UItem.asHeader(LocaleController.getString(i)));
                arrayList.add(UItem.asButton(8, LocaleController.getString(R.string.BusinessAwayScheduleCustomStart), LocaleController.formatShortDateTime(this.scheduleCustomStart)));
                arrayList.add(UItem.asButton(9, LocaleController.getString(R.string.BusinessAwayScheduleCustomEnd), LocaleController.formatShortDateTime(this.scheduleCustomEnd)));
            }
            arrayList.add(UItem.asShadow(null));
            arrayList.add(UItem.asCheck(10, LocaleController.getString(R.string.BusinessAwayOnlyOffline)).setChecked(this.offline_only));
            arrayList.add(UItem.asShadow(LocaleController.getString(R.string.BusinessAwayOnlyOfflineInfo)));
            arrayList.add(UItem.asHeader(LocaleController.getString(R.string.BusinessRecipients)));
            arrayList.add(UItem.asRadio(6, LocaleController.getString(R.string.BusinessChatsAllPrivateExcept)).setChecked(this.exclude));
            arrayList.add(UItem.asRadio(7, LocaleController.getString(R.string.BusinessChatsOnlySelected)).setChecked(true ^ this.exclude));
            arrayList.add(UItem.asShadow(null));
            this.recipientsHelper.fillItems(arrayList);
            arrayList.add(UItem.asShadow(null));
        }
    }

    public void onClick(UItem uItem, final View view, int i, float f, float f2) {
        if (this.recipientsHelper.onClick(uItem)) {
            return;
        }
        int i2 = uItem.id;
        if (i2 == 2 || uItem.viewType == 17) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", getUserConfig().getClientUserId());
            bundle.putInt("chatMode", 5);
            bundle.putString("quick_reply", "away");
            presentFragment(new ChatActivity(bundle));
            return;
        }
        if (i2 == 1) {
            this.enabled = !this.enabled;
            this.listView.adapter.update(true);
            checkDone(true);
            return;
        }
        if (i2 == 6) {
            BusinessRecipientsHelper businessRecipientsHelper = this.recipientsHelper;
            this.exclude = true;
            businessRecipientsHelper.setExclude(true);
            this.listView.adapter.update(true);
            checkDone(true);
            return;
        }
        if (i2 == 7) {
            BusinessRecipientsHelper businessRecipientsHelper2 = this.recipientsHelper;
            this.exclude = false;
            businessRecipientsHelper2.setExclude(false);
            this.listView.adapter.update(true);
            checkDone(true);
            return;
        }
        if (i2 == 3) {
            this.schedule = 0;
            this.listView.adapter.update(true);
            checkDone(true);
            return;
        }
        if (i2 == 4) {
            this.schedule = 1;
            this.listView.adapter.update(true);
            checkDone(true);
            return;
        }
        if (i2 == 5) {
            this.schedule = 2;
            this.listView.adapter.update(true);
            checkDone(true);
        } else {
            if (i2 == 8) {
                AlertsCreator.createDatePickerDialog(getContext(), LocaleController.getString(R.string.BusinessAwayScheduleCustomStartTitle), LocaleController.getString(R.string.BusinessAwayScheduleCustomSetButton), this.scheduleCustomStart, new AlertsCreator.ScheduleDatePickerDelegate() {
                    @Override
                    public final void didSelectDate(boolean z, int i3) {
                        AwayMessagesActivity.this.lambda$onClick$5(view, z, i3);
                    }
                });
                return;
            }
            if (i2 == 9) {
                AlertsCreator.createDatePickerDialog(getContext(), LocaleController.getString(R.string.BusinessAwayScheduleCustomEndTitle), LocaleController.getString(R.string.BusinessAwayScheduleCustomSetButton), this.scheduleCustomEnd, new AlertsCreator.ScheduleDatePickerDelegate() {
                    @Override
                    public final void didSelectDate(boolean z, int i3) {
                        AwayMessagesActivity.this.lambda$onClick$6(view, z, i3);
                    }
                });
            } else if (i2 == 10) {
                boolean z = !this.offline_only;
                this.offline_only = z;
                ((TextCheckCell) view).setChecked(z);
                checkDone(true);
            }
        }
    }

    public void lambda$onClick$5(View view, boolean z, int i) {
        this.scheduleCustomStart = i;
        ((TextCell) view).setValue(LocaleController.formatShortDateTime(i), true);
        checkDone(true);
    }

    public void lambda$onClick$6(View view, boolean z, int i) {
        this.scheduleCustomEnd = i;
        ((TextCell) view).setValue(LocaleController.formatShortDateTime(i), true);
        checkDone(true);
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        UniversalAdapter universalAdapter;
        if (i == NotificationCenter.quickRepliesUpdated) {
            UniversalRecyclerView universalRecyclerView = this.listView;
            if (universalRecyclerView != null && (universalAdapter = universalRecyclerView.adapter) != null) {
                universalAdapter.update(true);
            }
            checkDone(true);
            return;
        }
        if (i == NotificationCenter.userInfoDidLoad) {
            setValue();
        }
    }

    @Override
    public boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.quickRepliesUpdated);
        getNotificationCenter().addObserver(this, NotificationCenter.userInfoDidLoad);
        QuickRepliesController.getInstance(this.currentAccount).load();
        setValue();
        return super.onFragmentCreate();
    }

    @Override
    public void onFragmentDestroy() {
        getNotificationCenter().removeObserver(this, NotificationCenter.quickRepliesUpdated);
        getNotificationCenter().removeObserver(this, NotificationCenter.userInfoDidLoad);
        super.onFragmentDestroy();
    }
}
