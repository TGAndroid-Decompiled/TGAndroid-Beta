package org.telegram.ui;

import android.util.LongSparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileRefController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.Adapters.MentionsAdapter;
import org.telegram.ui.Adapters.StickersSearchAdapter;
import org.telegram.ui.Gifts.GiftSheet;
import org.telegram.ui.Stars.StarGiftSheet;
import org.telegram.ui.Stars.StarsController;
import org.telegram.ui.Stories.PeerStoriesView;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView$$ExternalSyntheticLambda3;
import org.telegram.ui.Stories.recorder.StoryEntry;
import org.telegram.ui.Stories.recorder.StoryPrivacyBottomSheet;
import org.telegram.ui.iv.RichMediaUploader$$ExternalSyntheticLambda0;
import org.telegram.ui.web.BotWebViewContainer;
import org.telegram.ui.web.WebInstantView$4$$ExternalSyntheticLambda0;

public final class LoginActivity$$ExternalSyntheticLambda42 implements RequestDelegate {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;
    public final Object f$3;

    public LoginActivity$$ExternalSyntheticLambda42(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$3 = obj4;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        TLRPC.TL_messages_exportedChatInvite tL_messages_exportedChatInvite;
        TL_stories.StoryItem storyItem;
        Object obj = this.f$2;
        Object obj2 = this.f$1;
        Object obj3 = this.f$3;
        Object obj4 = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                LoginActivity loginActivity = (LoginActivity) obj4;
                loginActivity.getClass();
                AndroidUtilities.runOnUIThread(new LinkManager$$ExternalSyntheticLambda20((Object) loginActivity, (Object) tL_error, (String) obj2, obj, obj3, 3));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda375((MentionsAdapter.AnonymousClass4) obj4, (String) obj2, tL_error, tLObject, (MessagesController) obj, (MessagesStorage) obj3));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda218((StickersSearchAdapter.AnonymousClass1) obj4, (TLRPC.TL_messages_getStickers) obj2, tLObject, (ArrayList) obj, (LongSparseArray) obj3, 2));
                break;
            case 3:
                ChannelAdminLogActivity.ChatActivityAdapter.AnonymousClass3 anonymousClass3 = (ChannelAdminLogActivity.ChatActivityAdapter.AnonymousClass3) obj4;
                anonymousClass3.getClass();
                if (tL_error == null) {
                    tL_messages_exportedChatInvite = (TLRPC.TL_messages_exportedChatInvite) tLObject;
                    for (int i = 0; i < tL_messages_exportedChatInvite.users.size(); i++) {
                        TLRPC.User user = tL_messages_exportedChatInvite.users.get(i);
                        ChannelAdminLogActivity channelAdminLogActivity = ChannelAdminLogActivity.this;
                        if (channelAdminLogActivity.usersMap == null) {
                            channelAdminLogActivity.usersMap = new HashMap();
                        }
                        channelAdminLogActivity.usersMap.put(Long.valueOf(user.id), user);
                    }
                } else {
                    tL_messages_exportedChatInvite = null;
                }
                AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda218(anonymousClass3, (TLRPC.TL_chatInviteExported) obj2, tL_messages_exportedChatInvite, (boolean[]) obj, (AlertDialog) obj3));
                break;
            case 4:
                ChatLinkActivity chatLinkActivity = (ChatLinkActivity) obj4;
                chatLinkActivity.getClass();
                AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda271(chatLinkActivity, (AlertDialog[]) obj2, (TLRPC.Chat) obj, (GroupCreateFinalActivity) obj3, 29));
                break;
            case 5:
                ChatRightsEditActivity chatRightsEditActivity = (ChatRightsEditActivity) obj4;
                chatRightsEditActivity.getClass();
                AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda218(chatRightsEditActivity, tL_error, (TLRPC.TL_inputCheckPasswordSRP) obj2, (TwoStepVerificationActivity) obj, (TLRPC.TL_channels_editCreator) obj3, 13));
                break;
            case 6:
                ((PhotoViewer.AnonymousClass16.AnonymousClass2) obj4).lambda$new$4((MessageObject) obj2, (TLRPC.TL_messages_getAttachedStickers) obj, (LinkManager$$ExternalSyntheticLambda8) obj3, tLObject, tL_error);
                break;
            case 7:
                GiftSheet giftSheet = (GiftSheet) obj4;
                giftSheet.getClass();
                AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda375(giftSheet, (AlertDialog) obj2, tLObject, (WearAuthSheet$$ExternalSyntheticLambda3) obj, (Utilities.Callback) obj3, tL_error));
                break;
            case 8:
                PassportActivity passportActivity = (PassportActivity) obj4;
                passportActivity.getClass();
                AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda375((Object) passportActivity, (Object) tL_error, (String) obj2, obj, (Object) tLObject, obj3, 8));
                break;
            case 9:
                AndroidUtilities.runOnUIThread(new LinkManager$$ExternalSyntheticLambda20((PassportActivity.AnonymousClass3) obj4, tL_error, (PhotoViewer$$ExternalSyntheticLambda21) obj2, (PhotoViewer.AnonymousClass14) obj, (TL_account.verifyEmail) obj3, 10));
                break;
            case 10:
                PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) obj4;
                privacyControlActivity.getClass();
                AndroidUtilities.runOnUIThread(new LinkManager$$ExternalSyntheticLambda20((Object) privacyControlActivity, (Object) tL_error, obj2, obj, obj3, 14));
                break;
            case 11:
                ReportBottomSheet reportBottomSheet = (ReportBottomSheet) obj4;
                reportBottomSheet.getClass();
                AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda375(reportBottomSheet, tLObject, (CharSequence) obj, tL_error, (byte[]) obj3, (String) obj2));
                break;
            case 12:
                StarGiftSheet starGiftSheet = (StarGiftSheet) obj4;
                starGiftSheet.getClass();
                AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda375((Object) starGiftSheet, tLObject, obj2, obj, obj3, (Object) tL_error, 12));
                break;
            case 13:
                StarGiftSheet starGiftSheet2 = (StarGiftSheet) obj4;
                starGiftSheet2.getClass();
                AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda375((Object) starGiftSheet2, tLObject, obj2, obj, obj3, (Object) tL_error, 13));
                break;
            case 14:
                StarsController starsController = (StarsController) obj4;
                starsController.getClass();
                AndroidUtilities.runOnUIThread(new LinkManager$$ExternalSyntheticLambda20(starsController, (AlertDialog) obj2, tLObject, (TL_stars.InputSavedStarGift) obj, (Utilities.Callback) obj3, 28));
                break;
            case 15:
                AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda375(obj4, tLObject, obj2, obj, obj3, (Object) tL_error, 16));
                break;
            case 16:
                StarsController.GiftsCollections giftsCollections = (StarsController.GiftsCollections) obj4;
                giftsCollections.getClass();
                AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda375((Object) giftsCollections, tLObject, obj2, obj, obj3, (Object) tL_error, 18));
                break;
            case 17:
                PeerStoriesView peerStoriesView = (PeerStoriesView) obj4;
                peerStoriesView.getClass();
                AndroidUtilities.runOnUIThread(new WebInstantView$4$$ExternalSyntheticLambda0(peerStoriesView, (ButtonWithCounterView$$ExternalSyntheticLambda3) obj2, tL_error, (TL_stories.StoryItem) obj, (StoryPrivacyBottomSheet.StoryPrivacy) obj3, 3));
                break;
            case 18:
                StoryEntry storyEntry = (StoryEntry) obj4;
                storyEntry.getClass();
                RichMediaUploader$$ExternalSyntheticLambda0 richMediaUploader$$ExternalSyntheticLambda0 = (RichMediaUploader$$ExternalSyntheticLambda0) obj3;
                if (tL_error == null || !FileRefController.isFileRefError(tL_error.text) || (storyItem = (TL_stories.StoryItem) obj2) == null) {
                    richMediaUploader$$ExternalSyntheticLambda0.run(tLObject, tL_error);
                } else {
                    FileRefController.getInstance(storyEntry.currentAccount).requestReference(storyItem, (TLRPC.TL_messages_getAttachedStickers) obj, richMediaUploader$$ExternalSyntheticLambda0);
                }
                break;
            default:
                BotWebViewContainer botWebViewContainer = (BotWebViewContainer) obj4;
                botWebViewContainer.getClass();
                AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda375(botWebViewContainer, tLObject, (TLRPC.TL_messages_requestUrlAuth) obj3, (String) obj2, tL_error, (String) obj));
                break;
        }
    }

    public LoginActivity$$ExternalSyntheticLambda42(ReportBottomSheet reportBottomSheet, CharSequence charSequence, byte[] bArr, String str) {
        this.$r8$classId = 11;
        this.f$0 = reportBottomSheet;
        this.f$2 = charSequence;
        this.f$3 = bArr;
        this.f$1 = str;
    }

    public LoginActivity$$ExternalSyntheticLambda42(BotWebViewContainer botWebViewContainer, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, String str, String str2) {
        this.$r8$classId = 19;
        this.f$0 = botWebViewContainer;
        this.f$3 = tL_messages_requestUrlAuth;
        this.f$1 = str;
        this.f$2 = str2;
    }
}
