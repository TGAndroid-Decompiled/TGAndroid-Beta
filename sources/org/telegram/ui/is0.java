package org.telegram.ui;

import android.view.MotionEvent;
import org.telegram.messenger.video.VideoFramesRewinder;
import org.telegram.messenger.video.VideoPlayerRewinder;

public final class is0 extends VideoPlayerRewinder {

    public final PhotoViewer f39158a;

    public is0(PhotoViewer photoViewer, VideoFramesRewinder videoFramesRewinder) {
        super(videoFramesRewinder);
        this.f39158a = photoViewer;
    }

    @Override
    public final void onRewindCanceled() {
        MotionEvent motionEventObtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
        PhotoViewer photoViewer = this.f39158a;
        PhotoViewer.k(photoViewer, motionEventObtain);
        photoViewer.f35774v1.f(false);
        org.telegram.ui.Components.sf0.f32415l0.M.f(false);
    }

    @Override
    public final void onRewindStart(boolean z10) {
        PhotoViewer photoViewer = this.f39158a;
        photoViewer.f35774v1.e(false);
        photoViewer.f35774v1.d(!z10);
        photoViewer.f35774v1.f(true);
        photoViewer.f35583a0.invalidate();
        org.telegram.ui.Components.sf0.v(z10);
    }

    @Override
    public final void updateRewindProgressUi(long j10, float f10, boolean z10) {
        PhotoViewer photoViewer = this.f39158a;
        photoViewer.f35774v1.g(Math.abs(j10));
        if (z10) {
            photoViewer.f35694m3.h(f10, false);
            photoViewer.f35704n3.invalidate();
        }
        org.telegram.ui.Components.sf0 sf0Var = org.telegram.ui.Components.sf0.f32415l0;
        sf0Var.M.g(0L);
        if (z10) {
            sf0Var.V = f10;
            jh.a3 a3Var = sf0Var.X;
            if (a3Var != null) {
                a3Var.invalidate();
            }
            org.telegram.ui.Components.rf0 rf0Var = sf0Var.h;
            if (rf0Var != null) {
                rf0Var.invalidate();
            }
        }
    }
}
