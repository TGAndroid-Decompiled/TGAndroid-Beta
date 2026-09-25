package org.telegram.ui;

import android.view.MotionEvent;
import org.telegram.messenger.video.VideoFramesRewinder;
import org.telegram.messenger.video.VideoPlayerRewinder;
public final class ct0 extends VideoPlayerRewinder {
    public final PhotoViewer f32794a;

    public ct0(PhotoViewer photoViewer, VideoFramesRewinder videoFramesRewinder) {
        super(videoFramesRewinder);
        this.f32794a = photoViewer;
    }

    @Override
    public final void onRewindCanceled() {
        MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
        PhotoViewer photoViewer = this.f32794a;
        PhotoViewer.k(photoViewer, obtain);
        photoViewer.f31412z1.f(false);
        org.telegram.ui.Components.og0.f27047p0.Q.f(false);
    }

    @Override
    public final void onRewindStart(boolean z10) {
        PhotoViewer photoViewer = this.f32794a;
        photoViewer.f31412z1.e(false);
        photoViewer.f31412z1.d(!z10);
        photoViewer.f31412z1.f(true);
        photoViewer.f31224e0.invalidate();
        org.telegram.ui.Components.og0.v(z10);
    }

    @Override
    public final void updateRewindProgressUi(long j3, float f7, boolean z10) {
        PhotoViewer photoViewer = this.f32794a;
        photoViewer.f31412z1.g(Math.abs(j3));
        if (z10) {
            photoViewer.f31330q3.h(f7, false);
            photoViewer.f31339r3.invalidate();
        }
        org.telegram.ui.Components.og0 og0Var = org.telegram.ui.Components.og0.f27047p0;
        og0Var.Q.g(0L);
        if (z10) {
            og0Var.Z = f7;
            ai.n4 n4Var = og0Var.f27051b0;
            if (n4Var != null) {
                n4Var.invalidate();
            }
            org.telegram.ui.Components.ng0 ng0Var = og0Var.h;
            if (ng0Var != null) {
                ng0Var.invalidate();
            }
        }
    }
}
