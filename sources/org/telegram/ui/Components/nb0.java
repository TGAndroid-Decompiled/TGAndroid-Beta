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
    public final int f29448a;
    public final Object f29449b;

    public nb0(Object obj, int i10) {
        this.f29448a = i10;
        this.f29449b = obj;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        int i11;
        fl0 fl0Var;
        int i12 = this.f29448a;
        boolean z4 = false;
        Object obj = this.f29449b;
        switch (i12) {
            case 1:
                xg0 xg0Var = (xg0) obj;
                rg0 rg0Var = xg0Var.f33072b;
                if (i10 == 0 && xg0.H(xg0Var) + ((xg0Var.B - xg0.G(xg0Var)) - AndroidUtilities.dp(13.0f)) < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && rg0Var.canScrollVertically(1)) {
                    rg0Var.getChildAt(0);
                    fl0 fl0Var2 = (fl0) rg0Var.K(0);
                    if (fl0Var2 != null) {
                        View view = fl0Var2.f5875a;
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
                tl0 tl0Var = (tl0) obj;
                if (i10 == 0) {
                    if (tl0Var.f31395s2) {
                        tl0Var.f31395s2 = false;
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                    }
                } else if (!tl0Var.f31395s2 && tl0Var.f31398u1) {
                    tl0Var.f31395s2 = true;
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                }
                if (i10 != 0 && tl0Var.K1 != null) {
                    gg.d dVar = tl0Var.f31361b1;
                    if (dVar != null) {
                        AndroidUtilities.cancelRunOnUIThread(dVar);
                        tl0Var.f31361b1 = null;
                    }
                    MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                    try {
                        tl0Var.J1.J(obtain);
                    } catch (Exception e6) {
                        FileLog.e(e6);
                    }
                    tl0Var.K1.onTouchEvent(obtain);
                    obtain.recycle();
                    View view2 = tl0Var.K1;
                    tl0Var.h1(view2, 0.0f, 0.0f, false);
                    tl0Var.K1 = null;
                    tl0Var.k1(null, view2);
                    tl0Var.M1 = false;
                }
                f2.a1 a1Var = tl0Var.X0;
                if (a1Var != null) {
                    a1Var.a(recyclerView, i10);
                }
                z4 = (i10 == 1 || i10 == 2) ? true : true;
                tl0Var.H1 = z4;
                if (z4) {
                    tl0Var.I1 = true;
                    return;
                }
                return;
            case 4:
                en0 en0Var = (en0) obj;
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(en0Var.C.getCurrentFocus());
                }
                en0Var.a();
                return;
            case 8:
                s61 s61Var = (s61) obj;
                mh.d1 d1Var = s61Var.d;
                if (i10 == 0 && s61Var.D) {
                    int i13 = s61Var.f30996y;
                    i11 = ((org.telegram.ui.ActionBar.h3) s61Var).backgroundPaddingTop;
                    if (AndroidUtilities.dp(13.0f) + i11 + i13 < AndroidUtilities.statusBarHeight * 2 && d1Var.canScrollVertically(1) && (fl0Var = (fl0) d1Var.K(0)) != null) {
                        View view3 = fl0Var.f5875a;
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
                qh.o1 o1Var = (qh.o1) obj;
                if (i10 == 0 && o1Var.f45824n >= 0.0f && !o1Var.f45820b.canScrollVertically(-1)) {
                    o1Var.f45824n = -1.0f;
                    return;
                }
                return;
            case 17:
                th.f0 f0Var = (th.f0) obj;
                if (i10 == 0) {
                    f0Var.f48117e = !f0Var.d.canScrollVertically(-1);
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
        cl0 cl0Var;
        ViewGroup viewGroup;
        boolean z4;
        qh.s1 s1Var;
        ViewGroup viewGroup2;
        int i12;
        boolean z10;
        qh.s1 s1Var2;
        float f10;
        switch (this.f29448a) {
            case 0:
                sb0 sb0Var = (sb0) this.f29449b;
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
                xg0 xg0Var = (xg0) this.f29449b;
                if (xg0Var.f33072b.getChildCount() > 0) {
                    xg0.t(xg0Var);
                    return;
                }
                return;
            case 2:
                rk0 rk0Var = (rk0) this.f29449b;
                mh.d1 d1Var = rk0Var.f30755b;
                int[] iArr = rk0Var.f30759c0;
                if (recyclerView.getChildCount() > 2) {
                    recyclerView.getLocationInWindow(iArr);
                    int i14 = iArr[0];
                    View childAt2 = recyclerView.getChildAt(0);
                    childAt2.getLocationInWindow(iArr);
                    float min = ((1.0f - Math.min(1.0f, (-Math.min(iArr[0] - i14, 0.0f)) / childAt2.getWidth())) * 0.39999998f) + 0.6f;
                    if (Float.isNaN(min)) {
                        min = 1.0f;
                    }
                    rk0.b(rk0Var, childAt2, min);
                    View childAt3 = recyclerView.getChildAt(recyclerView.getChildCount() - 1);
                    childAt3.getLocationInWindow(iArr);
                    float min2 = ((1.0f - Math.min(1.0f, (-Math.min((recyclerView.getWidth() + i14) - (childAt3.getWidth() + iArr[0]), 0.0f)) / childAt3.getWidth())) * 0.39999998f) + 0.6f;
                    if (Float.isNaN(min2)) {
                        min2 = 1.0f;
                    }
                    rk0.b(rk0Var, childAt3, min2);
                }
                for (int i15 = 1; i15 < d1Var.getChildCount() - 1; i15++) {
                    rk0.b(rk0Var, d1Var.getChildAt(i15), 1.0f);
                }
                rk0Var.invalidate();
                return;
            case 3:
                tl0 tl0Var = (tl0) this.f29449b;
                Rect rect = tl0Var.D1;
                f2.a1 a1Var = tl0Var.X0;
                if (a1Var != null) {
                    a1Var.b(recyclerView, i10, i11);
                }
                if (tl0Var.B1 != -1) {
                    rect.offset(-i10, -i11);
                    org.telegram.ui.Cells.z zVar = tl0Var.A1;
                    if (zVar != null) {
                        zVar.setBounds(rect);
                    }
                    tl0Var.invalidate();
                } else {
                    rect.setEmpty();
                }
                tl0Var.K0(false);
                if (i11 != 0 && (cl0Var = tl0Var.f31363c1) != null) {
                    cl0Var.b();
                }
                gl0 gl0Var = tl0Var.R1;
                if (gl0Var != null) {
                    tl0Var.e1(gl0Var, 700, false);
                    return;
                }
                return;
            case 4:
            default:
                return;
            case 5:
                dv0.m((dv0) this.f29449b);
                return;
            case 6:
                ((gw0) this.f29449b).U.V();
                return;
            case 7:
                yx0.O((yx0) this.f29449b);
                return;
            case 8:
                ((s61) this.f29449b).K();
                return;
            case 9:
                ((l81) this.f29449b).invalidate();
                return;
            case 10:
                org.telegram.ui.web.p pVar = (org.telegram.ui.web.p) this.f29449b;
                if (!pVar.f25815a.canScrollVertically(1)) {
                    if (TextUtils.isEmpty(pVar.f42662s)) {
                        pVar.d.d();
                    } else {
                        org.telegram.ui.web.i iVar = pVar.f42658e;
                        if (iVar != null) {
                            iVar.d();
                        }
                    }
                }
                if (pVar.f25815a.H1) {
                    AndroidUtilities.hideKeyboard(pVar.fragmentView);
                    return;
                }
                return;
            case 11:
                org.telegram.ui.web.f1 f1Var = (org.telegram.ui.web.f1) this.f29449b;
                if (f1Var.f25815a.H1) {
                    AndroidUtilities.hideKeyboard(f1Var.fragmentView);
                    return;
                }
                return;
            case 12:
                qh.i1 i1Var = (qh.i1) this.f29449b;
                qh.g1 g1Var = i1Var.f45402c;
                qh.y1 y1Var = i1Var.f45406r;
                viewGroup = ((org.telegram.ui.ActionBar.h3) y1Var).containerView;
                viewGroup.invalidate();
                z4 = ((org.telegram.ui.ActionBar.h3) y1Var).keyboardVisible;
                if (z4 && i1Var.f45401b.H1 && (s1Var = i1Var.d) != null && s1Var.d != null) {
                    y1Var.o0();
                }
                if (i1Var.f45403e.M0() + 7 >= g1Var.h() - 1) {
                    g1Var.G();
                    return;
                }
                return;
            case 13:
                qh.o1 o1Var = (qh.o1) this.f29449b;
                qh.n1 n1Var = o1Var.f45821c;
                qh.d1 d1Var2 = o1Var.f45820b;
                qh.y1 y1Var2 = o1Var.f45826s;
                viewGroup2 = ((org.telegram.ui.ActionBar.h3) y1Var2).containerView;
                viewGroup2.invalidate();
                int i16 = -1;
                if (o1Var.f45824n < 0.0f) {
                    i12 = o1Var.d.I0();
                } else {
                    int i17 = 0;
                    while (true) {
                        if (i17 < d1Var2.getChildCount()) {
                            View childAt4 = d1Var2.getChildAt(i17);
                            if (childAt4.getY() + childAt4.getHeight() > o1Var.f45824n + d1Var2.getPaddingTop()) {
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
                int size = n1Var.f45763y.size() - 1;
                while (true) {
                    if (size >= 0) {
                        int keyAt = n1Var.f45763y.keyAt(size);
                        int valueAt = n1Var.f45763y.valueAt(size);
                        if (i12 >= keyAt) {
                            i16 = valueAt;
                        } else {
                            size--;
                        }
                    }
                }
                if (i16 >= 0) {
                    o1Var.f45822e.j(i16, true);
                }
                z10 = ((org.telegram.ui.ActionBar.h3) y1Var2).keyboardVisible;
                if (z10 && d1Var2.H1 && (s1Var2 = o1Var.f45823f) != null && s1Var2.d != null) {
                    y1Var2.o0();
                    return;
                }
                return;
            case 14:
                df dfVar = (df) this.f29449b;
                View m9 = dfVar.f47737c.getLayoutManager().m(0);
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
                sh.d3 d3Var = (sh.d3) this.f29449b;
                long j10 = d3Var.M;
                int i18 = 0;
                while (true) {
                    if (i18 < d3Var.f38941c.getChildCount()) {
                        if (!(d3Var.f38941c.getChildAt(i18) instanceof u00)) {
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
                th.q qVar = (th.q) this.f29449b;
                qVar.v.b(qVar.d);
                return;
            case 17:
                th.i0.M(((th.f0) this.f29449b).f48118f).invalidate();
                return;
            case 18:
                th.h0 h0Var = (th.h0) this.f29449b;
                h0Var.h.J.b(h0Var.d);
                return;
            case 19:
                vf.k.b0((vf.k) this.f29449b);
                return;
            case 20:
                vf.c0 c0Var = (vf.c0) this.f29449b;
                c0Var.f26546b.X1(c0Var, i11);
                c0Var.M();
                return;
        }
    }
}
