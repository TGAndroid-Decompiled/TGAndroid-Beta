package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.util.StateSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
public final class eb0 implements Runnable {
    public final int f25747a;
    public final Object f25748b;

    public eb0(Object obj, int i10) {
        this.f25747a = i10;
        this.f25748b = obj;
    }

    @Override
    public final void run() {
        float f7;
        u61 u61Var;
        switch (this.f25747a) {
            case 0:
                ((gb0) this.f25748b).a();
                return;
            case 1:
                ((ob0) this.f25748b).invalidateSelf();
                return;
            case 2:
                ((k00) this.f25748b).invalidateSelf();
                return;
            case 3:
                ((jc0) this.f25748b).d();
                return;
            case 4:
                sc0 sc0Var = (sc0) this.f25748b;
                sc0Var.getClass();
                try {
                    sc0Var.d.M.performHapticFeedback(3, 2);
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 5:
                ((hd0) this.f25748b).f26702k1.start();
                return;
            case 6:
                gz gzVar = ((le0) this.f25748b).f28099c.f29051l0;
                if (gzVar != null) {
                    gzVar.c(false, true, false);
                    return;
                }
                return;
            case 7:
                ne0 ne0Var = (ne0) this.f25748b;
                ne0Var.f28779r = false;
                ne0Var.invalidate();
                return;
            case 8:
                ((pe0) this.f25748b).h = null;
                return;
            case 9:
                pe0 pe0Var = (pe0) ((m5.e) this.f25748b).f13014c;
                pe0Var.d.q0(pe0Var.e, false);
                return;
            case 10:
                org.telegram.ui.mr0 mr0Var = (org.telegram.ui.mr0) this.f25748b;
                if (mr0Var.f31243y) {
                    mr0Var.h("pollPosition();");
                }
                if (mr0Var.G) {
                    org.telegram.messenger.i0.h3(mr0Var.L, 500L);
                    return;
                }
                return;
            case 11:
                ((FrameLayout) this.f25748b).invalidate();
                return;
            case 12:
                jf0 jf0Var = (jf0) ((eg.b) this.f25748b).f6521b;
                jf0Var.d.invalidate();
                jf0Var.e.requestLayout();
                return;
            case 13:
                ((lf0) this.f25748b).f();
                return;
            case 14:
                try {
                    jh0 jh0Var = ((ih0) this.f25748b).f26980b;
                    if (jh0Var.getParent() instanceof ViewGroup) {
                        ((ViewGroup) jh0Var.getParent()).removeView(jh0Var);
                    }
                    jh0Var.Q.run();
                    return;
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                    return;
                }
            case 15:
                ((RLottieNative) this.f25748b).d();
                return;
            case 16:
                mj0 mj0Var = (mj0) this.f25748b;
                mj0Var.f28539x0 = null;
                mj0Var.j();
                lj0 lj0Var = mj0Var.f28513g0;
                if (lj0Var != null) {
                    lj0Var.t();
                    return;
                }
                return;
            case 17:
                ((jj0) this.f25748b).H.f27771a.setVisibility(4);
                return;
            case 18:
                nj0 nj0Var = (nj0) this.f25748b;
                u61 u61Var2 = nj0Var.f28805n;
                if (u61Var2 != null) {
                    boolean d02 = u61Var2.d0();
                    float S = ((float) nj0Var.f28805n.S()) / ((float) nj0Var.f28805n.U());
                    if (S < nj0Var.f28807s) {
                        nj0Var.f28805n.q0(f7 * ((float) u61Var.U()), false);
                    } else if (S > nj0Var.f28808w) {
                        nj0Var.setPlaying(false);
                        d02 = false;
                    }
                    if (d02) {
                        org.telegram.messenger.i0.h3(nj0Var.f28810y, 16L);
                    }
                }
                nj0Var.invalidate();
                return;
            case 19:
                tk0 tk0Var = (tk0) this.f25748b;
                tk0Var.T1 = null;
                tk0Var.S1 = null;
                org.telegram.ui.Cells.y yVar = tk0Var.B1;
                if (yVar != null) {
                    Drawable current = yVar.getCurrent();
                    if (current instanceof TransitionDrawable) {
                        ((TransitionDrawable) current).resetTransition();
                    }
                }
                org.telegram.ui.Cells.y yVar2 = tk0Var.B1;
                if (yVar2 != null && yVar2.isStateful()) {
                    tk0Var.B1.setState(StateSet.NOTHING);
                    return;
                }
                return;
            case 20:
                gl0 gl0Var = (gl0) this.f25748b;
                if (gl0Var.f26400e0 && gl0Var.j0() != gl0Var.f26404i0) {
                    gl0Var.q0("on screen, settled after start", true);
                    return;
                }
                return;
            case 21:
                gm0 gm0Var = (gm0) this.f25748b;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                int i10 = gm0Var.d;
                org.telegram.messenger.b8.G(i10).y(arrayList);
                org.telegram.messenger.b8.G(i10).Q(arrayList2);
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    org.telegram.messenger.b8.G(i10);
                    if (org.telegram.messenger.b8.N(((org.telegram.messenger.jj) arrayList.get(i11)).f16337k, false, true).exists()) {
                        arrayList3.add((org.telegram.messenger.jj) arrayList.get(i11));
                    }
                }
                for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                    org.telegram.messenger.b8.G(i10);
                    if (!org.telegram.messenger.b8.N(((org.telegram.messenger.jj) arrayList2.get(i12)).f16337k, false, true).exists()) {
                        arrayList4.add((org.telegram.messenger.jj) arrayList2.get(i12));
                    }
                }
                org.telegram.messenger.i0.g3(new jg(gm0Var, arrayList3, arrayList4, 17));
                return;
            case 22:
                ((im0) this.f25748b).invalidateSelf();
                return;
            case 23:
                ((rm0) this.f25748b).f29959f.setVisibility(8);
                return;
            case 24:
                ((org.telegram.ui.kx) this.f25748b).s();
                return;
            case 25:
                ((z60) this.f25748b).s();
                return;
            case 26:
                ((in0) this.f25748b).setOverscrolling(false);
                return;
            case 27:
                ((nn0) this.f25748b).getClass();
                return;
            case 28:
                org.telegram.ui.Cells.q1 q1Var = ((qn0) this.f25748b).f29698n;
                if (q1Var != null) {
                    q1Var.invalidate();
                    return;
                }
                return;
            default:
                rn0 rn0Var = (rn0) this.f25748b;
                rn0Var.f29981q = false;
                rn0Var.f29969b.run();
                return;
        }
    }
}
