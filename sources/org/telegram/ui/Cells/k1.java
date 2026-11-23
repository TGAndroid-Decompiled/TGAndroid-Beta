package org.telegram.ui.Cells;

import android.view.MotionEvent;
import org.telegram.messenger.video.OldVideoPlayerRewinder;
import org.telegram.ui.Components.z51;
import org.telegram.ui.PhotoViewer;
public final class k1 extends OldVideoPlayerRewinder {
    public final int f31000a;
    public final Object f31001b;

    public k1(Object obj, int i7) {
        this.f31000a = i7;
        this.f31001b = obj;
    }

    @Override
    public final void onRewindCanceled() {
        wi.h hVar;
        switch (this.f31000a) {
            case 0:
                r1 r1Var = (r1) this.f31001b;
                r1Var.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                r1Var.Ob.f(false);
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f31001b;
                PhotoViewer.c(photoViewer, MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                photoViewer.A1.f(false);
                wi.n nVar = photoViewer.V8;
                if (nVar != null && (hVar = nVar.f60118e) != null) {
                    hVar.F.f(false);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onRewindStart(boolean z10) {
        wi.h hVar;
        switch (this.f31000a) {
            case 0:
                r1 r1Var = (r1) this.f31001b;
                z51 z51Var = r1Var.Ob;
                z51Var.f42716n = new h6.o(this, 29);
                z51Var.e(false);
                r1Var.Ob.d(!z10);
                r1Var.Ob.f(true);
                r1Var.invalidate();
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f31001b;
                photoViewer.A1.e(false);
                boolean z11 = !z10;
                photoViewer.A1.d(z11);
                photoViewer.A1.f(true);
                photoViewer.f43334f0.invalidate();
                wi.n nVar = photoViewer.V8;
                if (nVar != null && (hVar = nVar.f60118e) != null) {
                    z51 z51Var2 = hVar.F;
                    z51Var2.e(false);
                    z51Var2.d(z11);
                    z51Var2.f(true);
                    fi.u2 u2Var = hVar.f60086o;
                    if (u2Var != null) {
                        u2Var.invalidate();
                    }
                    wi.d dVar = hVar.f60084m;
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
        switch (this.f31000a) {
            case 0:
                r1 r1Var = (r1) this.f31001b;
                r1Var.Ob.g(Math.abs(j3));
                if (z10) {
                    r1Var.Q5.f24033b0 = f10;
                    r1Var.U3();
                    return;
                }
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f31001b;
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
