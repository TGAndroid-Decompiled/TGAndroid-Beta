package org.telegram.ui.Components;

import android.graphics.Rect;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.NotificationCenter;
public final class lb0 extends f2.z0 {
    public final int f26612a;
    public final Object f26613b;

    public lb0(Object obj, int i10) {
        this.f26612a = i10;
        this.f26613b = obj;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        int i11;
        el0 el0Var;
        int i12 = this.f26612a;
        boolean z4 = false;
        Object obj = this.f26613b;
        switch (i12) {
            case 1:
                vg0 vg0Var = (vg0) obj;
                pg0 pg0Var = vg0Var.f29461b;
                if (i10 == 0 && vg0.H(vg0Var) + ((vg0Var.B - vg0.G(vg0Var)) - AndroidUtilities.dp(13.0f)) < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && pg0Var.canScrollVertically(1)) {
                    pg0Var.getChildAt(0);
                    el0 el0Var2 = (el0) pg0Var.K(0);
                    if (el0Var2 != null) {
                        View view = el0Var2.f5785a;
                        if (view.getTop() > AndroidUtilities.dp(7.0f)) {
                            pg0Var.v0(0, view.getTop() - AndroidUtilities.dp(7.0f), null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 3:
                sl0 sl0Var = (sl0) obj;
                if (i10 == 0) {
                    if (sl0Var.f28762s2) {
                        sl0Var.f28762s2 = false;
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                    }
                } else if (!sl0Var.f28762s2 && sl0Var.f28765u1) {
                    sl0Var.f28762s2 = true;
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                }
                if (i10 != 0 && sl0Var.K1 != null) {
                    fg.d dVar = sl0Var.f28728b1;
                    if (dVar != null) {
                        AndroidUtilities.cancelRunOnUIThread(dVar);
                        sl0Var.f28728b1 = null;
                    }
                    MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                    try {
                        sl0Var.J1.v0(obtain);
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                    sl0Var.K1.onTouchEvent(obtain);
                    obtain.recycle();
                    View view2 = sl0Var.K1;
                    sl0Var.h1(view2, 0.0f, 0.0f, false);
                    sl0Var.K1 = null;
                    sl0Var.k1(null, view2);
                    sl0Var.M1 = false;
                }
                f2.z0 z0Var = sl0Var.X0;
                if (z0Var != null) {
                    z0Var.a(recyclerView, i10);
                }
                z4 = (i10 == 1 || i10 == 2) ? true : true;
                sl0Var.H1 = z4;
                if (z4) {
                    sl0Var.I1 = true;
                    return;
                }
                return;
            case 4:
                dn0 dn0Var = (dn0) obj;
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(dn0Var.C.getCurrentFocus());
                }
                dn0Var.a();
                return;
            case 8:
                q61 q61Var = (q61) obj;
                lh.e1 e1Var = q61Var.d;
                if (i10 == 0 && q61Var.D) {
                    int i13 = q61Var.f28074y;
                    i11 = ((org.telegram.ui.ActionBar.g3) q61Var).backgroundPaddingTop;
                    if (AndroidUtilities.dp(13.0f) + i11 + i13 < AndroidUtilities.statusBarHeight * 2 && e1Var.canScrollVertically(1) && (el0Var = (el0) e1Var.K(0)) != null) {
                        View view3 = el0Var.f5785a;
                        if (view3.getTop() > 0) {
                            e1Var.v0(0, view3.getTop(), null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 13:
                ph.o1 o1Var = (ph.o1) obj;
                if (i10 == 0 && o1Var.f42041n >= 0.0f && !o1Var.f42038b.canScrollVertically(-1)) {
                    o1Var.f42041n = -1.0f;
                    return;
                }
                return;
            case 17:
                sh.f0 f0Var = (sh.f0) obj;
                if (i10 == 0) {
                    f0Var.e = !f0Var.d.canScrollVertically(-1);
                    f0Var.d.canScrollVertically(1);
                    return;
                }
                return;
            case 21:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((uf.r1) obj).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i10, int i11) {
        bl0 bl0Var;
        ViewGroup viewGroup;
        boolean z4;
        ph.s1 s1Var;
        ViewGroup viewGroup2;
        int i12;
        boolean z10;
        ph.s1 s1Var2;
        float f10;
        switch (this.f26612a) {
            case 0:
                qb0 qb0Var = (qb0) this.f26613b;
                kh.j4 j4Var = qb0Var.f28103b;
                ib0 ib0Var = qb0Var.f28105f;
                for (int i13 = 0; i13 < ib0Var.getChildCount(); i13++) {
                    View childAt = ib0Var.getChildAt(i13);
                    if (childAt instanceof org.telegram.ui.Cells.t1) {
                        ((org.telegram.ui.Cells.t1) childAt).Z3(j4Var.getMeasuredWidth(), j4Var.getBackgroundSizeY());
                    }
                }
                hb0 hb0Var = qb0Var.e;
                if (hb0Var != null) {
                    hb0Var.x();
                    return;
                }
                return;
            case 1:
                vg0 vg0Var = (vg0) this.f26613b;
                if (vg0Var.f29461b.getChildCount() > 0) {
                    vg0.t(vg0Var);
                    return;
                }
                return;
            case 2:
                pk0 pk0Var = (pk0) this.f26613b;
                lh.e1 e1Var = pk0Var.f27888b;
                int[] iArr = pk0Var.f27892c0;
                if (recyclerView.getChildCount() > 2) {
                    recyclerView.getLocationInWindow(iArr);
                    int i14 = iArr[0];
                    View childAt2 = recyclerView.getChildAt(0);
                    childAt2.getLocationInWindow(iArr);
                    float min = ((1.0f - Math.min(1.0f, (-Math.min(iArr[0] - i14, 0.0f)) / childAt2.getWidth())) * 0.39999998f) + 0.6f;
                    if (Float.isNaN(min)) {
                        min = 1.0f;
                    }
                    pk0.b(pk0Var, childAt2, min);
                    View childAt3 = recyclerView.getChildAt(recyclerView.getChildCount() - 1);
                    childAt3.getLocationInWindow(iArr);
                    float min2 = ((1.0f - Math.min(1.0f, (-Math.min((recyclerView.getWidth() + i14) - (childAt3.getWidth() + iArr[0]), 0.0f)) / childAt3.getWidth())) * 0.39999998f) + 0.6f;
                    if (Float.isNaN(min2)) {
                        min2 = 1.0f;
                    }
                    pk0.b(pk0Var, childAt3, min2);
                }
                for (int i15 = 1; i15 < e1Var.getChildCount() - 1; i15++) {
                    pk0.b(pk0Var, e1Var.getChildAt(i15), 1.0f);
                }
                pk0Var.invalidate();
                return;
            case 3:
                sl0 sl0Var = (sl0) this.f26613b;
                Rect rect = sl0Var.D1;
                f2.z0 z0Var = sl0Var.X0;
                if (z0Var != null) {
                    z0Var.b(recyclerView, i10, i11);
                }
                if (sl0Var.B1 != -1) {
                    rect.offset(-i10, -i11);
                    org.telegram.ui.Cells.z zVar = sl0Var.A1;
                    if (zVar != null) {
                        zVar.setBounds(rect);
                    }
                    sl0Var.invalidate();
                } else {
                    rect.setEmpty();
                }
                sl0Var.K0(false);
                if (i11 != 0 && (bl0Var = sl0Var.f28730c1) != null) {
                    bl0Var.b();
                }
                fl0 fl0Var = sl0Var.R1;
                if (fl0Var != null) {
                    sl0Var.e1(fl0Var, 700, false);
                    return;
                }
                return;
            case 4:
            default:
                return;
            case 5:
                cv0.m((cv0) this.f26613b);
                return;
            case 6:
                ((fw0) this.f26613b).U.V();
                return;
            case 7:
                xx0.O((xx0) this.f26613b);
                return;
            case 8:
                ((q61) this.f26613b).K();
                return;
            case 9:
                ((k81) this.f26613b).invalidate();
                return;
            case 10:
                org.telegram.ui.web.p pVar = (org.telegram.ui.web.p) this.f26613b;
                if (!pVar.f23580a.canScrollVertically(1)) {
                    if (TextUtils.isEmpty(pVar.f39599s)) {
                        pVar.d.d();
                    } else {
                        org.telegram.ui.web.i iVar = pVar.e;
                        if (iVar != null) {
                            iVar.d();
                        }
                    }
                }
                if (pVar.f23580a.H1) {
                    AndroidUtilities.hideKeyboard(pVar.fragmentView);
                    return;
                }
                return;
            case 11:
                org.telegram.ui.web.e1 e1Var2 = (org.telegram.ui.web.e1) this.f26613b;
                if (e1Var2.f23580a.H1) {
                    AndroidUtilities.hideKeyboard(e1Var2.fragmentView);
                    return;
                }
                return;
            case 12:
                ph.i1 i1Var = (ph.i1) this.f26613b;
                ph.g1 g1Var = i1Var.f41734c;
                ph.y1 y1Var = i1Var.f41737r;
                viewGroup = ((org.telegram.ui.ActionBar.g3) y1Var).containerView;
                viewGroup.invalidate();
                z4 = ((org.telegram.ui.ActionBar.g3) y1Var).keyboardVisible;
                if (z4 && i1Var.f41733b.H1 && (s1Var = i1Var.d) != null && s1Var.d != null) {
                    y1Var.o0();
                }
                if (i1Var.e.M0() + 7 >= g1Var.h() - 1) {
                    g1Var.G();
                    return;
                }
                return;
            case 13:
                ph.o1 o1Var = (ph.o1) this.f26613b;
                ph.n1 n1Var = o1Var.f42039c;
                ph.d1 d1Var = o1Var.f42038b;
                ph.y1 y1Var2 = o1Var.f42043s;
                viewGroup2 = ((org.telegram.ui.ActionBar.g3) y1Var2).containerView;
                viewGroup2.invalidate();
                int i16 = -1;
                if (o1Var.f42041n < 0.0f) {
                    i12 = o1Var.d.I0();
                } else {
                    int i17 = 0;
                    while (true) {
                        if (i17 < d1Var.getChildCount()) {
                            View childAt4 = d1Var.getChildAt(i17);
                            if (childAt4.getY() + childAt4.getHeight() > o1Var.f42041n + d1Var.getPaddingTop()) {
                                d1Var.getClass();
                                i12 = RecyclerView.R(childAt4);
                            } else {
                                i17++;
                            }
                        } else {
                            i12 = -1;
                        }
                    }
                    if (i12 == -1) {
                        return;
                    }
                }
                int size = n1Var.f42003y.size() - 1;
                while (true) {
                    if (size >= 0) {
                        int keyAt = n1Var.f42003y.keyAt(size);
                        int valueAt = n1Var.f42003y.valueAt(size);
                        if (i12 >= keyAt) {
                            i16 = valueAt;
                        } else {
                            size--;
                        }
                    }
                }
                if (i16 >= 0) {
                    o1Var.e.j(i16, true);
                }
                z10 = ((org.telegram.ui.ActionBar.g3) y1Var2).keyboardVisible;
                if (z10 && d1Var.H1 && (s1Var2 = o1Var.f42040f) != null && s1Var2.d != null) {
                    y1Var2.o0();
                    return;
                }
                return;
            case 14:
                df dfVar = (df) this.f26613b;
                View m9 = dfVar.f43821c.getLayoutManager().m(0);
                float f11 = 0.0f;
                if (m9 != null) {
                    f10 = m9.getY();
                } else {
                    f10 = 0.0f;
                }
                if (f10 >= 0.0f) {
                    f11 = f10;
                }
                dfVar.h = f11;
                dfVar.b();
                return;
            case 15:
                rh.e3 e3Var = (rh.e3) this.f26613b;
                long j10 = e3Var.M;
                int i18 = 0;
                while (true) {
                    if (i18 < e3Var.f35881c.getChildCount()) {
                        if (!(e3Var.f35881c.getChildAt(i18) instanceof t00)) {
                            i18++;
                        }
                    } else if (recyclerView.canScrollVertically(1)) {
                        return;
                    }
                }
                lh.b0.g(rh.e3.C0(e3Var)).d(j10).a();
                lh.b0.g(rh.e3.D0(e3Var)).e(j10).a();
                return;
            case 16:
                sh.q qVar = (sh.q) this.f26613b;
                qVar.v.b(qVar.d);
                return;
            case 17:
                sh.i0.M(((sh.f0) this.f26613b).f44338f).invalidate();
                return;
            case 18:
                sh.h0 h0Var = (sh.h0) this.f26613b;
                h0Var.h.J.b(h0Var.d);
                return;
            case 19:
                uf.k.b0((uf.k) this.f26613b);
                return;
            case 20:
                uf.c0 c0Var = (uf.c0) this.f26613b;
                c0Var.f24278b.X1(c0Var, i11);
                c0Var.M();
                return;
        }
    }
}
