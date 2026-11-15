package org.telegram.ui.Components;

import android.view.MotionEvent;
import android.view.View;
public final class sk implements org.telegram.ui.ActionBar.l0, org.telegram.messenger.ab, org.telegram.messenger.cb, org.telegram.ui.ActionBar.q1, jg.b {
    public final dl f39332a;

    public sk(dl dlVar) {
        this.f39332a = dlVar;
    }

    @Override
    public void a() {
        dl dlVar = this.f39332a;
        dlVar.f33979f0 = false;
        dlVar.j0();
    }

    @Override
    public void b(int i7) {
        View childAt;
        v4.e1 T;
        int L;
        dl dlVar = this.f39332a;
        di.c1 c1Var = dlVar.M;
        if (i7 == 1 && !dlVar.I && c1Var.getChildCount() > 0 && (childAt = c1Var.getChildAt(0)) != null) {
            View F = c1Var.F(childAt);
            if (F == null) {
                T = null;
            } else {
                T = c1Var.T(F);
            }
            if (T != null && T.b() == 0) {
                if (dlVar.f33989p0 == 0) {
                    L = 0;
                } else {
                    L = org.telegram.messenger.g0.L(66.0f);
                }
                int top = childAt.getTop();
                if (top < (-L)) {
                    hi.w4 d = dlVar.E.d();
                    dlVar.G = ((pb.b) org.telegram.messenger.t0.k()).newCameraUpdateLatLngZoom((org.telegram.messenger.bb) d.f15288b, d.f15289c);
                    c1Var.w0(0, top + L, null);
                }
            }
        }
    }

    @Override
    public boolean c(MotionEvent motionEvent, org.telegram.messenger.ha haVar) {
        MotionEvent motionEvent2;
        dl dlVar = this.f39332a;
        if (dlVar.H != 0.0f) {
            motionEvent = MotionEvent.obtain(motionEvent);
            motionEvent.offsetLocation(0.0f, (-dlVar.H) / 2.0f);
            motionEvent2 = motionEvent;
        } else {
            motionEvent2 = null;
        }
        boolean booleanValue = haVar.a(motionEvent).booleanValue();
        if (motionEvent2 != null) {
            motionEvent2.recycle();
        }
        return booleanValue;
    }

    @Override
    public void g(int i7) {
        org.telegram.messenger.ea eaVar = this.f39332a.E;
        if (eaVar != null) {
            if (i7 == 2) {
                eaVar.j(0);
            } else if (i7 == 3) {
                eaVar.j(1);
            } else if (i7 == 4) {
                eaVar.j(2);
            }
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        dl.R(this.f39332a);
    }
}
