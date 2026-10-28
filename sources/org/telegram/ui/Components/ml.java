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
    public final int f30555a;
    public final Object f30556b;

    public ml(Object obj, int i10) {
        this.f30555a = i10;
        this.f30556b = obj;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        wl0 wl0Var;
        int top;
        boolean z10;
        wl0 wl0Var2;
        wl0 wl0Var3;
        org.telegram.ui.Wallet.n8 n8Var;
        int i11 = this.f30555a;
        tg.p1 p1Var = null;
        boolean z11 = false;
        Object obj = this.f30556b;
        switch (i11) {
            case 0:
                if (i10 == 1) {
                    sl slVar = (sl) obj;
                    if (slVar.f32622i0 && slVar.f32623j0) {
                        AndroidUtilities.hideKeyboard(slVar.f30254b.getCurrentFocus());
                        return;
                    }
                    return;
                }
                return;
            case 1:
                go goVar = (go) obj;
                org.telegram.ui.bb1 bb1Var = goVar.f28696s;
                ti tiVar = goVar.f30254b;
                if (i10 == 0) {
                    int dp = AndroidUtilities.dp(13.0f);
                    int backgroundPaddingTop = tiVar.getBackgroundPaddingTop();
                    if (((tiVar.f32988e2[0] - backgroundPaddingTop) - dp) + backgroundPaddingTop < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (wl0Var = (wl0) bb1Var.K(1)) != null && (top = (wl0Var.f47773a.getTop() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(65.0f)) > 0) {
                        bb1Var.w0(0, top, null);
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
                gb0 gb0Var = (gb0) obj;
                if (i10 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                gb0Var.f28506f3 = z10;
                if (i10 == 1) {
                    z11 = true;
                }
                gb0Var.f28507g3 = z11;
                return;
            case 9:
                oh0 oh0Var = (oh0) obj;
                ih0 ih0Var = oh0Var.f31285b;
                if (i10 == 0 && oh0.J(oh0Var) + ((oh0Var.E - oh0.I(oh0Var)) - AndroidUtilities.dp(13.0f)) < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && ih0Var.canScrollVertically(1) && (wl0Var2 = (wl0) ih0Var.K(0)) != null) {
                    View view = wl0Var2.f47773a;
                    if (view.getTop() > AndroidUtilities.dp(7.0f)) {
                        ih0Var.w0(0, view.getTop() - AndroidUtilities.dp(7.0f), null);
                        return;
                    }
                    return;
                }
                return;
            case 11:
                nm0 nm0Var = (nm0) obj;
                if (i10 == 0) {
                    if (nm0Var.f31000t2) {
                        nm0Var.f31000t2 = false;
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                    }
                } else if (!nm0Var.f31000t2 && nm0Var.f31003v1) {
                    nm0Var.f31000t2 = true;
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                }
                if (i10 != 0 && nm0Var.L1 != null) {
                    em0 em0Var = nm0Var.f30966c1;
                    if (em0Var != null) {
                        AndroidUtilities.cancelRunOnUIThread(em0Var);
                        nm0Var.f30966c1 = null;
                    }
                    MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                    try {
                        nm0Var.K1.g0(obtain);
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                    nm0Var.L1.onTouchEvent(obtain);
                    obtain.recycle();
                    View view2 = nm0Var.L1;
                    nm0Var.k1(view2, 0.0f, 0.0f, false);
                    nm0Var.L1 = null;
                    nm0Var.n1(null, view2);
                    nm0Var.N1 = false;
                }
                s4.u0 u0Var = nm0Var.Y0;
                if (u0Var != null) {
                    u0Var.a(recyclerView, i10);
                }
                z11 = (i10 == 1 || i10 == 2) ? true : true;
                nm0Var.I1 = z11;
                if (z11) {
                    nm0Var.J1 = true;
                    return;
                }
                return;
            case 12:
                do0 do0Var = (do0) obj;
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(do0Var.F.getCurrentFocus());
                }
                do0Var.a();
                return;
            case 17:
                c81 c81Var = (c81) obj;
                bi.r1 r1Var = c81Var.d;
                if (i10 == 0 && c81Var.G && AndroidUtilities.dp(13.0f) + c81.m(c81Var) + c81Var.f27099y < AndroidUtilities.statusBarHeight * 2 && r1Var.canScrollVertically(1) && (wl0Var3 = (wl0) r1Var.K(0)) != null) {
                    View view3 = wl0Var3.f47773a;
                    if (view3.getTop() > 0) {
                        r1Var.w0(0, view3.getTop(), null);
                        return;
                    }
                    return;
                }
                return;
            case 19:
                if (i10 == 1 && (n8Var = ((org.telegram.ui.Wallet.m5) obj).f36950i0) != null) {
                    n8Var.a();
                    return;
                }
                return;
            case 24:
                tg.s0 s0Var = (tg.s0) obj;
                if (i10 == 1) {
                    s0Var.f49041l3 = true;
                }
                if (i10 == 0) {
                    for (int i13 = 0; i13 < recyclerView.getChildCount(); i13++) {
                        tg.p1 p1Var2 = (tg.p1) s0Var.getChildAt(i13);
                        if (p1Var == null || p1Var2.f49023a > p1Var.f49023a) {
                            p1Var = p1Var2;
                        }
                    }
                    if (p1Var != null) {
                        s0Var.C1(p1Var, true);
                        s0Var.f49041l3 = false;
                        s0Var.w0(0, p1Var.getTop() - ((s0Var.getMeasuredHeight() - p1Var.getMeasuredHeight()) / 2), AndroidUtilities.overshootInterpolator);
                    }
                    s0Var.D1();
                    return;
                }
                AndroidUtilities.cancelRunOnUIThread(s0Var.f49042m3);
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
        tl0 tl0Var;
        org.telegram.ui.Wallet.i5 i5Var;
        float f7;
        switch (this.f30555a) {
            case 1:
                go goVar = (go) this.f30556b;
                jg.e0 e0Var = goVar.f28701w;
                goVar.f30254b.f2(goVar, i11);
                un unVar = goVar.f28703x;
                if (unVar != null && unVar.f33497s) {
                    sz0 delegate = unVar.getDelegate();
                    if (delegate instanceof org.telegram.ui.Cells.h6) {
                        org.telegram.ui.bb1 bb1Var = goVar.f28696s;
                        View F = bb1Var.F((org.telegram.ui.Cells.h6) delegate);
                        if (F == null) {
                            T = null;
                        } else {
                            T = bb1Var.T(F);
                        }
                        if (T != null) {
                            View view = T.f47773a;
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
                if (i11 != 0 && (t40Var = goVar.f28705y) != null) {
                    t40Var.b(true);
                    return;
                }
                return;
            case 2:
                ho hoVar = (ho) this.f30556b;
                hoVar.f30254b.f2(hoVar, i11);
                return;
            case 3:
                zp zpVar = (zp) this.f30556b;
                if (zpVar.f35426x.M0() + 10 >= zpVar.h.h()) {
                    zpVar.B();
                    return;
                }
                return;
            case 4:
                aw awVar = (aw) this.f30556b;
                qv qvVar = awVar.f26675f;
                if (qvVar != null && awVar.h.I1 && qvVar.f32030w) {
                    qvVar.f32030w = false;
                    qvVar.invalidate();
                    return;
                }
                return;
            case 5:
                s00 s00Var = (s00) this.f30556b;
                s00Var.F.invalidate();
                s00Var.invalidate();
                return;
            case 6:
                v00.G((v00) this.f30556b);
                return;
            case 7:
                gb0 gb0Var = (gb0) this.f30556b;
                s4.p0 layoutManager = gb0Var.getLayoutManager();
                hb0 hb0Var = gb0Var.f28510j3;
                ab0 ab0Var = hb0Var.d;
                if (layoutManager == ab0Var) {
                    N0 = ab0Var.N0();
                } else {
                    N0 = hb0Var.f28942c.N0();
                }
                if (N0 == -1) {
                    i12 = 0;
                } else {
                    i12 = N0;
                }
                if (i12 > 0) {
                    ig.j1 j1Var = hb0Var.f28943f;
                    if (N0 > j1Var.M0 - 5 && j1Var.f14133u0 == 0 && (str = j1Var.f14131s0) != null && str.length() != 0 && (user = j1Var.f14136w0) != null && (str2 = j1Var.f14129r0) != null) {
                        j1Var.T(true, user, str2, j1Var.f14131s0);
                    }
                }
                gb0Var.canScrollVertically(1);
                hb0Var.n(!gb0Var.canScrollVertically(-1));
                hb0Var.b();
                return;
            case 8:
                ic0 ic0Var = (ic0) this.f30556b;
                org.telegram.ui.a9 a9Var = ic0Var.f29303b;
                bc0 bc0Var = ic0Var.f29307f;
                for (int i13 = 0; i13 < bc0Var.getChildCount(); i13++) {
                    View childAt = bc0Var.getChildAt(i13);
                    if (childAt instanceof org.telegram.ui.Cells.s1) {
                        ((org.telegram.ui.Cells.s1) childAt).b4(a9Var.getMeasuredWidth(), a9Var.getBackgroundSizeY());
                    }
                }
                ac0 ac0Var = ic0Var.e;
                if (ac0Var != null) {
                    ac0Var.w();
                    return;
                }
                return;
            case 9:
                oh0 oh0Var = (oh0) this.f30556b;
                if (oh0Var.f31285b.getChildCount() > 0) {
                    oh0.u(oh0Var);
                    return;
                }
                return;
            case 10:
                gl0 gl0Var = (gl0) this.f30556b;
                bi.r1 r1Var = gl0Var.f28609b;
                int[] iArr = gl0Var.f28620f0;
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
                for (int i15 = 1; i15 < r1Var.getChildCount() - 1; i15++) {
                    gl0.b(gl0Var, r1Var.getChildAt(i15), 1.0f);
                }
                gl0Var.invalidate();
                return;
            case 11:
                nm0 nm0Var = (nm0) this.f30556b;
                Rect rect = nm0Var.E1;
                s4.u0 u0Var = nm0Var.Y0;
                if (u0Var != null) {
                    u0Var.b(recyclerView, i10, i11);
                }
                if (nm0Var.C1 != -1) {
                    rect.offset(-i10, -i11);
                    org.telegram.ui.Cells.y yVar = nm0Var.B1;
                    if (yVar != null) {
                        yVar.setBounds(rect);
                    }
                    nm0Var.invalidate();
                } else {
                    rect.setEmpty();
                }
                nm0Var.L0(false);
                if (i11 != 0 && (tl0Var = nm0Var.f30968d1) != null) {
                    tl0Var.b();
                }
                xl0 xl0Var = nm0Var.S1;
                if (xl0Var != null) {
                    nm0Var.e1(xl0Var, 700, false);
                    return;
                }
                return;
            case 12:
            case 25:
            default:
                return;
            case 13:
                fw0.m((fw0) this.f30556b);
                return;
            case 14:
                mw0 mw0Var = (mw0) this.f30556b;
                if (recyclerView == mw0Var.G) {
                    mw0Var.R += i11;
                }
                if (mw0Var.P == null && mw0Var.Q == 0) {
                    mw0Var.B();
                    return;
                }
                return;
            case 15:
                ((lx0) this.f30556b).X.W();
                return;
            case 16:
                dz0.Q((dz0) this.f30556b);
                return;
            case 17:
                ((c81) this.f30556b).L();
                return;
            case 18:
                ((u91) this.f30556b).invalidate();
                return;
            case 19:
                org.telegram.ui.Wallet.m5 m5Var = (org.telegram.ui.Wallet.m5) this.f30556b;
                if (i11 != 0 && recyclerView.getScrollState() == 1 && (i5Var = m5Var.f36958q0) != null && i5Var.f36700f) {
                    i5Var.d = true;
                }
                m5Var.P0();
                return;
            case 20:
                int[] iArr2 = (int[]) this.f30556b;
                iArr2[0] = iArr2[0] + i11;
                return;
            case 21:
                org.telegram.ui.Wallet.r9 r9Var = (org.telegram.ui.Wallet.r9) this.f30556b;
                if (r9Var.f30764a.I1) {
                    AndroidUtilities.hideKeyboard(r9Var.N);
                    return;
                }
                return;
            case 22:
                org.telegram.ui.web.p pVar = (org.telegram.ui.web.p) this.f30556b;
                if (!pVar.f30764a.canScrollVertically(1)) {
                    if (TextUtils.isEmpty(pVar.v)) {
                        pVar.e.d();
                    } else {
                        org.telegram.ui.web.j jVar = pVar.f44854f;
                        if (jVar != null) {
                            jVar.d();
                        }
                    }
                }
                if (pVar.f30764a.I1) {
                    AndroidUtilities.hideKeyboard(pVar.fragmentView);
                    return;
                }
                return;
            case 23:
                org.telegram.ui.web.f1 f1Var = (org.telegram.ui.web.f1) this.f30556b;
                if (f1Var.f30764a.I1) {
                    AndroidUtilities.hideKeyboard(f1Var.fragmentView);
                    return;
                }
                return;
            case 24:
                tg.s0 s0Var = (tg.s0) this.f30556b;
                if (recyclerView.getScrollState() == 1) {
                    s0Var.C1(null, true);
                }
                s0Var.invalidate();
                return;
            case 26:
                ((vh.f) this.f30556b).R();
                return;
            case 27:
                s4.c0 c0Var = (s4.c0) recyclerView.getLayoutManager();
                yh.k kVar = (yh.k) this.f30556b;
                yh.e eVar = kVar.C;
                if (kVar.f52687x && !kVar.f52686w && c0Var != null) {
                    if (kVar.f52671f.h() - c0Var.N0() < 10) {
                        AndroidUtilities.cancelRunOnUIThread(eVar);
                        AndroidUtilities.runOnUIThread(eVar);
                        return;
                    }
                    return;
                }
                return;
            case 28:
                zh.h4 h4Var = (zh.h4) this.f30556b;
                int i16 = 0;
                while (true) {
                    if (i16 < h4Var.f53089n.getChildCount()) {
                        if (h4Var.f53089n.getChildAt(i16) instanceof c10) {
                            h4Var.d.g(false);
                        } else {
                            i16++;
                        }
                    }
                }
                ViewPropertyAnimator animate = h4Var.h.animate();
                if (h4Var.K && h4Var.f53089n.canScrollVertically(-1)) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                org.telegram.messenger.wh.q(animate.alpha(f7), ds.h, 320L);
                return;
            case 29:
                ((zh.g4) this.f30556b).Z();
                return;
        }
    }
}
