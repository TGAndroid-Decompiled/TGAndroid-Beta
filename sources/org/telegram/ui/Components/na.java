package org.telegram.ui.Components;

import android.graphics.Rect;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.TLRPC;
public final class na extends v4.u0 {
    public final int f37734a;
    public final Object f37735b;

    public na(Object obj, int i7) {
        this.f37734a = i7;
        this.f37735b = obj;
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
        org.telegram.ui.Wallet.k9 k9Var;
        int i12 = this.f37734a;
        boolean z11 = false;
        Object obj = this.f37735b;
        switch (i12) {
            case 2:
                gj gjVar = (gj) obj;
                di.b1 b1Var = gjVar.f35451n;
                ti tiVar = gjVar.f37135b;
                if (i7 == 0) {
                    int L = org.telegram.messenger.g0.L(13.0f);
                    org.telegram.ui.ActionBar.q0 q0Var = tiVar.Y2;
                    if (q0Var != null) {
                        i10 = org.telegram.messenger.g0.L(q0Var.getAlpha() * 26.0f);
                    } else {
                        i10 = 0;
                    }
                    int i13 = L + i10;
                    int i14 = tiVar.f30260t0;
                    if (((tiVar.Z3[0] - i14) - i13) + i14 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (mj0Var = (mj0) b1Var.K(0)) != null) {
                        View view = mj0Var.f59245a;
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
                kk kkVar = (kk) obj;
                ti tiVar2 = kkVar.f37135b;
                zj zjVar = kkVar.f36766r;
                if (i7 == 0) {
                    int L2 = org.telegram.messenger.g0.L(13.0f);
                    int i15 = tiVar2.f30260t0;
                    if (((tiVar2.Z3[0] - i15) - L2) + i15 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (mj0Var2 = (mj0) zjVar.K(0)) != null && (top = (mj0Var2.f59245a.getTop() - org.telegram.messenger.g0.f24220m) - org.telegram.messenger.g0.L(56.0f)) > 0) {
                        zjVar.w0(0, top, null);
                    }
                }
                if (i7 == 1 && kkVar.f36760c0 && zjVar.getAdapter() == kkVar.E) {
                    org.telegram.messenger.g0.v1(tiVar2.getCurrentFocus());
                }
                if (i7 != 0) {
                    z11 = true;
                }
                kkVar.V = z11;
                return;
            case 5:
                lk lkVar = (lk) obj;
                ek0 ek0Var = lkVar.f37145r;
                ti tiVar3 = lkVar.f37135b;
                if (i7 == 0) {
                    int L3 = org.telegram.messenger.g0.L(13.0f);
                    org.telegram.ui.ActionBar.q0 q0Var2 = tiVar3.Y2;
                    if (q0Var2 != null) {
                        i11 = org.telegram.messenger.g0.L(q0Var2.getAlpha() * 26.0f);
                    } else {
                        i11 = 0;
                    }
                    int i16 = L3 + i11;
                    int i17 = tiVar3.f30260t0;
                    if (((tiVar3.Z3[0] - i17) - i16) + i17 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (mj0Var3 = (mj0) ek0Var.K(0)) != null) {
                        View view2 = mj0Var3.f59245a;
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
                qn qnVar = (qn) obj;
                org.telegram.ui.d61 d61Var = qnVar.f38944s;
                if (i7 == 0) {
                    int L4 = org.telegram.messenger.g0.L(13.0f);
                    ti tiVar4 = qnVar.f37135b;
                    int i18 = tiVar4.f30260t0;
                    if (((tiVar4.Z3[0] - i18) - L4) + i18 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (mj0Var4 = (mj0) d61Var.K(1)) != null && (top2 = (mj0Var4.f59245a.getTop() - org.telegram.messenger.g0.f24220m) - org.telegram.messenger.g0.L(65.0f)) > 0) {
                        d61Var.w0(0, top2, null);
                    }
                    int i19 = qnVar.X0;
                    if (i19 >= 0) {
                        qn.P(qnVar, i19);
                        qnVar.X0 = -1;
                        return;
                    }
                    return;
                }
                return;
            case 12:
                r90 r90Var = (r90) obj;
                if (i7 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                r90Var.f39241f3 = z10;
                if (i7 == 1) {
                    z11 = true;
                }
                r90Var.f39242g3 = z11;
                return;
            case 14:
                ef0 ef0Var = (ef0) obj;
                ye0 ye0Var = ef0Var.f34702m1;
                if (i7 == 0) {
                    int L5 = org.telegram.messenger.g0.L(13.0f);
                    int i20 = ef0Var.f34714z1;
                    int i21 = ef0Var.f30260t0;
                    if (((i20 - i21) - L5) + i21 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && ye0Var.canScrollVertically(1) && (mj0Var5 = (mj0) ye0Var.K(0)) != null) {
                        View view3 = mj0Var5.f59245a;
                        if (view3.getTop() > org.telegram.messenger.g0.L(7.0f)) {
                            ye0Var.w0(0, view3.getTop() - org.telegram.messenger.g0.L(7.0f), null);
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
                    if (ek0Var2.f34779u2) {
                        ek0Var2.f34779u2 = false;
                        org.telegram.messenger.ks.e().k(99, 512);
                    }
                } else if (!ek0Var2.f34779u2 && ek0Var2.f34782w1) {
                    ek0Var2.f34779u2 = true;
                    org.telegram.messenger.ks.e().k(98, 512);
                }
                if (i7 != 0 && ek0Var2.M1 != null) {
                    uj0 uj0Var = ek0Var2.f34747d1;
                    if (uj0Var != null) {
                        org.telegram.messenger.g0.r(uj0Var);
                        ek0Var2.f34747d1 = null;
                    }
                    MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                    try {
                        ek0Var2.L1.I2(obtain);
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
                q51 q51Var = (q51) obj;
                di.b1 b1Var2 = q51Var.f38698o1;
                if (i7 == 0 && q51Var.B1 && org.telegram.messenger.g0.L(13.0f) + q51Var.f38708y1 + q51Var.f30260t0 < org.telegram.messenger.g0.f24220m * 2 && b1Var2.canScrollVertically(1) && (mj0Var6 = (mj0) b1Var2.K(0)) != null) {
                    View view5 = mj0Var6.f59245a;
                    if (view5.getTop() > 0) {
                        b1Var2.w0(0, view5.getTop(), null);
                        return;
                    }
                    return;
                }
                return;
            case 24:
                if (i7 == 1 && (k9Var = ((org.telegram.ui.Wallet.o6) obj).f44804j0) != null) {
                    k9Var.a();
                    return;
                }
                return;
            case 29:
                ((ri.q) obj).f56822g++;
                return;
            default:
                return;
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i7, int i10) {
        jg.o0 o0Var;
        j30 j30Var;
        v4.f1 T;
        int N0;
        int i11;
        String str;
        TLRPC.User user;
        String str2;
        jj0 jj0Var;
        org.telegram.ui.Wallet.k6 k6Var;
        switch (this.f37734a) {
            case 0:
                ((cu0) this.f37735b).invalidate();
                return;
            case 1:
                dj djVar = (dj) this.f37735b;
                djVar.f37135b.N1(djVar, i10);
                return;
            case 2:
                gj gjVar = (gj) this.f37735b;
                if (gjVar.f35451n.getChildCount() > 0) {
                    gjVar.f37135b.N1(gjVar, i10);
                    return;
                }
                return;
            case 3:
                uj ujVar = (uj) this.f37735b;
                ujVar.f37135b.N1(ujVar, i10);
                ujVar.T();
                return;
            case 4:
                kk kkVar = (kk) this.f37735b;
                kg.d0 d0Var = kkVar.F;
                kkVar.f37135b.N1(kkVar, i10);
                kkVar.Z();
                v4.i0 adapter = kkVar.f36766r.getAdapter();
                jk jkVar = kkVar.E;
                if (adapter == jkVar) {
                    int L0 = d0Var.L0();
                    int N02 = d0Var.N0();
                    int abs = Math.abs(N02 - L0) + 1;
                    int b10 = recyclerView.getAdapter().b();
                    if (abs > 0 && N02 >= b10 - 10) {
                        jk jkVar2 = jkVar.Y.E;
                        if (!jkVar2.T && !jkVar2.W && (o0Var = jkVar.E) != null) {
                            jkVar.Z(jkVar.f36454y, jkVar.F, jkVar.G, o0Var, jkVar.K, false);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 5:
                lk lkVar = (lk) this.f37735b;
                lkVar.f37135b.N1(lkVar, i10);
                lkVar.f37147w.setTranslationY(Math.max(0, lkVar.getCurrentItemTop()));
                return;
            case 6:
                qn qnVar = (qn) this.f37735b;
                kg.d0 d0Var2 = qnVar.f38951x;
                qnVar.f37135b.N1(qnVar, i10);
                hn hnVar = qnVar.f38953y;
                if (hnVar != null && hnVar.f43068s) {
                    xw0 delegate = hnVar.getDelegate();
                    if (delegate instanceof org.telegram.ui.Cells.a6) {
                        org.telegram.ui.d61 d61Var = qnVar.f38944s;
                        View F = d61Var.F((org.telegram.ui.Cells.a6) delegate);
                        if (F == null) {
                            T = null;
                        } else {
                            T = d61Var.T(F);
                        }
                        if (T != null) {
                            View view = T.f59245a;
                            int b11 = T.b();
                            if (hnVar.getDirection() == 0) {
                                hnVar.setTranslationY((view.getY() - org.telegram.messenger.g0.L(166.0f)) + view.getMeasuredHeight());
                            } else {
                                hnVar.setTranslationY(view.getY());
                            }
                            if (b11 < d0Var2.L0() || b11 > d0Var2.N0()) {
                                hnVar.f();
                            }
                        } else {
                            hnVar.f();
                        }
                    } else {
                        hnVar.f();
                    }
                }
                if (i10 != 0 && (j30Var = qnVar.E) != null) {
                    j30Var.a();
                    return;
                }
                return;
            case 7:
                rn rnVar = (rn) this.f37735b;
                rnVar.f37135b.N1(rnVar, i10);
                return;
            case 8:
                kp kpVar = (kp) this.f37735b;
                if (kpVar.f36840x1.M0() + 10 >= kpVar.f36834r1.b()) {
                    kpVar.R0();
                    return;
                }
                return;
            case 9:
                bv bvVar = (bv) this.f37735b;
                tu tuVar = bvVar.f33819q1;
                if (tuVar != null && bvVar.f33820r1.J1 && tuVar.f40166x) {
                    tuVar.f40166x = false;
                    tuVar.invalidate();
                    return;
                }
                return;
            case 10:
                oz ozVar = (oz) this.f37735b;
                ozVar.G.invalidate();
                ozVar.invalidate();
                return;
            case 11:
                pz.J0((pz) this.f37735b);
                return;
            case 12:
                r90 r90Var = (r90) this.f37735b;
                v4.p0 layoutManager = r90Var.getLayoutManager();
                s90 s90Var = r90Var.j3;
                l90 l90Var = s90Var.d;
                if (layoutManager == l90Var) {
                    N0 = l90Var.N0();
                } else {
                    N0 = s90Var.f39536c.N0();
                }
                if (N0 == -1) {
                    i11 = 0;
                } else {
                    i11 = N0;
                }
                if (i11 > 0) {
                    jg.h1 h1Var = s90Var.f39538f;
                    if (N0 > h1Var.N0 - 5 && h1Var.f17622v0 == 0 && (str = h1Var.f17620t0) != null && str.length() != 0 && (user = h1Var.f17626x0) != null && (str2 = h1Var.f17619s0) != null) {
                        h1Var.T(true, user, str2, h1Var.f17620t0);
                    }
                }
                r90Var.canScrollVertically(1);
                s90Var.n(!r90Var.canScrollVertically(-1));
                s90Var.b();
                return;
            case 13:
                na0 na0Var = (na0) this.f37735b;
                org.telegram.ui.w8 w8Var = na0Var.f37738b;
                di.b1 b1Var = na0Var.f37744f;
                for (int i12 = 0; i12 < b1Var.getChildCount(); i12++) {
                    View childAt = b1Var.getChildAt(i12);
                    if (childAt instanceof org.telegram.ui.Cells.r1) {
                        ((org.telegram.ui.Cells.r1) childAt).A3(w8Var.getMeasuredWidth(), w8Var.getBackgroundSizeY());
                    }
                }
                ha0 ha0Var = na0Var.f37743e;
                if (ha0Var != null) {
                    ha0Var.w();
                    return;
                }
                return;
            case 14:
                ef0 ef0Var = (ef0) this.f37735b;
                if (ef0Var.f34702m1.getChildCount() > 0) {
                    ef0.J0(ef0Var);
                    return;
                }
                return;
            case 15:
                xi0 xi0Var = (xi0) this.f37735b;
                di.b1 b1Var2 = xi0Var.f42011b;
                int[] iArr = xi0Var.f42025g0;
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
                ek0 ek0Var = (ek0) this.f37735b;
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
                if (i10 != 0 && (jj0Var = ek0Var.f34748e1) != null) {
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
                lt0.J0((lt0) this.f37735b);
                return;
            case 19:
                st0 st0Var = (st0) this.f37735b;
                if (recyclerView == st0Var.H) {
                    st0Var.S += i10;
                }
                if (st0Var.Q == null && st0Var.R == 0) {
                    st0Var.B();
                    return;
                }
                return;
            case 20:
                ((su0) this.f37735b).T1.W();
                return;
            case 21:
                jw0.J0((jw0) this.f37735b);
                return;
            case 22:
                ((q51) this.f37735b).R0();
                return;
            case 23:
                ((j71) this.f37735b).invalidate();
                return;
            case 24:
                org.telegram.ui.Wallet.o6 o6Var = (org.telegram.ui.Wallet.o6) this.f37735b;
                if (i10 != 0 && recyclerView.getScrollState() == 1 && (k6Var = o6Var.f44816t0) != null && k6Var.f44577f) {
                    k6Var.d = true;
                }
                o6Var.Y0();
                return;
            case 25:
                int[] iArr2 = (int[]) this.f37735b;
                iArr2[0] = iArr2[0] + i10;
                return;
            case 26:
                org.telegram.ui.Wallet.oa oaVar = (org.telegram.ui.Wallet.oa) this.f37735b;
                if (oaVar.f34213a.J1) {
                    org.telegram.messenger.g0.v1(oaVar.O);
                    return;
                }
                return;
            case 27:
                org.telegram.ui.web.m mVar = (org.telegram.ui.web.m) this.f37735b;
                if (!mVar.f34213a.canScrollVertically(1)) {
                    if (TextUtils.isEmpty(mVar.f53472w)) {
                        mVar.f53467e.d();
                    } else {
                        org.telegram.ui.web.i iVar = mVar.f53468f;
                        if (iVar != null) {
                            iVar.d();
                        }
                    }
                }
                if (mVar.f34213a.J1) {
                    org.telegram.messenger.g0.v1(mVar.fragmentView);
                    return;
                }
                return;
            case 28:
                org.telegram.ui.web.x0 x0Var = (org.telegram.ui.web.x0) this.f37735b;
                if (x0Var.f34213a.J1) {
                    org.telegram.messenger.g0.v1(x0Var.fragmentView);
                    return;
                }
                return;
            case 29:
                ((ri.q) this.f37735b).h(i7, i10);
                return;
        }
    }
}
