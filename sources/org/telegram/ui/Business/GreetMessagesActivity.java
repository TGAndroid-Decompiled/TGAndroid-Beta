package org.telegram.ui.Business;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
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
import org.telegram.ui.Cells.DialogCell$$ExternalSyntheticLambda6;
import org.telegram.ui.Components.CircularProgressDrawable;
import org.telegram.ui.Components.CrossfadeDrawable;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.UniversalRecyclerView;
import org.telegram.ui.Gifts.GiftSheet$$ExternalSyntheticLambda8;
import org.telegram.ui.iv.RichMediaUploader$$ExternalSyntheticLambda0;
import org.telegram.ui.web.HistoryFragment;

public final class GreetMessagesActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate {
    public TL_account.TL_businessGreetingMessage currentValue;
    public final int[] daysOfInactivity;
    public final String[] daysOfInactivityTexts;
    public ActionBarMenuItem doneButton;
    public CrossfadeDrawable doneButtonDrawable;
    public boolean enabled;
    public boolean exclude;
    public int inactivityDays;
    public UniversalRecyclerView listView;
    public BusinessRecipientsHelper recipientsHelper;
    public int shiftDp;
    public boolean valueSet;

    public GreetMessagesActivity() {
        super(null);
        this.daysOfInactivity = new int[]{7, 14, 21, 28};
        this.shiftDp = -4;
        this.inactivityDays = 7;
        this.daysOfInactivityTexts = new String[4];
        int i = 0;
        while (true) {
            int[] iArr = this.daysOfInactivity;
            if (i >= iArr.length) {
                return;
            }
            this.daysOfInactivityTexts[i] = LocaleController.formatPluralString("DaysSchedule", iArr[i], new Object[0]);
            i++;
        }
    }

