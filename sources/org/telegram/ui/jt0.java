package org.telegram.ui;

import android.view.MotionEvent;
import org.telegram.messenger.video.VideoFramesRewinder;
import org.telegram.messenger.video.VideoPlayerRewinder;
public final class jt0 extends VideoPlayerRewinder {
    public final PhotoViewer f37843a;

    public jt0(PhotoViewer photoViewer, VideoFramesRewinder videoFramesRewinder) {
        super(videoFramesRewinder);
        this.f37843a = photoViewer;
    }

    @Override
    public final void onRewindCanceled() {
        MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
        PhotoViewer photoViewer = this.f37843a;
        PhotoViewer.k(photoViewer, obtain);
        photoViewer.f33738z1.f(false);
        org.telegram.ui.Components.eg0.f25676p0.Q.f(false);
    }

    @Override
    public final void onRewindStart(boolean z10) {
        PhotoViewer photoViewer = this.f37843a;
        photoViewer.f33738z1.e(false);
        photoViewer.f33738z1.d(!z10);
        photoViewer.f33738z1.f(true);
        photoViewer.f33550e0.invalidate();
        org.telegram.ui.Components.eg0.v(z10);
    }

    @Override
    public final void updateRewindProgressUi(long j3, float f7, boolean z10) {
        PhotoViewer photoViewer = this.f37843a;
        photoViewer.f33738z1.g(Math.abs(j3));
        if (z10) {
            photoViewer.f33656q3.h(f7, false);
            photoViewer.f33665r3.invalidate();
        }
        org.telegram.ui.Components.eg0 eg0Var = org.telegram.ui.Components.eg0.f25676p0;
        eg0Var.Q.g(0L);
        if (z10) {
            eg0Var.Z = f7;
            bi.a4 a4Var = eg0Var.f25680b0;
            if (a4Var != null) {
                a4Var.invalidate();
            }
            org.telegram.ui.Components.dg0 dg0Var = eg0Var.h;
            if (dg0Var != null) {
                dg0Var.invalidate();
            }
        }
    }
}
