package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.util.StateSet;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class wa0 implements Runnable {
    public final int f41321a;
    public final Object f41322b;

    public wa0(Object obj, int i7) {
        this.f41321a = i7;
        this.f41322b = obj;
    }

    @Override
    public final void run() {
        float f10;
        u51 u51Var;
        switch (this.f41321a) {
            case 0:
                ((hi.u) this.f41322b).invalidateSelf();
                return;
            case 1:
                ((a00) this.f41322b).invalidateSelf();
                return;
            case 2:
                ((qb0) this.f41322b).d();
                return;
            case 3:
                zb0 zb0Var = (zb0) this.f41322b;
                zb0Var.getClass();
                try {
                    zb0Var.d.N.performHapticFeedback(3, 2);
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 4:
                ((nc0) this.f41322b).f37541o1.start();
                return;
            case 5:
                wy wyVar = ((qd0) this.f41322b).f38638c.m0;
                if (wyVar != null) {
                    wyVar.c(false, true, false);
                    return;
                }
                return;
            case 6:
                sd0 sd0Var = (sd0) this.f41322b;
                sd0Var.f39283r = false;
                sd0Var.invalidate();
                return;
            case 7:
                ((ud0) this.f41322b).h = null;
                return;
            case 8:
                ud0 ud0Var = (ud0) ((ji.j) this.f41322b).f17556c;
                ud0Var.d.q0(ud0Var.f40002e, false);
                return;
            case 9:
                org.telegram.ui.bq0 bq0Var = (org.telegram.ui.bq0) this.f41322b;
                if (bq0Var.f32981y) {
                    bq0Var.h("pollPosition();");
                }
                if (bq0Var.H) {
                    org.telegram.messenger.g0.i3(bq0Var.M, 500L);
                    return;
                }
                return;
            case 10:
                ((le0) this.f41322b).f();
                return;
            case 11:
                try {
                    kg0 kg0Var = ((jg0) this.f41322b).f35996b;
                    if (kg0Var.getParent() instanceof ViewGroup) {
                        ((ViewGroup) kg0Var.getParent()).removeView(kg0Var);
                    }
                    kg0Var.R.run();
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 12:
                ((RLottieNative) this.f41322b).d();
                return;
            case 13:
                mi0 mi0Var = (mi0) this.f41322b;
                mi0Var.f37300y0 = null;
                mi0Var.j();
                li0 li0Var = mi0Var.f37274h0;
                if (li0Var != null) {
                    li0Var.K();
                    return;
                }
                return;
            case 14:
                ((ji0) this.f41322b).I.f36512a.setVisibility(4);
                return;
            case 15:
                ((me) this.f41322b).a();
                return;
            case 16:
                oi0 oi0Var = (oi0) this.f41322b;
                u51 u51Var2 = oi0Var.f37982n;
                if (u51Var2 != null) {
                    boolean d02 = u51Var2.d0();
                    float S = ((float) oi0Var.f37982n.S()) / ((float) oi0Var.f37982n.U());
                    if (S < oi0Var.f37989s) {
                        oi0Var.f37982n.q0(f10 * ((float) u51Var.U()), false);
                    } else if (S > oi0Var.f37994w || (oi0Var.f37967d0 && !d02 && oi0Var.f37996x && oi0Var.f37982n.S() >= oi0Var.f37982n.U() - 50)) {
                        oi0Var.setPlaying(false);
                        d02 = false;
                    }
                    if (d02) {
                        org.telegram.messenger.g0.i3(oi0Var.f37998y, 16L);
                    }
                    if (oi0Var.f37967d0) {
                        oi0Var.i(true);
                    }
                }
                oi0Var.invalidate();
                return;
            case 17:
                uj0 uj0Var = (uj0) this.f41322b;
                uj0Var.U1 = null;
                uj0Var.T1 = null;
                org.telegram.ui.Cells.y yVar = uj0Var.C1;
                if (yVar != null) {
                    Drawable current = yVar.getCurrent();
                    if (current instanceof TransitionDrawable) {
                        ((TransitionDrawable) current).resetTransition();
                    }
                }
                org.telegram.ui.Cells.y yVar2 = uj0Var.C1;
                if (yVar2 != null && yVar2.isStateful()) {
                    uj0Var.C1.setState(StateSet.NOTHING);
                    return;
                }
                return;
            case 18:
                hk0 hk0Var = (hk0) this.f41322b;
                if (hk0Var.f35271f0 && hk0Var.k0() != hk0Var.f35275j0) {
                    hk0Var.q0("on screen, settled after start", true);
                    return;
                }
                return;
            case 19:
                il0 il0Var = (il0) this.f41322b;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                int i7 = il0Var.d;
                org.telegram.messenger.w7.G(i7).y(arrayList);
                org.telegram.messenger.w7.G(i7).P(arrayList2);
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    org.telegram.messenger.w7.G(i7);
                    if (org.telegram.messenger.w7.M(((org.telegram.messenger.gj) arrayList.get(i10)).f23819k, false, true).exists()) {
                        arrayList3.add((org.telegram.messenger.gj) arrayList.get(i10));
                    }
                }
                for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                    org.telegram.messenger.w7.G(i7);
                    if (!org.telegram.messenger.w7.M(((org.telegram.messenger.gj) arrayList2.get(i11)).f23819k, false, true).exists()) {
                        arrayList4.add((org.telegram.messenger.gj) arrayList2.get(i11));
                    }
                }
                org.telegram.messenger.g0.h3(new yf(il0Var, arrayList3, arrayList4, 19));
                return;
            case 20:
                ((kl0) this.f41322b).invalidateSelf();
                return;
            case 21:
                ((ul0) this.f41322b).f40100f.setVisibility(8);
                return;
            case 22:
                ((org.telegram.ui.hw) this.f41322b).p();
                return;
            case 23:
                ((m60) this.f41322b).s();
                return;
            case 24:
                ((lm0) this.f41322b).setOverscrolling(false);
                return;
            case 25:
                ((qm0) this.f41322b).getClass();
                return;
            case 26:
                org.telegram.ui.Cells.q1 q1Var = ((tm0) this.f41322b).f39733n;
                if (q1Var != null) {
                    q1Var.invalidate();
                    return;
                }
                return;
            case 27:
                um0 um0Var = (um0) this.f41322b;
                um0Var.f40123q = false;
                um0Var.f40110b.run();
                return;
            case 28:
                ((wn0) this.f41322b).f41412b.b1(1);
                return;
            default:
                to0 to0Var = (to0) this.f41322b;
                hi.k1[] k1VarArr = to0Var.f39753a;
                if (to0Var.f39754b != 1) {
                    for (hi.k1 k1Var : k1VarArr) {
                        org.telegram.ui.ActionBar.j5 j5Var = (org.telegram.ui.ActionBar.j5) k1Var.f14491e;
                        j5Var.setAlpha(1.0f);
                        j5Var.setScaleX(1.0f);
                        j5Var.setScaleY(1.0f);
                        ((org.telegram.ui.ActionBar.j5) k1Var.f14492f).setAlpha(0.0f);
                    }
                    to0Var.F = false;
                    org.telegram.messenger.g0.i3(to0Var.H, 4000L);
                    return;
                }
                to0Var.F = !to0Var.F;
                for (hi.k1 k1Var2 : k1VarArr) {
                    org.telegram.ui.ActionBar.j5 j5Var2 = (org.telegram.ui.ActionBar.j5) k1Var2.f14491e;
                    org.telegram.ui.ActionBar.j5 j5Var3 = (org.telegram.ui.ActionBar.j5) k1Var2.f14492f;
                    j5Var2.setPivotX(0.0f);
                    j5Var3.setPivotX(0.0f);
                    if (to0Var.F) {
                        j5Var2.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                        j5Var3.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                    } else {
                        j5Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                        j5Var3.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                    }
                }
                org.telegram.messenger.g0.i3(to0Var.H, 4000L);
                return;
        }
    }
}
