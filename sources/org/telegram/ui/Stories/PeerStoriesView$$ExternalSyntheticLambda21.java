package org.telegram.ui.Stories;

import android.view.View;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.browser.Browser;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Stars.StarsController;

public final class PeerStoriesView$$ExternalSyntheticLambda21 implements View.OnClickListener {
    public final int $r8$classId;
    public final PeerStoriesView f$0;

    public PeerStoriesView$$ExternalSyntheticLambda21(PeerStoriesView peerStoriesView, int i) {
        this.$r8$classId = i;
        this.f$0 = peerStoriesView;
    }

    @Override
    public final void onClick(View view) throws Throwable {
        StoriesController.UploadingStory uploadingStory;
        ActionBarPopupWindow actionBarPopupWindow;
        ActionBarPopupWindow actionBarPopupWindow2;
        switch (this.$r8$classId) {
            case 0:
                StoryViewer storyViewer = this.f$0.storyViewer;
                storyViewer.checkSelfStoriesView();
                AndroidUtilities.runOnUIThread(new StoryViewer$$ExternalSyntheticLambda2(storyViewer, 3), 30L);
                break;
            case 1:
                PeerStoriesView.AnonymousClass10 anonymousClass10 = this.f$0.liveCommentsView;
                anonymousClass10.setCollapsed(!anonymousClass10.collapsed, true);
                break;
            case 2:
                PeerStoriesView peerStoriesView = this.f$0;
                peerStoriesView.getClass();
                if (ApplicationLoader.isStandaloneBuild()) {
                    LaunchActivity launchActivity = LaunchActivity.instance;
                    if (launchActivity != null) {
                        launchActivity.checkAppUpdate(true);
                    }
                } else if (!BuildVars.isHuaweiStoreApp()) {
                    Browser.openUrl(peerStoriesView.getContext(), BuildVars.PLAYSTORE_APP_URL);
                } else {
                    Browser.openUrl(peerStoriesView.getContext(), BuildVars.HUAWEI_STORE_URL);
                }
                break;
            case 3:
                PeerStoriesView peerStoriesView2 = this.f$0;
                PeerStoriesView.StoryItemHolder storyItemHolder = peerStoriesView2.currentStory;
                if (storyItemHolder != null && (uploadingStory = storyItemHolder.uploadingStory) != null) {
                    uploadingStory.failed = false;
                    uploadingStory.entryDestroyed = false;
                    uploadingStory.progress = 0.0f;
                    uploadingStory.uploadProgress = 0.0f;
                    uploadingStory.convertingProgress = 0.0f;
                    if (uploadingStory.path != null) {
                        try {
                            new File(uploadingStory.path).delete();
                            uploadingStory.path = null;
                            break;
                        } catch (Exception unused) {
                        }
                    }
                    uploadingStory.start();
                    peerStoriesView2.updatePosition(false);
                    break;
                }
                break;
            case 4:
                PeerStoriesView peerStoriesView3 = this.f$0;
                peerStoriesView3.getClass();
                LivePlayer livePlayer = LivePlayer.recording;
                if (livePlayer != null) {
                    boolean z = livePlayer.outgoing;
                    boolean z2 = !(z && livePlayer.isMuted);
                    if (z && livePlayer.isMuted != z2) {
                        livePlayer.isMuted = z2;
                        NativeInstance nativeInstance = livePlayer.instance;
                        if (nativeInstance != null) {
                            nativeInstance.setMuteMicrophone(z2);
                        }
                    }
                    peerStoriesView3.muteButton.setMuted(z2, true);
                    break;
                }
                break;
            case 5:
                PeerStoriesView peerStoriesView4 = this.f$0;
                boolean zDisabledPaidFeatures = peerStoriesView4.disabledPaidFeatures(false);
                PeerStoriesView.AnonymousClass10 anonymousClass11 = peerStoriesView4.liveCommentsView;
                if (!zDisabledPaidFeatures) {
                    StarsController starsController = StarsController.getInstance(peerStoriesView4.currentAccount, false);
                    if (starsController.balanceLoaded && starsController.balance.amount <= 0) {
                        anonymousClass11.openStarsSheet(peerStoriesView4.disabledPaidFeatures(false));
                    } else {
                        anonymousClass11.sendStars();
                    }
                } else {
                    anonymousClass11.openStarsSheet(peerStoriesView4.disabledPaidFeatures(false));
                }
                break;
            case 6:
                PeerStoriesView peerStoriesView5 = this.f$0;
                if (peerStoriesView5.stealthModeIsActive) {
                    StealthModeAlert.showStealthModeEnabledBulletin();
                } else {
                    StoryViewer.this.showDialog(new StealthModeAlert(peerStoriesView5.getContext(), peerStoriesView5.storyContainer.getY() + peerStoriesView5.getY(), 0, peerStoriesView5.resourcesProvider));
                }
                PeerStoriesView.AnonymousClass8 anonymousClass8 = peerStoriesView5.popupMenu;
                if (anonymousClass8 != null && (actionBarPopupWindow = anonymousClass8.popupWindow) != null) {
                    actionBarPopupWindow.dismiss(true);
                    break;
                }
                break;
            default:
                PeerStoriesView peerStoriesView6 = this.f$0;
                peerStoriesView6.getClass();
                StoryViewer.this.showDialog(new StealthModeAlert(peerStoriesView6.getContext(), peerStoriesView6.storyContainer.getY() + peerStoriesView6.getY(), 0, peerStoriesView6.resourcesProvider));
                PeerStoriesView.AnonymousClass8 anonymousClass9 = peerStoriesView6.popupMenu;
                if (anonymousClass9 != null && (actionBarPopupWindow2 = anonymousClass9.popupWindow) != null) {
                    actionBarPopupWindow2.dismiss(true);
                    break;
                }
                break;
        }
    }
}
