package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.util.StateSet;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class ob0 implements Runnable {
    public final int f36571a;
    public final Object f36572b;

    public ob0(Object obj, int i7) {
        this.f36571a = i7;
        this.f36572b = obj;
    }

    @Override
    public final void run() {
        float f10;
        s51 s51Var;
        switch (this.f36571a) {
            case 0:
                ((qb0) this.f36572b).d();
                return;
            case 1:
                yb0 yb0Var = (yb0) this.f36572b;
                yb0Var.getClass();
                try {
                    yb0Var.d.M.performHapticFeedback(3, 2);
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 2:
                ((mc0) this.f36572b).f35921k1.start();
                return;
            case 3:
                ry ryVar = ((pd0) this.f36572b).f36865c.f38001l0;
                if (ryVar != null) {
                    ryVar.c(false, true, false);
                    return;
                }
                return;
            case 4:
                rd0 rd0Var = (rd0) this.f36572b;
                rd0Var.f37651r = false;
                rd0Var.invalidate();
                return;
            case 5:
                ((ud0) this.f36572b).h = null;
                return;
            case 6:
                ud0 ud0Var = (ud0) ((j2.n) this.f36572b).f16454c;
                ud0Var.d.q0(ud0Var.f38605e, false);
                return;
            case 7:
                org.telegram.ui.cq0 cq0Var = (org.telegram.ui.cq0) this.f36572b;
                if (cq0Var.f31797y) {
                    cq0Var.h("pollPosition();");
                }
                if (cq0Var.G) {
                    org.telegram.messenger.g0.i3(cq0Var.L, 500L);
                    return;
                }
                return;
            case 8:
                ((ie0) this.f36572b).f();
                return;
            case 9:
                try {
                    hg0 hg0Var = ((gg0) this.f36572b).f33905b;
                    if (hg0Var.getParent() instanceof ViewGroup) {
                        ((ViewGroup) hg0Var.getParent()).removeView(hg0Var);
                    }
                    hg0Var.Q.run();
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 10:
                ((RLottieNative) this.f36572b).d();
                return;
            case 11:
                ii0 ii0Var = (ii0) this.f36572b;
                ii0Var.f34648x0 = null;
                ii0Var.j();
                hi0 hi0Var = ii0Var.f34622g0;
                if (hi0Var != null) {
                    hi0Var.M();
                    return;
                }
                return;
            case 12:
                ((fi0) this.f36572b).H.f33915a.setVisibility(4);
                return;
            case 13:
                ji0 ji0Var = (ji0) this.f36572b;
                s51 s51Var2 = ji0Var.f34942n;
                if (s51Var2 != null) {
                    boolean d02 = s51Var2.d0();
                    float S = ((float) ji0Var.f34942n.S()) / ((float) ji0Var.f34942n.U());
                    if (S < ji0Var.f34944s) {
                        ji0Var.f34942n.q0(f10 * ((float) s51Var.U()), false);
                    } else if (S > ji0Var.f34945w) {
                        ji0Var.setPlaying(false);
                        d02 = false;
                    }
                    if (d02) {
                        org.telegram.messenger.g0.i3(ji0Var.f34947y, 16L);
                    }
                }
                ji0Var.invalidate();
                return;
            case 14:
                pj0 pj0Var = (pj0) this.f36572b;
                pj0Var.T1 = null;
                pj0Var.S1 = null;
                org.telegram.ui.Cells.y yVar = pj0Var.B1;
                if (yVar != null) {
                    Drawable current = yVar.getCurrent();
                    if (current instanceof TransitionDrawable) {
                        ((TransitionDrawable) current).resetTransition();
                    }
                }
                org.telegram.ui.Cells.y yVar2 = pj0Var.B1;
                if (yVar2 != null && yVar2.isStateful()) {
                    pj0Var.B1.setState(StateSet.NOTHING);
                    return;
                }
                return;
            case 15:
                ck0 ck0Var = (ck0) this.f36572b;
                if (ck0Var.f32596e0 && ck0Var.k0() != ck0Var.f32600i0) {
                    ck0Var.q0("on screen, settled after start", true);
                    return;
                }
                return;
            case 16:
                dl0 dl0Var = (dl0) this.f36572b;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                int i7 = dl0Var.d;
                org.telegram.messenger.w7.G(i7).y(arrayList);
                org.telegram.messenger.w7.G(i7).Q(arrayList2);
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    org.telegram.messenger.w7.G(i7);
                    if (org.telegram.messenger.w7.N(((org.telegram.messenger.ij) arrayList.get(i10)).f23237k, false, true).exists()) {
                        arrayList3.add((org.telegram.messenger.ij) arrayList.get(i10));
                    }
                }
                for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                    org.telegram.messenger.w7.G(i7);
                    if (!org.telegram.messenger.w7.N(((org.telegram.messenger.ij) arrayList2.get(i11)).f23237k, false, true).exists()) {
                        arrayList4.add((org.telegram.messenger.ij) arrayList2.get(i11));
                    }
                }
                org.telegram.messenger.g0.h3(new ng(dl0Var, arrayList3, arrayList4, 17));
                return;
            case 17:
                ((fl0) this.f36572b).invalidateSelf();
                return;
            case 18:
                ((ql0) this.f36572b).f37336f.setVisibility(8);
                return;
            case 19:
                ((org.telegram.ui.fw) this.f36572b).s();
                return;
            case 20:
                ((k60) this.f36572b).s();
                return;
            case 21:
                ((hm0) this.f36572b).setOverscrolling(false);
                return;
            case 22:
                ((mm0) this.f36572b).getClass();
                return;
            case 23:
                org.telegram.ui.Cells.q1 q1Var = ((pm0) this.f36572b).f36989n;
                if (q1Var != null) {
                    q1Var.invalidate();
                    return;
                }
                return;
            case 24:
                qm0 qm0Var = (qm0) this.f36572b;
                qm0Var.f37357q = false;
                qm0Var.f37344b.run();
                return;
            case 25:
                ((tn0) this.f36572b).f38380b.b1(1);
                return;
            case 26:
                po0 po0Var = (po0) this.f36572b;
                fi.i1[] i1VarArr = po0Var.f37014a;
                if (po0Var.f37015b != 1) {
                    for (fi.i1 i1Var : i1VarArr) {
                        org.telegram.ui.ActionBar.k5 k5Var = (org.telegram.ui.ActionBar.k5) i1Var.f12164e;
                        k5Var.setAlpha(1.0f);
                        k5Var.setScaleX(1.0f);
                        k5Var.setScaleY(1.0f);
                        ((org.telegram.ui.ActionBar.k5) i1Var.f12165f).setAlpha(0.0f);
                    }
                    po0Var.E = false;
                    org.telegram.messenger.g0.i3(po0Var.G, 4000L);
                    return;
                }
                po0Var.E = !po0Var.E;
                for (fi.i1 i1Var2 : i1VarArr) {
                    org.telegram.ui.ActionBar.k5 k5Var2 = (org.telegram.ui.ActionBar.k5) i1Var2.f12164e;
                    org.telegram.ui.ActionBar.k5 k5Var3 = (org.telegram.ui.ActionBar.k5) i1Var2.f12165f;
                    k5Var2.setPivotX(0.0f);
                    k5Var3.setPivotX(0.0f);
                    if (po0Var.E) {
                        k5Var2.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                        k5Var3.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                    } else {
                        k5Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                        k5Var3.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                    }
                }
                org.telegram.messenger.g0.i3(po0Var.G, 4000L);
                return;
            case 27:
                ((fi.i1) this.f36572b).setVisibility(8);
                return;
            case 28:
                xs0 xs0Var = ((sp0) this.f36572b).G;
                if (xs0Var.E1) {
                    xs0Var.o1(false);
                    return;
                }
                return;
            default:
                ((cr0) this.f36572b).f32652a.z1(false);
                return;
        }
    }
}
