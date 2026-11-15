package org.telegram.ui;

import android.view.MotionEvent;
import org.telegram.messenger.video.VideoFramesRewinder;
import org.telegram.messenger.video.VideoPlayerRewinder;
public final class fp0 extends VideoPlayerRewinder {
    public final PhotoViewer f47166a;

    public fp0(PhotoViewer photoViewer, VideoFramesRewinder videoFramesRewinder) {
        super(videoFramesRewinder);
        this.f47166a = photoViewer;
    }

    @Override
    public final void onRewindCanceled() {
        wi.h hVar;
        MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
        PhotoViewer photoViewer = this.f47166a;
        PhotoViewer.c(photoViewer, obtain);
        photoViewer.A1.f(false);
        wi.n nVar = photoViewer.P8;
        if (nVar != null && (hVar = nVar.f59425e) != null) {
            hVar.F.f(false);
        }
    }

    @Override
    public final void onRewindStart(boolean z10) {
        wi.h hVar;
        PhotoViewer photoViewer = this.f47166a;
        photoViewer.A1.e(false);
        boolean z11 = !z10;
        photoViewer.A1.d(z11);
        photoViewer.A1.f(true);
        photoViewer.f42763f0.invalidate();
        wi.n nVar = photoViewer.P8;
        if (nVar != null && (hVar = nVar.f59425e) != null) {
            org.telegram.ui.Components.m51 m51Var = hVar.F;
            m51Var.e(false);
            m51Var.d(z11);
            m51Var.f(true);
            fi.w2 w2Var = hVar.f59393o;
            if (w2Var != null) {
                w2Var.invalidate();
            }
            wi.d dVar = hVar.f59391m;
            if (dVar != null) {
                dVar.invalidate();
            }
        }
    }

    @Override
    public final void updateRewindProgressUi(long j3, float f10, boolean z10) {
        wi.h hVar;
        PhotoViewer photoViewer = this.f47166a;
        photoViewer.A1.g(Math.abs(j3));
        if (z10) {
            photoViewer.f42859q3.h(false, f10);
            photoViewer.f42869r3.invalidate();
        }
        wi.n nVar = photoViewer.P8;
        if (nVar != null && (hVar = nVar.f59425e) != null) {
            hVar.F.g(0L);
            if (z10) {
                hVar.I = f10;
                fi.w2 w2Var = hVar.f59393o;
                if (w2Var != null) {
                    w2Var.invalidate();
                }
                wi.d dVar = hVar.f59391m;
                if (dVar != null) {
                    dVar.invalidate();
                }
            }
        }
    }
}
