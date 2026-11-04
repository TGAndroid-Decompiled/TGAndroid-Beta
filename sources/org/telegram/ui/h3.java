package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class h3 extends u4.t0 {
    public final int f45791a;
    public final Object f45792b;

    public h3(Object obj, int i3) {
        this.f45791a = i3;
        this.f45792b = obj;
    }

    @Override
    public void a(RecyclerView recyclerView, int i3) {
        View view;
        View view2;
        org.telegram.ui.ActionBar.k kVar;
        View m10;
        org.telegram.ui.ActionBar.k kVar2;
        View view3;
        switch (this.f45791a) {
            case 0:
                if (i3 == 0) {
                    ((l3) this.f45792b).M.Q0.V();
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
                kb kbVar = (kb) this.f45792b;
                if (i3 == 1) {
                    kbVar.T = true;
                    kbVar.W = true;
                    return;
                } else if (i3 == 0) {
                    kbVar.T = false;
                    kbVar.W = false;
                    kbVar.Y0(true);
                    return;
                } else {
                    return;
                }
            case 6:
                if (i3 == 1) {
                    org.telegram.messenger.g0.v1(((wm) this.f45792b).m1);
                    return;
                }
                return;
            case 7:
                if (i3 == 1) {
                    org.telegram.messenger.g0.v1(((ip) this.f45792b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 8:
                if (i3 == 1) {
                    org.telegram.messenger.g0.v1(((nq) this.f45792b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 9:
                if (i3 == 1) {
                    org.telegram.messenger.g0.v1(((os) this.f45792b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 12:
                l00 l00Var = (l00) this.f45792b;
                if (i3 == 0) {
                    int L = org.telegram.messenger.g0.L(16.0f) + l00Var.p0().getBottom();
                    if (l00Var.f47069w > 0.5f) {
                        l00Var.f47063c.w0(0, l00Var.f47067r - L, null);
                        return;
                    }
                    if (l00Var.f47063c.getLayoutManager() != null) {
                        view = l00Var.f47063c.getLayoutManager().m(0);
                    } else {
                        view = null;
                    }
                    if (view != null) {
                        if (l00Var.q0() + view.getTop() < 0.0f) {
                            l00Var.f47063c.w0(0, Math.round(l00Var.q0() + view.getTop()), null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 13:
                e40 e40Var = (e40) this.f45792b;
                if (i3 == 0) {
                    float f10 = e40Var.B0;
                    if (f10 >= 0.5f && f10 < 1.0f) {
                        kVar = ((org.telegram.ui.ActionBar.d2) e40Var).actionBar;
                        int bottom = kVar.getBottom();
                        u4.o0 layoutManager = e40Var.N.getLayoutManager();
                        if (layoutManager != null && (m10 = layoutManager.m(0)) != null) {
                            e40Var.N.w0(0, m10.getBottom() - bottom, null);
                            return;
                        }
                        return;
                    } else if (f10 < 0.5f) {
                        if (e40Var.N.getLayoutManager() != null) {
                            view2 = e40Var.N.getLayoutManager().m(0);
                        } else {
                            view2 = null;
                        }
                        if (view2 != null && view2.getTop() < 0) {
                            e40Var.N.w0(0, view2.getTop(), null);
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 14:
                r40 r40Var = (r40) this.f45792b;
                if (i3 == 1) {
                    r40Var.f49040f.f36302r.m();
                    org.telegram.messenger.g0.v1(r40Var.f49040f.f36302r);
                    return;
                }
                return;
            case 15:
                if (i3 == 1) {
                    org.telegram.messenger.g0.v1(((y40) this.f45792b).f52182c);
                    return;
                }
                return;
            case 16:
                if (i3 == 1) {
                    org.telegram.messenger.g0.v1(((g50) this.f45792b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 17:
                t50 t50Var = (t50) this.f45792b;
                if (i3 == 1 && t50.b0(t50Var).G) {
                    org.telegram.messenger.g0.v1(t50.c0(t50Var).getSearchField());
                    return;
                }
                return;
            case 18:
                if (i3 == 1) {
                    org.telegram.messenger.g0.v1(((LanguageSelectActivity) this.f45792b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 20:
                return;
            case 21:
                if (i3 == 1) {
                    org.telegram.messenger.g0.v1(((kg0) this.f45792b).R1.getEditText());
                    return;
                }
                return;
            case 22:
                if (i3 == 1) {
                    org.telegram.messenger.g0.v1(((NotificationsCustomSettingsActivity) this.f45792b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 23:
                if (i3 == 1) {
                    org.telegram.messenger.g0.v1(((sm0) this.f45792b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 24:
                return;
            case 25:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.f45792b;
                if (i3 == 0) {
                    kVar2 = ((org.telegram.ui.ActionBar.d2) premiumPreviewFragment).actionBar;
                    int L2 = org.telegram.messenger.g0.L(16.0f) + kVar2.getBottom();
                    if (premiumPreviewFragment.f41643g0 > 0.5f) {
                        premiumPreviewFragment.f41632a.w0(0, premiumPreviewFragment.f41638d0 - L2, null);
                        return;
                    }
                    if (premiumPreviewFragment.f41632a.getLayoutManager() != null) {
                        view3 = premiumPreviewFragment.f41632a.getLayoutManager().m(0);
                    } else {
                        view3 = null;
                    }
                    if (view3 != null && view3.getTop() < 0) {
                        premiumPreviewFragment.f41632a.w0(0, view3.getTop(), null);
                        return;
                    }
                    return;
                }
                return;
            case 29:
                if (i3 == 1) {
                    org.telegram.messenger.g0.v1(((gy0) this.f45792b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i3, int i10) {
        zy zyVar;
        org.telegram.ui.Cells.f3 f3Var;
        org.telegram.ui.ActionBar.k kVar;
        int i11;
        eh.g gVar;
        int abs;
        u4.d1 T;
        org.telegram.ui.Components.u20 u20Var;
        eh.g gVar2;
        int i12 = this.f45791a;
        boolean z10 = false;
        boolean z11 = false;
        int i13 = 0;
        boolean z12 = false;
        r4 = false;
        boolean z13 = false;
        Object obj = this.f45792b;
        switch (i12) {
            case 0:
                l3 l3Var = (l3) obj;
                if (recyclerView.getChildCount() != 0) {
                    recyclerView.invalidate();
                    l3Var.M.Q0.G();
                    i4 i4Var = l3Var.M;
                    u3 u3Var = i4Var.L;
                    if (u3Var != null) {
                        u3Var.f49951c.invalidate();
                    } else {
                        ArticleViewer$WindowView articleViewer$WindowView = i4Var.f46086g0;
                        if (articleViewer$WindowView != null) {
                            articleViewer$WindowView.invalidate();
                        }
                    }
                    l3Var.M.d0();
                    i4 i4Var2 = l3Var.M;
                    u3 u3Var2 = i4Var2.L;
                    if (u3Var2 == null || u3Var2.G) {
                        i4Var2.V(i4Var2.K0 - i10);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                o oVar = (o) obj;
                if (!oVar.J && !oVar.f48155r && oVar.d.N0() > oVar.F - 2) {
                    oVar.b0();
                    return;
                }
                return;
            case 2:
                i4 i4Var3 = (i4) obj;
                if (i4Var3.f46089j0.f50934x.J1) {
                    org.telegram.messenger.g0.v1(i4Var3.f46088i0.f50875c0);
                    return;
                }
                return;
            case 3:
                z6 z6Var = (z6) obj;
                if (z6Var.f52547b.canScrollVertically(-1) || z6.f0(z6Var).s()) {
                    z10 = true;
                }
                qe.a aVar = z6Var.T;
                if (aVar != null) {
                    aVar.a(z10, true);
                    return;
                }
                return;
            case 4:
                ((i8) obj).v0();
                return;
            case 5:
                kb kbVar = (kb) obj;
                kbVar.f46885w.invalidate();
                if (i10 != 0 && kbVar.T && !kbVar.R && kbVar.N.getTag() == null) {
                    AnimatorSet animatorSet = kbVar.S;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                    }
                    kbVar.N.setTag(1);
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    kbVar.S = animatorSet2;
                    animatorSet2.setDuration(150L);
                    kbVar.S.playTogether(ObjectAnimator.ofFloat(kbVar.N, "alpha", 1.0f));
                    kbVar.S.addListener(new org.telegram.ui.Cells.w9(this, 1));
                    kbVar.S.start();
                }
                kbVar.T0(true);
                kbVar.h1();
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
                ut utVar = (ut) obj;
                org.telegram.ui.Components.ga gaVar = utVar.f36107r1;
                if (gaVar != null) {
                    org.telegram.ui.Components.ta0 ta0Var = gaVar.f38709i0;
                    if (ta0Var != null && ta0Var.getTop() == gaVar.f38711k0) {
                        z13 = true;
                    }
                    utVar.f36109t1 = !z13;
                    gaVar.invalidate();
                    return;
                }
                return;
            case 11:
                ez ezVar = (ez) obj;
                if (ezVar.f45101a.J1 && (zyVar = ezVar.L) != null && (f3Var = zyVar.f29316b) != null) {
                    if (f3Var.f35191e) {
                        f3Var.k(true);
                        return;
                    } else {
                        f3Var.d();
                        return;
                    }
                }
                return;
            case 12:
                ((l00) obj).f47068s.invalidate();
                return;
            case 13:
                e40 e40Var = (e40) obj;
                if (e40Var.A0 == null) {
                    e40Var.A0 = (ic) e40Var.F0(e40Var.f48511a0);
                }
                int measuredHeight = e40Var.A0.getMeasuredHeight();
                kVar = ((org.telegram.ui.ActionBar.d2) e40Var).actionBar;
                int measuredHeight2 = measuredHeight - kVar.getMeasuredHeight();
                float top = e40Var.A0.getTop() * (-1);
                float f10 = measuredHeight2;
                float max = Math.max(Math.min(1.0f, top / f10), 0.0f);
                e40Var.B0 = max;
                float min = Math.min(max * 2.0f, 1.0f);
                float min2 = Math.min(Math.max(e40Var.B0 - 0.45f, 0.0f) * 2.0f, 1.0f);
                e40Var.A0.f46234b.setAlpha(org.telegram.messenger.g0.T1(1.0f, 0.0f, min));
                e40Var.A0.f46237f.setAlpha(org.telegram.messenger.g0.T1(1.0f, 0.0f, min));
                e40Var.A0.f46235c.setAlpha(org.telegram.messenger.g0.T1(0.0f, 1.0f, min2));
                if (e40Var.B0 >= 1.0f) {
                    e40Var.A0.setTranslationY(top - f10);
                    return;
                } else {
                    e40Var.A0.setTranslationY(0.0f);
                    return;
                }
            case 14:
                r40 r40Var = (r40) obj;
                int L0 = r40Var.f49053r.L0();
                View childAt = r40Var.f49048n.getChildAt(0);
                if (childAt != null) {
                    i11 = childAt.getTop();
                } else {
                    i11 = 0;
                }
                if (L0 != 0 || i11 < r40Var.f49048n.getPaddingTop()) {
                    z12 = true;
                }
                ((qe.a) r40Var.f49038e.f13304c).a(z12, true);
                if (Build.VERSION.SDK_INT >= 31 && (gVar = r40Var.f49052q0) != null) {
                    gVar.f(i3, i10);
                    r40Var.j0();
                    return;
                }
                return;
            case 19:
                ((vf0) obj).K.invalidate();
                return;
            case 20:
                dg0 dg0Var = (dg0) obj;
                int L02 = dg0Var.h.L0();
                if (L02 != -1) {
                    i13 = Math.abs(dg0Var.h.N0() - L02) + 1;
                }
                int b10 = recyclerView.getAdapter().b();
                if (i13 > 0 && !dg0Var.W && !dg0Var.F && !dg0Var.f44707y.isEmpty() && L02 + i13 >= b10 - 5 && dg0Var.E) {
                    dg0Var.h0();
                    return;
                }
                return;
            case 22:
                return;
            case 23:
                sm0 sm0Var = (sm0) obj;
                if (sm0Var.K == null) {
                    int L03 = sm0Var.N.L0();
                    if (L03 == -1) {
                        abs = 0;
                    } else {
                        abs = Math.abs(sm0Var.N.N0() - L03) + 1;
                    }
                    if (abs > 0 && L03 + abs > sm0Var.N.B() - 2 && !sm0Var.f49560r && !sm0Var.f49562s) {
                        if (sm0Var.f49538a == 1) {
                            z11 = true;
                        }
                        sm0Var.i0(sm0Var.f49567w, sm0Var.f49569x, z11, true);
                        return;
                    }
                    return;
                }
                return;
            case 24:
                fr0 fr0Var = (fr0) obj;
                if (i10 != 0 && (u20Var = fr0Var.h) != null) {
                    u20Var.a();
                }
                org.telegram.ui.Components.ow0 ow0Var = fr0Var.R;
                if (ow0Var != null && ow0Var.f36972s) {
                    org.telegram.ui.Components.mw0 delegate = ow0Var.getDelegate();
                    if (delegate instanceof org.telegram.ui.Cells.z5) {
                        u51 u51Var = fr0Var.f45331c;
                        View F = u51Var.F((org.telegram.ui.Cells.z5) delegate);
                        if (F == null) {
                            T = null;
                        } else {
                            T = u51Var.T(F);
                        }
                        if (T != null) {
                            View view = T.f55540a;
                            if (fr0Var.R.getDirection() == 0) {
                                fr0Var.R.setTranslationY((view.getY() - org.telegram.messenger.g0.L(166.0f)) + view.getMeasuredHeight());
                            } else {
                                fr0Var.R.setTranslationY(view.getY());
                            }
                            u4.b0 b0Var = fr0Var.d;
                            if (!b0Var.f55631c.O(view) || !b0Var.d.O(view)) {
                                fr0Var.R.f();
                                return;
                            }
                            return;
                        }
                        fr0Var.R.f();
                        return;
                    }
                    fr0Var.R.f();
                    return;
                }
                return;
            case 25:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) obj;
                premiumPreviewFragment.f41640e0.invalidate();
                if (Build.VERSION.SDK_INT >= 31 && (gVar2 = premiumPreviewFragment.f41664x0) != null) {
                    gVar2.f(i3, i10);
                    premiumPreviewFragment.o0();
                    return;
                }
                return;
            case 26:
                PrivacyControlActivity.w0((PrivacyControlActivity) obj);
                return;
            case 27:
                it0 it0Var = (it0) obj;
                if (!it0Var.getMessagesController().J0) {
                    int abs2 = Math.abs(it0Var.f46411b.N0() - it0Var.f46411b.L0()) + 1;
                    int b11 = recyclerView.getAdapter().b();
                    if (abs2 > 0 && it0Var.f46411b.N0() >= b11 - 10) {
                        it0Var.getMessagesController().F0(false);
                        return;
                    }
                    return;
                }
                return;
            case 28:
                dy0 dy0Var = (dy0) obj;
                dy0Var.f44831e.invalidate();
                ey0 ey0Var = dy0Var.f44836w;
                int i14 = ey0.f45092t1;
                ey0Var.f28586b.invalidate();
                return;
        }
    }

    public h3(kb kbVar) {
        this.f45791a = 5;
        this.f45792b = kbVar;
        org.telegram.messenger.g0.L(100.0f);
    }

    private final void c(RecyclerView recyclerView, int i3) {
    }

    private final void d(RecyclerView recyclerView, int i3) {
    }

    private final void e(RecyclerView recyclerView, int i3, int i10) {
    }

    private final void f(RecyclerView recyclerView, int i3, int i10) {
    }
}
