package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class LinkManager$$ExternalSyntheticLambda10 implements RequestDelegate {
    public final int $r8$classId;
    public final Object f$0;

    public LinkManager$$ExternalSyntheticLambda10(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                ((LinkManager) this.f$0).lambda$handleSettings$2(tLObject, tL_error);
                break;
            case 1:
                ((ChatEditActivity.AnonymousClass1) this.f$0).lambda$onDeletePhoto$1(tLObject, tL_error);
                break;
            case 2:
                ((GroupCallActivity.AnonymousClass6) this.f$0).lambda$onItemClick$0(tLObject, tL_error);
                break;
            case 3:
                ((PassportActivity.PhoneConfirmationView.AnonymousClass5) this.f$0).lambda$run$1(tLObject, tL_error);
                break;
            case 4:
                ((WallpapersListActivity.SearchAdapter) this.f$0).lambda$searchBotUser$2(tLObject, tL_error);
                break;
            case 5:
                ((ArchivedStickersActivity) this.f$0).lambda$getStickers$2(tLObject, tL_error);
                break;
            case 6:
                ((CallLogActivity) this.f$0).lambda$getCalls$21(tLObject, tL_error);
                break;
            case 7:
                ((ChatLinkActivity) this.f$0).lambda$loadChats$17(tLObject, tL_error);
                break;
            case 8:
                ((ChatUsersActivity) this.f$0).lambda$deletePeer$24(tLObject, tL_error);
                break;
            case 9:
                ((ContactAddActivity) this.f$0).lambda$createView$12(tLObject, tL_error);
                break;
            case 10:
                ((DataSettingsActivity) this.f$0).lambda$createView$7(tLObject, tL_error);
                break;
            case 11:
                ((FilterCreateActivity.FilterInvitesBottomSheet) this.f$0).lambda$createLink$4(tLObject, tL_error);
                break;
            case 12:
                ((GroupStickersActivity) this.f$0).lambda$saveStickerSet$2(tLObject, tL_error);
                break;
            case 13:
                ((LoginActivity.LoginActivityRegisterView) this.f$0).lambda$onNextPressed$19(tLObject, tL_error);
                break;
            case 14:
                ((LoginActivity.LoginActivityResetWaitView) this.f$0).lambda$new$1(tLObject, tL_error);
                break;
            case 15:
                ((LoginActivity.LoginActivitySmsView) this.f$0).lambda$onNextPressed$25(tLObject, tL_error);
                break;
            case 16:
                ((LoginActivity.LoginPayView) this.f$0).lambda$poll$32(tLObject, tL_error);
                break;
            case 17:
                ((NotificationsSettingsActivity) this.f$0).lambda$createView$5(tLObject, tL_error);
                break;
            case 18:
                ((PremiumPreviewFragment) this.f$0).lambda$createView$3(tLObject, tL_error);
                break;
            case 19:
                ((PrivacyControlActivity) this.f$0).lambda$didUploadPhoto$1(tLObject, tL_error);
                break;
            case 20:
                ((PrivacySettingsActivity) this.f$0).lambda$loadPasswordSettings$22(tLObject, tL_error);
                break;
            case 21:
                ((ProfileActivity.SearchAdapter) this.f$0).lambda$loadFaqWebPage$142(tLObject, tL_error);
                break;
            case 22:
                ((StickersActivity) this.f$0).lambda$sendReorder$7(tLObject, tL_error);
                break;
            case 23:
                ((TooManyCommunitiesActivity) this.f$0).lambda$loadInactiveChannels$5(tLObject, tL_error);
                break;
            case 24:
                ((UserInfoActivity.AdminedChannelsFetcher) this.f$0).lambda$fetch$1(tLObject, tL_error);
                break;
            case 25:
                ((WallpapersListActivity) this.f$0).lambda$createView$2(tLObject, tL_error);
                break;
            default:
                ((WebviewActivity) this.f$0).lambda$reloadStats$1(tLObject, tL_error);
                break;
        }
    }
}
