package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class g3 extends v4.s0 {
    public final int f45856a;
    public final Object f45857b;

    public g3(Object obj, int i7) {
        this.f45856a = i7;
        this.f45857b = obj;
    }

    @Override
    public void a(RecyclerView recyclerView, int i7) {
        View view;
        View view2;
        View m10;
        org.telegram.ui.ActionBar.k kVar;
        View view3;
        switch (this.f45856a) {
            case 0:
                if (i7 == 0) {
                    ((k3) this.f45857b).L.P0.V();
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
                mb mbVar = (mb) this.f45857b;
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
                    org.telegram.messenger.g0.v1(((cn) this.f45857b).l1);
                    return;
                }
                return;
            case 7:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(((mp) this.f45857b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 8:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(((qq) this.f45857b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 9:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(((ss) this.f45857b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 12:
                q00 q00Var = (q00) this.f45857b;
                if (i7 == 0) {
                    int L = org.telegram.messenger.g0.L(16.0f) + q00Var.p0().getBottom();
                    if (q00Var.f48848w > 0.5f) {
                        q00Var.f48842c.w0(0, q00Var.f48846r - L, null);
                        return;
                    }
                    if (q00Var.f48842c.getLayoutManager() != null) {
                        view = q00Var.f48842c.getLayoutManager().m(0);
                    } else {
                        view = null;
                    }
                    if (view != null) {
                        if (q00Var.q0() + view.getTop() < 0.0f) {
                            q00Var.f48842c.w0(0, Math.round(q00Var.q0() + view.getTop()), null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 13:
                l40 l40Var = (l40) this.f45857b;
                if (i7 == 0) {
                    float f10 = l40Var.A0;
                    if (f10 >= 0.5f && f10 < 1.0f) {
                        int bottom = l40.o1(l40Var).getBottom();
                        v4.n0 layoutManager = l40Var.M.getLayoutManager();
                        if (layoutManager != null && (m10 = layoutManager.m(0)) != null) {
                            l40Var.M.w0(0, m10.getBottom() - bottom, null);
                            return;
                        }
                        return;
                    } else if (f10 < 0.5f) {
                        if (l40Var.M.getLayoutManager() != null) {
                            view2 = l40Var.M.getLayoutManager().m(0);
                        } else {
                            view2 = null;
                        }
                        if (view2 != null && view2.getTop() < 0) {
                            l40Var.M.w0(0, view2.getTop(), null);
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 14:
                y40 y40Var = (y40) this.f45857b;
                if (i7 == 1) {
                    y40Var.f51864f.f37857r.m();
                    org.telegram.messenger.g0.v1(y40Var.f51864f.f37857r);
                    return;
                }
                return;
            case 15:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(((f50) this.f45857b).f45586c);
                    return;
                }
                return;
            case 16:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(((o50) this.f45857b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 17:
                b60 b60Var = (b60) this.f45857b;
                if (i7 == 1 && b60.b0(b60Var).F) {
                    org.telegram.messenger.g0.v1(b60.c0(b60Var).getSearchField());
                    return;
                }
                return;
            case 18:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(((LanguageSelectActivity) this.f45857b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 20:
                return;
            case 21:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(((sg0) this.f45857b).Q1.getEditText());
                    return;
                }
                return;
            case 22:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(((NotificationsCustomSettingsActivity) this.f45857b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 23:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(((zm0) this.f45857b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 24:
                return;
            case 25:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.f45857b;
                if (i7 == 0) {
                    kVar = ((org.telegram.ui.ActionBar.f2) premiumPreviewFragment).actionBar;
                    int L2 = org.telegram.messenger.g0.L(16.0f) + kVar.getBottom();
                    if (premiumPreviewFragment.f41622f0 > 0.5f) {
                        premiumPreviewFragment.f41612a.w0(0, premiumPreviewFragment.f41617c0 - L2, null);
                        return;
                    }
                    if (premiumPreviewFragment.f41612a.getLayoutManager() != null) {
                        view3 = premiumPreviewFragment.f41612a.getLayoutManager().m(0);
                    } else {
                        view3 = null;
                    }
                    if (view3 != null && view3.getTop() < 0) {
                        premiumPreviewFragment.f41612a.w0(0, view3.getTop(), null);
                        return;
                    }
                    return;
                }
                return;
            case 29:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(((ty0) this.f45857b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i7, int i10) {
        dz dzVar;
        org.telegram.ui.Cells.f3 f3Var;
        int i11;
        dh.g gVar;
        int abs;
        v4.d1 T;
        org.telegram.ui.Components.z20 z20Var;
        dh.g gVar2;
        int i12 = this.f45856a;
        boolean z9 = false;
        boolean z10 = false;
        int i13 = 0;
        boolean z11 = false;
        r4 = false;
        boolean z12 = false;
        Object obj = this.f45857b;
        switch (i12) {
            case 0:
                k3 k3Var = (k3) obj;
                if (recyclerView.getChildCount() != 0) {
                    recyclerView.invalidate();
                    k3Var.L.P0.G();
                    g4 g4Var = k3Var.L;
                    t3 t3Var = g4Var.K;
                    if (t3Var != null) {
                        t3Var.f50047c.invalidate();
                    } else {
                        ArticleViewer$WindowView articleViewer$WindowView = g4Var.f45888f0;
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
                if (!oVar.I && !oVar.f48270r && oVar.d.N0() > oVar.E - 2) {
                    oVar.b0();
                    return;
                }
                return;
            case 2:
                g4 g4Var3 = (g4) obj;
                if (g4Var3.f45891i0.f51154x.I1) {
                    org.telegram.messenger.g0.v1(g4Var3.f45890h0.f51170b0);
                    return;
                }
                return;
            case 3:
                y6 y6Var = (y6) obj;
                if (y6Var.f51923b.canScrollVertically(-1) || y6.f0(y6Var).t()) {
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
                mbVar.f47834w.invalidate();
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
                yt ytVar = (yt) obj;
                org.telegram.ui.Components.ha haVar = ytVar.f36307q1;
                if (haVar != null) {
                    org.telegram.ui.Components.za0 za0Var = haVar.f31761h0;
                    if (za0Var != null && za0Var.getTop() == haVar.f31763j0) {
                        z12 = true;
                    }
                    ytVar.f36309s1 = !z12;
                    haVar.invalidate();
                    return;
                }
                return;
            case 11:
                iz izVar = (iz) obj;
                if (izVar.f46789a.I1 && (dzVar = izVar.K) != null && (f3Var = dzVar.f29256b) != null) {
                    if (f3Var.f35844e) {
                        f3Var.k(true);
                        return;
                    } else {
                        f3Var.d();
                        return;
                    }
                }
                return;
            case 12:
                ((q00) obj).f48847s.invalidate();
                return;
            case 13:
                l40 l40Var = (l40) obj;
                if (l40Var.f47459z0 == null) {
                    l40Var.f47459z0 = (kc) l40Var.F0(l40Var.Z);
                }
                int measuredHeight = l40Var.f47459z0.getMeasuredHeight() - l40.n1(l40Var).getMeasuredHeight();
                float top = l40Var.f47459z0.getTop() * (-1);
                float f10 = measuredHeight;
                float max = Math.max(Math.min(1.0f, top / f10), 0.0f);
                l40Var.A0 = max;
                float min = Math.min(max * 2.0f, 1.0f);
                float min2 = Math.min(Math.max(l40Var.A0 - 0.45f, 0.0f) * 2.0f, 1.0f);
                l40Var.f47459z0.f47260b.setAlpha(org.telegram.messenger.g0.T1(1.0f, 0.0f, min));
                l40Var.f47459z0.f47263f.setAlpha(org.telegram.messenger.g0.T1(1.0f, 0.0f, min));
                l40Var.f47459z0.f47261c.setAlpha(org.telegram.messenger.g0.T1(0.0f, 1.0f, min2));
                if (l40Var.A0 >= 1.0f) {
                    l40Var.f47459z0.setTranslationY(top - f10);
                    return;
                } else {
                    l40Var.f47459z0.setTranslationY(0.0f);
                    return;
                }
            case 14:
                y40 y40Var = (y40) obj;
                int L0 = y40Var.f51877r.L0();
                View childAt = y40Var.f51872n.getChildAt(0);
                if (childAt != null) {
                    i11 = childAt.getTop();
                } else {
                    i11 = 0;
                }
                if (L0 != 0 || i11 < y40Var.f51872n.getPaddingTop()) {
                    z11 = true;
                }
                ((te.a) y40Var.f51862e.f12596c).a(z11, true);
                if (Build.VERSION.SDK_INT >= 31 && (gVar = y40Var.f51875p0) != null) {
                    gVar.f(i7, i10);
                    y40Var.j0();
                    return;
                }
                return;
            case 19:
                ((dg0) obj).J.invalidate();
                return;
            case 20:
                lg0 lg0Var = (lg0) obj;
                int L02 = lg0Var.h.L0();
                if (L02 != -1) {
                    i13 = Math.abs(lg0Var.h.N0() - L02) + 1;
                }
                int b10 = recyclerView.getAdapter().b();
                if (i13 > 0 && !lg0Var.V && !lg0Var.E && !lg0Var.f47616y.isEmpty() && L02 + i13 >= b10 - 5 && lg0Var.D) {
                    lg0Var.h0();
                    return;
                }
                return;
            case 22:
                return;
            case 23:
                zm0 zm0Var = (zm0) obj;
                if (zm0Var.J == null) {
                    int L03 = zm0Var.M.L0();
                    if (L03 == -1) {
                        abs = 0;
                    } else {
                        abs = Math.abs(zm0Var.M.N0() - L03) + 1;
                    }
                    if (abs > 0 && L03 + abs > zm0Var.M.B() - 2 && !zm0Var.f52620r && !zm0Var.f52622s) {
                        if (zm0Var.f52598a == 1) {
                            z10 = true;
                        }
                        zm0Var.i0(zm0Var.f52627w, zm0Var.f52629x, z10, true);
                        return;
                    }
                    return;
                }
                return;
            case 24:
                rr0 rr0Var = (rr0) obj;
                if (i10 != 0 && (z20Var = rr0Var.h) != null) {
                    z20Var.a();
                }
                org.telegram.ui.Components.pw0 pw0Var = rr0Var.Q;
                if (pw0Var != null && pw0Var.f37115s) {
                    org.telegram.ui.Components.nw0 delegate = pw0Var.getDelegate();
                    if (delegate instanceof org.telegram.ui.Cells.a6) {
                        f61 f61Var = rr0Var.f49569c;
                        View F = f61Var.F((org.telegram.ui.Cells.a6) delegate);
                        if (F == null) {
                            T = null;
                        } else {
                            T = f61Var.T(F);
                        }
                        if (T != null) {
                            View view = T.f57056a;
                            if (rr0Var.Q.getDirection() == 0) {
                                rr0Var.Q.setTranslationY((view.getY() - org.telegram.messenger.g0.L(166.0f)) + view.getMeasuredHeight());
                            } else {
                                rr0Var.Q.setTranslationY(view.getY());
                            }
                            v4.b0 b0Var = rr0Var.d;
                            if (!b0Var.f57145c.e(view) || !b0Var.d.e(view)) {
                                rr0Var.Q.f();
                                return;
                            }
                            return;
                        }
                        rr0Var.Q.f();
                        return;
                    }
                    rr0Var.Q.f();
                    return;
                }
                return;
            case 25:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) obj;
                premiumPreviewFragment.f41618d0.invalidate();
                if (Build.VERSION.SDK_INT >= 31 && (gVar2 = premiumPreviewFragment.f41642w0) != null) {
                    gVar2.f(i7, i10);
                    premiumPreviewFragment.o0();
                    return;
                }
                return;
            case 26:
                PrivacyControlActivity.w0((PrivacyControlActivity) obj);
                return;
            case 27:
                ut0 ut0Var = (ut0) obj;
                if (!ut0Var.getMessagesController().I0) {
                    int abs2 = Math.abs(ut0Var.f50460b.N0() - ut0Var.f50460b.L0()) + 1;
                    int b11 = recyclerView.getAdapter().b();
                    if (abs2 > 0 && ut0Var.f50460b.N0() >= b11 - 10) {
                        ut0Var.getMessagesController().F0(false);
                        return;
                    }
                    return;
                }
                return;
            case 28:
                qy0 qy0Var = (qy0) obj;
                qy0Var.f49219e.invalidate();
                ry0 ry0Var = qy0Var.f49224w;
                int i14 = ry0.f49634s1;
                ry0Var.f28624b.invalidate();
                return;
        }
    }

    public g3(mb mbVar) {
        this.f45856a = 5;
        this.f45857b = mbVar;
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
