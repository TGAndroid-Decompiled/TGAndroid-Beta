package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class i3 extends s4.u0 {
    public final int f40033a;
    public final Object f40034b;

    public i3(Object obj, int i10) {
        this.f40033a = i10;
        this.f40034b = obj;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        View view;
        View view2;
        org.telegram.ui.ActionBar.k kVar;
        View m10;
        org.telegram.ui.ActionBar.k kVar2;
        View view3;
        switch (this.f40033a) {
            case 0:
                if (i10 == 0) {
                    ((m3) this.f40034b).L.P0.V();
                    return;
                }
                return;
            case 1:
            case 2:
            case 3:
            case 4:
            case 10:
            case 11:
            case 20:
            case 26:
            case 27:
            default:
                return;
            case 5:
                wb wbVar = (wb) this.f40034b;
                if (i10 == 1) {
                    wbVar.S = true;
                    wbVar.V = true;
                    return;
                } else if (i10 == 0) {
                    wbVar.S = false;
                    wbVar.V = false;
                    wbVar.U0(true);
                    return;
                } else {
                    return;
                }
            case 6:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((wn) this.f40034b).f45163j1);
                    return;
                }
                return;
            case 7:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((iq) this.f40034b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 8:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((mr) this.f40034b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 9:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((qt) this.f40034b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 12:
                f20 f20Var = (f20) this.f40034b;
                if (i10 == 0) {
                    int dp = AndroidUtilities.dp(16.0f) + f20Var.l0().getBottom();
                    if (f20Var.v > 0.5f) {
                        f20Var.f39131c.w0(0, f20Var.f39134r - dp, null);
                        return;
                    }
                    if (f20Var.f39131c.getLayoutManager() != null) {
                        view = f20Var.f39131c.getLayoutManager().m(0);
                    } else {
                        view = null;
                    }
                    if (view != null) {
                        if (f20Var.m0() + view.getTop() < 0.0f) {
                            f20Var.f39131c.w0(0, Math.round(f20Var.m0() + view.getTop()), null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 13:
                g60 g60Var = (g60) this.f40034b;
                if (i10 == 0) {
                    float f7 = g60Var.A0;
                    if (f7 >= 0.5f && f7 < 1.0f) {
                        kVar = ((org.telegram.ui.ActionBar.r2) g60Var).actionBar;
                        int bottom = kVar.getBottom();
                        s4.p0 layoutManager = g60Var.M.getLayoutManager();
                        if (layoutManager != null && (m10 = layoutManager.m(0)) != null) {
                            g60Var.M.w0(0, m10.getBottom() - bottom, null);
                            return;
                        }
                        return;
                    } else if (f7 < 0.5f) {
                        if (g60Var.M.getLayoutManager() != null) {
                            view2 = g60Var.M.getLayoutManager().m(0);
                        } else {
                            view2 = null;
                        }
                        if (view2 != null && view2.getTop() < 0) {
                            g60Var.M.w0(0, view2.getTop(), null);
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 14:
                t60 t60Var = (t60) this.f40034b;
                if (i10 == 1) {
                    t60Var.f43505f.f30347r.hideActionMode();
                    AndroidUtilities.hideKeyboard(t60Var.f43505f.f30347r);
                    return;
                }
                return;
            case 15:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((z60) this.f40034b).f46174c);
                    return;
                }
                return;
            case 16:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((h70) this.f40034b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 17:
                y70 y70Var = (y70) this.f40034b;
                if (i10 == 1 && y70.X(y70Var).F) {
                    AndroidUtilities.hideKeyboard(y70.Y(y70Var).getSearchField());
                    return;
                }
                return;
            case 18:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((LanguageSelectActivity) this.f40034b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 19:
                if (i10 == 1) {
                    rc0 rc0Var = (rc0) this.f40034b;
                    if (rc0Var.f42941q0 && rc0Var.f42943r0) {
                        AndroidUtilities.hideKeyboard(rc0Var.getParentActivity().getCurrentFocus());
                        return;
                    }
                    return;
                }
                return;
            case 21:
                return;
            case 22:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((ej0) this.f40034b).Y.getEditText());
                    return;
                }
                return;
            case 23:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((NotificationsCustomSettingsActivity) this.f40034b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 24:
                return;
            case 25:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.f40034b;
                if (i10 == 0) {
                    kVar2 = ((org.telegram.ui.ActionBar.r2) premiumPreviewFragment).actionBar;
                    int dp2 = AndroidUtilities.dp(16.0f) + kVar2.getBottom();
                    if (premiumPreviewFragment.f35898f0 > 0.5f) {
                        premiumPreviewFragment.f35889a.w0(0, premiumPreviewFragment.f35894c0 - dp2, null);
                        return;
                    }
                    if (premiumPreviewFragment.f35889a.getLayoutManager() != null) {
                        view3 = premiumPreviewFragment.f35889a.getLayoutManager().m(0);
                    } else {
                        view3 = null;
                    }
                    if (view3 != null && view3.getTop() < 0) {
                        premiumPreviewFragment.f35889a.w0(0, view3.getTop(), null);
                        return;
                    }
                    return;
                }
                return;
            case 28:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((a31) this.f40034b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 29:
                if (i10 == 0) {
                    f81 f81Var = (f81) this.f40034b;
                    if (f81Var.E != null) {
                        org.telegram.ui.ActionBar.y5 y5Var = f81Var.d;
                        if (y5Var == null || !y5Var.w()) {
                            float f10 = f81Var.X;
                            if (f10 > 0.0f && f10 < 1.0f) {
                                if (f10 >= 0.5f) {
                                    f81Var.f39260c.w0(0, (int) (-(f81Var.Z - f81Var.Y)), org.telegram.ui.Components.ds.h);
                                    return;
                                } else {
                                    f81Var.f39260c.w0(0, (int) Math.ceil(f81Var.Y - f81Var.f39257a0), org.telegram.ui.Components.ds.h);
                                    return;
                                }
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i10, int i11) {
        k00 k00Var;
        org.telegram.ui.Cells.b3 b3Var;
        org.telegram.ui.ActionBar.k kVar;
        int i12;
        ch.f fVar;
        s4.e1 T;
        org.telegram.ui.Components.t40 t40Var;
        ch.f fVar2;
        int i13 = this.f40033a;
        boolean z10 = false;
        int i14 = 0;
        boolean z11 = false;
        r4 = false;
        boolean z12 = false;
        Object obj = this.f40034b;
        switch (i13) {
            case 0:
                m3 m3Var = (m3) obj;
                if (recyclerView.getChildCount() != 0) {
                    recyclerView.invalidate();
                    m3Var.L.P0.G();
                    j4 j4Var = m3Var.L;
                    v3 v3Var = j4Var.K;
                    if (v3Var != null) {
                        v3Var.f44168c.invalidate();
                    } else {
                        ArticleViewer$WindowView articleViewer$WindowView = j4Var.f40400f0;
                        if (articleViewer$WindowView != null) {
                            articleViewer$WindowView.invalidate();
                        }
                    }
                    m3Var.L.f0();
                    j4 j4Var2 = m3Var.L;
                    v3 v3Var2 = j4Var2.K;
                    if (v3Var2 == null || v3Var2.F) {
                        j4Var2.X(j4Var2.J0 - i11);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                o oVar = (o) obj;
                if (!oVar.I && !oVar.f41933r && oVar.d.N0() > oVar.E - 2) {
                    oVar.X();
                    return;
                }
                return;
            case 2:
                j4 j4Var3 = (j4) obj;
                if (j4Var3.f40403i0.f44817w.I1) {
                    AndroidUtilities.hideKeyboard(j4Var3.f40402h0.f44906b0);
                    return;
                }
                return;
            case 3:
                c7 c7Var = (c7) obj;
                if (c7Var.f38190b.canScrollVertically(-1) || c7.b0(c7Var).o()) {
                    z10 = true;
                }
                oe.b bVar = c7Var.S;
                if (bVar != null) {
                    bVar.a(z10, true);
                    return;
                }
                return;
            case 4:
                ((n8) obj).r0();
                return;
            case 5:
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
                    wbVar.R.addListener(new kg.e(this, 21));
                    wbVar.R.start();
                }
                wbVar.P0(true);
                wbVar.d1();
                return;
            case 6:
            case 7:
            case 9:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 22:
            case 28:
            default:
                return;
            case 8:
                return;
            case 10:
                xu xuVar = (xu) obj;
                org.telegram.ui.Components.va vaVar = xuVar.f26795s;
                if (vaVar != null) {
                    org.telegram.ui.Components.ed0 ed0Var = vaVar.f28104n0;
                    if (ed0Var != null && ed0Var.getTop() == vaVar.f28106p0) {
                        z12 = true;
                    }
                    xuVar.f26796w = !z12;
                    vaVar.invalidate();
                    return;
                }
                return;
            case 11:
                q00 q00Var = (q00) obj;
                if (q00Var.f42555a.I1 && (k00Var = q00Var.K) != null && (b3Var = k00Var.f24003b) != null) {
                    if (b3Var.e) {
                        b3Var.k(true);
                        return;
                    } else {
                        b3Var.d();
                        return;
                    }
                }
                return;
            case 12:
                ((f20) obj).f39135s.invalidate();
                return;
            case 13:
                g60 g60Var = (g60) obj;
                if (g60Var.f39515z0 == null) {
                    g60Var.f39515z0 = (uc) g60Var.B0(g60Var.Z);
                }
                int measuredHeight = g60Var.f39515z0.getMeasuredHeight();
                kVar = ((org.telegram.ui.ActionBar.r2) g60Var).actionBar;
                int measuredHeight2 = measuredHeight - kVar.getMeasuredHeight();
                float top = g60Var.f39515z0.getTop() * (-1);
                float f7 = measuredHeight2;
                float max = Math.max(Math.min(1.0f, top / f7), 0.0f);
                g60Var.A0 = max;
                float min = Math.min(max * 2.0f, 1.0f);
                float min2 = Math.min(Math.max(g60Var.A0 - 0.45f, 0.0f) * 2.0f, 1.0f);
                g60Var.f39515z0.f43982b.setAlpha(AndroidUtilities.lerp(1.0f, 0.0f, min));
                g60Var.f39515z0.f43984f.setAlpha(AndroidUtilities.lerp(1.0f, 0.0f, min));
                g60Var.f39515z0.f43983c.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, min2));
                if (g60Var.A0 >= 1.0f) {
                    g60Var.f39515z0.setTranslationY(top - f7);
                    return;
                } else {
                    g60Var.f39515z0.setTranslationY(0.0f);
                    return;
                }
            case 14:
                t60 t60Var = (t60) obj;
                int L0 = t60Var.f43518r.L0();
                View childAt = t60Var.f43513n.getChildAt(0);
                if (childAt != null) {
                    i12 = childAt.getTop();
                } else {
                    i12 = 0;
                }
                if (L0 != 0 || i12 < t60Var.f43513n.getPaddingTop()) {
                    z11 = true;
                }
                ((oe.b) t60Var.e.f10864c).a(z11, true);
                if (Build.VERSION.SDK_INT >= 31 && (fVar = t60Var.f43516p0) != null) {
                    fVar.f(i10, i11);
                    t60Var.f0();
                    return;
                }
                return;
            case 20:
                ((pi0) obj).J.invalidate();
                return;
            case 21:
                xi0 xi0Var = (xi0) obj;
                int L02 = xi0Var.h.L0();
                if (L02 != -1) {
                    i14 = Math.abs(xi0Var.h.N0() - L02) + 1;
                }
                int h = recyclerView.getAdapter().h();
                if (i14 > 0 && !xi0Var.V && !xi0Var.E && !xi0Var.f45708x.isEmpty() && L02 + i14 >= h - 5 && xi0Var.f45709y) {
                    xi0Var.d0();
                    return;
                }
                return;
            case 23:
                return;
            case 24:
                ov0 ov0Var = (ov0) obj;
                if (i11 != 0 && (t40Var = ov0Var.h) != null) {
                    t40Var.b(true);
                }
                org.telegram.ui.Components.uz0 uz0Var = ov0Var.Q;
                if (uz0Var != null && uz0Var.f33497s) {
                    org.telegram.ui.Components.sz0 delegate = uz0Var.getDelegate();
                    if (delegate instanceof org.telegram.ui.Cells.h6) {
                        bb1 bb1Var = ov0Var.f42211c;
                        View F = bb1Var.F((org.telegram.ui.Cells.h6) delegate);
                        if (F == null) {
                            T = null;
                        } else {
                            T = bb1Var.T(F);
                        }
                        if (T != null) {
                            View view = T.f47773a;
                            if (ov0Var.Q.getDirection() == 0) {
                                ov0Var.Q.setTranslationY((view.getY() - AndroidUtilities.dp(166.0f)) + view.getMeasuredHeight());
                            } else {
                                ov0Var.Q.setTranslationY(view.getY());
                            }
                            s4.c0 c0Var = ov0Var.d;
                            if (!c0Var.f47855c.O(view) || !c0Var.d.O(view)) {
                                ov0Var.Q.f();
                                return;
                            }
                            return;
                        }
                        ov0Var.Q.f();
                        return;
                    }
                    ov0Var.Q.f();
                    return;
                }
                return;
            case 25:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) obj;
                premiumPreviewFragment.f35895d0.invalidate();
                if (Build.VERSION.SDK_INT >= 31 && (fVar2 = premiumPreviewFragment.f35920x0) != null) {
                    fVar2.f(i10, i11);
                    premiumPreviewFragment.k0();
                    return;
                }
                return;
            case 26:
                ux0 ux0Var = (ux0) obj;
                if (!ux0Var.getMessagesController().blockedEndReached) {
                    int abs = Math.abs(ux0Var.f44131b.N0() - ux0Var.f44131b.L0()) + 1;
                    int h10 = recyclerView.getAdapter().h();
                    if (abs > 0 && ux0Var.f44131b.N0() >= h10 - 10) {
                        ux0Var.getMessagesController().getBlockedPeers(false);
                        return;
                    }
                    return;
                }
                return;
            case 27:
                w21 w21Var = (w21) obj;
                w21Var.e.invalidate();
                x21.t(w21Var.v).invalidate();
                return;
            case 29:
                f81 f81Var = (f81) obj;
                f81Var.n0(false, true);
                f81Var.o0();
                if (f81Var.f39260c.I1) {
                    AndroidUtilities.hideKeyboard(f81Var.fragmentView);
                    return;
                }
                return;
        }
    }

    public i3(wb wbVar) {
        this.f40033a = 5;
        this.f40034b = wbVar;
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
