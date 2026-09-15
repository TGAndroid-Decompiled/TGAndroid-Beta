package org.telegram.ui;

import android.view.MotionEvent;
import org.telegram.messenger.video.VideoFramesRewinder;
import org.telegram.messenger.video.VideoPlayerRewinder;
public final class kt0 extends VideoPlayerRewinder {
    public final PhotoViewer f35264a;

    public kt0(PhotoViewer photoViewer, VideoFramesRewinder videoFramesRewinder) {
        super(videoFramesRewinder);
        this.f35264a = photoViewer;
    }

    @Override
    public final void onRewindCanceled() {
        MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
        PhotoViewer photoViewer = this.f35264a;
        PhotoViewer.k(photoViewer, obtain);
        photoViewer.f31124z1.f(false);
        org.telegram.ui.Components.eg0.f23638p0.Q.f(false);
    }

    @Override
    public final void onRewindStart(boolean z10) {
        PhotoViewer photoViewer = this.f35264a;
        photoViewer.f31124z1.e(false);
        photoViewer.f31124z1.d(!z10);
        photoViewer.f31124z1.f(true);
        photoViewer.f30936e0.invalidate();
        org.telegram.ui.Components.eg0.v(z10);
    }

    @Override
    public final void updateRewindProgressUi(long j3, float f7, boolean z10) {
        PhotoViewer photoViewer = this.f35264a;
        photoViewer.f31124z1.g(Math.abs(j3));
        if (z10) {
            photoViewer.f31042q3.h(f7, false);
            photoViewer.f31051r3.invalidate();
        }
        org.telegram.ui.Components.eg0 eg0Var = org.telegram.ui.Components.eg0.f23638p0;
        eg0Var.Q.g(0L);
        if (z10) {
            eg0Var.Z = f7;
            ai.n4 n4Var = eg0Var.f23642b0;
            if (n4Var != null) {
                n4Var.invalidate();
            }
            org.telegram.ui.Components.dg0 dg0Var = eg0Var.h;
            if (dg0Var != null) {
                dg0Var.invalidate();
            }
        }
    }
}
