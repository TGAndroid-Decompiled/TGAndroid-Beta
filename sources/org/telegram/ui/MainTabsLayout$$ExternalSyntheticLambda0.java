package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RLottieImageView;
import org.telegram.ui.Stories.StoriesController;
import org.telegram.ui.Stories.recorder.HintView2;

public final class MainTabsLayout$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;

    public MainTabsLayout$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((MainTabsLayout) this.f$0).lambda$new$0();
                break;
            case 1:
                LaunchActivity.lambda$runLinkRequest$108((LinkManager$$ExternalSyntheticLambda2) this.f$0);
                break;
            case 2:
                ((LoginActivity.LoginActivityNewPasswordView) this.f$0).lambda$onShow$10();
                break;
            case 3:
                ((LoginActivity.LoginActivityPasswordView) this.f$0).lambda$onShow$13();
                break;
            case 4:
                ((RLottieImageView) this.f$0).playAnimation();
                break;
            case 5:
                ((MessageEnterTransitionContainer) this.f$0).lambda$new$0();
                break;
            case 6:
                ((NotificationsSettingsActivity) this.f$0).lambda$createView$4();
                break;
            case 7:
                ((PasskeysActivity) this.f$0).lambda$fillItems$0();
                break;
            case 8:
                PassportActivity.lambda$new$0((TLObject) this.f$0);
                break;
            case 9:
                ((PeerColorActivity) this.f$0).lambda$toggleTheme$11();
                break;
            case 10:
                ((PeerColorActivity.Page.EmptyView) this.f$0).lambda$new$1();
                break;
            case 11:
                ((PhotoViewer.CaptionTextView) this.f$0).clearLinks();
                break;
            case 12:
                ((PrivacyUsersActivity) this.f$0).lambda$createView$1();
                break;
            case 13:
                AndroidUtilities.addToClipboard((String) this.f$0);
                break;
            case 14:
                ((HintView2) this.f$0).hide();
                break;
            case 15:
                ProfileActivity.lambda$createView$15((TLRPC.User) this.f$0);
                break;
            case 16:
                ProfileActivity.lambda$onMemberClick$61((ProfileActivity$$ExternalSyntheticLambda48) this.f$0);
                break;
            case 17:
                ((ProfileBirthdayEffect) this.f$0).lambda$onDraw$0();
                break;
            case 18:
                ((ProfileBirthdayEffect.BirthdayEffectFetcher) this.f$0).lambda$new$2();
                break;
            case 19:
                ((StoriesController.StoriesCollections) this.f$0).sendOrder();
                break;
            case 20:
                ((ProxySettingsActivity) this.f$0).lambda$createView$2();
                break;
            case 21:
                ((RightSlidingDialogContainer) this.f$0).invalidate();
                break;
            case 22:
                ((SaveToGallerySettingsActivity) this.f$0).lambda$createView$1();
                break;
            case 23:
                ((SearchAdsInfoBottomSheet) this.f$0).lambda$new$1();
                break;
            case 24:
                ((NotificationCenter) this.f$0).runDelayedNotifications();
                break;
            case 25:
                ((SelectAnimatedEmojiDialog.SearchBox) this.f$0).lambda$toggleClear$5();
                break;
            case 26:
                ((SelectChatUserSheet) this.f$0).update();
                break;
            case 27:
                ((SessionsActivity) this.f$0).lambda$createView$3();
                break;
            case 28:
                ((VoIPFeedbackActivity) this.f$0).finish();
                break;
            default:
                ((VoIPPermissionActivity) this.f$0).finish();
                break;
        }
    }
}
