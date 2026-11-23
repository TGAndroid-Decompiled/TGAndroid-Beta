package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.util.StateSet;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class hb0 implements Runnable {
    public final int f35814a;
    public final Object f35815b;

    public hb0(Object obj, int i7) {
        this.f35814a = i7;
        this.f35815b = obj;
    }

    @Override
    public final void run() {
        float f10;
        i61 i61Var;
        switch (this.f35814a) {
            case 0:
                ((hi.u) this.f35815b).invalidateSelf();
                return;
            case 1:
                ((j00) this.f35815b).invalidateSelf();
                return;
            case 2:
                ((cc0) this.f35815b).d();
                return;
            case 3:
                kc0 kc0Var = (kc0) this.f35815b;
                kc0Var.getClass();
                try {
                    kc0Var.d.N.performHapticFeedback(3, 2);
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 4:
                ((yc0) this.f35815b).f42382o1.start();
                return;
            case 5:
                ez ezVar = ((be0) this.f35815b).f33814c.m0;
                if (ezVar != null) {
                    ezVar.c(false, true, false);
                    return;
                }
                return;
            case 6:
                de0 de0Var = (de0) this.f35815b;
                de0Var.f34446r = false;
                de0Var.invalidate();
                return;
            case 7:
                ((fe0) this.f35815b).h = null;
                return;
            case 8:
                fe0 fe0Var = (fe0) ((ji.k) this.f35815b).f17943c;
                fe0Var.d.q0(fe0Var.f35188e, false);
                return;
            case 9:
                org.telegram.ui.eq0 eq0Var = (org.telegram.ui.eq0) this.f35815b;
                if (eq0Var.f37134y) {
                    eq0Var.h("pollPosition();");
                }
                if (eq0Var.H) {
                    org.telegram.messenger.g0.h3(eq0Var.M, 500L);
                    return;
                }
                return;
            case 10:
                ((xe0) this.f35815b).f();
                return;
            case 11:
                try {
                    wg0 wg0Var = ((vg0) this.f35815b).f40775b;
                    if (wg0Var.getParent() instanceof ViewGroup) {
                        ((ViewGroup) wg0Var.getParent()).removeView(wg0Var);
                    }
                    wg0Var.R.run();
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 12:
                ((RLottieNative) this.f35815b).d();
                return;
            case 13:
                xi0 xi0Var = (xi0) this.f35815b;
                xi0Var.f42101y0 = null;
                xi0Var.j();
                wi0 wi0Var = xi0Var.f42075h0;
                if (wi0Var != null) {
                    wi0Var.z();
                    return;
                }
                return;
            case 14:
                ((ui0) this.f35815b).I.f40787a.setVisibility(4);
                return;
            case 15:
                ((ve) this.f35815b).a();
                return;
            case 16:
                zi0 zi0Var = (zi0) this.f35815b;
                i61 i61Var2 = zi0Var.f42832n;
                if (i61Var2 != null) {
                    boolean d02 = i61Var2.d0();
                    float S = ((float) zi0Var.f42832n.S()) / ((float) zi0Var.f42832n.U());
                    if (S < zi0Var.f42839s) {
                        zi0Var.f42832n.q0(f10 * ((float) i61Var.U()), false);
                    } else if (S > zi0Var.f42844w || (zi0Var.f42817d0 && !d02 && zi0Var.f42846x && zi0Var.f42832n.S() >= zi0Var.f42832n.U() - 50)) {
                        zi0Var.setPlaying(false);
                        d02 = false;
                    }
                    if (d02) {
                        org.telegram.messenger.g0.h3(zi0Var.f42848y, 16L);
                    }
                    if (zi0Var.f42817d0) {
                        zi0Var.i(true);
                    }
                }
                zi0Var.invalidate();
                return;
            case 17:
                ek0 ek0Var = (ek0) this.f35815b;
                ek0Var.U1 = null;
                ek0Var.T1 = null;
                org.telegram.ui.Cells.y yVar = ek0Var.C1;
                if (yVar != null) {
                    Drawable current = yVar.getCurrent();
                    if (current instanceof TransitionDrawable) {
                        ((TransitionDrawable) current).resetTransition();
                    }
                }
                org.telegram.ui.Cells.y yVar2 = ek0Var.C1;
                if (yVar2 != null && yVar2.isStateful()) {
                    ek0Var.C1.setState(StateSet.NOTHING);
                    return;
                }
                return;
            case 18:
                rk0 rk0Var = (rk0) this.f35815b;
                if (rk0Var.f39217f0 && rk0Var.k0() != rk0Var.f39221j0) {
                    rk0Var.q0("on screen, settled after start", true);
                    return;
                }
                return;
            case 19:
                sl0 sl0Var = (sl0) this.f35815b;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                int i7 = sl0Var.d;
                org.telegram.messenger.w7.G(i7).y(arrayList);
                org.telegram.messenger.w7.G(i7).P(arrayList2);
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    org.telegram.messenger.w7.G(i7);
                    if (org.telegram.messenger.w7.M(((org.telegram.messenger.gj) arrayList.get(i10)).f24177k, false, true).exists()) {
                        arrayList3.add((org.telegram.messenger.gj) arrayList.get(i10));
                    }
                }
                for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                    org.telegram.messenger.w7.G(i7);
                    if (!org.telegram.messenger.w7.M(((org.telegram.messenger.gj) arrayList2.get(i11)).f24177k, false, true).exists()) {
                        arrayList4.add((org.telegram.messenger.gj) arrayList2.get(i11));
                    }
                }
                org.telegram.messenger.g0.g3(new g(sl0Var, arrayList3, arrayList4, 23));
                return;
            case 20:
                ((ul0) this.f35815b).invalidateSelf();
                return;
            case 21:
                ((em0) this.f35815b).f34892f.setVisibility(8);
                return;
            case 22:
                ((org.telegram.ui.kw) this.f35815b).o();
                return;
            case 23:
                ((a70) this.f35815b).s();
                return;
            case 24:
                ((vm0) this.f35815b).setOverscrolling(false);
                return;
            case 25:
                ((an0) this.f35815b).getClass();
                return;
            case 26:
                org.telegram.ui.Cells.r1 r1Var = ((dn0) this.f35815b).f34509n;
                if (r1Var != null) {
                    r1Var.invalidate();
                    return;
                }
                return;
            case 27:
                en0 en0Var = (en0) this.f35815b;
                en0Var.f34916q = false;
                en0Var.f34903b.run();
                return;
            case 28:
                ((ho0) this.f35815b).f35899b.c1(1);
                return;
            default:
                ep0 ep0Var = (ep0) this.f35815b;
                hi.j1[] j1VarArr = ep0Var.f34933a;
                if (ep0Var.f34934b != 1) {
                    for (hi.j1 j1Var : j1VarArr) {
                        org.telegram.ui.ActionBar.m5 m5Var = (org.telegram.ui.ActionBar.m5) j1Var.f14753e;
                        m5Var.setAlpha(1.0f);
                        m5Var.setScaleX(1.0f);
                        m5Var.setScaleY(1.0f);
                        ((org.telegram.ui.ActionBar.m5) j1Var.f14754f).setAlpha(0.0f);
                    }
                    ep0Var.F = false;
                    org.telegram.messenger.g0.h3(ep0Var.H, 4000L);
                    return;
                }
                ep0Var.F = !ep0Var.F;
                for (hi.j1 j1Var2 : j1VarArr) {
                    org.telegram.ui.ActionBar.m5 m5Var2 = (org.telegram.ui.ActionBar.m5) j1Var2.f14753e;
                    org.telegram.ui.ActionBar.m5 m5Var3 = (org.telegram.ui.ActionBar.m5) j1Var2.f14754f;
                    m5Var2.setPivotX(0.0f);
                    m5Var3.setPivotX(0.0f);
                    if (ep0Var.F) {
                        m5Var2.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                        m5Var3.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                    } else {
                        m5Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                        m5Var3.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                    }
                }
                org.telegram.messenger.g0.h3(ep0Var.H, 4000L);
                return;
        }
    }
}
