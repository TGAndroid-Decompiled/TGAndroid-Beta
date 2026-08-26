package org.telegram.ui;

import java.io.FileNotFoundException;
import org.telegram.messenger.CallReceiver;
import org.telegram.ui.Components.Reactions.ReactionsEffectOverlay;
import org.telegram.ui.Stories.StealthModeAlert;

public final class OAuthSheet$$ExternalSyntheticLambda5 implements Runnable {
    public final int $r8$classId;

    public OAuthSheet$$ExternalSyntheticLambda5(int i) {
        this.$r8$classId = i;
    }

    @Override
    public final void run() throws FileNotFoundException {
        switch (this.$r8$classId) {
            case 0:
                OAuthSheet.lambda$handle$12();
                break;
            case 1:
                NewContactBottomSheet.AnonymousClass7.lambda$didFindQr$0();
                break;
            case 2:
                NewContactBottomSheet.AnonymousClass7.lambda$didFindQr$2();
                break;
            case 3:
                QrActivity.AnonymousClass5.lambda$didFindQr$0();
                break;
            case 4:
                QrActivity.AnonymousClass5.lambda$didFindQr$2();
                break;
            case 5:
                TopicsFragment.AnonymousClass2.lambda$onItemClick$0();
                break;
            case 6:
                ChatActivity.lambda$createMenu$260();
                break;
            case 7:
                ChatActivity.lambda$didPressReaction$466();
                break;
            case 8:
                ChatActivity.ChatActivityAdapter.lambda$onBindViewHolder$1();
                break;
            case 9:
                ReactionsEffectOverlay.removeCurrent(true);
                break;
            case 10:
                ChatActivity.ThemeDelegate.lambda$new$0();
                break;
            case 11:
                ChatUsersActivity.lambda$processDone$29();
                break;
            case 12:
                ContactAddActivity.lambda$createView$6();
                break;
            case 13:
                ContactAddActivity.lambda$createView$3();
                break;
            case 14:
                StealthModeAlert.showStealthModeEnabledBulletin();
                break;
            case 15:
                GroupCallActivity.lambda$create$8();
                break;
            case 16:
                GroupCallActivity.lambda$new$0();
                break;
            case 17:
                LaunchActivity.lambda$onResume$147();
                break;
            case 18:
                CallReceiver.checkLastReceivedCall();
                break;
            case 19:
                CallReceiver.checkLastReceivedCall();
                break;
            case 20:
                PhotoViewer.lambda$setParentActivity$53();
                break;
            case 21:
                PrivacyControlActivity.lambda$createView$4();
                break;
            case 22:
                ReportBottomSheet.lambda$open$6();
                break;
            case 23:
                StakedDiceSheet.lambda$new$5();
                break;
            case 24:
                ThemePreviewActivity.lambda$applyWallpaperBackground$21();
                break;
            case 25:
                ThemePreviewActivity.lambda$onFragmentDestroy$27();
                break;
            case 26:
                TopicsFragment.lambda$onDialogAnimationFinished$11();
                break;
            case 27:
                VoIPFragment.lambda$onRequestPermissionsResultInternal$40();
                break;
            default:
                WallpapersListActivity.lambda$showAsSheet$6();
                break;
        }
    }
}
