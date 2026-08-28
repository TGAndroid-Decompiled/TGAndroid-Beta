package org.telegram.ui.Components;

import android.graphics.Rect;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class kn extends f2.d1 {
    public final int f30205a;
    public final Object f30206b;

    public kn(Object obj, int i9) {
        this.f30205a = i9;
        this.f30206b = obj;
    }

    @Override
    public void a(RecyclerView recyclerView, int i9) {
        boolean z10;
        ik0 ik0Var;
        int i10 = this.f30205a;
        zf.n1 n1Var = null;
        Object obj = this.f30206b;
        boolean z11 = false;
        switch (i10) {
            case 5:
                v90 v90Var = (v90) obj;
                if (i9 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                v90Var.T2 = z10;
                if (i9 == 1) {
                    z11 = true;
                }
                v90Var.U2 = z11;
                return;
            case 7:
                ag0 ag0Var = (ag0) obj;
                uf0 uf0Var = ag0Var.f26783b;
                if (i9 == 0 && ag0.H(ag0Var) + ((ag0Var.A - ag0.G(ag0Var)) - AndroidUtilities.dp(13.0f)) < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && uf0Var.canScrollVertically(1)) {
                    uf0Var.getChildAt(0);
                    ik0 ik0Var2 = (ik0) uf0Var.K(0);
                    if (ik0Var2 != null) {
                        View view = ik0Var2.f5501a;
                        if (view.getTop() > AndroidUtilities.dp(7.0f)) {
                            uf0Var.v0(0, view.getTop() - AndroidUtilities.dp(7.0f), null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 9:
                wk0 wk0Var = (wk0) obj;
                if (i9 == 0) {
                    if (wk0Var.f34272r2) {
                        wk0Var.f34272r2 = false;
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                    }
                } else if (!wk0Var.f34272r2 && wk0Var.f34275t1) {
                    wk0Var.f34272r2 = true;
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                }
                if (i9 != 0 && wk0Var.J1 != null) {
                    ag.d dVar = wk0Var.f34239a1;
                    if (dVar != null) {
                        AndroidUtilities.cancelRunOnUIThread(dVar);
                        wk0Var.f34239a1 = null;
                    }
                    MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                    try {
                        wk0Var.I1.a1(obtain);
                    } catch (Exception e10) {
                        FileLog.e(e10);
                    }
                    wk0Var.J1.onTouchEvent(obtain);
                    obtain.recycle();
                    View view2 = wk0Var.J1;
                    wk0Var.h1(view2, 0.0f, 0.0f, false);
                    wk0Var.J1 = null;
                    wk0Var.k1(null, view2);
                    wk0Var.L1 = false;
                }
                f2.d1 d1Var = wk0Var.W0;
                if (d1Var != null) {
                    d1Var.a(recyclerView, i9);
                }
                z11 = (i9 == 1 || i9 == 2) ? true : true;
                wk0Var.G1 = z11;
                if (z11) {
                    wk0Var.H1 = true;
                    return;
                }
                return;
            case 10:
                gm0 gm0Var = (gm0) obj;
                if (i9 == 1) {
                    AndroidUtilities.hideKeyboard(gm0Var.B.getCurrentFocus());
                }
                gm0Var.a();
                return;
            case 14:
                s51 s51Var = (s51) obj;
                gh.f1 f1Var = s51Var.d;
                if (i9 == 0 && s51Var.C && AndroidUtilities.dp(13.0f) + s51.m(s51Var) + s51Var.f32378y < AndroidUtilities.statusBarHeight * 2 && f1Var.canScrollVertically(1) && (ik0Var = (ik0) f1Var.K(0)) != null) {
                    View view3 = ik0Var.f5501a;
                    if (view3.getTop() > 0) {
                        f1Var.v0(0, view3.getTop(), null);
                        return;
                    }
                    return;
                }
                return;
            case 20:
                if (i9 == 1) {
                    AndroidUtilities.hideKeyboard(((pf.t1) obj).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 21:
                zf.s0 s0Var = (zf.s0) obj;
                if (i9 == 1) {
                    s0Var.Z2 = true;
                }
                if (i9 == 0) {
                    for (int i11 = 0; i11 < recyclerView.getChildCount(); i11++) {
                        zf.n1 n1Var2 = (zf.n1) s0Var.getChildAt(i11);
                        if (n1Var == null || n1Var2.f50621a > n1Var.f50621a) {
                            n1Var = n1Var2;
                        }
                    }
                    if (n1Var != null) {
                        s0Var.w1(n1Var, true);
                        s0Var.Z2 = false;
                        s0Var.v0(0, n1Var.getTop() - ((s0Var.getMeasuredHeight() - n1Var.getMeasuredHeight()) / 2), AndroidUtilities.overshootInterpolator);
                    }
                    s0Var.x1();
                    return;
                }
                AndroidUtilities.cancelRunOnUIThread(s0Var.a3);
                return;
            default:
                return;
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i9, int i10) {
        int N0;
        int i11;
        String str;
        TLRPC.User user;
        String str2;
        fk0 fk0Var;
        switch (this.f30205a) {
            case 0:
                ln lnVar = (ln) this.f30206b;
                lnVar.f27493b.X1(lnVar, i10);
                return;
            case 1:
                cp cpVar = (cp) this.f30206b;
                if (cpVar.f27532x.M0() + 10 >= cpVar.h.h()) {
                    cpVar.w();
                    return;
                }
                return;
            case 2:
                dv dvVar = (dv) this.f30206b;
                tu tuVar = dvVar.f27817f;
                if (tuVar != null && dvVar.h.G1 && tuVar.f32817w) {
                    tuVar.f32817w = false;
                    tuVar.invalidate();
                    return;
                }
                return;
            case 3:
                vz vzVar = (vz) this.f30206b;
                vzVar.B.invalidate();
                vzVar.invalidate();
                return;
            case 4:
                yz.F((yz) this.f30206b);
                return;
            case 5:
                v90 v90Var = (v90) this.f30206b;
                f2.z0 layoutManager = v90Var.getLayoutManager();
                w90 w90Var = v90Var.X2;
                p90 p90Var = w90Var.d;
                if (layoutManager == p90Var) {
                    N0 = p90Var.N0();
                } else {
                    N0 = w90Var.f34157c.N0();
                }
                if (N0 == -1) {
                    i11 = 0;
                } else {
                    i11 = N0;
                }
                if (i11 > 0) {
                    of.f1 f1Var = w90Var.f34159f;
                    if (N0 > f1Var.H0 - 5 && f1Var.f19339q0 == 0 && (str = f1Var.f19337o0) != null && str.length() != 0 && (user = f1Var.f19343s0) != null && (str2 = f1Var.f19336n0) != null) {
                        f1Var.T(true, user, str2, f1Var.f19337o0);
                    }
                }
                v90Var.canScrollVertically(1);
                w90Var.n(!v90Var.canScrollVertically(-1));
                w90Var.b();
                return;
            case 6:
                wa0 wa0Var = (wa0) this.f30206b;
                fh.x4 x4Var = wa0Var.f34169b;
                pa0 pa0Var = wa0Var.f34172f;
                for (int i12 = 0; i12 < pa0Var.getChildCount(); i12++) {
                    View childAt = pa0Var.getChildAt(i12);
                    if (childAt instanceof org.telegram.ui.Cells.t1) {
                        ((org.telegram.ui.Cells.t1) childAt).Z3(x4Var.getMeasuredWidth(), x4Var.getBackgroundSizeY());
                    }
                }
                oa0 oa0Var = wa0Var.f34171e;
                if (oa0Var != null) {
                    oa0Var.x();
                    return;
                }
                return;
            case 7:
                ag0 ag0Var = (ag0) this.f30206b;
                if (ag0Var.f26783b.getChildCount() > 0) {
                    ag0.t(ag0Var);
                    return;
                }
                return;
            case 8:
                uj0 uj0Var = (uj0) this.f30206b;
                gh.f1 f1Var2 = uj0Var.f33045b;
                int[] iArr = uj0Var.f33046b0;
                if (recyclerView.getChildCount() > 2) {
                    recyclerView.getLocationInWindow(iArr);
                    int i13 = iArr[0];
                    View childAt2 = recyclerView.getChildAt(0);
                    childAt2.getLocationInWindow(iArr);
                    float min = ((1.0f - Math.min(1.0f, (-Math.min(iArr[0] - i13, 0.0f)) / childAt2.getWidth())) * 0.39999998f) + 0.6f;
                    if (Float.isNaN(min)) {
                        min = 1.0f;
                    }
                    uj0.b(uj0Var, childAt2, min);
                    View childAt3 = recyclerView.getChildAt(recyclerView.getChildCount() - 1);
                    childAt3.getLocationInWindow(iArr);
                    float min2 = ((1.0f - Math.min(1.0f, (-Math.min((recyclerView.getWidth() + i13) - (childAt3.getWidth() + iArr[0]), 0.0f)) / childAt3.getWidth())) * 0.39999998f) + 0.6f;
                    if (Float.isNaN(min2)) {
                        min2 = 1.0f;
                    }
                    uj0.b(uj0Var, childAt3, min2);
                }
                for (int i14 = 1; i14 < f1Var2.getChildCount() - 1; i14++) {
                    uj0.b(uj0Var, f1Var2.getChildAt(i14), 1.0f);
                }
                uj0Var.invalidate();
                return;
            case 9:
                wk0 wk0Var = (wk0) this.f30206b;
                Rect rect = wk0Var.C1;
                f2.d1 d1Var = wk0Var.W0;
                if (d1Var != null) {
                    d1Var.b(recyclerView, i9, i10);
                }
                if (wk0Var.A1 != -1) {
                    rect.offset(-i9, -i10);
                    org.telegram.ui.Cells.z zVar = wk0Var.f34287z1;
                    if (zVar != null) {
                        zVar.setBounds(rect);
                    }
                    wk0Var.invalidate();
                } else {
                    rect.setEmpty();
                }
                wk0Var.K0(false);
                if (i10 != 0 && (fk0Var = wk0Var.f34240b1) != null) {
                    fk0Var.b();
                }
                jk0 jk0Var = wk0Var.Q1;
                if (jk0Var != null) {
                    wk0Var.e1(jk0Var, 700, false);
                    return;
                }
                return;
            case 10:
            case 20:
            default:
                return;
            case 11:
                iu0.m((iu0) this.f30206b);
                return;
            case 12:
                ((mv0) this.f30206b).T.V();
                return;
            case 13:
                cx0.N((cx0) this.f30206b);
                return;
            case 14:
                ((s51) this.f30206b).K();
                return;
            case 15:
                ((m71) this.f30206b).invalidate();
                return;
            case 16:
                org.telegram.ui.web.o oVar = (org.telegram.ui.web.o) this.f30206b;
                if (!oVar.f27658a.canScrollVertically(1)) {
                    if (TextUtils.isEmpty(oVar.f43946s)) {
                        oVar.d.d();
                    } else {
                        org.telegram.ui.web.i iVar = oVar.f43942e;
                        if (iVar != null) {
                            iVar.d();
                        }
                    }
                }
                if (oVar.f27658a.G1) {
                    AndroidUtilities.hideKeyboard(oVar.fragmentView);
                    return;
                }
                return;
            case 17:
                org.telegram.ui.web.c1 c1Var = (org.telegram.ui.web.c1) this.f30206b;
                if (c1Var.f27658a.G1) {
                    AndroidUtilities.hideKeyboard(c1Var.fragmentView);
                    return;
                }
                return;
            case 18:
                pf.l.a0((pf.l) this.f30206b);
                return;
            case 19:
                pf.e0 e0Var = (pf.e0) this.f30206b;
                e0Var.f27493b.X1(e0Var, i10);
                e0Var.L();
                return;
            case 21:
                zf.s0 s0Var = (zf.s0) this.f30206b;
                if (recyclerView.getScrollState() == 1) {
                    s0Var.w1(null, true);
                }
                s0Var.invalidate();
                return;
        }
    }
}
