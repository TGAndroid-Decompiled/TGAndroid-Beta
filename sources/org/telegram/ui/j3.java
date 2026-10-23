package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class j3 extends s4.r0 {
    public final int f38451a;
    public final Object f38452b;

    public j3(Object obj, int i10) {
        this.f38451a = i10;
        this.f38452b = obj;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        org.telegram.ui.ActionBar.k kVar;
        View view;
        View view2;
        org.telegram.ui.ActionBar.k kVar2;
        View m10;
        org.telegram.ui.ActionBar.k kVar3;
        View view3;
        switch (this.f38451a) {
            case 0:
                if (i10 == 0) {
                    ((n3) this.f38452b).L.P0.V();
                    return;
                }
                return;
            case 1:
            case 2:
            case 3:
            case 9:
            case 10:
            case 19:
            case 25:
            case 26:
            case 28:
            default:
                return;
            case 4:
                vb vbVar = (vb) this.f38452b;
                if (i10 == 1) {
                    vbVar.S = true;
                    vbVar.V = true;
                    return;
                } else if (i10 == 0) {
                    vbVar.S = false;
                    vbVar.V = false;
                    vbVar.T0(true);
                    return;
                } else {
                    return;
                }
            case 5:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((sn) this.f38452b).f41561j1);
                    return;
                }
                return;
            case 6:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((dq) this.f38452b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 7:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((jr) this.f38452b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 8:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((rt) this.f38452b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 11:
                b20 b20Var = (b20) this.f38452b;
                if (i10 == 0) {
                    kVar = ((org.telegram.ui.ActionBar.o2) b20Var).actionBar;
                    int dp = AndroidUtilities.dp(16.0f) + kVar.getBottom();
                    if (b20Var.v > 0.5f) {
                        b20Var.f35826c.v0(0, b20Var.f35829r - dp, null);
                        return;
                    }
                    if (b20Var.f35826c.getLayoutManager() != null) {
                        view = b20Var.f35826c.getLayoutManager().m(0);
                    } else {
                        view = null;
                    }
                    if (view != null && view.getTop() < 0) {
                        b20Var.f35826c.v0(0, view.getTop(), null);
                        return;
                    }
                    return;
                }
                return;
            case 12:
                d60 d60Var = (d60) this.f38452b;
                if (i10 == 0) {
                    float f7 = d60Var.A0;
                    if (f7 >= 0.5f && f7 < 1.0f) {
                        kVar2 = ((org.telegram.ui.ActionBar.o2) d60Var).actionBar;
                        int bottom = kVar2.getBottom();
                        s4.n0 layoutManager = d60Var.M.getLayoutManager();
                        if (layoutManager != null && (m10 = layoutManager.m(0)) != null) {
                            d60Var.M.v0(0, m10.getBottom() - bottom, null);
                            return;
                        }
                        return;
                    } else if (f7 < 0.5f) {
                        if (d60Var.M.getLayoutManager() != null) {
                            view2 = d60Var.M.getLayoutManager().m(0);
                        } else {
                            view2 = null;
                        }
                        if (view2 != null && view2.getTop() < 0) {
                            d60Var.M.v0(0, view2.getTop(), null);
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 13:
                p60 p60Var = (p60) this.f38452b;
                if (i10 == 1) {
                    p60Var.f40364f.f27836r.hideActionMode();
                    AndroidUtilities.hideKeyboard(p60Var.f40364f.f27836r);
                    return;
                }
                return;
            case 14:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((w60) this.f38452b).f42937c);
                    return;
                }
                return;
            case 15:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((e70) this.f38452b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 16:
                x70 x70Var = (x70) this.f38452b;
                if (i10 == 1) {
                    x70Var.d.d.hideActionMode();
                    AndroidUtilities.hideKeyboard(x70Var.d.d);
                    return;
                }
                return;
            case 17:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((LanguageSelectActivity) this.f38452b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 18:
                if (i10 == 1) {
                    sc0 sc0Var = (sc0) this.f38452b;
                    if (sc0Var.f41369r0 && sc0Var.f41371s0) {
                        AndroidUtilities.hideKeyboard(sc0Var.getParentActivity().getCurrentFocus());
                        return;
                    }
                    return;
                }
                return;
            case 20:
                return;
            case 21:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((fj0) this.f38452b).Y.getEditText());
                    return;
                }
                return;
            case 22:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((NotificationsCustomSettingsActivity) this.f38452b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 23:
                return;
            case 24:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.f38452b;
                if (i10 == 0) {
                    kVar3 = ((org.telegram.ui.ActionBar.o2) premiumPreviewFragment).actionBar;
                    int dp2 = AndroidUtilities.dp(16.0f) + kVar3.getBottom();
                    if (premiumPreviewFragment.f33808f0 > 0.5f) {
                        premiumPreviewFragment.f33799a.v0(0, premiumPreviewFragment.f33804c0 - dp2, null);
                        return;
                    }
                    if (premiumPreviewFragment.f33799a.getLayoutManager() != null) {
                        view3 = premiumPreviewFragment.f33799a.getLayoutManager().m(0);
                    } else {
                        view3 = null;
                    }
                    if (view3 != null && view3.getTop() < 0) {
                        premiumPreviewFragment.f33799a.v0(0, view3.getTop(), null);
                        return;
                    }
                    return;
                }
                return;
            case 27:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((v21) this.f38452b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 29:
                if (i10 == 0) {
                    ((qc1) this.f38452b).f40764s0 = false;
                    return;
                }
                return;
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i10, int i11) {
        k00 k00Var;
        org.telegram.ui.Cells.c3 c3Var;
        org.telegram.ui.ActionBar.k kVar;
        int i12;
        bh.f fVar;
        bh.f fVar2;
        s4.b1 T;
        org.telegram.ui.Components.r40 r40Var;
        bh.f fVar3;
        bh.f fVar4;
        int i13 = this.f38451a;
        boolean z10 = false;
        int i14 = 0;
        Object obj = this.f38452b;
        switch (i13) {
            case 0:
                n3 n3Var = (n3) obj;
                if (recyclerView.getChildCount() != 0) {
                    recyclerView.invalidate();
                    n3Var.L.P0.G();
                    k4 k4Var = n3Var.L;
                    w3 w3Var = k4Var.K;
                    if (w3Var != null) {
                        w3Var.f42910c.invalidate();
                    } else {
                        ArticleViewer$WindowView articleViewer$WindowView = k4Var.f38791f0;
                        if (articleViewer$WindowView != null) {
                            articleViewer$WindowView.invalidate();
                        }
                    }
                    n3Var.L.f0();
                    k4 k4Var2 = n3Var.L;
                    w3 w3Var2 = k4Var2.K;
                    if (w3Var2 == null || w3Var2.F) {
                        k4Var2.X(k4Var2.J0 - i11);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                o oVar = (o) obj;
                if (!oVar.I && !oVar.f40022r && oVar.d.N0() > oVar.E - 2) {
                    oVar.W();
                    return;
                }
                return;
            case 2:
                k4 k4Var3 = (k4) obj;
                if (k4Var3.f38794i0.f43184w.I1) {
                    AndroidUtilities.hideKeyboard(k4Var3.f38793h0.f43271b0);
                    return;
                }
                return;
            case 3:
                ((k8) obj).p0();
                return;
            case 4:
                vb vbVar = (vb) obj;
                vbVar.v.invalidate();
                if (i11 != 0 && vbVar.S && !vbVar.Q && vbVar.M.getTag() == null) {
                    AnimatorSet animatorSet = vbVar.R;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                    }
                    vbVar.M.setTag(1);
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    vbVar.R = animatorSet2;
                    animatorSet2.setDuration(150L);
                    vbVar.R.playTogether(ObjectAnimator.ofFloat(vbVar.M, "alpha", 1.0f));
                    vbVar.R.addListener(new m.a(this, 19));
                    vbVar.R.start();
                }
                vbVar.O0(true);
                vbVar.c1();
                return;
            case 5:
            case 6:
            case 8:
            case 14:
            case 15:
            case 17:
            case 18:
            case 21:
            case 27:
            default:
                return;
            case 7:
                return;
            case 9:
                yu yuVar = (yu) obj;
                org.telegram.ui.Components.va vaVar = yuVar.f25031s;
                if (vaVar != null) {
                    yuVar.f25032w = !vaVar.Y();
                    vaVar.invalidate();
                    return;
                }
                return;
            case 10:
                q00 q00Var = (q00) obj;
                if (q00Var.f40585a.I1 && (k00Var = q00Var.K) != null && (c3Var = k00Var.f22315b) != null) {
                    if (c3Var.e) {
                        c3Var.k(true);
                        return;
                    } else {
                        c3Var.d();
                        return;
                    }
                }
                return;
            case 11:
                ((b20) obj).f35830s.invalidate();
                return;
            case 12:
                d60 d60Var = (d60) obj;
                if (d60Var.f36520z0 == null) {
                    d60Var.f36520z0 = (tc) d60Var.A0(d60Var.Z);
                }
                int measuredHeight = d60Var.f36520z0.getMeasuredHeight();
                kVar = ((org.telegram.ui.ActionBar.o2) d60Var).actionBar;
                int measuredHeight2 = measuredHeight - kVar.getMeasuredHeight();
                float top = d60Var.f36520z0.getTop() * (-1);
                float f7 = measuredHeight2;
                float max = Math.max(Math.min(1.0f, top / f7), 0.0f);
                d60Var.A0 = max;
                float min = Math.min(max * 2.0f, 1.0f);
                float min2 = Math.min(Math.max(d60Var.A0 - 0.45f, 0.0f) * 2.0f, 1.0f);
                d60Var.f36520z0.f41947b.setAlpha(AndroidUtilities.lerp(1.0f, 0.0f, min));
                d60Var.f36520z0.f41949f.setAlpha(AndroidUtilities.lerp(1.0f, 0.0f, min));
                d60Var.f36520z0.f41948c.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, min2));
                if (d60Var.A0 >= 1.0f) {
                    d60Var.f36520z0.setTranslationY(top - f7);
                    return;
                } else {
                    d60Var.f36520z0.setTranslationY(0.0f);
                    return;
                }
            case 13:
                p60 p60Var = (p60) obj;
                int L0 = p60Var.f40377r.L0();
                View childAt = p60Var.f40372n.getChildAt(0);
                if (childAt != null) {
                    i12 = childAt.getTop();
                } else {
                    i12 = 0;
                }
                if (L0 != 0 || i12 < p60Var.f40372n.getPaddingTop()) {
                    z10 = true;
                }
                p60Var.e.b(z10, true);
                if (Build.VERSION.SDK_INT >= 31 && (fVar = p60Var.f40375p0) != null) {
                    fVar.f(i10, i11);
                    p60Var.e0();
                    return;
                }
                return;
            case 16:
                x70 x70Var = (x70) obj;
                x70Var.f43525n.L0();
                View childAt2 = x70Var.h.getChildAt(0);
                if (childAt2 != null) {
                    childAt2.getTop();
                }
                if (Build.VERSION.SDK_INT >= 31 && (fVar2 = x70Var.L) != null) {
                    fVar2.f(i10, i11);
                    x70Var.Y();
                    return;
                }
                return;
            case 19:
                ((qi0) obj).J.invalidate();
                return;
            case 20:
                yi0 yi0Var = (yi0) obj;
                int L02 = yi0Var.h.L0();
                if (L02 != -1) {
                    i14 = Math.abs(yi0Var.h.N0() - L02) + 1;
                }
                int h = recyclerView.getAdapter().h();
                if (i14 > 0 && !yi0Var.V && !yi0Var.E && !yi0Var.f43886x.isEmpty() && L02 + i14 >= h - 5 && yi0Var.f43887y) {
                    yi0Var.c0();
                    return;
                }
                return;
            case 22:
                return;
            case 23:
                iv0 iv0Var = (iv0) obj;
                if (i11 != 0 && (r40Var = iv0Var.h) != null) {
                    r40Var.b(true);
                }
                org.telegram.ui.Components.lz0 lz0Var = iv0Var.Q;
                if (lz0Var != null && lz0Var.f28451s) {
                    org.telegram.ui.Components.jz0 delegate = lz0Var.getDelegate();
                    if (delegate instanceof org.telegram.ui.Cells.d6) {
                        xa1 xa1Var = iv0Var.f38377c;
                        View F = xa1Var.F((org.telegram.ui.Cells.d6) delegate);
                        if (F == null) {
                            T = null;
                        } else {
                            T = xa1Var.T(F);
                        }
                        if (T != null) {
                            View view = T.f46343a;
                            if (iv0Var.Q.getDirection() == 0) {
                                iv0Var.Q.setTranslationY((view.getY() - AndroidUtilities.dp(166.0f)) + view.getMeasuredHeight());
                            } else {
                                iv0Var.Q.setTranslationY(view.getY());
                            }
                            s4.b0 b0Var = iv0Var.d;
                            if (!b0Var.f46437c.X(view) || !b0Var.d.X(view)) {
                                iv0Var.Q.f();
                                return;
                            }
                            return;
                        }
                        iv0Var.Q.f();
                        return;
                    }
                    iv0Var.Q.f();
                    return;
                }
                return;
            case 24:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) obj;
                premiumPreviewFragment.f33805d0.invalidate();
                if (Build.VERSION.SDK_INT >= 31 && (fVar3 = premiumPreviewFragment.f33830x0) != null) {
                    fVar3.f(i10, i11);
                    premiumPreviewFragment.j0();
                    return;
                }
                return;
            case 25:
                ox0 ox0Var = (ox0) obj;
                if (!ox0Var.getMessagesController().blockedEndReached) {
                    int abs = Math.abs(ox0Var.f40291b.N0() - ox0Var.f40291b.L0()) + 1;
                    int h10 = recyclerView.getAdapter().h();
                    if (abs > 0 && ox0Var.f40291b.N0() >= h10 - 10) {
                        ox0Var.getMessagesController().getBlockedPeers(false);
                        return;
                    }
                    return;
                }
                return;
            case 26:
                r21 r21Var = (r21) obj;
                r21Var.e.invalidate();
                s21.u(r21Var.v).invalidate();
                return;
            case 28:
                c81 c81Var = (c81) obj;
                c81Var.q0(false, true);
                if (c81Var.f36294c.I1) {
                    AndroidUtilities.hideKeyboard(c81Var.fragmentView);
                }
                if (Build.VERSION.SDK_INT >= 31 && (fVar4 = c81Var.X) != null) {
                    fVar4.f(i10, i11);
                    c81Var.k0();
                    return;
                }
                return;
            case 29:
                qc1 qc1Var = (qc1) obj;
                qc1Var.f40770v0.g1();
                qc1Var.f40764s0 = true;
                return;
        }
    }

    public j3(vb vbVar) {
        this.f38451a = 4;
        this.f38452b = vbVar;
        AndroidUtilities.dp(100.0f);
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
