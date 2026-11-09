package org.telegram.ui;

import android.view.MotionEvent;
import org.telegram.messenger.video.VideoFramesRewinder;
import org.telegram.messenger.video.VideoPlayerRewinder;
public final class jp0 extends VideoPlayerRewinder {
    public final PhotoViewer f47061a;

    public jp0(PhotoViewer photoViewer, VideoFramesRewinder videoFramesRewinder) {
        super(videoFramesRewinder);
        this.f47061a = photoViewer;
    }

    @Override
    public final void onRewindCanceled() {
        ti.i iVar;
        MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
        PhotoViewer photoViewer = this.f47061a;
        PhotoViewer.c(photoViewer, obtain);
        photoViewer.f41579z1.f(false);
        ti.o oVar = photoViewer.O8;
        if (oVar != null && (iVar = oVar.f56138e) != null) {
            iVar.F.f(false);
        }
    }

    @Override
    public final void onRewindStart(boolean z9) {
        ti.i iVar;
        PhotoViewer photoViewer = this.f47061a;
        photoViewer.f41579z1.e(false);
        boolean z10 = !z9;
        photoViewer.f41579z1.d(z10);
        photoViewer.f41579z1.f(true);
        photoViewer.f41391e0.invalidate();
        ti.o oVar = photoViewer.O8;
        if (oVar != null && (iVar = oVar.f56138e) != null) {
            org.telegram.ui.Components.k51 k51Var = iVar.F;
            k51Var.e(false);
            k51Var.d(z10);
            k51Var.f(true);
            di.b3 b3Var = iVar.f56106o;
            if (b3Var != null) {
                b3Var.invalidate();
            }
            ti.e eVar = iVar.f56104m;
            if (eVar != null) {
                eVar.invalidate();
            }
        }
    }

    @Override
    public final void updateRewindProgressUi(long j3, float f10, boolean z9) {
        ti.i iVar;
        PhotoViewer photoViewer = this.f47061a;
        photoViewer.f41579z1.g(Math.abs(j3));
        if (z9) {
            photoViewer.f41488p3.h(false, f10);
            photoViewer.f41497q3.invalidate();
        }
        ti.o oVar = photoViewer.O8;
        if (oVar != null && (iVar = oVar.f56138e) != null) {
            iVar.F.g(0L);
            if (z9) {
                iVar.I = f10;
                di.b3 b3Var = iVar.f56106o;
                if (b3Var != null) {
                    b3Var.invalidate();
                }
                ti.e eVar = iVar.f56104m;
                if (eVar != null) {
                    eVar.invalidate();
                }
            }
        }
    }
}
