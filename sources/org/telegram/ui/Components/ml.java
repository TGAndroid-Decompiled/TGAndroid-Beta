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
public final class ml extends s4.u0 {
    public final int f30610a;
    public final Object f30611b;

    public ml(Object obj, int i10) {
        this.f30610a = i10;
        this.f30611b = obj;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        vl0 vl0Var;
        int top;
        boolean z10;
        vl0 vl0Var2;
        vl0 vl0Var3;
        org.telegram.ui.Wallet.n8 n8Var;
        int i11 = this.f30610a;
        tg.p1 p1Var = null;
        boolean z11 = false;
        Object obj = this.f30611b;
        switch (i11) {
            case 0:
                if (i10 == 1) {
                    sl slVar = (sl) obj;
                    if (slVar.f32601i0 && slVar.f32602j0) {
                        AndroidUtilities.hideKeyboard(slVar.f30215b.getCurrentFocus());
                        return;
                    }
                    return;
                }
                return;
            case 1:
                go goVar = (go) obj;
                org.telegram.ui.za1 za1Var = goVar.f28649s;
                ti tiVar = goVar.f30215b;
                if (i10 == 0) {
                    int dp = AndroidUtilities.dp(13.0f);
                    int backgroundPaddingTop = tiVar.getBackgroundPaddingTop();
                    if (((tiVar.f33019e2[0] - backgroundPaddingTop) - dp) + backgroundPaddingTop < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (vl0Var = (vl0) za1Var.K(1)) != null && (top = (vl0Var.f47738a.getTop() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(65.0f)) > 0) {
                        za1Var.w0(0, top, null);
                    }
                    int i12 = goVar.W0;
                    if (i12 >= 0) {
                        go.N(goVar, i12);
                        goVar.W0 = -1;
                        return;
                    }
                    return;
                }
                return;
            case 7:
                fb0 fb0Var = (fb0) obj;
                if (i10 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                fb0Var.f28140f3 = z10;
                if (i10 == 1) {
                    z11 = true;
                }
                fb0Var.f28141g3 = z11;
                return;
            case 9:
                nh0 nh0Var = (nh0) obj;
                hh0 hh0Var = nh0Var.f30975b;
                if (i10 == 0 && nh0.J(nh0Var) + ((nh0Var.E - nh0.I(nh0Var)) - AndroidUtilities.dp(13.0f)) < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && hh0Var.canScrollVertically(1) && (vl0Var2 = (vl0) hh0Var.K(0)) != null) {
                    View view = vl0Var2.f47738a;
                    if (view.getTop() > AndroidUtilities.dp(7.0f)) {
                        hh0Var.w0(0, view.getTop() - AndroidUtilities.dp(7.0f), null);
                        return;
                    }
                    return;
                }
                return;
            case 11:
                mm0 mm0Var = (mm0) obj;
                if (i10 == 0) {
                    if (mm0Var.f30658t2) {
                        mm0Var.f30658t2 = false;
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                    }
                } else if (!mm0Var.f30658t2 && mm0Var.f30661v1) {
                    mm0Var.f30658t2 = true;
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                }
                if (i10 != 0 && mm0Var.L1 != null) {
                    dm0 dm0Var = mm0Var.f30624c1;
                    if (dm0Var != null) {
                        AndroidUtilities.cancelRunOnUIThread(dm0Var);
                        mm0Var.f30624c1 = null;
                    }
                    MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                    try {
                        mm0Var.K1.g0(obtain);
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                    mm0Var.L1.onTouchEvent(obtain);
                    obtain.recycle();
                    View view2 = mm0Var.L1;
                    mm0Var.k1(view2, 0.0f, 0.0f, false);
                    mm0Var.L1 = null;
                    mm0Var.n1(null, view2);
                    mm0Var.N1 = false;
                }
                s4.u0 u0Var = mm0Var.Y0;
                if (u0Var != null) {
                    u0Var.a(recyclerView, i10);
                }
                z11 = (i10 == 1 || i10 == 2) ? true : true;
                mm0Var.I1 = z11;
                if (z11) {
                    mm0Var.J1 = true;
                    return;
                }
                return;
            case 12:
                co0 co0Var = (co0) obj;
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(co0Var.F.getCurrentFocus());
                }
                co0Var.a();
                return;
            case 17:
                b81 b81Var = (b81) obj;
                bi.r1 r1Var = b81Var.d;
                if (i10 == 0 && b81Var.G && AndroidUtilities.dp(13.0f) + b81.m(b81Var) + b81Var.f26786y < AndroidUtilities.statusBarHeight * 2 && r1Var.canScrollVertically(1) && (vl0Var3 = (vl0) r1Var.K(0)) != null) {
                    View view3 = vl0Var3.f47738a;
                    if (view3.getTop() > 0) {
                        r1Var.w0(0, view3.getTop(), null);
                        return;
                    }
                    return;
                }
                return;
            case 19:
                if (i10 == 1 && (n8Var = ((org.telegram.ui.Wallet.m5) obj).f36945i0) != null) {
                    n8Var.a();
                    return;
                }
                return;
            case 24:
                tg.s0 s0Var = (tg.s0) obj;
                if (i10 == 1) {
                    s0Var.f49006l3 = true;
                }
                if (i10 == 0) {
                    for (int i13 = 0; i13 < recyclerView.getChildCount(); i13++) {
                        tg.p1 p1Var2 = (tg.p1) s0Var.getChildAt(i13);
                        if (p1Var == null || p1Var2.f48988a > p1Var.f48988a) {
                            p1Var = p1Var2;
                        }
                    }
                    if (p1Var != null) {
                        s0Var.C1(p1Var, true);
                        s0Var.f49006l3 = false;
                        s0Var.w0(0, p1Var.getTop() - ((s0Var.getMeasuredHeight() - p1Var.getMeasuredHeight()) / 2), AndroidUtilities.overshootInterpolator);
                    }
                    s0Var.D1();
                    return;
                }
                AndroidUtilities.cancelRunOnUIThread(s0Var.f49007m3);
                return;
            case 25:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((vg.z0) obj).Y.getEditText());
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i10, int i11) {
        t40 t40Var;
        s4.e1 T;
        int N0;
        int i12;
        String str;
        TLRPC.User user;
        String str2;
        sl0 sl0Var;
        org.telegram.ui.Wallet.i5 i5Var;
        float f7;
        switch (this.f30610a) {
            case 1:
                go goVar = (go) this.f30611b;
                jg.e0 e0Var = goVar.f28654w;
                goVar.f30215b.e2(goVar, i11);
                un unVar = goVar.f28656x;
                if (unVar != null && unVar.f33184s) {
                    rz0 delegate = unVar.getDelegate();
                    if (delegate instanceof org.telegram.ui.Cells.h6) {
                        org.telegram.ui.za1 za1Var = goVar.f28649s;
                        View F = za1Var.F((org.telegram.ui.Cells.h6) delegate);
                        if (F == null) {
                            T = null;
                        } else {
                            T = za1Var.T(F);
                        }
                        if (T != null) {
                            View view = T.f47738a;
                            int b10 = T.b();
                            if (unVar.getDirection() == 0) {
                                unVar.setTranslationY((view.getY() - AndroidUtilities.dp(166.0f)) + view.getMeasuredHeight());
                            } else {
                                unVar.setTranslationY(view.getY());
                            }
                            if (b10 < e0Var.L0() || b10 > e0Var.N0()) {
                                unVar.f();
                            }
                        } else {
                            unVar.f();
                        }
                    } else {
                        unVar.f();
                    }
                }
                if (i11 != 0 && (t40Var = goVar.f28658y) != null) {
                    t40Var.b(true);
                    return;
                }
                return;
            case 2:
                ho hoVar = (ho) this.f30611b;
                hoVar.f30215b.e2(hoVar, i11);
                return;
            case 3:
                yp ypVar = (yp) this.f30611b;
                if (ypVar.f35110x.M0() + 10 >= ypVar.h.h()) {
                    ypVar.B();
                    return;
                }
                return;
            case 4:
                aw awVar = (aw) this.f30611b;
                qv qvVar = awVar.f26627f;
                if (qvVar != null && awVar.h.I1 && qvVar.f32036w) {
                    qvVar.f32036w = false;
                    qvVar.invalidate();
                    return;
                }
                return;
            case 5:
                s00 s00Var = (s00) this.f30611b;
                s00Var.F.invalidate();
                s00Var.invalidate();
                return;
            case 6:
                v00.G((v00) this.f30611b);
                return;
            case 7:
                fb0 fb0Var = (fb0) this.f30611b;
                s4.p0 layoutManager = fb0Var.getLayoutManager();
                gb0 gb0Var = fb0Var.f28144j3;
                za0 za0Var = gb0Var.d;
                if (layoutManager == za0Var) {
                    N0 = za0Var.N0();
                } else {
                    N0 = gb0Var.f28521c.N0();
                }
                if (N0 == -1) {
                    i12 = 0;
                } else {
                    i12 = N0;
                }
                if (i12 > 0) {
                    ig.j1 j1Var = gb0Var.f28522f;
                    if (N0 > j1Var.M0 - 5 && j1Var.f14134u0 == 0 && (str = j1Var.f14132s0) != null && str.length() != 0 && (user = j1Var.f14137w0) != null && (str2 = j1Var.f14130r0) != null) {
                        j1Var.T(true, user, str2, j1Var.f14132s0);
                    }
                }
                fb0Var.canScrollVertically(1);
                gb0Var.n(!fb0Var.canScrollVertically(-1));
                gb0Var.b();
                return;
            case 8:
                hc0 hc0Var = (hc0) this.f30611b;
                org.telegram.ui.a9 a9Var = hc0Var.f28916b;
                ac0 ac0Var = hc0Var.f28920f;
                for (int i13 = 0; i13 < ac0Var.getChildCount(); i13++) {
                    View childAt = ac0Var.getChildAt(i13);
                    if (childAt instanceof org.telegram.ui.Cells.s1) {
                        ((org.telegram.ui.Cells.s1) childAt).b4(a9Var.getMeasuredWidth(), a9Var.getBackgroundSizeY());
                    }
                }
                zb0 zb0Var = hc0Var.e;
                if (zb0Var != null) {
                    zb0Var.w();
                    return;
                }
                return;
            case 9:
                nh0 nh0Var = (nh0) this.f30611b;
                if (nh0Var.f30975b.getChildCount() > 0) {
                    nh0.u(nh0Var);
                    return;
                }
                return;
            case 10:
                fl0 fl0Var = (fl0) this.f30611b;
                bi.r1 r1Var = fl0Var.f28231b;
                int[] iArr = fl0Var.f28242f0;
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
                for (int i15 = 1; i15 < r1Var.getChildCount() - 1; i15++) {
                    fl0.b(fl0Var, r1Var.getChildAt(i15), 1.0f);
                }
                fl0Var.invalidate();
                return;
            case 11:
                mm0 mm0Var = (mm0) this.f30611b;
                Rect rect = mm0Var.E1;
                s4.u0 u0Var = mm0Var.Y0;
                if (u0Var != null) {
                    u0Var.b(recyclerView, i10, i11);
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
                if (i11 != 0 && (sl0Var = mm0Var.f30626d1) != null) {
                    sl0Var.b();
                }
                wl0 wl0Var = mm0Var.S1;
                if (wl0Var != null) {
                    mm0Var.e1(wl0Var, 700, false);
                    return;
                }
                return;
            case 12:
            case 25:
            default:
                return;
            case 13:
                ew0.m((ew0) this.f30611b);
                return;
            case 14:
                lw0 lw0Var = (lw0) this.f30611b;
                if (recyclerView == lw0Var.G) {
                    lw0Var.R += i11;
                }
                if (lw0Var.P == null && lw0Var.Q == 0) {
                    lw0Var.B();
                    return;
                }
                return;
            case 15:
                ((kx0) this.f30611b).X.W();
                return;
            case 16:
                cz0.Q((cz0) this.f30611b);
                return;
            case 17:
                ((b81) this.f30611b).L();
                return;
            case 18:
                ((t91) this.f30611b).invalidate();
                return;
            case 19:
                org.telegram.ui.Wallet.m5 m5Var = (org.telegram.ui.Wallet.m5) this.f30611b;
                if (i11 != 0 && recyclerView.getScrollState() == 1 && (i5Var = m5Var.f36953q0) != null && i5Var.f36675f) {
                    i5Var.d = true;
                }
                m5Var.P0();
                return;
            case 20:
                int[] iArr2 = (int[]) this.f30611b;
                iArr2[0] = iArr2[0] + i11;
                return;
            case 21:
                org.telegram.ui.Wallet.r9 r9Var = (org.telegram.ui.Wallet.r9) this.f30611b;
                if (r9Var.f30419a.I1) {
                    AndroidUtilities.hideKeyboard(r9Var.N);
                    return;
                }
                return;
            case 22:
                org.telegram.ui.web.p pVar = (org.telegram.ui.web.p) this.f30611b;
                if (!pVar.f30419a.canScrollVertically(1)) {
                    if (TextUtils.isEmpty(pVar.v)) {
                        pVar.e.d();
                    } else {
                        org.telegram.ui.web.j jVar = pVar.f45343f;
                        if (jVar != null) {
                            jVar.d();
                        }
                    }
                }
                if (pVar.f30419a.I1) {
                    AndroidUtilities.hideKeyboard(pVar.fragmentView);
                    return;
                }
                return;
            case 23:
                org.telegram.ui.web.f1 f1Var = (org.telegram.ui.web.f1) this.f30611b;
                if (f1Var.f30419a.I1) {
                    AndroidUtilities.hideKeyboard(f1Var.fragmentView);
                    return;
                }
                return;
            case 24:
                tg.s0 s0Var = (tg.s0) this.f30611b;
                if (recyclerView.getScrollState() == 1) {
                    s0Var.C1(null, true);
                }
                s0Var.invalidate();
                return;
            case 26:
                ((vh.f) this.f30611b).R();
                return;
            case 27:
                s4.c0 c0Var = (s4.c0) recyclerView.getLayoutManager();
                yh.k kVar = (yh.k) this.f30611b;
                yh.e eVar = kVar.C;
                if (kVar.f52629x && !kVar.f52628w && c0Var != null) {
                    if (kVar.f52613f.h() - c0Var.N0() < 10) {
                        AndroidUtilities.cancelRunOnUIThread(eVar);
                        AndroidUtilities.runOnUIThread(eVar);
                        return;
                    }
                    return;
                }
                return;
            case 28:
                zh.h4 h4Var = (zh.h4) this.f30611b;
                int i16 = 0;
                while (true) {
                    if (i16 < h4Var.f53031n.getChildCount()) {
                        if (h4Var.f53031n.getChildAt(i16) instanceof c10) {
                            h4Var.d.g(false);
                        } else {
                            i16++;
                        }
                    }
                }
                ViewPropertyAnimator animate = h4Var.h.animate();
                if (h4Var.K && h4Var.f53031n.canScrollVertically(-1)) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                org.telegram.messenger.vh.q(animate.alpha(f7), ds.h, 320L);
                return;
            case 29:
                ((zh.g4) this.f30611b).Z();
                return;
        }
    }
}
