package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.util.StateSet;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class pb0 implements Runnable {
    public final int f36970a;
    public final Object f36971b;

    public pb0(Object obj, int i7) {
        this.f36970a = i7;
        this.f36971b = obj;
    }

    @Override
    public final void run() {
        float f10;
        u51 u51Var;
        switch (this.f36970a) {
            case 0:
                ((rb0) this.f36971b).d();
                return;
            case 1:
                zb0 zb0Var = (zb0) this.f36971b;
                zb0Var.getClass();
                try {
                    zb0Var.d.M.performHapticFeedback(3, 2);
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 2:
                ((nc0) this.f36971b).f36340k1.start();
                return;
            case 3:
                sy syVar = ((qd0) this.f36971b).f37295c.f38370l0;
                if (syVar != null) {
                    syVar.c(false, true, false);
                    return;
                }
                return;
            case 4:
                sd0 sd0Var = (sd0) this.f36971b;
                sd0Var.f38031r = false;
                sd0Var.invalidate();
                return;
            case 5:
                ((vd0) this.f36971b).h = null;
                return;
            case 6:
                vd0 vd0Var = (vd0) ((j2.n) this.f36971b).f16457c;
                vd0Var.d.q0(vd0Var.f39042e, false);
                return;
            case 7:
                org.telegram.ui.eq0 eq0Var = (org.telegram.ui.eq0) this.f36971b;
                if (eq0Var.f32248y) {
                    eq0Var.h("pollPosition();");
                }
                if (eq0Var.G) {
                    org.telegram.messenger.g0.i3(eq0Var.L, 500L);
                    return;
                }
                return;
            case 8:
                ((je0) this.f36971b).f();
                return;
            case 9:
                try {
                    ig0 ig0Var = ((hg0) this.f36971b).f34295b;
                    if (ig0Var.getParent() instanceof ViewGroup) {
                        ((ViewGroup) ig0Var.getParent()).removeView(ig0Var);
                    }
                    ig0Var.Q.run();
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 10:
                ((RLottieNative) this.f36971b).d();
                return;
            case 11:
                ji0 ji0Var = (ji0) this.f36971b;
                ji0Var.f35068x0 = null;
                ji0Var.j();
                ii0 ii0Var = ji0Var.f35042g0;
                if (ii0Var != null) {
                    ii0Var.M();
                    return;
                }
                return;
            case 12:
                ((gi0) this.f36971b).H.f34303a.setVisibility(4);
                return;
            case 13:
                ki0 ki0Var = (ki0) this.f36971b;
                u51 u51Var2 = ki0Var.f35350n;
                if (u51Var2 != null) {
                    boolean d02 = u51Var2.d0();
                    float S = ((float) ki0Var.f35350n.S()) / ((float) ki0Var.f35350n.U());
                    if (S < ki0Var.f35352s) {
                        ki0Var.f35350n.q0(f10 * ((float) u51Var.U()), false);
                    } else if (S > ki0Var.f35353w) {
                        ki0Var.setPlaying(false);
                        d02 = false;
                    }
                    if (d02) {
                        org.telegram.messenger.g0.i3(ki0Var.f35355y, 16L);
                    }
                }
                ki0Var.invalidate();
                return;
            case 14:
                qj0 qj0Var = (qj0) this.f36971b;
                qj0Var.T1 = null;
                qj0Var.S1 = null;
                org.telegram.ui.Cells.y yVar = qj0Var.B1;
                if (yVar != null) {
                    Drawable current = yVar.getCurrent();
                    if (current instanceof TransitionDrawable) {
                        ((TransitionDrawable) current).resetTransition();
                    }
                }
                org.telegram.ui.Cells.y yVar2 = qj0Var.B1;
                if (yVar2 != null && yVar2.isStateful()) {
                    qj0Var.B1.setState(StateSet.NOTHING);
                    return;
                }
                return;
            case 15:
                dk0 dk0Var = (dk0) this.f36971b;
                if (dk0Var.f33089e0 && dk0Var.k0() != dk0Var.f33093i0) {
                    dk0Var.q0("on screen, settled after start", true);
                    return;
                }
                return;
            case 16:
                el0 el0Var = (el0) this.f36971b;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                int i7 = el0Var.d;
                org.telegram.messenger.w7.G(i7).y(arrayList);
                org.telegram.messenger.w7.G(i7).P(arrayList2);
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    org.telegram.messenger.w7.G(i7);
                    if (org.telegram.messenger.w7.M(((org.telegram.messenger.ij) arrayList.get(i10)).f23262k, false, true).exists()) {
                        arrayList3.add((org.telegram.messenger.ij) arrayList.get(i10));
                    }
                }
                for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                    org.telegram.messenger.w7.G(i7);
                    if (!org.telegram.messenger.w7.M(((org.telegram.messenger.ij) arrayList2.get(i11)).f23262k, false, true).exists()) {
                        arrayList4.add((org.telegram.messenger.ij) arrayList2.get(i11));
                    }
                }
                org.telegram.messenger.g0.h3(new ng(el0Var, arrayList3, arrayList4, 17));
                return;
            case 17:
                ((gl0) this.f36971b).invalidateSelf();
                return;
            case 18:
                ((rl0) this.f36971b).f37737f.setVisibility(8);
                return;
            case 19:
                ((org.telegram.ui.hw) this.f36971b).s();
                return;
            case 20:
                ((l60) this.f36971b).s();
                return;
            case 21:
                ((im0) this.f36971b).setOverscrolling(false);
                return;
            case 22:
                ((nm0) this.f36971b).getClass();
                return;
            case 23:
                org.telegram.ui.Cells.q1 q1Var = ((qm0) this.f36971b).f37429n;
                if (q1Var != null) {
                    q1Var.invalidate();
                    return;
                }
                return;
            case 24:
                rm0 rm0Var = (rm0) this.f36971b;
                rm0Var.f37759q = false;
                rm0Var.f37746b.run();
                return;
            case 25:
                ((un0) this.f36971b).f38759b.b1(1);
                return;
            case 26:
                qo0 qo0Var = (qo0) this.f36971b;
                fi.i1[] i1VarArr = qo0Var.f37447a;
                if (qo0Var.f37448b != 1) {
                    for (fi.i1 i1Var : i1VarArr) {
                        org.telegram.ui.ActionBar.l5 l5Var = (org.telegram.ui.ActionBar.l5) i1Var.f12167e;
                        l5Var.setAlpha(1.0f);
                        l5Var.setScaleX(1.0f);
                        l5Var.setScaleY(1.0f);
                        ((org.telegram.ui.ActionBar.l5) i1Var.f12168f).setAlpha(0.0f);
                    }
                    qo0Var.E = false;
                    org.telegram.messenger.g0.i3(qo0Var.G, 4000L);
                    return;
                }
                qo0Var.E = !qo0Var.E;
                for (fi.i1 i1Var2 : i1VarArr) {
                    org.telegram.ui.ActionBar.l5 l5Var2 = (org.telegram.ui.ActionBar.l5) i1Var2.f12167e;
                    org.telegram.ui.ActionBar.l5 l5Var3 = (org.telegram.ui.ActionBar.l5) i1Var2.f12168f;
                    l5Var2.setPivotX(0.0f);
                    l5Var3.setPivotX(0.0f);
                    if (qo0Var.E) {
                        l5Var2.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                        l5Var3.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                    } else {
                        l5Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                        l5Var3.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                    }
                }
                org.telegram.messenger.g0.i3(qo0Var.G, 4000L);
                return;
            case 27:
                ((fi.i1) this.f36971b).setVisibility(8);
                return;
            case 28:
                zs0 zs0Var = ((tp0) this.f36971b).G;
                if (zs0Var.E1) {
                    zs0Var.q1(false);
                    return;
                }
                return;
            default:
                ((dr0) this.f36971b).f33146a.B1(false);
                return;
        }
    }
}
