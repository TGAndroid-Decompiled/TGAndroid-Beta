package org.telegram.ui.Components;

import android.view.MotionEvent;
import android.view.View;
public final class jk implements org.telegram.ui.ActionBar.l0, org.telegram.messenger.ua, org.telegram.messenger.wa, org.telegram.ui.ActionBar.p1, kg.b {
    public final uk f35094a;

    public jk(uk ukVar) {
        this.f35094a = ukVar;
    }

    @Override
    public void a() {
        uk ukVar = this.f35094a;
        ukVar.f38785f0 = false;
        ukVar.j0();
    }

    @Override
    public boolean b(MotionEvent motionEvent, org.telegram.messenger.ca caVar) {
        MotionEvent motionEvent2;
        uk ukVar = this.f35094a;
        if (ukVar.H != 0.0f) {
            motionEvent = MotionEvent.obtain(motionEvent);
            motionEvent.offsetLocation(0.0f, (-ukVar.H) / 2.0f);
            motionEvent2 = motionEvent;
        } else {
            motionEvent2 = null;
        }
        boolean booleanValue = caVar.a(motionEvent).booleanValue();
        if (motionEvent2 != null) {
            motionEvent2.recycle();
        }
        return booleanValue;
    }

    @Override
    public void c(int i3) {
        View childAt;
        u4.d1 T;
        int L;
        uk ukVar = this.f35094a;
        ci.j1 j1Var = ukVar.M;
        if (i3 == 1 && !ukVar.I && j1Var.getChildCount() > 0 && (childAt = j1Var.getChildAt(0)) != null) {
            View F = j1Var.F(childAt);
            if (F == null) {
                T = null;
            } else {
                T = j1Var.T(F);
            }
            if (T != null && T.b() == 0) {
                if (ukVar.f38795p0 == 0) {
                    L = 0;
                } else {
                    L = org.telegram.messenger.g0.L(66.0f);
                }
                int top = childAt.getTop();
                if (top < (-L)) {
                    gi.w4 d = ukVar.E.d();
                    ukVar.G = ((mb.b) org.telegram.messenger.t0.k()).newCameraUpdateLatLngZoom((org.telegram.messenger.va) d.f13795b, d.f13796c);
                    j1Var.w0(0, top + L, null);
                }
            }
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        uk.Q(this.f35094a);
    }

    @Override
    public void i(int i3) {
        org.telegram.messenger.z9 z9Var = this.f35094a.E;
        if (z9Var != null) {
            if (i3 == 2) {
                z9Var.j(0);
            } else if (i3 == 3) {
                z9Var.j(1);
            } else if (i3 == 4) {
                z9Var.j(2);
            }
        }
    }
}
