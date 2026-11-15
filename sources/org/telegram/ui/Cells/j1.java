package org.telegram.ui.Cells;

import android.view.MotionEvent;
import org.telegram.messenger.ou;
import org.telegram.messenger.video.OldVideoPlayerRewinder;
import org.telegram.ui.Components.m51;
import org.telegram.ui.PhotoViewer;
public final class j1 extends OldVideoPlayerRewinder {
    public final int f30477a;
    public final Object f30478b;

    public j1(Object obj, int i7) {
        this.f30477a = i7;
        this.f30478b = obj;
    }

    @Override
    public final void onRewindCanceled() {
        wi.h hVar;
        switch (this.f30477a) {
            case 0:
                q1 q1Var = (q1) this.f30478b;
                q1Var.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                q1Var.Ob.f(false);
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f30478b;
                PhotoViewer.c(photoViewer, MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                photoViewer.A1.f(false);
                wi.n nVar = photoViewer.P8;
                if (nVar != null && (hVar = nVar.f59425e) != null) {
                    hVar.F.f(false);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onRewindStart(boolean z10) {
        wi.h hVar;
        switch (this.f30477a) {
            case 0:
                q1 q1Var = (q1) this.f30478b;
                m51 m51Var = q1Var.Ob;
                m51Var.f37073n = new ou(this, 2);
                m51Var.e(false);
                q1Var.Ob.d(!z10);
                q1Var.Ob.f(true);
                q1Var.invalidate();
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f30478b;
                photoViewer.A1.e(false);
                boolean z11 = !z10;
                photoViewer.A1.d(z11);
                photoViewer.A1.f(true);
                photoViewer.f42763f0.invalidate();
                wi.n nVar = photoViewer.P8;
                if (nVar != null && (hVar = nVar.f59425e) != null) {
                    m51 m51Var2 = hVar.F;
                    m51Var2.e(false);
                    m51Var2.d(z11);
                    m51Var2.f(true);
                    fi.w2 w2Var = hVar.f59393o;
                    if (w2Var != null) {
                        w2Var.invalidate();
                    }
                    wi.d dVar = hVar.f59391m;
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
        switch (this.f30477a) {
            case 0:
                q1 q1Var = (q1) this.f30478b;
                q1Var.Ob.g(Math.abs(j3));
                if (z10) {
                    q1Var.Q5.f23777b0 = f10;
                    q1Var.T3();
                    return;
                }
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f30478b;
                photoViewer.A1.g(Math.abs(j3));
                if (z10) {
                    photoViewer.f42859q3.h(false, f10);
                    photoViewer.f42869r3.invalidate();
                }
                wi.n nVar = photoViewer.P8;
                if (nVar != null && (hVar = nVar.f59425e) != null) {
                    hVar.F.g(0L);
                    if (z10) {
                        hVar.I = f10;
                        fi.w2 w2Var = hVar.f59393o;
                        if (w2Var != null) {
                            w2Var.invalidate();
                        }
                        wi.d dVar = hVar.f59391m;
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
