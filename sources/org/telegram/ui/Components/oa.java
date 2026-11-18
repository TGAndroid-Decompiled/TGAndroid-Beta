package org.telegram.ui.Components;

import android.graphics.Rect;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.TLRPC;
public final class oa extends v4.u0 {
    public final int f38037a;
    public final Object f38038b;

    public oa(Object obj, int i7) {
        this.f38037a = i7;
        this.f38038b = obj;
    }

    @Override
    public void a(RecyclerView recyclerView, int i7) {
        int i10;
        kj0 kj0Var;
        kj0 kj0Var2;
        int top;
        int i11;
        kj0 kj0Var3;
        kj0 kj0Var4;
        int top2;
        boolean z10;
        kj0 kj0Var5;
        kj0 kj0Var6;
        org.telegram.ui.Wallet.j9 j9Var;
        int i12 = this.f38037a;
        boolean z11 = false;
        Object obj = this.f38038b;
        switch (i12) {
            case 2:
                fj fjVar = (fj) obj;
                di.b1 b1Var = fjVar.f35114n;
                si siVar = fjVar.f36766b;
                if (i7 == 0) {
                    int L = org.telegram.messenger.g0.L(13.0f);
                    org.telegram.ui.ActionBar.r0 r0Var = siVar.Y2;
                    if (r0Var != null) {
                        i10 = org.telegram.messenger.g0.L(r0Var.getAlpha() * 26.0f);
                    } else {
                        i10 = 0;
                    }
                    int i13 = L + i10;
                    int i14 = siVar.f30224t0;
                    if (((siVar.Z3[0] - i14) - i13) + i14 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (kj0Var = (kj0) b1Var.K(0)) != null) {
                        View view = kj0Var.f59123a;
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
                si siVar2 = kkVar.f36766b;
                yj yjVar = kkVar.f36781r;
                if (i7 == 0) {
                    int L2 = org.telegram.messenger.g0.L(13.0f);
                    int i15 = siVar2.f30224t0;
                    if (((siVar2.Z3[0] - i15) - L2) + i15 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (kj0Var2 = (kj0) yjVar.K(0)) != null && (top = (kj0Var2.f59123a.getTop() - org.telegram.messenger.g0.f24112m) - org.telegram.messenger.g0.L(56.0f)) > 0) {
                        yjVar.w0(0, top, null);
                    }
                }
                if (i7 == 1 && kkVar.f36775c0 && yjVar.getAdapter() == kkVar.E) {
                    org.telegram.messenger.g0.v1(siVar2.getCurrentFocus());
                }
                if (i7 != 0) {
                    z11 = true;
                }
                kkVar.V = z11;
                return;
            case 5:
                lk lkVar = (lk) obj;
                ck0 ck0Var = lkVar.f37135r;
                si siVar3 = lkVar.f36766b;
                if (i7 == 0) {
                    int L3 = org.telegram.messenger.g0.L(13.0f);
                    org.telegram.ui.ActionBar.r0 r0Var2 = siVar3.Y2;
                    if (r0Var2 != null) {
                        i11 = org.telegram.messenger.g0.L(r0Var2.getAlpha() * 26.0f);
                    } else {
                        i11 = 0;
                    }
                    int i16 = L3 + i11;
                    int i17 = siVar3.f30224t0;
                    if (((siVar3.Z3[0] - i17) - i16) + i17 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (kj0Var3 = (kj0) ck0Var.K(0)) != null) {
                        View view2 = kj0Var3.f59123a;
                        if (view2.getTop() > org.telegram.messenger.g0.L(7.0f)) {
                            ck0Var.w0(0, view2.getTop() - org.telegram.messenger.g0.L(7.0f), null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 6:
                rn rnVar = (rn) obj;
                org.telegram.ui.f61 f61Var = rnVar.f39242s;
                if (i7 == 0) {
                    int L4 = org.telegram.messenger.g0.L(13.0f);
                    si siVar4 = rnVar.f36766b;
                    int i18 = siVar4.f30224t0;
                    if (((siVar4.Z3[0] - i18) - L4) + i18 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (kj0Var4 = (kj0) f61Var.K(1)) != null && (top2 = (kj0Var4.f59123a.getTop() - org.telegram.messenger.g0.f24112m) - org.telegram.messenger.g0.L(65.0f)) > 0) {
                        f61Var.w0(0, top2, null);
                    }
                    int i19 = rnVar.X0;
                    if (i19 >= 0) {
                        rn.P(rnVar, i19);
                        rnVar.X0 = -1;
                        return;
                    }
                    return;
                }
                return;
            case 12:
                s90 s90Var = (s90) obj;
                if (i7 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                s90Var.f39529f3 = z10;
                if (i7 == 1) {
                    z11 = true;
                }
                s90Var.f39530g3 = z11;
                return;
            case 14:
                df0 df0Var = (df0) obj;
                xe0 xe0Var = df0Var.f34420m1;
                if (i7 == 0) {
                    int L5 = org.telegram.messenger.g0.L(13.0f);
                    int i20 = df0Var.f34432z1;
                    int i21 = df0Var.f30224t0;
                    if (((i20 - i21) - L5) + i21 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && xe0Var.canScrollVertically(1) && (kj0Var5 = (kj0) xe0Var.K(0)) != null) {
                        View view3 = kj0Var5.f59123a;
                        if (view3.getTop() > org.telegram.messenger.g0.L(7.0f)) {
                            xe0Var.w0(0, view3.getTop() - org.telegram.messenger.g0.L(7.0f), null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 16:
                ck0 ck0Var2 = (ck0) obj;
                if (i7 == 0) {
                    if (ck0Var2.f34086u2) {
                        ck0Var2.f34086u2 = false;
                        org.telegram.messenger.ks.e().k(99, 512);
                    }
                } else if (!ck0Var2.f34086u2 && ck0Var2.f34089w1) {
                    ck0Var2.f34086u2 = true;
                    org.telegram.messenger.ks.e().k(98, 512);
                }
                if (i7 != 0 && ck0Var2.M1 != null) {
                    sj0 sj0Var = ck0Var2.f34054d1;
                    if (sj0Var != null) {
                        org.telegram.messenger.g0.r(sj0Var);
                        ck0Var2.f34054d1 = null;
                    }
                    MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                    try {
                        ck0Var2.L1.w0(obtain);
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                    }
                    ck0Var2.M1.onTouchEvent(obtain);
                    obtain.recycle();
                    View view4 = ck0Var2.M1;
                    ck0Var2.j1(view4, 0.0f, 0.0f, false);
                    ck0Var2.M1 = null;
                    ck0Var2.m1(view4, null);
                    ck0Var2.O1 = false;
                }
                v4.u0 u0Var = ck0Var2.Z0;
                if (u0Var != null) {
                    u0Var.a(recyclerView, i7);
                }
                if (i7 == 1 || i7 == 2) {
                    z11 = true;
                }
                ck0Var2.J1 = z11;
                if (z11) {
                    ck0Var2.K1 = true;
                    return;
                }
                return;
            case 17:
                ql0 ql0Var = (ql0) obj;
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(ql0Var.G.getCurrentFocus());
                }
                ql0Var.a();
                return;
            case 22:
                o51 o51Var = (o51) obj;
                di.b1 b1Var2 = o51Var.f37984o1;
                if (i7 == 0 && o51Var.B1 && org.telegram.messenger.g0.L(13.0f) + o51Var.f37994y1 + o51Var.f30224t0 < org.telegram.messenger.g0.f24112m * 2 && b1Var2.canScrollVertically(1) && (kj0Var6 = (kj0) b1Var2.K(0)) != null) {
                    View view5 = kj0Var6.f59123a;
                    if (view5.getTop() > 0) {
                        b1Var2.w0(0, view5.getTop(), null);
                        return;
                    }
                    return;
                }
                return;
            case 24:
                if (i7 == 1 && (j9Var = ((org.telegram.ui.Wallet.n6) obj).f44632j0) != null) {
                    j9Var.a();
                    return;
                }
                return;
            case 29:
                ((ri.q) obj).f56699g++;
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
        hj0 hj0Var;
        org.telegram.ui.Wallet.j6 j6Var;
        switch (this.f38037a) {
            case 0:
                ((au0) this.f38038b).invalidate();
                return;
            case 1:
                cj cjVar = (cj) this.f38038b;
                cjVar.f36766b.N1(cjVar, i10);
                return;
            case 2:
                fj fjVar = (fj) this.f38038b;
                if (fjVar.f35114n.getChildCount() > 0) {
                    fjVar.f36766b.N1(fjVar, i10);
                    return;
                }
                return;
            case 3:
                tj tjVar = (tj) this.f38038b;
                tjVar.f36766b.N1(tjVar, i10);
                tjVar.T();
                return;
            case 4:
                kk kkVar = (kk) this.f38038b;
                kg.c0 c0Var = kkVar.F;
                kkVar.f36766b.N1(kkVar, i10);
                kkVar.Z();
                v4.i0 adapter = kkVar.f36781r.getAdapter();
                jk jkVar = kkVar.E;
                if (adapter == jkVar) {
                    int L0 = c0Var.L0();
                    int N02 = c0Var.N0();
                    int abs = Math.abs(N02 - L0) + 1;
                    int b10 = recyclerView.getAdapter().b();
                    if (abs > 0 && N02 >= b10 - 10) {
                        jk jkVar2 = jkVar.Y.E;
                        if (!jkVar2.T && !jkVar2.W && (o0Var = jkVar.E) != null) {
                            jkVar.Z(jkVar.f36455y, jkVar.F, jkVar.G, o0Var, jkVar.K, false);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 5:
                lk lkVar = (lk) this.f38038b;
                lkVar.f36766b.N1(lkVar, i10);
                lkVar.f37137w.setTranslationY(Math.max(0, lkVar.getCurrentItemTop()));
                return;
            case 6:
                rn rnVar = (rn) this.f38038b;
                kg.c0 c0Var2 = rnVar.f39249x;
                rnVar.f36766b.N1(rnVar, i10);
                in inVar = rnVar.f39251y;
                if (inVar != null && inVar.f42657s) {
                    ww0 delegate = inVar.getDelegate();
                    if (delegate instanceof org.telegram.ui.Cells.b6) {
                        org.telegram.ui.f61 f61Var = rnVar.f39242s;
                        View F = f61Var.F((org.telegram.ui.Cells.b6) delegate);
                        if (F == null) {
                            T = null;
                        } else {
                            T = f61Var.T(F);
                        }
                        if (T != null) {
                            View view = T.f59123a;
                            int b11 = T.b();
                            if (inVar.getDirection() == 0) {
                                inVar.setTranslationY((view.getY() - org.telegram.messenger.g0.L(166.0f)) + view.getMeasuredHeight());
                            } else {
                                inVar.setTranslationY(view.getY());
                            }
                            if (b11 < c0Var2.L0() || b11 > c0Var2.N0()) {
                                inVar.f();
                            }
                        } else {
                            inVar.f();
                        }
                    } else {
                        inVar.f();
                    }
                }
                if (i10 != 0 && (j30Var = rnVar.E) != null) {
                    j30Var.a();
                    return;
                }
                return;
            case 7:
                sn snVar = (sn) this.f38038b;
                snVar.f36766b.N1(snVar, i10);
                return;
            case 8:
                lp lpVar = (lp) this.f38038b;
                if (lpVar.f37184x1.M0() + 10 >= lpVar.f37178r1.b()) {
                    lpVar.R0();
                    return;
                }
                return;
            case 9:
                bv bvVar = (bv) this.f38038b;
                tu tuVar = bvVar.f33787q1;
                if (tuVar != null && bvVar.f33788r1.J1 && tuVar.f40107x) {
                    tuVar.f40107x = false;
                    tuVar.invalidate();
                    return;
                }
                return;
            case 10:
                pz pzVar = (pz) this.f38038b;
                pzVar.G.invalidate();
                pzVar.invalidate();
                return;
            case 11:
                qz.J0((qz) this.f38038b);
                return;
            case 12:
                s90 s90Var = (s90) this.f38038b;
                v4.p0 layoutManager = s90Var.getLayoutManager();
                t90 t90Var = s90Var.j3;
                m90 m90Var = t90Var.d;
                if (layoutManager == m90Var) {
                    N0 = m90Var.N0();
                } else {
                    N0 = t90Var.f39947c.N0();
                }
                if (N0 == -1) {
                    i11 = 0;
                } else {
                    i11 = N0;
                }
                if (i11 > 0) {
                    jg.h1 h1Var = t90Var.f39949f;
                    if (N0 > h1Var.N0 - 5 && h1Var.f17526v0 == 0 && (str = h1Var.f17524t0) != null && str.length() != 0 && (user = h1Var.f17530x0) != null && (str2 = h1Var.f17523s0) != null) {
                        h1Var.T(true, user, str2, h1Var.f17524t0);
                    }
                }
                s90Var.canScrollVertically(1);
                t90Var.n(!s90Var.canScrollVertically(-1));
                t90Var.b();
                return;
            case 13:
                oa0 oa0Var = (oa0) this.f38038b;
                org.telegram.ui.v8 v8Var = oa0Var.f38041b;
                di.b1 b1Var = oa0Var.f38047f;
                for (int i12 = 0; i12 < b1Var.getChildCount(); i12++) {
                    View childAt = b1Var.getChildAt(i12);
                    if (childAt instanceof org.telegram.ui.Cells.r1) {
                        ((org.telegram.ui.Cells.r1) childAt).A3(v8Var.getMeasuredWidth(), v8Var.getBackgroundSizeY());
                    }
                }
                ia0 ia0Var = oa0Var.f38046e;
                if (ia0Var != null) {
                    ia0Var.w();
                    return;
                }
                return;
            case 14:
                df0 df0Var = (df0) this.f38038b;
                if (df0Var.f34420m1.getChildCount() > 0) {
                    df0.J0(df0Var);
                    return;
                }
                return;
            case 15:
                vi0 vi0Var = (vi0) this.f38038b;
                di.b1 b1Var2 = vi0Var.f40641b;
                int[] iArr = vi0Var.f40655g0;
                if (recyclerView.getChildCount() > 2) {
                    recyclerView.getLocationInWindow(iArr);
                    int i13 = iArr[0];
                    View childAt2 = recyclerView.getChildAt(0);
                    childAt2.getLocationInWindow(iArr);
                    float min = ((1.0f - Math.min(1.0f, (-Math.min(iArr[0] - i13, 0.0f)) / childAt2.getWidth())) * 0.39999998f) + 0.6f;
                    if (Float.isNaN(min)) {
                        min = 1.0f;
                    }
                    vi0.b(vi0Var, childAt2, min);
                    View childAt3 = recyclerView.getChildAt(recyclerView.getChildCount() - 1);
                    childAt3.getLocationInWindow(iArr);
                    float min2 = ((1.0f - Math.min(1.0f, (-Math.min((recyclerView.getWidth() + i13) - (childAt3.getWidth() + iArr[0]), 0.0f)) / childAt3.getWidth())) * 0.39999998f) + 0.6f;
                    if (Float.isNaN(min2)) {
                        min2 = 1.0f;
                    }
                    vi0.b(vi0Var, childAt3, min2);
                }
                for (int i14 = 1; i14 < b1Var2.getChildCount() - 1; i14++) {
                    vi0.b(vi0Var, b1Var2.getChildAt(i14), 1.0f);
                }
                vi0Var.invalidate();
                return;
            case 16:
                ck0 ck0Var = (ck0) this.f38038b;
                Rect rect = ck0Var.F1;
                v4.u0 u0Var = ck0Var.Z0;
                if (u0Var != null) {
                    u0Var.b(recyclerView, i7, i10);
                }
                if (ck0Var.D1 != -1) {
                    rect.offset(-i7, -i10);
                    org.telegram.ui.Cells.y yVar = ck0Var.C1;
                    if (yVar != null) {
                        yVar.setBounds(rect);
                    }
                    ck0Var.invalidate();
                } else {
                    rect.setEmpty();
                }
                ck0Var.L0(false);
                if (i10 != 0 && (hj0Var = ck0Var.f34055e1) != null) {
                    hj0Var.c();
                }
                lj0 lj0Var = ck0Var.T1;
                if (lj0Var != null) {
                    ck0Var.e1(lj0Var, 700, false);
                    return;
                }
                return;
            case 17:
            default:
                return;
            case 18:
                jt0.J0((jt0) this.f38038b);
                return;
            case 19:
                qt0 qt0Var = (qt0) this.f38038b;
                if (recyclerView == qt0Var.H) {
                    qt0Var.S += i10;
                }
                if (qt0Var.Q == null && qt0Var.R == 0) {
                    qt0Var.B();
                    return;
                }
                return;
            case 20:
                ((qu0) this.f38038b).T1.W();
                return;
            case 21:
                iw0.J0((iw0) this.f38038b);
                return;
            case 22:
                ((o51) this.f38038b).R0();
                return;
            case 23:
                ((f71) this.f38038b).invalidate();
                return;
            case 24:
                org.telegram.ui.Wallet.n6 n6Var = (org.telegram.ui.Wallet.n6) this.f38038b;
                if (i10 != 0 && recyclerView.getScrollState() == 1 && (j6Var = n6Var.f44644t0) != null && j6Var.f44406f) {
                    j6Var.d = true;
                }
                n6Var.Y0();
                return;
            case 25:
                int[] iArr2 = (int[]) this.f38038b;
                iArr2[0] = iArr2[0] + i10;
                return;
            case 26:
                org.telegram.ui.Wallet.na naVar = (org.telegram.ui.Wallet.na) this.f38038b;
                if (naVar.f33530a.J1) {
                    org.telegram.messenger.g0.v1(naVar.O);
                    return;
                }
                return;
            case 27:
                org.telegram.ui.web.m mVar = (org.telegram.ui.web.m) this.f38038b;
                if (!mVar.f33530a.canScrollVertically(1)) {
                    if (TextUtils.isEmpty(mVar.f53190w)) {
                        mVar.f53185e.d();
                    } else {
                        org.telegram.ui.web.i iVar = mVar.f53186f;
                        if (iVar != null) {
                            iVar.d();
                        }
                    }
                }
                if (mVar.f33530a.J1) {
                    org.telegram.messenger.g0.v1(mVar.fragmentView);
                    return;
                }
                return;
            case 28:
                org.telegram.ui.web.x0 x0Var = (org.telegram.ui.web.x0) this.f38038b;
                if (x0Var.f33530a.J1) {
                    org.telegram.messenger.g0.v1(x0Var.fragmentView);
                    return;
                }
                return;
            case 29:
                ((ri.q) this.f38038b).h(i7, i10);
                return;
        }
    }
}
