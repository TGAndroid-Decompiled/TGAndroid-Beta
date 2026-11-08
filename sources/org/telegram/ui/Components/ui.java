package org.telegram.ui.Components;

import android.graphics.Rect;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.TLRPC;
public final class ui extends v4.s0 {
    public final int f38650a;
    public final Object f38651b;

    public ui(Object obj, int i7) {
        this.f38650a = i7;
        this.f38651b = obj;
    }

    @Override
    public void a(RecyclerView recyclerView, int i7) {
        xi0 xi0Var;
        int top;
        int i10;
        xi0 xi0Var2;
        xi0 xi0Var3;
        int top2;
        boolean z9;
        xi0 xi0Var4;
        xi0 xi0Var5;
        org.telegram.ui.Wallet.s8 s8Var;
        int i11 = this.f38650a;
        ug.i1 i1Var = null;
        boolean z10 = false;
        Object obj = this.f38651b;
        switch (i11) {
            case 1:
                vj vjVar = (vj) obj;
                di diVar = vjVar.f39004b;
                kj kjVar = vjVar.f39020r;
                if (i7 == 0) {
                    int L = org.telegram.messenger.g0.L(13.0f);
                    int i12 = diVar.f28648s0;
                    if (((diVar.V3[0] - i12) - L) + i12 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (xi0Var = (xi0) kjVar.K(0)) != null && (top = (xi0Var.f57044a.getTop() - org.telegram.messenger.g0.f22557m) - org.telegram.messenger.g0.L(56.0f)) > 0) {
                        kjVar.w0(0, top, null);
                    }
                }
                if (i7 == 1 && vjVar.f39014b0 && kjVar.getAdapter() == vjVar.D) {
                    org.telegram.messenger.g0.v1(diVar.getCurrentFocus());
                }
                if (i7 != 0) {
                    z10 = true;
                }
                vjVar.U = z10;
                return;
            case 2:
                wj wjVar = (wj) obj;
                pj0 pj0Var = wjVar.f39934r;
                di diVar2 = wjVar.f39004b;
                if (i7 == 0) {
                    int L2 = org.telegram.messenger.g0.L(13.0f);
                    org.telegram.ui.ActionBar.r0 r0Var = diVar2.U2;
                    if (r0Var != null) {
                        i10 = org.telegram.messenger.g0.L(r0Var.getAlpha() * 26.0f);
                    } else {
                        i10 = 0;
                    }
                    int i13 = L2 + i10;
                    int i14 = diVar2.f28648s0;
                    if (((diVar2.V3[0] - i14) - i13) + i14 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (xi0Var2 = (xi0) pj0Var.K(0)) != null) {
                        View view = xi0Var2.f57044a;
                        if (view.getTop() > org.telegram.messenger.g0.L(7.0f)) {
                            pj0Var.w0(0, view.getTop() - org.telegram.messenger.g0.L(7.0f), null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 3:
                bn bnVar = (bn) obj;
                org.telegram.ui.e61 e61Var = bnVar.f32260s;
                if (i7 == 0) {
                    int L3 = org.telegram.messenger.g0.L(13.0f);
                    di diVar3 = bnVar.f39004b;
                    int i15 = diVar3.f28648s0;
                    if (((diVar3.V3[0] - i15) - L3) + i15 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (xi0Var3 = (xi0) e61Var.K(1)) != null && (top2 = (xi0Var3.f57044a.getTop() - org.telegram.messenger.g0.f22557m) - org.telegram.messenger.g0.L(65.0f)) > 0) {
                        e61Var.w0(0, top2, null);
                    }
                    int i16 = bnVar.W0;
                    if (i16 >= 0) {
                        bn.O(bnVar, i16);
                        bnVar.W0 = -1;
                        return;
                    }
                    return;
                }
                return;
            case 9:
                f90 f90Var = (f90) obj;
                if (i7 != 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                f90Var.f33503e3 = z9;
                if (i7 == 1) {
                    z10 = true;
                }
                f90Var.f33504f3 = z10;
                return;
            case 11:
                qe0 qe0Var = (qe0) obj;
                ke0 ke0Var = qe0Var.f37299i1;
                if (i7 == 0) {
                    int L4 = org.telegram.messenger.g0.L(13.0f);
                    int i17 = qe0Var.f37310v1;
                    int i18 = qe0Var.f28648s0;
                    if (((i17 - i18) - L4) + i18 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && ke0Var.canScrollVertically(1) && (xi0Var4 = (xi0) ke0Var.K(0)) != null) {
                        View view2 = xi0Var4.f57044a;
                        if (view2.getTop() > org.telegram.messenger.g0.L(7.0f)) {
                            ke0Var.w0(0, view2.getTop() - org.telegram.messenger.g0.L(7.0f), null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 13:
                pj0 pj0Var2 = (pj0) obj;
                if (i7 == 0) {
                    if (pj0Var2.f36993t2) {
                        pj0Var2.f36993t2 = false;
                        org.telegram.messenger.qs.e().k(99, 512);
                    }
                } else if (!pj0Var2.f36993t2 && pj0Var2.f36996v1) {
                    pj0Var2.f36993t2 = true;
                    org.telegram.messenger.qs.e().k(98, 512);
                }
                if (i7 != 0 && pj0Var2.L1 != null) {
                    fj0 fj0Var = pj0Var2.f36961c1;
                    if (fj0Var != null) {
                        org.telegram.messenger.g0.r(fj0Var);
                        pj0Var2.f36961c1 = null;
                    }
                    MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                    try {
                        pj0Var2.K1.n0(obtain);
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                    }
                    pj0Var2.L1.onTouchEvent(obtain);
                    obtain.recycle();
                    View view3 = pj0Var2.L1;
                    pj0Var2.j1(view3, 0.0f, 0.0f, false);
                    pj0Var2.L1 = null;
                    pj0Var2.m1(view3, null);
                    pj0Var2.N1 = false;
                }
                v4.s0 s0Var = pj0Var2.Y0;
                if (s0Var != null) {
                    s0Var.a(recyclerView, i7);
                }
                z10 = (i7 == 1 || i7 == 2) ? true : true;
                pj0Var2.I1 = z10;
                if (z10) {
                    pj0Var2.J1 = true;
                    return;
                }
                return;
            case 14:
                dl0 dl0Var = (dl0) obj;
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(dl0Var.F.getCurrentFocus());
                }
                dl0Var.a();
                return;
            case 19:
                b51 b51Var = (b51) obj;
                bi.q1 q1Var = b51Var.f32043k1;
                if (i7 == 0 && b51Var.f32054x1 && org.telegram.messenger.g0.L(13.0f) + b51Var.f32051u1 + b51Var.f28648s0 < org.telegram.messenger.g0.f22557m * 2 && q1Var.canScrollVertically(1) && (xi0Var5 = (xi0) q1Var.K(0)) != null) {
                    View view4 = xi0Var5.f57044a;
                    if (view4.getTop() > 0) {
                        q1Var.w0(0, view4.getTop(), null);
                        return;
                    }
                    return;
                }
                return;
            case 21:
                if (i7 == 1 && (s8Var = ((org.telegram.ui.Wallet.x5) obj).f43341i0) != null) {
                    s8Var.a();
                    return;
                }
                return;
            case 26:
                ug.s0 s0Var2 = (ug.s0) obj;
                if (i7 == 1) {
                    s0Var2.f56652k3 = true;
                }
                if (i7 == 0) {
                    for (int i19 = 0; i19 < recyclerView.getChildCount(); i19++) {
                        ug.i1 i1Var2 = (ug.i1) s0Var2.getChildAt(i19);
                        if (i1Var == null || i1Var2.f56629a > i1Var.f56629a) {
                            i1Var = i1Var2;
                        }
                    }
                    if (i1Var != null) {
                        s0Var2.z1(i1Var, true);
                        s0Var2.f56652k3 = false;
                        s0Var2.w0(0, i1Var.getTop() - ((s0Var2.getMeasuredHeight() - i1Var.getMeasuredHeight()) / 2), org.telegram.messenger.g0.H);
                    }
                    s0Var2.A1();
                    return;
                }
                org.telegram.messenger.g0.r(s0Var2.f56653l3);
                return;
            case 28:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(((wg.w0) obj).Q1.getEditText());
                    return;
                }
                return;
            case 29:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(((wg.f1) obj).R1.getEditText());
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i7, int i10) {
        jg.o0 o0Var;
        y20 y20Var;
        v4.d1 T;
        int N0;
        int i11;
        String str;
        TLRPC.User user;
        String str2;
        ui0 ui0Var;
        org.telegram.ui.Wallet.t5 t5Var;
        switch (this.f38650a) {
            case 0:
                fj fjVar = (fj) this.f38651b;
                fjVar.f39004b.M1(fjVar, i10);
                fjVar.S();
                return;
            case 1:
                vj vjVar = (vj) this.f38651b;
                kg.c0 c0Var = vjVar.E;
                vjVar.f39004b.M1(vjVar, i10);
                vjVar.Z();
                v4.g0 adapter = vjVar.f39020r.getAdapter();
                uj ujVar = vjVar.D;
                if (adapter == ujVar) {
                    int L0 = c0Var.L0();
                    int N02 = c0Var.N0();
                    int abs = Math.abs(N02 - L0) + 1;
                    int b10 = recyclerView.getAdapter().b();
                    if (abs > 0 && N02 >= b10 - 10) {
                        uj ujVar2 = ujVar.X.D;
                        if (!ujVar2.S && !ujVar2.V && (o0Var = ujVar.D) != null) {
                            ujVar.Z(ujVar.f38682y, ujVar.E, ujVar.F, o0Var, ujVar.J, false);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 2:
                wj wjVar = (wj) this.f38651b;
                wjVar.f39004b.M1(wjVar, i10);
                wjVar.f39936w.setTranslationY(Math.max(0, wjVar.getCurrentItemTop()));
                return;
            case 3:
                bn bnVar = (bn) this.f38651b;
                kg.c0 c0Var2 = bnVar.f32267x;
                bnVar.f39004b.M1(bnVar, i10);
                sm smVar = bnVar.f32269y;
                if (smVar != null && smVar.f36718s) {
                    mw0 delegate = smVar.getDelegate();
                    if (delegate instanceof org.telegram.ui.Cells.a6) {
                        org.telegram.ui.e61 e61Var = bnVar.f32260s;
                        View F = e61Var.F((org.telegram.ui.Cells.a6) delegate);
                        if (F == null) {
                            T = null;
                        } else {
                            T = e61Var.T(F);
                        }
                        if (T != null) {
                            View view = T.f57044a;
                            int b11 = T.b();
                            if (smVar.getDirection() == 0) {
                                smVar.setTranslationY((view.getY() - org.telegram.messenger.g0.L(166.0f)) + view.getMeasuredHeight());
                            } else {
                                smVar.setTranslationY(view.getY());
                            }
                            if (b11 < c0Var2.L0() || b11 > c0Var2.N0()) {
                                smVar.f();
                            }
                        } else {
                            smVar.f();
                        }
                    } else {
                        smVar.f();
                    }
                }
                if (i10 != 0 && (y20Var = bnVar.D) != null) {
                    y20Var.a();
                    return;
                }
                return;
            case 4:
                cn cnVar = (cn) this.f38651b;
                cnVar.f39004b.M1(cnVar, i10);
                return;
            case 5:
                vo voVar = (vo) this.f38651b;
                if (voVar.f39061t1.M0() + 10 >= voVar.n1.b()) {
                    voVar.Q0();
                    return;
                }
                return;
            case 6:
                ru ruVar = (ru) this.f38651b;
                ju juVar = ruVar.f37778m1;
                if (juVar != null && ruVar.n1.I1 && juVar.f35101x) {
                    juVar.f35101x = false;
                    juVar.invalidate();
                    return;
                }
                return;
            case 7:
                fz fzVar = (fz) this.f38651b;
                fzVar.F.invalidate();
                fzVar.invalidate();
                return;
            case 8:
                gz.I0((gz) this.f38651b);
                return;
            case 9:
                f90 f90Var = (f90) this.f38651b;
                v4.n0 layoutManager = f90Var.getLayoutManager();
                g90 g90Var = f90Var.f33507i3;
                z80 z80Var = g90Var.d;
                if (layoutManager == z80Var) {
                    N0 = z80Var.N0();
                } else {
                    N0 = g90Var.f33895c.N0();
                }
                if (N0 == -1) {
                    i11 = 0;
                } else {
                    i11 = N0;
                }
                if (i11 > 0) {
                    jg.i1 i1Var = g90Var.f33897f;
                    if (N0 > i1Var.M0 - 5 && i1Var.f16799u0 == 0 && (str = i1Var.f16797s0) != null && str.length() != 0 && (user = i1Var.f16802w0) != null && (str2 = i1Var.f16795r0) != null) {
                        i1Var.T(true, user, str2, i1Var.f16797s0);
                    }
                }
                f90Var.canScrollVertically(1);
                g90Var.n(!f90Var.canScrollVertically(-1));
                g90Var.b();
                return;
            case 10:
                ca0 ca0Var = (ca0) this.f38651b;
                org.telegram.ui.v8 v8Var = ca0Var.f32522b;
                bi.q1 q1Var = ca0Var.f32527f;
                for (int i12 = 0; i12 < q1Var.getChildCount(); i12++) {
                    View childAt = q1Var.getChildAt(i12);
                    if (childAt instanceof org.telegram.ui.Cells.q1) {
                        ((org.telegram.ui.Cells.q1) childAt).y3(v8Var.getMeasuredWidth(), v8Var.getBackgroundSizeY());
                    }
                }
                w90 w90Var = ca0Var.f32526e;
                if (w90Var != null) {
                    w90Var.w();
                    return;
                }
                return;
            case 11:
                qe0 qe0Var = (qe0) this.f38651b;
                if (qe0Var.f37299i1.getChildCount() > 0) {
                    qe0.I0(qe0Var);
                    return;
                }
                return;
            case 12:
                ii0 ii0Var = (ii0) this.f38651b;
                bi.q1 q1Var2 = ii0Var.f34682b;
                int[] iArr = ii0Var.f34694f0;
                if (recyclerView.getChildCount() > 2) {
                    recyclerView.getLocationInWindow(iArr);
                    int i13 = iArr[0];
                    View childAt2 = recyclerView.getChildAt(0);
                    childAt2.getLocationInWindow(iArr);
                    float min = ((1.0f - Math.min(1.0f, (-Math.min(iArr[0] - i13, 0.0f)) / childAt2.getWidth())) * 0.39999998f) + 0.6f;
                    if (Float.isNaN(min)) {
                        min = 1.0f;
                    }
                    ii0.b(ii0Var, childAt2, min);
                    View childAt3 = recyclerView.getChildAt(recyclerView.getChildCount() - 1);
                    childAt3.getLocationInWindow(iArr);
                    float min2 = ((1.0f - Math.min(1.0f, (-Math.min((recyclerView.getWidth() + i13) - (childAt3.getWidth() + iArr[0]), 0.0f)) / childAt3.getWidth())) * 0.39999998f) + 0.6f;
                    if (Float.isNaN(min2)) {
                        min2 = 1.0f;
                    }
                    ii0.b(ii0Var, childAt3, min2);
                }
                for (int i14 = 1; i14 < q1Var2.getChildCount() - 1; i14++) {
                    ii0.b(ii0Var, q1Var2.getChildAt(i14), 1.0f);
                }
                ii0Var.invalidate();
                return;
            case 13:
                pj0 pj0Var = (pj0) this.f38651b;
                Rect rect = pj0Var.E1;
                v4.s0 s0Var = pj0Var.Y0;
                if (s0Var != null) {
                    s0Var.b(recyclerView, i7, i10);
                }
                if (pj0Var.C1 != -1) {
                    rect.offset(-i7, -i10);
                    org.telegram.ui.Cells.y yVar = pj0Var.B1;
                    if (yVar != null) {
                        yVar.setBounds(rect);
                    }
                    pj0Var.invalidate();
                } else {
                    rect.setEmpty();
                }
                pj0Var.L0(false);
                if (i10 != 0 && (ui0Var = pj0Var.f36963d1) != null) {
                    ui0Var.c();
                }
                yi0 yi0Var = pj0Var.S1;
                if (yi0Var != null) {
                    pj0Var.e1(yi0Var, 700, false);
                    return;
                }
                return;
            case 14:
            default:
                return;
            case 15:
                at0.I0((at0) this.f38651b);
                return;
            case 16:
                ht0 ht0Var = (ht0) this.f38651b;
                if (recyclerView == ht0Var.G) {
                    ht0Var.R += i10;
                }
                if (ht0Var.P == null && ht0Var.Q == 0) {
                    ht0Var.B();
                    return;
                }
                return;
            case 17:
                ((hu0) this.f38651b).P1.W();
                return;
            case 18:
                yv0.I0((yv0) this.f38651b);
                return;
            case 19:
                ((b51) this.f38651b).Q0();
                return;
            case 20:
                ((u61) this.f38651b).invalidate();
                return;
            case 21:
                org.telegram.ui.Wallet.x5 x5Var = (org.telegram.ui.Wallet.x5) this.f38651b;
                if (i10 != 0 && recyclerView.getScrollState() == 1 && (t5Var = x5Var.f43349q0) != null && t5Var.f43176f) {
                    t5Var.d = true;
                }
                x5Var.T0();
                return;
            case 22:
                int[] iArr2 = (int[]) this.f38651b;
                iArr2[0] = iArr2[0] + i10;
                return;
            case 23:
                org.telegram.ui.Wallet.w9 w9Var = (org.telegram.ui.Wallet.w9) this.f38651b;
                if (w9Var.f36243a.I1) {
                    org.telegram.messenger.g0.v1(w9Var.N);
                    return;
                }
                return;
            case 24:
                org.telegram.ui.web.l lVar = (org.telegram.ui.web.l) this.f38651b;
                if (!lVar.f36243a.canScrollVertically(1)) {
                    if (TextUtils.isEmpty(lVar.f51227w)) {
                        lVar.f51222e.d();
                    } else {
                        org.telegram.ui.web.h hVar = lVar.f51223f;
                        if (hVar != null) {
                            hVar.d();
                        }
                    }
                }
                if (lVar.f36243a.I1) {
                    org.telegram.messenger.g0.v1(lVar.fragmentView);
                    return;
                }
                return;
            case 25:
                org.telegram.ui.web.z0 z0Var = (org.telegram.ui.web.z0) this.f38651b;
                if (z0Var.f36243a.I1) {
                    org.telegram.messenger.g0.v1(z0Var.fragmentView);
                    return;
                }
                return;
            case 26:
                ug.s0 s0Var2 = (ug.s0) this.f38651b;
                if (recyclerView.getScrollState() == 1) {
                    s0Var2.z1(null, true);
                }
                s0Var2.invalidate();
                return;
            case 27:
                ((vh.g) this.f38651b).f1();
                return;
        }
    }
}
