package org.telegram.ui;

import android.view.MotionEvent;
import org.telegram.messenger.video.VideoFramesRewinder;
import org.telegram.messenger.video.VideoPlayerRewinder;
public final class ft0 extends VideoPlayerRewinder {
    public final PhotoViewer f36401a;

    public ft0(PhotoViewer photoViewer, VideoFramesRewinder videoFramesRewinder) {
        super(videoFramesRewinder);
        this.f36401a = photoViewer;
    }

    @Override
    public final void onRewindCanceled() {
        MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
        PhotoViewer photoViewer = this.f36401a;
        PhotoViewer.k(photoViewer, obtain);
        photoViewer.f34102z1.f(false);
        org.telegram.ui.Components.rg0.f30466p0.Q.f(false);
    }

    @Override
    public final void onRewindStart(boolean z10) {
        PhotoViewer photoViewer = this.f36401a;
        photoViewer.f34102z1.e(false);
        photoViewer.f34102z1.d(!z10);
        photoViewer.f34102z1.f(true);
        photoViewer.f33914e0.invalidate();
        org.telegram.ui.Components.rg0.v(z10);
    }

    @Override
    public final void updateRewindProgressUi(long j3, float f7, boolean z10) {
        PhotoViewer photoViewer = this.f36401a;
        photoViewer.f34102z1.g(Math.abs(j3));
        if (z10) {
            photoViewer.f34020q3.h(f7, false);
            photoViewer.f34029r3.invalidate();
        }
        org.telegram.ui.Components.rg0 rg0Var = org.telegram.ui.Components.rg0.f30466p0;
        rg0Var.Q.g(0L);
        if (z10) {
            rg0Var.Z = f7;
            ai.n4 n4Var = rg0Var.f30470b0;
            if (n4Var != null) {
                n4Var.invalidate();
            }
            org.telegram.ui.Components.qg0 qg0Var = rg0Var.h;
            if (qg0Var != null) {
                qg0Var.invalidate();
            }
        }
    }
}
