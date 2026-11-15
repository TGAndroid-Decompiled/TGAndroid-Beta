package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class g3 extends v4.t0 {
    public final int f47287a;
    public final Object f47288b;

    public g3(Object obj, int i7) {
        this.f47287a = i7;
        this.f47288b = obj;
    }

    @Override
    public void a(RecyclerView recyclerView, int i7) {
        View view;
        View view2;
        View m10;
        org.telegram.ui.ActionBar.k kVar;
        View view3;
        switch (this.f47287a) {
            case 0:
                if (i7 == 0) {
                    ((k3) this.f47288b).M.Q0.V();
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
                lb lbVar = (lb) this.f47288b;
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
                    org.telegram.messenger.g0.v1(((an) this.f47288b).f45278m1);
                    return;
                }
                return;
            case 7:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(((mp) this.f47288b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 8:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(((qq) this.f47288b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 9:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(((ts) this.f47288b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 12:
                p00 p00Var = (p00) this.f47288b;
                if (i7 == 0) {
                    int L = org.telegram.messenger.g0.L(16.0f) + p00Var.p0().getBottom();
                    if (p00Var.f50104w > 0.5f) {
                        p00Var.f50098c.w0(0, p00Var.f50102r - L, null);
                        return;
                    }
                    if (p00Var.f50098c.getLayoutManager() != null) {
                        view = p00Var.f50098c.getLayoutManager().m(0);
                    } else {
                        view = null;
                    }
                    if (view != null) {
                        if (p00Var.q0() + view.getTop() < 0.0f) {
                            p00Var.f50098c.w0(0, Math.round(p00Var.q0() + view.getTop()), null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 13:
                j40 j40Var = (j40) this.f47288b;
                if (i7 == 0) {
                    float f10 = j40Var.B0;
                    if (f10 >= 0.5f && f10 < 1.0f) {
                        int bottom = j40.o1(j40Var).getBottom();
                        v4.o0 layoutManager = j40Var.N.getLayoutManager();
                        if (layoutManager != null && (m10 = layoutManager.m(0)) != null) {
                            j40Var.N.w0(0, m10.getBottom() - bottom, null);
                            return;
                        }
                        return;
                    } else if (f10 < 0.5f) {
                        if (j40Var.N.getLayoutManager() != null) {
                            view2 = j40Var.N.getLayoutManager().m(0);
                        } else {
                            view2 = null;
                        }
                        if (view2 != null && view2.getTop() < 0) {
                            j40Var.N.w0(0, view2.getTop(), null);
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 14:
                w40 w40Var = (w40) this.f47288b;
                if (i7 == 1) {
                    w40Var.f52407f.f40202r.m();
                    org.telegram.messenger.g0.v1(w40Var.f52407f.f40202r);
                    return;
                }
                return;
            case 15:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(((c50) this.f47288b).f46019c);
                    return;
                }
                return;
            case 16:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(((l50) this.f47288b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 17:
                y50 y50Var = (y50) this.f47288b;
                if (i7 == 1 && y50.b0(y50Var).G) {
                    org.telegram.messenger.g0.v1(y50.c0(y50Var).getSearchField());
                    return;
                }
                return;
            case 18:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(((LanguageSelectActivity) this.f47288b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 20:
                return;
            case 21:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(((qg0) this.f47288b).U1.getEditText());
                    return;
                }
                return;
            case 22:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(((NotificationsCustomSettingsActivity) this.f47288b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 23:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(((ym0) this.f47288b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 24:
                return;
            case 25:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.f47288b;
                if (i7 == 0) {
                    kVar = ((org.telegram.ui.ActionBar.e2) premiumPreviewFragment).actionBar;
                    int L2 = org.telegram.messenger.g0.L(16.0f) + kVar.getBottom();
                    if (premiumPreviewFragment.f42986g0 > 0.5f) {
                        premiumPreviewFragment.f42975a.w0(0, premiumPreviewFragment.f42981d0 - L2, null);
                        return;
                    }
                    if (premiumPreviewFragment.f42975a.getLayoutManager() != null) {
                        view3 = premiumPreviewFragment.f42975a.getLayoutManager().m(0);
                    } else {
                        view3 = null;
                    }
                    if (view3 != null && view3.getTop() < 0) {
                        premiumPreviewFragment.f42975a.w0(0, view3.getTop(), null);
                        return;
                    }
                    return;
                }
                return;
            case 29:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(((oy0) this.f47288b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i7, int i10) {
        cz czVar;
        org.telegram.ui.Cells.f3 f3Var;
        int i11;
        dh.g gVar;
        int abs;
        v4.e1 T;
        org.telegram.ui.Components.b30 b30Var;
        dh.g gVar2;
        int i12 = this.f47287a;
        boolean z10 = false;
        boolean z11 = false;
        int i13 = 0;
        boolean z12 = false;
        r4 = false;
        boolean z13 = false;
        Object obj = this.f47288b;
        switch (i12) {
            case 0:
                k3 k3Var = (k3) obj;
                if (recyclerView.getChildCount() != 0) {
                    recyclerView.invalidate();
                    k3Var.M.Q0.G();
                    g4 g4Var = k3Var.M;
                    t3 t3Var = g4Var.L;
                    if (t3Var != null) {
                        t3Var.f51334c.invalidate();
                    } else {
                        ArticleViewer$WindowView articleViewer$WindowView = g4Var.f47322g0;
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
                if (!oVar.J && !oVar.f49742r && oVar.d.N0() > oVar.F - 2) {
                    oVar.b0();
                    return;
                }
                return;
            case 2:
                g4 g4Var3 = (g4) obj;
                if (g4Var3.f47325j0.f52689x.J1) {
                    org.telegram.messenger.g0.v1(g4Var3.f47324i0.f52649c0);
                    return;
                }
                return;
            case 3:
                y6 y6Var = (y6) obj;
                if (y6Var.f53436b.canScrollVertically(-1) || y6.f0(y6Var).v()) {
                    z10 = true;
                }
                te.a aVar = y6Var.T;
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
                lbVar.f48958w.invalidate();
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
                    lbVar.S.addListener(new org.telegram.ui.Cells.w9(this, 1));
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
                yt ytVar = (yt) obj;
                org.telegram.ui.Components.da daVar = ytVar.f35942u1;
                if (daVar != null) {
                    org.telegram.ui.Components.za0 za0Var = daVar.f32945i0;
                    if (za0Var != null && za0Var.getTop() == daVar.f32947k0) {
                        z13 = true;
                    }
                    ytVar.f35944w1 = !z13;
                    daVar.invalidate();
                    return;
                }
                return;
            case 11:
                hz hzVar = (hz) obj;
                if (hzVar.f47853a.J1 && (czVar = hzVar.L) != null && (f3Var = czVar.f30375b) != null) {
                    if (f3Var.f39059e) {
                        f3Var.k(true);
                        return;
                    } else {
                        f3Var.d();
                        return;
                    }
                }
                return;
            case 12:
                ((p00) obj).f50103s.invalidate();
                return;
            case 13:
                j40 j40Var = (j40) obj;
                if (j40Var.A0 == null) {
                    j40Var.A0 = (jc) j40Var.F0(j40Var.f50553a0);
                }
                int measuredHeight = j40Var.A0.getMeasuredHeight() - j40.n1(j40Var).getMeasuredHeight();
                float top = j40Var.A0.getTop() * (-1);
                float f10 = measuredHeight;
                float max = Math.max(Math.min(1.0f, top / f10), 0.0f);
                j40Var.B0 = max;
                float min = Math.min(max * 2.0f, 1.0f);
                float min2 = Math.min(Math.max(j40Var.B0 - 0.45f, 0.0f) * 2.0f, 1.0f);
                j40Var.A0.f48300b.setAlpha(org.telegram.messenger.g0.T1(1.0f, 0.0f, min));
                j40Var.A0.f48303f.setAlpha(org.telegram.messenger.g0.T1(1.0f, 0.0f, min));
                j40Var.A0.f48301c.setAlpha(org.telegram.messenger.g0.T1(0.0f, 1.0f, min2));
                if (j40Var.B0 >= 1.0f) {
                    j40Var.A0.setTranslationY(top - f10);
                    return;
                } else {
                    j40Var.A0.setTranslationY(0.0f);
                    return;
                }
            case 14:
                w40 w40Var = (w40) obj;
                int L0 = w40Var.f52420r.L0();
                View childAt = w40Var.f52415n.getChildAt(0);
                if (childAt != null) {
                    i11 = childAt.getTop();
                } else {
                    i11 = 0;
                }
                if (L0 != 0 || i11 < w40Var.f52415n.getPaddingTop()) {
                    z12 = true;
                }
                ((te.a) w40Var.f52405e.f14762c).a(z12, true);
                if (Build.VERSION.SDK_INT >= 31 && (gVar = w40Var.f52419q0) != null) {
                    gVar.f(i7, i10);
                    w40Var.j0();
                    return;
                }
                return;
            case 19:
                ((bg0) obj).K.invalidate();
                return;
            case 20:
                jg0 jg0Var = (jg0) obj;
                int L02 = jg0Var.h.L0();
                if (L02 != -1) {
                    i13 = Math.abs(jg0Var.h.N0() - L02) + 1;
                }
                int b10 = recyclerView.getAdapter().b();
                if (i13 > 0 && !jg0Var.W && !jg0Var.F && !jg0Var.f48348y.isEmpty() && L02 + i13 >= b10 - 5 && jg0Var.E) {
                    jg0Var.h0();
                    return;
                }
                return;
            case 22:
                return;
            case 23:
                ym0 ym0Var = (ym0) obj;
                if (ym0Var.K == null) {
                    int L03 = ym0Var.N.L0();
                    if (L03 == -1) {
                        abs = 0;
                    } else {
                        abs = Math.abs(ym0Var.N.N0() - L03) + 1;
                    }
                    if (abs > 0 && L03 + abs > ym0Var.N.B() - 2 && !ym0Var.f53586r && !ym0Var.f53588s) {
                        if (ym0Var.f53564a == 1) {
                            z11 = true;
                        }
                        ym0Var.i0(ym0Var.f53593w, ym0Var.f53595x, z11, true);
                        return;
                    }
                    return;
                }
                return;
            case 24:
                nr0 nr0Var = (nr0) obj;
                if (i10 != 0 && (b30Var = nr0Var.h) != null) {
                    b30Var.a();
                }
                org.telegram.ui.Components.rw0 rw0Var = nr0Var.R;
                if (rw0Var != null && rw0Var.f39086s) {
                    org.telegram.ui.Components.pw0 delegate = rw0Var.getDelegate();
                    if (delegate instanceof org.telegram.ui.Cells.z5) {
                        b61 b61Var = nr0Var.f49618c;
                        View F = b61Var.F((org.telegram.ui.Cells.z5) delegate);
                        if (F == null) {
                            T = null;
                        } else {
                            T = b61Var.T(F);
                        }
                        if (T != null) {
                            View view = T.f58535a;
                            if (nr0Var.R.getDirection() == 0) {
                                nr0Var.R.setTranslationY((view.getY() - org.telegram.messenger.g0.L(166.0f)) + view.getMeasuredHeight());
                            } else {
                                nr0Var.R.setTranslationY(view.getY());
                            }
                            v4.b0 b0Var = nr0Var.d;
                            if (!b0Var.f58623c.e(view) || !b0Var.d.e(view)) {
                                nr0Var.R.f();
                                return;
                            }
                            return;
                        }
                        nr0Var.R.f();
                        return;
                    }
                    nr0Var.R.f();
                    return;
                }
                return;
            case 25:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) obj;
                premiumPreviewFragment.f42983e0.invalidate();
                if (Build.VERSION.SDK_INT >= 31 && (gVar2 = premiumPreviewFragment.f43007x0) != null) {
                    gVar2.f(i7, i10);
                    premiumPreviewFragment.o0();
                    return;
                }
                return;
            case 26:
                PrivacyControlActivity.w0((PrivacyControlActivity) obj);
                return;
            case 27:
                pt0 pt0Var = (pt0) obj;
                if (!pt0Var.getMessagesController().J0) {
                    int abs2 = Math.abs(pt0Var.f50362b.N0() - pt0Var.f50362b.L0()) + 1;
                    int b11 = recyclerView.getAdapter().b();
                    if (abs2 > 0 && pt0Var.f50362b.N0() >= b11 - 10) {
                        pt0Var.getMessagesController().F0(false);
                        return;
                    }
                    return;
                }
                return;
            case 28:
                ly0 ly0Var = (ly0) obj;
                ly0Var.f49064e.invalidate();
                my0 my0Var = ly0Var.f49069w;
                int i14 = my0.f49340w1;
                my0Var.f29682b.invalidate();
                return;
        }
    }

    public g3(lb lbVar) {
        this.f47287a = 5;
        this.f47288b = lbVar;
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
