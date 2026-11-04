package org.telegram.ui.Components;

import android.graphics.Rect;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.TLRPC;
public final class ji extends u4.t0 {
    public final int f35075a;
    public final Object f35076b;

    public ji(Object obj, int i3) {
        this.f35075a = i3;
        this.f35076b = obj;
    }

    @Override
    public void a(RecyclerView recyclerView, int i3) {
        int i10;
        bj0 bj0Var;
        bj0 bj0Var2;
        int top;
        int i11;
        bj0 bj0Var3;
        bj0 bj0Var4;
        int top2;
        boolean z10;
        bj0 bj0Var5;
        bj0 bj0Var6;
        org.telegram.ui.Wallet.s8 s8Var;
        int i12 = this.f35075a;
        vg.l1 l1Var = null;
        boolean z11 = true;
        boolean z12 = false;
        Object obj = this.f35076b;
        switch (i12) {
            case 1:
                qi qiVar = (qi) obj;
                ci.j1 j1Var = qiVar.f37464n;
                bi biVar = qiVar.f38416b;
                if (i3 == 0) {
                    int L = org.telegram.messenger.g0.L(13.0f);
                    org.telegram.ui.ActionBar.q0 q0Var = biVar.V2;
                    if (q0Var != null) {
                        i10 = org.telegram.messenger.g0.L(q0Var.getAlpha() * 26.0f);
                    } else {
                        i10 = 0;
                    }
                    int i13 = L + i10;
                    int i14 = biVar.f28617t0;
                    if (((biVar.W3[0] - i14) - i13) + i14 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (bj0Var = (bj0) j1Var.K(0)) != null) {
                        View view = bj0Var.f55540a;
                        if (view.getTop() > org.telegram.messenger.g0.L(7.0f)) {
                            j1Var.w0(0, view.getTop() - org.telegram.messenger.g0.L(7.0f), null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 3:
                uj ujVar = (uj) obj;
                bi biVar2 = ujVar.f38416b;
                jj jjVar = ujVar.f38770r;
                if (i3 == 0) {
                    int L2 = org.telegram.messenger.g0.L(13.0f);
                    int i15 = biVar2.f28617t0;
                    if (((biVar2.W3[0] - i15) - L2) + i15 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (bj0Var2 = (bj0) jjVar.K(0)) != null && (top = (bj0Var2.f55540a.getTop() - org.telegram.messenger.g0.f22602m) - org.telegram.messenger.g0.L(56.0f)) > 0) {
                        jjVar.w0(0, top, null);
                    }
                }
                if (i3 == 1 && ujVar.f38764c0 && jjVar.getAdapter() == ujVar.E) {
                    org.telegram.messenger.g0.v1(biVar2.getCurrentFocus());
                }
                if (i3 == 0) {
                    z11 = false;
                }
                ujVar.V = z11;
                return;
            case 4:
                vj vjVar = (vj) obj;
                tj0 tj0Var = vjVar.f39135r;
                bi biVar3 = vjVar.f38416b;
                if (i3 == 0) {
                    int L3 = org.telegram.messenger.g0.L(13.0f);
                    org.telegram.ui.ActionBar.q0 q0Var2 = biVar3.V2;
                    if (q0Var2 != null) {
                        i11 = org.telegram.messenger.g0.L(q0Var2.getAlpha() * 26.0f);
                    } else {
                        i11 = 0;
                    }
                    int i16 = L3 + i11;
                    int i17 = biVar3.f28617t0;
                    if (((biVar3.W3[0] - i17) - i16) + i17 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (bj0Var3 = (bj0) tj0Var.K(0)) != null) {
                        View view2 = bj0Var3.f55540a;
                        if (view2.getTop() > org.telegram.messenger.g0.L(7.0f)) {
                            tj0Var.w0(0, view2.getTop() - org.telegram.messenger.g0.L(7.0f), null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 5:
                an anVar = (an) obj;
                org.telegram.ui.u51 u51Var = anVar.f31939s;
                if (i3 == 0) {
                    int L4 = org.telegram.messenger.g0.L(13.0f);
                    bi biVar4 = anVar.f38416b;
                    int i18 = biVar4.f28617t0;
                    if (((biVar4.W3[0] - i18) - L4) + i18 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (bj0Var4 = (bj0) u51Var.K(1)) != null && (top2 = (bj0Var4.f55540a.getTop() - org.telegram.messenger.g0.f22602m) - org.telegram.messenger.g0.L(65.0f)) > 0) {
                        u51Var.w0(0, top2, null);
                    }
                    int i19 = anVar.X0;
                    if (i19 >= 0) {
                        an.O(anVar, i19);
                        anVar.X0 = -1;
                        return;
                    }
                    return;
                }
                return;
            case 11:
                b90 b90Var = (b90) obj;
                if (i3 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                b90Var.f32120f3 = z10;
                if (i3 != 1) {
                    z11 = false;
                }
                b90Var.f32121g3 = z11;
                return;
            case 13:
                se0 se0Var = (se0) obj;
                me0 me0Var = se0Var.f37989j1;
                if (i3 == 0) {
                    int L5 = org.telegram.messenger.g0.L(13.0f);
                    int i20 = se0Var.f38000w1;
                    int i21 = se0Var.f28617t0;
                    if (((i20 - i21) - L5) + i21 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && me0Var.canScrollVertically(1) && (bj0Var5 = (bj0) me0Var.K(0)) != null) {
                        View view3 = bj0Var5.f55540a;
                        if (view3.getTop() > org.telegram.messenger.g0.L(7.0f)) {
                            me0Var.w0(0, view3.getTop() - org.telegram.messenger.g0.L(7.0f), null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 15:
                tj0 tj0Var2 = (tj0) obj;
                if (i3 == 0) {
                    if (tj0Var2.f38472u2) {
                        tj0Var2.f38472u2 = false;
                        org.telegram.messenger.hs.e().k(99, 512);
                    }
                } else if (!tj0Var2.f38472u2 && tj0Var2.f38475w1) {
                    tj0Var2.f38472u2 = true;
                    org.telegram.messenger.hs.e().k(98, 512);
                }
                if (i3 != 0 && tj0Var2.M1 != null) {
                    jj0 jj0Var = tj0Var2.f38439d1;
                    if (jj0Var != null) {
                        org.telegram.messenger.g0.r(jj0Var);
                        tj0Var2.f38439d1 = null;
                    }
                    MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                    try {
                        tj0Var2.L1.y(obtain);
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                    }
                    tj0Var2.M1.onTouchEvent(obtain);
                    obtain.recycle();
                    View view4 = tj0Var2.M1;
                    tj0Var2.j1(view4, 0.0f, 0.0f, false);
                    tj0Var2.M1 = null;
                    tj0Var2.m1(view4, null);
                    tj0Var2.O1 = false;
                }
                u4.t0 t0Var = tj0Var2.Z0;
                if (t0Var != null) {
                    t0Var.a(recyclerView, i3);
                }
                z12 = (i3 == 1 || i3 == 2) ? true : true;
                tj0Var2.J1 = z12;
                if (z12) {
                    tj0Var2.K1 = true;
                    return;
                }
                return;
            case 16:
                hl0 hl0Var = (hl0) obj;
                if (i3 == 1) {
                    org.telegram.messenger.g0.v1(hl0Var.G.getCurrentFocus());
                }
                hl0Var.a();
                return;
            case 21:
                v41 v41Var = (v41) obj;
                ci.j1 j1Var2 = v41Var.f38994l1;
                if (i3 == 0 && v41Var.f39006y1 && org.telegram.messenger.g0.L(13.0f) + v41Var.f39003v1 + v41Var.f28617t0 < org.telegram.messenger.g0.f22602m * 2 && j1Var2.canScrollVertically(1) && (bj0Var6 = (bj0) j1Var2.K(0)) != null) {
                    View view5 = bj0Var6.f55540a;
                    if (view5.getTop() > 0) {
                        j1Var2.w0(0, view5.getTop(), null);
                        return;
                    }
                    return;
                }
                return;
            case 23:
                if (i3 == 1 && (s8Var = ((org.telegram.ui.Wallet.w5) obj).f43330j0) != null) {
                    s8Var.a();
                    return;
                }
                return;
            case 28:
                ((pi.q) obj).f53607g++;
                return;
            case 29:
                vg.r0 r0Var = (vg.r0) obj;
                if (i3 == 1) {
                    r0Var.f56729l3 = true;
                }
                if (i3 == 0) {
                    for (int i22 = 0; i22 < recyclerView.getChildCount(); i22++) {
                        vg.l1 l1Var2 = (vg.l1) r0Var.getChildAt(i22);
                        if (l1Var == null || l1Var2.f56702a > l1Var.f56702a) {
                            l1Var = l1Var2;
                        }
                    }
                    if (l1Var != null) {
                        r0Var.z1(l1Var, true);
                        r0Var.f56729l3 = false;
                        r0Var.w0(0, l1Var.getTop() - ((r0Var.getMeasuredHeight() - l1Var.getMeasuredHeight()) / 2), org.telegram.messenger.g0.H);
                    }
                    r0Var.A1();
                    return;
                }
                org.telegram.messenger.g0.r(r0Var.f56730m3);
                return;
            default:
                return;
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i3, int i10) {
        kg.l0 l0Var;
        u20 u20Var;
        u4.d1 T;
        int N0;
        int i11;
        String str;
        TLRPC.User user;
        String str2;
        yi0 yi0Var;
        org.telegram.ui.Wallet.s5 s5Var;
        switch (this.f35075a) {
            case 0:
                ni niVar = (ni) this.f35076b;
                niVar.f38416b.M1(niVar, i10);
                return;
            case 1:
                qi qiVar = (qi) this.f35076b;
                if (qiVar.f37464n.getChildCount() > 0) {
                    qiVar.f38416b.M1(qiVar, i10);
                    return;
                }
                return;
            case 2:
                ej ejVar = (ej) this.f35076b;
                ejVar.f38416b.M1(ejVar, i10);
                ejVar.S();
                return;
            case 3:
                uj ujVar = (uj) this.f35076b;
                lg.d0 d0Var = ujVar.F;
                ujVar.f38416b.M1(ujVar, i10);
                ujVar.Z();
                u4.h0 adapter = ujVar.f38770r.getAdapter();
                tj tjVar = ujVar.E;
                if (adapter == tjVar) {
                    int L0 = d0Var.L0();
                    int N02 = d0Var.N0();
                    int abs = Math.abs(N02 - L0) + 1;
                    int b10 = recyclerView.getAdapter().b();
                    if (abs > 0 && N02 >= b10 - 10) {
                        tj tjVar2 = tjVar.Y.E;
                        if (!tjVar2.T && !tjVar2.W && (l0Var = tjVar.E) != null) {
                            tjVar.Z(tjVar.f38428y, tjVar.F, tjVar.G, l0Var, tjVar.K, false);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 4:
                vj vjVar = (vj) this.f35076b;
                vjVar.f38416b.M1(vjVar, i10);
                vjVar.f39137w.setTranslationY(Math.max(0, vjVar.getCurrentItemTop()));
                return;
            case 5:
                an anVar = (an) this.f35076b;
                lg.d0 d0Var2 = anVar.f31946x;
                anVar.f38416b.M1(anVar, i10);
                rm rmVar = anVar.f31948y;
                if (rmVar != null && rmVar.f36972s) {
                    mw0 delegate = rmVar.getDelegate();
                    if (delegate instanceof org.telegram.ui.Cells.z5) {
                        org.telegram.ui.u51 u51Var = anVar.f31939s;
                        View F = u51Var.F((org.telegram.ui.Cells.z5) delegate);
                        if (F == null) {
                            T = null;
                        } else {
                            T = u51Var.T(F);
                        }
                        if (T != null) {
                            View view = T.f55540a;
                            int b11 = T.b();
                            if (rmVar.getDirection() == 0) {
                                rmVar.setTranslationY((view.getY() - org.telegram.messenger.g0.L(166.0f)) + view.getMeasuredHeight());
                            } else {
                                rmVar.setTranslationY(view.getY());
                            }
                            if (b11 < d0Var2.L0() || b11 > d0Var2.N0()) {
                                rmVar.f();
                            }
                        } else {
                            rmVar.f();
                        }
                    } else {
                        rmVar.f();
                    }
                }
                if (i10 != 0 && (u20Var = anVar.E) != null) {
                    u20Var.a();
                    return;
                }
                return;
            case 6:
                bn bnVar = (bn) this.f35076b;
                bnVar.f38416b.M1(bnVar, i10);
                return;
            case 7:
                vo voVar = (vo) this.f35076b;
                if (voVar.f39193u1.M0() + 10 >= voVar.f39187o1.b()) {
                    voVar.Q0();
                    return;
                }
                return;
            case 8:
                pu puVar = (pu) this.f35076b;
                hu huVar = puVar.f37242n1;
                if (huVar != null && puVar.f37243o1.J1 && huVar.f34514x) {
                    huVar.f34514x = false;
                    huVar.invalidate();
                    return;
                }
                return;
            case 9:
                bz bzVar = (bz) this.f35076b;
                bzVar.G.invalidate();
                bzVar.invalidate();
                return;
            case 10:
                cz.I0((cz) this.f35076b);
                return;
            case 11:
                b90 b90Var = (b90) this.f35076b;
                u4.o0 layoutManager = b90Var.getLayoutManager();
                c90 c90Var = b90Var.f32123j3;
                v80 v80Var = c90Var.d;
                if (layoutManager == v80Var) {
                    N0 = v80Var.N0();
                } else {
                    N0 = c90Var.f32612c.N0();
                }
                if (N0 == -1) {
                    i11 = 0;
                } else {
                    i11 = N0;
                }
                if (i11 > 0) {
                    kg.e1 e1Var = c90Var.f32614f;
                    if (N0 > e1Var.N0 - 5 && e1Var.f17016v0 == 0 && (str = e1Var.f17014t0) != null && str.length() != 0 && (user = e1Var.f17020x0) != null && (str2 = e1Var.f17013s0) != null) {
                        e1Var.T(true, user, str2, e1Var.f17014t0);
                    }
                }
                b90Var.canScrollVertically(1);
                c90Var.n(!b90Var.canScrollVertically(-1));
                c90Var.b();
                return;
            case 12:
                x90 x90Var = (x90) this.f35076b;
                ai.h5 h5Var = x90Var.f40287b;
                ci.j1 j1Var = x90Var.f40293f;
                for (int i12 = 0; i12 < j1Var.getChildCount(); i12++) {
                    View childAt = j1Var.getChildAt(i12);
                    if (childAt instanceof org.telegram.ui.Cells.q1) {
                        ((org.telegram.ui.Cells.q1) childAt).w3(h5Var.getMeasuredWidth(), h5Var.getBackgroundSizeY());
                    }
                }
                r90 r90Var = x90Var.f40292e;
                if (r90Var != null) {
                    r90Var.w();
                    return;
                }
                return;
            case 13:
                se0 se0Var = (se0) this.f35076b;
                if (se0Var.f37989j1.getChildCount() > 0) {
                    se0.I0(se0Var);
                    return;
                }
                return;
            case 14:
                li0 li0Var = (li0) this.f35076b;
                ci.j1 j1Var2 = li0Var.f35736b;
                int[] iArr = li0Var.f35750g0;
                if (recyclerView.getChildCount() > 2) {
                    recyclerView.getLocationInWindow(iArr);
                    int i13 = iArr[0];
                    View childAt2 = recyclerView.getChildAt(0);
                    childAt2.getLocationInWindow(iArr);
                    float min = ((1.0f - Math.min(1.0f, (-Math.min(iArr[0] - i13, 0.0f)) / childAt2.getWidth())) * 0.39999998f) + 0.6f;
                    if (Float.isNaN(min)) {
                        min = 1.0f;
                    }
                    li0.b(li0Var, childAt2, min);
                    View childAt3 = recyclerView.getChildAt(recyclerView.getChildCount() - 1);
                    childAt3.getLocationInWindow(iArr);
                    float min2 = ((1.0f - Math.min(1.0f, (-Math.min((recyclerView.getWidth() + i13) - (childAt3.getWidth() + iArr[0]), 0.0f)) / childAt3.getWidth())) * 0.39999998f) + 0.6f;
                    if (Float.isNaN(min2)) {
                        min2 = 1.0f;
                    }
                    li0.b(li0Var, childAt3, min2);
                }
                for (int i14 = 1; i14 < j1Var2.getChildCount() - 1; i14++) {
                    li0.b(li0Var, j1Var2.getChildAt(i14), 1.0f);
                }
                li0Var.invalidate();
                return;
            case 15:
                tj0 tj0Var = (tj0) this.f35076b;
                Rect rect = tj0Var.F1;
                u4.t0 t0Var = tj0Var.Z0;
                if (t0Var != null) {
                    t0Var.b(recyclerView, i3, i10);
                }
                if (tj0Var.D1 != -1) {
                    rect.offset(-i3, -i10);
                    org.telegram.ui.Cells.y yVar = tj0Var.C1;
                    if (yVar != null) {
                        yVar.setBounds(rect);
                    }
                    tj0Var.invalidate();
                } else {
                    rect.setEmpty();
                }
                tj0Var.L0(false);
                if (i10 != 0 && (yi0Var = tj0Var.f38441e1) != null) {
                    yi0Var.c();
                }
                cj0 cj0Var = tj0Var.T1;
                if (cj0Var != null) {
                    tj0Var.e1(cj0Var, 700, false);
                    return;
                }
                return;
            case 16:
            default:
                return;
            case 17:
                zs0.I0((zs0) this.f35076b);
                return;
            case 18:
                gt0 gt0Var = (gt0) this.f35076b;
                if (recyclerView == gt0Var.H) {
                    gt0Var.S += i10;
                }
                if (gt0Var.Q == null && gt0Var.R == 0) {
                    gt0Var.B();
                    return;
                }
                return;
            case 19:
                ((gu0) this.f35076b).Q1.W();
                return;
            case 20:
                xv0.I0((xv0) this.f35076b);
                return;
            case 21:
                ((v41) this.f35076b).Q0();
                return;
            case 22:
                ((m61) this.f35076b).invalidate();
                return;
            case 23:
                org.telegram.ui.Wallet.w5 w5Var = (org.telegram.ui.Wallet.w5) this.f35076b;
                if (i10 != 0 && recyclerView.getScrollState() == 1 && (s5Var = w5Var.f43339r0) != null && s5Var.f43157f) {
                    s5Var.d = true;
                }
                w5Var.T0();
                return;
            case 24:
                int[] iArr2 = (int[]) this.f35076b;
                iArr2[0] = iArr2[0] + i10;
                return;
            case 25:
                org.telegram.ui.Wallet.w9 w9Var = (org.telegram.ui.Wallet.w9) this.f35076b;
                if (w9Var.f34298a.J1) {
                    org.telegram.messenger.g0.v1(w9Var.O);
                    return;
                }
                return;
            case 26:
                org.telegram.ui.web.n nVar = (org.telegram.ui.web.n) this.f35076b;
                if (!nVar.f34298a.canScrollVertically(1)) {
                    if (TextUtils.isEmpty(nVar.f50960w)) {
                        nVar.f50955e.d();
                    } else {
                        org.telegram.ui.web.j jVar = nVar.f50956f;
                        if (jVar != null) {
                            jVar.d();
                        }
                    }
                }
                if (nVar.f34298a.J1) {
                    org.telegram.messenger.g0.v1(nVar.fragmentView);
                    return;
                }
                return;
            case 27:
                org.telegram.ui.web.y0 y0Var = (org.telegram.ui.web.y0) this.f35076b;
                if (y0Var.f34298a.J1) {
                    org.telegram.messenger.g0.v1(y0Var.fragmentView);
                    return;
                }
                return;
            case 28:
                ((pi.q) this.f35076b).h(i3, i10);
                return;
            case 29:
                vg.r0 r0Var = (vg.r0) this.f35076b;
                if (recyclerView.getScrollState() == 1) {
                    r0Var.z1(null, true);
                }
                r0Var.invalidate();
                return;
        }
    }
}
