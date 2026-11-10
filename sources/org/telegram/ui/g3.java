package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class g3 extends v4.s0 {
    public final int f45924a;
    public final Object f45925b;

    public g3(Object obj, int i7) {
        this.f45924a = i7;
        this.f45925b = obj;
    }

    @Override
    public void a(RecyclerView recyclerView, int i7) {
        View view;
        View view2;
        View m10;
        org.telegram.ui.ActionBar.l lVar;
        View view3;
        switch (this.f45924a) {
            case 0:
                if (i7 == 0) {
                    ((k3) this.f45925b).L.P0.V();
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
            case 28:
            default:
                return;
            case 5:
                mb mbVar = (mb) this.f45925b;
                if (i7 == 1) {
                    mbVar.S = true;
                    mbVar.V = true;
                    return;
                } else if (i7 == 0) {
                    mbVar.S = false;
                    mbVar.V = false;
                    mbVar.Y0(true);
                    return;
                } else {
                    return;
                }
            case 6:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(((cn) this.f45925b).l1);
                    return;
                }
                return;
            case 7:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(((mp) this.f45925b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 8:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(((rq) this.f45925b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 9:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(((ts) this.f45925b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 12:
                r00 r00Var = (r00) this.f45925b;
                if (i7 == 0) {
                    int L = org.telegram.messenger.g0.L(16.0f) + r00Var.p0().getBottom();
                    if (r00Var.f49195w > 0.5f) {
                        r00Var.f49189c.w0(0, r00Var.f49193r - L, null);
                        return;
                    }
                    if (r00Var.f49189c.getLayoutManager() != null) {
                        view = r00Var.f49189c.getLayoutManager().m(0);
                    } else {
                        view = null;
                    }
                    if (view != null) {
                        if (r00Var.q0() + view.getTop() < 0.0f) {
                            r00Var.f49189c.w0(0, Math.round(r00Var.q0() + view.getTop()), null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 13:
                m40 m40Var = (m40) this.f45925b;
                if (i7 == 0) {
                    float f10 = m40Var.A0;
                    if (f10 >= 0.5f && f10 < 1.0f) {
                        int bottom = m40.o1(m40Var).getBottom();
                        v4.n0 layoutManager = m40Var.M.getLayoutManager();
                        if (layoutManager != null && (m10 = layoutManager.m(0)) != null) {
                            m40Var.M.w0(0, m10.getBottom() - bottom, null);
                            return;
                        }
                        return;
                    } else if (f10 < 0.5f) {
                        if (m40Var.M.getLayoutManager() != null) {
                            view2 = m40Var.M.getLayoutManager().m(0);
                        } else {
                            view2 = null;
                        }
                        if (view2 != null && view2.getTop() < 0) {
                            m40Var.M.w0(0, view2.getTop(), null);
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 14:
                z40 z40Var = (z40) this.f45925b;
                if (i7 == 1) {
                    z40Var.f52219f.f37446r.m();
                    org.telegram.messenger.g0.v1(z40Var.f52219f.f37446r);
                    return;
                }
                return;
            case 15:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(((g50) this.f45925b).f45980c);
                    return;
                }
                return;
            case 16:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(((p50) this.f45925b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 17:
                c60 c60Var = (c60) this.f45925b;
                if (i7 == 1 && c60.b0(c60Var).F) {
                    org.telegram.messenger.g0.v1(c60.c0(c60Var).getSearchField());
                    return;
                }
                return;
            case 18:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(((LanguageSelectActivity) this.f45925b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 20:
                return;
            case 21:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(((tg0) this.f45925b).T1.getEditText());
                    return;
                }
                return;
            case 22:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(((NotificationsCustomSettingsActivity) this.f45925b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 23:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(((an0) this.f45925b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 24:
                return;
            case 25:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.f45925b;
                if (i7 == 0) {
                    lVar = ((org.telegram.ui.ActionBar.f2) premiumPreviewFragment).actionBar;
                    int L2 = org.telegram.messenger.g0.L(16.0f) + lVar.getBottom();
                    if (premiumPreviewFragment.f41613f0 > 0.5f) {
                        premiumPreviewFragment.f41603a.w0(0, premiumPreviewFragment.f41608c0 - L2, null);
                        return;
                    }
                    if (premiumPreviewFragment.f41603a.getLayoutManager() != null) {
                        view3 = premiumPreviewFragment.f41603a.getLayoutManager().m(0);
                    } else {
                        view3 = null;
                    }
                    if (view3 != null && view3.getTop() < 0) {
                        premiumPreviewFragment.f41603a.w0(0, view3.getTop(), null);
                        return;
                    }
                    return;
                }
                return;
            case 29:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(((uy0) this.f45925b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i7, int i10) {
        ez ezVar;
        org.telegram.ui.Cells.f3 f3Var;
        int i11;
        dh.g gVar;
        int abs;
        v4.d1 T;
        org.telegram.ui.Components.y20 y20Var;
        dh.g gVar2;
        int i12 = this.f45924a;
        boolean z9 = false;
        boolean z10 = false;
        int i13 = 0;
        boolean z11 = false;
        r4 = false;
        boolean z12 = false;
        Object obj = this.f45925b;
        switch (i12) {
            case 0:
                k3 k3Var = (k3) obj;
                if (recyclerView.getChildCount() != 0) {
                    recyclerView.invalidate();
                    k3Var.L.P0.G();
                    g4 g4Var = k3Var.L;
                    t3 t3Var = g4Var.K;
                    if (t3Var != null) {
                        t3Var.f50090c.invalidate();
                    } else {
                        ArticleViewer$WindowView articleViewer$WindowView = g4Var.f45957f0;
                        if (articleViewer$WindowView != null) {
                            articleViewer$WindowView.invalidate();
                        }
                    }
                    k3Var.L.d0();
                    g4 g4Var2 = k3Var.L;
                    t3 t3Var2 = g4Var2.K;
                    if (t3Var2 == null || t3Var2.F) {
                        g4Var2.V(g4Var2.J0 - i10);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                o oVar = (o) obj;
                if (!oVar.I && !oVar.f48345r && oVar.d.N0() > oVar.E - 2) {
                    oVar.b0();
                    return;
                }
                return;
            case 2:
                g4 g4Var3 = (g4) obj;
                if (g4Var3.f45960i0.f51108x.I1) {
                    org.telegram.messenger.g0.v1(g4Var3.f45959h0.f51124b0);
                    return;
                }
                return;
            case 3:
                y6 y6Var = (y6) obj;
                if (y6Var.f51911b.canScrollVertically(-1) || y6.f0(y6Var).u()) {
                    z9 = true;
                }
                te.a aVar = y6Var.S;
                if (aVar != null) {
                    aVar.a(z9, true);
                    return;
                }
                return;
            case 4:
                ((h8) obj).v0();
                return;
            case 5:
                mb mbVar = (mb) obj;
                mbVar.f47901w.invalidate();
                if (i10 != 0 && mbVar.S && !mbVar.Q && mbVar.M.getTag() == null) {
                    AnimatorSet animatorSet = mbVar.R;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                    }
                    mbVar.M.setTag(1);
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    mbVar.R = animatorSet2;
                    animatorSet2.setDuration(150L);
                    mbVar.R.playTogether(ObjectAnimator.ofFloat(mbVar.M, "alpha", 1.0f));
                    mbVar.R.addListener(new va(this, 0));
                    mbVar.R.start();
                }
                mbVar.T0(true);
                mbVar.h1();
                return;
            case 6:
            case 7:
            case 9:
            case 15:
            case 16:
            case 17:
            case 18:
            case 21:
            default:
                return;
            case 8:
                return;
            case 10:
                zt ztVar = (zt) obj;
                org.telegram.ui.Components.ga gaVar = ztVar.f35907t1;
                if (gaVar != null) {
                    org.telegram.ui.Components.ya0 ya0Var = gaVar.f40903h0;
                    if (ya0Var != null && ya0Var.getTop() == gaVar.f40905j0) {
                        z12 = true;
                    }
                    ztVar.f35909v1 = !z12;
                    gaVar.invalidate();
                    return;
                }
                return;
            case 11:
                jz jzVar = (jz) obj;
                if (jzVar.f47108a.I1 && (ezVar = jzVar.K) != null && (f3Var = ezVar.f29267b) != null) {
                    if (f3Var.f35436e) {
                        f3Var.k(true);
                        return;
                    } else {
                        f3Var.d();
                        return;
                    }
                }
                return;
            case 12:
                ((r00) obj).f49194s.invalidate();
                return;
            case 13:
                m40 m40Var = (m40) obj;
                if (m40Var.f47788z0 == null) {
                    m40Var.f47788z0 = (kc) m40Var.F0(m40Var.Z);
                }
                int measuredHeight = m40Var.f47788z0.getMeasuredHeight() - m40.n1(m40Var).getMeasuredHeight();
                float top = m40Var.f47788z0.getTop() * (-1);
                float f10 = measuredHeight;
                float max = Math.max(Math.min(1.0f, top / f10), 0.0f);
                m40Var.A0 = max;
                float min = Math.min(max * 2.0f, 1.0f);
                float min2 = Math.min(Math.max(m40Var.A0 - 0.45f, 0.0f) * 2.0f, 1.0f);
                m40Var.f47788z0.f47252b.setAlpha(org.telegram.messenger.g0.T1(1.0f, 0.0f, min));
                m40Var.f47788z0.f47255f.setAlpha(org.telegram.messenger.g0.T1(1.0f, 0.0f, min));
                m40Var.f47788z0.f47253c.setAlpha(org.telegram.messenger.g0.T1(0.0f, 1.0f, min2));
                if (m40Var.A0 >= 1.0f) {
                    m40Var.f47788z0.setTranslationY(top - f10);
                    return;
                } else {
                    m40Var.f47788z0.setTranslationY(0.0f);
                    return;
                }
            case 14:
                z40 z40Var = (z40) obj;
                int L0 = z40Var.f52232r.L0();
                View childAt = z40Var.f52227n.getChildAt(0);
                if (childAt != null) {
                    i11 = childAt.getTop();
                } else {
                    i11 = 0;
                }
                if (L0 != 0 || i11 < z40Var.f52227n.getPaddingTop()) {
                    z11 = true;
                }
                ((te.a) z40Var.f52217e.f12600c).a(z11, true);
                if (Build.VERSION.SDK_INT >= 31 && (gVar = z40Var.f52230p0) != null) {
                    gVar.f(i7, i10);
                    z40Var.j0();
                    return;
                }
                return;
            case 19:
                ((eg0) obj).J.invalidate();
                return;
            case 20:
                mg0 mg0Var = (mg0) obj;
                int L02 = mg0Var.h.L0();
                if (L02 != -1) {
                    i13 = Math.abs(mg0Var.h.N0() - L02) + 1;
                }
                int b10 = recyclerView.getAdapter().b();
                if (i13 > 0 && !mg0Var.V && !mg0Var.E && !mg0Var.f47968y.isEmpty() && L02 + i13 >= b10 - 5 && mg0Var.D) {
                    mg0Var.h0();
                    return;
                }
                return;
            case 22:
                return;
            case 23:
                an0 an0Var = (an0) obj;
                if (an0Var.J == null) {
                    int L03 = an0Var.M.L0();
                    if (L03 == -1) {
                        abs = 0;
                    } else {
                        abs = Math.abs(an0Var.M.N0() - L03) + 1;
                    }
                    if (abs > 0 && L03 + abs > an0Var.M.B() - 2 && !an0Var.f43770r && !an0Var.f43772s) {
                        if (an0Var.f43748a == 1) {
                            z10 = true;
                        }
                        an0Var.i0(an0Var.f43777w, an0Var.f43779x, z10, true);
                        return;
                    }
                    return;
                }
                return;
            case 24:
                sr0 sr0Var = (sr0) obj;
                if (i10 != 0 && (y20Var = sr0Var.h) != null) {
                    y20Var.a();
                }
                org.telegram.ui.Components.ow0 ow0Var = sr0Var.Q;
                if (ow0Var != null && ow0Var.f36714s) {
                    org.telegram.ui.Components.mw0 delegate = ow0Var.getDelegate();
                    if (delegate instanceof org.telegram.ui.Cells.a6) {
                        g61 g61Var = sr0Var.f49923c;
                        View F = g61Var.F((org.telegram.ui.Cells.a6) delegate);
                        if (F == null) {
                            T = null;
                        } else {
                            T = g61Var.T(F);
                        }
                        if (T != null) {
                            View view = T.f57052a;
                            if (sr0Var.Q.getDirection() == 0) {
                                sr0Var.Q.setTranslationY((view.getY() - org.telegram.messenger.g0.L(166.0f)) + view.getMeasuredHeight());
                            } else {
                                sr0Var.Q.setTranslationY(view.getY());
                            }
                            v4.b0 b0Var = sr0Var.d;
                            if (!b0Var.f57141c.e(view) || !b0Var.d.e(view)) {
                                sr0Var.Q.f();
                                return;
                            }
                            return;
                        }
                        sr0Var.Q.f();
                        return;
                    }
                    sr0Var.Q.f();
                    return;
                }
                return;
            case 25:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) obj;
                premiumPreviewFragment.f41609d0.invalidate();
                if (Build.VERSION.SDK_INT >= 31 && (gVar2 = premiumPreviewFragment.f41633w0) != null) {
                    gVar2.f(i7, i10);
                    premiumPreviewFragment.o0();
                    return;
                }
                return;
            case 26:
                PrivacyControlActivity.w0((PrivacyControlActivity) obj);
                return;
            case 27:
                vt0 vt0Var = (vt0) obj;
                if (!vt0Var.getMessagesController().I0) {
                    int abs2 = Math.abs(vt0Var.f50789b.N0() - vt0Var.f50789b.L0()) + 1;
                    int b11 = recyclerView.getAdapter().b();
                    if (abs2 > 0 && vt0Var.f50789b.N0() >= b11 - 10) {
                        vt0Var.getMessagesController().F0(false);
                        return;
                    }
                    return;
                }
                return;
            case 28:
                ry0 ry0Var = (ry0) obj;
                ry0Var.f49598e.invalidate();
                sy0 sy0Var = ry0Var.f49603w;
                int i14 = sy0.f49991v1;
                sy0Var.f28672b.invalidate();
                return;
        }
    }

    public g3(mb mbVar) {
        this.f45924a = 5;
        this.f45925b = mbVar;
        org.telegram.messenger.g0.L(100.0f);
    }

    private final void c(RecyclerView recyclerView, int i7) {
    }

    private final void d(RecyclerView recyclerView, int i7) {
    }

    private final void e(RecyclerView recyclerView, int i7, int i10) {
    }

    private final void f(RecyclerView recyclerView, int i7, int i10) {
    }
}
