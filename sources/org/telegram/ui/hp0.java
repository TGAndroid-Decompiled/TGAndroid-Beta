package org.telegram.ui;

import android.view.MotionEvent;
import org.telegram.messenger.video.VideoFramesRewinder;
import org.telegram.messenger.video.VideoPlayerRewinder;
public final class hp0 extends VideoPlayerRewinder {
    public final PhotoViewer f46475a;

    public hp0(PhotoViewer photoViewer, VideoFramesRewinder videoFramesRewinder) {
        super(videoFramesRewinder);
        this.f46475a = photoViewer;
    }

    @Override
    public final void onRewindCanceled() {
        ti.i iVar;
        MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
        PhotoViewer photoViewer = this.f46475a;
        PhotoViewer.c(photoViewer, obtain);
        photoViewer.f41569z1.f(false);
        ti.o oVar = photoViewer.O8;
        if (oVar != null && (iVar = oVar.f56034e) != null) {
            iVar.F.f(false);
        }
    }

    @Override
    public final void onRewindStart(boolean z9) {
        ti.i iVar;
        PhotoViewer photoViewer = this.f46475a;
        photoViewer.f41569z1.e(false);
        boolean z10 = !z9;
        photoViewer.f41569z1.d(z10);
        photoViewer.f41569z1.f(true);
        photoViewer.f41381e0.invalidate();
        ti.o oVar = photoViewer.O8;
        if (oVar != null && (iVar = oVar.f56034e) != null) {
            org.telegram.ui.Components.i51 i51Var = iVar.F;
            i51Var.e(false);
            i51Var.d(z10);
            i51Var.f(true);
            di.b3 b3Var = iVar.f56002o;
            if (b3Var != null) {
                b3Var.invalidate();
            }
            ti.e eVar = iVar.f56000m;
            if (eVar != null) {
                eVar.invalidate();
            }
        }
    }

    @Override
    public final void updateRewindProgressUi(long j3, float f10, boolean z9) {
        ti.i iVar;
        PhotoViewer photoViewer = this.f46475a;
        photoViewer.f41569z1.g(Math.abs(j3));
        if (z9) {
            photoViewer.f41478p3.h(false, f10);
            photoViewer.f41487q3.invalidate();
        }
        ti.o oVar = photoViewer.O8;
        if (oVar != null && (iVar = oVar.f56034e) != null) {
            iVar.F.g(0L);
            if (z9) {
                iVar.I = f10;
                di.b3 b3Var = iVar.f56002o;
                if (b3Var != null) {
                    b3Var.invalidate();
                }
                ti.e eVar = iVar.f56000m;
                if (eVar != null) {
                    eVar.invalidate();
                }
            }
        }
    }
}
