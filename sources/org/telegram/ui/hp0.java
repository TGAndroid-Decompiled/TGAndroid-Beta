package org.telegram.ui;

import android.view.MotionEvent;
import org.telegram.messenger.video.VideoFramesRewinder;
import org.telegram.messenger.video.VideoPlayerRewinder;
public final class hp0 extends VideoPlayerRewinder {
    public final PhotoViewer f48607a;

    public hp0(PhotoViewer photoViewer, VideoFramesRewinder videoFramesRewinder) {
        super(videoFramesRewinder);
        this.f48607a = photoViewer;
    }

    @Override
    public final void onRewindCanceled() {
        wi.h hVar;
        MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
        PhotoViewer photoViewer = this.f48607a;
        PhotoViewer.c(photoViewer, obtain);
        photoViewer.A1.f(false);
        wi.n nVar = photoViewer.V8;
        if (nVar != null && (hVar = nVar.f60118e) != null) {
            hVar.F.f(false);
        }
    }

    @Override
    public final void onRewindStart(boolean z10) {
        wi.h hVar;
        PhotoViewer photoViewer = this.f48607a;
        photoViewer.A1.e(false);
        boolean z11 = !z10;
        photoViewer.A1.d(z11);
        photoViewer.A1.f(true);
        photoViewer.f43334f0.invalidate();
        wi.n nVar = photoViewer.V8;
        if (nVar != null && (hVar = nVar.f60118e) != null) {
            org.telegram.ui.Components.z51 z51Var = hVar.F;
            z51Var.e(false);
            z51Var.d(z11);
            z51Var.f(true);
            fi.u2 u2Var = hVar.f60086o;
            if (u2Var != null) {
                u2Var.invalidate();
            }
            wi.d dVar = hVar.f60084m;
            if (dVar != null) {
                dVar.invalidate();
            }
        }
    }

    @Override
    public final void updateRewindProgressUi(long j3, float f10, boolean z10) {
        wi.h hVar;
        PhotoViewer photoViewer = this.f48607a;
        photoViewer.A1.g(Math.abs(j3));
        if (z10) {
            photoViewer.f43430q3.h(false, f10);
            photoViewer.f43440r3.invalidate();
        }
        wi.n nVar = photoViewer.V8;
        if (nVar != null && (hVar = nVar.f60118e) != null) {
            hVar.F.g(0L);
            if (z10) {
                hVar.I = f10;
                fi.u2 u2Var = hVar.f60086o;
                if (u2Var != null) {
                    u2Var.invalidate();
                }
                wi.d dVar = hVar.f60084m;
                if (dVar != null) {
                    dVar.invalidate();
                }
            }
        }
    }
}
