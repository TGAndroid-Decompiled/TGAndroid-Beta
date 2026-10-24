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
public final class iv extends s4.r0 {
    public final int f27490a;
    public final Object f27491b;

    public iv(Object obj, int i10) {
        this.f27490a = i10;
        this.f27491b = obj;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        boolean z10;
        vl0 vl0Var;
        vl0 vl0Var2;
        org.telegram.ui.Wallet.o8 o8Var;
        int i11 = this.f27490a;
        sg.p1 p1Var = null;
        boolean z11 = false;
        Object obj = this.f27491b;
        switch (i11) {
            case 3:
                gb0 gb0Var = (gb0) obj;
                if (i10 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                gb0Var.Y2 = z10;
                if (i10 == 1) {
                    z11 = true;
                }
                gb0Var.Z2 = z11;
                return;
            case 5:
                nh0 nh0Var = (nh0) obj;
                hh0 hh0Var = nh0Var.f28910b;
                if (i10 == 0 && nh0.J(nh0Var) + ((nh0Var.E - nh0.I(nh0Var)) - AndroidUtilities.dp(13.0f)) < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && hh0Var.canScrollVertically(1) && (vl0Var = (vl0) hh0Var.K(0)) != null) {
                    View view = vl0Var.f46342a;
                    if (view.getTop() > AndroidUtilities.dp(7.0f)) {
                        hh0Var.v0(0, view.getTop() - AndroidUtilities.dp(7.0f), null);
                        return;
                    }
                    return;
                }
                return;
            case 7:
                lm0 lm0Var = (lm0) obj;
                if (i10 == 0) {
                    if (lm0Var.f28408t2) {
                        lm0Var.f28408t2 = false;
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                    }
                } else if (!lm0Var.f28408t2 && lm0Var.f28411v1) {
                    lm0Var.f28408t2 = true;
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                }
                if (i10 != 0 && lm0Var.L1 != null) {
                    dm0 dm0Var = lm0Var.f28374c1;
                    if (dm0Var != null) {
                        AndroidUtilities.cancelRunOnUIThread(dm0Var);
                        lm0Var.f28374c1 = null;
                    }
                    MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                    try {
                        lm0Var.K1.k(obtain);
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                    lm0Var.L1.onTouchEvent(obtain);
                    obtain.recycle();
                    View view2 = lm0Var.L1;
                    lm0Var.j1(view2, 0.0f, 0.0f, false);
                    lm0Var.L1 = null;
                    lm0Var.m1(null, view2);
                    lm0Var.N1 = false;
                }
                s4.r0 r0Var = lm0Var.Y0;
                if (r0Var != null) {
                    r0Var.a(recyclerView, i10);
                }
                z11 = (i10 == 1 || i10 == 2) ? true : true;
                lm0Var.I1 = z11;
                if (z11) {
                    lm0Var.J1 = true;
                    return;
                }
                return;
            case 8:
                wn0 wn0Var = (wn0) obj;
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(wn0Var.F.getCurrentFocus());
                }
                wn0Var.a();
                return;
            case 12:
                r71 r71Var = (r71) obj;
                ai.u1 u1Var = r71Var.d;
                if (i10 == 0 && r71Var.G && AndroidUtilities.dp(13.0f) + r71.m(r71Var) + r71Var.f30096y < AndroidUtilities.statusBarHeight * 2 && u1Var.canScrollVertically(1) && (vl0Var2 = (vl0) u1Var.K(0)) != null) {
                    View view3 = vl0Var2.f46342a;
                    if (view3.getTop() > 0) {
                        u1Var.v0(0, view3.getTop(), null);
                        return;
                    }
                    return;
                }
                return;
            case 14:
                if (i10 == 1 && (o8Var = ((org.telegram.ui.Wallet.o5) obj).f34943h0) != null) {
                    o8Var.a();
                    return;
                }
                return;
            case 19:
                sg.s0 s0Var = (sg.s0) obj;
                if (i10 == 1) {
                    s0Var.f46825e3 = true;
                }
                if (i10 == 0) {
                    for (int i12 = 0; i12 < recyclerView.getChildCount(); i12++) {
                        sg.p1 p1Var2 = (sg.p1) s0Var.getChildAt(i12);
                        if (p1Var == null || p1Var2.f46809a > p1Var.f46809a) {
                            p1Var = p1Var2;
                        }
                    }
                    if (p1Var != null) {
                        s0Var.C1(p1Var, true);
                        s0Var.f46825e3 = false;
                        s0Var.v0(0, p1Var.getTop() - ((s0Var.getMeasuredHeight() - p1Var.getMeasuredHeight()) / 2), AndroidUtilities.overshootInterpolator);
                    }
                    s0Var.D1();
                    return;
                }
                AndroidUtilities.cancelRunOnUIThread(s0Var.f46826f3);
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
                cVar.f52158c0 = z11;
                if (i10 != 0) {
                    cVar.f52154a0 = zh.c.b();
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
        sl0 sl0Var;
        org.telegram.ui.Wallet.k5 k5Var;
        float f7;
        switch (this.f27490a) {
            case 0:
                yv yvVar = (yv) this.f27491b;
                ov ovVar = yvVar.f33050f;
                if (ovVar != null && yvVar.h.I1 && ovVar.f29400w) {
                    ovVar.f29400w = false;
                    ovVar.invalidate();
                    return;
                }
                return;
            case 1:
                q00 q00Var = (q00) this.f27491b;
                q00Var.F.invalidate();
                q00Var.invalidate();
                return;
            case 2:
                t00.F((t00) this.f27491b);
                return;
            case 3:
                gb0 gb0Var = (gb0) this.f27491b;
                s4.n0 layoutManager = gb0Var.getLayoutManager();
                hb0 hb0Var = gb0Var.f26617c3;
                ab0 ab0Var = hb0Var.d;
                if (layoutManager == ab0Var) {
                    N0 = ab0Var.N0();
                } else {
                    N0 = hb0Var.f26994c.N0();
                }
                if (N0 == -1) {
                    i12 = 0;
                } else {
                    i12 = N0;
                }
                if (i12 > 0) {
                    hg.j1 j1Var = hb0Var.f26995f;
                    if (N0 > j1Var.M0 - 5 && j1Var.f11971u0 == 0 && (str = j1Var.f11969s0) != null && str.length() != 0 && (user = j1Var.f11974w0) != null && (str2 = j1Var.f11967r0) != null) {
                        j1Var.T(true, user, str2, j1Var.f11969s0);
                    }
                }
                gb0Var.canScrollVertically(1);
                hb0Var.n(!gb0Var.canScrollVertically(-1));
                hb0Var.b();
                return;
            case 4:
                jc0 jc0Var = (jc0) this.f27491b;
                org.telegram.ui.y8 y8Var = jc0Var.f27671b;
                cc0 cc0Var = jc0Var.f27675f;
                for (int i13 = 0; i13 < cc0Var.getChildCount(); i13++) {
                    View childAt = cc0Var.getChildAt(i13);
                    if (childAt instanceof org.telegram.ui.Cells.t1) {
                        ((org.telegram.ui.Cells.t1) childAt).Y3(y8Var.getMeasuredWidth(), y8Var.getBackgroundSizeY());
                    }
                }
                bc0 bc0Var = jc0Var.e;
                if (bc0Var != null) {
                    bc0Var.w();
                    return;
                }
                return;
            case 5:
                nh0 nh0Var = (nh0) this.f27491b;
                if (nh0Var.f28910b.getChildCount() > 0) {
                    nh0.v(nh0Var);
                    return;
                }
                return;
            case 6:
                fl0 fl0Var = (fl0) this.f27491b;
                ai.u1 u1Var = fl0Var.f26349b;
                int[] iArr = fl0Var.f26360f0;
                if (recyclerView.getChildCount() > 2) {
                    recyclerView.getLocationInWindow(iArr);
                    int i14 = iArr[0];
                    View childAt2 = recyclerView.getChildAt(0);
                    childAt2.getLocationInWindow(iArr);
                    float min = ((1.0f - Math.min(1.0f, (-Math.min(iArr[0] - i14, 0.0f)) / childAt2.getWidth())) * 0.39999998f) + 0.6f;
                    if (Float.isNaN(min)) {
                        min = 1.0f;
                    }
                    fl0.b(fl0Var, childAt2, min);
                    View childAt3 = recyclerView.getChildAt(recyclerView.getChildCount() - 1);
                    childAt3.getLocationInWindow(iArr);
                    float min2 = ((1.0f - Math.min(1.0f, (-Math.min((recyclerView.getWidth() + i14) - (childAt3.getWidth() + iArr[0]), 0.0f)) / childAt3.getWidth())) * 0.39999998f) + 0.6f;
                    if (Float.isNaN(min2)) {
                        min2 = 1.0f;
                    }
                    fl0.b(fl0Var, childAt3, min2);
                }
                for (int i15 = 1; i15 < u1Var.getChildCount() - 1; i15++) {
                    fl0.b(fl0Var, u1Var.getChildAt(i15), 1.0f);
                }
                fl0Var.invalidate();
                return;
            case 7:
                lm0 lm0Var = (lm0) this.f27491b;
                Rect rect = lm0Var.E1;
                s4.r0 r0Var = lm0Var.Y0;
                if (r0Var != null) {
                    r0Var.b(recyclerView, i10, i11);
                }
                if (lm0Var.C1 != -1) {
                    rect.offset(-i10, -i11);
                    org.telegram.ui.Cells.y yVar = lm0Var.B1;
                    if (yVar != null) {
                        yVar.setBounds(rect);
                    }
                    lm0Var.invalidate();
                } else {
                    rect.setEmpty();
                }
                lm0Var.L0(false);
                if (i11 != 0 && (sl0Var = lm0Var.f28376d1) != null) {
                    sl0Var.b();
                }
                wl0 wl0Var = lm0Var.S1;
                if (wl0Var != null) {
                    lm0Var.f1(wl0Var, 700, false);
                    return;
                }
                return;
            case 8:
            case 20:
            default:
                return;
            case 9:
                aw0.m((aw0) this.f27491b);
                return;
            case 10:
                ((cx0) this.f27491b).X.V();
                return;
            case 11:
                sy0.Q((sy0) this.f27491b);
                return;
            case 12:
                ((r71) this.f27491b).L();
                return;
            case 13:
                ((k91) this.f27491b).invalidate();
                return;
            case 14:
                org.telegram.ui.Wallet.o5 o5Var = (org.telegram.ui.Wallet.o5) this.f27491b;
                if (i11 != 0 && recyclerView.getScrollState() == 1 && (k5Var = o5Var.f34951p0) != null && k5Var.f34713f) {
                    k5Var.d = true;
                }
                o5Var.O0();
                return;
            case 15:
                int[] iArr2 = (int[]) this.f27491b;
                iArr2[0] = iArr2[0] + i11;
                return;
            case 16:
                org.telegram.ui.Wallet.s9 s9Var = (org.telegram.ui.Wallet.s9) this.f27491b;
                if (s9Var.f25615a.I1) {
                    AndroidUtilities.hideKeyboard(s9Var.M);
                    return;
                }
                return;
            case 17:
                org.telegram.ui.web.p pVar = (org.telegram.ui.web.p) this.f27491b;
                if (!pVar.f25615a.canScrollVertically(1)) {
                    if (TextUtils.isEmpty(pVar.f43212s)) {
                        pVar.d.d();
                    } else {
                        org.telegram.ui.web.j jVar = pVar.e;
                        if (jVar != null) {
                            jVar.d();
                        }
                    }
                }
                if (pVar.f25615a.I1) {
                    AndroidUtilities.hideKeyboard(pVar.fragmentView);
                    return;
                }
                return;
            case 18:
                org.telegram.ui.web.g1 g1Var = (org.telegram.ui.web.g1) this.f27491b;
                if (g1Var.f25615a.I1) {
                    AndroidUtilities.hideKeyboard(g1Var.fragmentView);
                    return;
                }
                return;
            case 19:
                sg.s0 s0Var = (sg.s0) this.f27491b;
                if (recyclerView.getScrollState() == 1) {
                    s0Var.C1(null, true);
                }
                s0Var.invalidate();
                return;
            case 21:
                ((uh.f) this.f27491b).R();
                return;
            case 22:
                s4.b0 b0Var = (s4.b0) recyclerView.getLayoutManager();
                xh.k kVar = (xh.k) this.f27491b;
                xh.e eVar = kVar.C;
                if (kVar.f50325x && !kVar.f50324w && b0Var != null) {
                    if (kVar.f50309f.h() - b0Var.N0() < 10) {
                        AndroidUtilities.cancelRunOnUIThread(eVar);
                        AndroidUtilities.runOnUIThread(eVar);
                        return;
                    }
                    return;
                }
                return;
            case 23:
                yh.g4 g4Var = (yh.g4) this.f27491b;
                int i16 = 0;
                while (true) {
                    if (i16 < g4Var.f50737n.getChildCount()) {
                        if (g4Var.f50737n.getChildAt(i16) instanceof z00) {
                            g4Var.d.g(false);
                        } else {
                            i16++;
                        }
                    }
                }
                ViewPropertyAnimator animate = g4Var.h.animate();
                if (g4Var.K && g4Var.f50737n.canScrollVertically(-1)) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                org.telegram.messenger.tl.t(animate.alpha(f7), zr.h, 320L);
                return;
            case 24:
                ((yh.f4) this.f27491b).Z();
                return;
            case 25:
                zh.c cVar = (zh.c) this.f27491b;
                if (i11 != 0) {
                    cVar.f52154a0 = zh.c.b();
                    cVar.invalidate();
                    return;
                }
                return;
            case 26:
                zh.k0 k0Var = (zh.k0) this.f27491b;
                if (!k0Var.v) {
                    k0Var.h.a(k0Var.f(k0Var.c()), true);
                    return;
                }
                return;
        }
    }
}