    public final void checkDone$1$1(boolean z) {
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
        this.actionBar.setTitle(LocaleController.getString(R.string.BusinessGreet));
        this.actionBar.setActionBarMenuOnItemClick(new HistoryFragment.AnonymousClass1(this, 4));
        Drawable drawableMutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i = Theme.key_actionBarDefaultIcon;
        drawableMutate.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, i, false), PorterDuff.Mode.MULTIPLY));
        this.doneButtonDrawable = new CrossfadeDrawable(drawableMutate, new CircularProgressDrawable(Theme.getColor(null, i, false)));
        this.doneButton = this.actionBar.createMenu().addItemWithWidth(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), this.doneButtonDrawable);
        checkDone$1$1(false);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundGray, false));
        BusinessRecipientsHelper businessRecipientsHelper = new BusinessRecipientsHelper(this, new ChatbotSheet$$ExternalSyntheticLambda0(this, 2));
        this.recipientsHelper = businessRecipientsHelper;
        businessRecipientsHelper.doNotExcludeNewChats = true;
        TL_account.TL_businessGreetingMessage tL_businessGreetingMessage = this.currentValue;
        businessRecipientsHelper.setValue(tL_businessGreetingMessage == null ? null : tL_businessGreetingMessage.recipients);
        UniversalRecyclerView universalRecyclerView = new UniversalRecyclerView(this, new GiftSheet$$ExternalSyntheticLambda8(this, 6), new GreetMessagesActivity$$ExternalSyntheticLambda0(this, 2), null);
        this.listView = universalRecyclerView;
        universalRecyclerView.setSections();
        this.listView.adapter.setApplyBackground(false);
        frameLayout.addView(this.listView, LayoutHelper.createFrame(-1, -1.0f));
        this.actionBar.setAdaptiveBackground(this.listView, true);
        setValue$2();
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        UniversalAdapter universalAdapter;
        if (i != NotificationCenter.quickRepliesUpdated) {
            if (i == NotificationCenter.userInfoDidLoad) {
                setValue$2();
            }
        } else {
            UniversalRecyclerView universalRecyclerView = this.listView;
            if (universalRecyclerView != null && (universalAdapter = universalRecyclerView.adapter) != null) {
                universalAdapter.update(true);
            }
            checkDone$1$1(true);
        }
    }

    public final void fillItems$2(ArrayList arrayList, UniversalAdapter universalAdapter) {
        arrayList.add(UItem.asTopView(LocaleController.getString(R.string.BusinessGreet), LocaleController.getString(R.string.BusinessGreetInfo), "RestrictedEmoji", "👋"));
        arrayList.add(UItem.asCheck(1, LocaleController.getString(R.string.BusinessGreetSend)).setChecked(this.enabled));
        arrayList.add(UItem.asShadow(null));
        if (this.enabled) {
            QuickRepliesController.QuickReply quickReplyFindReply = QuickRepliesController.getInstance(this.currentAccount).findReply("hello");
            if (quickReplyFindReply != null) {
                arrayList.add(UItem.asLargeQuickReply(quickReplyFindReply));
            } else {
                arrayList.add(UItem.asButton(2, R.drawable.msg2_chats_add, LocaleController.getString(R.string.BusinessGreetCreate)).accent());
            }
            arrayList.add(UItem.asShadow(null));
            zzke.m(R.string.BusinessRecipients, arrayList);
            arrayList.add(UItem.asRadio(3, LocaleController.getString(R.string.BusinessChatsAllPrivateExcept2)).setChecked(this.exclude));
            arrayList.add(UItem.asRadio(4, LocaleController.getString(R.string.BusinessChatsOnlySelected2)).setChecked(!this.exclude));
            arrayList.add(UItem.asShadow(null));
            this.recipientsHelper.fillItems(arrayList, universalAdapter, true);
            zzkf.m(R.string.BusinessGreetRecipientsInfo, arrayList);
            zzke.m(R.string.BusinessGreetPeriod, arrayList);
            int i = 0;
            while (true) {
                int[] iArr = this.daysOfInactivity;
                if (i >= iArr.length) {
                    i = -1;
                    break;
                } else if (iArr[i] == this.inactivityDays) {
                    break;
                } else {
                    i++;
                }
            }
            arrayList.add(UItem.asSlideView(this.daysOfInactivityTexts, i, new DialogCell$$ExternalSyntheticLambda6(this, 6)));
            zzkf.m(R.string.BusinessGreetPeriodInfo, arrayList);
        }
    }

    public final boolean hasChanges() {
        BusinessRecipientsHelper businessRecipientsHelper;
        if (this.valueSet) {
            boolean z = this.enabled;
            TL_account.TL_businessGreetingMessage tL_businessGreetingMessage = this.currentValue;
            if (z != (tL_businessGreetingMessage != null) || (z && tL_businessGreetingMessage != null && (tL_businessGreetingMessage.no_activity_days != this.inactivityDays || tL_businessGreetingMessage.recipients.exclude_selected != this.exclude || ((businessRecipientsHelper = this.recipientsHelper) != null && businessRecipientsHelper.hasChanges())))) {
                return true;
            }
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
                processDone$2();
                return false;
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity(), 0, null);
            builder.setTitle(LocaleController.getString(R.string.UnsavedChanges));
            builder.setMessage(LocaleController.getString(R.string.BusinessGreetUnsavedChanges));
            builder.setPositiveButton(LocaleController.getString(R.string.ApplyTheme), new GreetMessagesActivity$$ExternalSyntheticLambda0(this, 0));
            builder.setNegativeButton(LocaleController.getString(R.string.PassportDiscard), new GreetMessagesActivity$$ExternalSyntheticLambda0(this, 1));
            showDialog(builder.create());
        }
        return false;
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.quickRepliesUpdated);
        getNotificationCenter().addObserver(this, NotificationCenter.userInfoDidLoad);
        QuickRepliesController.getInstance(this.currentAccount).load(true, null);
        setValue$2();
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

    public final void processDone$2() {
        if (this.doneButtonDrawable.getProgress() > 0.0f) {
            return;
        }
        if (!hasChanges()) {
            finishFragment();
            return;
        }
        QuickRepliesController.QuickReply quickReplyFindReply = QuickRepliesController.getInstance(this.currentAccount).findReply("hello");
        boolean z = this.enabled;
        if (z && quickReplyFindReply == null) {
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
            View viewFindViewByItemId = this.listView.findViewByItemId(2);
            int i = -this.shiftDp;
            this.shiftDp = i;
            AndroidUtilities.shakeViewSpring(viewFindViewByItemId, i);
            return;
        }
        if (!z || this.recipientsHelper.validate(this.listView)) {
            this.doneButtonDrawable.animateToProgress(1.0f);
            TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
            TL_account.updateBusinessGreetingMessage updatebusinessgreetingmessage = new TL_account.updateBusinessGreetingMessage();
            if (this.enabled) {
                TL_account.TL_inputBusinessGreetingMessage tL_inputBusinessGreetingMessage = new TL_account.TL_inputBusinessGreetingMessage();
                updatebusinessgreetingmessage.message = tL_inputBusinessGreetingMessage;
                tL_inputBusinessGreetingMessage.shortcut_id = quickReplyFindReply.id;
                tL_inputBusinessGreetingMessage.recipients = this.recipientsHelper.getInputValue();
                updatebusinessgreetingmessage.message.no_activity_days = this.inactivityDays;
                updatebusinessgreetingmessage.flags |= 1;
                if (userFull != null) {
                    userFull.flags2 |= 4;
                    TL_account.TL_businessGreetingMessage tL_businessGreetingMessage = new TL_account.TL_businessGreetingMessage();
                    userFull.business_greeting_message = tL_businessGreetingMessage;
                    tL_businessGreetingMessage.shortcut_id = quickReplyFindReply.id;
                    tL_businessGreetingMessage.recipients = this.recipientsHelper.getValue();
                    userFull.business_greeting_message.no_activity_days = this.inactivityDays;
                }
            } else if (userFull != null) {
                userFull.flags2 &= -5;
                userFull.business_greeting_message = null;
            }
            getConnectionsManager().sendRequest(updatebusinessgreetingmessage, new RichMediaUploader$$ExternalSyntheticLambda0(this, 8));
            getMessagesStorage().updateUserInfo(userFull, false);
        }
    }

    public final void setValue$2() {
        UniversalAdapter universalAdapter;
        if (this.valueSet) {
            return;
        }
        TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
        if (userFull == null) {
            getMessagesController().loadUserInfo(getUserConfig().getCurrentUser(), true, getClassGuid());
            return;
        }
        TL_account.TL_businessGreetingMessage tL_businessGreetingMessage = userFull.business_greeting_message;
        this.currentValue = tL_businessGreetingMessage;
        this.enabled = tL_businessGreetingMessage != null;
        this.inactivityDays = tL_businessGreetingMessage != null ? tL_businessGreetingMessage.no_activity_days : 7;
        this.exclude = tL_businessGreetingMessage != null ? tL_businessGreetingMessage.recipients.exclude_selected : true;
        BusinessRecipientsHelper businessRecipientsHelper = this.recipientsHelper;
        if (businessRecipientsHelper != null) {
            businessRecipientsHelper.setValue(tL_businessGreetingMessage == null ? null : tL_businessGreetingMessage.recipients);
        }
        UniversalRecyclerView universalRecyclerView = this.listView;
        if (universalRecyclerView != null && (universalAdapter = universalRecyclerView.adapter) != null) {
            universalAdapter.update(true);
        }
        checkDone$1$1(true);
        this.valueSet = true;
    }
}
