package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import com.google.android.gms.tasks.OnSuccessListener;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.BotHelpCell;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ReactedUsersListView;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.voip.VoIpSwitchLayout;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;

public final class WearAuthSheet$$ExternalSyntheticLambda5 implements RecyclerListView.OnItemLongClickListenerExtended, AvatarPreviewer.Callback, AlertDialog.OnButtonClickListener, DialogsActivity.DialogsActivityDelegate, AlertsCreator.ScheduleDatePickerDelegate, OnSuccessListener, ThemePreviewActivity.WallpaperActivityDelegate, ReactedUsersListView.OnHeightChangedListener, LanguageDetector.StringCallback, MessagesStorage.LongCallback, RecyclerListView.OnItemClickListenerExtended, MessagesController.NewMessageCallback, TwoStepVerificationActivity.TwoStepVerificationActivityDelegate, VoIpSwitchLayout.VoIpButtonView.OnBtnClickedListener {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;

    public WearAuthSheet$$ExternalSyntheticLambda5(Object obj, Object obj2, Object obj3, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
    }

    @Override
    public boolean canSelectStories() {
        switch (this.$r8$classId) {
            case 8:
                break;
        }
        return DialogsActivity.DialogsActivityDelegate.CC.$default$canSelectStories(this);
    }

    @Override
    public void didEnterPassword(TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP) {
        ((SelectChatUserSheet) this.f$0).lambda$initTransfer$4((TLRPC.User) this.f$1, (TwoStepVerificationActivity) this.f$2, inputCheckPasswordSRP);
    }

    @Override
    public void didSelectDate(boolean z, int i, int i2) {
        switch (this.$r8$classId) {
            case 9:
                ((PollCreateActivity.AnonymousClass2) this.f$0).lambda$onItemClick$1((TLRPC.TL_messageMediaPoll) this.f$1, (ArrayList) this.f$2, z, i, i2);
                break;
            case 14:
                ((ChatActivity) this.f$0).lambda$createView$40((TLRPC.BotInlineResult) this.f$1, (Long) this.f$2, z, i, i2);
                break;
            case 15:
                ((ChatActivity) this.f$0).lambda$processSelectedOption$355((TLRPC.SuggestedPost) this.f$1, (MessageObject) this.f$2, z, i, i2);
                break;
            default:
                ((ChatActivity) this.f$0).lambda$processSelectedOption$352((MessageObject.GroupedMessages) this.f$1, (MessageObject) this.f$2, z, i, i2);
                break;
        }
    }

    @Override
    public boolean didSelectDialogs(DialogsActivity dialogsActivity, ArrayList arrayList, CharSequence charSequence, boolean z, boolean z2, int i, int i2, TopicsFragment topicsFragment) {
        switch (this.$r8$classId) {
            case 8:
                return ((PhotoViewer.AnonymousClass16) this.f$0).lambda$onItemClick$14((ArrayList) this.f$1, (ChatActivity) this.f$2, dialogsActivity, arrayList, charSequence, z, z2, i, i2, topicsFragment);
            default:
                return ((ProfileActivity.AnonymousClass6) this.f$0).lambda$onItemClick$7((TLRPC.User) this.f$1, (DialogsActivity) this.f$2, dialogsActivity, arrayList, charSequence, z, z2, i, i2, topicsFragment);
        }
    }

    @Override
    public boolean didSelectStories(DialogsActivity dialogsActivity) {
        int i = this.$r8$classId;
        return DialogsActivity.DialogsActivityDelegate.CC.$default$didSelectStories(this, dialogsActivity);
    }

    @Override
    public void didSetNewBackground(TLRPC.WallPaper wallPaper) {
        ((ChannelWallpaperActivity.Adapter) this.f$0).lambda$onCreateViewHolder$0((String) this.f$1, (ChannelColorActivity.ThemeChooser) this.f$2, wallPaper);
    }

