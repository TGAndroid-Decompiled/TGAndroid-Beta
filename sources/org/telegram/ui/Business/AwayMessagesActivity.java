package org.telegram.ui.Business;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.app.ActivityCompat$$ExternalSyntheticLambda0;
import com.google.android.gms.internal.mlkit_vision_common.zzke;
import com.google.android.gms.internal.mlkit_vision_common.zzkf;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.CircularProgressDrawable;
import org.telegram.ui.Components.CrossfadeDrawable;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.UniversalRecyclerView;
import org.telegram.ui.Gifts.GiftSheet$$ExternalSyntheticLambda8;
import org.telegram.ui.iv.RichMediaUploader$$ExternalSyntheticLambda0;
import org.telegram.ui.web.HistoryFragment;

public final class AwayMessagesActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate {
    public int currentScheduleCustomEnd;
    public int currentScheduleCustomStart;
    public TL_account.TL_businessAwayMessage currentValue;
    public int currentValueScheduleType;
    public ActionBarMenuItem doneButton;
    public CrossfadeDrawable doneButtonDrawable;
    public boolean enabled;
    public boolean exclude;
    public boolean hasHours;
    public UniversalRecyclerView listView;
    public boolean offline_only;
    public BusinessRecipientsHelper recipientsHelper;
    public int schedule;
    public int scheduleCustomEnd;
    public int scheduleCustomStart;
    public int shiftDp;
    public boolean valueSet;

