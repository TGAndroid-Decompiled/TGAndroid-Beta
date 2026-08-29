package org.telegram.ui;

import android.view.MotionEvent;
import org.telegram.messenger.video.VideoFramesRewinder;
import org.telegram.messenger.video.VideoPlayerRewinder;
public final class gs0 extends VideoPlayerRewinder {
    public final PhotoViewer f38656a;

    public gs0(PhotoViewer photoViewer, VideoFramesRewinder videoFramesRewinder) {
        super(videoFramesRewinder);
        this.f38656a = photoViewer;
    }

    @Override
    public final void onRewindCanceled() {
        MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
        PhotoViewer photoViewer = this.f38656a;
        PhotoViewer.k(photoViewer, obtain);
        photoViewer.f35837v1.f(false);
        org.telegram.ui.Components.bg0.f27076l0.M.f(false);
    }

    @Override
    public final void onRewindStart(boolean z10) {
        PhotoViewer photoViewer = this.f38656a;
        photoViewer.f35837v1.e(false);
        photoViewer.f35837v1.d(!z10);
        photoViewer.f35837v1.f(true);
        photoViewer.f35647a0.invalidate();
        org.telegram.ui.Components.bg0.v(z10);
    }

    @Override
    public final void updateRewindProgressUi(long j10, float f9, boolean z10) {
        PhotoViewer photoViewer = this.f38656a;
        photoViewer.f35837v1.g(Math.abs(j10));
        if (z10) {
            photoViewer.f35757m3.h(f9, false);
            photoViewer.f35767n3.invalidate();
        }
        org.telegram.ui.Components.bg0 bg0Var = org.telegram.ui.Components.bg0.f27076l0;
        bg0Var.M.g(0L);
        if (z10) {
            bg0Var.V = f9;
            lh.z2 z2Var = bg0Var.X;
            if (z2Var != null) {
                z2Var.invalidate();
            }
            org.telegram.ui.Components.ag0 ag0Var = bg0Var.h;
            if (ag0Var != null) {
                ag0Var.invalidate();
            }
        }
    }
}
