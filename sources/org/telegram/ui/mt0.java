package org.telegram.ui;

import android.view.MotionEvent;
import org.telegram.messenger.video.VideoFramesRewinder;
import org.telegram.messenger.video.VideoPlayerRewinder;
public final class mt0 extends VideoPlayerRewinder {
    public final PhotoViewer f35888a;

    public mt0(PhotoViewer photoViewer, VideoFramesRewinder videoFramesRewinder) {
        super(videoFramesRewinder);
        this.f35888a = photoViewer;
    }

    @Override
    public final void onRewindCanceled() {
        MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
        PhotoViewer photoViewer = this.f35888a;
        PhotoViewer.k(photoViewer, obtain);
        photoViewer.f31142z1.f(false);
        org.telegram.ui.Components.fg0.f23914p0.Q.f(false);
    }

    @Override
    public final void onRewindStart(boolean z10) {
        PhotoViewer photoViewer = this.f35888a;
        photoViewer.f31142z1.e(false);
        photoViewer.f31142z1.d(!z10);
        photoViewer.f31142z1.f(true);
        photoViewer.f30954e0.invalidate();
        org.telegram.ui.Components.fg0.v(z10);
    }

    @Override
    public final void updateRewindProgressUi(long j3, float f7, boolean z10) {
        PhotoViewer photoViewer = this.f35888a;
        photoViewer.f31142z1.g(Math.abs(j3));
        if (z10) {
            photoViewer.f31060q3.h(f7, false);
            photoViewer.f31069r3.invalidate();
        }
        org.telegram.ui.Components.fg0 fg0Var = org.telegram.ui.Components.fg0.f23914p0;
        fg0Var.Q.g(0L);
        if (z10) {
            fg0Var.Z = f7;
            ai.n4 n4Var = fg0Var.f23918b0;
            if (n4Var != null) {
                n4Var.invalidate();
            }
            org.telegram.ui.Components.eg0 eg0Var = fg0Var.h;
            if (eg0Var != null) {
                eg0Var.invalidate();
            }
        }
    }
}
