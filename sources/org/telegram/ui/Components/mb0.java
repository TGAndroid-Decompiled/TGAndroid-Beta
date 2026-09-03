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
public final class mb0 extends f2.z0 {
    public final int f27006a;
    public final Object f27007b;

    public mb0(Object obj, int i10) {
        this.f27006a = i10;
        this.f27007b = obj;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        int i11;
        dl0 dl0Var;
        int i12 = this.f27006a;
        boolean z4 = false;
        Object obj = this.f27007b;
        switch (i12) {
            case 1:
                wg0 wg0Var = (wg0) obj;
                qg0 qg0Var = wg0Var.f30249b;
                if (i10 == 0 && wg0.H(wg0Var) + ((wg0Var.B - wg0.G(wg0Var)) - AndroidUtilities.dp(13.0f)) < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && qg0Var.canScrollVertically(1)) {
                    qg0Var.getChildAt(0);
                    dl0 dl0Var2 = (dl0) qg0Var.K(0);
                    if (dl0Var2 != null) {
                        View view = dl0Var2.f5774a;
                        if (view.getTop() > AndroidUtilities.dp(7.0f)) {
                            qg0Var.v0(0, view.getTop() - AndroidUtilities.dp(7.0f), null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 3:
                rl0 rl0Var = (rl0) obj;
                if (i10 == 0) {
                    if (rl0Var.f28523s2) {
                        rl0Var.f28523s2 = false;
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                    }
                } else if (!rl0Var.f28523s2 && rl0Var.f28526u1) {
                    rl0Var.f28523s2 = true;
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                }
                if (i10 != 0 && rl0Var.K1 != null) {
                    fg.d dVar = rl0Var.f28489b1;
                    if (dVar != null) {
                        AndroidUtilities.cancelRunOnUIThread(dVar);
                        rl0Var.f28489b1 = null;
                    }
                    MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                    try {
                        rl0Var.J1.w2(obtain);
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                    rl0Var.K1.onTouchEvent(obtain);
                    obtain.recycle();
                    View view2 = rl0Var.K1;
                    rl0Var.g1(view2, 0.0f, 0.0f, false);
                    rl0Var.K1 = null;
                    rl0Var.j1(null, view2);
                    rl0Var.M1 = false;
                }
                f2.z0 z0Var = rl0Var.X0;
                if (z0Var != null) {
                    z0Var.a(recyclerView, i10);
                }
                z4 = (i10 == 1 || i10 == 2) ? true : true;
                rl0Var.H1 = z4;
                if (z4) {
                    rl0Var.I1 = true;
                    return;
                }
                return;
            case 4:
                cn0 cn0Var = (cn0) obj;
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(cn0Var.C.getCurrentFocus());
                }
                cn0Var.a();
                return;
            case 8:
                q61 q61Var = (q61) obj;
                lh.e1 e1Var = q61Var.d;
                if (i10 == 0 && q61Var.D) {
                    int i13 = q61Var.f28098y;
                    i11 = ((org.telegram.ui.ActionBar.g3) q61Var).backgroundPaddingTop;
                    if (AndroidUtilities.dp(13.0f) + i11 + i13 < AndroidUtilities.statusBarHeight * 2 && e1Var.canScrollVertically(1) && (dl0Var = (dl0) e1Var.K(0)) != null) {
                        View view3 = dl0Var.f5774a;
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
                ph.n1 n1Var = (ph.n1) obj;
                if (i10 == 0 && n1Var.f42038n >= 0.0f && !n1Var.f42035b.canScrollVertically(-1)) {
                    n1Var.f42038n = -1.0f;
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
        al0 al0Var;
        ViewGroup viewGroup;
        boolean z4;
        ph.r1 r1Var;
        ViewGroup viewGroup2;
        int i12;
        boolean z10;
        ph.r1 r1Var2;
        float f10;
        switch (this.f27006a) {
            case 0:
                rb0 rb0Var = (rb0) this.f27007b;
                kh.i4 i4Var = rb0Var.f28441b;
                jb0 jb0Var = rb0Var.f28443f;
                for (int i13 = 0; i13 < jb0Var.getChildCount(); i13++) {
                    View childAt = jb0Var.getChildAt(i13);
                    if (childAt instanceof org.telegram.ui.Cells.s1) {
                        ((org.telegram.ui.Cells.s1) childAt).Z3(i4Var.getMeasuredWidth(), i4Var.getBackgroundSizeY());
                    }
                }
                ib0 ib0Var = rb0Var.e;
                if (ib0Var != null) {
                    ib0Var.x();
                    return;
                }
                return;
            case 1:
                wg0 wg0Var = (wg0) this.f27007b;
                if (wg0Var.f30249b.getChildCount() > 0) {
                    wg0.t(wg0Var);
                    return;
                }
                return;
            case 2:
                pk0 pk0Var = (pk0) this.f27007b;
                lh.e1 e1Var = pk0Var.f27883b;
                int[] iArr = pk0Var.f27887c0;
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
                rl0 rl0Var = (rl0) this.f27007b;
                Rect rect = rl0Var.D1;
                f2.z0 z0Var = rl0Var.X0;
                if (z0Var != null) {
                    z0Var.b(recyclerView, i10, i11);
                }
                if (rl0Var.B1 != -1) {
                    rect.offset(-i10, -i11);
                    org.telegram.ui.Cells.z zVar = rl0Var.A1;
                    if (zVar != null) {
                        zVar.setBounds(rect);
                    }
                    rl0Var.invalidate();
                } else {
                    rect.setEmpty();
                }
                rl0Var.K0(false);
                if (i11 != 0 && (al0Var = rl0Var.f28491c1) != null) {
                    al0Var.b();
                }
                el0 el0Var = rl0Var.R1;
                if (el0Var != null) {
                    rl0Var.d1(el0Var, 700, false);
                    return;
                }
                return;
            case 4:
            default:
                return;
            case 5:
                cv0.m((cv0) this.f27007b);
                return;
            case 6:
                ((fw0) this.f27007b).U.V();
                return;
            case 7:
                xx0.O((xx0) this.f27007b);
                return;
            case 8:
                ((q61) this.f27007b).K();
                return;
            case 9:
                ((k81) this.f27007b).invalidate();
                return;
            case 10:
                org.telegram.ui.web.p pVar = (org.telegram.ui.web.p) this.f27007b;
                if (!pVar.f23568a.canScrollVertically(1)) {
                    if (TextUtils.isEmpty(pVar.f39549s)) {
                        pVar.d.d();
                    } else {
                        org.telegram.ui.web.i iVar = pVar.e;
                        if (iVar != null) {
                            iVar.d();
                        }
                    }
                }
                if (pVar.f23568a.H1) {
                    AndroidUtilities.hideKeyboard(pVar.fragmentView);
                    return;
                }
                return;
            case 11:
                org.telegram.ui.web.g1 g1Var = (org.telegram.ui.web.g1) this.f27007b;
                if (g1Var.f23568a.H1) {
                    AndroidUtilities.hideKeyboard(g1Var.fragmentView);
                    return;
                }
                return;
            case 12:
                ph.h1 h1Var = (ph.h1) this.f27007b;
                ph.f1 f1Var = h1Var.f41736c;
                ph.y1 y1Var = h1Var.f41739r;
                viewGroup = ((org.telegram.ui.ActionBar.g3) y1Var).containerView;
                viewGroup.invalidate();
                z4 = ((org.telegram.ui.ActionBar.g3) y1Var).keyboardVisible;
                if (z4 && h1Var.f41735b.H1 && (r1Var = h1Var.d) != null && r1Var.d != null) {
                    y1Var.o0();
                }
                if (h1Var.e.M0() + 7 >= f1Var.h() - 1) {
                    f1Var.G();
                    return;
                }
                return;
            case 13:
                ph.n1 n1Var = (ph.n1) this.f27007b;
                ph.m1 m1Var = n1Var.f42036c;
                ph.d1 d1Var = n1Var.f42035b;
                ph.y1 y1Var2 = n1Var.f42040s;
                viewGroup2 = ((org.telegram.ui.ActionBar.g3) y1Var2).containerView;
                viewGroup2.invalidate();
                int i16 = -1;
                if (n1Var.f42038n < 0.0f) {
                    i12 = n1Var.d.I0();
                } else {
                    int i17 = 0;
                    while (true) {
                        if (i17 < d1Var.getChildCount()) {
                            View childAt4 = d1Var.getChildAt(i17);
                            if (childAt4.getY() + childAt4.getHeight() > n1Var.f42038n + d1Var.getPaddingTop()) {
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
                int size = m1Var.f42004y.size() - 1;
                while (true) {
                    if (size >= 0) {
                        int keyAt = m1Var.f42004y.keyAt(size);
                        int valueAt = m1Var.f42004y.valueAt(size);
                        if (i12 >= keyAt) {
                            i16 = valueAt;
                        } else {
                            size--;
                        }
                    }
                }
                if (i16 >= 0) {
                    n1Var.e.j(i16, true);
                }
                z10 = ((org.telegram.ui.ActionBar.g3) y1Var2).keyboardVisible;
                if (z10 && d1Var.H1 && (r1Var2 = n1Var.f42037f) != null && r1Var2.d != null) {
                    y1Var2.o0();
                    return;
                }
                return;
            case 14:
                df dfVar = (df) this.f27007b;
                View m9 = dfVar.f43873c.getLayoutManager().m(0);
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
                rh.d3 d3Var = (rh.d3) this.f27007b;
                long j10 = d3Var.M;
                int i18 = 0;
                while (true) {
                    if (i18 < d3Var.f36318c.getChildCount()) {
                        if (!(d3Var.f36318c.getChildAt(i18) instanceof u00)) {
                            i18++;
                        }
                    } else if (recyclerView.canScrollVertically(1)) {
                        return;
                    }
                }
                lh.b0.g(rh.d3.C0(d3Var)).d(j10).a();
                lh.b0.g(rh.d3.D0(d3Var)).e(j10).a();
                return;
            case 16:
                sh.q qVar = (sh.q) this.f27007b;
                qVar.v.b(qVar.d);
                return;
            case 17:
                sh.i0.M(((sh.f0) this.f27007b).f44403f).invalidate();
                return;
            case 18:
                sh.h0 h0Var = (sh.h0) this.f27007b;
                h0Var.h.J.b(h0Var.d);
                return;
            case 19:
                uf.k.b0((uf.k) this.f27007b);
                return;
            case 20:
                uf.c0 c0Var = (uf.c0) this.f27007b;
                c0Var.f24282b.X1(c0Var, i11);
                c0Var.M();
                return;
        }
    }
}