    public final void checkDone(boolean z) {
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

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.BusinessAway));
        this.actionBar.setActionBarMenuOnItemClick(new HistoryFragment.AnonymousClass1(this, 1));
        Drawable drawableMutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i = Theme.key_actionBarDefaultIcon;
        drawableMutate.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, i, false), PorterDuff.Mode.MULTIPLY));
        this.doneButtonDrawable = new CrossfadeDrawable(drawableMutate, new CircularProgressDrawable(Theme.getColor(null, i, false)));
        this.doneButton = this.actionBar.createMenu().addItemWithWidth(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), this.doneButtonDrawable);
        checkDone(false);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundGray, false));
        BusinessRecipientsHelper businessRecipientsHelper = new BusinessRecipientsHelper(this, new ActivityCompat$$ExternalSyntheticLambda0(this, 28));
        this.recipientsHelper = businessRecipientsHelper;
        businessRecipientsHelper.exclude = this.exclude;
        TL_account.TL_businessAwayMessage tL_businessAwayMessage = this.currentValue;
        businessRecipientsHelper.setValue(tL_businessAwayMessage == null ? null : tL_businessAwayMessage.recipients);
        UniversalRecyclerView universalRecyclerView = new UniversalRecyclerView(this, new GiftSheet$$ExternalSyntheticLambda8(this, 2), new AwayMessagesActivity$$ExternalSyntheticLambda2(this, 0), null);
        this.listView = universalRecyclerView;
        universalRecyclerView.setSections();
        this.listView.adapter.setApplyBackground(false);
        frameLayout.addView(this.listView, LayoutHelper.createFrame(-1, -1.0f));
        this.actionBar.setAdaptiveBackground(this.listView, true);
        setValue();
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        UniversalAdapter universalAdapter;
        if (i != NotificationCenter.quickRepliesUpdated) {
            if (i == NotificationCenter.userInfoDidLoad) {
                setValue();
            }
        } else {
            UniversalRecyclerView universalRecyclerView = this.listView;
            if (universalRecyclerView != null && (universalAdapter = universalRecyclerView.adapter) != null) {
                universalAdapter.update(true);
            }
            checkDone(true);
        }
    }

    public final void fillItems$1(ArrayList arrayList, UniversalAdapter universalAdapter) {
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
            zzke.m(i, arrayList);
            arrayList.add(UItem.asRadio(3, LocaleController.getString(R.string.BusinessAwayScheduleAlways)).setChecked(this.schedule == 0));
            if (this.hasHours) {
                arrayList.add(UItem.asRadio(4, LocaleController.getString(R.string.BusinessAwayScheduleOutsideHours)).setChecked(this.schedule == 1));
            }
            arrayList.add(UItem.asRadio(5, LocaleController.getString(R.string.BusinessAwayScheduleCustom)).setChecked(this.schedule == 2));
            if (this.schedule == 2) {
                arrayList.add(UItem.asShadow(null));
                zzke.m(i, arrayList);
                arrayList.add(UItem.asButton(8, LocaleController.getString(R.string.BusinessAwayScheduleCustomStart), LocaleController.formatShortDateTime(this.scheduleCustomStart)));
                arrayList.add(UItem.asButton(9, LocaleController.getString(R.string.BusinessAwayScheduleCustomEnd), LocaleController.formatShortDateTime(this.scheduleCustomEnd)));
            }
            arrayList.add(UItem.asShadow(null));
            arrayList.add(UItem.asCheck(10, LocaleController.getString(R.string.BusinessAwayOnlyOffline)).setChecked(this.offline_only));
            zzkf.m(R.string.BusinessAwayOnlyOfflineInfo, arrayList);
            zzke.m(R.string.BusinessRecipients, arrayList);
            arrayList.add(UItem.asRadio(6, LocaleController.getString(R.string.BusinessChatsAllPrivateExcept2)).setChecked(this.exclude));
            arrayList.add(UItem.asRadio(7, LocaleController.getString(R.string.BusinessChatsOnlySelected2)).setChecked(!this.exclude));
            arrayList.add(UItem.asShadow(null));
            this.recipientsHelper.fillItems(arrayList, universalAdapter, true);
            arrayList.add(UItem.asShadow(null));
        }
    }

    public final boolean hasChanges() {
        BusinessRecipientsHelper businessRecipientsHelper;
        if (this.valueSet) {
            boolean z = this.enabled;
            TL_account.TL_businessAwayMessage tL_businessAwayMessage = this.currentValue;
            if (z == (tL_businessAwayMessage != null)) {
                if (z && tL_businessAwayMessage != null) {
                    if (tL_businessAwayMessage.recipients.exclude_selected == this.exclude && ((businessRecipientsHelper = this.recipientsHelper) == null || !businessRecipientsHelper.hasChanges())) {
                        int i = this.currentValueScheduleType;
                        int i2 = this.schedule;
                        if (i == i2 && this.currentValue.offline_only == this.offline_only && (i2 != 2 || (this.currentScheduleCustomStart == this.scheduleCustomStart && this.currentScheduleCustomEnd == this.scheduleCustomEnd))) {
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onBackPressed(boolean z) {
        if (!hasChanges()) {
            return super.onBackPressed(z);
        }
        if (z) {
            if (!this.enabled) {
                processDone();
                return false;
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity(), 0, null);
            builder.setTitle(LocaleController.getString(R.string.UnsavedChanges));
            builder.setMessage(LocaleController.getString(R.string.BusinessAwayUnsavedChanges));
            builder.setPositiveButton(LocaleController.getString(R.string.ApplyTheme), new AwayMessagesActivity$$ExternalSyntheticLambda2(this, 1));
            builder.setNegativeButton(LocaleController.getString(R.string.PassportDiscard), new AwayMessagesActivity$$ExternalSyntheticLambda2(this, 2));
            showDialog(builder.create());
        }
        return false;
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.quickRepliesUpdated);
        getNotificationCenter().addObserver(this, NotificationCenter.userInfoDidLoad);
        QuickRepliesController.getInstance(this.currentAccount).load(true, null);
        setValue();
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().removeObserver(this, NotificationCenter.quickRepliesUpdated);
        getNotificationCenter().removeObserver(this, NotificationCenter.userInfoDidLoad);
        super.onFragmentDestroy();
    }

    @Override
    public final void onInsets(int i, int i2, int i3, int i4) {
        this.listView.setPadding(0, 0, 0, i4);
        this.listView.setClipToPadding(false);
    }

    public final void processDone() {
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
            getConnectionsManager().sendRequest(updatebusinessawaymessage, new RichMediaUploader$$ExternalSyntheticLambda0(this, 5));
            getMessagesStorage().updateUserInfo(userFull, false);
        }
    }

    public final void setValue() {
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
                if ((tL_businessAwayMessage == null && (tL_businessAwayMessage.schedule instanceof TL_account.TL_businessAwayMessageScheduleAlways)) || tL_businessAwayMessage == null || !(tL_businessAwayMessage.schedule instanceof TL_account.TL_businessAwayMessageScheduleOutsideWorkHours)) {
                    this.currentValueScheduleType = 0;
                    this.schedule = 0;
                } else {
                    this.currentValueScheduleType = 1;
                    this.schedule = 1;
                }
            }
        } else {
            this.scheduleCustomStart = getConnectionsManager().getCurrentTime();
            this.scheduleCustomEnd = getConnectionsManager().getCurrentTime() + 86400;
            tL_businessAwayMessage = this.currentValue;
            if (tL_businessAwayMessage == null) {
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
}
