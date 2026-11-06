package org.telegram.ui.Cells;

import android.view.MotionEvent;
import org.telegram.messenger.video.OldVideoPlayerRewinder;
import org.telegram.ui.Components.j51;
import org.telegram.ui.PhotoViewer;
public final class j1 extends OldVideoPlayerRewinder {
    public final int f29345a;
    public final Object f29346b;

    public j1(Object obj, int i7) {
        this.f29345a = i7;
        this.f29346b = obj;
    }

    @Override
    public final void onRewindCanceled() {
        ti.i iVar;
        switch (this.f29345a) {
            case 0:
                q1 q1Var = (q1) this.f29346b;
                q1Var.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                q1Var.Nb.f(false);
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f29346b;
                PhotoViewer.c(photoViewer, MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                photoViewer.f41568z1.f(false);
                ti.o oVar = photoViewer.O8;
                if (oVar != null && (iVar = oVar.f56033e) != null) {
                    iVar.F.f(false);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onRewindStart(boolean z9) {
        ti.i iVar;
        switch (this.f29345a) {
            case 0:
                q1 q1Var = (q1) this.f29346b;
                j51 j51Var = q1Var.Nb;
                j51Var.f34892n = new h9.f1(this, 26);
                j51Var.e(false);
                q1Var.Nb.d(!z9);
                q1Var.Nb.f(true);
                q1Var.invalidate();
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f29346b;
                photoViewer.f41568z1.e(false);
                boolean z10 = !z9;
                photoViewer.f41568z1.d(z10);
                photoViewer.f41568z1.f(true);
                photoViewer.f41380e0.invalidate();
                ti.o oVar = photoViewer.O8;
                if (oVar != null && (iVar = oVar.f56033e) != null) {
                    j51 j51Var2 = iVar.F;
                    j51Var2.e(false);
                    j51Var2.d(z10);
                    j51Var2.f(true);
                    di.b3 b3Var = iVar.f56001o;
                    if (b3Var != null) {
                        b3Var.invalidate();
                    }
                    ti.e eVar = iVar.f55999m;
                    if (eVar != null) {
                        eVar.invalidate();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public final void updateRewindProgressUi(long j3, float f10, boolean z9) {
        ti.i iVar;
        switch (this.f29345a) {
            case 0:
                q1 q1Var = (q1) this.f29346b;
                q1Var.Nb.g(Math.abs(j3));
                if (z9) {
                    q1Var.P5.f23204b0 = f10;
                    q1Var.R3();
                    return;
                }
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f29346b;
                photoViewer.f41568z1.g(Math.abs(j3));
                if (z9) {
                    photoViewer.f41477p3.h(false, f10);
                    photoViewer.f41486q3.invalidate();
                }
                ti.o oVar = photoViewer.O8;
                if (oVar != null && (iVar = oVar.f56033e) != null) {
                    iVar.F.g(0L);
                    if (z9) {
                        iVar.I = f10;
                        di.b3 b3Var = iVar.f56001o;
                        if (b3Var != null) {
                            b3Var.invalidate();
                        }
                        ti.e eVar = iVar.f55999m;
                        if (eVar != null) {
                            eVar.invalidate();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
