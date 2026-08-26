package org.telegram.ui.Stories;

import android.app.Activity;
import androidx.core.graphics.ColorUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.Stories.recorder.HintView2;

public final class PeerStoriesView$$ExternalSyntheticLambda3 implements Runnable {
    public final int $r8$classId;
    public final PeerStoriesView f$0;

    public PeerStoriesView$$ExternalSyntheticLambda3(PeerStoriesView peerStoriesView, int i) {
        this.$r8$classId = i;
        this.f$0 = peerStoriesView;
    }

    @Override
    public final void run() {
        boolean zRelease;
        switch (this.$r8$classId) {
            case 0:
                this.f$0.failView.setVisibility(8);
                break;
            case 1:
                StoryViewer.access$3100(StoryViewer.this, true);
                break;
            case 2:
                StoryViewer storyViewer = this.f$0.storyViewer;
                if (storyViewer != null) {
                    storyViewer.presentFragment(new PremiumPreviewFragment("noncontacts"));
                }
                break;
            case 3:
                this.f$0.onHighlightLiveMessage();
                break;
            case 4:
                PeerStoriesView peerStoriesView = this.f$0;
                peerStoriesView.messageStars = 0L;
                PeerStoriesView.AnonymousClass19 anonymousClass19 = peerStoriesView.chatActivityEnterView;
                if (anonymousClass19 != null) {
                    anonymousClass19.checkSendButton(true);
                    peerStoriesView.chatActivityEnterView.updateSendButtonPaid();
                    peerStoriesView.checkStealthMode(true);
                }
                break;
            case 5:
                PeerStoriesView peerStoriesView2 = this.f$0;
                Activity activityFindActivity = AndroidUtilities.findActivity(peerStoriesView2.getContext());
                if (activityFindActivity != null) {
                    LivePlayer$$ExternalSyntheticLambda17 livePlayer$$ExternalSyntheticLambda17 = new LivePlayer$$ExternalSyntheticLambda17(24, peerStoriesView2, activityFindActivity);
                    StoryViewer.AnonymousClass5 anonymousClass5 = (StoryViewer.AnonymousClass5) peerStoriesView2.delegate;
                    StoryViewer.VideoPlayerHolder videoPlayerHolder = StoryViewer.this.playerHolder;
                    if (videoPlayerHolder != null) {
                        zRelease = videoPlayerHolder.release(livePlayer$$ExternalSyntheticLambda17);
                        StoryViewer.this.playerHolder = null;
                    } else {
                        zRelease = false;
                    }
                    if (!zRelease) {
                        AndroidUtilities.runOnUIThread(livePlayer$$ExternalSyntheticLambda17, 80L);
                    }
                    break;
                }
                break;
            case 6:
                PeerStoriesView peerStoriesView3 = this.f$0;
                if (!peerStoriesView3.storyViewer.isClosed) {
                    peerStoriesView3.reactionsTooltipRunnable = null;
                    if (peerStoriesView3.reactionsLongpressTooltip == null) {
                        HintView2 joint = new HintView2(peerStoriesView3.getContext(), 3).setJoint(1.0f, -22.0f);
                        peerStoriesView3.reactionsLongpressTooltip = joint;
                        joint.setBgColor(ColorUtils.setAlphaComponent(ColorUtils.blendARGB(0.13f, -16777216, -1), 240));
                        peerStoriesView3.reactionsLongpressTooltip.setBounce(false);
                        peerStoriesView3.reactionsLongpressTooltip.setText(LocaleController.getString(R.string.ReactionLongTapHint));
                        peerStoriesView3.reactionsLongpressTooltip.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(1.0f));
                        peerStoriesView3.storyContainer.addView(peerStoriesView3.reactionsLongpressTooltip, LayoutHelper.createFrame(-1, -2.0f, 85, 0.0f, 0.0f, 0.0f, peerStoriesView3.BIG_SCREEN ? 0.0f : 56.0f));
                    }
                    peerStoriesView3.reactionsLongpressTooltip.show();
                    SharedConfig.setStoriesReactionsLongPressHintUsed(true);
                    break;
                }
                break;
            case 7:
                PeerStoriesView peerStoriesView4 = this.f$0;
                peerStoriesView4.editOpened = true;
                peerStoriesView4.setActive(false);
                break;
            default:
                this.f$0.openChat();
                break;
        }
    }
}
