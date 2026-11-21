package org.telegram.ui.Components;

import android.graphics.Rect;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.TLRPC;
public final class oa extends v4.u0 {
    public final int f38160a;
    public final Object f38161b;

    public oa(Object obj, int i7) {
        this.f38160a = i7;
        this.f38161b = obj;
    }

    @Override
    public void a(RecyclerView recyclerView, int i7) {
        int i10;
        mj0 mj0Var;
        mj0 mj0Var2;
        int top;
        int i11;
        mj0 mj0Var3;
        mj0 mj0Var4;
        int top2;
        boolean z10;
        mj0 mj0Var5;
        mj0 mj0Var6;
        org.telegram.ui.Wallet.j9 j9Var;
        int i12 = this.f38160a;
        boolean z11 = false;
        Object obj = this.f38161b;
        switch (i12) {
            case 2:
                hj hjVar = (hj) obj;
                di.b1 b1Var = hjVar.f35921n;
                ui uiVar = hjVar.f37521b;
                if (i7 == 0) {
                    int L = org.telegram.messenger.g0.L(13.0f);
                    org.telegram.ui.ActionBar.q0 q0Var = uiVar.Y2;
                    if (q0Var != null) {
                        i10 = org.telegram.messenger.g0.L(q0Var.getAlpha() * 26.0f);
                    } else {
                        i10 = 0;
                    }
                    int i13 = L + i10;
                    int i14 = uiVar.f30207t0;
                    if (((uiVar.Z3[0] - i14) - i13) + i14 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (mj0Var = (mj0) b1Var.K(0)) != null) {
                        View view = mj0Var.f59161a;
                        if (view.getTop() > org.telegram.messenger.g0.L(7.0f)) {
                            b1Var.w0(0, view.getTop() - org.telegram.messenger.g0.L(7.0f), null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 4:
                mk mkVar = (mk) obj;
                ui uiVar2 = mkVar.f37521b;
                ak akVar = mkVar.f37536r;
                if (i7 == 0) {
                    int L2 = org.telegram.messenger.g0.L(13.0f);
                    int i15 = uiVar2.f30207t0;
                    if (((uiVar2.Z3[0] - i15) - L2) + i15 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (mj0Var2 = (mj0) akVar.K(0)) != null && (top = (mj0Var2.f59161a.getTop() - org.telegram.messenger.g0.f24140m) - org.telegram.messenger.g0.L(56.0f)) > 0) {
                        akVar.w0(0, top, null);
                    }
                }
                if (i7 == 1 && mkVar.f37530c0 && akVar.getAdapter() == mkVar.E) {
                    org.telegram.messenger.g0.v1(uiVar2.getCurrentFocus());
                }
                if (i7 != 0) {
                    z11 = true;
                }
                mkVar.V = z11;
                return;
            case 5:
                nk nkVar = (nk) obj;
                ek0 ek0Var = nkVar.f37883r;
                ui uiVar3 = nkVar.f37521b;
                if (i7 == 0) {
                    int L3 = org.telegram.messenger.g0.L(13.0f);
                    org.telegram.ui.ActionBar.q0 q0Var2 = uiVar3.Y2;
                    if (q0Var2 != null) {
                        i11 = org.telegram.messenger.g0.L(q0Var2.getAlpha() * 26.0f);
                    } else {
                        i11 = 0;
                    }
                    int i16 = L3 + i11;
                    int i17 = uiVar3.f30207t0;
                    if (((uiVar3.Z3[0] - i17) - i16) + i17 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (mj0Var3 = (mj0) ek0Var.K(0)) != null) {
                        View view2 = mj0Var3.f59161a;
                        if (view2.getTop() > org.telegram.messenger.g0.L(7.0f)) {
                            ek0Var.w0(0, view2.getTop() - org.telegram.messenger.g0.L(7.0f), null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 6:
                tn tnVar = (tn) obj;
                org.telegram.ui.f61 f61Var = tnVar.f39991s;
                if (i7 == 0) {
                    int L4 = org.telegram.messenger.g0.L(13.0f);
                    ui uiVar4 = tnVar.f37521b;
                    int i18 = uiVar4.f30207t0;
                    if (((uiVar4.Z3[0] - i18) - L4) + i18 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (mj0Var4 = (mj0) f61Var.K(1)) != null && (top2 = (mj0Var4.f59161a.getTop() - org.telegram.messenger.g0.f24140m) - org.telegram.messenger.g0.L(65.0f)) > 0) {
                        f61Var.w0(0, top2, null);
                    }
                    int i19 = tnVar.X0;
                    if (i19 >= 0) {
                        tn.P(tnVar, i19);
                        tnVar.X0 = -1;
                        return;
                    }
                    return;
                }
                return;
            case 12:
                u90 u90Var = (u90) obj;
                if (i7 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                u90Var.f40308f3 = z10;
                if (i7 == 1) {
                    z11 = true;
                }
                u90Var.f40309g3 = z11;
                return;
            case 14:
                ff0 ff0Var = (ff0) obj;
                ze0 ze0Var = ff0Var.f35216m1;
                if (i7 == 0) {
                    int L5 = org.telegram.messenger.g0.L(13.0f);
                    int i20 = ff0Var.f35228z1;
                    int i21 = ff0Var.f30207t0;
                    if (((i20 - i21) - L5) + i21 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && ze0Var.canScrollVertically(1) && (mj0Var5 = (mj0) ze0Var.K(0)) != null) {
                        View view3 = mj0Var5.f59161a;
                        if (view3.getTop() > org.telegram.messenger.g0.L(7.0f)) {
                            ze0Var.w0(0, view3.getTop() - org.telegram.messenger.g0.L(7.0f), null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 16:
                ek0 ek0Var2 = (ek0) obj;
                if (i7 == 0) {
                    if (ek0Var2.f34887u2) {
                        ek0Var2.f34887u2 = false;
                        org.telegram.messenger.ks.e().k(99, 512);
                    }
                } else if (!ek0Var2.f34887u2 && ek0Var2.f34890w1) {
                    ek0Var2.f34887u2 = true;
                    org.telegram.messenger.ks.e().k(98, 512);
                }
                if (i7 != 0 && ek0Var2.M1 != null) {
                    uj0 uj0Var = ek0Var2.f34855d1;
                    if (uj0Var != null) {
                        org.telegram.messenger.g0.r(uj0Var);
                        ek0Var2.f34855d1 = null;
                    }
                    MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                    try {
                        ek0Var2.L1.w0(obtain);
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                    }
                    ek0Var2.M1.onTouchEvent(obtain);
                    obtain.recycle();
                    View view4 = ek0Var2.M1;
                    ek0Var2.j1(view4, 0.0f, 0.0f, false);
                    ek0Var2.M1 = null;
                    ek0Var2.m1(view4, null);
                    ek0Var2.O1 = false;
                }
                v4.u0 u0Var = ek0Var2.Z0;
                if (u0Var != null) {
                    u0Var.a(recyclerView, i7);
                }
                if (i7 == 1 || i7 == 2) {
                    z11 = true;
                }
                ek0Var2.J1 = z11;
                if (z11) {
                    ek0Var2.K1 = true;
                    return;
                }
                return;
            case 17:
                sl0 sl0Var = (sl0) obj;
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(sl0Var.G.getCurrentFocus());
                }
                sl0Var.a();
                return;
            case 22:
                r51 r51Var = (r51) obj;
                di.b1 b1Var2 = r51Var.f39072o1;
                if (i7 == 0 && r51Var.B1 && org.telegram.messenger.g0.L(13.0f) + r51Var.f39082y1 + r51Var.f30207t0 < org.telegram.messenger.g0.f24140m * 2 && b1Var2.canScrollVertically(1) && (mj0Var6 = (mj0) b1Var2.K(0)) != null) {
                    View view5 = mj0Var6.f59161a;
                    if (view5.getTop() > 0) {
                        b1Var2.w0(0, view5.getTop(), null);
                        return;
                    }
                    return;
                }
                return;
            case 24:
                if (i7 == 1 && (j9Var = ((org.telegram.ui.Wallet.n6) obj).f44672j0) != null) {
                    j9Var.a();
                    return;
                }
                return;
            case 29:
                ((ri.q) obj).f56740g++;
                return;
            default:
                return;
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i7, int i10) {
        jg.o0 o0Var;
        m30 m30Var;
        v4.f1 T;
        int N0;
        int i11;
        String str;
        TLRPC.User user;
        String str2;
        jj0 jj0Var;
        org.telegram.ui.Wallet.j6 j6Var;
        switch (this.f38160a) {
            case 0:
                ((du0) this.f38161b).invalidate();
                return;
            case 1:
                ej ejVar = (ej) this.f38161b;
                ejVar.f37521b.N1(ejVar, i10);
                return;
            case 2:
                hj hjVar = (hj) this.f38161b;
                if (hjVar.f35921n.getChildCount() > 0) {
                    hjVar.f37521b.N1(hjVar, i10);
                    return;
                }
                return;
            case 3:
                vj vjVar = (vj) this.f38161b;
                vjVar.f37521b.N1(vjVar, i10);
                vjVar.T();
                return;
            case 4:
                mk mkVar = (mk) this.f38161b;
                kg.d0 d0Var = mkVar.F;
                mkVar.f37521b.N1(mkVar, i10);
                mkVar.Z();
                v4.i0 adapter = mkVar.f37536r.getAdapter();
                lk lkVar = mkVar.E;
                if (adapter == lkVar) {
                    int L0 = d0Var.L0();
                    int N02 = d0Var.N0();
                    int abs = Math.abs(N02 - L0) + 1;
                    int b10 = recyclerView.getAdapter().b();
                    if (abs > 0 && N02 >= b10 - 10) {
                        lk lkVar2 = lkVar.Y.E;
                        if (!lkVar2.T && !lkVar2.W && (o0Var = lkVar.E) != null) {
                            lkVar.Z(lkVar.f37201y, lkVar.F, lkVar.G, o0Var, lkVar.K, false);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 5:
                nk nkVar = (nk) this.f38161b;
                nkVar.f37521b.N1(nkVar, i10);
                nkVar.f37885w.setTranslationY(Math.max(0, nkVar.getCurrentItemTop()));
                return;
            case 6:
                tn tnVar = (tn) this.f38161b;
                kg.d0 d0Var2 = tnVar.f39998x;
                tnVar.f37521b.N1(tnVar, i10);
                kn knVar = tnVar.f40000y;
                if (knVar != null && knVar.f33653s) {
                    yw0 delegate = knVar.getDelegate();
                    if (delegate instanceof org.telegram.ui.Cells.b6) {
                        org.telegram.ui.f61 f61Var = tnVar.f39991s;
                        View F = f61Var.F((org.telegram.ui.Cells.b6) delegate);
                        if (F == null) {
                            T = null;
                        } else {
                            T = f61Var.T(F);
                        }
                        if (T != null) {
                            View view = T.f59161a;
                            int b11 = T.b();
                            if (knVar.getDirection() == 0) {
                                knVar.setTranslationY((view.getY() - org.telegram.messenger.g0.L(166.0f)) + view.getMeasuredHeight());
                            } else {
                                knVar.setTranslationY(view.getY());
                            }
                            if (b11 < d0Var2.L0() || b11 > d0Var2.N0()) {
                                knVar.f();
                            }
                        } else {
                            knVar.f();
                        }
                    } else {
                        knVar.f();
                    }
                }
                if (i10 != 0 && (m30Var = tnVar.E) != null) {
                    m30Var.a();
                    return;
                }
                return;
            case 7:
                un unVar = (un) this.f38161b;
                unVar.f37521b.N1(unVar, i10);
                return;
            case 8:
                np npVar = (np) this.f38161b;
                if (npVar.f37932x1.M0() + 10 >= npVar.f37926r1.b()) {
                    npVar.R0();
                    return;
                }
                return;
            case 9:
                ev evVar = (ev) this.f38161b;
                wu wuVar = evVar.f34995q1;
                if (wuVar != null && evVar.f34996r1.J1 && wuVar.f41908x) {
                    wuVar.f41908x = false;
                    wuVar.invalidate();
                    return;
                }
                return;
            case 10:
                rz rzVar = (rz) this.f38161b;
                rzVar.G.invalidate();
                rzVar.invalidate();
                return;
            case 11:
                sz.J0((sz) this.f38161b);
                return;
            case 12:
                u90 u90Var = (u90) this.f38161b;
                v4.p0 layoutManager = u90Var.getLayoutManager();
                v90 v90Var = u90Var.j3;
                o90 o90Var = v90Var.d;
                if (layoutManager == o90Var) {
                    N0 = o90Var.N0();
                } else {
                    N0 = v90Var.f40743c.N0();
                }
                if (N0 == -1) {
                    i11 = 0;
                } else {
                    i11 = N0;
                }
                if (i11 > 0) {
                    jg.h1 h1Var = v90Var.f40745f;
                    if (N0 > h1Var.N0 - 5 && h1Var.f17551v0 == 0 && (str = h1Var.f17549t0) != null && str.length() != 0 && (user = h1Var.f17555x0) != null && (str2 = h1Var.f17548s0) != null) {
                        h1Var.T(true, user, str2, h1Var.f17549t0);
                    }
                }
                u90Var.canScrollVertically(1);
                v90Var.n(!u90Var.canScrollVertically(-1));
                v90Var.b();
                return;
            case 13:
                qa0 qa0Var = (qa0) this.f38161b;
                org.telegram.ui.w8 w8Var = qa0Var.f38860b;
                di.b1 b1Var = qa0Var.f38866f;
                for (int i12 = 0; i12 < b1Var.getChildCount(); i12++) {
                    View childAt = b1Var.getChildAt(i12);
                    if (childAt instanceof org.telegram.ui.Cells.r1) {
                        ((org.telegram.ui.Cells.r1) childAt).A3(w8Var.getMeasuredWidth(), w8Var.getBackgroundSizeY());
                    }
                }
                ka0 ka0Var = qa0Var.f38865e;
                if (ka0Var != null) {
                    ka0Var.w();
                    return;
                }
                return;
            case 14:
                ff0 ff0Var = (ff0) this.f38161b;
                if (ff0Var.f35216m1.getChildCount() > 0) {
                    ff0.J0(ff0Var);
                    return;
                }
                return;
            case 15:
                xi0 xi0Var = (xi0) this.f38161b;
                di.b1 b1Var2 = xi0Var.f42112b;
                int[] iArr = xi0Var.f42126g0;
                if (recyclerView.getChildCount() > 2) {
                    recyclerView.getLocationInWindow(iArr);
                    int i13 = iArr[0];
                    View childAt2 = recyclerView.getChildAt(0);
                    childAt2.getLocationInWindow(iArr);
                    float min = ((1.0f - Math.min(1.0f, (-Math.min(iArr[0] - i13, 0.0f)) / childAt2.getWidth())) * 0.39999998f) + 0.6f;
                    if (Float.isNaN(min)) {
                        min = 1.0f;
                    }
                    xi0.b(xi0Var, childAt2, min);
                    View childAt3 = recyclerView.getChildAt(recyclerView.getChildCount() - 1);
                    childAt3.getLocationInWindow(iArr);
                    float min2 = ((1.0f - Math.min(1.0f, (-Math.min((recyclerView.getWidth() + i13) - (childAt3.getWidth() + iArr[0]), 0.0f)) / childAt3.getWidth())) * 0.39999998f) + 0.6f;
                    if (Float.isNaN(min2)) {
                        min2 = 1.0f;
                    }
                    xi0.b(xi0Var, childAt3, min2);
                }
                for (int i14 = 1; i14 < b1Var2.getChildCount() - 1; i14++) {
                    xi0.b(xi0Var, b1Var2.getChildAt(i14), 1.0f);
                }
                xi0Var.invalidate();
                return;
            case 16:
                ek0 ek0Var = (ek0) this.f38161b;
                Rect rect = ek0Var.F1;
                v4.u0 u0Var = ek0Var.Z0;
                if (u0Var != null) {
                    u0Var.b(recyclerView, i7, i10);
                }
                if (ek0Var.D1 != -1) {
                    rect.offset(-i7, -i10);
                    org.telegram.ui.Cells.y yVar = ek0Var.C1;
                    if (yVar != null) {
                        yVar.setBounds(rect);
                    }
                    ek0Var.invalidate();
                } else {
                    rect.setEmpty();
                }
                ek0Var.L0(false);
                if (i10 != 0 && (jj0Var = ek0Var.f34856e1) != null) {
                    jj0Var.c();
                }
                nj0 nj0Var = ek0Var.T1;
                if (nj0Var != null) {
                    ek0Var.e1(nj0Var, 700, false);
                    return;
                }
                return;
            case 17:
            default:
                return;
            case 18:
                mt0.J0((mt0) this.f38161b);
                return;
            case 19:
                tt0 tt0Var = (tt0) this.f38161b;
                if (recyclerView == tt0Var.H) {
                    tt0Var.S += i10;
                }
                if (tt0Var.Q == null && tt0Var.R == 0) {
                    tt0Var.B();
                    return;
                }
                return;
            case 20:
                ((tu0) this.f38161b).T1.W();
                return;
            case 21:
                kw0.J0((kw0) this.f38161b);
                return;
            case 22:
                ((r51) this.f38161b).R0();
                return;
            case 23:
                ((i71) this.f38161b).invalidate();
                return;
            case 24:
                org.telegram.ui.Wallet.n6 n6Var = (org.telegram.ui.Wallet.n6) this.f38161b;
                if (i10 != 0 && recyclerView.getScrollState() == 1 && (j6Var = n6Var.f44684t0) != null && j6Var.f44446f) {
                    j6Var.d = true;
                }
                n6Var.Y0();
                return;
            case 25:
                int[] iArr2 = (int[]) this.f38161b;
                iArr2[0] = iArr2[0] + i10;
                return;
            case 26:
                org.telegram.ui.Wallet.na naVar = (org.telegram.ui.Wallet.na) this.f38161b;
                if (naVar.f34683a.J1) {
                    org.telegram.messenger.g0.v1(naVar.O);
                    return;
                }
                return;
            case 27:
                org.telegram.ui.web.m mVar = (org.telegram.ui.web.m) this.f38161b;
                if (!mVar.f34683a.canScrollVertically(1)) {
                    if (TextUtils.isEmpty(mVar.f53233w)) {
                        mVar.f53228e.d();
                    } else {
                        org.telegram.ui.web.i iVar = mVar.f53229f;
                        if (iVar != null) {
                            iVar.d();
                        }
                    }
                }
                if (mVar.f34683a.J1) {
                    org.telegram.messenger.g0.v1(mVar.fragmentView);
                    return;
                }
                return;
            case 28:
                org.telegram.ui.web.x0 x0Var = (org.telegram.ui.web.x0) this.f38161b;
                if (x0Var.f34683a.J1) {
                    org.telegram.messenger.g0.v1(x0Var.fragmentView);
                    return;
                }
                return;
            case 29:
                ((ri.q) this.f38161b).h(i7, i10);
                return;
        }
    }
}
