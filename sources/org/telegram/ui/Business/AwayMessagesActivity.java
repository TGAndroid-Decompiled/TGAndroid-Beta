package org.telegram.ui.Business;

import android.content.Context;
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
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
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
    public TL_account.TL_businessAwayMessage currentValue;
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
    public boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.BusinessAway));
        this.actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() {
            @Override
            public void onItemClick(int i) {
                if (i == -1) {
                    if (AwayMessagesActivity.this.onBackPressed(true)) {
                        AwayMessagesActivity.this.finishFragment();
                    }
                } else if (i == 1) {
                    AwayMessagesActivity.this.processDone();
                }
            }
        });
        Drawable drawableMutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i = Theme.key_actionBarDefaultIcon;
        drawableMutate.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i), PorterDuff.Mode.MULTIPLY));
        this.doneButtonDrawable = new CrossfadeDrawable(drawableMutate, new CircularProgressDrawable(Theme.getColor(i)));
        this.doneButton = this.actionBar.createMenu().addItemWithWidth(1, this.doneButtonDrawable, AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done));
        checkDone(false);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundGray));
        BusinessRecipientsHelper businessRecipientsHelper = new BusinessRecipientsHelper(this, new Runnable() {
            @Override
            public final void run() {
                AwayMessagesActivity.$r8$lambda$2nBbeAk8ZIV33hdtkoWa3JCeK8s(this.f$0);
            }
        });
        this.recipientsHelper = businessRecipientsHelper;
        businessRecipientsHelper.setExclude(this.exclude);
        BusinessRecipientsHelper businessRecipientsHelper2 = this.recipientsHelper;
        if (businessRecipientsHelper2 != null) {
            TL_account.TL_businessAwayMessage tL_businessAwayMessage = this.currentValue;
            businessRecipientsHelper2.setValue(tL_businessAwayMessage == null ? null : tL_businessAwayMessage.recipients);
        }
        UniversalRecyclerView universalRecyclerView = new UniversalRecyclerView(this, new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                this.f$0.fillItems((ArrayList) obj, (UniversalAdapter) obj2);
            }
        }, new Utilities.Callback5() {
            @Override
            public final void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                this.f$0.onClick((UItem) obj, (View) obj2, ((Integer) obj3).intValue(), ((Float) obj4).floatValue(), ((Float) obj5).floatValue());
            }
        }, null);
        this.listView = universalRecyclerView;
        universalRecyclerView.setSections();
        this.listView.adapter.setApplyBackground(false);
        frameLayout.addView(this.listView, LayoutHelper.createFrame(-1, -1.0f));
        this.actionBar.setAdaptiveBackground(this.listView, true);
        setValue();
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    public static void $r8$lambda$2nBbeAk8ZIV33hdtkoWa3JCeK8s(AwayMessagesActivity awayMessagesActivity) {
        awayMessagesActivity.listView.adapter.update(true);
        awayMessagesActivity.checkDone(true);
    }

    private void setValue() {
        TL_account.TL_businessAwayMessage tL_businessAwayMessage;
        UniversalAdapter universalAdapter;
        if (this.valueSet) {
            return;
        }
        TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
        if (userFull == null) {
            getMessagesController().loadUserInfo(getUserConfig().getCurrentUser(), true, getClassGuid());
            return;
        }
        TL_account.TL_businessAwayMessage tL_businessAwayMessage2 = userFull.business_away_message;
        this.currentValue = tL_businessAwayMessage2;
        this.hasHours = userFull.business_work_hours != null;
        this.enabled = tL_businessAwayMessage2 != null;
        this.exclude = tL_businessAwayMessage2 != null ? tL_businessAwayMessage2.recipients.exclude_selected : true;
        this.offline_only = tL_businessAwayMessage2 != null ? tL_businessAwayMessage2.offline_only : true;
        BusinessRecipientsHelper businessRecipientsHelper = this.recipientsHelper;
        if (businessRecipientsHelper != null) {
            businessRecipientsHelper.setValue(tL_businessAwayMessage2 == null ? null : tL_businessAwayMessage2.recipients);
        }
        TL_account.TL_businessAwayMessage tL_businessAwayMessage3 = this.currentValue;
        if (tL_businessAwayMessage3 != null) {
            TL_account.BusinessAwayMessageSchedule businessAwayMessageSchedule = tL_businessAwayMessage3.schedule;
            if (businessAwayMessageSchedule instanceof TL_account.TL_businessAwayMessageScheduleCustom) {
                this.currentValueScheduleType = 2;
                this.schedule = 2;
                TL_account.TL_businessAwayMessageScheduleCustom tL_businessAwayMessageScheduleCustom = (TL_account.TL_businessAwayMessageScheduleCustom) businessAwayMessageSchedule;
                int i = tL_businessAwayMessageScheduleCustom.start_date;
                this.currentScheduleCustomStart = i;
                this.scheduleCustomStart = i;
                int i2 = tL_businessAwayMessageScheduleCustom.end_date;
                this.currentScheduleCustomEnd = i2;
                this.scheduleCustomEnd = i2;
            } else {
                this.scheduleCustomStart = getConnectionsManager().getCurrentTime();
                this.scheduleCustomEnd = getConnectionsManager().getCurrentTime() + 86400;
                tL_businessAwayMessage = this.currentValue;
                if ((tL_businessAwayMessage != null || !(tL_businessAwayMessage.schedule instanceof TL_account.TL_businessAwayMessageScheduleAlways)) && tL_businessAwayMessage != null && (tL_businessAwayMessage.schedule instanceof TL_account.TL_businessAwayMessageScheduleOutsideWorkHours)) {
                    this.currentValueScheduleType = 1;
                    this.schedule = 1;
                } else {
                    this.currentValueScheduleType = 0;
                    this.schedule = 0;
                }
            }
        } else {
            this.scheduleCustomStart = getConnectionsManager().getCurrentTime();
            this.scheduleCustomEnd = getConnectionsManager().getCurrentTime() + 86400;
            tL_businessAwayMessage = this.currentValue;
            if (tL_businessAwayMessage != null) {
                this.currentValueScheduleType = 1;
                this.schedule = 1;
            } else {
                this.currentValueScheduleType = 1;
                this.schedule = 1;
            }
        }
        UniversalRecyclerView universalRecyclerView = this.listView;
        if (universalRecyclerView != null && (universalAdapter = universalRecyclerView.adapter) != null) {
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
        TL_account.TL_businessAwayMessage tL_businessAwayMessage = this.currentValue;
        if (z != (tL_businessAwayMessage != null)) {
            return true;
        }
        if (z && tL_businessAwayMessage != null) {
            if (tL_businessAwayMessage.recipients.exclude_selected != this.exclude) {
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
        boolean zHasChanges = hasChanges();
        this.doneButton.setEnabled(zHasChanges);
        if (z) {
            this.doneButton.animate().alpha(zHasChanges ? 1.0f : 0.0f).scaleX(zHasChanges ? 1.0f : 0.0f).scaleY(zHasChanges ? 1.0f : 0.0f).setDuration(180L).start();
            return;
        }
        this.doneButton.setAlpha(zHasChanges ? 1.0f : 0.0f);
        this.doneButton.setScaleX(zHasChanges ? 1.0f : 0.0f);
        this.doneButton.setScaleY(zHasChanges ? 1.0f : 0.0f);
    }

    public void processDone() {
        if (this.doneButtonDrawable.getProgress() > 0.0f) {
            return;
        }
        if (!hasChanges()) {
            finishFragment();
            return;
        }
        QuickRepliesController.QuickReply quickReplyFindReply = QuickRepliesController.getInstance(this.currentAccount).findReply("away");
        boolean z = this.enabled;
        if (z && quickReplyFindReply == null) {
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
            View viewFindViewByItemId = this.listView.findViewByItemId(2);
            int i = -this.shiftDp;
            this.shiftDp = i;
            AndroidUtilities.shakeViewSpring(viewFindViewByItemId, i);
            UniversalRecyclerView universalRecyclerView = this.listView;
            universalRecyclerView.smoothScrollToPosition(universalRecyclerView.findPositionByItemId(2));
            return;
        }
        if (!z || this.recipientsHelper.validate(this.listView)) {
            this.doneButtonDrawable.animateToProgress(1.0f);
            TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
            TL_account.updateBusinessAwayMessage updatebusinessawaymessage = new TL_account.updateBusinessAwayMessage();
            if (this.enabled) {
                TL_account.TL_inputBusinessAwayMessage tL_inputBusinessAwayMessage = new TL_account.TL_inputBusinessAwayMessage();
                updatebusinessawaymessage.message = tL_inputBusinessAwayMessage;
                tL_inputBusinessAwayMessage.offline_only = this.offline_only;
                tL_inputBusinessAwayMessage.shortcut_id = quickReplyFindReply.id;
                tL_inputBusinessAwayMessage.recipients = this.recipientsHelper.getInputValue();
                int i2 = this.schedule;
                if (i2 == 0) {
                    updatebusinessawaymessage.message.schedule = new TL_account.TL_businessAwayMessageScheduleAlways();
                } else if (i2 == 1) {
                    updatebusinessawaymessage.message.schedule = new TL_account.TL_businessAwayMessageScheduleOutsideWorkHours();
                } else if (i2 == 2) {
                    TL_account.TL_businessAwayMessageScheduleCustom tL_businessAwayMessageScheduleCustom = new TL_account.TL_businessAwayMessageScheduleCustom();
                    tL_businessAwayMessageScheduleCustom.start_date = this.scheduleCustomStart;
                    tL_businessAwayMessageScheduleCustom.end_date = this.scheduleCustomEnd;
                    updatebusinessawaymessage.message.schedule = tL_businessAwayMessageScheduleCustom;
                }
                updatebusinessawaymessage.flags |= 1;
                if (userFull != null) {
                    userFull.flags2 |= 8;
                    TL_account.TL_businessAwayMessage tL_businessAwayMessage = new TL_account.TL_businessAwayMessage();
                    userFull.business_away_message = tL_businessAwayMessage;
                    tL_businessAwayMessage.offline_only = this.offline_only;
                    tL_businessAwayMessage.shortcut_id = quickReplyFindReply.id;
                    tL_businessAwayMessage.recipients = this.recipientsHelper.getValue();
                    userFull.business_away_message.schedule = updatebusinessawaymessage.message.schedule;
                }
            } else if (userFull != null) {
                userFull.flags2 &= -9;
                userFull.business_away_message = null;
            }
            getConnectionsManager().sendRequest(updatebusinessawaymessage, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    AwayMessagesActivity.m1364$r8$lambda$mnzAcQ_74ZIrQbyOE6PGfDzTw8(this.f$0, tLObject, tL_error);
                }
            });
            getMessagesStorage().updateUserInfo(userFull, false);
        }
    }

    public static void m1364$r8$lambda$mnzAcQ_74ZIrQbyOE6PGfDzTw8(final AwayMessagesActivity awayMessagesActivity, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        awayMessagesActivity.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                AwayMessagesActivity.$r8$lambda$ISqU1esEyKooW4UWlUSRJc9jdtY(this.f$0, tL_error, tLObject);
            }
        });
    }

    public static void $r8$lambda$ISqU1esEyKooW4UWlUSRJc9jdtY(AwayMessagesActivity awayMessagesActivity, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error != null) {
            awayMessagesActivity.doneButtonDrawable.animateToProgress(0.0f);
            BulletinFactory.showError(tL_error);
            return;
        }
        awayMessagesActivity.getClass();
        if (!(tLObject instanceof TLRPC.TL_boolFalse)) {
            awayMessagesActivity.finishFragment();
        } else {
            awayMessagesActivity.doneButtonDrawable.animateToProgress(0.0f);
            BulletinFactory.of(awayMessagesActivity).createErrorBulletin(LocaleController.getString(R.string.UnknownError)).show();
        }
    }

    @Override
    public boolean onBackPressed(boolean z) {
        if (!hasChanges()) {
            return super.onBackPressed(z);
        }
        if (z) {
            if (!this.enabled) {
                processDone();
                return false;
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity());
            builder.setTitle(LocaleController.getString(R.string.UnsavedChanges));
            builder.setMessage(LocaleController.getString(R.string.BusinessAwayUnsavedChanges));
            builder.setPositiveButton(LocaleController.getString(R.string.ApplyTheme), new AlertDialog.OnButtonClickListener() {
                @Override
                public final void onClick(AlertDialog alertDialog, int i) {
                    this.f$0.processDone();
                }
            });
            builder.setNegativeButton(LocaleController.getString(R.string.PassportDiscard), new AlertDialog.OnButtonClickListener() {
                @Override
                public final void onClick(AlertDialog alertDialog, int i) {
                    this.f$0.finishFragment();
                }
            });
            showDialog(builder.create());
        }
        return false;
    }

    public void fillItems(ArrayList arrayList, UniversalAdapter universalAdapter) {
        arrayList.add(UItem.asTopView(LocaleController.getString(R.string.BusinessAway), LocaleController.getString(R.string.BusinessAwayInfo), "RestrictedEmoji", "💤"));
        arrayList.add(UItem.asCheck(1, LocaleController.getString(R.string.BusinessAwaySend)).setChecked(this.enabled));
        arrayList.add(UItem.asShadow(null));
        if (this.enabled) {
            QuickRepliesController.QuickReply quickReplyFindReply = QuickRepliesController.getInstance(this.currentAccount).findReply("away");
            if (quickReplyFindReply != null) {
                arrayList.add(UItem.asLargeQuickReply(quickReplyFindReply));
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
            arrayList.add(UItem.asRadio(6, LocaleController.getString(R.string.BusinessChatsAllPrivateExcept2)).setChecked(this.exclude));
            arrayList.add(UItem.asRadio(7, LocaleController.getString(R.string.BusinessChatsOnlySelected2)).setChecked(true ^ this.exclude));
            arrayList.add(UItem.asShadow(null));
            this.recipientsHelper.fillItems(arrayList, universalAdapter);
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
                    public final void didSelectDate(boolean z, int i3, int i4) {
                        AwayMessagesActivity.$r8$lambda$y3Zu7oWUdYHAwFXwhYbXBttxMa0(this.f$0, view, z, i3, i4);
                    }
                });
                return;
            }
            if (i2 == 9) {
                AlertsCreator.createDatePickerDialog(getContext(), LocaleController.getString(R.string.BusinessAwayScheduleCustomEndTitle), LocaleController.getString(R.string.BusinessAwayScheduleCustomSetButton), this.scheduleCustomEnd, new AlertsCreator.ScheduleDatePickerDelegate() {
                    @Override
                    public final void didSelectDate(boolean z, int i3, int i4) {
                        AwayMessagesActivity.$r8$lambda$YXeL3LYBpsifCvxuNMxh8hBYXqU(this.f$0, view, z, i3, i4);
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

    public static void $r8$lambda$y3Zu7oWUdYHAwFXwhYbXBttxMa0(AwayMessagesActivity awayMessagesActivity, View view, boolean z, int i, int i2) {
        awayMessagesActivity.getClass();
        awayMessagesActivity.scheduleCustomStart = i;
        ((TextCell) view).setValue(LocaleController.formatShortDateTime(i), true);
        awayMessagesActivity.checkDone(true);
    }

    public static void $r8$lambda$YXeL3LYBpsifCvxuNMxh8hBYXqU(AwayMessagesActivity awayMessagesActivity, View view, boolean z, int i, int i2) {
        awayMessagesActivity.getClass();
        awayMessagesActivity.scheduleCustomEnd = i;
        ((TextCell) view).setValue(LocaleController.formatShortDateTime(i), true);
        awayMessagesActivity.checkDone(true);
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

    @Override
    public void onInsets(int i, int i2, int i3, int i4) {
        this.listView.setPadding(0, 0, 0, i4);
        this.listView.setClipToPadding(false);
    }
}
