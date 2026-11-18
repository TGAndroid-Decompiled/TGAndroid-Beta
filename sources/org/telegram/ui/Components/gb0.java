package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.util.StateSet;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class gb0 implements Runnable {
    public final int f35451a;
    public final Object f35452b;

    public gb0(Object obj, int i7) {
        this.f35451a = i7;
        this.f35452b = obj;
    }

    @Override
    public final void run() {
        float f10;
        f61 f61Var;
        switch (this.f35451a) {
            case 0:
                ((hi.v) this.f35452b).invalidateSelf();
                return;
            case 1:
                ((h00) this.f35452b).invalidateSelf();
                return;
            case 2:
                ((bc0) this.f35452b).d();
                return;
            case 3:
                jc0 jc0Var = (jc0) this.f35452b;
                jc0Var.getClass();
                try {
                    jc0Var.d.N.performHapticFeedback(3, 2);
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 4:
                ((xc0) this.f35452b).f41977o1.start();
                return;
            case 5:
                cz czVar = ((ae0) this.f35452b).f33339c.m0;
                if (czVar != null) {
                    czVar.c(false, true, false);
                    return;
                }
                return;
            case 6:
                ce0 ce0Var = (ce0) this.f35452b;
                ce0Var.f33980r = false;
                ce0Var.invalidate();
                return;
            case 7:
                ((ee0) this.f35452b).h = null;
                return;
            case 8:
                ee0 ee0Var = (ee0) ((ji.j) this.f35452b).f17949c;
                ee0Var.d.q0(ee0Var.f34684e, false);
                return;
            case 9:
                org.telegram.ui.dq0 dq0Var = (org.telegram.ui.dq0) this.f35452b;
                if (dq0Var.f36753y) {
                    dq0Var.h("pollPosition();");
                }
                if (dq0Var.H) {
                    org.telegram.messenger.g0.h3(dq0Var.M, 500L);
                    return;
                }
                return;
            case 10:
                ((ve0) this.f35452b).f();
                return;
            case 11:
                try {
                    ug0 ug0Var = ((tg0) this.f35452b).f39997b;
                    if (ug0Var.getParent() instanceof ViewGroup) {
                        ((ViewGroup) ug0Var.getParent()).removeView(ug0Var);
                    }
                    ug0Var.R.run();
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 12:
                ((RLottieNative) this.f35452b).d();
                return;
            case 13:
                vi0 vi0Var = (vi0) this.f35452b;
                vi0Var.f40683y0 = null;
                vi0Var.j();
                ui0 ui0Var = vi0Var.f40657h0;
                if (ui0Var != null) {
                    ui0Var.z();
                    return;
                }
                return;
            case 14:
                ((si0) this.f35452b).I.f40009a.setVisibility(4);
                return;
            case 15:
                ((ve) this.f35452b).a();
                return;
            case 16:
                xi0 xi0Var = (xi0) this.f35452b;
                f61 f61Var2 = xi0Var.f42076n;
                if (f61Var2 != null) {
                    boolean d02 = f61Var2.d0();
                    float S = ((float) xi0Var.f42076n.S()) / ((float) xi0Var.f42076n.U());
                    if (S < xi0Var.f42083s) {
                        xi0Var.f42076n.q0(f10 * ((float) f61Var.U()), false);
                    } else if (S > xi0Var.f42088w || (xi0Var.f42061d0 && !d02 && xi0Var.f42090x && xi0Var.f42076n.S() >= xi0Var.f42076n.U() - 50)) {
                        xi0Var.setPlaying(false);
                        d02 = false;
                    }
                    if (d02) {
                        org.telegram.messenger.g0.h3(xi0Var.f42092y, 16L);
                    }
                    if (xi0Var.f42061d0) {
                        xi0Var.i(true);
                    }
                }
                xi0Var.invalidate();
                return;
            case 17:
                ck0 ck0Var = (ck0) this.f35452b;
                ck0Var.U1 = null;
                ck0Var.T1 = null;
                org.telegram.ui.Cells.y yVar = ck0Var.C1;
                if (yVar != null) {
                    Drawable current = yVar.getCurrent();
                    if (current instanceof TransitionDrawable) {
                        ((TransitionDrawable) current).resetTransition();
                    }
                }
                org.telegram.ui.Cells.y yVar2 = ck0Var.C1;
                if (yVar2 != null && yVar2.isStateful()) {
                    ck0Var.C1.setState(StateSet.NOTHING);
                    return;
                }
                return;
            case 18:
                pk0 pk0Var = (pk0) this.f35452b;
                if (pk0Var.f38469f0 && pk0Var.k0() != pk0Var.f38473j0) {
                    pk0Var.q0("on screen, settled after start", true);
                    return;
                }
                return;
            case 19:
                ql0 ql0Var = (ql0) this.f35452b;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                int i7 = ql0Var.d;
                org.telegram.messenger.w7.G(i7).y(arrayList);
                org.telegram.messenger.w7.G(i7).P(arrayList2);
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    org.telegram.messenger.w7.G(i7);
                    if (org.telegram.messenger.w7.M(((org.telegram.messenger.fj) arrayList.get(i10)).f23968k, false, true).exists()) {
                        arrayList3.add((org.telegram.messenger.fj) arrayList.get(i10));
                    }
                }
                for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                    org.telegram.messenger.w7.G(i7);
                    if (!org.telegram.messenger.w7.M(((org.telegram.messenger.fj) arrayList2.get(i11)).f23968k, false, true).exists()) {
                        arrayList4.add((org.telegram.messenger.fj) arrayList2.get(i11));
                    }
                }
                org.telegram.messenger.g0.g3(new k7(ql0Var, arrayList3, arrayList4, 22));
                return;
            case 20:
                ((sl0) this.f35452b).invalidateSelf();
                return;
            case 21:
                ((cm0) this.f35452b).f34107f.setVisibility(8);
                return;
            case 22:
                ((org.telegram.ui.kw) this.f35452b).o();
                return;
            case 23:
                ((y60) this.f35452b).s();
                return;
            case 24:
                ((tm0) this.f35452b).setOverscrolling(false);
                return;
            case 25:
                ((ym0) this.f35452b).getClass();
                return;
            case 26:
                org.telegram.ui.Cells.q1 q1Var = ((bn0) this.f35452b).f33737n;
                if (q1Var != null) {
                    q1Var.invalidate();
                    return;
                }
                return;
            case 27:
                cn0 cn0Var = (cn0) this.f35452b;
                cn0Var.f34131q = false;
                cn0Var.f34118b.run();
                return;
            case 28:
                ((fo0) this.f35452b).f35146b.c1(1);
                return;
            default:
                cp0 cp0Var = (cp0) this.f35452b;
                hi.k1[] k1VarArr = cp0Var.f34148a;
                if (cp0Var.f34149b != 1) {
                    for (hi.k1 k1Var : k1VarArr) {
                        org.telegram.ui.ActionBar.n5 n5Var = (org.telegram.ui.ActionBar.n5) k1Var.f14854e;
                        n5Var.setAlpha(1.0f);
                        n5Var.setScaleX(1.0f);
                        n5Var.setScaleY(1.0f);
                        ((org.telegram.ui.ActionBar.n5) k1Var.f14855f).setAlpha(0.0f);
                    }
                    cp0Var.F = false;
                    org.telegram.messenger.g0.h3(cp0Var.H, 4000L);
                    return;
                }
                cp0Var.F = !cp0Var.F;
                for (hi.k1 k1Var2 : k1VarArr) {
                    org.telegram.ui.ActionBar.n5 n5Var2 = (org.telegram.ui.ActionBar.n5) k1Var2.f14854e;
                    org.telegram.ui.ActionBar.n5 n5Var3 = (org.telegram.ui.ActionBar.n5) k1Var2.f14855f;
                    n5Var2.setPivotX(0.0f);
                    n5Var3.setPivotX(0.0f);
                    if (cp0Var.F) {
                        n5Var2.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                        n5Var3.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                    } else {
                        n5Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                        n5Var3.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                    }
                }
                org.telegram.messenger.g0.h3(cp0Var.H, 4000L);
                return;
        }
    }
}
