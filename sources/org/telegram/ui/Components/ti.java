package org.telegram.ui.Components;

import android.graphics.Rect;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.TLRPC;
public final class ti extends v4.s0 {
    public final int f38312a;
    public final Object f38313b;

    public ti(Object obj, int i7) {
        this.f38312a = i7;
        this.f38313b = obj;
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
        org.telegram.ui.Wallet.u8 u8Var;
        int i11 = this.f38312a;
        ug.i1 i1Var = null;
        boolean z10 = false;
        Object obj = this.f38313b;
        switch (i11) {
            case 1:
                uj ujVar = (uj) obj;
                ci ciVar = ujVar.f38656b;
                jj jjVar = ujVar.f38698r;
                if (i7 == 0) {
                    int L = org.telegram.messenger.g0.L(13.0f);
                    int i12 = ciVar.f28704s0;
                    if (((ciVar.Y3[0] - i12) - L) + i12 < org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() && (xi0Var = (xi0) jjVar.K(0)) != null && (top = (xi0Var.f57052a.getTop() - org.telegram.messenger.g0.f22561m) - org.telegram.messenger.g0.L(56.0f)) > 0) {
                        jjVar.w0(0, top, null);
                    }
                }
                if (i7 == 1 && ujVar.f38692b0 && jjVar.getAdapter() == ujVar.D) {
                    org.telegram.messenger.g0.v1(ciVar.getCurrentFocus());
                }
                if (i7 != 0) {
                    z10 = true;
                }
                ujVar.U = z10;
                return;
            case 2:
                vj vjVar = (vj) obj;
                pj0 pj0Var = vjVar.f39011r;
                ci ciVar2 = vjVar.f38656b;
                if (i7 == 0) {
                    int L2 = org.telegram.messenger.g0.L(13.0f);
                    org.telegram.ui.ActionBar.r0 r0Var = ciVar2.X2;
                    if (r0Var != null) {
                        i10 = org.telegram.messenger.g0.L(r0Var.getAlpha() * 26.0f);
                    } else {
                        i10 = 0;
                    }
                    int i13 = L2 + i10;
                    int i14 = ciVar2.f28704s0;
                    if (((ciVar2.Y3[0] - i14) - i13) + i14 < org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() && (xi0Var2 = (xi0) pj0Var.K(0)) != null) {
                        View view = xi0Var2.f57052a;
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
                an anVar = (an) obj;
                org.telegram.ui.g61 g61Var = anVar.f31922s;
                if (i7 == 0) {
                    int L3 = org.telegram.messenger.g0.L(13.0f);
                    ci ciVar3 = anVar.f38656b;
                    int i15 = ciVar3.f28704s0;
                    if (((ciVar3.Y3[0] - i15) - L3) + i15 < org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() && (xi0Var3 = (xi0) g61Var.K(1)) != null && (top2 = (xi0Var3.f57052a.getTop() - org.telegram.messenger.g0.f22561m) - org.telegram.messenger.g0.L(65.0f)) > 0) {
                        g61Var.w0(0, top2, null);
                    }
                    int i16 = anVar.W0;
                    if (i16 >= 0) {
                        an.O(anVar, i16);
                        anVar.W0 = -1;
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
                f90Var.f33504e3 = z9;
                if (i7 == 1) {
                    z10 = true;
                }
                f90Var.f33505f3 = z10;
                return;
            case 11:
                qe0 qe0Var = (qe0) obj;
                ke0 ke0Var = qe0Var.l1;
                if (i7 == 0) {
                    int L4 = org.telegram.messenger.g0.L(13.0f);
                    int i17 = qe0Var.f37287y1;
                    int i18 = qe0Var.f28704s0;
                    if (((i17 - i18) - L4) + i18 < org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() && ke0Var.canScrollVertically(1) && (xi0Var4 = (xi0) ke0Var.K(0)) != null) {
                        View view2 = xi0Var4.f57052a;
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
                    if (pj0Var2.f36992t2) {
                        pj0Var2.f36992t2 = false;
                        org.telegram.messenger.qs.e().k(99, 512);
                    }
                } else if (!pj0Var2.f36992t2 && pj0Var2.f36995v1) {
                    pj0Var2.f36992t2 = true;
                    org.telegram.messenger.qs.e().k(98, 512);
                }
                if (i7 != 0 && pj0Var2.L1 != null) {
                    fj0 fj0Var = pj0Var2.f36960c1;
                    if (fj0Var != null) {
                        org.telegram.messenger.g0.r(fj0Var);
                        pj0Var2.f36960c1 = null;
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
                c51 c51Var = (c51) obj;
                bi.q1 q1Var = c51Var.n1;
                if (i7 == 0 && c51Var.A1 && org.telegram.messenger.g0.L(13.0f) + c51Var.f32473x1 + c51Var.f28704s0 < org.telegram.messenger.g0.f22561m * 2 && q1Var.canScrollVertically(1) && (xi0Var5 = (xi0) q1Var.K(0)) != null) {
                    View view4 = xi0Var5.f57052a;
                    if (view4.getTop() > 0) {
                        q1Var.w0(0, view4.getTop(), null);
                        return;
                    }
                    return;
                }
                return;
            case 21:
                if (i7 == 1 && (u8Var = ((org.telegram.ui.Wallet.z5) obj).f43454i0) != null) {
                    u8Var.a();
                    return;
                }
                return;
            case 26:
                ug.s0 s0Var2 = (ug.s0) obj;
                if (i7 == 1) {
                    s0Var2.f56663k3 = true;
                }
                if (i7 == 0) {
                    for (int i19 = 0; i19 < recyclerView.getChildCount(); i19++) {
                        ug.i1 i1Var2 = (ug.i1) s0Var2.getChildAt(i19);
                        if (i1Var == null || i1Var2.f56640a > i1Var.f56640a) {
                            i1Var = i1Var2;
                        }
                    }
                    if (i1Var != null) {
                        s0Var2.z1(i1Var, true);
                        s0Var2.f56663k3 = false;
                        s0Var2.w0(0, i1Var.getTop() - ((s0Var2.getMeasuredHeight() - i1Var.getMeasuredHeight()) / 2), org.telegram.messenger.g0.H);
                    }
                    s0Var2.A1();
                    return;
                }
                org.telegram.messenger.g0.r(s0Var2.f56664l3);
                return;
            case 28:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(((wg.w0) obj).T1.getEditText());
                    return;
                }
                return;
            case 29:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(((wg.f1) obj).U1.getEditText());
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
        org.telegram.ui.Wallet.v5 v5Var;
        switch (this.f38312a) {
            case 0:
                ej ejVar = (ej) this.f38313b;
                ejVar.f38656b.M1(ejVar, i10);
                ejVar.S();
                return;
            case 1:
                uj ujVar = (uj) this.f38313b;
                kg.c0 c0Var = ujVar.E;
                ujVar.f38656b.M1(ujVar, i10);
                ujVar.Z();
                v4.g0 adapter = ujVar.f38698r.getAdapter();
                tj tjVar = ujVar.D;
                if (adapter == tjVar) {
                    int L0 = c0Var.L0();
                    int N02 = c0Var.N0();
                    int abs = Math.abs(N02 - L0) + 1;
                    int b10 = recyclerView.getAdapter().b();
                    if (abs > 0 && N02 >= b10 - 10) {
                        tj tjVar2 = tjVar.X.D;
                        if (!tjVar2.S && !tjVar2.V && (o0Var = tjVar.D) != null) {
                            tjVar.Z(tjVar.f38322y, tjVar.E, tjVar.F, o0Var, tjVar.J, false);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 2:
                vj vjVar = (vj) this.f38313b;
                vjVar.f38656b.M1(vjVar, i10);
                vjVar.f39013w.setTranslationY(Math.max(0, vjVar.getCurrentItemTop()));
                return;
            case 3:
                an anVar = (an) this.f38313b;
                kg.c0 c0Var2 = anVar.f31929x;
                anVar.f38656b.M1(anVar, i10);
                rm rmVar = anVar.f31931y;
                if (rmVar != null && rmVar.f36714s) {
                    mw0 delegate = rmVar.getDelegate();
                    if (delegate instanceof org.telegram.ui.Cells.a6) {
                        org.telegram.ui.g61 g61Var = anVar.f31922s;
                        View F = g61Var.F((org.telegram.ui.Cells.a6) delegate);
                        if (F == null) {
                            T = null;
                        } else {
                            T = g61Var.T(F);
                        }
                        if (T != null) {
                            View view = T.f57052a;
                            int b11 = T.b();
                            if (rmVar.getDirection() == 0) {
                                rmVar.setTranslationY((view.getY() - org.telegram.messenger.g0.L(166.0f)) + view.getMeasuredHeight());
                            } else {
                                rmVar.setTranslationY(view.getY());
                            }
                            if (b11 < c0Var2.L0() || b11 > c0Var2.N0()) {
                                rmVar.f();
                            }
                        } else {
                            rmVar.f();
                        }
                    } else {
                        rmVar.f();
                    }
                }
                if (i10 != 0 && (y20Var = anVar.D) != null) {
                    y20Var.a();
                    return;
                }
                return;
            case 4:
                bn bnVar = (bn) this.f38313b;
                bnVar.f38656b.M1(bnVar, i10);
                return;
            case 5:
                vo voVar = (vo) this.f38313b;
                if (voVar.f39073w1.M0() + 10 >= voVar.f39067q1.b()) {
                    voVar.Q0();
                    return;
                }
                return;
            case 6:
                qu quVar = (qu) this.f38313b;
                iu iuVar = quVar.f37398p1;
                if (iuVar != null && quVar.f37399q1.I1 && iuVar.f34769x) {
                    iuVar.f34769x = false;
                    iuVar.invalidate();
                    return;
                }
                return;
            case 7:
                ez ezVar = (ez) this.f38313b;
                ezVar.F.invalidate();
                ezVar.invalidate();
                return;
            case 8:
                fz.I0((fz) this.f38313b);
                return;
            case 9:
                f90 f90Var = (f90) this.f38313b;
                v4.n0 layoutManager = f90Var.getLayoutManager();
                g90 g90Var = f90Var.f33508i3;
                z80 z80Var = g90Var.d;
                if (layoutManager == z80Var) {
                    N0 = z80Var.N0();
                } else {
                    N0 = g90Var.f33848c.N0();
                }
                if (N0 == -1) {
                    i11 = 0;
                } else {
                    i11 = N0;
                }
                if (i11 > 0) {
                    jg.i1 i1Var = g90Var.f33850f;
                    if (N0 > i1Var.M0 - 5 && i1Var.f16799u0 == 0 && (str = i1Var.f16797s0) != null && str.length() != 0 && (user = i1Var.f16802w0) != null && (str2 = i1Var.f16795r0) != null) {
                        i1Var.T(true, user, str2, i1Var.f16797s0);
                    }
                }
                f90Var.canScrollVertically(1);
                g90Var.n(!f90Var.canScrollVertically(-1));
                g90Var.b();
                return;
            case 10:
                ca0 ca0Var = (ca0) this.f38313b;
                org.telegram.ui.v8 v8Var = ca0Var.f32521b;
                bi.q1 q1Var = ca0Var.f32526f;
                for (int i12 = 0; i12 < q1Var.getChildCount(); i12++) {
                    View childAt = q1Var.getChildAt(i12);
                    if (childAt instanceof org.telegram.ui.Cells.q1) {
                        ((org.telegram.ui.Cells.q1) childAt).y3(v8Var.getMeasuredWidth(), v8Var.getBackgroundSizeY());
                    }
                }
                w90 w90Var = ca0Var.f32525e;
                if (w90Var != null) {
                    w90Var.w();
                    return;
                }
                return;
            case 11:
                qe0 qe0Var = (qe0) this.f38313b;
                if (qe0Var.l1.getChildCount() > 0) {
                    qe0.I0(qe0Var);
                    return;
                }
                return;
            case 12:
                ii0 ii0Var = (ii0) this.f38313b;
                bi.q1 q1Var2 = ii0Var.f34637b;
                int[] iArr = ii0Var.f34649f0;
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
                pj0 pj0Var = (pj0) this.f38313b;
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
                if (i10 != 0 && (ui0Var = pj0Var.f36962d1) != null) {
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
                bt0.I0((bt0) this.f38313b);
                return;
            case 16:
                it0 it0Var = (it0) this.f38313b;
                if (recyclerView == it0Var.G) {
                    it0Var.R += i10;
                }
                if (it0Var.P == null && it0Var.Q == 0) {
                    it0Var.B();
                    return;
                }
                return;
            case 17:
                ((iu0) this.f38313b).S1.W();
                return;
            case 18:
                yv0.I0((yv0) this.f38313b);
                return;
            case 19:
                ((c51) this.f38313b).Q0();
                return;
            case 20:
                ((u61) this.f38313b).invalidate();
                return;
            case 21:
                org.telegram.ui.Wallet.z5 z5Var = (org.telegram.ui.Wallet.z5) this.f38313b;
                if (i10 != 0 && recyclerView.getScrollState() == 1 && (v5Var = z5Var.f43462q0) != null && v5Var.f43260f) {
                    v5Var.d = true;
                }
                z5Var.U0();
                return;
            case 22:
                int[] iArr2 = (int[]) this.f38313b;
                iArr2[0] = iArr2[0] + i10;
                return;
            case 23:
                org.telegram.ui.Wallet.y9 y9Var = (org.telegram.ui.Wallet.y9) this.f38313b;
                if (y9Var.f36518a.I1) {
                    org.telegram.messenger.g0.v1(y9Var.N);
                    return;
                }
                return;
            case 24:
                org.telegram.ui.web.l lVar = (org.telegram.ui.web.l) this.f38313b;
                if (!lVar.f36518a.canScrollVertically(1)) {
                    if (TextUtils.isEmpty(lVar.f51162w)) {
                        lVar.f51157e.d();
                    } else {
                        org.telegram.ui.web.h hVar = lVar.f51158f;
                        if (hVar != null) {
                            hVar.d();
                        }
                    }
                }
                if (lVar.f36518a.I1) {
                    org.telegram.messenger.g0.v1(lVar.fragmentView);
                    return;
                }
                return;
            case 25:
                org.telegram.ui.web.z0 z0Var = (org.telegram.ui.web.z0) this.f38313b;
                if (z0Var.f36518a.I1) {
                    org.telegram.messenger.g0.v1(z0Var.fragmentView);
                    return;
                }
                return;
            case 26:
                ug.s0 s0Var2 = (ug.s0) this.f38313b;
                if (recyclerView.getScrollState() == 1) {
                    s0Var2.z1(null, true);
                }
                s0Var2.invalidate();
                return;
            case 27:
                ((vh.g) this.f38313b).f1();
                return;
        }
    }
}
