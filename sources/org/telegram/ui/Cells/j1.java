package org.telegram.ui.Cells;

import android.view.MotionEvent;
import org.telegram.messenger.video.OldVideoPlayerRewinder;
import org.telegram.ui.Components.k51;
import org.telegram.ui.PhotoViewer;
public final class j1 extends OldVideoPlayerRewinder {
    public final int f29363a;
    public final Object f29364b;

    public j1(Object obj, int i7) {
        this.f29363a = i7;
        this.f29364b = obj;
    }

    @Override
    public final void onRewindCanceled() {
        ti.i iVar;
        switch (this.f29363a) {
            case 0:
                q1 q1Var = (q1) this.f29364b;
                q1Var.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                q1Var.Nb.f(false);
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f29364b;
                PhotoViewer.c(photoViewer, MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                photoViewer.f41570z1.f(false);
                ti.o oVar = photoViewer.O8;
                if (oVar != null && (iVar = oVar.f56137e) != null) {
                    iVar.F.f(false);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onRewindStart(boolean z9) {
        ti.i iVar;
        switch (this.f29363a) {
            case 0:
                q1 q1Var = (q1) this.f29364b;
                k51 k51Var = q1Var.Nb;
                k51Var.f35182n = new h9.f1(this, 26);
                k51Var.e(false);
                q1Var.Nb.d(!z9);
                q1Var.Nb.f(true);
                q1Var.invalidate();
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f29364b;
                photoViewer.f41570z1.e(false);
                boolean z10 = !z9;
                photoViewer.f41570z1.d(z10);
                photoViewer.f41570z1.f(true);
                photoViewer.f41382e0.invalidate();
                ti.o oVar = photoViewer.O8;
                if (oVar != null && (iVar = oVar.f56137e) != null) {
                    k51 k51Var2 = iVar.F;
                    k51Var2.e(false);
                    k51Var2.d(z10);
                    k51Var2.f(true);
                    di.b3 b3Var = iVar.f56105o;
                    if (b3Var != null) {
                        b3Var.invalidate();
                    }
                    ti.e eVar = iVar.f56103m;
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
        switch (this.f29363a) {
            case 0:
                q1 q1Var = (q1) this.f29364b;
                q1Var.Nb.g(Math.abs(j3));
                if (z9) {
                    q1Var.P5.f23226b0 = f10;
                    q1Var.S3();
                    return;
                }
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f29364b;
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
