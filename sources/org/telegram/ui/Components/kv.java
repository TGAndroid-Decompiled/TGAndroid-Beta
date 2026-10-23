package org.telegram.ui.Components;

import android.graphics.Rect;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class kv extends s4.r0 {
    public final int f28156a;
    public final Object f28157b;

    public kv(Object obj, int i10) {
        this.f28156a = i10;
        this.f28157b = obj;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        boolean z10;
        wl0 wl0Var;
        wl0 wl0Var2;
        org.telegram.ui.Wallet.o8 o8Var;
        int i11 = this.f28156a;
        sg.p1 p1Var = null;
        boolean z11 = false;
        Object obj = this.f28157b;
        switch (i11) {
            case 3:
                ib0 ib0Var = (ib0) obj;
                if (i10 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ib0Var.Y2 = z10;
                if (i10 == 1) {
                    z11 = true;
                }
                ib0Var.Z2 = z11;
                return;
            case 5:
                oh0 oh0Var = (oh0) obj;
                ih0 ih0Var = oh0Var.f29175b;
                if (i10 == 0 && oh0.J(oh0Var) + ((oh0Var.E - oh0.I(oh0Var)) - AndroidUtilities.dp(13.0f)) < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && ih0Var.canScrollVertically(1) && (wl0Var = (wl0) ih0Var.K(0)) != null) {
                    View view = wl0Var.f46343a;
                    if (view.getTop() > AndroidUtilities.dp(7.0f)) {
                        ih0Var.v0(0, view.getTop() - AndroidUtilities.dp(7.0f), null);
                        return;
                    }
                    return;
                }
                return;
            case 7:
                mm0 mm0Var = (mm0) obj;
                if (i10 == 0) {
                    if (mm0Var.f28717t2) {
                        mm0Var.f28717t2 = false;
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                    }
                } else if (!mm0Var.f28717t2 && mm0Var.f28720v1) {
                    mm0Var.f28717t2 = true;
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                }
                if (i10 != 0 && mm0Var.L1 != null) {
                    em0 em0Var = mm0Var.f28683c1;
                    if (em0Var != null) {
                        AndroidUtilities.cancelRunOnUIThread(em0Var);
                        mm0Var.f28683c1 = null;
                    }
                    MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                    try {
                        mm0Var.K1.k(obtain);
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                    mm0Var.L1.onTouchEvent(obtain);
                    obtain.recycle();
                    View view2 = mm0Var.L1;
                    mm0Var.j1(view2, 0.0f, 0.0f, false);
                    mm0Var.L1 = null;
                    mm0Var.m1(null, view2);
                    mm0Var.N1 = false;
                }
                s4.r0 r0Var = mm0Var.Y0;
                if (r0Var != null) {
                    r0Var.a(recyclerView, i10);
                }
                z11 = (i10 == 1 || i10 == 2) ? true : true;
                mm0Var.I1 = z11;
                if (z11) {
                    mm0Var.J1 = true;
                    return;
                }
                return;
            case 8:
                xn0 xn0Var = (xn0) obj;
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(xn0Var.F.getCurrentFocus());
                }
                xn0Var.a();
                return;
            case 12:
                s71 s71Var = (s71) obj;
                ai.u1 u1Var = s71Var.d;
                if (i10 == 0 && s71Var.G && AndroidUtilities.dp(13.0f) + s71.m(s71Var) + s71Var.f30410y < AndroidUtilities.statusBarHeight * 2 && u1Var.canScrollVertically(1) && (wl0Var2 = (wl0) u1Var.K(0)) != null) {
                    View view3 = wl0Var2.f46343a;
                    if (view3.getTop() > 0) {
                        u1Var.v0(0, view3.getTop(), null);
                        return;
                    }
                    return;
                }
                return;
            case 14:
                if (i10 == 1 && (o8Var = ((org.telegram.ui.Wallet.o5) obj).f34941h0) != null) {
                    o8Var.a();
                    return;
                }
                return;
            case 19:
                sg.s0 s0Var = (sg.s0) obj;
                if (i10 == 1) {
                    s0Var.f46826e3 = true;
                }
                if (i10 == 0) {
                    for (int i12 = 0; i12 < recyclerView.getChildCount(); i12++) {
                        sg.p1 p1Var2 = (sg.p1) s0Var.getChildAt(i12);
                        if (p1Var == null || p1Var2.f46810a > p1Var.f46810a) {
                            p1Var = p1Var2;
                        }
                    }
                    if (p1Var != null) {
                        s0Var.C1(p1Var, true);
                        s0Var.f46826e3 = false;
                        s0Var.v0(0, p1Var.getTop() - ((s0Var.getMeasuredHeight() - p1Var.getMeasuredHeight()) / 2), AndroidUtilities.overshootInterpolator);
                    }
                    s0Var.D1();
                    return;
                }
                AndroidUtilities.cancelRunOnUIThread(s0Var.f46827f3);
                return;
            case 20:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((ug.x0) obj).Y.getEditText());
                    return;
                }
                return;
            case 25:
                zh.c cVar = (zh.c) obj;
                if (i10 == 1) {
                    z11 = true;
                }
                cVar.f52159c0 = z11;
                if (i10 != 0) {
                    cVar.f52155a0 = zh.c.b();
                }
                cVar.invalidate();
                return;
            case 26:
                if (i10 == 0) {
                    ((zh.k0) obj).v = false;
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
        tl0 tl0Var;
        org.telegram.ui.Wallet.k5 k5Var;
        float f7;
        switch (this.f28156a) {
            case 0:
                aw awVar = (aw) this.f28157b;
                qv qvVar = awVar.f24856f;
                if (qvVar != null && awVar.h.I1 && qvVar.f30016w) {
                    qvVar.f30016w = false;
                    qvVar.invalidate();
                    return;
                }
                return;
            case 1:
                s00 s00Var = (s00) this.f28157b;
                s00Var.F.invalidate();
                s00Var.invalidate();
                return;
            case 2:
                v00.F((v00) this.f28157b);
                return;
            case 3:
                ib0 ib0Var = (ib0) this.f28157b;
                s4.n0 layoutManager = ib0Var.getLayoutManager();
                jb0 jb0Var = ib0Var.f27277c3;
                cb0 cb0Var = jb0Var.d;
                if (layoutManager == cb0Var) {
                    N0 = cb0Var.N0();
                } else {
                    N0 = jb0Var.f27654c.N0();
                }
                if (N0 == -1) {
                    i12 = 0;
                } else {
                    i12 = N0;
                }
                if (i12 > 0) {
                    hg.j1 j1Var = jb0Var.f27655f;
                    if (N0 > j1Var.M0 - 5 && j1Var.f11971u0 == 0 && (str = j1Var.f11969s0) != null && str.length() != 0 && (user = j1Var.f11974w0) != null && (str2 = j1Var.f11967r0) != null) {
                        j1Var.T(true, user, str2, j1Var.f11969s0);
                    }
                }
                ib0Var.canScrollVertically(1);
                jb0Var.n(!ib0Var.canScrollVertically(-1));
                jb0Var.b();
                return;
            case 4:
                lc0 lc0Var = (lc0) this.f28157b;
                org.telegram.ui.y8 y8Var = lc0Var.f28337b;
                ec0 ec0Var = lc0Var.f28341f;
                for (int i13 = 0; i13 < ec0Var.getChildCount(); i13++) {
                    View childAt = ec0Var.getChildAt(i13);
                    if (childAt instanceof org.telegram.ui.Cells.t1) {
                        ((org.telegram.ui.Cells.t1) childAt).Y3(y8Var.getMeasuredWidth(), y8Var.getBackgroundSizeY());
                    }
                }
                dc0 dc0Var = lc0Var.e;
                if (dc0Var != null) {
                    dc0Var.w();
                    return;
                }
                return;
            case 5:
                oh0 oh0Var = (oh0) this.f28157b;
                if (oh0Var.f29175b.getChildCount() > 0) {
                    oh0.v(oh0Var);
                    return;
                }
                return;
            case 6:
                gl0 gl0Var = (gl0) this.f28157b;
                ai.u1 u1Var = gl0Var.f26631b;
                int[] iArr = gl0Var.f26642f0;
                if (recyclerView.getChildCount() > 2) {
                    recyclerView.getLocationInWindow(iArr);
                    int i14 = iArr[0];
                    View childAt2 = recyclerView.getChildAt(0);
                    childAt2.getLocationInWindow(iArr);
                    float min = ((1.0f - Math.min(1.0f, (-Math.min(iArr[0] - i14, 0.0f)) / childAt2.getWidth())) * 0.39999998f) + 0.6f;
                    if (Float.isNaN(min)) {
                        min = 1.0f;
                    }
                    gl0.b(gl0Var, childAt2, min);
                    View childAt3 = recyclerView.getChildAt(recyclerView.getChildCount() - 1);
                    childAt3.getLocationInWindow(iArr);
                    float min2 = ((1.0f - Math.min(1.0f, (-Math.min((recyclerView.getWidth() + i14) - (childAt3.getWidth() + iArr[0]), 0.0f)) / childAt3.getWidth())) * 0.39999998f) + 0.6f;
                    if (Float.isNaN(min2)) {
                        min2 = 1.0f;
                    }
                    gl0.b(gl0Var, childAt3, min2);
                }
                for (int i15 = 1; i15 < u1Var.getChildCount() - 1; i15++) {
                    gl0.b(gl0Var, u1Var.getChildAt(i15), 1.0f);
                }
                gl0Var.invalidate();
                return;
            case 7:
                mm0 mm0Var = (mm0) this.f28157b;
                Rect rect = mm0Var.E1;
                s4.r0 r0Var = mm0Var.Y0;
                if (r0Var != null) {
                    r0Var.b(recyclerView, i10, i11);
                }
                if (mm0Var.C1 != -1) {
                    rect.offset(-i10, -i11);
                    org.telegram.ui.Cells.y yVar = mm0Var.B1;
                    if (yVar != null) {
                        yVar.setBounds(rect);
                    }
                    mm0Var.invalidate();
                } else {
                    rect.setEmpty();
                }
                mm0Var.L0(false);
                if (i11 != 0 && (tl0Var = mm0Var.f28685d1) != null) {
                    tl0Var.b();
                }
                xl0 xl0Var = mm0Var.S1;
                if (xl0Var != null) {
                    mm0Var.f1(xl0Var, 700, false);
                    return;
                }
                return;
            case 8:
            case 20:
            default:
                return;
            case 9:
                bw0.m((bw0) this.f28157b);
                return;
            case 10:
                ((dx0) this.f28157b).X.V();
                return;
            case 11:
                ty0.Q((ty0) this.f28157b);
                return;
            case 12:
                ((s71) this.f28157b).L();
                return;
            case 13:
                ((k91) this.f28157b).invalidate();
                return;
            case 14:
                org.telegram.ui.Wallet.o5 o5Var = (org.telegram.ui.Wallet.o5) this.f28157b;
                if (i11 != 0 && recyclerView.getScrollState() == 1 && (k5Var = o5Var.f34949p0) != null && k5Var.f34711f) {
                    k5Var.d = true;
                }
                o5Var.O0();
                return;
            case 15:
                int[] iArr2 = (int[]) this.f28157b;
                iArr2[0] = iArr2[0] + i11;
                return;
            case 16:
                org.telegram.ui.Wallet.s9 s9Var = (org.telegram.ui.Wallet.s9) this.f28157b;
                if (s9Var.f25907a.I1) {
                    AndroidUtilities.hideKeyboard(s9Var.M);
                    return;
                }
                return;
            case 17:
                org.telegram.ui.web.p pVar = (org.telegram.ui.web.p) this.f28157b;
                if (!pVar.f25907a.canScrollVertically(1)) {
                    if (TextUtils.isEmpty(pVar.f43223s)) {
                        pVar.d.d();
                    } else {
                        org.telegram.ui.web.j jVar = pVar.e;
                        if (jVar != null) {
                            jVar.d();
                        }
                    }
                }
                if (pVar.f25907a.I1) {
                    AndroidUtilities.hideKeyboard(pVar.fragmentView);
                    return;
                }
                return;
            case 18:
                org.telegram.ui.web.g1 g1Var = (org.telegram.ui.web.g1) this.f28157b;
                if (g1Var.f25907a.I1) {
                    AndroidUtilities.hideKeyboard(g1Var.fragmentView);
                    return;
                }
                return;
            case 19:
                sg.s0 s0Var = (sg.s0) this.f28157b;
                if (recyclerView.getScrollState() == 1) {
                    s0Var.C1(null, true);
                }
                s0Var.invalidate();
                return;
            case 21:
                ((uh.f) this.f28157b).R();
                return;
            case 22:
                s4.b0 b0Var = (s4.b0) recyclerView.getLayoutManager();
                xh.k kVar = (xh.k) this.f28157b;
                xh.e eVar = kVar.C;
                if (kVar.f50326x && !kVar.f50325w && b0Var != null) {
                    if (kVar.f50310f.h() - b0Var.N0() < 10) {
                        AndroidUtilities.cancelRunOnUIThread(eVar);
                        AndroidUtilities.runOnUIThread(eVar);
                        return;
                    }
                    return;
                }
                return;
            case 23:
                yh.g4 g4Var = (yh.g4) this.f28157b;
                int i16 = 0;
                while (true) {
                    if (i16 < g4Var.f50738n.getChildCount()) {
                        if (g4Var.f50738n.getChildAt(i16) instanceof b10) {
                            g4Var.d.g(false);
                        } else {
                            i16++;
                        }
                    }
                }
                ViewPropertyAnimator animate = g4Var.h.animate();
                if (g4Var.K && g4Var.f50738n.canScrollVertically(-1)) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                org.telegram.messenger.sl.t(animate.alpha(f7), bs.h, 320L);
                return;
            case 24:
                ((yh.f4) this.f28157b).Z();
                return;
            case 25:
                zh.c cVar = (zh.c) this.f28157b;
                if (i11 != 0) {
                    cVar.f52155a0 = zh.c.b();
                    cVar.invalidate();
                    return;
                }
                return;
            case 26:
                zh.k0 k0Var = (zh.k0) this.f28157b;
                if (!k0Var.v) {
                    k0Var.h.a(k0Var.f(k0Var.c()), true);
                    return;
                }
                return;
        }
    }
}
