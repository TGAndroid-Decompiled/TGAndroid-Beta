package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class h3 extends s4.s0 {
    public final int f37640a;
    public final Object f37641b;

    public h3(Object obj, int i10) {
        this.f37640a = i10;
        this.f37641b = obj;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        View view;
        View view2;
        View m10;
        org.telegram.ui.ActionBar.l lVar;
        View view3;
        switch (this.f37640a) {
            case 0:
                if (i10 == 0) {
                    ((l3) this.f37641b).L.P0.V();
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
                sb sbVar = (sb) this.f37641b;
                if (i10 == 1) {
                    sbVar.S = true;
                    sbVar.V = true;
                    return;
                } else if (i10 == 0) {
                    sbVar.S = false;
                    sbVar.V = false;
                    sbVar.Y0(true);
                    return;
                } else {
                    return;
                }
            case 6:
                if (i10 == 1) {
                    org.telegram.messenger.i0.v1(((un) this.f37641b).l1);
                    return;
                }
                return;
            case 7:
                if (i10 == 1) {
                    org.telegram.messenger.i0.v1(((iq) this.f37641b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 8:
                if (i10 == 1) {
                    org.telegram.messenger.i0.v1(((pr) this.f37641b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 9:
                if (i10 == 1) {
                    org.telegram.messenger.i0.v1(((qt) this.f37641b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 12:
                o10 o10Var = (o10) this.f37641b;
                if (i10 == 0) {
                    int L = org.telegram.messenger.i0.L(16.0f) + o10Var.p0().getBottom();
                    if (o10Var.f40012w > 0.5f) {
                        o10Var.f40007c.w0(0, o10Var.f40010r - L, null);
                        return;
                    }
                    if (o10Var.f40007c.getLayoutManager() != null) {
                        view = o10Var.f40007c.getLayoutManager().m(0);
                    } else {
                        view = null;
                    }
                    if (view != null) {
                        if (o10Var.q0() + view.getTop() < 0.0f) {
                            o10Var.f40007c.w0(0, Math.round(o10Var.q0() + view.getTop()), null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 13:
                h50 h50Var = (h50) this.f37641b;
                if (i10 == 0) {
                    float f7 = h50Var.A0;
                    if (f7 >= 0.5f && f7 < 1.0f) {
                        int bottom = h50.o1(h50Var).getBottom();
                        s4.n0 layoutManager = h50Var.M.getLayoutManager();
                        if (layoutManager != null && (m10 = layoutManager.m(0)) != null) {
                            h50Var.M.w0(0, m10.getBottom() - bottom, null);
                            return;
                        }
                        return;
                    } else if (f7 < 0.5f) {
                        if (h50Var.M.getLayoutManager() != null) {
                            view2 = h50Var.M.getLayoutManager().m(0);
                        } else {
                            view2 = null;
                        }
                        if (view2 != null && view2.getTop() < 0) {
                            h50Var.M.w0(0, view2.getTop(), null);
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 14:
                u50 u50Var = (u50) this.f37641b;
                if (i10 == 1) {
                    u50Var.f41808f.f26635r.m();
                    org.telegram.messenger.i0.v1(u50Var.f41808f.f26635r);
                    return;
                }
                return;
            case 15:
                if (i10 == 1) {
                    org.telegram.messenger.i0.v1(((b60) this.f37641b).f35955c);
                    return;
                }
                return;
            case 16:
                if (i10 == 1) {
                    org.telegram.messenger.i0.v1(((j60) this.f37641b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 17:
                x60 x60Var = (x60) this.f37641b;
                if (i10 == 1 && x60.b0(x60Var).F) {
                    org.telegram.messenger.i0.v1(x60.c0(x60Var).getSearchField());
                    return;
                }
                return;
            case 18:
                if (i10 == 1) {
                    org.telegram.messenger.i0.v1(((LanguageSelectActivity) this.f37641b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 20:
                return;
            case 21:
                if (i10 == 1) {
                    org.telegram.messenger.i0.v1(((uh0) this.f37641b).Q1.getEditText());
                    return;
                }
                return;
            case 22:
                if (i10 == 1) {
                    org.telegram.messenger.i0.v1(((NotificationsCustomSettingsActivity) this.f37641b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 23:
                if (i10 == 1) {
                    org.telegram.messenger.i0.v1(((jo0) this.f37641b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 24:
                return;
            case 25:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.f37641b;
                if (i10 == 0) {
                    lVar = ((org.telegram.ui.ActionBar.k2) premiumPreviewFragment).actionBar;
                    int L2 = org.telegram.messenger.i0.L(16.0f) + lVar.getBottom();
                    if (premiumPreviewFragment.f33705f0 > 0.5f) {
                        premiumPreviewFragment.f33696a.w0(0, premiumPreviewFragment.f33701c0 - L2, null);
                        return;
                    }
                    if (premiumPreviewFragment.f33696a.getLayoutManager() != null) {
                        view3 = premiumPreviewFragment.f33696a.getLayoutManager().m(0);
                    } else {
                        view3 = null;
                    }
                    if (view3 != null && view3.getTop() < 0) {
                        premiumPreviewFragment.f33696a.w0(0, view3.getTop(), null);
                        return;
                    }
                    return;
                }
                return;
            case 28:
                if (i10 == 1) {
                    org.telegram.messenger.i0.v1(((e01) this.f37641b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i10, int i11) {
        c00 c00Var;
        org.telegram.ui.Cells.h3 h3Var;
        int i12;
        tg.f fVar;
        int abs;
        s4.c1 T;
        org.telegram.ui.Components.q30 q30Var;
        tg.f fVar2;
        int i13 = this.f37640a;
        boolean z10 = false;
        boolean z11 = false;
        int i14 = 0;
        boolean z12 = false;
        r4 = false;
        boolean z13 = false;
        Object obj = this.f37641b;
        switch (i13) {
            case 0:
                l3 l3Var = (l3) obj;
                if (recyclerView.getChildCount() != 0) {
                    recyclerView.invalidate();
                    l3Var.L.P0.G();
                    h4 h4Var = l3Var.L;
                    u3 u3Var = h4Var.K;
                    if (u3Var != null) {
                        u3Var.f41775c.invalidate();
                    } else {
                        ArticleViewer$WindowView articleViewer$WindowView = h4Var.f37677f0;
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
                if (!nVar.I && !nVar.f39653r && nVar.d.N0() > nVar.E - 2) {
                    nVar.b0();
                    return;
                }
                return;
            case 2:
                h4 h4Var3 = (h4) obj;
                if (h4Var3.f37680i0.f42874x.I1) {
                    org.telegram.messenger.i0.v1(h4Var3.f37679h0.f42897b0);
                    return;
                }
                return;
            case 3:
                y6 y6Var = (y6) obj;
                if (y6Var.f43573b.canScrollVertically(-1) || y6.f0(y6Var).s()) {
                    z10 = true;
                }
                fe.b bVar = y6Var.S;
                if (bVar != null) {
                    bVar.a(z10, true);
                    return;
                }
                return;
            case 4:
                ((h8) obj).v0();
                return;
            case 5:
                sb sbVar = (sb) obj;
                sbVar.f41329w.invalidate();
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
                sbVar.T0(true);
                sbVar.h1();
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
                yu yuVar = (yu) obj;
                org.telegram.ui.Components.ba baVar = yuVar.f26729q1;
                if (baVar != null) {
                    org.telegram.ui.Components.rb0 rb0Var = baVar.f30259h0;
                    if (rb0Var != null && rb0Var.getTop() == baVar.f30261j0) {
                        z13 = true;
                    }
                    yuVar.f26731s1 = !z13;
                    baVar.invalidate();
                    return;
                }
                return;
            case 11:
                h00 h00Var = (h00) obj;
                if (h00Var.f37601a.I1 && (c00Var = h00Var.K) != null && (h3Var = c00Var.f22066b) != null) {
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
                ((o10) obj).f40011s.invalidate();
                return;
            case 13:
                h50 h50Var = (h50) obj;
                if (h50Var.f37704z0 == null) {
                    h50Var.f37704z0 = (sc) h50Var.F0(h50Var.Z);
                }
                int measuredHeight = h50Var.f37704z0.getMeasuredHeight() - h50.n1(h50Var).getMeasuredHeight();
                float top = h50Var.f37704z0.getTop() * (-1);
                float f7 = measuredHeight;
                float max = Math.max(Math.min(1.0f, top / f7), 0.0f);
                h50Var.A0 = max;
                float min = Math.min(max * 2.0f, 1.0f);
                float min2 = Math.min(Math.max(h50Var.A0 - 0.45f, 0.0f) * 2.0f, 1.0f);
                h50Var.f37704z0.f41338b.setAlpha(org.telegram.messenger.i0.T1(1.0f, 0.0f, min));
                h50Var.f37704z0.f41340f.setAlpha(org.telegram.messenger.i0.T1(1.0f, 0.0f, min));
                h50Var.f37704z0.f41339c.setAlpha(org.telegram.messenger.i0.T1(0.0f, 1.0f, min2));
                if (h50Var.A0 >= 1.0f) {
                    h50Var.f37704z0.setTranslationY(top - f7);
                    return;
                } else {
                    h50Var.f37704z0.setTranslationY(0.0f);
                    return;
                }
            case 14:
                u50 u50Var = (u50) obj;
                int L0 = u50Var.f41821r.L0();
                View childAt = u50Var.f41816n.getChildAt(0);
                if (childAt != null) {
                    i12 = childAt.getTop();
                } else {
                    i12 = 0;
                }
                if (L0 != 0 || i12 < u50Var.f41816n.getPaddingTop()) {
                    z12 = true;
                }
                ((fe.b) u50Var.e.f11065c).a(z12, true);
                if (Build.VERSION.SDK_INT >= 31 && (fVar = u50Var.f41819p0) != null) {
                    fVar.f(i10, i11);
                    u50Var.j0();
                    return;
                }
                return;
            case 19:
                ((ih0) obj).J.invalidate();
                return;
            case 20:
                qh0 qh0Var = (qh0) obj;
                int L02 = qh0Var.h.L0();
                if (L02 != -1) {
                    i14 = Math.abs(qh0Var.h.N0() - L02) + 1;
                }
                int b10 = recyclerView.getAdapter().b();
                if (i14 > 0 && !qh0Var.V && !qh0Var.E && !qh0Var.f40794y.isEmpty() && L02 + i14 >= b10 - 5 && qh0Var.D) {
                    qh0Var.h0();
                    return;
                }
                return;
            case 22:
                return;
            case 23:
                jo0 jo0Var = (jo0) obj;
                if (jo0Var.J == null) {
                    int L03 = jo0Var.M.L0();
                    if (L03 == -1) {
                        abs = 0;
                    } else {
                        abs = Math.abs(jo0Var.M.N0() - L03) + 1;
                    }
                    if (abs > 0 && L03 + abs > jo0Var.M.B() - 2 && !jo0Var.f38503r && !jo0Var.f38505s) {
                        if (jo0Var.f38482a == 1) {
                            z11 = true;
                        }
                        jo0Var.i0(jo0Var.f38510w, jo0Var.f38512x, z11, true);
                        return;
                    }
                    return;
                }
                return;
            case 24:
                zs0 zs0Var = (zs0) obj;
                if (i11 != 0 && (q30Var = zs0Var.h) != null) {
                    q30Var.b(true);
                }
                org.telegram.ui.Components.tx0 tx0Var = zs0Var.Q;
                if (tx0Var != null && tx0Var.f30740s) {
                    org.telegram.ui.Components.rx0 delegate = tx0Var.getDelegate();
                    if (delegate instanceof org.telegram.ui.Cells.e6) {
                        u71 u71Var = zs0Var.f44056c;
                        View F = u71Var.F((org.telegram.ui.Cells.e6) delegate);
                        if (F == null) {
                            T = null;
                        } else {
                            T = u71Var.T(F);
                        }
                        if (T != null) {
                            View view = T.f47909a;
                            if (zs0Var.Q.getDirection() == 0) {
                                zs0Var.Q.setTranslationY((view.getY() - org.telegram.messenger.i0.L(166.0f)) + view.getMeasuredHeight());
                            } else {
                                zs0Var.Q.setTranslationY(view.getY());
                            }
                            s4.a0 a0Var = zs0Var.d;
                            if (!a0Var.f47991c.S(view) || !a0Var.d.S(view)) {
                                zs0Var.Q.f();
                                return;
                            }
                            return;
                        }
                        zs0Var.Q.f();
                        return;
                    }
                    zs0Var.Q.f();
                    return;
                }
                return;
            case 25:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) obj;
                premiumPreviewFragment.f33702d0.invalidate();
                if (Build.VERSION.SDK_INT >= 31 && (fVar2 = premiumPreviewFragment.f33725w0) != null) {
                    fVar2.f(i10, i11);
                    premiumPreviewFragment.o0();
                    return;
                }
                return;
            case 26:
                zu0 zu0Var = (zu0) obj;
                if (!zu0Var.getMessagesController().I0) {
                    int abs2 = Math.abs(zu0Var.f44095b.N0() - zu0Var.f44095b.L0()) + 1;
                    int b11 = recyclerView.getAdapter().b();
                    if (abs2 > 0 && zu0Var.f44095b.N0() >= b11 - 10) {
                        zu0Var.getMessagesController().F0(false);
                        return;
                    }
                    return;
                }
                return;
            case 27:
                a01 a01Var = (a01) obj;
                a01Var.e.invalidate();
                b01 b01Var = a01Var.f35511w;
                int i15 = b01.f35885s1;
                b01Var.f21587b.invalidate();
                return;
            case 29:
                ((r31) obj).d1();
                return;
        }
    }

    public h3(sb sbVar) {
        this.f37640a = 5;
        this.f37641b = sbVar;
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
