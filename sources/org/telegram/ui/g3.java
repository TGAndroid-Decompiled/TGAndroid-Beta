package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class g3 extends v4.u0 {
    public final int f48037a;
    public final Object f48038b;

    public g3(Object obj, int i7) {
        this.f48037a = i7;
        this.f48038b = obj;
    }

    @Override
    public void a(RecyclerView recyclerView, int i7) {
        View view;
        View view2;
        View m10;
        org.telegram.ui.ActionBar.k kVar;
        View view3;
        switch (this.f48037a) {
            case 0:
                if (i7 == 0) {
                    ((k3) this.f48038b).M.Q0.V();
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
                lb lbVar = (lb) this.f48038b;
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
                    org.telegram.messenger.g0.v1(((bn) this.f48038b).f46279m1);
                    return;
                }
                return;
            case 7:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(((np) this.f48038b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 8:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(((rq) this.f48038b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 9:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(((ts) this.f48038b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 12:
                r00 r00Var = (r00) this.f48038b;
                if (i7 == 0) {
                    int L = org.telegram.messenger.g0.L(16.0f) + r00Var.p0().getBottom();
                    if (r00Var.f51575w > 0.5f) {
                        r00Var.f51569c.w0(0, r00Var.f51573r - L, null);
                        return;
                    }
                    if (r00Var.f51569c.getLayoutManager() != null) {
                        view = r00Var.f51569c.getLayoutManager().m(0);
                    } else {
                        view = null;
                    }
                    if (view != null) {
                        if (r00Var.q0() + view.getTop() < 0.0f) {
                            r00Var.f51569c.w0(0, Math.round(r00Var.q0() + view.getTop()), null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 13:
                l40 l40Var = (l40) this.f48038b;
                if (i7 == 0) {
                    float f10 = l40Var.B0;
                    if (f10 >= 0.5f && f10 < 1.0f) {
                        int bottom = l40.o1(l40Var).getBottom();
                        v4.p0 layoutManager = l40Var.N.getLayoutManager();
                        if (layoutManager != null && (m10 = layoutManager.m(0)) != null) {
                            l40Var.N.w0(0, m10.getBottom() - bottom, null);
                            return;
                        }
                        return;
                    } else if (f10 < 0.5f) {
                        if (l40Var.N.getLayoutManager() != null) {
                            view2 = l40Var.N.getLayoutManager().m(0);
                        } else {
                            view2 = null;
                        }
                        if (view2 != null && view2.getTop() < 0) {
                            l40Var.N.w0(0, view2.getTop(), null);
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 14:
                y40 y40Var = (y40) this.f48038b;
                if (i7 == 1) {
                    y40Var.f54199f.f33883r.m();
                    org.telegram.messenger.g0.v1(y40Var.f54199f.f33883r);
                    return;
                }
                return;
            case 15:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(((e50) this.f48038b).f47438c);
                    return;
                }
                return;
            case 16:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(((n50) this.f48038b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 17:
                a60 a60Var = (a60) this.f48038b;
                if (i7 == 1 && a60.b0(a60Var).G) {
                    org.telegram.messenger.g0.v1(a60.c0(a60Var).getSearchField());
                    return;
                }
                return;
            case 18:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(((LanguageSelectActivity) this.f48038b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 20:
                return;
            case 21:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(((tg0) this.f48038b).U1.getEditText());
                    return;
                }
                return;
            case 22:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(((NotificationsCustomSettingsActivity) this.f48038b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 23:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(((an0) this.f48038b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 24:
                return;
            case 25:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.f48038b;
                if (i7 == 0) {
                    kVar = ((org.telegram.ui.ActionBar.g2) premiumPreviewFragment).actionBar;
                    int L2 = org.telegram.messenger.g0.L(16.0f) + kVar.getBottom();
                    if (premiumPreviewFragment.f43557g0 > 0.5f) {
                        premiumPreviewFragment.f43546a.w0(0, premiumPreviewFragment.f43552d0 - L2, null);
                        return;
                    }
                    if (premiumPreviewFragment.f43546a.getLayoutManager() != null) {
                        view3 = premiumPreviewFragment.f43546a.getLayoutManager().m(0);
                    } else {
                        view3 = null;
                    }
                    if (view3 != null && view3.getTop() < 0) {
                        premiumPreviewFragment.f43546a.w0(0, view3.getTop(), null);
                        return;
                    }
                    return;
                }
                return;
            case 29:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(((ry0) this.f48038b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i7, int i10) {
        ez ezVar;
        org.telegram.ui.Cells.g3 g3Var;
        int i11;
        dh.g gVar;
        int abs;
        v4.f1 T;
        org.telegram.ui.Components.j30 j30Var;
        dh.g gVar2;
        int i12 = this.f48037a;
        boolean z10 = false;
        boolean z11 = false;
        int i13 = 0;
        boolean z12 = false;
        r4 = false;
        boolean z13 = false;
        Object obj = this.f48038b;
        switch (i12) {
            case 0:
                k3 k3Var = (k3) obj;
                if (recyclerView.getChildCount() != 0) {
                    recyclerView.invalidate();
                    k3Var.M.Q0.G();
                    g4 g4Var = k3Var.M;
                    t3 t3Var = g4Var.L;
                    if (t3Var != null) {
                        t3Var.f52222c.invalidate();
                    } else {
                        ArticleViewer$WindowView articleViewer$WindowView = g4Var.f48070g0;
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
                if (!oVar.J && !oVar.f50467r && oVar.d.N0() > oVar.F - 2) {
                    oVar.b0();
                    return;
                }
                return;
            case 2:
                g4 g4Var3 = (g4) obj;
                if (g4Var3.f48073j0.f53454x.J1) {
                    org.telegram.messenger.g0.v1(g4Var3.f48072i0.f53414c0);
                    return;
                }
                return;
            case 3:
                y6 y6Var = (y6) obj;
                if (y6Var.f54242b.canScrollVertically(-1) || y6.f0(y6Var).x()) {
                    z10 = true;
                }
                te.a aVar = y6Var.T;
                if (aVar != null) {
                    aVar.a(z10, true);
                    return;
                }
                return;
            case 4:
                ((j8) obj).v0();
                return;
            case 5:
                lb lbVar = (lb) obj;
                lbVar.f49707w.invalidate();
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
                    lbVar.S.addListener(new org.telegram.ui.Cells.x9(this, 1));
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
                zt ztVar = (zt) obj;
                org.telegram.ui.Components.ka kaVar = ztVar.f39252u1;
                if (kaVar != null) {
                    org.telegram.ui.Components.hb0 hb0Var = kaVar.f35976i0;
                    if (hb0Var != null && hb0Var.getTop() == kaVar.f35978k0) {
                        z13 = true;
                    }
                    ztVar.f39254w1 = !z13;
                    kaVar.invalidate();
                    return;
                }
                return;
            case 11:
                jz jzVar = (jz) obj;
                if (jzVar.f49248a.J1 && (ezVar = jzVar.L) != null && (g3Var = ezVar.f30887b) != null) {
                    if (g3Var.f41722e) {
                        g3Var.k(true);
                        return;
                    } else {
                        g3Var.d();
                        return;
                    }
                }
                return;
            case 12:
                ((r00) obj).f51574s.invalidate();
                return;
            case 13:
                l40 l40Var = (l40) obj;
                if (l40Var.A0 == null) {
                    l40Var.A0 = (jc) l40Var.F0(l40Var.f51402a0);
                }
                int measuredHeight = l40Var.A0.getMeasuredHeight() - l40.n1(l40Var).getMeasuredHeight();
                float top = l40Var.A0.getTop() * (-1);
                float f10 = measuredHeight;
                float max = Math.max(Math.min(1.0f, top / f10), 0.0f);
                l40Var.B0 = max;
                float min = Math.min(max * 2.0f, 1.0f);
                float min2 = Math.min(Math.max(l40Var.B0 - 0.45f, 0.0f) * 2.0f, 1.0f);
                l40Var.A0.f49086b.setAlpha(org.telegram.messenger.g0.T1(1.0f, 0.0f, min));
                l40Var.A0.f49089f.setAlpha(org.telegram.messenger.g0.T1(1.0f, 0.0f, min));
                l40Var.A0.f49087c.setAlpha(org.telegram.messenger.g0.T1(0.0f, 1.0f, min2));
                if (l40Var.B0 >= 1.0f) {
                    l40Var.A0.setTranslationY(top - f10);
                    return;
                } else {
                    l40Var.A0.setTranslationY(0.0f);
                    return;
                }
            case 14:
                y40 y40Var = (y40) obj;
                int L0 = y40Var.f54212r.L0();
                View childAt = y40Var.f54207n.getChildAt(0);
                if (childAt != null) {
                    i11 = childAt.getTop();
                } else {
                    i11 = 0;
                }
                if (L0 != 0 || i11 < y40Var.f54207n.getPaddingTop()) {
                    z12 = true;
                }
                ((te.a) y40Var.f54197e.f15678c).a(z12, true);
                if (Build.VERSION.SDK_INT >= 31 && (gVar = y40Var.f54211q0) != null) {
                    gVar.f(i7, i10);
                    y40Var.j0();
                    return;
                }
                return;
            case 19:
                ((dg0) obj).K.invalidate();
                return;
            case 20:
                mg0 mg0Var = (mg0) obj;
                int L02 = mg0Var.h.L0();
                if (L02 != -1) {
                    i13 = Math.abs(mg0Var.h.N0() - L02) + 1;
                }
                int b10 = recyclerView.getAdapter().b();
                if (i13 > 0 && !mg0Var.W && !mg0Var.F && !mg0Var.f50070y.isEmpty() && L02 + i13 >= b10 - 5 && mg0Var.E) {
                    mg0Var.h0();
                    return;
                }
                return;
            case 22:
                return;
            case 23:
                an0 an0Var = (an0) obj;
                if (an0Var.K == null) {
                    int L03 = an0Var.N.L0();
                    if (L03 == -1) {
                        abs = 0;
                    } else {
                        abs = Math.abs(an0Var.N.N0() - L03) + 1;
                    }
                    if (abs > 0 && L03 + abs > an0Var.N.B() - 2 && !an0Var.f45765r && !an0Var.f45767s) {
                        if (an0Var.f45743a == 1) {
                            z11 = true;
                        }
                        an0Var.i0(an0Var.f45772w, an0Var.f45774x, z11, true);
                        return;
                    }
                    return;
                }
                return;
            case 24:
                pr0 pr0Var = (pr0) obj;
                if (i10 != 0 && (j30Var = pr0Var.h) != null) {
                    j30Var.a();
                }
                org.telegram.ui.Components.zw0 zw0Var = pr0Var.R;
                if (zw0Var != null && zw0Var.f43068s) {
                    org.telegram.ui.Components.xw0 delegate = zw0Var.getDelegate();
                    if (delegate instanceof org.telegram.ui.Cells.a6) {
                        d61 d61Var = pr0Var.f51103c;
                        View F = d61Var.F((org.telegram.ui.Cells.a6) delegate);
                        if (F == null) {
                            T = null;
                        } else {
                            T = d61Var.T(F);
                        }
                        if (T != null) {
                            View view = T.f59245a;
                            if (pr0Var.R.getDirection() == 0) {
                                pr0Var.R.setTranslationY((view.getY() - org.telegram.messenger.g0.L(166.0f)) + view.getMeasuredHeight());
                            } else {
                                pr0Var.R.setTranslationY(view.getY());
                            }
                            v4.c0 c0Var = pr0Var.d;
                            if (!c0Var.f59333c.e(view) || !c0Var.d.e(view)) {
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
                premiumPreviewFragment.f43554e0.invalidate();
                if (Build.VERSION.SDK_INT >= 31 && (gVar2 = premiumPreviewFragment.f43578x0) != null) {
                    gVar2.f(i7, i10);
                    premiumPreviewFragment.o0();
                    return;
                }
                return;
            case 26:
                PrivacyControlActivity.w0((PrivacyControlActivity) obj);
                return;
            case 27:
                rt0 rt0Var = (rt0) obj;
                if (!rt0Var.getMessagesController().J0) {
                    int abs2 = Math.abs(rt0Var.f51884b.N0() - rt0Var.f51884b.L0()) + 1;
                    int b11 = recyclerView.getAdapter().b();
                    if (abs2 > 0 && rt0Var.f51884b.N0() >= b11 - 10) {
                        rt0Var.getMessagesController().H0(false);
                        return;
                    }
                    return;
                }
                return;
            case 28:
                oy0 oy0Var = (oy0) obj;
                oy0Var.f50788e.invalidate();
                py0 py0Var = oy0Var.f50793w;
                int i14 = py0.f51187w1;
                py0Var.f30226b.invalidate();
                return;
        }
    }

    public g3(lb lbVar) {
        this.f48037a = 5;
        this.f48038b = lbVar;
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
