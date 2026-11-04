package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.util.StateSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
public final class jb0 implements Runnable {
    public final int f35015a;
    public final Object f35016b;

    public jb0(Object obj, int i3) {
        this.f35015a = i3;
        this.f35016b = obj;
    }

    @Override
    public final void run() {
        float f10;
        m51 m51Var;
        switch (this.f35015a) {
            case 0:
                ((lb0) this.f35016b).d();
                return;
            case 1:
                tb0 tb0Var = (tb0) this.f35016b;
                tb0Var.getClass();
                try {
                    tb0Var.d.N.performHapticFeedback(3, 2);
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 2:
                ((hc0) this.f35016b).f34362l1.start();
                return;
            case 3:
                py pyVar = ((kd0) this.f35016b).f35373c.m0;
                if (pyVar != null) {
                    pyVar.c(false, true, false);
                    return;
                }
                return;
            case 4:
                md0 md0Var = (md0) this.f35016b;
                md0Var.f36135r = false;
                md0Var.invalidate();
                return;
            case 5:
                ((od0) this.f35016b).h = null;
                return;
            case 6:
                od0 od0Var = (od0) ((mi.h0) this.f35016b).f19645c;
                od0Var.d.q0(od0Var.f36809e, false);
                return;
            case 7:
                org.telegram.ui.tp0 tp0Var = (org.telegram.ui.tp0) this.f35016b;
                if (tp0Var.f38729y) {
                    tp0Var.h("pollPosition();");
                }
                if (tp0Var.H) {
                    org.telegram.messenger.g0.i3(tp0Var.M, 500L);
                    return;
                }
                return;
            case 8:
                ((FrameLayout) this.f35016b).invalidate();
                return;
            case 9:
                ie0 ie0Var = (ie0) ((ee0) this.f35016b).f33374b;
                ie0Var.d.invalidate();
                ie0Var.f34691e.requestLayout();
                return;
            case 10:
                ((ke0) this.f35016b).f();
                return;
            case 11:
                try {
                    kg0 kg0Var = ((jg0) this.f35016b).f35070b;
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
                ((RLottieNative) this.f35016b).d();
                return;
            case 13:
                li0 li0Var = (li0) this.f35016b;
                li0Var.f35778y0 = null;
                li0Var.j();
                ki0 ki0Var = li0Var.f35752h0;
                if (ki0Var != null) {
                    ki0Var.J();
                    return;
                }
                return;
            case 14:
                ((ii0) this.f35016b).I.f35077a.setVisibility(4);
                return;
            case 15:
                mi0 mi0Var = (mi0) this.f35016b;
                m51 m51Var2 = mi0Var.f36163n;
                if (m51Var2 != null) {
                    boolean d02 = m51Var2.d0();
                    float S = ((float) mi0Var.f36163n.S()) / ((float) mi0Var.f36163n.U());
                    if (S < mi0Var.f36165s) {
                        mi0Var.f36163n.q0(f10 * ((float) m51Var.U()), false);
                    } else if (S > mi0Var.f36166w) {
                        mi0Var.setPlaying(false);
                        d02 = false;
                    }
                    if (d02) {
                        org.telegram.messenger.g0.i3(mi0Var.f36168y, 16L);
                    }
                }
                mi0Var.invalidate();
                return;
            case 16:
                tj0 tj0Var = (tj0) this.f35016b;
                tj0Var.U1 = null;
                tj0Var.T1 = null;
                org.telegram.ui.Cells.y yVar = tj0Var.C1;
                if (yVar != null) {
                    Drawable current = yVar.getCurrent();
                    if (current instanceof TransitionDrawable) {
                        ((TransitionDrawable) current).resetTransition();
                    }
                }
                org.telegram.ui.Cells.y yVar2 = tj0Var.C1;
                if (yVar2 != null && yVar2.isStateful()) {
                    tj0Var.C1.setState(StateSet.NOTHING);
                    return;
                }
                return;
            case 17:
                gk0 gk0Var = (gk0) this.f35016b;
                if (gk0Var.f34133f0 && gk0Var.k0() != gk0Var.f34137j0) {
                    gk0Var.q0("on screen, settled after start", true);
                    return;
                }
                return;
            case 18:
                hl0 hl0Var = (hl0) this.f35016b;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                int i3 = hl0Var.d;
                org.telegram.messenger.w7.G(i3).y(arrayList);
                org.telegram.messenger.w7.G(i3).Q(arrayList2);
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    org.telegram.messenger.w7.G(i3);
                    if (org.telegram.messenger.w7.N(((org.telegram.messenger.zi) arrayList.get(i10)).f26868k, false, true).exists()) {
                        arrayList3.add((org.telegram.messenger.zi) arrayList.get(i10));
                    }
                }
                for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                    org.telegram.messenger.w7.G(i3);
                    if (!org.telegram.messenger.w7.N(((org.telegram.messenger.zi) arrayList2.get(i11)).f26868k, false, true).exists()) {
                        arrayList4.add((org.telegram.messenger.zi) arrayList2.get(i11));
                    }
                }
                org.telegram.messenger.g0.h3(new e7(hl0Var, arrayList3, arrayList4, 21));
                return;
            case 19:
                ((jl0) this.f35016b).invalidateSelf();
                return;
            case 20:
                ((tl0) this.f35016b).f38489f.setVisibility(8);
                return;
            case 21:
                ((org.telegram.ui.cw) this.f35016b).q();
                return;
            case 22:
                ((f60) this.f35016b).s();
                return;
            case 23:
                ((km0) this.f35016b).setOverscrolling(false);
                return;
            case 24:
                ((pm0) this.f35016b).getClass();
                return;
            case 25:
                org.telegram.ui.Cells.q1 q1Var = ((sm0) this.f35016b).f38076n;
                if (q1Var != null) {
                    q1Var.invalidate();
                    return;
                }
                return;
            case 26:
                tm0 tm0Var = (tm0) this.f35016b;
                tm0Var.f38512q = false;
                tm0Var.f38499b.run();
                return;
            case 27:
                ((vn0) this.f35016b).f39180b.b1(1);
                return;
            case 28:
                ro0 ro0Var = (ro0) this.f35016b;
                gi.i1[] i1VarArr = ro0Var.f37763a;
                if (ro0Var.f37764b != 1) {
                    for (gi.i1 i1Var : i1VarArr) {
                        org.telegram.ui.ActionBar.k5 k5Var = (org.telegram.ui.ActionBar.k5) i1Var.f12944e;
                        k5Var.setAlpha(1.0f);
                        k5Var.setScaleX(1.0f);
                        k5Var.setScaleY(1.0f);
                        ((org.telegram.ui.ActionBar.k5) i1Var.f12945f).setAlpha(0.0f);
                    }
                    ro0Var.F = false;
                    org.telegram.messenger.g0.i3(ro0Var.H, 4000L);
                    return;
                }
                ro0Var.F = !ro0Var.F;
                for (gi.i1 i1Var2 : i1VarArr) {
                    org.telegram.ui.ActionBar.k5 k5Var2 = (org.telegram.ui.ActionBar.k5) i1Var2.f12944e;
                    org.telegram.ui.ActionBar.k5 k5Var3 = (org.telegram.ui.ActionBar.k5) i1Var2.f12945f;
                    k5Var2.setPivotX(0.0f);
                    k5Var3.setPivotX(0.0f);
                    if (ro0Var.F) {
                        k5Var2.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                        k5Var3.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                    } else {
                        k5Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                        k5Var3.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                    }
                }
                org.telegram.messenger.g0.i3(ro0Var.H, 4000L);
                return;
            default:
                ((gi.i1) this.f35016b).setVisibility(8);
                return;
        }
    }
}
