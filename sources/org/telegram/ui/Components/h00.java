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
public final class h00 extends f2.a1 {
    public final int f29022a;
    public final Object f29023b;

    public h00(Object obj, int i10) {
        this.f29022a = i10;
        this.f29023b = obj;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        boolean z10;
        int i11;
        vk0 vk0Var;
        int i12 = this.f29022a;
        boolean z11 = false;
        Object obj = this.f29023b;
        switch (i12) {
            case 1:
                ja0 ja0Var = (ja0) obj;
                if (i10 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ja0Var.T2 = z10;
                if (i10 == 1) {
                    z11 = true;
                }
                ja0Var.U2 = z11;
                return;
            case 3:
                lg0 lg0Var = (lg0) obj;
                fg0 fg0Var = lg0Var.f30315b;
                if (i10 == 0 && lg0.H(lg0Var) + ((lg0Var.A - lg0.G(lg0Var)) - AndroidUtilities.dp(13.0f)) < org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() && fg0Var.canScrollVertically(1)) {
                    fg0Var.getChildAt(0);
                    vk0 vk0Var2 = (vk0) fg0Var.K(0);
                    if (vk0Var2 != null) {
                        View view = vk0Var2.f6432a;
                        if (view.getTop() > AndroidUtilities.dp(7.0f)) {
                            fg0Var.v0(0, view.getTop() - AndroidUtilities.dp(7.0f), null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 5:
                jl0 jl0Var = (jl0) obj;
                if (i10 == 0) {
                    if (jl0Var.f29721r2) {
                        jl0Var.f29721r2 = false;
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                    }
                } else if (!jl0Var.f29721r2 && jl0Var.f29724t1) {
                    jl0Var.f29721r2 = true;
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                }
                if (i10 != 0 && jl0Var.J1 != null) {
                    dg.d dVar = jl0Var.f29688a1;
                    if (dVar != null) {
                        AndroidUtilities.cancelRunOnUIThread(dVar);
                        jl0Var.f29688a1 = null;
                    }
                    MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                    try {
                        jl0Var.I1.r(obtain);
                    } catch (Exception e10) {
                        FileLog.e(e10);
                    }
                    jl0Var.J1.onTouchEvent(obtain);
                    obtain.recycle();
                    View view2 = jl0Var.J1;
                    jl0Var.h1(view2, 0.0f, 0.0f, false);
                    jl0Var.J1 = null;
                    jl0Var.k1(null, view2);
                    jl0Var.L1 = false;
                }
                f2.a1 a1Var = jl0Var.W0;
                if (a1Var != null) {
                    a1Var.a(recyclerView, i10);
                }
                z11 = (i10 == 1 || i10 == 2) ? true : true;
                jl0Var.G1 = z11;
                if (z11) {
                    jl0Var.H1 = true;
                    return;
                }
                return;
            case 6:
                tm0 tm0Var = (tm0) obj;
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(tm0Var.B.getCurrentFocus());
                }
                tm0Var.a();
                return;
            case 10:
                f61 f61Var = (f61) obj;
                jh.e1 e1Var = f61Var.d;
                if (i10 == 0 && f61Var.C) {
                    int i13 = f61Var.f28337y;
                    i11 = ((org.telegram.ui.ActionBar.f3) f61Var).backgroundPaddingTop;
                    if (AndroidUtilities.dp(13.0f) + i11 + i13 < AndroidUtilities.statusBarHeight * 2 && e1Var.canScrollVertically(1) && (vk0Var = (vk0) e1Var.K(0)) != null) {
                        View view3 = vk0Var.f6432a;
                        if (view3.getTop() > 0) {
                            e1Var.v0(0, view3.getTop(), null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 17:
                qh.f0 f0Var = (qh.f0) obj;
                if (i10 == 0) {
                    f0Var.f46698e = !f0Var.d.canScrollVertically(-1);
                    f0Var.d.canScrollVertically(1);
                    return;
                }
                return;
            case 21:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((sf.u1) obj).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i10, int i11) {
        int N0;
        int i12;
        String str;
        TLRPC.User user;
        String str2;
        sk0 sk0Var;
        float f9;
        switch (this.f29022a) {
            case 0:
                j00.F((j00) this.f29023b);
                return;
            case 1:
                ja0 ja0Var = (ja0) this.f29023b;
                f2.w0 layoutManager = ja0Var.getLayoutManager();
                ka0 ka0Var = ja0Var.X2;
                da0 da0Var = ka0Var.d;
                if (layoutManager == da0Var) {
                    N0 = da0Var.N0();
                } else {
                    N0 = ka0Var.f29997c.N0();
                }
                if (N0 == -1) {
                    i12 = 0;
                } else {
                    i12 = N0;
                }
                if (i12 > 0) {
                    rf.v0 v0Var = ka0Var.f29999f;
                    if (N0 > v0Var.H0 - 5 && v0Var.f47381q0 == 0 && (str = v0Var.f47379o0) != null && str.length() != 0 && (user = v0Var.f47385s0) != null && (str2 = v0Var.f47378n0) != null) {
                        v0Var.T(true, user, str2, v0Var.f47379o0);
                    }
                }
                ja0Var.canScrollVertically(1);
                ka0Var.n(!ja0Var.canScrollVertically(-1));
                ka0Var.b();
                return;
            case 2:
                lb0 lb0Var = (lb0) this.f29023b;
                ih.j4 j4Var = lb0Var.f30274b;
                eb0 eb0Var = lb0Var.f30277f;
                for (int i13 = 0; i13 < eb0Var.getChildCount(); i13++) {
                    View childAt = eb0Var.getChildAt(i13);
                    if (childAt instanceof org.telegram.ui.Cells.s1) {
                        ((org.telegram.ui.Cells.s1) childAt).Z3(j4Var.getMeasuredWidth(), j4Var.getBackgroundSizeY());
                    }
                }
                db0 db0Var = lb0Var.f30276e;
                if (db0Var != null) {
                    db0Var.x();
                    return;
                }
                return;
            case 3:
                lg0 lg0Var = (lg0) this.f29023b;
                if (lg0Var.f30315b.getChildCount() > 0) {
                    lg0.t(lg0Var);
                    return;
                }
                return;
            case 4:
                fk0 fk0Var = (fk0) this.f29023b;
                jh.e1 e1Var = fk0Var.f28434b;
                int[] iArr = fk0Var.f28435b0;
                if (recyclerView.getChildCount() > 2) {
                    recyclerView.getLocationInWindow(iArr);
                    int i14 = iArr[0];
                    View childAt2 = recyclerView.getChildAt(0);
                    childAt2.getLocationInWindow(iArr);
                    float min = ((1.0f - Math.min(1.0f, (-Math.min(iArr[0] - i14, 0.0f)) / childAt2.getWidth())) * 0.39999998f) + 0.6f;
                    if (Float.isNaN(min)) {
                        min = 1.0f;
                    }
                    fk0.b(fk0Var, childAt2, min);
                    View childAt3 = recyclerView.getChildAt(recyclerView.getChildCount() - 1);
                    childAt3.getLocationInWindow(iArr);
                    float min2 = ((1.0f - Math.min(1.0f, (-Math.min((recyclerView.getWidth() + i14) - (childAt3.getWidth() + iArr[0]), 0.0f)) / childAt3.getWidth())) * 0.39999998f) + 0.6f;
                    if (Float.isNaN(min2)) {
                        min2 = 1.0f;
                    }
                    fk0.b(fk0Var, childAt3, min2);
                }
                for (int i15 = 1; i15 < e1Var.getChildCount() - 1; i15++) {
                    fk0.b(fk0Var, e1Var.getChildAt(i15), 1.0f);
                }
                fk0Var.invalidate();
                return;
            case 5:
                jl0 jl0Var = (jl0) this.f29023b;
                Rect rect = jl0Var.C1;
                f2.a1 a1Var = jl0Var.W0;
                if (a1Var != null) {
                    a1Var.b(recyclerView, i10, i11);
                }
                if (jl0Var.A1 != -1) {
                    rect.offset(-i10, -i11);
                    org.telegram.ui.Cells.z zVar = jl0Var.f29736z1;
                    if (zVar != null) {
                        zVar.setBounds(rect);
                    }
                    jl0Var.invalidate();
                } else {
                    rect.setEmpty();
                }
                jl0Var.K0(false);
                if (i11 != 0 && (sk0Var = jl0Var.f29689b1) != null) {
                    sk0Var.b();
                }
                wk0 wk0Var = jl0Var.Q1;
                if (wk0Var != null) {
                    jl0Var.e1(wk0Var, 700, false);
                    return;
                }
                return;
            case 6:
            default:
                return;
            case 7:
                uu0.m((uu0) this.f29023b);
                return;
            case 8:
                ((wv0) this.f29023b).T.V();
                return;
            case 9:
                nx0.O((nx0) this.f29023b);
                return;
            case 10:
                ((f61) this.f29023b).K();
                return;
            case 11:
                ((y71) this.f29023b).invalidate();
                return;
            case 12:
                org.telegram.ui.web.p pVar = (org.telegram.ui.web.p) this.f29023b;
                if (!pVar.f31601a.canScrollVertically(1)) {
                    if (TextUtils.isEmpty(pVar.f44136s)) {
                        pVar.d.d();
                    } else {
                        org.telegram.ui.web.j jVar = pVar.f44132e;
                        if (jVar != null) {
                            jVar.d();
                        }
                    }
                }
                if (pVar.f31601a.G1) {
                    AndroidUtilities.hideKeyboard(pVar.fragmentView);
                    return;
                }
                return;
            case 13:
                org.telegram.ui.web.d1 d1Var = (org.telegram.ui.web.d1) this.f29023b;
                if (d1Var.f31601a.G1) {
                    AndroidUtilities.hideKeyboard(d1Var.fragmentView);
                    return;
                }
                return;
            case 14:
                gf gfVar = (gf) this.f29023b;
                View m10 = gfVar.f46112c.getLayoutManager().m(0);
                float f10 = 0.0f;
                if (m10 != null) {
                    f9 = m10.getY();
                } else {
                    f9 = 0.0f;
                }
                if (f9 >= 0.0f) {
                    f10 = f9;
                }
                gfVar.h = f10;
                gfVar.b();
                return;
            case 15:
                ph.d3 d3Var = (ph.d3) this.f29023b;
                long j10 = d3Var.L;
                int i16 = 0;
                while (true) {
                    if (i16 < d3Var.f45015c.getChildCount()) {
                        if (!(d3Var.f45015c.getChildAt(i16) instanceof p00)) {
                            i16++;
                        }
                    } else if (recyclerView.canScrollVertically(1)) {
                        return;
                    }
                }
                jh.b0.g(ph.d3.C0(d3Var)).d(j10).a();
                jh.b0.g(ph.d3.D0(d3Var)).e(j10).a();
                return;
            case 16:
                qh.q qVar = (qh.q) this.f29023b;
                qVar.v.b(qVar.d);
                return;
            case 17:
                qh.i0.L(((qh.f0) this.f29023b).f46699f).invalidate();
                return;
            case 18:
                qh.h0 h0Var = (qh.h0) this.f29023b;
                h0Var.h.I.b(h0Var.d);
                return;
            case 19:
                sf.l.b0((sf.l) this.f29023b);
                return;
            case 20:
                sf.d0 d0Var = (sf.d0) this.f29023b;
                d0Var.f28403b.X1(d0Var, i11);
                d0Var.L();
                return;
        }
    }
}
