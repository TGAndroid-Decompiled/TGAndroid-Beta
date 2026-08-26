package org.telegram.ui.Stories.recorder;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.FilterGLThread;
import org.telegram.ui.Components.VideoEditTextureView;
import org.telegram.ui.Components.VideoPlayer;

public final class PreviewView$$ExternalSyntheticLambda1 implements Runnable {
    public final int $r8$classId;
    public final PreviewView f$0;

    public PreviewView$$ExternalSyntheticLambda1(PreviewView previewView, int i) {
        this.$r8$classId = i;
        this.f$0 = previewView;
    }

    @Override
    public final void run() {
        boolean z;
        switch (this.$r8$classId) {
            case 0:
                this.f$0.setupGradient();
                break;
            case 1:
                PreviewView previewView = this.f$0;
                VideoPlayer videoPlayer = previewView.videoPlayer;
                if (videoPlayer != null && previewView.timelineView != null) {
                    long currentPosition = videoPlayer.getCurrentPosition();
                    if (previewView.getDuration() > 1) {
                        float duration = currentPosition / previewView.getDuration();
                        if (previewView.timelineView.dragged) {
                            if (currentPosition < previewView.lastPos) {
                                z = true;
                            } else {
                                z = false;
                            }
                            previewView.updateAudioPlayer(z);
                            previewView.updateRoundPlayer(currentPosition < previewView.lastPos);
                        } else {
                            StoryEntry storyEntry = previewView.entry;
                            if ((duration < storyEntry.left || duration > storyEntry.right) && System.currentTimeMillis() - previewView.seekedLastTime > 500) {
                                previewView.seekedLastTime = System.currentTimeMillis();
                                VideoPlayer videoPlayer2 = previewView.videoPlayer;
                                long duration2 = (long) (previewView.entry.left * previewView.getDuration());
                                videoPlayer2.seekTo(duration2, false);
                                previewView.updateAudioPlayer(true);
                                previewView.updateRoundPlayer(true);
                                currentPosition = duration2;
                            } else {
                                if (currentPosition < previewView.lastPos) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                previewView.updateAudioPlayer(z);
                                previewView.updateRoundPlayer(currentPosition < previewView.lastPos);
                            }
                        }
                        previewView.timelineView.setProgress(previewView.videoPlayer.getCurrentPosition());
                    } else {
                        previewView.timelineView.setProgress(previewView.videoPlayer.getCurrentPosition());
                    }
                    if (previewView.videoPlayer.isPlaying()) {
                        PreviewView$$ExternalSyntheticLambda1 previewView$$ExternalSyntheticLambda1 = previewView.updateProgressRunnable;
                        AndroidUtilities.cancelRunOnUIThread(previewView$$ExternalSyntheticLambda1);
                        AndroidUtilities.runOnUIThread(previewView$$ExternalSyntheticLambda1, (long) (1000.0f / AndroidUtilities.screenRefreshRate));
                    }
                    previewView.lastPos = currentPosition;
                    break;
                }
                break;
            case 2:
                PreviewView previewView2 = this.f$0;
                if (previewView2.audioPlayer != null && previewView2.videoPlayer == null && previewView2.roundPlayer == null && previewView2.timelineView != null && !previewView2.isCollage()) {
                    long currentPosition2 = previewView2.audioPlayer.getCurrentPosition();
                    StoryEntry storyEntry2 = previewView2.entry;
                    if (storyEntry2 != null) {
                        float f = currentPosition2;
                        float f2 = storyEntry2.audioLeft;
                        float f3 = storyEntry2.audioDuration;
                        if ((f < f2 * f3 || f > storyEntry2.audioRight * f3) && System.currentTimeMillis() - previewView2.seekedLastTime > 500) {
                            previewView2.seekedLastTime = System.currentTimeMillis();
                            VideoPlayer videoPlayer3 = previewView2.audioPlayer;
                            StoryEntry storyEntry3 = previewView2.entry;
                            long j = (long) (storyEntry3.audioLeft * storyEntry3.audioDuration);
                            videoPlayer3.seekTo(j, false);
                            currentPosition2 = j;
                        }
                    }
                    previewView2.timelineView.setProgress(currentPosition2);
                    if (previewView2.audioPlayer.isPlaying()) {
                        PreviewView$$ExternalSyntheticLambda1 previewView$$ExternalSyntheticLambda2 = previewView2.updateAudioProgressRunnable;
                        AndroidUtilities.cancelRunOnUIThread(previewView$$ExternalSyntheticLambda2);
                        AndroidUtilities.runOnUIThread(previewView$$ExternalSyntheticLambda2, (long) (1000.0f / AndroidUtilities.screenRefreshRate));
                    }
                    break;
                }
                break;
            case 3:
                PreviewView previewView3 = this.f$0;
                if (previewView3.roundPlayer != null && previewView3.videoPlayer == null && !previewView3.isCollage() && previewView3.timelineView != null) {
                    long currentPosition3 = previewView3.roundPlayer.getCurrentPosition();
                    StoryEntry storyEntry4 = previewView3.entry;
                    if (storyEntry4 != null) {
                        float f4 = currentPosition3;
                        float f5 = storyEntry4.roundLeft;
                        float f6 = storyEntry4.roundDuration;
                        if ((f4 < f5 * f6 || f4 > storyEntry4.roundRight * f6) && System.currentTimeMillis() - previewView3.seekedLastTime > 500) {
                            previewView3.seekedLastTime = System.currentTimeMillis();
                            VideoPlayer videoPlayer4 = previewView3.roundPlayer;
                            StoryEntry storyEntry5 = previewView3.entry;
                            long j2 = (long) (storyEntry5.roundLeft * storyEntry5.roundDuration);
                            videoPlayer4.seekTo(j2, false);
                            previewView3.updateAudioPlayer(true);
                            currentPosition3 = j2;
                        }
                    }
                    previewView3.timelineView.setProgress(currentPosition3);
                    if (previewView3.roundPlayer.isPlaying()) {
                        PreviewView$$ExternalSyntheticLambda1 previewView$$ExternalSyntheticLambda3 = previewView3.updateRoundProgressRunnable;
                        AndroidUtilities.cancelRunOnUIThread(previewView$$ExternalSyntheticLambda3);
                        AndroidUtilities.runOnUIThread(previewView$$ExternalSyntheticLambda3, (long) (1000.0f / AndroidUtilities.screenRefreshRate));
                    }
                    break;
                }
                break;
            default:
                PreviewView previewView4 = this.f$0;
                VideoEditTextureView videoEditTextureView = previewView4.textureView;
                if (videoEditTextureView != null) {
                    FilterGLThread filterGLThread = videoEditTextureView.eglThread;
                    if (filterGLThread != null) {
                        filterGLThread.shutdown();
                    }
                    videoEditTextureView.currentVideoPlayer = null;
                    previewView4.removeView(previewView4.textureView);
                    previewView4.textureView = null;
                }
                break;
        }
    }
}
