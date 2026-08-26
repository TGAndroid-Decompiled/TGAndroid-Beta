package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.BaseController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.Stars.StarsController;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;

public final class ArticleViewer$$ExternalSyntheticLambda48 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final int f$2;
    public final long f$3;

    public ArticleViewer$$ExternalSyntheticLambda48(Object obj, long j, int i, Object obj2, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$3 = j;
        this.f$2 = i;
        this.f$1 = obj2;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ArticleViewer articleViewer = (ArticleViewer) this.f$0;
                if (articleViewer.previewsReqId != 0) {
                    articleViewer.previewsReqId = 0;
                    articleViewer.showProgressView(false);
                    TLObject tLObject = (TLObject) this.f$1;
                    if (tLObject != null) {
                        TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
                        int i = this.f$2;
                        MessagesController.getInstance(i).putUsers(tL_contacts_resolvedPeer.users, false);
                        MessagesStorage.getInstance(i).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, false, true);
                        if (!tL_contacts_resolvedPeer.users.isEmpty()) {
                            articleViewer.openPreviewsChat(this.f$3, tL_contacts_resolvedPeer.users.get(0));
                        }
                    }
                    break;
                }
                break;
            case 1:
                ((MediaDataController) this.f$0).lambda$putMenuBotsToCache$6((TLRPC.TL_attachMenuBots) this.f$1, this.f$3, this.f$2);
                break;
            case 2:
                ((MediaDataController) this.f$0).lambda$processLoadedStickers$104((ArrayList) this.f$1, this.f$3, this.f$2);
                break;
            case 3:
                ((MessagesController) this.f$0).lambda$checkPromoInfoInternal$168(this.f$3, (TLRPC.TL_help_promoData) this.f$1, this.f$2);
                break;
            case 4:
                ((MessagesController) this.f$0).lambda$processUpdateArray$388(this.f$3, this.f$2, (TLRPC.TL_sendMessageTextDraftAction) this.f$1);
                break;
            case 5:
                ((MessagesController) this.f$0).lambda$processUpdateArray$389(this.f$3, this.f$2, (TLRPC.TL_sendMessageRichMessageDraftAction) this.f$1);
                break;
            case 6:
                ((MessagesStorage) this.f$0).lambda$updateTopicData$48(this.f$3, (TLRPC.TL_forumTopic) this.f$1, this.f$2);
                break;
            case 7:
                ((MessagesStorage) this.f$0).lambda$updateMessageVoiceTranscriptionOpen$107(this.f$2, this.f$3, (TLRPC.Message) this.f$1);
                break;
            case 8:
                ((MessagesStorage) this.f$0).lambda$updateMessageReactions$104(this.f$2, this.f$3, (TLRPC.TL_messageReactions) this.f$1);
                break;
            case 9:
                ((MessagesStorage) this.f$0).lambda$updateChatDefaultBannedRights$180(this.f$3, this.f$2, (TLRPC.TL_chatBannedRights) this.f$1);
                break;
            case 10:
                ((SendMessagesHelper) this.f$0).lambda$sendNotificationCallback$30(this.f$3, this.f$2, (byte[]) this.f$1);
                break;
            case 11:
                ((TranslateController) this.f$0).lambda$checkLanguage$14((MessageObject) this.f$1, this.f$3, this.f$2);
                break;
            case 12:
                ((ChatActivity$$ExternalSyntheticLambda464) this.f$0).run(Float.valueOf(((int[]) this.f$1)[0] / this.f$2), Boolean.valueOf(System.currentTimeMillis() - this.f$3 > 250));
                break;
            case 13:
                ((ProfileActivity) this.f$0).getMessagesController().getStoriesController().addStoriesToAlbum(this.f$2, this.f$3, (ArrayList) this.f$1);
                break;
            default:
                ((ButtonWithCounterView) this.f$0).setLoading(false);
                BottomSheet bottomSheet = ((BottomSheet[]) this.f$1)[0];
                if (bottomSheet != null) {
                    bottomSheet.lambda$showGiftOfferSheet$15();
                }
                StarsController.getInstance(this.f$2, false).invalidateSubscriptions();
                BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
                if (safeLastFragment != null) {
                    safeLastFragment.presentFragment(ChatActivity.of(this.f$3));
                    break;
                }
                break;
        }
    }

    public ArticleViewer$$ExternalSyntheticLambda48(Object obj, Object obj2, int i, long j, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = i;
        this.f$3 = j;
    }

    public ArticleViewer$$ExternalSyntheticLambda48(BaseController baseController, long j, TLObject tLObject, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = baseController;
        this.f$3 = j;
        this.f$1 = tLObject;
        this.f$2 = i;
    }

    public ArticleViewer$$ExternalSyntheticLambda48(BaseController baseController, Object obj, long j, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = baseController;
        this.f$1 = obj;
        this.f$3 = j;
        this.f$2 = i;
    }

    public ArticleViewer$$ExternalSyntheticLambda48(MessagesStorage messagesStorage, int i, long j, TLObject tLObject, int i2) {
        this.$r8$classId = i2;
        this.f$0 = messagesStorage;
        this.f$2 = i;
        this.f$3 = j;
        this.f$1 = tLObject;
    }
}
