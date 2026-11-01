package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.util.StateSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
public final class eb0 implements Runnable {
    public final int f25781a;
    public final Object f25782b;

    public eb0(Object obj, int i10) {
        this.f25781a = i10;
        this.f25782b = obj;
    }

    @Override
    public final void run() {
        float f7;
        v61 v61Var;
        switch (this.f25781a) {
            case 0:
                ((gb0) this.f25782b).a();
                return;
            case 1:
                ((ob0) this.f25782b).invalidateSelf();
                return;
            case 2:
                ((k00) this.f25782b).invalidateSelf();
                return;
            case 3:
                ((jc0) this.f25782b).d();
                return;
            case 4:
                sc0 sc0Var = (sc0) this.f25782b;
                sc0Var.getClass();
                try {
                    sc0Var.d.M.performHapticFeedback(3, 2);
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 5:
                ((hd0) this.f25782b).f26760k1.start();
                return;
            case 6:
                gz gzVar = ((le0) this.f25782b).f28143c.f29112l0;
                if (gzVar != null) {
                    gzVar.c(false, true, false);
                    return;
                }
                return;
            case 7:
                ne0 ne0Var = (ne0) this.f25782b;
                ne0Var.f28805r = false;
                ne0Var.invalidate();
                return;
            case 8:
                ((pe0) this.f25782b).h = null;
                return;
            case 9:
                pe0 pe0Var = (pe0) ((m5.e) this.f25782b).f13015c;
                pe0Var.d.q0(pe0Var.e, false);
                return;
            case 10:
                org.telegram.ui.lr0 lr0Var = (org.telegram.ui.lr0) this.f25782b;
                if (lr0Var.f31278y) {
                    lr0Var.h("pollPosition();");
                }
                if (lr0Var.G) {
                    org.telegram.messenger.i0.h3(lr0Var.L, 500L);
                    return;
                }
                return;
            case 11:
                ((FrameLayout) this.f25782b).invalidate();
                return;
            case 12:
                jf0 jf0Var = (jf0) ((eg.b) this.f25782b).f6521b;
                jf0Var.d.invalidate();
                jf0Var.e.requestLayout();
                return;
            case 13:
                ((lf0) this.f25782b).f();
                return;
            case 14:
                try {
                    kh0 kh0Var = ((jh0) this.f25782b).f27431b;
                    if (kh0Var.getParent() instanceof ViewGroup) {
                        ((ViewGroup) kh0Var.getParent()).removeView(kh0Var);
                    }
                    kh0Var.Q.run();
                    return;
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                    return;
                }
            case 15:
                ((RLottieNative) this.f25782b).d();
                return;
            case 16:
                nj0 nj0Var = (nj0) this.f25782b;
                nj0Var.f28900x0 = null;
                nj0Var.j();
                mj0 mj0Var = nj0Var.f28874g0;
                if (mj0Var != null) {
                    mj0Var.t();
                    return;
                }
                return;
            case 17:
                ((kj0) this.f25782b).H.f28182a.setVisibility(4);
                return;
            case 18:
                oj0 oj0Var = (oj0) this.f25782b;
                v61 v61Var2 = oj0Var.f29152n;
                if (v61Var2 != null) {
                    boolean d02 = v61Var2.d0();
                    float S = ((float) oj0Var.f29152n.S()) / ((float) oj0Var.f29152n.U());
                    if (S < oj0Var.f29154s) {
                        oj0Var.f29152n.q0(f7 * ((float) v61Var.U()), false);
                    } else if (S > oj0Var.f29155w) {
                        oj0Var.setPlaying(false);
                        d02 = false;
                    }
                    if (d02) {
                        org.telegram.messenger.i0.h3(oj0Var.f29157y, 16L);
                    }
                }
                oj0Var.invalidate();
                return;
            case 19:
                uk0 uk0Var = (uk0) this.f25782b;
                uk0Var.T1 = null;
                uk0Var.S1 = null;
                org.telegram.ui.Cells.y yVar = uk0Var.B1;
                if (yVar != null) {
                    Drawable current = yVar.getCurrent();
                    if (current instanceof TransitionDrawable) {
                        ((TransitionDrawable) current).resetTransition();
                    }
                }
                org.telegram.ui.Cells.y yVar2 = uk0Var.B1;
                if (yVar2 != null && yVar2.isStateful()) {
                    uk0Var.B1.setState(StateSet.NOTHING);
                    return;
                }
                return;
            case 20:
                hl0 hl0Var = (hl0) this.f25782b;
                if (hl0Var.f26821e0 && hl0Var.j0() != hl0Var.f26825i0) {
                    hl0Var.q0("on screen, settled after start", true);
                    return;
                }
                return;
            case 21:
                hm0 hm0Var = (hm0) this.f25782b;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                int i10 = hm0Var.d;
                org.telegram.messenger.b8.G(i10).y(arrayList);
                org.telegram.messenger.b8.G(i10).Q(arrayList2);
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    org.telegram.messenger.b8.G(i10);
                    if (org.telegram.messenger.b8.N(((org.telegram.messenger.kj) arrayList.get(i11)).f16690k, false, true).exists()) {
                        arrayList3.add((org.telegram.messenger.kj) arrayList.get(i11));
                    }
                }
                for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                    org.telegram.messenger.b8.G(i10);
                    if (!org.telegram.messenger.b8.N(((org.telegram.messenger.kj) arrayList2.get(i12)).f16690k, false, true).exists()) {
                        arrayList4.add((org.telegram.messenger.kj) arrayList2.get(i12));
                    }
                }
                org.telegram.messenger.i0.g3(new jg(hm0Var, arrayList3, arrayList4, 17));
                return;
            case 22:
                ((jm0) this.f25782b).invalidateSelf();
                return;
            case 23:
                ((sm0) this.f25782b).f30338f.setVisibility(8);
                return;
            case 24:
                ((org.telegram.ui.jx) this.f25782b).s();
                return;
            case 25:
                ((z60) this.f25782b).s();
                return;
            case 26:
                ((jn0) this.f25782b).setOverscrolling(false);
                return;
            case 27:
                ((on0) this.f25782b).getClass();
                return;
            case 28:
                org.telegram.ui.Cells.q1 q1Var = ((rn0) this.f25782b).f30037n;
                if (q1Var != null) {
                    q1Var.invalidate();
                    return;
                }
                return;
            default:
                sn0 sn0Var = (sn0) this.f25782b;
                sn0Var.f30393q = false;
                sn0Var.f30381b.run();
                return;
        }
    }
}
