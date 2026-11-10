package org.telegram.ui;

import android.view.MotionEvent;
import org.telegram.messenger.video.VideoFramesRewinder;
import org.telegram.messenger.video.VideoPlayerRewinder;
public final class kp0 extends VideoPlayerRewinder {
    public final PhotoViewer f47395a;

    public kp0(PhotoViewer photoViewer, VideoFramesRewinder videoFramesRewinder) {
        super(videoFramesRewinder);
        this.f47395a = photoViewer;
    }

    @Override
    public final void onRewindCanceled() {
        ti.i iVar;
        MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
        PhotoViewer photoViewer = this.f47395a;
        PhotoViewer.c(photoViewer, obtain);
        photoViewer.f41570z1.f(false);
        ti.o oVar = photoViewer.O8;
        if (oVar != null && (iVar = oVar.f56137e) != null) {
            iVar.F.f(false);
        }
    }

    @Override
    public final void onRewindStart(boolean z9) {
        ti.i iVar;
        PhotoViewer photoViewer = this.f47395a;
        photoViewer.f41570z1.e(false);
        boolean z10 = !z9;
        photoViewer.f41570z1.d(z10);
        photoViewer.f41570z1.f(true);
        photoViewer.f41382e0.invalidate();
        ti.o oVar = photoViewer.O8;
        if (oVar != null && (iVar = oVar.f56137e) != null) {
            org.telegram.ui.Components.k51 k51Var = iVar.F;
            k51Var.e(false);
            k51Var.d(z10);
            k51Var.f(true);
            di.b3 b3Var = iVar.f56105o;
            if (b3Var != null) {
                b3Var.invalidate();
            }
            ti.e eVar = iVar.f56103m;
            if (eVar != null) {
                eVar.invalidate();
            }
        }
    }

    @Override
    public final void updateRewindProgressUi(long j3, float f10, boolean z9) {
        ti.i iVar;
        PhotoViewer photoViewer = this.f47395a;
        photoViewer.f41570z1.g(Math.abs(j3));
        if (z9) {
            photoViewer.f41479p3.h(false, f10);
            photoViewer.f41488q3.invalidate();
        }
        ti.o oVar = photoViewer.O8;
        if (oVar != null && (iVar = oVar.f56137e) != null) {
            iVar.F.g(0L);
            if (z9) {
                iVar.I = f10;
                di.b3 b3Var = iVar.f56105o;
                if (b3Var != null) {
                    b3Var.invalidate();
                }
                ti.e eVar = iVar.f56103m;
                if (eVar != null) {
                    eVar.invalidate();
                }
            }
        }
    }
}
