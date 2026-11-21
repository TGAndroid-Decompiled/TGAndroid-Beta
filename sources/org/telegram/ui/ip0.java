package org.telegram.ui;

import android.view.MotionEvent;
import org.telegram.messenger.video.VideoFramesRewinder;
import org.telegram.messenger.video.VideoPlayerRewinder;
public final class ip0 extends VideoPlayerRewinder {
    public final PhotoViewer f48799a;

    public ip0(PhotoViewer photoViewer, VideoFramesRewinder videoFramesRewinder) {
        super(videoFramesRewinder);
        this.f48799a = photoViewer;
    }

    @Override
    public final void onRewindCanceled() {
        wi.h hVar;
        MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
        PhotoViewer photoViewer = this.f48799a;
        PhotoViewer.c(photoViewer, obtain);
        photoViewer.A1.f(false);
        wi.n nVar = photoViewer.P8;
        if (nVar != null && (hVar = nVar.f60031e) != null) {
            hVar.F.f(false);
        }
    }

    @Override
    public final void onRewindStart(boolean z10) {
        wi.h hVar;
        PhotoViewer photoViewer = this.f48799a;
        photoViewer.A1.e(false);
        boolean z11 = !z10;
        photoViewer.A1.d(z11);
        photoViewer.A1.f(true);
        photoViewer.f43249f0.invalidate();
        wi.n nVar = photoViewer.P8;
        if (nVar != null && (hVar = nVar.f60031e) != null) {
            org.telegram.ui.Components.a61 a61Var = hVar.F;
            a61Var.e(false);
            a61Var.d(z11);
            a61Var.f(true);
            fi.u2 u2Var = hVar.f59999o;
            if (u2Var != null) {
                u2Var.invalidate();
            }
            wi.d dVar = hVar.f59997m;
            if (dVar != null) {
                dVar.invalidate();
            }
        }
    }

    @Override
    public final void updateRewindProgressUi(long j3, float f10, boolean z10) {
        wi.h hVar;
        PhotoViewer photoViewer = this.f48799a;
        photoViewer.A1.g(Math.abs(j3));
        if (z10) {
            photoViewer.f43345q3.h(false, f10);
            photoViewer.f43355r3.invalidate();
        }
        wi.n nVar = photoViewer.P8;
        if (nVar != null && (hVar = nVar.f60031e) != null) {
            hVar.F.g(0L);
            if (z10) {
                hVar.I = f10;
                fi.u2 u2Var = hVar.f59999o;
                if (u2Var != null) {
                    u2Var.invalidate();
                }
                wi.d dVar = hVar.f59997m;
                if (dVar != null) {
                    dVar.invalidate();
                }
            }
        }
    }
}
