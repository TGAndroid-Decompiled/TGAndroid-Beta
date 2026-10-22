package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class k3 extends s4.r0 {
    public final int f38408a;
    public final Object f38409b;

    public k3(Object obj, int i10) {
        this.f38408a = i10;
        this.f38409b = obj;
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
        switch (this.f38408a) {
            case 0:
                if (i10 == 0) {
                    ((o3) this.f38409b).K.O0.V();
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
                vb vbVar = (vb) this.f38409b;
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
                    AndroidUtilities.hideKeyboard(((qn) this.f38409b).X0);
                    return;
                }
                return;
            case 6:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((bq) this.f38409b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 7:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((hr) this.f38409b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 8:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((ot) this.f38409b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 11:
                y10 y10Var = (y10) this.f38409b;
                if (i10 == 0) {
                    kVar = ((org.telegram.ui.ActionBar.n2) y10Var).actionBar;
                    int dp = AndroidUtilities.dp(16.0f) + kVar.getBottom();
                    if (y10Var.v > 0.5f) {
                        y10Var.f43328c.v0(0, y10Var.f43331r - dp, null);
                        return;
                    }
                    if (y10Var.f43328c.getLayoutManager() != null) {
                        view = y10Var.f43328c.getLayoutManager().m(0);
                    } else {
                        view = null;
                    }
                    if (view != null && view.getTop() < 0) {
                        y10Var.f43328c.v0(0, view.getTop(), null);
                        return;
                    }
                    return;
                }
                return;
            case 12:
                z50 z50Var = (z50) this.f38409b;
                if (i10 == 0) {
                    float f7 = z50Var.A0;
                    if (f7 >= 0.5f && f7 < 1.0f) {
                        kVar2 = ((org.telegram.ui.ActionBar.n2) z50Var).actionBar;
                        int bottom = kVar2.getBottom();
                        s4.n0 layoutManager = z50Var.M.getLayoutManager();
                        if (layoutManager != null && (m10 = layoutManager.m(0)) != null) {
                            z50Var.M.v0(0, m10.getBottom() - bottom, null);
                            return;
                        }
                        return;
                    } else if (f7 < 0.5f) {
                        if (z50Var.M.getLayoutManager() != null) {
                            view2 = z50Var.M.getLayoutManager().m(0);
                        } else {
                            view2 = null;
                        }
                        if (view2 != null && view2.getTop() < 0) {
                            z50Var.M.v0(0, view2.getTop(), null);
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 13:
                l60 l60Var = (l60) this.f38409b;
                if (i10 == 1) {
                    l60Var.f38812f.f27729r.hideActionMode();
                    AndroidUtilities.hideKeyboard(l60Var.f38812f.f27729r);
                    return;
                }
                return;
            case 14:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((s60) this.f38409b).f41379c);
                    return;
                }
                return;
            case 15:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((a70) this.f38409b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 16:
                r70 r70Var = (r70) this.f38409b;
                if (i10 == 1) {
                    r70Var.d.d.hideActionMode();
                    AndroidUtilities.hideKeyboard(r70Var.d.d);
                    return;
                }
                return;
            case 17:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((LanguageSelectActivity) this.f38409b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 18:
                if (i10 == 1) {
                    nc0 nc0Var = (nc0) this.f38409b;
                    if (nc0Var.f39523r0 && nc0Var.f39525s0) {
                        AndroidUtilities.hideKeyboard(nc0Var.getParentActivity().getCurrentFocus());
                        return;
                    }
                    return;
                }
                return;
            case 20:
                return;
            case 21:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((bj0) this.f38409b).Y.getEditText());
                    return;
                }
                return;
            case 22:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((NotificationsCustomSettingsActivity) this.f38409b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 23:
                return;
            case 24:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.f38409b;
                if (i10 == 0) {
                    kVar3 = ((org.telegram.ui.ActionBar.n2) premiumPreviewFragment).actionBar;
                    int dp2 = AndroidUtilities.dp(16.0f) + kVar3.getBottom();
                    if (premiumPreviewFragment.f33510f0 > 0.5f) {
                        premiumPreviewFragment.f33501a.v0(0, premiumPreviewFragment.f33506c0 - dp2, null);
                        return;
                    }
                    if (premiumPreviewFragment.f33501a.getLayoutManager() != null) {
                        view3 = premiumPreviewFragment.f33501a.getLayoutManager().m(0);
                    } else {
                        view3 = null;
                    }
                    if (view3 != null && view3.getTop() < 0) {
                        premiumPreviewFragment.f33501a.v0(0, view3.getTop(), null);
                        return;
                    }
                    return;
                }
                return;
            case 27:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((r21) this.f38409b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 29:
                if (i10 == 0) {
                    ((kc1) this.f38409b).f38567r0 = false;
                    return;
                }
                return;
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i10, int i11) {
        h00 h00Var;
        org.telegram.ui.Cells.d3 d3Var;
        org.telegram.ui.ActionBar.k kVar;
        int i12;
        bh.f fVar;
        bh.f fVar2;
        s4.b1 T;
        org.telegram.ui.Components.r40 r40Var;
        bh.f fVar3;
        bh.f fVar4;
        int i13 = this.f38408a;
        boolean z10 = false;
        int i14 = 0;
        Object obj = this.f38409b;
        switch (i13) {
            case 0:
                o3 o3Var = (o3) obj;
                if (recyclerView.getChildCount() != 0) {
                    recyclerView.invalidate();
                    o3Var.K.O0.G();
                    l4 l4Var = o3Var.K;
                    x3 x3Var = l4Var.K;
                    if (x3Var != null) {
                        x3Var.f43014c.invalidate();
                    } else {
                        ArticleViewer$WindowView articleViewer$WindowView = l4Var.f38768f0;
                        if (articleViewer$WindowView != null) {
                            articleViewer$WindowView.invalidate();
                        }
                    }
                    o3Var.K.f0();
                    l4 l4Var2 = o3Var.K;
                    x3 x3Var2 = l4Var2.K;
                    if (x3Var2 == null || x3Var2.F) {
                        l4Var2.X(l4Var2.I0 - i11);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                p pVar = (p) obj;
                if (!pVar.I && !pVar.f40029r && pVar.d.N0() > pVar.E - 2) {
                    pVar.W();
                    return;
                }
                return;
            case 2:
                l4 l4Var3 = (l4) obj;
                if (l4Var3.f38771i0.f42704w.I1) {
                    AndroidUtilities.hideKeyboard(l4Var3.f38770h0.f42791b0);
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
                vu vuVar = (vu) obj;
                org.telegram.ui.Components.va vaVar = vuVar.f24887s;
                if (vaVar != null) {
                    vuVar.f24888w = !vaVar.Z();
                    vaVar.invalidate();
                    return;
                }
                return;
            case 10:
                n00 n00Var = (n00) obj;
                if (n00Var.f39378a.I1 && (h00Var = n00Var.K) != null && (d3Var = h00Var.f22232b) != null) {
                    if (d3Var.e) {
                        d3Var.k(true);
                        return;
                    } else {
                        d3Var.d();
                        return;
                    }
                }
                return;
            case 11:
                ((y10) obj).f43332s.invalidate();
                return;
            case 12:
                z50 z50Var = (z50) obj;
                if (z50Var.f43646z0 == null) {
                    z50Var.f43646z0 = (tc) z50Var.y0(z50Var.Z);
                }
                int measuredHeight = z50Var.f43646z0.getMeasuredHeight();
                kVar = ((org.telegram.ui.ActionBar.n2) z50Var).actionBar;
                int measuredHeight2 = measuredHeight - kVar.getMeasuredHeight();
                float top = z50Var.f43646z0.getTop() * (-1);
                float f7 = measuredHeight2;
                float max = Math.max(Math.min(1.0f, top / f7), 0.0f);
                z50Var.A0 = max;
                float min = Math.min(max * 2.0f, 1.0f);
                float min2 = Math.min(Math.max(z50Var.A0 - 0.45f, 0.0f) * 2.0f, 1.0f);
                z50Var.f43646z0.f41640b.setAlpha(AndroidUtilities.lerp(1.0f, 0.0f, min));
                z50Var.f43646z0.f41642f.setAlpha(AndroidUtilities.lerp(1.0f, 0.0f, min));
                z50Var.f43646z0.f41641c.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, min2));
                if (z50Var.A0 >= 1.0f) {
                    z50Var.f43646z0.setTranslationY(top - f7);
                    return;
                } else {
                    z50Var.f43646z0.setTranslationY(0.0f);
                    return;
                }
            case 13:
                l60 l60Var = (l60) obj;
                int L0 = l60Var.f38825r.L0();
                View childAt = l60Var.f38820n.getChildAt(0);
                if (childAt != null) {
                    i12 = childAt.getTop();
                } else {
                    i12 = 0;
                }
                if (L0 != 0 || i12 < l60Var.f38820n.getPaddingTop()) {
                    z10 = true;
                }
                l60Var.e.b(z10, true);
                if (Build.VERSION.SDK_INT >= 31 && (fVar = l60Var.f38823p0) != null) {
                    fVar.f(i10, i11);
                    l60Var.e0();
                    return;
                }
                return;
            case 16:
                r70 r70Var = (r70) obj;
                r70Var.f41081n.L0();
                View childAt2 = r70Var.h.getChildAt(0);
                if (childAt2 != null) {
                    childAt2.getTop();
                }
                if (Build.VERSION.SDK_INT >= 31 && (fVar2 = r70Var.L) != null) {
                    fVar2.f(i10, i11);
                    r70Var.Y();
                    return;
                }
                return;
            case 19:
                ((mi0) obj).J.invalidate();
                return;
            case 20:
                ui0 ui0Var = (ui0) obj;
                int L02 = ui0Var.h.L0();
                if (L02 != -1) {
                    i14 = Math.abs(ui0Var.h.N0() - L02) + 1;
                }
                int h = recyclerView.getAdapter().h();
                if (i14 > 0 && !ui0Var.V && !ui0Var.E && !ui0Var.f42001x.isEmpty() && L02 + i14 >= h - 5 && ui0Var.f42002y) {
                    ui0Var.b0();
                    return;
                }
                return;
            case 22:
                return;
            case 23:
                fv0 fv0Var = (fv0) obj;
                if (i11 != 0 && (r40Var = fv0Var.h) != null) {
                    r40Var.b(true);
                }
                org.telegram.ui.Components.iz0 iz0Var = fv0Var.Q;
                if (iz0Var != null && iz0Var.f27366s) {
                    org.telegram.ui.Components.gz0 delegate = iz0Var.getDelegate();
                    if (delegate instanceof org.telegram.ui.Cells.c6) {
                        sa1 sa1Var = fv0Var.f37105c;
                        View F = sa1Var.F((org.telegram.ui.Cells.c6) delegate);
                        if (F == null) {
                            T = null;
                        } else {
                            T = sa1Var.T(F);
                        }
                        if (T != null) {
                            View view = T.f45920a;
                            if (fv0Var.Q.getDirection() == 0) {
                                fv0Var.Q.setTranslationY((view.getY() - AndroidUtilities.dp(166.0f)) + view.getMeasuredHeight());
                            } else {
                                fv0Var.Q.setTranslationY(view.getY());
                            }
                            s4.b0 b0Var = fv0Var.d;
                            if (!b0Var.f46014c.X(view) || !b0Var.d.X(view)) {
                                fv0Var.Q.f();
                                return;
                            }
                            return;
                        }
                        fv0Var.Q.f();
                        return;
                    }
                    fv0Var.Q.f();
                    return;
                }
                return;
            case 24:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) obj;
                premiumPreviewFragment.f33507d0.invalidate();
                if (Build.VERSION.SDK_INT >= 31 && (fVar3 = premiumPreviewFragment.f33527u0) != null) {
                    fVar3.f(i10, i11);
                    premiumPreviewFragment.j0();
                    return;
                }
                return;
            case 25:
                kx0 kx0Var = (kx0) obj;
                if (!kx0Var.getMessagesController().blockedEndReached) {
                    int abs = Math.abs(kx0Var.f38685b.N0() - kx0Var.f38685b.L0()) + 1;
                    int h10 = recyclerView.getAdapter().h();
                    if (abs > 0 && kx0Var.f38685b.N0() >= h10 - 10) {
                        kx0Var.getMessagesController().getBlockedPeers(false);
                        return;
                    }
                    return;
                }
                return;
            case 26:
                n21 n21Var = (n21) obj;
                n21Var.e.invalidate();
                o21.v(n21Var.v).invalidate();
                return;
            case 28:
                x71 x71Var = (x71) obj;
                x71Var.o0(false, true);
                if (x71Var.f43127c.I1) {
                    AndroidUtilities.hideKeyboard(x71Var.fragmentView);
                }
                if (Build.VERSION.SDK_INT >= 31 && (fVar4 = x71Var.W) != null) {
                    fVar4.f(i10, i11);
                    x71Var.i0();
                    return;
                }
                return;
            case 29:
                kc1 kc1Var = (kc1) obj;
                kc1Var.f38574u0.f1();
                kc1Var.f38567r0 = true;
                return;
        }
    }

    public k3(vb vbVar) {
        this.f38408a = 4;
        this.f38409b = vbVar;
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
