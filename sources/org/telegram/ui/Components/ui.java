package org.telegram.ui.Components;

import android.graphics.Rect;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.TLRPC;
public final class ui extends v4.s0 {
    public final int f38724a;
    public final Object f38725b;

    public ui(Object obj, int i7) {
        this.f38724a = i7;
        this.f38725b = obj;
    }

    @Override
    public void a(RecyclerView recyclerView, int i7) {
        yi0 yi0Var;
        int top;
        int i10;
        yi0 yi0Var2;
        yi0 yi0Var3;
        int top2;
        boolean z9;
        yi0 yi0Var4;
        yi0 yi0Var5;
        org.telegram.ui.Wallet.r8 r8Var;
        int i11 = this.f38724a;
        ug.i1 i1Var = null;
        boolean z10 = false;
        Object obj = this.f38725b;
        switch (i11) {
            case 1:
                vj vjVar = (vj) obj;
                di diVar = vjVar.f39071b;
                kj kjVar = vjVar.f39113r;
                if (i7 == 0) {
                    int L = org.telegram.messenger.g0.L(13.0f);
                    int i12 = diVar.f28653s0;
                    if (((diVar.V3[0] - i12) - L) + i12 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (yi0Var = (yi0) kjVar.K(0)) != null && (top = (yi0Var.f57056a.getTop() - org.telegram.messenger.g0.f22557m) - org.telegram.messenger.g0.L(56.0f)) > 0) {
                        kjVar.w0(0, top, null);
                    }
                }
                if (i7 == 1 && vjVar.f39107b0 && kjVar.getAdapter() == vjVar.D) {
                    org.telegram.messenger.g0.v1(diVar.getCurrentFocus());
                }
                if (i7 != 0) {
                    z10 = true;
                }
                vjVar.U = z10;
                return;
            case 2:
                wj wjVar = (wj) obj;
                qj0 qj0Var = wjVar.f40060r;
                di diVar2 = wjVar.f39071b;
                if (i7 == 0) {
                    int L2 = org.telegram.messenger.g0.L(13.0f);
                    org.telegram.ui.ActionBar.r0 r0Var = diVar2.U2;
                    if (r0Var != null) {
                        i10 = org.telegram.messenger.g0.L(r0Var.getAlpha() * 26.0f);
                    } else {
                        i10 = 0;
                    }
                    int i13 = L2 + i10;
                    int i14 = diVar2.f28653s0;
                    if (((diVar2.V3[0] - i14) - i13) + i14 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (yi0Var2 = (yi0) qj0Var.K(0)) != null) {
                        View view = yi0Var2.f57056a;
                        if (view.getTop() > org.telegram.messenger.g0.L(7.0f)) {
                            qj0Var.w0(0, view.getTop() - org.telegram.messenger.g0.L(7.0f), null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 3:
                bn bnVar = (bn) obj;
                org.telegram.ui.f61 f61Var = bnVar.f32319s;
                if (i7 == 0) {
                    int L3 = org.telegram.messenger.g0.L(13.0f);
                    di diVar3 = bnVar.f39071b;
                    int i15 = diVar3.f28653s0;
                    if (((diVar3.V3[0] - i15) - L3) + i15 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (yi0Var3 = (yi0) f61Var.K(1)) != null && (top2 = (yi0Var3.f57056a.getTop() - org.telegram.messenger.g0.f22557m) - org.telegram.messenger.g0.L(65.0f)) > 0) {
                        f61Var.w0(0, top2, null);
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
                g90 g90Var = (g90) obj;
                if (i7 != 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                g90Var.f33909e3 = z9;
                if (i7 == 1) {
                    z10 = true;
                }
                g90Var.f33910f3 = z10;
                return;
            case 11:
                re0 re0Var = (re0) obj;
                le0 le0Var = re0Var.f37685i1;
                if (i7 == 0) {
                    int L4 = org.telegram.messenger.g0.L(13.0f);
                    int i17 = re0Var.f37696v1;
                    int i18 = re0Var.f28653s0;
                    if (((i17 - i18) - L4) + i18 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && le0Var.canScrollVertically(1) && (yi0Var4 = (yi0) le0Var.K(0)) != null) {
                        View view2 = yi0Var4.f57056a;
                        if (view2.getTop() > org.telegram.messenger.g0.L(7.0f)) {
                            le0Var.w0(0, view2.getTop() - org.telegram.messenger.g0.L(7.0f), null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 13:
                qj0 qj0Var2 = (qj0) obj;
                if (i7 == 0) {
                    if (qj0Var2.f37393t2) {
                        qj0Var2.f37393t2 = false;
                        org.telegram.messenger.qs.e().k(99, 512);
                    }
                } else if (!qj0Var2.f37393t2 && qj0Var2.f37396v1) {
                    qj0Var2.f37393t2 = true;
                    org.telegram.messenger.qs.e().k(98, 512);
                }
                if (i7 != 0 && qj0Var2.L1 != null) {
                    gj0 gj0Var = qj0Var2.f37361c1;
                    if (gj0Var != null) {
                        org.telegram.messenger.g0.r(gj0Var);
                        qj0Var2.f37361c1 = null;
                    }
                    MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                    try {
                        qj0Var2.K1.n0(obtain);
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                    }
                    qj0Var2.L1.onTouchEvent(obtain);
                    obtain.recycle();
                    View view3 = qj0Var2.L1;
                    qj0Var2.j1(view3, 0.0f, 0.0f, false);
                    qj0Var2.L1 = null;
                    qj0Var2.m1(view3, null);
                    qj0Var2.N1 = false;
                }
                v4.s0 s0Var = qj0Var2.Y0;
                if (s0Var != null) {
                    s0Var.a(recyclerView, i7);
                }
                z10 = (i7 == 1 || i7 == 2) ? true : true;
                qj0Var2.I1 = z10;
                if (z10) {
                    qj0Var2.J1 = true;
                    return;
                }
                return;
            case 14:
                el0 el0Var = (el0) obj;
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(el0Var.F.getCurrentFocus());
                }
                el0Var.a();
                return;
            case 19:
                c51 c51Var = (c51) obj;
                bi.q1 q1Var = c51Var.f32530k1;
                if (i7 == 0 && c51Var.f32541x1 && org.telegram.messenger.g0.L(13.0f) + c51Var.f32538u1 + c51Var.f28653s0 < org.telegram.messenger.g0.f22557m * 2 && q1Var.canScrollVertically(1) && (yi0Var5 = (yi0) q1Var.K(0)) != null) {
                    View view4 = yi0Var5.f57056a;
                    if (view4.getTop() > 0) {
                        q1Var.w0(0, view4.getTop(), null);
                        return;
                    }
                    return;
                }
                return;
            case 21:
                if (i7 == 1 && (r8Var = ((org.telegram.ui.Wallet.w5) obj).f43259i0) != null) {
                    r8Var.a();
                    return;
                }
                return;
            case 26:
                ug.s0 s0Var2 = (ug.s0) obj;
                if (i7 == 1) {
                    s0Var2.f56664k3 = true;
                }
                if (i7 == 0) {
                    for (int i19 = 0; i19 < recyclerView.getChildCount(); i19++) {
                        ug.i1 i1Var2 = (ug.i1) s0Var2.getChildAt(i19);
                        if (i1Var == null || i1Var2.f56641a > i1Var.f56641a) {
                            i1Var = i1Var2;
                        }
                    }
                    if (i1Var != null) {
                        s0Var2.z1(i1Var, true);
                        s0Var2.f56664k3 = false;
                        s0Var2.w0(0, i1Var.getTop() - ((s0Var2.getMeasuredHeight() - i1Var.getMeasuredHeight()) / 2), org.telegram.messenger.g0.H);
                    }
                    s0Var2.A1();
                    return;
                }
                org.telegram.messenger.g0.r(s0Var2.f56665l3);
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
        z20 z20Var;
        v4.d1 T;
        int N0;
        int i11;
        String str;
        TLRPC.User user;
        String str2;
        vi0 vi0Var;
        org.telegram.ui.Wallet.s5 s5Var;
        switch (this.f38724a) {
            case 0:
                fj fjVar = (fj) this.f38725b;
                fjVar.f39071b.M1(fjVar, i10);
                fjVar.S();
                return;
            case 1:
                vj vjVar = (vj) this.f38725b;
                kg.c0 c0Var = vjVar.E;
                vjVar.f39071b.M1(vjVar, i10);
                vjVar.Z();
                v4.g0 adapter = vjVar.f39113r.getAdapter();
                uj ujVar = vjVar.D;
                if (adapter == ujVar) {
                    int L0 = c0Var.L0();
                    int N02 = c0Var.N0();
                    int abs = Math.abs(N02 - L0) + 1;
                    int b10 = recyclerView.getAdapter().b();
                    if (abs > 0 && N02 >= b10 - 10) {
                        uj ujVar2 = ujVar.X.D;
                        if (!ujVar2.S && !ujVar2.V && (o0Var = ujVar.D) != null) {
                            ujVar.Z(ujVar.f38734y, ujVar.E, ujVar.F, o0Var, ujVar.J, false);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 2:
                wj wjVar = (wj) this.f38725b;
                wjVar.f39071b.M1(wjVar, i10);
                wjVar.f40062w.setTranslationY(Math.max(0, wjVar.getCurrentItemTop()));
                return;
            case 3:
                bn bnVar = (bn) this.f38725b;
                kg.c0 c0Var2 = bnVar.f32326x;
                bnVar.f39071b.M1(bnVar, i10);
                sm smVar = bnVar.f32328y;
                if (smVar != null && smVar.f37115s) {
                    nw0 delegate = smVar.getDelegate();
                    if (delegate instanceof org.telegram.ui.Cells.a6) {
                        org.telegram.ui.f61 f61Var = bnVar.f32319s;
                        View F = f61Var.F((org.telegram.ui.Cells.a6) delegate);
                        if (F == null) {
                            T = null;
                        } else {
                            T = f61Var.T(F);
                        }
                        if (T != null) {
                            View view = T.f57056a;
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
                if (i10 != 0 && (z20Var = bnVar.D) != null) {
                    z20Var.a();
                    return;
                }
                return;
            case 4:
                cn cnVar = (cn) this.f38725b;
                cnVar.f39071b.M1(cnVar, i10);
                return;
            case 5:
                vo voVar = (vo) this.f38725b;
                if (voVar.f39152t1.M0() + 10 >= voVar.n1.b()) {
                    voVar.Q0();
                    return;
                }
                return;
            case 6:
                ru ruVar = (ru) this.f38725b;
                ju juVar = ruVar.f37809m1;
                if (juVar != null && ruVar.n1.I1 && juVar.f35162x) {
                    juVar.f35162x = false;
                    juVar.invalidate();
                    return;
                }
                return;
            case 7:
                fz fzVar = (fz) this.f38725b;
                fzVar.F.invalidate();
                fzVar.invalidate();
                return;
            case 8:
                gz.I0((gz) this.f38725b);
                return;
            case 9:
                g90 g90Var = (g90) this.f38725b;
                v4.n0 layoutManager = g90Var.getLayoutManager();
                h90 h90Var = g90Var.f33913i3;
                a90 a90Var = h90Var.d;
                if (layoutManager == a90Var) {
                    N0 = a90Var.N0();
                } else {
                    N0 = h90Var.f34248c.N0();
                }
                if (N0 == -1) {
                    i11 = 0;
                } else {
                    i11 = N0;
                }
                if (i11 > 0) {
                    jg.i1 i1Var = h90Var.f34250f;
                    if (N0 > i1Var.M0 - 5 && i1Var.f16799u0 == 0 && (str = i1Var.f16797s0) != null && str.length() != 0 && (user = i1Var.f16802w0) != null && (str2 = i1Var.f16795r0) != null) {
                        i1Var.T(true, user, str2, i1Var.f16797s0);
                    }
                }
                g90Var.canScrollVertically(1);
                h90Var.n(!g90Var.canScrollVertically(-1));
                h90Var.b();
                return;
            case 10:
                da0 da0Var = (da0) this.f38725b;
                org.telegram.ui.v8 v8Var = da0Var.f32917b;
                bi.q1 q1Var = da0Var.f32922f;
                for (int i12 = 0; i12 < q1Var.getChildCount(); i12++) {
                    View childAt = q1Var.getChildAt(i12);
                    if (childAt instanceof org.telegram.ui.Cells.q1) {
                        ((org.telegram.ui.Cells.q1) childAt).y3(v8Var.getMeasuredWidth(), v8Var.getBackgroundSizeY());
                    }
                }
                x90 x90Var = da0Var.f32921e;
                if (x90Var != null) {
                    x90Var.w();
                    return;
                }
                return;
            case 11:
                re0 re0Var = (re0) this.f38725b;
                if (re0Var.f37685i1.getChildCount() > 0) {
                    re0.I0(re0Var);
                    return;
                }
                return;
            case 12:
                ji0 ji0Var = (ji0) this.f38725b;
                bi.q1 q1Var2 = ji0Var.f35028b;
                int[] iArr = ji0Var.f35040f0;
                if (recyclerView.getChildCount() > 2) {
                    recyclerView.getLocationInWindow(iArr);
                    int i13 = iArr[0];
                    View childAt2 = recyclerView.getChildAt(0);
                    childAt2.getLocationInWindow(iArr);
                    float min = ((1.0f - Math.min(1.0f, (-Math.min(iArr[0] - i13, 0.0f)) / childAt2.getWidth())) * 0.39999998f) + 0.6f;
                    if (Float.isNaN(min)) {
                        min = 1.0f;
                    }
                    ji0.b(ji0Var, childAt2, min);
                    View childAt3 = recyclerView.getChildAt(recyclerView.getChildCount() - 1);
                    childAt3.getLocationInWindow(iArr);
                    float min2 = ((1.0f - Math.min(1.0f, (-Math.min((recyclerView.getWidth() + i13) - (childAt3.getWidth() + iArr[0]), 0.0f)) / childAt3.getWidth())) * 0.39999998f) + 0.6f;
                    if (Float.isNaN(min2)) {
                        min2 = 1.0f;
                    }
                    ji0.b(ji0Var, childAt3, min2);
                }
                for (int i14 = 1; i14 < q1Var2.getChildCount() - 1; i14++) {
                    ji0.b(ji0Var, q1Var2.getChildAt(i14), 1.0f);
                }
                ji0Var.invalidate();
                return;
            case 13:
                qj0 qj0Var = (qj0) this.f38725b;
                Rect rect = qj0Var.E1;
                v4.s0 s0Var = qj0Var.Y0;
                if (s0Var != null) {
                    s0Var.b(recyclerView, i7, i10);
                }
                if (qj0Var.C1 != -1) {
                    rect.offset(-i7, -i10);
                    org.telegram.ui.Cells.y yVar = qj0Var.B1;
                    if (yVar != null) {
                        yVar.setBounds(rect);
                    }
                    qj0Var.invalidate();
                } else {
                    rect.setEmpty();
                }
                qj0Var.L0(false);
                if (i10 != 0 && (vi0Var = qj0Var.f37363d1) != null) {
                    vi0Var.c();
                }
                zi0 zi0Var = qj0Var.S1;
                if (zi0Var != null) {
                    qj0Var.e1(zi0Var, 700, false);
                    return;
                }
                return;
            case 14:
            default:
                return;
            case 15:
                ct0.I0((ct0) this.f38725b);
                return;
            case 16:
                jt0 jt0Var = (jt0) this.f38725b;
                if (recyclerView == jt0Var.G) {
                    jt0Var.R += i10;
                }
                if (jt0Var.P == null && jt0Var.Q == 0) {
                    jt0Var.B();
                    return;
                }
                return;
            case 17:
                ((ju0) this.f38725b).P1.W();
                return;
            case 18:
                zv0.I0((zv0) this.f38725b);
                return;
            case 19:
                ((c51) this.f38725b).Q0();
                return;
            case 20:
                ((v61) this.f38725b).invalidate();
                return;
            case 21:
                org.telegram.ui.Wallet.w5 w5Var = (org.telegram.ui.Wallet.w5) this.f38725b;
                if (i10 != 0 && recyclerView.getScrollState() == 1 && (s5Var = w5Var.f43267q0) != null && s5Var.f43094f) {
                    s5Var.d = true;
                }
                w5Var.T0();
                return;
            case 22:
                int[] iArr2 = (int[]) this.f38725b;
                iArr2[0] = iArr2[0] + i10;
                return;
            case 23:
                org.telegram.ui.Wallet.v9 v9Var = (org.telegram.ui.Wallet.v9) this.f38725b;
                if (v9Var.f36649a.I1) {
                    org.telegram.messenger.g0.v1(v9Var.N);
                    return;
                }
                return;
            case 24:
                org.telegram.ui.web.l lVar = (org.telegram.ui.web.l) this.f38725b;
                if (!lVar.f36649a.canScrollVertically(1)) {
                    if (TextUtils.isEmpty(lVar.f51208w)) {
                        lVar.f51203e.d();
                    } else {
                        org.telegram.ui.web.h hVar = lVar.f51204f;
                        if (hVar != null) {
                            hVar.d();
                        }
                    }
                }
                if (lVar.f36649a.I1) {
                    org.telegram.messenger.g0.v1(lVar.fragmentView);
                    return;
                }
                return;
            case 25:
                org.telegram.ui.web.z0 z0Var = (org.telegram.ui.web.z0) this.f38725b;
                if (z0Var.f36649a.I1) {
                    org.telegram.messenger.g0.v1(z0Var.fragmentView);
                    return;
                }
                return;
            case 26:
                ug.s0 s0Var2 = (ug.s0) this.f38725b;
                if (recyclerView.getScrollState() == 1) {
                    s0Var2.z1(null, true);
                }
                s0Var2.invalidate();
                return;
            case 27:
                ((vh.g) this.f38725b).f1();
                return;
        }
    }
}
