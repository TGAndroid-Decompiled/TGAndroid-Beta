package org.telegram.ui.Cells;

import android.view.MotionEvent;
import org.telegram.messenger.video.OldVideoPlayerRewinder;
import org.telegram.ui.Components.x51;
import org.telegram.ui.PhotoViewer;
public final class k1 extends OldVideoPlayerRewinder {
    public final int f30911a;
    public final Object f30912b;

    public k1(Object obj, int i7) {
        this.f30911a = i7;
        this.f30912b = obj;
    }

    @Override
    public final void onRewindCanceled() {
        wi.h hVar;
        switch (this.f30911a) {
            case 0:
                r1 r1Var = (r1) this.f30912b;
                r1Var.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                r1Var.Ob.f(false);
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f30912b;
                PhotoViewer.c(photoViewer, MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                photoViewer.A1.f(false);
                wi.n nVar = photoViewer.P8;
                if (nVar != null && (hVar = nVar.f59990e) != null) {
                    hVar.F.f(false);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onRewindStart(boolean z10) {
        wi.h hVar;
        switch (this.f30911a) {
            case 0:
                r1 r1Var = (r1) this.f30912b;
                x51 x51Var = r1Var.Ob;
                x51Var.f41919n = new hi.w4(this, 27);
                x51Var.e(false);
                r1Var.Ob.d(!z10);
                r1Var.Ob.f(true);
                r1Var.invalidate();
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f30912b;
                photoViewer.A1.e(false);
                boolean z11 = !z10;
                photoViewer.A1.d(z11);
                photoViewer.A1.f(true);
                photoViewer.f43208f0.invalidate();
                wi.n nVar = photoViewer.P8;
                if (nVar != null && (hVar = nVar.f59990e) != null) {
                    x51 x51Var2 = hVar.F;
                    x51Var2.e(false);
                    x51Var2.d(z11);
                    x51Var2.f(true);
                    fi.u2 u2Var = hVar.f59958o;
                    if (u2Var != null) {
                        u2Var.invalidate();
                    }
                    wi.d dVar = hVar.f59956m;
                    if (dVar != null) {
                        dVar.invalidate();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public final void updateRewindProgressUi(long j3, float f10, boolean z10) {
        wi.h hVar;
        switch (this.f30911a) {
            case 0:
                r1 r1Var = (r1) this.f30912b;
                r1Var.Ob.g(Math.abs(j3));
                if (z10) {
                    r1Var.Q5.f23925b0 = f10;
                    r1Var.U3();
                    return;
                }
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f30912b;
                photoViewer.A1.g(Math.abs(j3));
                if (z10) {
                    photoViewer.f43304q3.h(false, f10);
                    photoViewer.f43314r3.invalidate();
                }
                wi.n nVar = photoViewer.P8;
                if (nVar != null && (hVar = nVar.f59990e) != null) {
                    hVar.F.g(0L);
                    if (z10) {
                        hVar.I = f10;
                        fi.u2 u2Var = hVar.f59958o;
                        if (u2Var != null) {
                            u2Var.invalidate();
                        }
                        wi.d dVar = hVar.f59956m;
                        if (dVar != null) {
                            dVar.invalidate();
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
