package org.telegram.ui.Components;

import android.view.MotionEvent;
import android.view.View;
public final class zk implements org.telegram.ui.ActionBar.l0, org.telegram.messenger.za, org.telegram.messenger.bb, org.telegram.ui.ActionBar.q1, jg.b {
    public final kl f42916a;

    public zk(kl klVar) {
        this.f42916a = klVar;
    }

    @Override
    public void a() {
        kl klVar = this.f42916a;
        klVar.f36777f0 = false;
        klVar.j0();
    }

    @Override
    public void b(int i7) {
        View childAt;
        v4.f1 T;
        int L;
        kl klVar = this.f42916a;
        di.b1 b1Var = klVar.M;
        if (i7 == 1 && !klVar.I && b1Var.getChildCount() > 0 && (childAt = b1Var.getChildAt(0)) != null) {
            View F = b1Var.F(childAt);
            if (F == null) {
                T = null;
            } else {
                T = b1Var.T(F);
            }
            if (T != null && T.b() == 0) {
                if (klVar.f36787p0 == 0) {
                    L = 0;
                } else {
                    L = org.telegram.messenger.g0.L(66.0f);
                }
                int top = childAt.getTop();
                if (top < (-L)) {
                    hi.g5 d = klVar.E.d();
                    klVar.G = ((pb.b) org.telegram.messenger.t0.k()).newCameraUpdateLatLngZoom((org.telegram.messenger.ab) d.f14540b, d.f14541c);
                    b1Var.w0(0, top + L, null);
                }
            }
        }
    }

    @Override
    public boolean c(MotionEvent motionEvent, org.telegram.messenger.ga gaVar) {
        MotionEvent motionEvent2;
        kl klVar = this.f42916a;
        if (klVar.H != 0.0f) {
            motionEvent = MotionEvent.obtain(motionEvent);
            motionEvent.offsetLocation(0.0f, (-klVar.H) / 2.0f);
            motionEvent2 = motionEvent;
        } else {
            motionEvent2 = null;
        }
        boolean booleanValue = gaVar.a(motionEvent).booleanValue();
        if (motionEvent2 != null) {
            motionEvent2.recycle();
        }
        return booleanValue;
    }

    @Override
    public void h(int i7) {
        org.telegram.messenger.da daVar = this.f42916a.E;
        if (daVar != null) {
            if (i7 == 2) {
                daVar.j(0);
            } else if (i7 == 3) {
                daVar.j(1);
            } else if (i7 == 4) {
                daVar.j(2);
            }
        }
    }

    @Override
    public void i(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        kl.R(this.f42916a);
    }
}
