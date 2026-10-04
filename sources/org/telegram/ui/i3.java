package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class i3 extends s4.s0 {
    public final int f37231a;
    public final Object f37232b;

    public i3(Object obj, int i10) {
        this.f37231a = i10;
        this.f37232b = obj;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        org.telegram.ui.ActionBar.k kVar;
        View view;
        View view2;
        View m10;
        org.telegram.ui.ActionBar.k kVar2;
        View view3;
        switch (this.f37231a) {
            case 0:
                if (i10 == 0) {
                    ((m3) this.f37232b).K.O0.W();
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
                wb wbVar = (wb) this.f37232b;
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
            case 6:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((yn) this.f37232b).V0);
                    return;
                }
                return;
            case 7:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((mq) this.f37232b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 8:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((rr) this.f37232b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 9:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((zt) this.f37232b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 12:
                r20 r20Var = (r20) this.f37232b;
                if (i10 == 0) {
                    kVar = ((org.telegram.ui.ActionBar.n2) r20Var).actionBar;
                    int dp = AndroidUtilities.dp(16.0f) + kVar.getBottom();
                    if (r20Var.v > 0.5f) {
                        r20Var.f39889c.w0(0, r20Var.f39893r - dp, null);
                        return;
                    }
                    if (r20Var.f39889c.getLayoutManager() != null) {
                        view = r20Var.f39889c.getLayoutManager().m(0);
                    } else {
                        view = null;
                    }
                    if (view != null) {
                        if (r20Var.t0() + view.getTop() < 0.0f) {
                            r20Var.f39889c.w0(0, Math.round(r20Var.t0() + view.getTop()), null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 13:
                r60 r60Var = (r60) this.f37232b;
                if (i10 == 0) {
                    float f7 = r60Var.A0;
                    if (f7 >= 0.5f && f7 < 1.0f) {
                        int bottom = r60.h1(r60Var).getBottom();
                        s4.o0 layoutManager = r60Var.M.getLayoutManager();
                        if (layoutManager != null && (m10 = layoutManager.m(0)) != null) {
                            r60Var.M.w0(0, m10.getBottom() - bottom, null);
                            return;
                        }
                        return;
                    } else if (f7 < 0.5f) {
                        if (r60Var.M.getLayoutManager() != null) {
                            view2 = r60Var.M.getLayoutManager().m(0);
                        } else {
                            view2 = null;
                        }
                        if (view2 != null && view2.getTop() < 0) {
                            r60Var.M.w0(0, view2.getTop(), null);
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 14:
                d70 d70Var = (d70) this.f37232b;
                if (i10 == 1) {
                    d70Var.f35674f.f26252r.hideActionMode();
                    AndroidUtilities.hideKeyboard(d70Var.f35674f.f26252r);
                    return;
                }
                return;
            case 15:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((k70) this.f37232b).f37847c);
                    return;
                }
                return;
            case 16:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((s70) this.f37232b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 17:
                k80 k80Var = (k80) this.f37232b;
                if (i10 == 1) {
                    k80Var.d.d.hideActionMode();
                    AndroidUtilities.hideKeyboard(k80Var.d.d);
                    return;
                }
                return;
            case 18:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((LanguageSelectActivity) this.f37232b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 19:
                if (i10 == 1) {
                    gd0 gd0Var = (gd0) this.f37232b;
                    if (gd0Var.f36590r0 && gd0Var.f36592s0) {
                        AndroidUtilities.hideKeyboard(gd0Var.getParentActivity().getCurrentFocus());
                        return;
                    }
                    return;
                }
                return;
            case 21:
                return;
            case 22:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((oj0) this.f37232b).Y.getEditText());
                    return;
                }
                return;
            case 23:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((NotificationsCustomSettingsActivity) this.f37232b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 24:
                return;
            case 25:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.f37232b;
                if (i10 == 0) {
                    kVar2 = ((org.telegram.ui.ActionBar.n2) premiumPreviewFragment).actionBar;
                    int dp2 = AndroidUtilities.dp(16.0f) + kVar2.getBottom();
                    if (premiumPreviewFragment.f34132f0 > 0.5f) {
                        premiumPreviewFragment.f34122a.w0(0, premiumPreviewFragment.f34127c0 - dp2, null);
                        return;
                    }
                    if (premiumPreviewFragment.f34122a.getLayoutManager() != null) {
                        view3 = premiumPreviewFragment.f34122a.getLayoutManager().m(0);
                    } else {
                        view3 = null;
                    }
                    if (view3 != null && view3.getTop() < 0) {
                        premiumPreviewFragment.f34122a.w0(0, view3.getTop(), null);
                        return;
                    }
                    return;
                }
                return;
            case 28:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((y31) this.f37232b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i10, int i11) {
        z00 z00Var;
        org.telegram.ui.Cells.e3 e3Var;
        int i12;
        ah.i iVar;
        ah.i iVar2;
        s4.c1 T;
        org.telegram.ui.Components.m40 m40Var;
        ah.i iVar3;
        int i13 = this.f37231a;
        boolean z10 = false;
        int i14 = 0;
        boolean z11 = false;
        r4 = false;
        boolean z12 = false;
        Object obj = this.f37232b;
        switch (i13) {
            case 0:
                m3 m3Var = (m3) obj;
                if (recyclerView.getChildCount() != 0) {
                    recyclerView.invalidate();
                    m3Var.K.O0.H();
                    i4 i4Var = m3Var.K;
                    v3 v3Var = i4Var.K;
                    if (v3Var != null) {
                        v3Var.f41539c.invalidate();
                    } else {
                        ArticleViewer$WindowView articleViewer$WindowView = i4Var.f37266f0;
                        if (articleViewer$WindowView != null) {
                            articleViewer$WindowView.invalidate();
                        }
                    }
                    m3Var.K.f0();
                    i4 i4Var2 = m3Var.K;
                    v3 v3Var2 = i4Var2.K;
                    if (v3Var2 == null || v3Var2.F) {
                        i4Var2.X(i4Var2.I0 - i11);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                q qVar = (q) obj;
                if (!qVar.I && !qVar.f39572r && qVar.d.N0() > qVar.E - 2) {
                    qVar.U();
                    return;
                }
                return;
            case 2:
                i4 i4Var3 = (i4) obj;
                if (i4Var3.f37269i0.f42259w.K1) {
                    AndroidUtilities.hideKeyboard(i4Var3.f37268h0.f42375b0);
                    return;
                }
                return;
            case 3:
                a7 a7Var = (a7) obj;
                z10 = (a7Var.f34686b.canScrollVertically(-1) || a7.Z(a7Var).s()) ? true : true;
                le.b bVar = a7Var.S;
                if (bVar != null) {
                    bVar.a(z10, true);
                    return;
                }
                return;
            case 4:
                ((k8) obj).p0();
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
                    wbVar.R.addListener(new u4(this, 14));
                    wbVar.R.start();
                }
                wbVar.O0(true);
                wbVar.c1();
                return;
            case 6:
            case 7:
            case 9:
            case 15:
            case 16:
            case 18:
            case 19:
            case 22:
            case 28:
            default:
                return;
            case 8:
                return;
            case 10:
                jv jvVar = (jv) obj;
                org.telegram.ui.Components.wa waVar = jvVar.f25311s;
                if (waVar != null) {
                    org.telegram.ui.Components.xc0 xc0Var = waVar.f33140y0;
                    if (xc0Var != null && xc0Var.getTop() == waVar.A0) {
                        z12 = true;
                    }
                    jvVar.f25312w = !z12;
                    waVar.invalidate();
                    return;
                }
                return;
            case 11:
                f10 f10Var = (f10) obj;
                if (f10Var.f36139a.K1 && (z00Var = f10Var.K) != null && (e3Var = z00Var.f22132b) != null) {
                    if (e3Var.f28713e) {
                        e3Var.k(true);
                        return;
                    } else {
                        e3Var.d();
                        return;
                    }
                }
                return;
            case 12:
                ((r20) obj).f39894s.invalidate();
                return;
            case 13:
                r60 r60Var = (r60) obj;
                if (r60Var.f39931z0 == null) {
                    r60Var.f39931z0 = (vc) r60Var.y0(r60Var.Z);
                }
                int measuredHeight = r60Var.f39931z0.getMeasuredHeight() - r60.g1(r60Var).getMeasuredHeight();
                float top = r60Var.f39931z0.getTop() * (-1);
                float f7 = measuredHeight;
                float max = Math.max(Math.min(1.0f, top / f7), 0.0f);
                r60Var.A0 = max;
                float min = Math.min(max * 2.0f, 1.0f);
                float min2 = Math.min(Math.max(r60Var.A0 - 0.45f, 0.0f) * 2.0f, 1.0f);
                r60Var.f39931z0.f41701b.setAlpha(AndroidUtilities.lerp(1.0f, 0.0f, min));
                r60Var.f39931z0.f41704f.setAlpha(AndroidUtilities.lerp(1.0f, 0.0f, min));
                r60Var.f39931z0.f41702c.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, min2));
                if (r60Var.A0 >= 1.0f) {
                    r60Var.f39931z0.setTranslationY(top - f7);
                    return;
                } else {
                    r60Var.f39931z0.setTranslationY(0.0f);
                    return;
                }
            case 14:
                d70 d70Var = (d70) obj;
                int L0 = d70Var.f35687r.L0();
                View childAt = d70Var.f35682n.getChildAt(0);
                if (childAt != null) {
                    i12 = childAt.getTop();
                } else {
                    i12 = 0;
                }
                ((le.b) d70Var.f35672e.f5869c).a((L0 != 0 || i12 < d70Var.f35682n.getPaddingTop()) ? true : true, true);
                if (Build.VERSION.SDK_INT >= 31 && (iVar = d70Var.f35685p0) != null) {
                    iVar.f(i10, i11);
                    d70Var.e0();
                    return;
                }
                return;
            case 17:
                k80 k80Var = (k80) obj;
                k80Var.f37888n.L0();
                View childAt2 = k80Var.h.getChildAt(0);
                if (childAt2 != null) {
                    childAt2.getTop();
                }
                if (Build.VERSION.SDK_INT >= 31 && (iVar2 = k80Var.L) != null) {
                    iVar2.f(i10, i11);
                    k80Var.X();
                    return;
                }
                return;
            case 20:
                ((zi0) obj).K.invalidate();
                return;
            case 21:
                hj0 hj0Var = (hj0) obj;
                int L02 = hj0Var.h.L0();
                if (L02 != -1) {
                    i14 = Math.abs(hj0Var.h.N0() - L02) + 1;
                }
                int h = recyclerView.getAdapter().h();
                if (i14 > 0 && !hj0Var.V && !hj0Var.E && !hj0Var.f37107x.isEmpty() && L02 + i14 >= h - 5 && hj0Var.f37108y) {
                    hj0Var.b0();
                    return;
                }
                return;
            case 23:
                return;
            case 24:
                uv0 uv0Var = (uv0) obj;
                if (i11 != 0 && (m40Var = uv0Var.h) != null) {
                    m40Var.b(true);
                }
                org.telegram.ui.Components.iz0 iz0Var = uv0Var.Q;
                if (iz0Var != null && iz0Var.f27541s) {
                    org.telegram.ui.Components.gz0 delegate = iz0Var.getDelegate();
                    if (delegate instanceof org.telegram.ui.Cells.d6) {
                        zb1 zb1Var = uv0Var.f41335c;
                        View F = zb1Var.F((org.telegram.ui.Cells.d6) delegate);
                        if (F == null) {
                            T = null;
                        } else {
                            T = zb1Var.T(F);
                        }
                        if (T != null) {
                            View view = T.f46531a;
                            if (uv0Var.Q.getDirection() == 0) {
                                uv0Var.Q.setTranslationY((view.getY() - AndroidUtilities.dp(166.0f)) + view.getMeasuredHeight());
                            } else {
                                uv0Var.Q.setTranslationY(view.getY());
                            }
                            s4.c0 c0Var = uv0Var.d;
                            if (!c0Var.f46636c.D(view) || !c0Var.d.D(view)) {
                                uv0Var.Q.f();
                                return;
                            }
                            return;
                        }
                        uv0Var.Q.f();
                        return;
                    }
                    uv0Var.Q.f();
                    return;
                }
                return;
            case 25:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) obj;
                premiumPreviewFragment.f34128d0.invalidate();
                if (Build.VERSION.SDK_INT >= 31 && (iVar3 = premiumPreviewFragment.f34149u0) != null) {
                    iVar3.f(i10, i11);
                    premiumPreviewFragment.j0();
                    return;
                }
                return;
            case 26:
                by0 by0Var = (by0) obj;
                if (!by0Var.getMessagesController().blockedEndReached) {
                    int abs = Math.abs(by0Var.f35211b.N0() - by0Var.f35211b.L0()) + 1;
                    int h10 = recyclerView.getAdapter().h();
                    if (abs > 0 && by0Var.f35211b.N0() >= h10 - 10) {
                        by0Var.getMessagesController().getBlockedPeers(false);
                        return;
                    }
                    return;
                }
                return;
            case 27:
                u31 u31Var = (u31) obj;
                u31Var.f41046e.invalidate();
                v31.t(u31Var.v).invalidate();
                return;
            case 29:
                a91 a91Var = (a91) obj;
                a91Var.m0(false, true);
                if (a91Var.f34744c.K1) {
                    AndroidUtilities.hideKeyboard(a91Var.fragmentView);
                    return;
                }
                return;
        }
    }

    public i3(wb wbVar) {
        this.f37231a = 5;
        this.f37232b = wbVar;
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
