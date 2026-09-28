package org.telegram.ui;

import android.view.MotionEvent;
import org.telegram.messenger.video.VideoFramesRewinder;
import org.telegram.messenger.video.VideoPlayerRewinder;
public final class ct0 extends VideoPlayerRewinder {
    public final PhotoViewer f32793a;

    public ct0(PhotoViewer photoViewer, VideoFramesRewinder videoFramesRewinder) {
        super(videoFramesRewinder);
        this.f32793a = photoViewer;
    }

    @Override
    public final void onRewindCanceled() {
        MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
        PhotoViewer photoViewer = this.f32793a;
        PhotoViewer.k(photoViewer, obtain);
        photoViewer.f31411z1.f(false);
        org.telegram.ui.Components.qg0.f27690p0.Q.f(false);
    }

    @Override
    public final void onRewindStart(boolean z10) {
        PhotoViewer photoViewer = this.f32793a;
        photoViewer.f31411z1.e(false);
        photoViewer.f31411z1.d(!z10);
        photoViewer.f31411z1.f(true);
        photoViewer.f31223e0.invalidate();
        org.telegram.ui.Components.qg0.v(z10);
    }

    @Override
    public final void updateRewindProgressUi(long j3, float f7, boolean z10) {
        PhotoViewer photoViewer = this.f32793a;
        photoViewer.f31411z1.g(Math.abs(j3));
        if (z10) {
            photoViewer.f31329q3.h(f7, false);
            photoViewer.f31338r3.invalidate();
        }
        org.telegram.ui.Components.qg0 qg0Var = org.telegram.ui.Components.qg0.f27690p0;
        qg0Var.Q.g(0L);
        if (z10) {
            qg0Var.Z = f7;
            ai.n4 n4Var = qg0Var.f27694b0;
            if (n4Var != null) {
                n4Var.invalidate();
            }
            org.telegram.ui.Components.pg0 pg0Var = qg0Var.h;
            if (pg0Var != null) {
                pg0Var.invalidate();
            }
        }
    }
}
