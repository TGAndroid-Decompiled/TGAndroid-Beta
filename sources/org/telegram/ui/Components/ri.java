package org.telegram.ui.Components;

import android.graphics.Rect;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.TLRPC;
public final class ri extends v4.t0 {
    public final int f38980a;
    public final Object f38981b;

    public ri(Object obj, int i7) {
        this.f38980a = i7;
        this.f38981b = obj;
    }

    @Override
    public void a(RecyclerView recyclerView, int i7) {
        int i10;
        cj0 cj0Var;
        cj0 cj0Var2;
        int top;
        int i11;
        cj0 cj0Var3;
        cj0 cj0Var4;
        int top2;
        boolean z10;
        cj0 cj0Var5;
        cj0 cj0Var6;
        org.telegram.ui.Wallet.u8 u8Var;
        int i12 = this.f38980a;
        ug.j1 j1Var = null;
        boolean z11 = true;
        boolean z12 = false;
        Object obj = this.f38981b;
        switch (i12) {
            case 1:
                yi yiVar = (yi) obj;
                di.c1 c1Var = yiVar.f42003n;
                ki kiVar = yiVar.f33609b;
                if (i7 == 0) {
                    int L = org.telegram.messenger.g0.L(13.0f);
                    org.telegram.ui.ActionBar.q0 q0Var = kiVar.Y2;
                    if (q0Var != null) {
                        i10 = org.telegram.messenger.g0.L(q0Var.getAlpha() * 26.0f);
                    } else {
                        i10 = 0;
                    }
                    int i13 = L + i10;
                    int i14 = kiVar.f29716t0;
                    if (((kiVar.Z3[0] - i14) - i13) + i14 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (cj0Var = (cj0) c1Var.K(0)) != null) {
                        View view = cj0Var.f58535a;
                        if (view.getTop() > org.telegram.messenger.g0.L(7.0f)) {
                            c1Var.w0(0, view.getTop() - org.telegram.messenger.g0.L(7.0f), null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 3:
                dk dkVar = (dk) obj;
                ki kiVar2 = dkVar.f33609b;
                rj rjVar = dkVar.f33952r;
                if (i7 == 0) {
                    int L2 = org.telegram.messenger.g0.L(13.0f);
                    int i15 = kiVar2.f29716t0;
                    if (((kiVar2.Z3[0] - i15) - L2) + i15 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (cj0Var2 = (cj0) rjVar.K(0)) != null && (top = (cj0Var2.f58535a.getTop() - org.telegram.messenger.g0.f23605m) - org.telegram.messenger.g0.L(56.0f)) > 0) {
                        rjVar.w0(0, top, null);
                    }
                }
                if (i7 == 1 && dkVar.f33946c0 && rjVar.getAdapter() == dkVar.E) {
                    org.telegram.messenger.g0.v1(kiVar2.getCurrentFocus());
                }
                if (i7 == 0) {
                    z11 = false;
                }
                dkVar.V = z11;
                return;
            case 4:
                ek ekVar = (ek) obj;
                uj0 uj0Var = ekVar.f34331r;
                ki kiVar3 = ekVar.f33609b;
                if (i7 == 0) {
                    int L3 = org.telegram.messenger.g0.L(13.0f);
                    org.telegram.ui.ActionBar.q0 q0Var2 = kiVar3.Y2;
                    if (q0Var2 != null) {
                        i11 = org.telegram.messenger.g0.L(q0Var2.getAlpha() * 26.0f);
                    } else {
                        i11 = 0;
                    }
                    int i16 = L3 + i11;
                    int i17 = kiVar3.f29716t0;
                    if (((kiVar3.Z3[0] - i17) - i16) + i17 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (cj0Var3 = (cj0) uj0Var.K(0)) != null) {
                        View view2 = cj0Var3.f58535a;
                        if (view2.getTop() > org.telegram.messenger.g0.L(7.0f)) {
                            uj0Var.w0(0, view2.getTop() - org.telegram.messenger.g0.L(7.0f), null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 5:
                jn jnVar = (jn) obj;
                org.telegram.ui.b61 b61Var = jnVar.f36097s;
                if (i7 == 0) {
                    int L4 = org.telegram.messenger.g0.L(13.0f);
                    ki kiVar4 = jnVar.f33609b;
                    int i18 = kiVar4.f29716t0;
                    if (((kiVar4.Z3[0] - i18) - L4) + i18 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (cj0Var4 = (cj0) b61Var.K(1)) != null && (top2 = (cj0Var4.f58535a.getTop() - org.telegram.messenger.g0.f23605m) - org.telegram.messenger.g0.L(65.0f)) > 0) {
                        b61Var.w0(0, top2, null);
                    }
                    int i19 = jnVar.X0;
                    if (i19 >= 0) {
                        jn.P(jnVar, i19);
                        jnVar.X0 = -1;
                        return;
                    }
                    return;
                }
                return;
            case 11:
                i90 i90Var = (i90) obj;
                if (i7 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                i90Var.f35510f3 = z10;
                if (i7 != 1) {
                    z11 = false;
                }
                i90Var.f35511g3 = z11;
                return;
            case 13:
                te0 te0Var = (te0) obj;
                ne0 ne0Var = te0Var.f39677m1;
                if (i7 == 0) {
                    int L5 = org.telegram.messenger.g0.L(13.0f);
                    int i20 = te0Var.f39689z1;
                    int i21 = te0Var.f29716t0;
                    if (((i20 - i21) - L5) + i21 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && ne0Var.canScrollVertically(1) && (cj0Var5 = (cj0) ne0Var.K(0)) != null) {
                        View view3 = cj0Var5.f58535a;
                        if (view3.getTop() > org.telegram.messenger.g0.L(7.0f)) {
                            ne0Var.w0(0, view3.getTop() - org.telegram.messenger.g0.L(7.0f), null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 15:
                uj0 uj0Var2 = (uj0) obj;
                if (i7 == 0) {
                    if (uj0Var2.f40081u2) {
                        uj0Var2.f40081u2 = false;
                        org.telegram.messenger.ns.e().k(99, 512);
                    }
                } else if (!uj0Var2.f40081u2 && uj0Var2.f40084w1) {
                    uj0Var2.f40081u2 = true;
                    org.telegram.messenger.ns.e().k(98, 512);
                }
                if (i7 != 0 && uj0Var2.M1 != null) {
                    kj0 kj0Var = uj0Var2.f40049d1;
                    if (kj0Var != null) {
                        org.telegram.messenger.g0.r(kj0Var);
                        uj0Var2.f40049d1 = null;
                    }
                    MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                    try {
                        uj0Var2.L1.B0(obtain);
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                    }
                    uj0Var2.M1.onTouchEvent(obtain);
                    obtain.recycle();
                    View view4 = uj0Var2.M1;
                    uj0Var2.j1(view4, 0.0f, 0.0f, false);
                    uj0Var2.M1 = null;
                    uj0Var2.m1(view4, null);
                    uj0Var2.O1 = false;
                }
                v4.t0 t0Var = uj0Var2.Z0;
                if (t0Var != null) {
                    t0Var.a(recyclerView, i7);
                }
                z12 = (i7 == 1 || i7 == 2) ? true : true;
                uj0Var2.J1 = z12;
                if (z12) {
                    uj0Var2.K1 = true;
                    return;
                }
                return;
            case 16:
                il0 il0Var = (il0) obj;
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(il0Var.G.getCurrentFocus());
                }
                il0Var.a();
                return;
            case 21:
                e51 e51Var = (e51) obj;
                di.c1 c1Var2 = e51Var.f34191o1;
                if (i7 == 0 && e51Var.B1 && org.telegram.messenger.g0.L(13.0f) + e51Var.f34201y1 + e51Var.f29716t0 < org.telegram.messenger.g0.f23605m * 2 && c1Var2.canScrollVertically(1) && (cj0Var6 = (cj0) c1Var2.K(0)) != null) {
                    View view5 = cj0Var6.f58535a;
                    if (view5.getTop() > 0) {
                        c1Var2.w0(0, view5.getTop(), null);
                        return;
                    }
                    return;
                }
                return;
            case 23:
                if (i7 == 1 && (u8Var = ((org.telegram.ui.Wallet.y5) obj).f44738j0) != null) {
                    u8Var.a();
                    return;
                }
                return;
            case 28:
                ((ri.q) obj).f56125g++;
                return;
            case 29:
                ug.t0 t0Var2 = (ug.t0) obj;
                if (i7 == 1) {
                    t0Var2.f58183l3 = true;
                }
                if (i7 == 0) {
                    for (int i22 = 0; i22 < recyclerView.getChildCount(); i22++) {
                        ug.j1 j1Var2 = (ug.j1) t0Var2.getChildAt(i22);
                        if (j1Var == null || j1Var2.f58155a > j1Var.f58155a) {
                            j1Var = j1Var2;
                        }
                    }
                    if (j1Var != null) {
                        t0Var2.z1(j1Var, true);
                        t0Var2.f58183l3 = false;
                        t0Var2.w0(0, j1Var.getTop() - ((t0Var2.getMeasuredHeight() - j1Var.getMeasuredHeight()) / 2), org.telegram.messenger.g0.H);
                    }
                    t0Var2.A1();
                    return;
                }
                org.telegram.messenger.g0.r(t0Var2.f58184m3);
                return;
            default:
                return;
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i7, int i10) {
        jg.o0 o0Var;
        b30 b30Var;
        v4.e1 T;
        int N0;
        int i11;
        String str;
        TLRPC.User user;
        String str2;
        zi0 zi0Var;
        org.telegram.ui.Wallet.u5 u5Var;
        switch (this.f38980a) {
            case 0:
                vi viVar = (vi) this.f38981b;
                viVar.f33609b.M1(viVar, i10);
                return;
            case 1:
                yi yiVar = (yi) this.f38981b;
                if (yiVar.f42003n.getChildCount() > 0) {
                    yiVar.f33609b.M1(yiVar, i10);
                    return;
                }
                return;
            case 2:
                mj mjVar = (mj) this.f38981b;
                mjVar.f33609b.M1(mjVar, i10);
                mjVar.T();
                return;
            case 3:
                dk dkVar = (dk) this.f38981b;
                kg.c0 c0Var = dkVar.F;
                dkVar.f33609b.M1(dkVar, i10);
                dkVar.Z();
                v4.h0 adapter = dkVar.f33952r.getAdapter();
                ck ckVar = dkVar.E;
                if (adapter == ckVar) {
                    int L0 = c0Var.L0();
                    int N02 = c0Var.N0();
                    int abs = Math.abs(N02 - L0) + 1;
                    int b10 = recyclerView.getAdapter().b();
                    if (abs > 0 && N02 >= b10 - 10) {
                        ck ckVar2 = ckVar.Y.E;
                        if (!ckVar2.T && !ckVar2.W && (o0Var = ckVar.E) != null) {
                            ckVar.Z(ckVar.f33620y, ckVar.F, ckVar.G, o0Var, ckVar.K, false);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 4:
                ek ekVar = (ek) this.f38981b;
                ekVar.f33609b.M1(ekVar, i10);
                ekVar.f34333w.setTranslationY(Math.max(0, ekVar.getCurrentItemTop()));
                return;
            case 5:
                jn jnVar = (jn) this.f38981b;
                kg.c0 c0Var2 = jnVar.f36104x;
                jnVar.f33609b.M1(jnVar, i10);
                an anVar = jnVar.f36106y;
                if (anVar != null && anVar.f39083s) {
                    pw0 delegate = anVar.getDelegate();
                    if (delegate instanceof org.telegram.ui.Cells.z5) {
                        org.telegram.ui.b61 b61Var = jnVar.f36097s;
                        View F = b61Var.F((org.telegram.ui.Cells.z5) delegate);
                        if (F == null) {
                            T = null;
                        } else {
                            T = b61Var.T(F);
                        }
                        if (T != null) {
                            View view = T.f58535a;
                            int b11 = T.b();
                            if (anVar.getDirection() == 0) {
                                anVar.setTranslationY((view.getY() - org.telegram.messenger.g0.L(166.0f)) + view.getMeasuredHeight());
                            } else {
                                anVar.setTranslationY(view.getY());
                            }
                            if (b11 < c0Var2.L0() || b11 > c0Var2.N0()) {
                                anVar.f();
                            }
                        } else {
                            anVar.f();
                        }
                    } else {
                        anVar.f();
                    }
                }
                if (i10 != 0 && (b30Var = jnVar.E) != null) {
                    b30Var.a();
                    return;
                }
                return;
            case 6:
                kn knVar = (kn) this.f38981b;
                knVar.f33609b.M1(knVar, i10);
                return;
            case 7:
                ep epVar = (ep) this.f38981b;
                if (epVar.f34402x1.M0() + 10 >= epVar.f34396r1.b()) {
                    epVar.Q0();
                    return;
                }
                return;
            case 8:
                wu wuVar = (wu) this.f38981b;
                ou ouVar = wuVar.f41452q1;
                if (ouVar != null && wuVar.f41453r1.J1 && ouVar.f38084x) {
                    ouVar.f38084x = false;
                    ouVar.invalidate();
                    return;
                }
                return;
            case 9:
                iz izVar = (iz) this.f38981b;
                izVar.G.invalidate();
                izVar.invalidate();
                return;
            case 10:
                jz.I0((jz) this.f38981b);
                return;
            case 11:
                i90 i90Var = (i90) this.f38981b;
                v4.o0 layoutManager = i90Var.getLayoutManager();
                j90 j90Var = i90Var.j3;
                c90 c90Var = j90Var.d;
                if (layoutManager == c90Var) {
                    N0 = c90Var.N0();
                } else {
                    N0 = j90Var.f35921c.N0();
                }
                if (N0 == -1) {
                    i11 = 0;
                } else {
                    i11 = N0;
                }
                if (i11 > 0) {
                    jg.h1 h1Var = j90Var.f35923f;
                    if (N0 > h1Var.N0 - 5 && h1Var.f17143v0 == 0 && (str = h1Var.f17141t0) != null && str.length() != 0 && (user = h1Var.f17147x0) != null && (str2 = h1Var.f17140s0) != null) {
                        h1Var.T(true, user, str2, h1Var.f17141t0);
                    }
                }
                i90Var.canScrollVertically(1);
                j90Var.n(!i90Var.canScrollVertically(-1));
                j90Var.b();
                return;
            case 12:
                ea0 ea0Var = (ea0) this.f38981b;
                org.telegram.ui.v8 v8Var = ea0Var.f34256b;
                di.c1 c1Var = ea0Var.f34262f;
                for (int i12 = 0; i12 < c1Var.getChildCount(); i12++) {
                    View childAt = c1Var.getChildAt(i12);
                    if (childAt instanceof org.telegram.ui.Cells.q1) {
                        ((org.telegram.ui.Cells.q1) childAt).z3(v8Var.getMeasuredWidth(), v8Var.getBackgroundSizeY());
                    }
                }
                y90 y90Var = ea0Var.f34261e;
                if (y90Var != null) {
                    y90Var.w();
                    return;
                }
                return;
            case 13:
                te0 te0Var = (te0) this.f38981b;
                if (te0Var.f39677m1.getChildCount() > 0) {
                    te0.I0(te0Var);
                    return;
                }
                return;
            case 14:
                mi0 mi0Var = (mi0) this.f38981b;
                di.c1 c1Var2 = mi0Var.f37258b;
                int[] iArr = mi0Var.f37272g0;
                if (recyclerView.getChildCount() > 2) {
                    recyclerView.getLocationInWindow(iArr);
                    int i13 = iArr[0];
                    View childAt2 = recyclerView.getChildAt(0);
                    childAt2.getLocationInWindow(iArr);
                    float min = ((1.0f - Math.min(1.0f, (-Math.min(iArr[0] - i13, 0.0f)) / childAt2.getWidth())) * 0.39999998f) + 0.6f;
                    if (Float.isNaN(min)) {
                        min = 1.0f;
                    }
                    mi0.b(mi0Var, childAt2, min);
                    View childAt3 = recyclerView.getChildAt(recyclerView.getChildCount() - 1);
                    childAt3.getLocationInWindow(iArr);
                    float min2 = ((1.0f - Math.min(1.0f, (-Math.min((recyclerView.getWidth() + i13) - (childAt3.getWidth() + iArr[0]), 0.0f)) / childAt3.getWidth())) * 0.39999998f) + 0.6f;
                    if (Float.isNaN(min2)) {
                        min2 = 1.0f;
                    }
                    mi0.b(mi0Var, childAt3, min2);
                }
                for (int i14 = 1; i14 < c1Var2.getChildCount() - 1; i14++) {
                    mi0.b(mi0Var, c1Var2.getChildAt(i14), 1.0f);
                }
                mi0Var.invalidate();
                return;
            case 15:
                uj0 uj0Var = (uj0) this.f38981b;
                Rect rect = uj0Var.F1;
                v4.t0 t0Var = uj0Var.Z0;
                if (t0Var != null) {
                    t0Var.b(recyclerView, i7, i10);
                }
                if (uj0Var.D1 != -1) {
                    rect.offset(-i7, -i10);
                    org.telegram.ui.Cells.y yVar = uj0Var.C1;
                    if (yVar != null) {
                        yVar.setBounds(rect);
                    }
                    uj0Var.invalidate();
                } else {
                    rect.setEmpty();
                }
                uj0Var.L0(false);
                if (i10 != 0 && (zi0Var = uj0Var.f40050e1) != null) {
                    zi0Var.c();
                }
                dj0 dj0Var = uj0Var.T1;
                if (dj0Var != null) {
                    uj0Var.e1(dj0Var, 700, false);
                    return;
                }
                return;
            case 16:
            default:
                return;
            case 17:
                bt0.I0((bt0) this.f38981b);
                return;
            case 18:
                it0 it0Var = (it0) this.f38981b;
                if (recyclerView == it0Var.H) {
                    it0Var.S += i10;
                }
                if (it0Var.Q == null && it0Var.R == 0) {
                    it0Var.B();
                    return;
                }
                return;
            case 19:
                ((iu0) this.f38981b).T1.W();
                return;
            case 20:
                bw0.I0((bw0) this.f38981b);
                return;
            case 21:
                ((e51) this.f38981b).Q0();
                return;
            case 22:
                ((v61) this.f38981b).invalidate();
                return;
            case 23:
                org.telegram.ui.Wallet.y5 y5Var = (org.telegram.ui.Wallet.y5) this.f38981b;
                if (i10 != 0 && recyclerView.getScrollState() == 1 && (u5Var = y5Var.f44747r0) != null && u5Var.f44558f) {
                    u5Var.d = true;
                }
                y5Var.U0();
                return;
            case 24:
                int[] iArr2 = (int[]) this.f38981b;
                iArr2[0] = iArr2[0] + i10;
                return;
            case 25:
                org.telegram.ui.Wallet.z9 z9Var = (org.telegram.ui.Wallet.z9) this.f38981b;
                if (z9Var.f38880a.J1) {
                    org.telegram.messenger.g0.v1(z9Var.O);
                    return;
                }
                return;
            case 26:
                org.telegram.ui.web.m mVar = (org.telegram.ui.web.m) this.f38981b;
                if (!mVar.f38880a.canScrollVertically(1)) {
                    if (TextUtils.isEmpty(mVar.f52710w)) {
                        mVar.f52705e.d();
                    } else {
                        org.telegram.ui.web.i iVar = mVar.f52706f;
                        if (iVar != null) {
                            iVar.d();
                        }
                    }
                }
                if (mVar.f38880a.J1) {
                    org.telegram.messenger.g0.v1(mVar.fragmentView);
                    return;
                }
                return;
            case 27:
                org.telegram.ui.web.x0 x0Var = (org.telegram.ui.web.x0) this.f38981b;
                if (x0Var.f38880a.J1) {
                    org.telegram.messenger.g0.v1(x0Var.fragmentView);
                    return;
                }
                return;
            case 28:
                ((ri.q) this.f38981b).h(i7, i10);
                return;
            case 29:
                ug.t0 t0Var2 = (ug.t0) this.f38981b;
                if (recyclerView.getScrollState() == 1) {
                    t0Var2.z1(null, true);
                }
                t0Var2.invalidate();
                return;
        }
    }
}
