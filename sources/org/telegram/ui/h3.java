package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class h3 extends s4.s0 {
    public final int f34122a;
    public final Object f34123b;

    public h3(Object obj, int i10) {
        this.f34122a = i10;
        this.f34123b = obj;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        org.telegram.ui.ActionBar.k kVar;
        View view;
        View view2;
        View m10;
        org.telegram.ui.ActionBar.k kVar2;
        View view3;
        switch (this.f34122a) {
            case 0:
                if (i10 == 0) {
                    ((l3) this.f34123b).K.O0.W();
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
                wb wbVar = (wb) this.f34123b;
                if (i10 == 1) {
                    wbVar.S = true;
                    wbVar.V = true;
                    return;
                } else if (i10 == 0) {
                    wbVar.S = false;
                    wbVar.V = false;
                    wbVar.T0(true);
                    return;
                } else {
                    return;
                }
            case 5:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((bo) this.f34123b).X0);
                    return;
                }
                return;
            case 6:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((pq) this.f34123b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 7:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((ur) this.f34123b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 8:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((cu) this.f34123b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 11:
                t20 t20Var = (t20) this.f34123b;
                if (i10 == 0) {
                    kVar = ((org.telegram.ui.ActionBar.o2) t20Var).actionBar;
                    int dp = AndroidUtilities.dp(16.0f) + kVar.getBottom();
                    if (t20Var.v > 0.5f) {
                        t20Var.f37628c.w0(0, t20Var.f37631r - dp, null);
                        return;
                    }
                    if (t20Var.f37628c.getLayoutManager() != null) {
                        view = t20Var.f37628c.getLayoutManager().m(0);
                    } else {
                        view = null;
                    }
                    if (view != null && view.getTop() < 0) {
                        t20Var.f37628c.w0(0, view.getTop(), null);
                        return;
                    }
                    return;
                }
                return;
            case 12:
                u60 u60Var = (u60) this.f34123b;
                if (i10 == 0) {
                    float f7 = u60Var.A0;
                    if (f7 >= 0.5f && f7 < 1.0f) {
                        int bottom = u60.h1(u60Var).getBottom();
                        s4.o0 layoutManager = u60Var.M.getLayoutManager();
                        if (layoutManager != null && (m10 = layoutManager.m(0)) != null) {
                            u60Var.M.w0(0, m10.getBottom() - bottom, null);
                            return;
                        }
                        return;
                    } else if (f7 < 0.5f) {
                        if (u60Var.M.getLayoutManager() != null) {
                            view2 = u60Var.M.getLayoutManager().m(0);
                        } else {
                            view2 = null;
                        }
                        if (view2 != null && view2.getTop() < 0) {
                            u60Var.M.w0(0, view2.getTop(), null);
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 13:
                g70 g70Var = (g70) this.f34123b;
                if (i10 == 1) {
                    g70Var.f33879f.f22546r.hideActionMode();
                    AndroidUtilities.hideKeyboard(g70Var.f33879f.f22546r);
                    return;
                }
                return;
            case 14:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((n70) this.f34123b).f35963c);
                    return;
                }
                return;
            case 15:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((v70) this.f34123b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 16:
                n80 n80Var = (n80) this.f34123b;
                if (i10 == 1) {
                    n80Var.d.d.hideActionMode();
                    AndroidUtilities.hideKeyboard(n80Var.d.d);
                    return;
                }
                return;
            case 17:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((LanguageSelectActivity) this.f34123b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 18:
                if (i10 == 1) {
                    kd0 kd0Var = (kd0) this.f34123b;
                    if (kd0Var.f35241r0 && kd0Var.f35243s0) {
                        AndroidUtilities.hideKeyboard(kd0Var.getParentActivity().getCurrentFocus());
                        return;
                    }
                    return;
                }
                return;
            case 20:
                return;
            case 21:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((tj0) this.f34123b).Y.getEditText());
                    return;
                }
                return;
            case 22:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((NotificationsCustomSettingsActivity) this.f34123b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 23:
                return;
            case 24:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.f34123b;
                if (i10 == 0) {
                    kVar2 = ((org.telegram.ui.ActionBar.o2) premiumPreviewFragment).actionBar;
                    int dp2 = AndroidUtilities.dp(16.0f) + kVar2.getBottom();
                    if (premiumPreviewFragment.f31181f0 > 0.5f) {
                        premiumPreviewFragment.f31172a.w0(0, premiumPreviewFragment.f31177c0 - dp2, null);
                        return;
                    }
                    if (premiumPreviewFragment.f31172a.getLayoutManager() != null) {
                        view3 = premiumPreviewFragment.f31172a.getLayoutManager().m(0);
                    } else {
                        view3 = null;
                    }
                    if (view3 != null && view3.getTop() < 0) {
                        premiumPreviewFragment.f31172a.w0(0, view3.getTop(), null);
                        return;
                    }
                    return;
                }
                return;
            case 27:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((g41) this.f34123b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 29:
                if (i10 == 0) {
                    ((xd1) this.f34123b).f39583r0 = false;
                    return;
                }
                return;
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i10, int i11) {
        b10 b10Var;
        org.telegram.ui.Cells.d3 d3Var;
        int i12;
        ah.i iVar;
        ah.i iVar2;
        s4.c1 U;
        org.telegram.ui.Components.i40 i40Var;
        ah.i iVar3;
        ViewGroup viewGroup;
        ah.i iVar4;
        int i13 = this.f34122a;
        boolean z10 = false;
        int i14 = 0;
        boolean z11 = false;
        z10 = false;
        Object obj = this.f34123b;
        switch (i13) {
            case 0:
                l3 l3Var = (l3) obj;
                if (recyclerView.getChildCount() != 0) {
                    recyclerView.invalidate();
                    l3Var.K.O0.H();
                    h4 h4Var = l3Var.K;
                    u3 u3Var = h4Var.K;
                    if (u3Var != null) {
                        u3Var.f37926c.invalidate();
                    } else {
                        ArticleViewer$WindowView articleViewer$WindowView = h4Var.f34159f0;
                        if (articleViewer$WindowView != null) {
                            articleViewer$WindowView.invalidate();
                        }
                    }
                    l3Var.K.f0();
                    h4 h4Var2 = l3Var.K;
                    u3 u3Var2 = h4Var2.K;
                    if (u3Var2 == null || u3Var2.F) {
                        h4Var2.X(h4Var2.I0 - i11);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                p pVar = (p) obj;
                if (!pVar.I && !pVar.f36475r && pVar.d.N0() > pVar.E - 2) {
                    pVar.W();
                    return;
                }
                return;
            case 2:
                h4 h4Var3 = (h4) obj;
                if (h4Var3.f34162i0.f38855w.K1) {
                    AndroidUtilities.hideKeyboard(h4Var3.f34161h0.f38957b0);
                    return;
                }
                return;
            case 3:
                ((j8) obj).p0();
                return;
            case 4:
                wb wbVar = (wb) obj;
                wbVar.v.invalidate();
                if (i11 != 0 && wbVar.S && !wbVar.Q && wbVar.M.getTag() == null) {
                    AnimatorSet animatorSet = wbVar.R;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                    }
                    wbVar.M.setTag(1);
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    wbVar.R = animatorSet2;
                    animatorSet2.setDuration(150L);
                    wbVar.R.playTogether(ObjectAnimator.ofFloat(wbVar.M, "alpha", 1.0f));
                    wbVar.R.addListener(new t4(this, 14));
                    wbVar.R.start();
                }
                wbVar.O0(true);
                wbVar.c1();
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
                lv lvVar = (lv) obj;
                org.telegram.ui.Components.ta taVar = lvVar.f30456s;
                if (taVar != null) {
                    org.telegram.ui.Components.lc0 lc0Var = taVar.f26130y0;
                    if (lc0Var != null && lc0Var.getTop() == taVar.A0) {
                        z10 = true;
                    }
                    lvVar.f30457w = !z10;
                    taVar.invalidate();
                    return;
                }
                return;
            case 10:
                h10 h10Var = (h10) obj;
                if (h10Var.f34091a.K1 && (b10Var = h10Var.K) != null && (d3Var = b10Var.f20075b) != null) {
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
                ((t20) obj).f37632s.invalidate();
                return;
            case 12:
                u60 u60Var = (u60) obj;
                if (u60Var.f37950z0 == null) {
                    u60Var.f37950z0 = (vc) u60Var.y0(u60Var.Z);
                }
                int measuredHeight = u60Var.f37950z0.getMeasuredHeight() - u60.g1(u60Var).getMeasuredHeight();
                float top = u60Var.f37950z0.getTop() * (-1);
                float f7 = measuredHeight;
                float max = Math.max(Math.min(1.0f, top / f7), 0.0f);
                u60Var.A0 = max;
                float min = Math.min(max * 2.0f, 1.0f);
                float min2 = Math.min(Math.max(u60Var.A0 - 0.45f, 0.0f) * 2.0f, 1.0f);
                u60Var.f37950z0.f38388b.setAlpha(AndroidUtilities.lerp(1.0f, 0.0f, min));
                u60Var.f37950z0.f38390f.setAlpha(AndroidUtilities.lerp(1.0f, 0.0f, min));
                u60Var.f37950z0.f38389c.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, min2));
                if (u60Var.A0 >= 1.0f) {
                    u60Var.f37950z0.setTranslationY(top - f7);
                    return;
                } else {
                    u60Var.f37950z0.setTranslationY(0.0f);
                    return;
                }
            case 13:
                g70 g70Var = (g70) obj;
                int L0 = g70Var.f33892r.L0();
                View childAt = g70Var.f33887n.getChildAt(0);
                if (childAt != null) {
                    i12 = childAt.getTop();
                } else {
                    i12 = 0;
                }
                g70Var.e.b((L0 != 0 || i12 < g70Var.f33887n.getPaddingTop()) ? true : true, true);
                if (Build.VERSION.SDK_INT >= 31 && (iVar = g70Var.f33890p0) != null) {
                    iVar.f(i10, i11);
                    g70Var.e0();
                    return;
                }
                return;
            case 16:
                n80 n80Var = (n80) obj;
                n80Var.f35976n.L0();
                View childAt2 = n80Var.h.getChildAt(0);
                if (childAt2 != null) {
                    childAt2.getTop();
                }
                if (Build.VERSION.SDK_INT >= 31 && (iVar2 = n80Var.L) != null) {
                    iVar2.f(i10, i11);
                    n80Var.Y();
                    return;
                }
                return;
            case 19:
                ((dj0) obj).K.invalidate();
                return;
            case 20:
                lj0 lj0Var = (lj0) obj;
                int L02 = lj0Var.h.L0();
                if (L02 != -1) {
                    i14 = Math.abs(lj0Var.h.N0() - L02) + 1;
                }
                int h = recyclerView.getAdapter().h();
                if (i14 > 0 && !lj0Var.V && !lj0Var.E && !lj0Var.f35579x.isEmpty() && L02 + i14 >= h - 5 && lj0Var.f35580y) {
                    lj0Var.b0();
                    return;
                }
                return;
            case 22:
                return;
            case 23:
                cw0 cw0Var = (cw0) obj;
                if (i11 != 0 && (i40Var = cw0Var.h) != null) {
                    i40Var.b(true);
                }
                org.telegram.ui.Components.oy0 oy0Var = cw0Var.Q;
                if (oy0Var != null && oy0Var.f26895s) {
                    org.telegram.ui.Components.my0 delegate = oy0Var.getDelegate();
                    if (delegate instanceof org.telegram.ui.Cells.c6) {
                        fc1 fc1Var = cw0Var.f32938c;
                        View G = fc1Var.G((org.telegram.ui.Cells.c6) delegate);
                        if (G == null) {
                            U = null;
                        } else {
                            U = fc1Var.U(G);
                        }
                        if (U != null) {
                            View view = U.f42702a;
                            if (cw0Var.Q.getDirection() == 0) {
                                cw0Var.Q.setTranslationY((view.getY() - AndroidUtilities.dp(166.0f)) + view.getMeasuredHeight());
                            } else {
                                cw0Var.Q.setTranslationY(view.getY());
                            }
                            s4.c0 c0Var = cw0Var.d;
                            if (!c0Var.f42796c.v(view) || !c0Var.d.v(view)) {
                                cw0Var.Q.f();
                                return;
                            }
                            return;
                        }
                        cw0Var.Q.f();
                        return;
                    }
                    cw0Var.Q.f();
                    return;
                }
                return;
            case 24:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) obj;
                premiumPreviewFragment.f31178d0.invalidate();
                if (Build.VERSION.SDK_INT >= 31 && (iVar3 = premiumPreviewFragment.f31198u0) != null) {
                    iVar3.f(i10, i11);
                    premiumPreviewFragment.j0();
                    return;
                }
                return;
            case 25:
                iy0 iy0Var = (iy0) obj;
                if (!iy0Var.getMessagesController().blockedEndReached) {
                    int abs = Math.abs(iy0Var.f34712b.N0() - iy0Var.f34712b.L0()) + 1;
                    int h10 = recyclerView.getAdapter().h();
                    if (abs > 0 && iy0Var.f34712b.N0() >= h10 - 10) {
                        iy0Var.getMessagesController().getBlockedPeers(false);
                        return;
                    }
                    return;
                }
                return;
            case 26:
                c41 c41Var = (c41) obj;
                c41Var.e.invalidate();
                viewGroup = ((org.telegram.ui.ActionBar.g3) c41Var.v).containerView;
                viewGroup.invalidate();
                return;
            case 28:
                g91 g91Var = (g91) obj;
                g91Var.o0(false, true);
                if (g91Var.f33925c.K1) {
                    AndroidUtilities.hideKeyboard(g91Var.fragmentView);
                }
                if (Build.VERSION.SDK_INT >= 31 && (iVar4 = g91Var.V) != null) {
                    iVar4.f(i10, i11);
                    g91Var.i0();
                    return;
                }
                return;
            case 29:
                xd1 xd1Var = (xd1) obj;
                xd1Var.f39590u0.g1();
                xd1Var.f39583r0 = true;
                return;
        }
    }

    public h3(wb wbVar) {
        this.f34122a = 4;
        this.f34123b = wbVar;
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
