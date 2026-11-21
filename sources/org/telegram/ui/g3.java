package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class g3 extends v4.u0 {
    public final int f47922a;
    public final Object f47923b;

    public g3(Object obj, int i7) {
        this.f47922a = i7;
        this.f47923b = obj;
    }

    @Override
    public void a(RecyclerView recyclerView, int i7) {
        View view;
        View view2;
        View m10;
        org.telegram.ui.ActionBar.k kVar;
        View view3;
        switch (this.f47922a) {
            case 0:
                if (i7 == 0) {
                    ((k3) this.f47923b).M.Q0.V();
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
                lb lbVar = (lb) this.f47923b;
                if (i7 == 1) {
                    lbVar.T = true;
                    lbVar.W = true;
                    return;
                } else if (i7 == 0) {
                    lbVar.T = false;
                    lbVar.W = false;
                    lbVar.Y0(true);
                    return;
                } else {
                    return;
                }
            case 6:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(((bn) this.f47923b).f46107m1);
                    return;
                }
                return;
            case 7:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(((np) this.f47923b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 8:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(((rq) this.f47923b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 9:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(((us) this.f47923b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 12:
                s00 s00Var = (s00) this.f47923b;
                if (i7 == 0) {
                    int L = org.telegram.messenger.g0.L(16.0f) + s00Var.p0().getBottom();
                    if (s00Var.f51805w > 0.5f) {
                        s00Var.f51799c.w0(0, s00Var.f51803r - L, null);
                        return;
                    }
                    if (s00Var.f51799c.getLayoutManager() != null) {
                        view = s00Var.f51799c.getLayoutManager().m(0);
                    } else {
                        view = null;
                    }
                    if (view != null) {
                        if (s00Var.q0() + view.getTop() < 0.0f) {
                            s00Var.f51799c.w0(0, Math.round(s00Var.q0() + view.getTop()), null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 13:
                m40 m40Var = (m40) this.f47923b;
                if (i7 == 0) {
                    float f10 = m40Var.B0;
                    if (f10 >= 0.5f && f10 < 1.0f) {
                        int bottom = m40.o1(m40Var).getBottom();
                        v4.p0 layoutManager = m40Var.N.getLayoutManager();
                        if (layoutManager != null && (m10 = layoutManager.m(0)) != null) {
                            m40Var.N.w0(0, m10.getBottom() - bottom, null);
                            return;
                        }
                        return;
                    } else if (f10 < 0.5f) {
                        if (m40Var.N.getLayoutManager() != null) {
                            view2 = m40Var.N.getLayoutManager().m(0);
                        } else {
                            view2 = null;
                        }
                        if (view2 != null && view2.getTop() < 0) {
                            m40Var.N.w0(0, view2.getTop(), null);
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 14:
                z40 z40Var = (z40) this.f47923b;
                if (i7 == 1) {
                    z40Var.f54409f.f34647r.m();
                    org.telegram.messenger.g0.v1(z40Var.f54409f.f34647r);
                    return;
                }
                return;
            case 15:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(((f50) this.f47923b).f47591c);
                    return;
                }
                return;
            case 16:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(((n50) this.f47923b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 17:
                a60 a60Var = (a60) this.f47923b;
                if (i7 == 1 && a60.b0(a60Var).G) {
                    org.telegram.messenger.g0.v1(a60.c0(a60Var).getSearchField());
                    return;
                }
                return;
            case 18:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(((LanguageSelectActivity) this.f47923b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 20:
                return;
            case 21:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(((vg0) this.f47923b).U1.getEditText());
                    return;
                }
                return;
            case 22:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(((NotificationsCustomSettingsActivity) this.f47923b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 23:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(((cn0) this.f47923b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 24:
                return;
            case 25:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.f47923b;
                if (i7 == 0) {
                    kVar = ((org.telegram.ui.ActionBar.g2) premiumPreviewFragment).actionBar;
                    int L2 = org.telegram.messenger.g0.L(16.0f) + kVar.getBottom();
                    if (premiumPreviewFragment.f43472g0 > 0.5f) {
                        premiumPreviewFragment.f43461a.w0(0, premiumPreviewFragment.f43467d0 - L2, null);
                        return;
                    }
                    if (premiumPreviewFragment.f43461a.getLayoutManager() != null) {
                        view3 = premiumPreviewFragment.f43461a.getLayoutManager().m(0);
                    } else {
                        view3 = null;
                    }
                    if (view3 != null && view3.getTop() < 0) {
                        premiumPreviewFragment.f43461a.w0(0, view3.getTop(), null);
                        return;
                    }
                    return;
                }
                return;
            case 29:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(((sy0) this.f47923b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i7, int i10) {
        fz fzVar;
        org.telegram.ui.Cells.g3 g3Var;
        int i11;
        dh.g gVar;
        int abs;
        v4.f1 T;
        org.telegram.ui.Components.m30 m30Var;
        dh.g gVar2;
        int i12 = this.f47922a;
        boolean z10 = false;
        boolean z11 = false;
        int i13 = 0;
        boolean z12 = false;
        r4 = false;
        boolean z13 = false;
        Object obj = this.f47923b;
        switch (i12) {
            case 0:
                k3 k3Var = (k3) obj;
                if (recyclerView.getChildCount() != 0) {
                    recyclerView.invalidate();
                    k3Var.M.Q0.G();
                    g4 g4Var = k3Var.M;
                    t3 t3Var = g4Var.L;
                    if (t3Var != null) {
                        t3Var.f52190c.invalidate();
                    } else {
                        ArticleViewer$WindowView articleViewer$WindowView = g4Var.f47955g0;
                        if (articleViewer$WindowView != null) {
                            articleViewer$WindowView.invalidate();
                        }
                    }
                    k3Var.M.d0();
                    g4 g4Var2 = k3Var.M;
                    t3 t3Var2 = g4Var2.L;
                    if (t3Var2 == null || t3Var2.G) {
                        g4Var2.V(g4Var2.K0 - i10);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                o oVar = (o) obj;
                if (!oVar.J && !oVar.f50379r && oVar.d.N0() > oVar.F - 2) {
                    oVar.b0();
                    return;
                }
                return;
            case 2:
                g4 g4Var3 = (g4) obj;
                if (g4Var3.f47958j0.f53215x.J1) {
                    org.telegram.messenger.g0.v1(g4Var3.f47957i0.f53175c0);
                    return;
                }
                return;
            case 3:
                x6 x6Var = (x6) obj;
                if (x6Var.f53646b.canScrollVertically(-1) || x6.f0(x6Var).x()) {
                    z10 = true;
                }
                te.a aVar = x6Var.T;
                if (aVar != null) {
                    aVar.a(z10, true);
                    return;
                }
                return;
            case 4:
                ((i8) obj).v0();
                return;
            case 5:
                lb lbVar = (lb) obj;
                lbVar.f49568w.invalidate();
                if (i10 != 0 && lbVar.T && !lbVar.R && lbVar.N.getTag() == null) {
                    AnimatorSet animatorSet = lbVar.S;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                    }
                    lbVar.N.setTag(1);
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    lbVar.S = animatorSet2;
                    animatorSet2.setDuration(150L);
                    lbVar.S.playTogether(ObjectAnimator.ofFloat(lbVar.N, "alpha", 1.0f));
                    lbVar.S.addListener(new org.telegram.ui.Cells.y9(this, 1));
                    lbVar.S.start();
                }
                lbVar.T0(true);
                lbVar.h1();
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
                au auVar = (au) obj;
                org.telegram.ui.Components.la laVar = auVar.f39545u1;
                if (laVar != null) {
                    org.telegram.ui.Components.kb0 kb0Var = laVar.f37151i0;
                    if (kb0Var != null && kb0Var.getTop() == laVar.f37153k0) {
                        z13 = true;
                    }
                    auVar.f39547w1 = !z13;
                    laVar.invalidate();
                    return;
                }
                return;
            case 11:
                kz kzVar = (kz) obj;
                if (kzVar.f49422a.J1 && (fzVar = kzVar.L) != null && (g3Var = fzVar.f30828b) != null) {
                    if (g3Var.f42545e) {
                        g3Var.k(true);
                        return;
                    } else {
                        g3Var.d();
                        return;
                    }
                }
                return;
            case 12:
                ((s00) obj).f51804s.invalidate();
                return;
            case 13:
                m40 m40Var = (m40) obj;
                if (m40Var.A0 == null) {
                    m40Var.A0 = (jc) m40Var.F0(m40Var.f51206a0);
                }
                int measuredHeight = m40Var.A0.getMeasuredHeight() - m40.n1(m40Var).getMeasuredHeight();
                float top = m40Var.A0.getTop() * (-1);
                float f10 = measuredHeight;
                float max = Math.max(Math.min(1.0f, top / f10), 0.0f);
                m40Var.B0 = max;
                float min = Math.min(max * 2.0f, 1.0f);
                float min2 = Math.min(Math.max(m40Var.B0 - 0.45f, 0.0f) * 2.0f, 1.0f);
                m40Var.A0.f48959b.setAlpha(org.telegram.messenger.g0.T1(1.0f, 0.0f, min));
                m40Var.A0.f48962f.setAlpha(org.telegram.messenger.g0.T1(1.0f, 0.0f, min));
                m40Var.A0.f48960c.setAlpha(org.telegram.messenger.g0.T1(0.0f, 1.0f, min2));
                if (m40Var.B0 >= 1.0f) {
                    m40Var.A0.setTranslationY(top - f10);
                    return;
                } else {
                    m40Var.A0.setTranslationY(0.0f);
                    return;
                }
            case 14:
                z40 z40Var = (z40) obj;
                int L0 = z40Var.f54422r.L0();
                View childAt = z40Var.f54417n.getChildAt(0);
                if (childAt != null) {
                    i11 = childAt.getTop();
                } else {
                    i11 = 0;
                }
                if (L0 != 0 || i11 < z40Var.f54417n.getPaddingTop()) {
                    z12 = true;
                }
                ((te.a) z40Var.f54407e.f15003c).a(z12, true);
                if (Build.VERSION.SDK_INT >= 31 && (gVar = z40Var.f54421q0) != null) {
                    gVar.f(i7, i10);
                    z40Var.j0();
                    return;
                }
                return;
            case 19:
                ((eg0) obj).K.invalidate();
                return;
            case 20:
                og0 og0Var = (og0) obj;
                int L02 = og0Var.h.L0();
                if (L02 != -1) {
                    i13 = Math.abs(og0Var.h.N0() - L02) + 1;
                }
                int b10 = recyclerView.getAdapter().b();
                if (i13 > 0 && !og0Var.W && !og0Var.F && !og0Var.f50594y.isEmpty() && L02 + i13 >= b10 - 5 && og0Var.E) {
                    og0Var.h0();
                    return;
                }
                return;
            case 22:
                return;
            case 23:
                cn0 cn0Var = (cn0) obj;
                if (cn0Var.K == null) {
                    int L03 = cn0Var.N.L0();
                    if (L03 == -1) {
                        abs = 0;
                    } else {
                        abs = Math.abs(cn0Var.N.N0() - L03) + 1;
                    }
                    if (abs > 0 && L03 + abs > cn0Var.N.B() - 2 && !cn0Var.f46615r && !cn0Var.f46617s) {
                        if (cn0Var.f46593a == 1) {
                            z11 = true;
                        }
                        cn0Var.i0(cn0Var.f46622w, cn0Var.f46624x, z11, true);
                        return;
                    }
                    return;
                }
                return;
            case 24:
                pr0 pr0Var = (pr0) obj;
                if (i10 != 0 && (m30Var = pr0Var.h) != null) {
                    m30Var.a();
                }
                org.telegram.ui.Components.ax0 ax0Var = pr0Var.R;
                if (ax0Var != null && ax0Var.f33653s) {
                    org.telegram.ui.Components.yw0 delegate = ax0Var.getDelegate();
                    if (delegate instanceof org.telegram.ui.Cells.b6) {
                        f61 f61Var = pr0Var.f50933c;
                        View F = f61Var.F((org.telegram.ui.Cells.b6) delegate);
                        if (F == null) {
                            T = null;
                        } else {
                            T = f61Var.T(F);
                        }
                        if (T != null) {
                            View view = T.f59161a;
                            if (pr0Var.R.getDirection() == 0) {
                                pr0Var.R.setTranslationY((view.getY() - org.telegram.messenger.g0.L(166.0f)) + view.getMeasuredHeight());
                            } else {
                                pr0Var.R.setTranslationY(view.getY());
                            }
                            v4.c0 c0Var = pr0Var.d;
                            if (!c0Var.f59247c.e(view) || !c0Var.d.e(view)) {
                                pr0Var.R.f();
                                return;
                            }
                            return;
                        }
                        pr0Var.R.f();
                        return;
                    }
                    pr0Var.R.f();
                    return;
                }
                return;
            case 25:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) obj;
                premiumPreviewFragment.f43469e0.invalidate();
                if (Build.VERSION.SDK_INT >= 31 && (gVar2 = premiumPreviewFragment.f43493x0) != null) {
                    gVar2.f(i7, i10);
                    premiumPreviewFragment.o0();
                    return;
                }
                return;
            case 26:
                PrivacyControlActivity.w0((PrivacyControlActivity) obj);
                return;
            case 27:
                st0 st0Var = (st0) obj;
                if (!st0Var.getMessagesController().J0) {
                    int abs2 = Math.abs(st0Var.f52123b.N0() - st0Var.f52123b.L0()) + 1;
                    int b11 = recyclerView.getAdapter().b();
                    if (abs2 > 0 && st0Var.f52123b.N0() >= b11 - 10) {
                        st0Var.getMessagesController().H0(false);
                        return;
                    }
                    return;
                }
                return;
            case 28:
                py0 py0Var = (py0) obj;
                py0Var.f51005e.invalidate();
                qy0 qy0Var = py0Var.f51010w;
                int i14 = qy0.f51390w1;
                qy0Var.f30173b.invalidate();
                return;
        }
    }

    public g3(lb lbVar) {
        this.f47922a = 5;
        this.f47923b = lbVar;
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
