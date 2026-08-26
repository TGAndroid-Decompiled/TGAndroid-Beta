package org.telegram.ui.Components;

import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class UndoView$$ExternalSyntheticLambda0 implements RequestDelegate {
    public final int $r8$classId;
    public final Object f$0;

    public UndoView$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                ((UndoView) this.f$0).lambda$showWithAction$5(tLObject, tL_error);
                break;
            case 1:
                ((EmojiPacksAlert.EmojiPacksLoader) this.f$0).lambda$init$1(tLObject, tL_error);
                break;
            case 2:
                ((EmojiView.AnonymousClass2) this.f$0).lambda$deleteSticker$2(tLObject, tL_error);
                break;
            case 3:
                ((EmojiView.GifAdapter) this.f$0).lambda$searchBotUser$1(tLObject, tL_error);
                break;
            case 4:
                ((TrendingStickersLayout.TrendingStickersAdapter) this.f$0).lambda$loadMoreStickerSets$3(tLObject, tL_error);
                break;
            case 5:
                AlertsCreator.lambda$showBlockReportSpamReplyAlert$36((AccountInstance) this.f$0, tLObject, tL_error);
                break;
            case 6:
                ((BlockingUpdateView) this.f$0).lambda$show$3(tLObject, tL_error);
                break;
            case 7:
                ((CreateRtmpStreamBottomSheet) this.f$0).lambda$new$13(tLObject, tL_error);
                break;
            case 8:
                ((DialogsBotsAdapter.PopularBots) this.f$0).lambda$load$6(tLObject, tL_error);
                break;
            case 9:
                ((InviteLinkBottomSheet) this.f$0).lambda$loadCreator$5(tLObject, tL_error);
                break;
            case 10:
                ((InviteMembersBottomSheet) this.f$0).lambda$generateLink$8(tLObject, tL_error);
                break;
            case 11:
                ((MessagePrivateSeenView) this.f$0).lambda$request$2(tLObject, tL_error);
                break;
            case 12:
                ((PostsSearchContainer) this.f$0).lambda$loadFlood$6(tLObject, tL_error);
                break;
            case 13:
                ((ReactedHeaderView) this.f$0).lambda$loadReactions$7(tLObject, tL_error);
                break;
            case 14:
                ((ReactedUsersListView) this.f$0).lambda$load$7(tLObject, tL_error);
                break;
            case 15:
                StickersAlert.lambda$onSubItemClick$23((Utilities.Callback) this.f$0, tLObject, tL_error);
                break;
            case 16:
                ((StickersAlert) this.f$0).lambda$updateFields$29(tLObject, tL_error);
                break;
            case 17:
                ((TopicsTabsView) this.f$0).lambda$onTabLongClick$7(tLObject, tL_error);
                break;
            default:
                ((TranslateAlert2) this.f$0).lambda$translate$2(tLObject, tL_error);
                break;
        }
    }
}
