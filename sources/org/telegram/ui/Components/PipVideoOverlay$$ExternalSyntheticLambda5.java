package org.telegram.ui.Components;

import com.google.android.exoplayer2.ExoPlayerImpl;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.PhotoViewer;

public final class PipVideoOverlay$$ExternalSyntheticLambda5 implements Runnable {
    public final int $r8$classId;
    public final PipVideoOverlay f$0;

    public PipVideoOverlay$$ExternalSyntheticLambda5(PipVideoOverlay pipVideoOverlay, int i) {
        this.$r8$classId = i;
        this.f$0 = pipVideoOverlay;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.onDismissedInternal();
                break;
            case 1:
                PipVideoOverlay pipVideoOverlay = this.f$0;
                PhotoViewer photoViewer = pipVideoOverlay.photoViewer;
                if (photoViewer != null) {
                    PhotoViewerWebView photoViewerWebView = pipVideoOverlay.photoViewerWebView;
                    if (photoViewerWebView != null) {
                        pipVideoOverlay.videoProgress = photoViewerWebView.getCurrentPosition() / pipVideoOverlay.photoViewerWebView.getVideoDuration();
                        pipVideoOverlay.bufferProgress = pipVideoOverlay.photoViewerWebView.getBufferedPosition();
                    } else {
                        VideoPlayer videoPlayer = photoViewer.videoPlayer;
                        if (videoPlayer != null) {
                            float duration$1 = pipVideoOverlay.getDuration$1();
                            pipVideoOverlay.videoProgress = videoPlayer.getCurrentPosition() / duration$1;
                            ExoPlayerImpl exoPlayerImpl = videoPlayer.player;
                            pipVideoOverlay.bufferProgress = (exoPlayerImpl != null ? videoPlayer.isStreaming ? exoPlayerImpl.getBufferedPosition() : exoPlayerImpl.getDuration() : 0L) / duration$1;
                        }
                    }
                    pipVideoOverlay.videoProgressView.invalidate();
                    AndroidUtilities.runOnUIThread(pipVideoOverlay.progressRunnable, 500L);
                    break;
                }
                break;
            case 2:
                PipVideoOverlay pipVideoOverlay2 = this.f$0;
                PhotoViewer photoViewer2 = pipVideoOverlay2.photoViewer;
                if (photoViewer2 != null) {
                    if ((photoViewer2.videoPlayer != null || pipVideoOverlay2.photoViewerWebView != null) && !pipVideoOverlay2.isDismissing && !pipVideoOverlay2.isVideoCompleted && !pipVideoOverlay2.isScrolling && !pipVideoOverlay2.scaleGestureDetector.isInProgress() && pipVideoOverlay2.canLongClick) {
                        VideoPlayer videoPlayer2 = pipVideoOverlay2.photoViewer.videoPlayer;
                        boolean z = pipVideoOverlay2.longClickStartPoint[0] >= (((float) PipVideoOverlay.getSuggestedWidth(pipVideoOverlay2.getRatio$2())) * pipVideoOverlay2.scaleFactor) * 0.5f;
                        long currentPosition$1 = pipVideoOverlay2.getCurrentPosition$1();
                        long duration$2 = pipVideoOverlay2.getDuration$1();
                        if (currentPosition$1 != -9223372036854775807L && duration$2 >= 15000) {
                            PhotoViewerWebView photoViewerWebView2 = pipVideoOverlay2.photoViewerWebView;
                            if (photoViewerWebView2 != null) {
                                PhotoViewer photoViewer3 = pipVideoOverlay2.photoViewer;
                                photoViewer3.videoPlayerRewinder.startRewind(photoViewerWebView2, z, pipVideoOverlay2.longClickStartPoint[0], photoViewer3.currentVideoSpeed, pipVideoOverlay2.seekSpeedDrawable);
                            } else {
                                PhotoViewer photoViewer4 = pipVideoOverlay2.photoViewer;
                                photoViewer4.videoPlayerRewinder.startRewind(videoPlayer2, z, pipVideoOverlay2.longClickStartPoint[0], photoViewer4.currentVideoSpeed, pipVideoOverlay2.seekSpeedDrawable);
                            }
                            if (!pipVideoOverlay2.isShowingControls) {
                                pipVideoOverlay2.isShowingControls = true;
                                pipVideoOverlay2.toggleControls$2(true);
                                if (!pipVideoOverlay2.postedDismissControls) {
                                    AndroidUtilities.runOnUIThread(pipVideoOverlay2.dismissControlsCallback, 1500L);
                                    pipVideoOverlay2.postedDismissControls = true;
                                }
                            }
                            break;
                        }
                    }
                }
                break;
            default:
                PipVideoOverlay pipVideoOverlay3 = this.f$0;
                PhotoViewer photoViewer5 = pipVideoOverlay3.photoViewer;
                if (photoViewer5 != null && photoViewer5.videoPlayerRewinder.rewinding) {
                    AndroidUtilities.runOnUIThread(pipVideoOverlay3.dismissControlsCallback, 1500L);
                } else {
                    pipVideoOverlay3.isShowingControls = false;
                    pipVideoOverlay3.toggleControls$2(false);
                    pipVideoOverlay3.postedDismissControls = false;
                }
                break;
        }
    }
}
