package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class i3 extends s4.u0 {
    public final int f40129a;
    public final Object f40130b;

    public i3(Object obj, int i10) {
        this.f40129a = i10;
        this.f40130b = obj;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        View view;
        View view2;
        org.telegram.ui.ActionBar.k kVar;
        View m10;
        org.telegram.ui.ActionBar.k kVar2;
        View view3;
        switch (this.f40129a) {
            case 0:
                if (i10 == 0) {
                    ((m3) this.f40130b).L.P0.V();
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
                wb wbVar = (wb) this.f40130b;
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
                    AndroidUtilities.hideKeyboard(((un) this.f40130b).f44295j1);
                    return;
                }
                return;
            case 7:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((gq) this.f40130b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 8:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((kr) this.f40130b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 9:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((ot) this.f40130b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 12:
                d20 d20Var = (d20) this.f40130b;
                if (i10 == 0) {
                    int dp = AndroidUtilities.dp(16.0f) + d20Var.l0().getBottom();
                    if (d20Var.v > 0.5f) {
                        d20Var.f38716c.w0(0, d20Var.f38719r - dp, null);
                        return;
                    }
                    if (d20Var.f38716c.getLayoutManager() != null) {
                        view = d20Var.f38716c.getLayoutManager().m(0);
                    } else {
                        view = null;
                    }
                    if (view != null) {
                        if (d20Var.m0() + view.getTop() < 0.0f) {
                            d20Var.f38716c.w0(0, Math.round(d20Var.m0() + view.getTop()), null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 13:
                e60 e60Var = (e60) this.f40130b;
                if (i10 == 0) {
                    float f7 = e60Var.A0;
                    if (f7 >= 0.5f && f7 < 1.0f) {
                        kVar = ((org.telegram.ui.ActionBar.r2) e60Var).actionBar;
                        int bottom = kVar.getBottom();
                        s4.p0 layoutManager = e60Var.M.getLayoutManager();
                        if (layoutManager != null && (m10 = layoutManager.m(0)) != null) {
                            e60Var.M.w0(0, m10.getBottom() - bottom, null);
                            return;
                        }
                        return;
                    } else if (f7 < 0.5f) {
                        if (e60Var.M.getLayoutManager() != null) {
                            view2 = e60Var.M.getLayoutManager().m(0);
                        } else {
                            view2 = null;
                        }
                        if (view2 != null && view2.getTop() < 0) {
                            e60Var.M.w0(0, view2.getTop(), null);
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 14:
                r60 r60Var = (r60) this.f40130b;
                if (i10 == 1) {
                    r60Var.f43020f.f30367r.hideActionMode();
                    AndroidUtilities.hideKeyboard(r60Var.f43020f.f30367r);
                    return;
                }
                return;
            case 15:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((x60) this.f40130b).f45667c);
                    return;
                }
                return;
            case 16:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((f70) this.f40130b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 17:
                w70 w70Var = (w70) this.f40130b;
                if (i10 == 1 && w70.X(w70Var).F) {
                    AndroidUtilities.hideKeyboard(w70.Y(w70Var).getSearchField());
                    return;
                }
                return;
            case 18:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((LanguageSelectActivity) this.f40130b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 19:
                if (i10 == 1) {
                    pc0 pc0Var = (pc0) this.f40130b;
                    if (pc0Var.f42448q0 && pc0Var.f42450r0) {
                        AndroidUtilities.hideKeyboard(pc0Var.getParentActivity().getCurrentFocus());
                        return;
                    }
                    return;
                }
                return;
            case 21:
                return;
            case 22:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((cj0) this.f40130b).Y.getEditText());
                    return;
                }
                return;
            case 23:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((NotificationsCustomSettingsActivity) this.f40130b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 24:
                return;
            case 25:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.f40130b;
                if (i10 == 0) {
                    kVar2 = ((org.telegram.ui.ActionBar.r2) premiumPreviewFragment).actionBar;
                    int dp2 = AndroidUtilities.dp(16.0f) + kVar2.getBottom();
                    if (premiumPreviewFragment.f35874f0 > 0.5f) {
                        premiumPreviewFragment.f35865a.w0(0, premiumPreviewFragment.f35870c0 - dp2, null);
                        return;
                    }
                    if (premiumPreviewFragment.f35865a.getLayoutManager() != null) {
                        view3 = premiumPreviewFragment.f35865a.getLayoutManager().m(0);
                    } else {
                        view3 = null;
                    }
                    if (view3 != null && view3.getTop() < 0) {
                        premiumPreviewFragment.f35865a.w0(0, view3.getTop(), null);
                        return;
                    }
                    return;
                }
                return;
            case 28:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((y21) this.f40130b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 29:
                if (i10 == 0) {
                    d81 d81Var = (d81) this.f40130b;
                    if (d81Var.E != null) {
                        org.telegram.ui.ActionBar.y5 y5Var = d81Var.d;
                        if (y5Var == null || !y5Var.w()) {
                            float f10 = d81Var.X;
                            if (f10 > 0.0f && f10 < 1.0f) {
                                if (f10 >= 0.5f) {
                                    d81Var.f38762c.w0(0, (int) (-(d81Var.Z - d81Var.Y)), org.telegram.ui.Components.ds.h);
                                    return;
                                } else {
                                    d81Var.f38762c.w0(0, (int) Math.ceil(d81Var.Y - d81Var.f38759a0), org.telegram.ui.Components.ds.h);
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
        i00 i00Var;
        org.telegram.ui.Cells.b3 b3Var;
        org.telegram.ui.ActionBar.k kVar;
        int i12;
        ch.f fVar;
        s4.e1 T;
        org.telegram.ui.Components.t40 t40Var;
        ch.f fVar2;
        int i13 = this.f40129a;
        boolean z10 = false;
        int i14 = 0;
        boolean z11 = false;
        r4 = false;
        boolean z12 = false;
        Object obj = this.f40130b;
        switch (i13) {
            case 0:
                m3 m3Var = (m3) obj;
                if (recyclerView.getChildCount() != 0) {
                    recyclerView.invalidate();
                    m3Var.L.P0.G();
                    j4 j4Var = m3Var.L;
                    v3 v3Var = j4Var.K;
                    if (v3Var != null) {
                        v3Var.f44586c.invalidate();
                    } else {
                        ArticleViewer$WindowView articleViewer$WindowView = j4Var.f40435f0;
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
                if (!oVar.I && !oVar.f42048r && oVar.d.N0() > oVar.E - 2) {
                    oVar.X();
                    return;
                }
                return;
            case 2:
                j4 j4Var3 = (j4) obj;
                if (j4Var3.f40438i0.f45306w.I1) {
                    AndroidUtilities.hideKeyboard(j4Var3.f40437h0.f45395b0);
                    return;
                }
                return;
            case 3:
                c7 c7Var = (c7) obj;
                if (c7Var.f38347b.canScrollVertically(-1) || c7.b0(c7Var).o()) {
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
                vu vuVar = (vu) obj;
                org.telegram.ui.Components.va vaVar = vuVar.f26813s;
                if (vaVar != null) {
                    org.telegram.ui.Components.dd0 dd0Var = vaVar.f27815n0;
                    if (dd0Var != null && dd0Var.getTop() == vaVar.f27817p0) {
                        z12 = true;
                    }
                    vuVar.f26814w = !z12;
                    vaVar.invalidate();
                    return;
                }
                return;
            case 11:
                o00 o00Var = (o00) obj;
                if (o00Var.f42054a.I1 && (i00Var = o00Var.K) != null && (b3Var = i00Var.f24001b) != null) {
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
                ((d20) obj).f38720s.invalidate();
                return;
            case 13:
                e60 e60Var = (e60) obj;
                if (e60Var.f39008z0 == null) {
                    e60Var.f39008z0 = (uc) e60Var.B0(e60Var.Z);
                }
                int measuredHeight = e60Var.f39008z0.getMeasuredHeight();
                kVar = ((org.telegram.ui.ActionBar.r2) e60Var).actionBar;
                int measuredHeight2 = measuredHeight - kVar.getMeasuredHeight();
                float top = e60Var.f39008z0.getTop() * (-1);
                float f7 = measuredHeight2;
                float max = Math.max(Math.min(1.0f, top / f7), 0.0f);
                e60Var.A0 = max;
                float min = Math.min(max * 2.0f, 1.0f);
                float min2 = Math.min(Math.max(e60Var.A0 - 0.45f, 0.0f) * 2.0f, 1.0f);
                e60Var.f39008z0.f44091b.setAlpha(AndroidUtilities.lerp(1.0f, 0.0f, min));
                e60Var.f39008z0.f44093f.setAlpha(AndroidUtilities.lerp(1.0f, 0.0f, min));
                e60Var.f39008z0.f44092c.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, min2));
                if (e60Var.A0 >= 1.0f) {
                    e60Var.f39008z0.setTranslationY(top - f7);
                    return;
                } else {
                    e60Var.f39008z0.setTranslationY(0.0f);
                    return;
                }
            case 14:
                r60 r60Var = (r60) obj;
                int L0 = r60Var.f43033r.L0();
                View childAt = r60Var.f43028n.getChildAt(0);
                if (childAt != null) {
                    i12 = childAt.getTop();
                } else {
                    i12 = 0;
                }
                if (L0 != 0 || i12 < r60Var.f43028n.getPaddingTop()) {
                    z11 = true;
                }
                ((oe.b) r60Var.e.f10865c).a(z11, true);
                if (Build.VERSION.SDK_INT >= 31 && (fVar = r60Var.f43031p0) != null) {
                    fVar.f(i10, i11);
                    r60Var.f0();
                    return;
                }
                return;
            case 20:
                ((ni0) obj).J.invalidate();
                return;
            case 21:
                vi0 vi0Var = (vi0) obj;
                int L02 = vi0Var.h.L0();
                if (L02 != -1) {
                    i14 = Math.abs(vi0Var.h.N0() - L02) + 1;
                }
                int h = recyclerView.getAdapter().h();
                if (i14 > 0 && !vi0Var.V && !vi0Var.E && !vi0Var.f44833x.isEmpty() && L02 + i14 >= h - 5 && vi0Var.f44834y) {
                    vi0Var.d0();
                    return;
                }
                return;
            case 23:
                return;
            case 24:
                mv0 mv0Var = (mv0) obj;
                if (i11 != 0 && (t40Var = mv0Var.h) != null) {
                    t40Var.b(true);
                }
                org.telegram.ui.Components.tz0 tz0Var = mv0Var.Q;
                if (tz0Var != null && tz0Var.f33184s) {
                    org.telegram.ui.Components.rz0 delegate = tz0Var.getDelegate();
                    if (delegate instanceof org.telegram.ui.Cells.h6) {
                        za1 za1Var = mv0Var.f41679c;
                        View F = za1Var.F((org.telegram.ui.Cells.h6) delegate);
                        if (F == null) {
                            T = null;
                        } else {
                            T = za1Var.T(F);
                        }
                        if (T != null) {
                            View view = T.f47738a;
                            if (mv0Var.Q.getDirection() == 0) {
                                mv0Var.Q.setTranslationY((view.getY() - AndroidUtilities.dp(166.0f)) + view.getMeasuredHeight());
                            } else {
                                mv0Var.Q.setTranslationY(view.getY());
                            }
                            s4.c0 c0Var = mv0Var.d;
                            if (!c0Var.f47820c.O(view) || !c0Var.d.O(view)) {
                                mv0Var.Q.f();
                                return;
                            }
                            return;
                        }
                        mv0Var.Q.f();
                        return;
                    }
                    mv0Var.Q.f();
                    return;
                }
                return;
            case 25:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) obj;
                premiumPreviewFragment.f35871d0.invalidate();
                if (Build.VERSION.SDK_INT >= 31 && (fVar2 = premiumPreviewFragment.f35896x0) != null) {
                    fVar2.f(i10, i11);
                    premiumPreviewFragment.k0();
                    return;
                }
                return;
            case 26:
                sx0 sx0Var = (sx0) obj;
                if (!sx0Var.getMessagesController().blockedEndReached) {
                    int abs = Math.abs(sx0Var.f43617b.N0() - sx0Var.f43617b.L0()) + 1;
                    int h10 = recyclerView.getAdapter().h();
                    if (abs > 0 && sx0Var.f43617b.N0() >= h10 - 10) {
                        sx0Var.getMessagesController().getBlockedPeers(false);
                        return;
                    }
                    return;
                }
                return;
            case 27:
                u21 u21Var = (u21) obj;
                u21Var.e.invalidate();
                v21.t(u21Var.v).invalidate();
                return;
            case 29:
                d81 d81Var = (d81) obj;
                d81Var.n0(false, true);
                d81Var.o0();
                if (d81Var.f38762c.I1) {
                    AndroidUtilities.hideKeyboard(d81Var.fragmentView);
                    return;
                }
                return;
        }
    }

    public i3(wb wbVar) {
        this.f40129a = 5;
        this.f40130b = wbVar;
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
