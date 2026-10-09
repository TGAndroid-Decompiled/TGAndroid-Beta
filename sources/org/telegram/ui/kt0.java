package org.telegram.ui;

import android.view.MotionEvent;
import org.telegram.messenger.video.VideoFramesRewinder;
import org.telegram.messenger.video.VideoPlayerRewinder;
public final class kt0 extends VideoPlayerRewinder {
    public final PhotoViewer f39347a;

    public kt0(PhotoViewer photoViewer, VideoFramesRewinder videoFramesRewinder) {
        super(videoFramesRewinder);
        this.f39347a = photoViewer;
    }

    @Override
    public final void onRewindCanceled() {
        MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
        PhotoViewer photoViewer = this.f39347a;
        PhotoViewer.k(photoViewer, obtain);
        photoViewer.f34092z1.f(false);
        org.telegram.ui.Components.gh0.f26700p0.Q.f(false);
    }

    @Override
    public final void onRewindStart(boolean z10) {
        PhotoViewer photoViewer = this.f39347a;
        photoViewer.f34092z1.e(false);
        photoViewer.f34092z1.d(!z10);
        photoViewer.f34092z1.f(true);
        photoViewer.f33904e0.invalidate();
        org.telegram.ui.Components.gh0.v(z10);
    }

    @Override
    public final void updateRewindProgressUi(long j3, float f7, boolean z10) {
        PhotoViewer photoViewer = this.f39347a;
        photoViewer.f34092z1.g(Math.abs(j3));
        if (z10) {
            photoViewer.f34010q3.h(f7, false);
            photoViewer.f34019r3.invalidate();
        }
        org.telegram.ui.Components.gh0 gh0Var = org.telegram.ui.Components.gh0.f26700p0;
        gh0Var.Q.g(0L);
        if (z10) {
            gh0Var.Z = f7;
            ai.o4 o4Var = gh0Var.f26704b0;
            if (o4Var != null) {
                o4Var.invalidate();
            }
            org.telegram.ui.Components.fh0 fh0Var = gh0Var.h;
            if (fh0Var != null) {
                fh0Var.invalidate();
            }
        }
    }
}
