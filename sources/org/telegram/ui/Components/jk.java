package org.telegram.ui.Components;

import android.view.MotionEvent;
import android.view.View;
public final class jk implements org.telegram.ui.ActionBar.m0, org.telegram.messenger.bb, org.telegram.messenger.db, org.telegram.ui.ActionBar.r1, jg.b {
    public final vk f34950a;

    public jk(vk vkVar) {
        this.f34950a = vkVar;
    }

    @Override
    public void a() {
        vk vkVar = this.f34950a;
        vkVar.f39020e0 = false;
        vkVar.j0();
    }

    @Override
    public boolean b(MotionEvent motionEvent, org.telegram.messenger.ia iaVar) {
        MotionEvent motionEvent2;
        vk vkVar = this.f34950a;
        if (vkVar.G != 0.0f) {
            motionEvent = MotionEvent.obtain(motionEvent);
            motionEvent.offsetLocation(0.0f, (-vkVar.G) / 2.0f);
            motionEvent2 = motionEvent;
        } else {
            motionEvent2 = null;
        }
        boolean booleanValue = iaVar.a(motionEvent).booleanValue();
        if (motionEvent2 != null) {
            motionEvent2.recycle();
        }
        return booleanValue;
    }

    @Override
    public void c(int i7) {
        View childAt;
        v4.d1 T;
        int L;
        vk vkVar = this.f34950a;
        bi.q1 q1Var = vkVar.L;
        if (i7 == 1 && !vkVar.H && q1Var.getChildCount() > 0 && (childAt = q1Var.getChildAt(0)) != null) {
            View F = q1Var.F(childAt);
            if (F == null) {
                T = null;
            } else {
                T = q1Var.T(F);
            }
            if (T != null && T.b() == 0) {
                if (vkVar.f39030o0 == 0) {
                    L = 0;
                } else {
                    L = org.telegram.messenger.g0.L(66.0f);
                }
                int top = childAt.getTop();
                if (top < (-L)) {
                    fi.y4 d = vkVar.D.d();
                    vkVar.F = ((nb.a) org.telegram.messenger.t0.k()).newCameraUpdateLatLngZoom((org.telegram.messenger.cb) d.f13162b, d.f13163c);
                    q1Var.w0(0, top + L, null);
                }
            }
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        vk.Q(this.f34950a);
    }

    @Override
    public void i(int i7) {
        org.telegram.messenger.fa faVar = this.f34950a.D;
        if (faVar != null) {
            if (i7 == 2) {
                faVar.j(0);
            } else if (i7 == 3) {
                faVar.j(1);
            } else if (i7 == 4) {
                faVar.j(2);
            }
        }
    }
}
