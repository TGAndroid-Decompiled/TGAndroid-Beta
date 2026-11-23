package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.util.StateSet;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class eb0 implements Runnable {
    public final int f34683a;
    public final Object f34684b;

    public eb0(Object obj, int i7) {
        this.f34683a = i7;
        this.f34684b = obj;
    }

    @Override
    public final void run() {
        float f10;
        h61 h61Var;
        switch (this.f34683a) {
            case 0:
                ((hi.d0) this.f34684b).invalidateSelf();
                return;
            case 1:
                ((h00) this.f34684b).invalidateSelf();
                return;
            case 2:
                ((zb0) this.f34684b).d();
                return;
            case 3:
                ic0 ic0Var = (ic0) this.f34684b;
                ic0Var.getClass();
                try {
                    ic0Var.d.N.performHapticFeedback(3, 2);
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 4:
                ((wc0) this.f34684b).f41598o1.start();
                return;
            case 5:
                bz bzVar = ((ae0) this.f34684b).f33467c.m0;
                if (bzVar != null) {
                    bzVar.c(false, true, false);
                    return;
                }
                return;
            case 6:
                ce0 ce0Var = (ce0) this.f34684b;
                ce0Var.f34038r = false;
                ce0Var.invalidate();
                return;
            case 7:
                ((ee0) this.f34684b).h = null;
                return;
            case 8:
                ee0 ee0Var = (ee0) ((j6.k) this.f34684b).f17344c;
                ee0Var.d.q0(ee0Var.f34698e, false);
                return;
            case 9:
                org.telegram.ui.dq0 dq0Var = (org.telegram.ui.dq0) this.f34684b;
                if (dq0Var.f36730y) {
                    dq0Var.h("pollPosition();");
                }
                if (dq0Var.H) {
                    org.telegram.messenger.g0.h3(dq0Var.M, 500L);
                    return;
                }
                return;
            case 10:
                ((we0) this.f34684b).f();
                return;
            case 11:
                try {
                    vg0 vg0Var = ((ug0) this.f34684b).f40374b;
                    if (vg0Var.getParent() instanceof ViewGroup) {
                        ((ViewGroup) vg0Var.getParent()).removeView(vg0Var);
                    }
                    vg0Var.R.run();
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 12:
                ((RLottieNative) this.f34684b).d();
                return;
            case 13:
                xi0 xi0Var = (xi0) this.f34684b;
                xi0Var.f42053y0 = null;
                xi0Var.j();
                wi0 wi0Var = xi0Var.f42027h0;
                if (wi0Var != null) {
                    wi0Var.r();
                    return;
                }
                return;
            case 14:
                ((ui0) this.f34684b).I.f40708a.setVisibility(4);
                return;
            case 15:
                ((we) this.f34684b).a();
                return;
            case 16:
                zi0 zi0Var = (zi0) this.f34684b;
                h61 h61Var2 = zi0Var.f42890n;
                if (h61Var2 != null) {
                    boolean d02 = h61Var2.d0();
                    float S = ((float) zi0Var.f42890n.S()) / ((float) zi0Var.f42890n.U());
                    if (S < zi0Var.f42897s) {
                        zi0Var.f42890n.q0(f10 * ((float) h61Var.U()), false);
                    } else if (S > zi0Var.f42902w || (zi0Var.f42875d0 && !d02 && zi0Var.f42904x && zi0Var.f42890n.S() >= zi0Var.f42890n.U() - 50)) {
                        zi0Var.setPlaying(false);
                        d02 = false;
                    }
                    if (d02) {
                        org.telegram.messenger.g0.h3(zi0Var.f42906y, 16L);
                    }
                    if (zi0Var.f42875d0) {
                        zi0Var.i(true);
                    }
                }
                zi0Var.invalidate();
                return;
            case 17:
                ek0 ek0Var = (ek0) this.f34684b;
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
                rk0 rk0Var = (rk0) this.f34684b;
                if (rk0Var.f39333f0 && rk0Var.k0() != rk0Var.f39337j0) {
                    rk0Var.q0("on screen, settled after start", true);
                    return;
                }
                return;
            case 19:
                sl0 sl0Var = (sl0) this.f34684b;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                int i7 = sl0Var.d;
                org.telegram.messenger.w7.G(i7).y(arrayList);
                org.telegram.messenger.w7.G(i7).P(arrayList2);
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    org.telegram.messenger.w7.G(i7);
                    if (org.telegram.messenger.w7.M(((org.telegram.messenger.fj) arrayList.get(i10)).f24073k, false, true).exists()) {
                        arrayList3.add((org.telegram.messenger.fj) arrayList.get(i10));
                    }
                }
                for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                    org.telegram.messenger.w7.G(i7);
                    if (!org.telegram.messenger.w7.M(((org.telegram.messenger.fj) arrayList2.get(i11)).f24073k, false, true).exists()) {
                        arrayList4.add((org.telegram.messenger.fj) arrayList2.get(i11));
                    }
                }
                org.telegram.messenger.g0.g3(new org.telegram.ui.Cells.fa(sl0Var, arrayList3, arrayList4, 24));
                return;
            case 20:
                ((ul0) this.f34684b).invalidateSelf();
                return;
            case 21:
                ((em0) this.f34684b).f34798f.setVisibility(8);
                return;
            case 22:
                ((org.telegram.ui.jw) this.f34684b).p();
                return;
            case 23:
                ((x60) this.f34684b).s();
                return;
            case 24:
                ((vm0) this.f34684b).setOverscrolling(false);
                return;
            case 25:
                ((an0) this.f34684b).getClass();
                return;
            case 26:
                org.telegram.ui.Cells.r1 r1Var = ((dn0) this.f34684b).f34406n;
                if (r1Var != null) {
                    r1Var.invalidate();
                    return;
                }
                return;
            case 27:
                en0 en0Var = (en0) this.f34684b;
                en0Var.f34822q = false;
                en0Var.f34809b.run();
                return;
            case 28:
                ((go0) this.f34684b).f35508b.c1(1);
                return;
            default:
                dp0 dp0Var = (dp0) this.f34684b;
                hi.s1[] s1VarArr = dp0Var.f34421a;
                if (dp0Var.f34422b != 1) {
                    for (hi.s1 s1Var : s1VarArr) {
                        org.telegram.ui.ActionBar.n5 n5Var = (org.telegram.ui.ActionBar.n5) s1Var.f15366e;
                        n5Var.setAlpha(1.0f);
                        n5Var.setScaleX(1.0f);
                        n5Var.setScaleY(1.0f);
                        ((org.telegram.ui.ActionBar.n5) s1Var.f15367f).setAlpha(0.0f);
                    }
                    dp0Var.F = false;
                    org.telegram.messenger.g0.h3(dp0Var.H, 4000L);
                    return;
                }
                dp0Var.F = !dp0Var.F;
                for (hi.s1 s1Var2 : s1VarArr) {
                    org.telegram.ui.ActionBar.n5 n5Var2 = (org.telegram.ui.ActionBar.n5) s1Var2.f15366e;
                    org.telegram.ui.ActionBar.n5 n5Var3 = (org.telegram.ui.ActionBar.n5) s1Var2.f15367f;
                    n5Var2.setPivotX(0.0f);
                    n5Var3.setPivotX(0.0f);
                    if (dp0Var.F) {
                        n5Var2.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                        n5Var3.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                    } else {
                        n5Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                        n5Var3.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                    }
                }
                org.telegram.messenger.g0.h3(dp0Var.H, 4000L);
                return;
        }
    }
}
