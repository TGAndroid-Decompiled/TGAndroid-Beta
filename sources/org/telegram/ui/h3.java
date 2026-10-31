package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class h3 extends s4.s0 {
    public final int f37699a;
    public final Object f37700b;

    public h3(Object obj, int i10) {
        this.f37699a = i10;
        this.f37700b = obj;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        View view;
        View view2;
        View m10;
        org.telegram.ui.ActionBar.l lVar;
        View view3;
        switch (this.f37699a) {
            case 0:
                if (i10 == 0) {
                    ((l3) this.f37700b).L.P0.V();
                    return;
                }
                return;
            case 1:
            case 2:
            case 3:
            case 4:
            case 10:
            case 11:
            case 19:
            case 26:
            case 27:
            default:
                return;
            case 5:
                sb sbVar = (sb) this.f37700b;
                if (i10 == 1) {
                    sbVar.S = true;
                    sbVar.V = true;
                    return;
                } else if (i10 == 0) {
                    sbVar.S = false;
                    sbVar.V = false;
                    sbVar.X0(true);
                    return;
                } else {
                    return;
                }
            case 6:
                if (i10 == 1) {
                    org.telegram.messenger.i0.v1(((un) this.f37700b).l1);
                    return;
                }
                return;
            case 7:
                if (i10 == 1) {
                    org.telegram.messenger.i0.v1(((iq) this.f37700b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 8:
                if (i10 == 1) {
                    org.telegram.messenger.i0.v1(((pr) this.f37700b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 9:
                if (i10 == 1) {
                    org.telegram.messenger.i0.v1(((rt) this.f37700b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 12:
                p10 p10Var = (p10) this.f37700b;
                if (i10 == 0) {
                    int L = org.telegram.messenger.i0.L(16.0f) + p10Var.o0().getBottom();
                    if (p10Var.f40422w > 0.5f) {
                        p10Var.f40417c.w0(0, p10Var.f40420r - L, null);
                        return;
                    }
                    if (p10Var.f40417c.getLayoutManager() != null) {
                        view = p10Var.f40417c.getLayoutManager().m(0);
                    } else {
                        view = null;
                    }
                    if (view != null) {
                        if (p10Var.p0() + view.getTop() < 0.0f) {
                            p10Var.f40417c.w0(0, Math.round(p10Var.p0() + view.getTop()), null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 13:
                i50 i50Var = (i50) this.f37700b;
                if (i10 == 0) {
                    float f7 = i50Var.A0;
                    if (f7 >= 0.5f && f7 < 1.0f) {
                        int bottom = i50.n1(i50Var).getBottom();
                        s4.n0 layoutManager = i50Var.M.getLayoutManager();
                        if (layoutManager != null && (m10 = layoutManager.m(0)) != null) {
                            i50Var.M.w0(0, m10.getBottom() - bottom, null);
                            return;
                        }
                        return;
                    } else if (f7 < 0.5f) {
                        if (i50Var.M.getLayoutManager() != null) {
                            view2 = i50Var.M.getLayoutManager().m(0);
                        } else {
                            view2 = null;
                        }
                        if (view2 != null && view2.getTop() < 0) {
                            i50Var.M.w0(0, view2.getTop(), null);
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 14:
                v50 v50Var = (v50) this.f37700b;
                if (i10 == 1) {
                    v50Var.f42613f.f26588r.m();
                    org.telegram.messenger.i0.v1(v50Var.f42613f.f26588r);
                    return;
                }
                return;
            case 15:
                if (i10 == 1) {
                    org.telegram.messenger.i0.v1(((c60) this.f37700b).f36393c);
                    return;
                }
                return;
            case 16:
                if (i10 == 1) {
                    org.telegram.messenger.i0.v1(((k60) this.f37700b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 17:
                y60 y60Var = (y60) this.f37700b;
                if (i10 == 1 && y60.a0(y60Var).F) {
                    org.telegram.messenger.i0.v1(y60.b0(y60Var).getSearchField());
                    return;
                }
                return;
            case 18:
                if (i10 == 1) {
                    org.telegram.messenger.i0.v1(((LanguageSelectActivity) this.f37700b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 20:
                return;
            case 21:
                if (i10 == 1) {
                    org.telegram.messenger.i0.v1(((wh0) this.f37700b).Q1.getEditText());
                    return;
                }
                return;
            case 22:
                if (i10 == 1) {
                    org.telegram.messenger.i0.v1(((NotificationsCustomSettingsActivity) this.f37700b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 23:
                if (i10 == 1) {
                    org.telegram.messenger.i0.v1(((lo0) this.f37700b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 24:
                return;
            case 25:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.f37700b;
                if (i10 == 0) {
                    lVar = ((org.telegram.ui.ActionBar.k2) premiumPreviewFragment).actionBar;
                    int L2 = org.telegram.messenger.i0.L(16.0f) + lVar.getBottom();
                    if (premiumPreviewFragment.f33698f0 > 0.5f) {
                        premiumPreviewFragment.f33689a.w0(0, premiumPreviewFragment.f33694c0 - L2, null);
                        return;
                    }
                    if (premiumPreviewFragment.f33689a.getLayoutManager() != null) {
                        view3 = premiumPreviewFragment.f33689a.getLayoutManager().m(0);
                    } else {
                        view3 = null;
                    }
                    if (view3 != null && view3.getTop() < 0) {
                        premiumPreviewFragment.f33689a.w0(0, view3.getTop(), null);
                        return;
                    }
                    return;
                }
                return;
            case 28:
                if (i10 == 1) {
                    org.telegram.messenger.i0.v1(((e01) this.f37700b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i10, int i11) {
        d00 d00Var;
        org.telegram.ui.Cells.h3 h3Var;
        int i12;
        tg.f fVar;
        int abs;
        s4.c1 T;
        org.telegram.ui.Components.q30 q30Var;
        tg.f fVar2;
        int i13 = this.f37699a;
        boolean z10 = false;
        boolean z11 = false;
        int i14 = 0;
        boolean z12 = false;
        r4 = false;
        boolean z13 = false;
        Object obj = this.f37700b;
        switch (i13) {
            case 0:
                l3 l3Var = (l3) obj;
                if (recyclerView.getChildCount() != 0) {
                    recyclerView.invalidate();
                    l3Var.L.P0.G();
                    h4 h4Var = l3Var.L;
                    u3 u3Var = h4Var.K;
                    if (u3Var != null) {
                        u3Var.f41997c.invalidate();
                    } else {
                        ArticleViewer$WindowView articleViewer$WindowView = h4Var.f37732f0;
                        if (articleViewer$WindowView != null) {
                            articleViewer$WindowView.invalidate();
                        }
                    }
                    l3Var.L.d0();
                    h4 h4Var2 = l3Var.L;
                    u3 u3Var2 = h4Var2.K;
                    if (u3Var2 == null || u3Var2.F) {
                        h4Var2.V(h4Var2.J0 - i11);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                n nVar = (n) obj;
                if (!nVar.I && !nVar.f39803r && nVar.d.N0() > nVar.E - 2) {
                    nVar.a0();
                    return;
                }
                return;
            case 2:
                h4 h4Var3 = (h4) obj;
                if (h4Var3.f37735i0.f43072x.I1) {
                    org.telegram.messenger.i0.v1(h4Var3.f37734h0.f43095b0);
                    return;
                }
                return;
            case 3:
                y6 y6Var = (y6) obj;
                if (y6Var.f43717b.canScrollVertically(-1) || y6.e0(y6Var).s()) {
                    z10 = true;
                }
                fe.b bVar = y6Var.S;
                if (bVar != null) {
                    bVar.a(z10, true);
                    return;
                }
                return;
            case 4:
                ((h8) obj).u0();
                return;
            case 5:
                sb sbVar = (sb) obj;
                sbVar.f41453w.invalidate();
                if (i11 != 0 && sbVar.S && !sbVar.Q && sbVar.M.getTag() == null) {
                    AnimatorSet animatorSet = sbVar.R;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                    }
                    sbVar.M.setTag(1);
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    sbVar.R = animatorSet2;
                    animatorSet2.setDuration(150L);
                    sbVar.R.playTogether(ObjectAnimator.ofFloat(sbVar.M, "alpha", 1.0f));
                    sbVar.R.addListener(new s9(this, 11));
                    sbVar.R.start();
                }
                sbVar.S0(true);
                sbVar.g1();
                return;
            case 6:
            case 7:
            case 9:
            case 15:
            case 16:
            case 17:
            case 18:
            case 21:
            case 28:
            default:
                return;
            case 8:
                return;
            case 10:
                zu zuVar = (zu) obj;
                org.telegram.ui.Components.ba baVar = zuVar.f26671q1;
                if (baVar != null) {
                    org.telegram.ui.Components.rb0 rb0Var = baVar.f30213h0;
                    if (rb0Var != null && rb0Var.getTop() == baVar.f30215j0) {
                        z13 = true;
                    }
                    zuVar.f26673s1 = !z13;
                    baVar.invalidate();
                    return;
                }
                return;
            case 11:
                i00 i00Var = (i00) obj;
                if (i00Var.f38066a.I1 && (d00Var = i00Var.K) != null && (h3Var = d00Var.f22065b) != null) {
                    if (h3Var.e) {
                        h3Var.k(true);
                        return;
                    } else {
                        h3Var.d();
                        return;
                    }
                }
                return;
            case 12:
                ((p10) obj).f40421s.invalidate();
                return;
            case 13:
                i50 i50Var = (i50) obj;
                if (i50Var.f38178z0 == null) {
                    i50Var.f38178z0 = (sc) i50Var.E0(i50Var.Z);
                }
                int measuredHeight = i50Var.f38178z0.getMeasuredHeight() - i50.m1(i50Var).getMeasuredHeight();
                float top = i50Var.f38178z0.getTop() * (-1);
                float f7 = measuredHeight;
                float max = Math.max(Math.min(1.0f, top / f7), 0.0f);
                i50Var.A0 = max;
                float min = Math.min(max * 2.0f, 1.0f);
                float min2 = Math.min(Math.max(i50Var.A0 - 0.45f, 0.0f) * 2.0f, 1.0f);
                i50Var.f38178z0.f41467b.setAlpha(org.telegram.messenger.i0.T1(1.0f, 0.0f, min));
                i50Var.f38178z0.f41469f.setAlpha(org.telegram.messenger.i0.T1(1.0f, 0.0f, min));
                i50Var.f38178z0.f41468c.setAlpha(org.telegram.messenger.i0.T1(0.0f, 1.0f, min2));
                if (i50Var.A0 >= 1.0f) {
                    i50Var.f38178z0.setTranslationY(top - f7);
                    return;
                } else {
                    i50Var.f38178z0.setTranslationY(0.0f);
                    return;
                }
            case 14:
                v50 v50Var = (v50) obj;
                int L0 = v50Var.f42626r.L0();
                View childAt = v50Var.f42621n.getChildAt(0);
                if (childAt != null) {
                    i12 = childAt.getTop();
                } else {
                    i12 = 0;
                }
                if (L0 != 0 || i12 < v50Var.f42621n.getPaddingTop()) {
                    z12 = true;
                }
                ((fe.b) v50Var.e.f11064c).a(z12, true);
                if (Build.VERSION.SDK_INT >= 31 && (fVar = v50Var.f42624p0) != null) {
                    fVar.f(i10, i11);
                    v50Var.i0();
                    return;
                }
                return;
            case 19:
                ((kh0) obj).J.invalidate();
                return;
            case 20:
                sh0 sh0Var = (sh0) obj;
                int L02 = sh0Var.h.L0();
                if (L02 != -1) {
                    i14 = Math.abs(sh0Var.h.N0() - L02) + 1;
                }
                int b10 = recyclerView.getAdapter().b();
                if (i14 > 0 && !sh0Var.V && !sh0Var.E && !sh0Var.f41526y.isEmpty() && L02 + i14 >= b10 - 5 && sh0Var.D) {
                    sh0Var.g0();
                    return;
                }
                return;
            case 22:
                return;
            case 23:
                lo0 lo0Var = (lo0) obj;
                if (lo0Var.J == null) {
                    int L03 = lo0Var.M.L0();
                    if (L03 == -1) {
                        abs = 0;
                    } else {
                        abs = Math.abs(lo0Var.M.N0() - L03) + 1;
                    }
                    if (abs > 0 && L03 + abs > lo0Var.M.B() - 2 && !lo0Var.f39348r && !lo0Var.f39350s) {
                        if (lo0Var.f39327a == 1) {
                            z11 = true;
                        }
                        lo0Var.h0(lo0Var.f39355w, lo0Var.f39357x, z11, true);
                        return;
                    }
                    return;
                }
                return;
            case 24:
                at0 at0Var = (at0) obj;
                if (i11 != 0 && (q30Var = at0Var.h) != null) {
                    q30Var.b(true);
                }
                org.telegram.ui.Components.sx0 sx0Var = at0Var.Q;
                if (sx0Var != null && sx0Var.f30380s) {
                    org.telegram.ui.Components.qx0 delegate = sx0Var.getDelegate();
                    if (delegate instanceof org.telegram.ui.Cells.e6) {
                        w71 w71Var = at0Var.f35713c;
                        View F = w71Var.F((org.telegram.ui.Cells.e6) delegate);
                        if (F == null) {
                            T = null;
                        } else {
                            T = w71Var.T(F);
                        }
                        if (T != null) {
                            View view = T.f47898a;
                            if (at0Var.Q.getDirection() == 0) {
                                at0Var.Q.setTranslationY((view.getY() - org.telegram.messenger.i0.L(166.0f)) + view.getMeasuredHeight());
                            } else {
                                at0Var.Q.setTranslationY(view.getY());
                            }
                            s4.a0 a0Var = at0Var.d;
                            if (!a0Var.f47980c.S(view) || !a0Var.d.S(view)) {
                                at0Var.Q.f();
                                return;
                            }
                            return;
                        }
                        at0Var.Q.f();
                        return;
                    }
                    at0Var.Q.f();
                    return;
                }
                return;
            case 25:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) obj;
                premiumPreviewFragment.f33695d0.invalidate();
                if (Build.VERSION.SDK_INT >= 31 && (fVar2 = premiumPreviewFragment.f33718w0) != null) {
                    fVar2.f(i10, i11);
                    premiumPreviewFragment.n0();
                    return;
                }
                return;
            case 26:
                av0 av0Var = (av0) obj;
                if (!av0Var.getMessagesController().I0) {
                    int abs2 = Math.abs(av0Var.f35752b.N0() - av0Var.f35752b.L0()) + 1;
                    int b11 = recyclerView.getAdapter().b();
                    if (abs2 > 0 && av0Var.f35752b.N0() >= b11 - 10) {
                        av0Var.getMessagesController().F0(false);
                        return;
                    }
                    return;
                }
                return;
            case 27:
                b01 b01Var = (b01) obj;
                b01Var.e.invalidate();
                c01 c01Var = b01Var.f35926w;
                int i15 = c01.f36350s1;
                c01Var.f21586b.invalidate();
                return;
            case 29:
                ((t31) obj).d1();
                return;
        }
    }

    public h3(sb sbVar) {
        this.f37699a = 5;
        this.f37700b = sbVar;
        org.telegram.messenger.i0.L(100.0f);
    }

    private final void c(RecyclerView recyclerView, int i10) {
    }

    private final void d(RecyclerView recyclerView, int i10) {
    }

    private final void e(RecyclerView recyclerView, int i10, int i11) {
    }

    private final void f(RecyclerView recyclerView, int i10, int i11) {
    }
}
