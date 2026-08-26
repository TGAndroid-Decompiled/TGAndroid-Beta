package org.telegram.ui;

import android.widget.ImageView;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.Charts.data.ChartData;

public final class ChatActivity$$ExternalSyntheticLambda5 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;
    public final Object f$3;

    public ChatActivity$$ExternalSyntheticLambda5(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$3 = obj4;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((ChatActivity) this.f$0).lambda$migrateToNewChat$204((BaseFragment) this.f$1, (MessageObject) this.f$2, (INavigationLayout) this.f$3);
                break;
            case 1:
                ((CacheControlActivity.ClearCacheButtonInternal) this.f$0).lambda$doClearCache$2((CacheControlActivity.ClearingCacheView) this.f$1, (float[]) this.f$2, (boolean[]) this.f$3);
                break;
            case 2:
                ((CacheControlActivity.ClearCacheButtonInternal) this.f$0).lambda$doClearCache$3((boolean[]) this.f$1, (long[]) this.f$2, (BottomSheet) this.f$3);
                break;
            case 3:
                ((ChatUsersActivity.SearchAdapter) this.f$0).lambda$processSearch$2((String) this.f$1, (ArrayList) this.f$2, (ArrayList) this.f$3);
                break;
            case 4:
                ((GroupCallActivity.AvatarUpdaterDelegate) this.f$0).lambda$didUploadPhoto$0((TLRPC.TL_error) this.f$1, (TLObject) this.f$2, (String) this.f$3);
                break;
            case 5:
                ((GroupStickersActivity.SearchAdapter) this.f$0).lambda$onSearchStickers$0((ArrayList) this.f$1, (ArrayList) this.f$2, (String) this.f$3);
                break;
            case 6:
                ((MessageStatisticActivity.ListAdapter.AnonymousClass1) this.f$0).lambda$onZoomed$0((ChartData) this.f$1, (String) this.f$2, (StatisticActivity.ZoomCancelable) this.f$3);
                break;
            case 7:
                ((NotificationsCustomSettingsActivity.SearchAdapter) this.f$0).lambda$updateSearchResults$4((ArrayList) this.f$1, (ArrayList) this.f$2, (ArrayList) this.f$3);
                break;
            case 8:
                ((PhotoViewer.AnonymousClass16) this.f$0).lambda$onItemClick$17((TLObject) this.f$1, (UserConfig) this.f$2, (TLRPC.Photo) this.f$3);
                break;
            case 9:
                ((ProfileActivity.AnonymousClass6) this.f$0).lambda$onItemClick$10((TLObject) this.f$1, (UserConfig) this.f$2, (TLRPC.Photo) this.f$3);
                break;
            case 10:
                ((ProfileActivity.ListAdapter.AnonymousClass12) this.f$0).lambda$onClick$0((TLObject) this.f$1, (TLRPC.TL_username) this.f$2, (TLRPC.TL_error) this.f$3);
                break;
            case 11:
                ((ProfileActivity2.AnonymousClass5) this.f$0).lambda$onClick$0((TLObject) this.f$1, (TLRPC.TL_username) this.f$2, (TLRPC.TL_error) this.f$3);
                break;
            case 12:
                ((SessionsActivity.AnonymousClass6) this.f$0).lambda$processQr$1((TLObject) this.f$1, (TLRPC.TL_error) this.f$2, (Runnable) this.f$3);
                break;
            case 13:
                ((TopicCreateFragment.AnonymousClass1) this.f$0).lambda$onItemClick$0((TLObject) this.f$1, (String) this.f$2, (AlertDialog) this.f$3);
                break;
            case 14:
                ((CalendarActivity) this.f$0).lambda$loadNext$2((TLRPC.TL_error) this.f$1, (TLObject) this.f$2, (Calendar) this.f$3);
                break;
            case 15:
                ((ChangeBioActivity) this.f$0).lambda$saveName$3((AlertDialog) this.f$1, (TLRPC.TL_error) this.f$2, (TL_account.updateProfile) this.f$3);
                break;
            case 16:
                ((ChangeUsernameActivity) this.f$0).lambda$saveName$9((AlertDialog) this.f$1, (TLRPC.TL_error) this.f$2, (TL_account.updateUsername) this.f$3);
                break;
            case 17:
                ((ChatActivity) this.f$0).lambda$requestLinkPreview$143((TLRPC.TL_messageMediaWebPage) this.f$1, (TLRPC.TL_webPageAttributeStory) this.f$2, (Utilities.Callback2) this.f$3);
                break;
            case 18:
                ChatActivity.lambda$createMenu$272((long[]) this.f$0, (boolean[]) this.f$1, (ImageView) this.f$2, (ImageView) this.f$3);
                break;
            case 19:
                ((ChatActivity) this.f$0).lambda$didLongPressUsername$438((Browser.Progress) this.f$1, (TLObject) this.f$2, (Utilities.Callback2) this.f$3);
                break;
            case 20:
                ((ChatActivity) this.f$0).lambda$didPressPhoneNumber$458((Browser.Progress) this.f$1, (TLObject) this.f$2, (Utilities.Callback) this.f$3);
                break;
            case 21:
                ((ChatActivity) this.f$0).lambda$parseMarkdownAsync$366((MessageObject) this.f$2, (AlertDialog) this.f$1, (boolean[]) this.f$3);
                break;
            case 22:
                ((ChatActivity) this.f$0).lambda$loadLastUnreadMention$473((TLObject) this.f$1, (TLRPC.TL_error) this.f$2, (MessagesStorage) this.f$3);
                break;
            case 23:
                ((ChatLinkActivity) this.f$0).lambda$linkChat$12((AlertDialog[]) this.f$2, (TLRPC.Chat) this.f$3, (BaseFragment) this.f$1);
                break;
            case 24:
                ((ChatRightsEditActivity) this.f$0).lambda$initTransfer$17((TLRPC.TL_error) this.f$1, (TLObject) this.f$2, (TwoStepVerificationActivity) this.f$3);
                break;
            case 25:
                ((ChatUsersActivity) this.f$0).lambda$createMenuForParticipant$13((TLObject) this.f$1, (TLRPC.User) this.f$2, (ChatUsersActivity$$ExternalSyntheticLambda6) this.f$3);
                break;
            case 26:
                GroupCallActivity.lambda$new$19((TLObject) this.f$0, (ArrayList) this.f$1, (ArrayList) this.f$2, (Runnable) this.f$3);
                break;
            case 27:
                ((GroupCallActivity) this.f$0).lambda$new$42((TLRPC.Chat) this.f$1, (TLRPC.InputPeer) this.f$2, (TL_update.TL_updateGroupCall) this.f$3);
                break;
            case 28:
                ((GroupCallActivity) this.f$0).lambda$new$21((HashSet) this.f$1, (ChatObject.Call) this.f$2, (String) this.f$3);
                break;
            default:
                ((GroupCreateFinalActivity) this.f$0).lambda$onFragmentCreate$0((ArrayList) this.f$1, (ArrayList) this.f$2, (CountDownLatch) this.f$3);
                break;
        }
    }

    public ChatActivity$$ExternalSyntheticLambda5(ChatActivity chatActivity, MessageObject messageObject, AlertDialog alertDialog, boolean[] zArr) {
        this.$r8$classId = 21;
        this.f$0 = chatActivity;
        this.f$2 = messageObject;
        this.f$1 = alertDialog;
        this.f$3 = zArr;
    }

    public ChatActivity$$ExternalSyntheticLambda5(ChatLinkActivity chatLinkActivity, AlertDialog[] alertDialogArr, TLRPC.Chat chat, BaseFragment baseFragment) {
        this.$r8$classId = 23;
        this.f$0 = chatLinkActivity;
        this.f$2 = alertDialogArr;
        this.f$3 = chat;
        this.f$1 = baseFragment;
    }
}
