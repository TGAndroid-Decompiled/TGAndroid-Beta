package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.utils.tlutils.AmountUtils$Amount;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.ScrimOptions;

public final class ChatActivity$$ExternalSyntheticLambda30 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;

    public ChatActivity$$ExternalSyntheticLambda30(Activity activity, Object obj, TLRPC.TL_error tL_error, int i) {
        this.$r8$classId = i;
        this.f$0 = activity;
        this.f$2 = obj;
        this.f$1 = tL_error;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((ChatActivity) this.f$0).lambda$processSelectedOption$342((TLRPC.TL_error) this.f$1, (TLRPC.TL_messages_editMessage) this.f$2);
                break;
            case 1:
                ((ChannelColorActivity.ThemeChooser) this.f$0).lambda$parseTheme$3((TLObject) this.f$1, (Theme.ThemeInfo) this.f$2);
                break;
            case 2:
                ((ChannelCreateActivity) this.f$0).lambda$generateLink$13((TLRPC.TL_error) this.f$1, (TLObject) this.f$2);
                break;
            case 3:
                ChannelMonetizationLayout.lambda$new$0((BaseFragment) this.f$0, (Context) this.f$1, (Theme.ResourcesProvider) this.f$2);
                break;
            case 4:
                ((ChannelMonetizationLayout) this.f$0).lambda$new$13((TLObject) this.f$1, (Context) this.f$2);
                break;
            case 5:
                ((ChatActivity) this.f$0).lambda$openAttachBotLayout$216((TLObject) this.f$1, (TLRPC.User) this.f$2);
                break;
            case 6:
                ((ChatActivity) this.f$0).lambda$didPressPhoneNumber$457((TLRPC.TL_contact) this.f$1, (ChatActivity$$ExternalSyntheticLambda129) this.f$2);
                break;
            case 7:
                ((ChatActivity) this.f$0).lambda$didPressPhoneNumber$454((ScrimOptions) this.f$1, (TLRPC.User) this.f$2);
                break;
            case 8:
                ((ChatActivity) this.f$0).lambda$didPressPhoneNumber$443((ItemOptions) this.f$1, (String) this.f$2);
                break;
            case 9:
                ((ChatActivity) this.f$0).lambda$updateTopPanel$239((TLRPC.User) this.f$1, (TLRPC.EmojiStatus) this.f$2);
                break;
            case 10:
                ((ChatActivity) this.f$0).lambda$processSelectedOption$356((TLRPC.SuggestedPost) this.f$1, (MessageObject) this.f$2);
                break;
            case 11:
                ((ChatActivity) this.f$0).lambda$onFragmentCreate$13((MessagesStorage) this.f$1, (CountDownLatch) this.f$2);
                break;
            case 12:
                ((ChatActivity) this.f$0).lambda$checkStarsNeedSheet$358((AmountUtils$Amount) this.f$1, (Runnable) this.f$2);
                break;
            case 13:
                ((ChatEditActivity) this.f$0).lambda$loadLinksCount$0((TLRPC.TL_error) this.f$1, (TLObject) this.f$2);
                break;
            case 14:
                ((ChatUsersActivity) this.f$0).lambda$loadChatParticipants$31((ArrayList) this.f$1, (ArrayList) this.f$2);
                break;
            case 15:
                ((DialogsActivity) this.f$0).lambda$didReceivedNotification$120((DialogsActivity.ViewPage) this.f$1, (Object[]) this.f$2);
                break;
            case 16:
                ((DialogsActivity) this.f$0).lambda$createGroupForThis$66((ChannelCreateActivity) this.f$1, (BaseFragment) this.f$2);
                break;
            case 17:
                ((EmojiAnimationsOverlay) this.f$0).lambda$createDrawingObject$0((TLObject) this.f$1, (MessageObject) this.f$2);
                break;
            case 18:
                ((ExternalActionActivity) this.f$0).lambda$handleIntent$9((AlertDialog) this.f$2, (TLRPC.TL_error) this.f$1);
                break;
            case 19:
                ((FilterCreateActivity) this.f$0).lambda$onClickCreateLink$11((TLRPC.TL_error) this.f$1, (TLObject) this.f$2);
                break;
            case 20:
                ((FilterCreateActivity.FilterInvitesBottomSheet) this.f$0).lambda$createLink$3((TLRPC.TL_error) this.f$1, (TLObject) this.f$2);
                break;
            case 21:
                ((GroupCreateActivity.GroupCreateAdapter) this.f$0).lambda$updateSearchResults$5((ArrayList) this.f$1, (ArrayList) this.f$2);
                break;
            case 22:
                ((IntroActivity) this.f$0).lambda$checkContinueText$3((TLRPC.TL_langPackString) this.f$1, (String) this.f$2);
                break;
            case 23:
                ((InviteContactsActivity.InviteAdapter) this.f$0).lambda$updateSearchResults$0((ArrayList) this.f$1, (ArrayList) this.f$2);
                break;
            case 24:
                ((LaunchActivity) this.f$0).lambda$didReceivedNotification$157((TLObject) this.f$1, (Theme.ThemeInfo) this.f$2);
                break;
            case 25:
                ((LaunchActivity) this.f$0).lambda$runLinkRequest$94((Runnable) this.f$2, (TLRPC.TL_error) this.f$1);
                break;
            case 26:
                ((LaunchActivity) this.f$0).lambda$runLinkRequest$96((Runnable) this.f$1, (TLObject) this.f$2);
                break;
            case 27:
                ((LaunchActivity) this.f$0).lambda$openStories$181((int[]) this.f$1, (long[]) this.f$2);
                break;
            case 28:
                ((LaunchActivity) this.f$0).lambda$didReceivedNotification$160((Theme.ThemeInfo) this.f$1, (File) this.f$2);
                break;
            default:
                ((LaunchActivity) this.f$0).lambda$processAttachedMenuBotFromShortcut$122((TLRPC.User) this.f$1, (Utilities.Callback) this.f$2);
                break;
        }
    }

    public ChatActivity$$ExternalSyntheticLambda30(Object obj, Object obj2, Object obj3, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
    }
}