    @Override
    public boolean hasDoubleTap(View view, int i) {
        return RecyclerListView.OnItemClickListenerExtended.CC.$default$hasDoubleTap(this, view, i);
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        switch (this.$r8$classId) {
            case 5:
                ((ChatEditTypeActivity.UsernamesListView.AnonymousClass1) this.f$0).lambda$onItemClick$4((TLRPC.TL_username) this.f$1, (ChangeUsernameActivity.UsernameCell) this.f$2, alertDialog, i);
                break;
            case 6:
                ((FilterChatlistActivity.ListAdapter.AnonymousClass1) this.f$0).lambda$editname$6((EditTextBoldCursor) this.f$1, (AlertDialog.Builder) this.f$2, alertDialog, i);
                break;
            case 7:
                ((GroupCallActivity.AnonymousClass6) this.f$0).lambda$onItemClick$5((EditTextBoldCursor) this.f$1, (AlertDialog.Builder) this.f$2, alertDialog, i);
                break;
            case 11:
                ((SessionBottomSheet.AnonymousClass8) this.f$0).lambda$onClick$0((SessionBottomSheet.Callback) this.f$1, (TLRPC.TL_authorization) this.f$2, alertDialog, i);
                break;
            case 12:
                ((ThemeActivity.ListAdapter) this.f$0).lambda$onCreateViewHolder$3((ThemeActivity.ThemeAccentsListAdapter) this.f$1, (Theme.ThemeAccent) this.f$2, alertDialog, i);
                break;
            case 19:
                ((ChatLinkActivity) this.f$0).lambda$showLinkAlert$9((TLRPC.ChatFull) this.f$1, (TLRPC.Chat) this.f$2, alertDialog, i);
                break;
            case 21:
                ((ContactsActivity) this.f$0).lambda$didSelectResult$10((TLRPC.User) this.f$1, (String) this.f$2, alertDialog, i);
                break;
            case 22:
                ((ContactsActivity) this.f$0).lambda$didSelectResult$11((TLRPC.User) this.f$1, (EditTextBoldCursor) this.f$2, alertDialog, i);
                break;
            case 23:
                ((DataSettingsActivity) this.f$0).lambda$createView$4((String) this.f$1, (AlertDialog.Builder) this.f$2, alertDialog, i);
                break;
            default:
                ((NotificationsSettingsActivity) this.f$0).lambda$showExceptionsAlert$11((ArrayList) this.f$1, (ArrayList) this.f$2, alertDialog, i);
                break;
        }
    }

    @Override
    public void onClicked(VoIpSwitchLayout.VoIpButtonView voIpButtonView) {
        ((VoIPFragment) this.f$0).lambda$setFrontalCameraAction$39((VoIPService) this.f$1, (VoIpSwitchLayout) this.f$2, voIpButtonView);
    }

    @Override
    public void onDoubleTap(View view, int i, float f, float f2) {
        RecyclerListView.OnItemClickListenerExtended.CC.$default$onDoubleTap(this, view, i, f, f2);
    }

    @Override
    public void onHeightChanged(ReactedUsersListView reactedUsersListView, int i) {
        ChatActivity.lambda$createMenu$263((View) this.f$0, (ActionBarPopupWindow.ActionBarPopupWindowLayout) this.f$1, (int[]) this.f$2, reactedUsersListView, i);
    }

    @Override
    public void onItemClick(View view, int i, float f, float f2) {
        ((GroupCallActivity) this.f$0).lambda$new$24((Activity) this.f$1, (ChatObject.Call) this.f$2, view, i, f, f2);
    }

    @Override
    public void onLongClickRelease() {
        RecyclerListView.OnItemLongClickListenerExtended.CC.$default$onLongClickRelease(this);
    }

    @Override
    public void onMenuClick(AvatarPreviewer.MenuItem menuItem) {
        switch (this.$r8$classId) {
            case 2:
                ((ChannelAdminLogActivity.ChatActivityAdapter.AnonymousClass1) this.f$0).lambda$didLongPressUserAvatar$0((ChatMessageCell) this.f$1, (TLRPC.User) this.f$2, menuItem);
                break;
            case 3:
                ((ChatActivity.ChatMessageCellDelegate) this.f$0).lambda$didLongPressUserAvatar$8((ChatMessageCell) this.f$1, (TLRPC.User) this.f$2, menuItem);
                break;
            default:
                ((ChatActivity.ChatMessageCellDelegate) this.f$0).lambda$didLongPressChannelAvatar$15((TLRPC.Chat) this.f$1, (ChatMessageCell) this.f$2, menuItem);
                break;
        }
    }

    @Override
    public boolean onMessageReceived(TLRPC.Message message) {
        return ((PaymentFormActivity) this.f$0).lambda$sendData$66((INavigationLayout) this.f$1, (Activity) this.f$2, message);
    }

    @Override
    public void onMove(float f, float f2) {
        RecyclerListView.OnItemLongClickListenerExtended.CC.$default$onMove(this, f, f2);
    }

    @Override
    public void onSuccess(Object obj) {
        WearAuthSheet.lambda$show$3((WearAuthSheet.AuthSession) this.f$0, (ButtonWithCounterView) this.f$1, (int[]) this.f$2, (Integer) obj);
    }

    @Override
    public void run(long j) {
        ((ChatRightsEditActivity) this.f$0).lambda$initTransfer$13((TLRPC.InputCheckPasswordSRP) this.f$1, (TwoStepVerificationActivity) this.f$2, j);
    }

    @Override
    public boolean mo2353onItemClick(View view, int i, float f, float f2) {
        return ((CachedMediaLayout.AnonymousClass1) this.f$0).lambda$createView$5((RecyclerListView) this.f$1, (BaseFragment) this.f$2, view, i, f, f2);
    }

    @Override
    public void run(String str) {
        ((ChatActivity) this.f$0).lambda$updateBotHelpCellClick$404((BotHelpCell) this.f$1, (CharSequence) this.f$2, str);
    }
}
