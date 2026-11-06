package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class g3 extends v4.s0 {
    public final int f45767a;
    public final Object f45768b;

    public g3(Object obj, int i7) {
        this.f45767a = i7;
        this.f45768b = obj;
    }

    @Override
    public void a(RecyclerView recyclerView, int i7) {
        View view;
        View view2;
        View m10;
        org.telegram.ui.ActionBar.k kVar;
        View view3;
        switch (this.f45767a) {
            case 0:
                if (i7 == 0) {
                    ((k3) this.f45768b).L.P0.V();
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
                mb mbVar = (mb) this.f45768b;
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
                    org.telegram.messenger.g0.v1(((an) this.f45768b).l1);
                    return;
                }
                return;
            case 7:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(((kp) this.f45768b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 8:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(((oq) this.f45768b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 9:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(((qs) this.f45768b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 12:
                o00 o00Var = (o00) this.f45768b;
                if (i7 == 0) {
                    int L = org.telegram.messenger.g0.L(16.0f) + o00Var.p0().getBottom();
                    if (o00Var.f48171w > 0.5f) {
                        o00Var.f48165c.w0(0, o00Var.f48169r - L, null);
                        return;
                    }
                    if (o00Var.f48165c.getLayoutManager() != null) {
                        view = o00Var.f48165c.getLayoutManager().m(0);
                    } else {
                        view = null;
                    }
                    if (view != null) {
                        if (o00Var.q0() + view.getTop() < 0.0f) {
                            o00Var.f48165c.w0(0, Math.round(o00Var.q0() + view.getTop()), null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 13:
                j40 j40Var = (j40) this.f45768b;
                if (i7 == 0) {
                    float f10 = j40Var.A0;
                    if (f10 >= 0.5f && f10 < 1.0f) {
                        int bottom = j40.o1(j40Var).getBottom();
                        v4.n0 layoutManager = j40Var.M.getLayoutManager();
                        if (layoutManager != null && (m10 = layoutManager.m(0)) != null) {
                            j40Var.M.w0(0, m10.getBottom() - bottom, null);
                            return;
                        }
                        return;
                    } else if (f10 < 0.5f) {
                        if (j40Var.M.getLayoutManager() != null) {
                            view2 = j40Var.M.getLayoutManager().m(0);
                        } else {
                            view2 = null;
                        }
                        if (view2 != null && view2.getTop() < 0) {
                            j40Var.M.w0(0, view2.getTop(), null);
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 14:
                w40 w40Var = (w40) this.f45768b;
                if (i7 == 1) {
                    w40Var.f50927f.f37557r.m();
                    org.telegram.messenger.g0.v1(w40Var.f50927f.f37557r);
                    return;
                }
                return;
            case 15:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(((d50) this.f45768b).f44924c);
                    return;
                }
                return;
            case 16:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(((m50) this.f45768b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 17:
                z50 z50Var = (z50) this.f45768b;
                if (i7 == 1 && z50.b0(z50Var).F) {
                    org.telegram.messenger.g0.v1(z50.c0(z50Var).getSearchField());
                    return;
                }
                return;
            case 18:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(((LanguageSelectActivity) this.f45768b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 20:
                return;
            case 21:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(((qg0) this.f45768b).Q1.getEditText());
                    return;
                }
                return;
            case 22:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(((NotificationsCustomSettingsActivity) this.f45768b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 23:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(((xm0) this.f45768b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 24:
                return;
            case 25:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.f45768b;
                if (i7 == 0) {
                    kVar = ((org.telegram.ui.ActionBar.f2) premiumPreviewFragment).actionBar;
                    int L2 = org.telegram.messenger.g0.L(16.0f) + kVar.getBottom();
                    if (premiumPreviewFragment.f41587f0 > 0.5f) {
                        premiumPreviewFragment.f41577a.w0(0, premiumPreviewFragment.f41582c0 - L2, null);
                        return;
                    }
                    if (premiumPreviewFragment.f41577a.getLayoutManager() != null) {
                        view3 = premiumPreviewFragment.f41577a.getLayoutManager().m(0);
                    } else {
                        view3 = null;
                    }
                    if (view3 != null && view3.getTop() < 0) {
                        premiumPreviewFragment.f41577a.w0(0, view3.getTop(), null);
                        return;
                    }
                    return;
                }
                return;
            case 29:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(((qy0) this.f45768b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i7, int i10) {
        bz bzVar;
        org.telegram.ui.Cells.f3 f3Var;
        int i11;
        dh.g gVar;
        int abs;
        v4.d1 T;
        org.telegram.ui.Components.y20 y20Var;
        dh.g gVar2;
        int i12 = this.f45767a;
        boolean z9 = false;
        boolean z10 = false;
        int i13 = 0;
        boolean z11 = false;
        r4 = false;
        boolean z12 = false;
        Object obj = this.f45768b;
        switch (i12) {
            case 0:
                k3 k3Var = (k3) obj;
                if (recyclerView.getChildCount() != 0) {
                    recyclerView.invalidate();
                    k3Var.L.P0.G();
                    g4 g4Var = k3Var.L;
                    t3 t3Var = g4Var.K;
                    if (t3Var != null) {
                        t3Var.f49876c.invalidate();
                    } else {
                        ArticleViewer$WindowView articleViewer$WindowView = g4Var.f45802f0;
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
                if (!oVar.I && !oVar.f48158r && oVar.d.N0() > oVar.E - 2) {
                    oVar.b0();
                    return;
                }
                return;
            case 2:
                g4 g4Var3 = (g4) obj;
                if (g4Var3.f45805i0.f51161x.I1) {
                    org.telegram.messenger.g0.v1(g4Var3.f45804h0.f51177b0);
                    return;
                }
                return;
            case 3:
                y6 y6Var = (y6) obj;
                if (y6Var.f52087b.canScrollVertically(-1) || y6.f0(y6Var).s()) {
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
                mbVar.f47746w.invalidate();
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
                wt wtVar = (wt) obj;
                org.telegram.ui.Components.ha haVar = wtVar.f36332q1;
                if (haVar != null) {
                    org.telegram.ui.Components.ya0 ya0Var = haVar.f40878h0;
                    if (ya0Var != null && ya0Var.getTop() == haVar.f40880j0) {
                        z12 = true;
                    }
                    wtVar.f36334s1 = !z12;
                    haVar.invalidate();
                    return;
                }
                return;
            case 11:
                gz gzVar = (gz) obj;
                if (gzVar.f46140a.I1 && (bzVar = gzVar.K) != null && (f3Var = bzVar.f29248b) != null) {
                    if (f3Var.f35416e) {
                        f3Var.k(true);
                        return;
                    } else {
                        f3Var.d();
                        return;
                    }
                }
                return;
            case 12:
                ((o00) obj).f48170s.invalidate();
                return;
            case 13:
                j40 j40Var = (j40) obj;
                if (j40Var.f46812z0 == null) {
                    j40Var.f46812z0 = (kc) j40Var.F0(j40Var.Z);
                }
                int measuredHeight = j40Var.f46812z0.getMeasuredHeight() - j40.n1(j40Var).getMeasuredHeight();
                float top = j40Var.f46812z0.getTop() * (-1);
                float f10 = measuredHeight;
                float max = Math.max(Math.min(1.0f, top / f10), 0.0f);
                j40Var.A0 = max;
                float min = Math.min(max * 2.0f, 1.0f);
                float min2 = Math.min(Math.max(j40Var.A0 - 0.45f, 0.0f) * 2.0f, 1.0f);
                j40Var.f46812z0.f47140b.setAlpha(org.telegram.messenger.g0.T1(1.0f, 0.0f, min));
                j40Var.f46812z0.f47143f.setAlpha(org.telegram.messenger.g0.T1(1.0f, 0.0f, min));
                j40Var.f46812z0.f47141c.setAlpha(org.telegram.messenger.g0.T1(0.0f, 1.0f, min2));
                if (j40Var.A0 >= 1.0f) {
                    j40Var.f46812z0.setTranslationY(top - f10);
                    return;
                } else {
                    j40Var.f46812z0.setTranslationY(0.0f);
                    return;
                }
            case 14:
                w40 w40Var = (w40) obj;
                int L0 = w40Var.f50940r.L0();
                View childAt = w40Var.f50935n.getChildAt(0);
                if (childAt != null) {
                    i11 = childAt.getTop();
                } else {
                    i11 = 0;
                }
                if (L0 != 0 || i11 < w40Var.f50935n.getPaddingTop()) {
                    z11 = true;
                }
                ((te.a) w40Var.f50925e.f12598c).a(z11, true);
                if (Build.VERSION.SDK_INT >= 31 && (gVar = w40Var.f50938p0) != null) {
                    gVar.f(i7, i10);
                    w40Var.j0();
                    return;
                }
                return;
            case 19:
                ((bg0) obj).J.invalidate();
                return;
            case 20:
                jg0 jg0Var = (jg0) obj;
                int L02 = jg0Var.h.L0();
                if (L02 != -1) {
                    i13 = Math.abs(jg0Var.h.N0() - L02) + 1;
                }
                int b10 = recyclerView.getAdapter().b();
                if (i13 > 0 && !jg0Var.V && !jg0Var.E && !jg0Var.f46952y.isEmpty() && L02 + i13 >= b10 - 5 && jg0Var.D) {
                    jg0Var.h0();
                    return;
                }
                return;
            case 22:
                return;
            case 23:
                xm0 xm0Var = (xm0) obj;
                if (xm0Var.J == null) {
                    int L03 = xm0Var.M.L0();
                    if (L03 == -1) {
                        abs = 0;
                    } else {
                        abs = Math.abs(xm0Var.M.N0() - L03) + 1;
                    }
                    if (abs > 0 && L03 + abs > xm0Var.M.B() - 2 && !xm0Var.f51917r && !xm0Var.f51919s) {
                        if (xm0Var.f51895a == 1) {
                            z10 = true;
                        }
                        xm0Var.i0(xm0Var.f51924w, xm0Var.f51926x, z10, true);
                        return;
                    }
                    return;
                }
                return;
            case 24:
                or0 or0Var = (or0) obj;
                if (i10 != 0 && (y20Var = or0Var.h) != null) {
                    y20Var.a();
                }
                org.telegram.ui.Components.ow0 ow0Var = or0Var.Q;
                if (ow0Var != null && ow0Var.f36802s) {
                    org.telegram.ui.Components.mw0 delegate = ow0Var.getDelegate();
                    if (delegate instanceof org.telegram.ui.Cells.a6) {
                        e61 e61Var = or0Var.f48511c;
                        View F = e61Var.F((org.telegram.ui.Cells.a6) delegate);
                        if (F == null) {
                            T = null;
                        } else {
                            T = e61Var.T(F);
                        }
                        if (T != null) {
                            View view = T.f56927a;
                            if (or0Var.Q.getDirection() == 0) {
                                or0Var.Q.setTranslationY((view.getY() - org.telegram.messenger.g0.L(166.0f)) + view.getMeasuredHeight());
                            } else {
                                or0Var.Q.setTranslationY(view.getY());
                            }
                            v4.b0 b0Var = or0Var.d;
                            if (!b0Var.f57016c.e(view) || !b0Var.d.e(view)) {
                                or0Var.Q.f();
                                return;
                            }
                            return;
                        }
                        or0Var.Q.f();
                        return;
                    }
                    or0Var.Q.f();
                    return;
                }
                return;
            case 25:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) obj;
                premiumPreviewFragment.f41583d0.invalidate();
                if (Build.VERSION.SDK_INT >= 31 && (gVar2 = premiumPreviewFragment.f41607w0) != null) {
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
                if (!rt0Var.getMessagesController().I0) {
                    int abs2 = Math.abs(rt0Var.f49545b.N0() - rt0Var.f49545b.L0()) + 1;
                    int b11 = recyclerView.getAdapter().b();
                    if (abs2 > 0 && rt0Var.f49545b.N0() >= b11 - 10) {
                        rt0Var.getMessagesController().F0(false);
                        return;
                    }
                    return;
                }
                return;
            case 28:
                ny0 ny0Var = (ny0) obj;
                ny0Var.f48143e.invalidate();
                oy0 oy0Var = ny0Var.f48148w;
                int i14 = oy0.f48572s1;
                oy0Var.f28615b.invalidate();
                return;
        }
    }

    public g3(mb mbVar) {
        this.f45767a = 5;
        this.f45768b = mbVar;
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
