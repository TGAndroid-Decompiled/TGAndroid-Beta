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
public final class nb0 extends f2.a1 {
    public final int f29426a;
    public final Object f29427b;

    public nb0(Object obj, int i10) {
        this.f29426a = i10;
        this.f29427b = obj;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        int i11;
        el0 el0Var;
        int i12 = this.f29426a;
        boolean z4 = false;
        Object obj = this.f29427b;
        switch (i12) {
            case 1:
                xg0 xg0Var = (xg0) obj;
                rg0 rg0Var = xg0Var.f33066b;
                if (i10 == 0 && xg0.H(xg0Var) + ((xg0Var.B - xg0.G(xg0Var)) - AndroidUtilities.dp(13.0f)) < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && rg0Var.canScrollVertically(1)) {
                    rg0Var.getChildAt(0);
                    el0 el0Var2 = (el0) rg0Var.K(0);
                    if (el0Var2 != null) {
                        View view = el0Var2.f5875a;
                        if (view.getTop() > AndroidUtilities.dp(7.0f)) {
                            rg0Var.v0(0, view.getTop() - AndroidUtilities.dp(7.0f), null);
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
                    if (sl0Var.f31118s2) {
                        sl0Var.f31118s2 = false;
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                    }
                } else if (!sl0Var.f31118s2 && sl0Var.f31121u1) {
                    sl0Var.f31118s2 = true;
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                }
                if (i10 != 0 && sl0Var.K1 != null) {
                    gg.d dVar = sl0Var.f31084b1;
                    if (dVar != null) {
                        AndroidUtilities.cancelRunOnUIThread(dVar);
                        sl0Var.f31084b1 = null;
                    }
                    MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                    try {
                        sl0Var.J1.J(obtain);
                    } catch (Exception e6) {
                        FileLog.e(e6);
                    }
                    sl0Var.K1.onTouchEvent(obtain);
                    obtain.recycle();
                    View view2 = sl0Var.K1;
                    sl0Var.g1(view2, 0.0f, 0.0f, false);
                    sl0Var.K1 = null;
                    sl0Var.j1(null, view2);
                    sl0Var.M1 = false;
                }
                f2.a1 a1Var = sl0Var.X0;
                if (a1Var != null) {
                    a1Var.a(recyclerView, i10);
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
                r61 r61Var = (r61) obj;
                mh.d1 d1Var = r61Var.d;
                if (i10 == 0 && r61Var.D) {
                    int i13 = r61Var.f30673y;
                    i11 = ((org.telegram.ui.ActionBar.h3) r61Var).backgroundPaddingTop;
                    if (AndroidUtilities.dp(13.0f) + i11 + i13 < AndroidUtilities.statusBarHeight * 2 && d1Var.canScrollVertically(1) && (el0Var = (el0) d1Var.K(0)) != null) {
                        View view3 = el0Var.f5875a;
                        if (view3.getTop() > 0) {
                            d1Var.v0(0, view3.getTop(), null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 13:
                qh.n1 n1Var = (qh.n1) obj;
                if (i10 == 0 && n1Var.f45796n >= 0.0f && !n1Var.f45792b.canScrollVertically(-1)) {
                    n1Var.f45796n = -1.0f;
                    return;
                }
                return;
            case 17:
                th.f0 f0Var = (th.f0) obj;
                if (i10 == 0) {
                    f0Var.f48153e = !f0Var.d.canScrollVertically(-1);
                    f0Var.d.canScrollVertically(1);
                    return;
                }
                return;
            case 21:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((vf.r1) obj).getParentActivity().getCurrentFocus());
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
        qh.r1 r1Var;
        ViewGroup viewGroup2;
        int i12;
        boolean z10;
        qh.r1 r1Var2;
        float f10;
        switch (this.f29426a) {
            case 0:
                sb0 sb0Var = (sb0) this.f29427b;
                lh.j4 j4Var = sb0Var.f31028b;
                kb0 kb0Var = sb0Var.f31031f;
                for (int i13 = 0; i13 < kb0Var.getChildCount(); i13++) {
                    View childAt = kb0Var.getChildAt(i13);
                    if (childAt instanceof org.telegram.ui.Cells.t1) {
                        ((org.telegram.ui.Cells.t1) childAt).Z3(j4Var.getMeasuredWidth(), j4Var.getBackgroundSizeY());
                    }
                }
                jb0 jb0Var = sb0Var.f31030e;
                if (jb0Var != null) {
                    jb0Var.x();
                    return;
                }
                return;
            case 1:
                xg0 xg0Var = (xg0) this.f29427b;
                if (xg0Var.f33066b.getChildCount() > 0) {
                    xg0.t(xg0Var);
                    return;
                }
                return;
            case 2:
                qk0 qk0Var = (qk0) this.f29427b;
                mh.d1 d1Var = qk0Var.f30426b;
                int[] iArr = qk0Var.f30430c0;
                if (recyclerView.getChildCount() > 2) {
                    recyclerView.getLocationInWindow(iArr);
                    int i14 = iArr[0];
                    View childAt2 = recyclerView.getChildAt(0);
                    childAt2.getLocationInWindow(iArr);
                    float min = ((1.0f - Math.min(1.0f, (-Math.min(iArr[0] - i14, 0.0f)) / childAt2.getWidth())) * 0.39999998f) + 0.6f;
                    if (Float.isNaN(min)) {
                        min = 1.0f;
                    }
                    qk0.b(qk0Var, childAt2, min);
                    View childAt3 = recyclerView.getChildAt(recyclerView.getChildCount() - 1);
                    childAt3.getLocationInWindow(iArr);
                    float min2 = ((1.0f - Math.min(1.0f, (-Math.min((recyclerView.getWidth() + i14) - (childAt3.getWidth() + iArr[0]), 0.0f)) / childAt3.getWidth())) * 0.39999998f) + 0.6f;
                    if (Float.isNaN(min2)) {
                        min2 = 1.0f;
                    }
                    qk0.b(qk0Var, childAt3, min2);
                }
                for (int i15 = 1; i15 < d1Var.getChildCount() - 1; i15++) {
                    qk0.b(qk0Var, d1Var.getChildAt(i15), 1.0f);
                }
                qk0Var.invalidate();
                return;
            case 3:
                sl0 sl0Var = (sl0) this.f29427b;
                Rect rect = sl0Var.D1;
                f2.a1 a1Var = sl0Var.X0;
                if (a1Var != null) {
                    a1Var.b(recyclerView, i10, i11);
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
                if (i11 != 0 && (bl0Var = sl0Var.f31086c1) != null) {
                    bl0Var.b();
                }
                fl0 fl0Var = sl0Var.R1;
                if (fl0Var != null) {
                    sl0Var.d1(fl0Var, 700, false);
                    return;
                }
                return;
            case 4:
            default:
                return;
            case 5:
                cv0.m((cv0) this.f29427b);
                return;
            case 6:
                ((fw0) this.f29427b).U.V();
                return;
            case 7:
                xx0.O((xx0) this.f29427b);
                return;
            case 8:
                ((r61) this.f29427b).K();
                return;
            case 9:
                ((k81) this.f29427b).invalidate();
                return;
            case 10:
                org.telegram.ui.web.p pVar = (org.telegram.ui.web.p) this.f29427b;
                if (!pVar.f25523a.canScrollVertically(1)) {
                    if (TextUtils.isEmpty(pVar.f42625s)) {
                        pVar.d.d();
                    } else {
                        org.telegram.ui.web.i iVar = pVar.f42621e;
                        if (iVar != null) {
                            iVar.d();
                        }
                    }
                }
                if (pVar.f25523a.H1) {
                    AndroidUtilities.hideKeyboard(pVar.fragmentView);
                    return;
                }
                return;
            case 11:
                org.telegram.ui.web.f1 f1Var = (org.telegram.ui.web.f1) this.f29427b;
                if (f1Var.f25523a.H1) {
                    AndroidUtilities.hideKeyboard(f1Var.fragmentView);
                    return;
                }
                return;
            case 12:
                qh.h1 h1Var = (qh.h1) this.f29427b;
                qh.f1 f1Var2 = h1Var.f45384c;
                qh.x1 x1Var = h1Var.f45388r;
                viewGroup = ((org.telegram.ui.ActionBar.h3) x1Var).containerView;
                viewGroup.invalidate();
                z4 = ((org.telegram.ui.ActionBar.h3) x1Var).keyboardVisible;
                if (z4 && h1Var.f45383b.H1 && (r1Var = h1Var.d) != null && r1Var.d != null) {
                    x1Var.o0();
                }
                if (h1Var.f45385e.M0() + 7 >= f1Var2.h() - 1) {
                    f1Var2.G();
                    return;
                }
                return;
            case 13:
                qh.n1 n1Var = (qh.n1) this.f29427b;
                qh.m1 m1Var = n1Var.f45793c;
                qh.d1 d1Var2 = n1Var.f45792b;
                qh.x1 x1Var2 = n1Var.f45798s;
                viewGroup2 = ((org.telegram.ui.ActionBar.h3) x1Var2).containerView;
                viewGroup2.invalidate();
                int i16 = -1;
                if (n1Var.f45796n < 0.0f) {
                    i12 = n1Var.d.I0();
                } else {
                    int i17 = 0;
                    while (true) {
                        if (i17 < d1Var2.getChildCount()) {
                            View childAt4 = d1Var2.getChildAt(i17);
                            if (childAt4.getY() + childAt4.getHeight() > n1Var.f45796n + d1Var2.getPaddingTop()) {
                                d1Var2.getClass();
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
                int size = m1Var.f45740y.size() - 1;
                while (true) {
                    if (size >= 0) {
                        int keyAt = m1Var.f45740y.keyAt(size);
                        int valueAt = m1Var.f45740y.valueAt(size);
                        if (i12 >= keyAt) {
                            i16 = valueAt;
                        } else {
                            size--;
                        }
                    }
                }
                if (i16 >= 0) {
                    n1Var.f45794e.j(i16, true);
                }
                z10 = ((org.telegram.ui.ActionBar.h3) x1Var2).keyboardVisible;
                if (z10 && d1Var2.H1 && (r1Var2 = n1Var.f45795f) != null && r1Var2.d != null) {
                    x1Var2.o0();
                    return;
                }
                return;
            case 14:
                df dfVar = (df) this.f29427b;
                View m9 = dfVar.f47773c.getLayoutManager().m(0);
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
                sh.d3 d3Var = (sh.d3) this.f29427b;
                long j10 = d3Var.M;
                int i18 = 0;
                while (true) {
                    if (i18 < d3Var.f38834c.getChildCount()) {
                        if (!(d3Var.f38834c.getChildAt(i18) instanceof u00)) {
                            i18++;
                        }
                    } else if (recyclerView.canScrollVertically(1)) {
                        return;
                    }
                }
                mh.a0.g(sh.d3.C0(d3Var)).d(j10).a();
                mh.a0.g(sh.d3.D0(d3Var)).e(j10).a();
                return;
            case 16:
                th.q qVar = (th.q) this.f29427b;
                qVar.v.b(qVar.d);
                return;
            case 17:
                th.i0.M(((th.f0) this.f29427b).f48154f).invalidate();
                return;
            case 18:
                th.h0 h0Var = (th.h0) this.f29427b;
                h0Var.h.J.b(h0Var.d);
                return;
            case 19:
                vf.k.b0((vf.k) this.f29427b);
                return;
            case 20:
                vf.c0 c0Var = (vf.c0) this.f29427b;
                c0Var.f26590b.X1(c0Var, i11);
                c0Var.M();
                return;
        }
    }
}
