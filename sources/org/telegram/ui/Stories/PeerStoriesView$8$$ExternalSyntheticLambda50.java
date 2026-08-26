package org.telegram.ui.Stories;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager$$ExternalSyntheticLambda2;
import org.telegram.ui.Components.RLottieImageView;

public final class PeerStoriesView$8$$ExternalSyntheticLambda50 implements Utilities.Callback4 {
    public final int $r8$classId;
    public final PeerStoriesView.AnonymousClass8 f$0;
    public final PeerStoriesView.SharedResources f$1;

    public PeerStoriesView$8$$ExternalSyntheticLambda50(PeerStoriesView.AnonymousClass8 anonymousClass8, PeerStoriesView.SharedResources sharedResources, int i) {
        this.$r8$classId = i;
        this.f$0 = anonymousClass8;
        this.f$1 = sharedResources;
    }

    @Override
    public final void run(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.$r8$classId) {
            case 0:
                Long l = (Long) obj;
                Runnable runnable = (Runnable) obj2;
                Boolean bool = (Boolean) obj3;
                PeerStoriesView.AnonymousClass8 anonymousClass8 = this.f$0;
                anonymousClass8.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                StoriesViewPager.AnonymousClass2.AnonymousClass1 anonymousClass1 = anonymousClass8.this$0;
                PeerStoriesView.VideoPlayerSharedScope videoPlayerSharedScope = anonymousClass1.playerSharedScope;
                StoryViewer.VideoPlayerHolder videoPlayerHolder = videoPlayerSharedScope.player;
                if (videoPlayerHolder != null) {
                    videoPlayerHolder.firstFrameRendered = false;
                    videoPlayerSharedScope.firstFrameRendered = false;
                    videoPlayerHolder.setOnReadyListener(new PeerStoriesView$$ExternalSyntheticLambda58(1, jCurrentTimeMillis, runnable));
                    ((StoryViewer.AnonymousClass5) ((PeerStoriesView) anonymousClass1).delegate).setPopupIsVisible(false);
                    RLottieImageView rLottieImageView = anonymousClass1.muteIconView;
                    if (rLottieImageView != null) {
                        rLottieImageView.setAnimation(this.f$1.muteDrawable);
                    }
                    if (anonymousClass1.videoDuration > 0 && l.longValue() > anonymousClass1.videoDuration - 1400) {
                        l = 0L;
                    }
                    anonymousClass1.setActive(l.longValue(), true);
                    anonymousClass1.editOpened = false;
                    AndroidUtilities.runOnUIThread(runnable, 400L);
                    if (bool.booleanValue()) {
                        anonymousClass1.updatePosition(false);
                    }
                } else {
                    ((StoryViewer.AnonymousClass5) ((PeerStoriesView) anonymousClass1).delegate).setPopupIsVisible(false);
                    anonymousClass1.setActive(true);
                    anonymousClass1.editOpened = false;
                    anonymousClass1.onImageReceiverThumbLoaded = new ConnectionsManager$$ExternalSyntheticLambda2(2, runnable);
                    if (bool.booleanValue()) {
                        anonymousClass1.updatePosition(false);
                    }
                    AndroidUtilities.runOnUIThread(runnable, 400L);
                }
                break;
            default:
                Long l2 = (Long) obj;
                Runnable runnable2 = (Runnable) obj2;
                Boolean bool2 = (Boolean) obj3;
                PeerStoriesView.AnonymousClass8 anonymousClass9 = this.f$0;
                anonymousClass9.getClass();
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                StoriesViewPager.AnonymousClass2.AnonymousClass1 anonymousClass2 = anonymousClass9.this$0;
                PeerStoriesView.VideoPlayerSharedScope videoPlayerSharedScope2 = anonymousClass2.playerSharedScope;
                StoryViewer.VideoPlayerHolder videoPlayerHolder2 = videoPlayerSharedScope2.player;
                if (videoPlayerHolder2 != null) {
                    videoPlayerHolder2.firstFrameRendered = false;
                    videoPlayerSharedScope2.firstFrameRendered = false;
                    videoPlayerHolder2.setOnReadyListener(new PeerStoriesView$$ExternalSyntheticLambda58(2, jCurrentTimeMillis2, runnable2));
                    ((StoryViewer.AnonymousClass5) ((PeerStoriesView) anonymousClass2).delegate).setPopupIsVisible(false);
                    RLottieImageView rLottieImageView2 = anonymousClass2.muteIconView;
                    if (rLottieImageView2 != null) {
                        rLottieImageView2.setAnimation(this.f$1.muteDrawable);
                    }
                    if (anonymousClass2.videoDuration > 0 && l2.longValue() > anonymousClass2.videoDuration - 1400) {
                        l2 = 0L;
                    }
                    anonymousClass2.setActive(l2.longValue(), true);
                    anonymousClass2.editOpened = false;
                    AndroidUtilities.runOnUIThread(runnable2, 400L);
                    if (bool2.booleanValue()) {
                        anonymousClass2.updatePosition(false);
                    }
                } else {
                    ((StoryViewer.AnonymousClass5) ((PeerStoriesView) anonymousClass2).delegate).setPopupIsVisible(false);
                    anonymousClass2.setActive(true);
                    anonymousClass2.editOpened = false;
                    anonymousClass2.onImageReceiverThumbLoaded = new ConnectionsManager$$ExternalSyntheticLambda2(3, runnable2);
                    if (bool2.booleanValue()) {
                        anonymousClass2.updatePosition(false);
                    }
                    AndroidUtilities.runOnUIThread(runnable2, 400L);
                }
                break;
        }
    }
}
