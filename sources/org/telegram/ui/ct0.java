package org.telegram.ui;

import android.view.MotionEvent;
import org.telegram.messenger.video.VideoFramesRewinder;
import org.telegram.messenger.video.VideoPlayerRewinder;
public final class ct0 extends VideoPlayerRewinder {
    public final PhotoViewer f32792a;

    public ct0(PhotoViewer photoViewer, VideoFramesRewinder videoFramesRewinder) {
        super(videoFramesRewinder);
        this.f32792a = photoViewer;
    }

    @Override
    public final void onRewindCanceled() {
        MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
        PhotoViewer photoViewer = this.f32792a;
        PhotoViewer.k(photoViewer, obtain);
        photoViewer.f31410z1.f(false);
        org.telegram.ui.Components.pg0.f27353p0.Q.f(false);
    }

    @Override
    public final void onRewindStart(boolean z10) {
        PhotoViewer photoViewer = this.f32792a;
        photoViewer.f31410z1.e(false);
        photoViewer.f31410z1.d(!z10);
        photoViewer.f31410z1.f(true);
        photoViewer.f31222e0.invalidate();
        org.telegram.ui.Components.pg0.v(z10);
    }

    @Override
    public final void updateRewindProgressUi(long j3, float f7, boolean z10) {
        PhotoViewer photoViewer = this.f32792a;
        photoViewer.f31410z1.g(Math.abs(j3));
        if (z10) {
            photoViewer.f31328q3.h(f7, false);
            photoViewer.f31337r3.invalidate();
        }
        org.telegram.ui.Components.pg0 pg0Var = org.telegram.ui.Components.pg0.f27353p0;
        pg0Var.Q.g(0L);
        if (z10) {
            pg0Var.Z = f7;
            ai.n4 n4Var = pg0Var.f27357b0;
            if (n4Var != null) {
                n4Var.invalidate();
            }
            org.telegram.ui.Components.og0 og0Var = pg0Var.h;
            if (og0Var != null) {
                og0Var.invalidate();
            }
        }
    }
}
