package org.telegram.ui;

import android.net.Uri;
import com.google.android.exoplayer2.ExoPlayerImpl;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.video.ColorInfo;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.VideoPlayer;

public final class PhotoViewer$55$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final PhotoViewer.AnonymousClass55 f$0;

    public PhotoViewer$55$$ExternalSyntheticLambda0(PhotoViewer.AnonymousClass55 anonymousClass55, int i) {
        this.$r8$classId = i;
        this.f$0 = anonymousClass55;
    }

    @Override
    public final void run() {
        ColorInfo colorInfo;
        int i;
        switch (this.$r8$classId) {
            case 0:
                PhotoViewer photoViewer = PhotoViewer.this;
                PhotoViewer.FirstFrameView firstFrameView = photoViewer.firstFrameView;
                if (firstFrameView != null) {
                    VideoPlayer videoPlayer = photoViewer.videoPlayer;
                    if (firstFrameView.currentVideoPlayer != videoPlayer) {
                        firstFrameView.hasFrame = false;
                        firstFrameView.gotError = false;
                        if (firstFrameView.gettingFrame) {
                            firstFrameView.gettingFrameIndex++;
                            firstFrameView.gettingFrame = false;
                        }
                        firstFrameView.setImageResource(17170445);
                    }
                    if (videoPlayer != null) {
                        ExoPlayerImpl exoPlayerImpl = videoPlayer.player;
                        if (exoPlayerImpl == null) {
                            long duration = videoPlayer.getDuration() - videoPlayer.getCurrentPosition();
                            if (!firstFrameView.hasFrame && !firstFrameView.gotError && !firstFrameView.gettingFrame && duration < 5250.0f) {
                                Uri uri = videoPlayer.currentUri;
                                int i2 = firstFrameView.gettingFrameIndex + 1;
                                firstFrameView.gettingFrameIndex = i2;
                                Utilities.globalQueue.postRunnable(new PollItemMenu$$ExternalSyntheticLambda17(firstFrameView, uri, i2, 26));
                                firstFrameView.gettingFrame = true;
                            }
                        } else {
                            try {
                                exoPlayerImpl.verifyApplicationThread();
                                Format format = exoPlayerImpl.videoFormat;
                                if (format == null || (colorInfo = format.colorInfo) == null || ((i = colorInfo.colorTransfer) != 6 && i != 7)) {
                                    long duration2 = videoPlayer.getDuration() - videoPlayer.getCurrentPosition();
                                    if (!firstFrameView.hasFrame) {
                                        Uri uri2 = videoPlayer.currentUri;
                                        int i3 = firstFrameView.gettingFrameIndex + 1;
                                        firstFrameView.gettingFrameIndex = i3;
                                        Utilities.globalQueue.postRunnable(new PollItemMenu$$ExternalSyntheticLambda17(firstFrameView, uri2, i3, 26));
                                        firstFrameView.gettingFrame = true;
                                    }
                                }
                            } catch (Exception unused) {
                            }
                        }
                    }
                    firstFrameView.currentVideoPlayer = videoPlayer;
                }
                break;
            case 1:
                PhotoViewer.FirstFrameView firstFrameView2 = PhotoViewer.this.firstFrameView;
                int i4 = PhotoViewer.FirstFrameView.$r8$clinit;
                firstFrameView2.updateAlpha();
                break;
            default:
                PhotoViewer.FirstFrameView firstFrameView3 = PhotoViewer.this.firstFrameView;
                int i5 = PhotoViewer.FirstFrameView.$r8$clinit;
                firstFrameView3.updateAlpha();
                break;
        }
    }
}
