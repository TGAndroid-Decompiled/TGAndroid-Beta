package org.telegram.ui;

import android.content.Context;
import java.util.Calendar;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.Theme;

public final class IntroActivity$$ExternalSyntheticLambda6 implements RequestDelegate {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;

    public IntroActivity$$ExternalSyntheticLambda6(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                ((IntroActivity) this.f$0).lambda$checkContinueText$4((String) this.f$1, tLObject, tL_error);
                break;
            case 1:
                ((ChatActivity.ChatActivityAdapter.AnonymousClass2.C00122) this.f$0).lambda$sendButtonPressed$3((MessageObject) this.f$1, tLObject, tL_error);
                break;
            case 2:
                ((ChatActivity.ChatMessageCellDelegate) this.f$0).lambda$didLongPressToDoButton$33((TLRPC.TodoItem) this.f$1, tLObject, tL_error);
                break;
            case 3:
                ((FilterChatlistActivity.ListAdapter.AnonymousClass1) this.f$0).lambda$deleteLink$3((AlertDialog) this.f$1, tLObject, tL_error);
                break;
            case 4:
                ((FilterCreateActivity.LinkCell) this.f$0).lambda$deleteLink$6((FilterCreateActivity$LinkCell$$ExternalSyntheticLambda0) this.f$1, tLObject, tL_error);
                break;
            case 5:
                ((GroupCallActivity.AvatarUpdaterDelegate) this.f$0).lambda$didUploadPhoto$1((String) this.f$1, tLObject, tL_error);
                break;
            case 6:
                ((GroupStickersActivity.AddEmojiCell.AnonymousClass1) this.f$0).lambda$afterTextChanged$1((String) this.f$1, tLObject, tL_error);
                break;
            case 7:
                ((PassportActivity.AnonymousClass20.AnonymousClass1) this.f$0).lambda$run$4((TLRPC.TL_secureValue) this.f$1, tLObject, tL_error);
                break;
            case 8:
                ((ProfileActivity.ListAdapter.AnonymousClass12) this.f$0).lambda$onClick$1((TLRPC.TL_username) this.f$1, tLObject, tL_error);
                break;
            case 9:
                ((ProfileActivity2.AnonymousClass5) this.f$0).lambda$onClick$1((TLRPC.TL_username) this.f$1, tLObject, tL_error);
                break;
            case 10:
                ((SessionsActivity.AnonymousClass4) this.f$0).lambda$hide$1((TLRPC.TL_authorization) this.f$1, tLObject, tL_error);
                break;
            case 11:
                ((SessionsActivity.AnonymousClass5) this.f$0).lambda$onSessionTerminated$1((TLRPC.TL_authorization) this.f$1, tLObject, tL_error);
                break;
            case 12:
                ((SessionsActivity.AnonymousClass6) this.f$0).lambda$processQr$2((Runnable) this.f$1, tLObject, tL_error);
                break;
            case 13:
                ((TopicsFragment.MessagesSearchContainer) this.f$0).lambda$loadMessages$3((String) this.f$1, tLObject, tL_error);
                break;
            case 14:
                ((WallpapersListActivity.AnonymousClass2) this.f$0).lambda$onItemClick$1((int[]) this.f$1, tLObject, tL_error);
                break;
            case 15:
                ((CalendarActivity) this.f$0).lambda$loadNext$3((Calendar) this.f$1, tLObject, tL_error);
                break;
            case 16:
                ((ChannelColorActivity.ThemeChooser) this.f$0).lambda$parseTheme$4((Theme.ThemeInfo) this.f$1, tLObject, tL_error);
                break;
            case 17:
                ((ChannelMonetizationLayout) this.f$0).lambda$new$14((Context) this.f$1, tLObject, tL_error);
                break;
            case 18:
                ((ChatActivity) this.f$0).lambda$processSelectedOption$349((TLRPC.TL_messages_sendScheduledMessages) this.f$1, tLObject, tL_error);
                break;
            case 19:
                ((ChatActivity) this.f$0).lambda$loadLastUnreadMention$474((MessagesStorage) this.f$1, tLObject, tL_error);
                break;
            case 20:
                ((ChatActivity) this.f$0).lambda$openAttachBotLayout$217((TLRPC.User) this.f$1, tLObject, tL_error);
                break;
            case 21:
                ((ChatActivity) this.f$0).lambda$createView$24((TLRPC.messages_Messages) this.f$1, tLObject, tL_error);
                break;
            case 22:
                ((ChatEditActivity) this.f$0).lambda$processDone$65((TL_bots.setBotInfo) this.f$1, tLObject, tL_error);
                break;
            case 23:
                ((ChatLinkActivity) this.f$0).lambda$createView$2((AlertDialog[]) this.f$1, tLObject, tL_error);
                break;
            case 24:
                ((ChatRightsEditActivity) this.f$0).lambda$initTransfer$18((TwoStepVerificationActivity) this.f$1, tLObject, tL_error);
                break;
            case 25:
                ((EmojiAnimationsOverlay) this.f$0).lambda$createDrawingObject$1((MessageObject) this.f$1, tLObject, tL_error);
                break;
            case 26:
                ((FilterCreateActivity) this.f$0).lambda$deleteFolder$16((AlertDialog) this.f$1, tLObject, tL_error);
                break;
            case 27:
                ((FiltersSetupActivity) this.f$0).lambda$createView$3((TLRPC.TL_messages_toggleDialogFilterTags) this.f$1, tLObject, tL_error);
                break;
            case 28:
                ((LaunchActivity) this.f$0).lambda$didReceivedNotification$158((Theme.ThemeInfo) this.f$1, tLObject, tL_error);
                break;
            default:
                LaunchActivity.lambda$handleIntent$25((AlertDialog) this.f$0, (ActionIntroActivity) this.f$1, tLObject, tL_error);
                break;
        }
    }
}
