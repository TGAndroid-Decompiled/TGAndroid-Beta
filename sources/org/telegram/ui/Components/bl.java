package org.telegram.ui.Components;

import android.view.MotionEvent;
import android.view.View;
public final class bl implements org.telegram.ui.ActionBar.l0, org.telegram.messenger.ab, org.telegram.messenger.cb, org.telegram.ui.ActionBar.q1, jg.b {
    public final ml f33852a;

    public bl(ml mlVar) {
        this.f33852a = mlVar;
    }

    @Override
    public void a() {
        ml mlVar = this.f33852a;
        mlVar.f37552f0 = false;
        mlVar.j0();
    }

    @Override
    public boolean b(MotionEvent motionEvent, org.telegram.messenger.ha haVar) {
        MotionEvent motionEvent2;
        ml mlVar = this.f33852a;
        if (mlVar.H != 0.0f) {
            motionEvent = MotionEvent.obtain(motionEvent);
            motionEvent.offsetLocation(0.0f, (-mlVar.H) / 2.0f);
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
    public void c(int i7) {
        View childAt;
        v4.f1 T;
        int L;
        ml mlVar = this.f33852a;
        di.b1 b1Var = mlVar.M;
        if (i7 == 1 && !mlVar.I && b1Var.getChildCount() > 0 && (childAt = b1Var.getChildAt(0)) != null) {
            View F = b1Var.F(childAt);
            if (F == null) {
                T = null;
            } else {
                T = b1Var.T(F);
            }
            if (T != null && T.b() == 0) {
                if (mlVar.f37562p0 == 0) {
                    L = 0;
                } else {
                    L = org.telegram.messenger.g0.L(66.0f);
                }
                int top = childAt.getTop();
                if (top < (-L)) {
                    hi.u4 d = mlVar.E.d();
                    mlVar.G = ((pb.b) org.telegram.messenger.t0.k()).newCameraUpdateLatLngZoom((org.telegram.messenger.bb) d.f15539b, d.f15540c);
                    b1Var.w0(0, top + L, null);
                }
            }
        }
    }

    @Override
    public void g(int i7) {
        org.telegram.messenger.ea eaVar = this.f33852a.E;
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
        ml.R(this.f33852a);
    }
}
