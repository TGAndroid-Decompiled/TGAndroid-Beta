package org.telegram.ui.Cells;

import android.view.MotionEvent;
import org.telegram.messenger.video.OldVideoPlayerRewinder;
import org.telegram.ui.Components.a61;
import org.telegram.ui.PhotoViewer;
public final class k1 extends OldVideoPlayerRewinder {
    public final int f30939a;
    public final Object f30940b;

    public k1(Object obj, int i7) {
        this.f30939a = i7;
        this.f30940b = obj;
    }

    @Override
    public final void onRewindCanceled() {
        wi.h hVar;
        switch (this.f30939a) {
            case 0:
                r1 r1Var = (r1) this.f30940b;
                r1Var.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                r1Var.Ob.f(false);
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f30940b;
                PhotoViewer.c(photoViewer, MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                photoViewer.A1.f(false);
                wi.n nVar = photoViewer.P8;
                if (nVar != null && (hVar = nVar.f60031e) != null) {
                    hVar.F.f(false);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onRewindStart(boolean z10) {
        wi.h hVar;
        switch (this.f30939a) {
            case 0:
                r1 r1Var = (r1) this.f30940b;
                a61 a61Var = r1Var.Ob;
                a61Var.f33345n = new hi.w4(this, 27);
                a61Var.e(false);
                r1Var.Ob.d(!z10);
                r1Var.Ob.f(true);
                r1Var.invalidate();
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f30940b;
                photoViewer.A1.e(false);
                boolean z11 = !z10;
                photoViewer.A1.d(z11);
                photoViewer.A1.f(true);
                photoViewer.f43249f0.invalidate();
                wi.n nVar = photoViewer.P8;
                if (nVar != null && (hVar = nVar.f60031e) != null) {
                    a61 a61Var2 = hVar.F;
                    a61Var2.e(false);
                    a61Var2.d(z11);
                    a61Var2.f(true);
                    fi.u2 u2Var = hVar.f59999o;
                    if (u2Var != null) {
                        u2Var.invalidate();
                    }
                    wi.d dVar = hVar.f59997m;
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
        switch (this.f30939a) {
            case 0:
                r1 r1Var = (r1) this.f30940b;
                r1Var.Ob.g(Math.abs(j3));
                if (z10) {
                    r1Var.Q5.f23953b0 = f10;
                    r1Var.U3();
                    return;
                }
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f30940b;
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
