package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class j3 extends s4.s0 {
    public final int f34578a;
    public final Object f34579b;

    public j3(Object obj, int i10) {
        this.f34578a = i10;
        this.f34579b = obj;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        org.telegram.ui.ActionBar.l lVar;
        View view;
        View view2;
        View m10;
        org.telegram.ui.ActionBar.l lVar2;
        View view3;
        switch (this.f34578a) {
            case 0:
                if (i10 == 0) {
                    ((n3) this.f34579b).K.O0.W();
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
            default:
                return;
            case 4:
                wb wbVar = (wb) this.f34579b;
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
                    AndroidUtilities.hideKeyboard(((xn) this.f34579b).X0);
                    return;
                }
                return;
            case 6:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((lq) this.f34579b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 7:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((qr) this.f34579b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 8:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((yt) this.f34579b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 11:
                p20 p20Var = (p20) this.f34579b;
                if (i10 == 0) {
                    lVar = ((org.telegram.ui.ActionBar.o2) p20Var).actionBar;
                    int dp = AndroidUtilities.dp(16.0f) + lVar.getBottom();
                    if (p20Var.v > 0.5f) {
                        p20Var.f36305c.w0(0, p20Var.f36308r - dp, null);
                        return;
                    }
                    if (p20Var.f36305c.getLayoutManager() != null) {
                        view = p20Var.f36305c.getLayoutManager().m(0);
                    } else {
                        view = null;
                    }
                    if (view != null && view.getTop() < 0) {
                        p20Var.f36305c.w0(0, view.getTop(), null);
                        return;
                    }
                    return;
                }
                return;
            case 12:
                q60 q60Var = (q60) this.f34579b;
                if (i10 == 0) {
                    float f7 = q60Var.A0;
                    if (f7 >= 0.5f && f7 < 1.0f) {
                        int bottom = q60.h1(q60Var).getBottom();
                        s4.o0 layoutManager = q60Var.M.getLayoutManager();
                        if (layoutManager != null && (m10 = layoutManager.m(0)) != null) {
                            q60Var.M.w0(0, m10.getBottom() - bottom, null);
                            return;
                        }
                        return;
                    } else if (f7 < 0.5f) {
                        if (q60Var.M.getLayoutManager() != null) {
                            view2 = q60Var.M.getLayoutManager().m(0);
                        } else {
                            view2 = null;
                        }
                        if (view2 != null && view2.getTop() < 0) {
                            q60Var.M.w0(0, view2.getTop(), null);
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 13:
                c70 c70Var = (c70) this.f34579b;
                if (i10 == 1) {
                    c70Var.f32543f.f23850r.hideActionMode();
                    AndroidUtilities.hideKeyboard(c70Var.f32543f.f23850r);
                    return;
                }
                return;
            case 14:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((j70) this.f34579b).f34646c);
                    return;
                }
                return;
            case 15:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((r70) this.f34579b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 16:
                j80 j80Var = (j80) this.f34579b;
                if (i10 == 1) {
                    j80Var.d.d.hideActionMode();
                    AndroidUtilities.hideKeyboard(j80Var.d.d);
                    return;
                }
                return;
            case 17:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((LanguageSelectActivity) this.f34579b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 18:
                if (i10 == 1) {
                    fd0 fd0Var = (fd0) this.f34579b;
                    if (fd0Var.f33508r0 && fd0Var.f33510s0) {
                        AndroidUtilities.hideKeyboard(fd0Var.getParentActivity().getCurrentFocus());
                        return;
                    }
                    return;
                }
                return;
            case 20:
                return;
            case 21:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((nj0) this.f34579b).Y.getEditText());
                    return;
                }
                return;
            case 22:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((NotificationsCustomSettingsActivity) this.f34579b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 23:
                return;
            case 24:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.f34579b;
                if (i10 == 0) {
                    lVar2 = ((org.telegram.ui.ActionBar.o2) premiumPreviewFragment).actionBar;
                    int dp2 = AndroidUtilities.dp(16.0f) + lVar2.getBottom();
                    if (premiumPreviewFragment.f31452f0 > 0.5f) {
                        premiumPreviewFragment.f31443a.w0(0, premiumPreviewFragment.f31448c0 - dp2, null);
                        return;
                    }
                    if (premiumPreviewFragment.f31443a.getLayoutManager() != null) {
                        view3 = premiumPreviewFragment.f31443a.getLayoutManager().m(0);
                    } else {
                        view3 = null;
                    }
                    if (view3 != null && view3.getTop() < 0) {
                        premiumPreviewFragment.f31443a.w0(0, view3.getTop(), null);
                        return;
                    }
                    return;
                }
                return;
            case 27:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((y31) this.f34579b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i10, int i11) {
        y00 y00Var;
        org.telegram.ui.Cells.e3 e3Var;
        int i12;
        ah.i iVar;
        ah.i iVar2;
        s4.c1 U;
        org.telegram.ui.Components.l40 l40Var;
        ah.i iVar3;
        int i13 = this.f34578a;
        boolean z10 = false;
        int i14 = 0;
        boolean z11 = false;
        z10 = false;
        Object obj = this.f34579b;
        switch (i13) {
            case 0:
                n3 n3Var = (n3) obj;
                if (recyclerView.getChildCount() != 0) {
                    recyclerView.invalidate();
                    n3Var.K.O0.H();
                    j4 j4Var = n3Var.K;
                    w3 w3Var = j4Var.K;
                    if (w3Var != null) {
                        w3Var.f38795c.invalidate();
                    } else {
                        ArticleViewer$WindowView articleViewer$WindowView = j4Var.f34613f0;
                        if (articleViewer$WindowView != null) {
                            articleViewer$WindowView.invalidate();
                        }
                    }
                    n3Var.K.f0();
                    j4 j4Var2 = n3Var.K;
                    w3 w3Var2 = j4Var2.K;
                    if (w3Var2 == null || w3Var2.F) {
                        j4Var2.X(j4Var2.I0 - i11);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                r rVar = (r) obj;
                if (!rVar.I && !rVar.f36937r && rVar.d.N0() > rVar.E - 2) {
                    rVar.W();
                    return;
                }
                return;
            case 2:
                j4 j4Var3 = (j4) obj;
                if (j4Var3.f34616i0.f39077w.K1) {
                    AndroidUtilities.hideKeyboard(j4Var3.f34615h0.f39184b0);
                    return;
                }
                return;
            case 3:
                ((k8) obj).p0();
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
                    wbVar.R.addListener(new v4(this, 14));
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
                hv hvVar = (hv) obj;
                org.telegram.ui.Components.va vaVar = hvVar.f22966s;
                if (vaVar != null) {
                    org.telegram.ui.Components.vc0 vc0Var = vaVar.f29924y0;
                    if (vc0Var != null && vc0Var.getTop() == vaVar.A0) {
                        z10 = true;
                    }
                    hvVar.f22967w = !z10;
                    vaVar.invalidate();
                    return;
                }
                return;
            case 10:
                e10 e10Var = (e10) obj;
                if (e10Var.f33088a.K1 && (y00Var = e10Var.K) != null && (e3Var = y00Var.f20330b) != null) {
                    if (e3Var.e) {
                        e3Var.k(true);
                        return;
                    } else {
                        e3Var.d();
                        return;
                    }
                }
                return;
            case 11:
                ((p20) obj).f36309s.invalidate();
                return;
            case 12:
                q60 q60Var = (q60) obj;
                if (q60Var.f36619z0 == null) {
                    q60Var.f36619z0 = (vc) q60Var.y0(q60Var.Z);
                }
                int measuredHeight = q60Var.f36619z0.getMeasuredHeight() - q60.g1(q60Var).getMeasuredHeight();
                float top = q60Var.f36619z0.getTop() * (-1);
                float f7 = measuredHeight;
                float max = Math.max(Math.min(1.0f, top / f7), 0.0f);
                q60Var.A0 = max;
                float min = Math.min(max * 2.0f, 1.0f);
                float min2 = Math.min(Math.max(q60Var.A0 - 0.45f, 0.0f) * 2.0f, 1.0f);
                q60Var.f36619z0.f38545b.setAlpha(AndroidUtilities.lerp(1.0f, 0.0f, min));
                q60Var.f36619z0.f38547f.setAlpha(AndroidUtilities.lerp(1.0f, 0.0f, min));
                q60Var.f36619z0.f38546c.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, min2));
                if (q60Var.A0 >= 1.0f) {
                    q60Var.f36619z0.setTranslationY(top - f7);
                    return;
                } else {
                    q60Var.f36619z0.setTranslationY(0.0f);
                    return;
                }
            case 13:
                c70 c70Var = (c70) obj;
                int L0 = c70Var.f32556r.L0();
                View childAt = c70Var.f32551n.getChildAt(0);
                if (childAt != null) {
                    i12 = childAt.getTop();
                } else {
                    i12 = 0;
                }
                c70Var.e.b((L0 != 0 || i12 < c70Var.f32551n.getPaddingTop()) ? true : true, true);
                if (Build.VERSION.SDK_INT >= 31 && (iVar = c70Var.f32554p0) != null) {
                    iVar.f(i10, i11);
                    c70Var.e0();
                    return;
                }
                return;
            case 16:
                j80 j80Var = (j80) obj;
                j80Var.f34662n.L0();
                View childAt2 = j80Var.h.getChildAt(0);
                if (childAt2 != null) {
                    childAt2.getTop();
                }
                if (Build.VERSION.SDK_INT >= 31 && (iVar2 = j80Var.L) != null) {
                    iVar2.f(i10, i11);
                    j80Var.Y();
                    return;
                }
                return;
            case 19:
                ((yi0) obj).K.invalidate();
                return;
            case 20:
                gj0 gj0Var = (gj0) obj;
                int L02 = gj0Var.h.L0();
                if (L02 != -1) {
                    i14 = Math.abs(gj0Var.h.N0() - L02) + 1;
                }
                int h = recyclerView.getAdapter().h();
                if (i14 > 0 && !gj0Var.V && !gj0Var.E && !gj0Var.f33967x.isEmpty() && L02 + i14 >= h - 5 && gj0Var.f33968y) {
                    gj0Var.b0();
                    return;
                }
                return;
            case 22:
                return;
            case 23:
                uv0 uv0Var = (uv0) obj;
                if (i11 != 0 && (l40Var = uv0Var.h) != null) {
                    l40Var.b(true);
                }
                org.telegram.ui.Components.zy0 zy0Var = uv0Var.Q;
                if (zy0Var != null && zy0Var.f31010s) {
                    org.telegram.ui.Components.xy0 delegate = zy0Var.getDelegate();
                    if (delegate instanceof org.telegram.ui.Cells.d6) {
                        wb1 wb1Var = uv0Var.f38341c;
                        View G = wb1Var.G((org.telegram.ui.Cells.d6) delegate);
                        if (G == null) {
                            U = null;
                        } else {
                            U = wb1Var.U(G);
                        }
                        if (U != null) {
                            View view = U.f43005a;
                            if (uv0Var.Q.getDirection() == 0) {
                                uv0Var.Q.setTranslationY((view.getY() - AndroidUtilities.dp(166.0f)) + view.getMeasuredHeight());
                            } else {
                                uv0Var.Q.setTranslationY(view.getY());
                            }
                            s4.c0 c0Var = uv0Var.d;
                            if (!c0Var.f43099c.v(view) || !c0Var.d.v(view)) {
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
            case 24:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) obj;
                premiumPreviewFragment.f31449d0.invalidate();
                if (Build.VERSION.SDK_INT >= 31 && (iVar3 = premiumPreviewFragment.f31469u0) != null) {
                    iVar3.f(i10, i11);
                    premiumPreviewFragment.j0();
                    return;
                }
                return;
            case 25:
                ay0 ay0Var = (ay0) obj;
                if (!ay0Var.getMessagesController().blockedEndReached) {
                    int abs = Math.abs(ay0Var.f32175b.N0() - ay0Var.f32175b.L0()) + 1;
                    int h10 = recyclerView.getAdapter().h();
                    if (abs > 0 && ay0Var.f32175b.N0() >= h10 - 10) {
                        ay0Var.getMessagesController().getBlockedPeers(false);
                        return;
                    }
                    return;
                }
                return;
            case 26:
                u31 u31Var = (u31) obj;
                u31Var.e.invalidate();
                v31.t(u31Var.v).invalidate();
                return;
            case 28:
                a91 a91Var = (a91) obj;
                a91Var.p0(false, true);
                if (a91Var.f32014c.K1) {
                    AndroidUtilities.hideKeyboard(a91Var.fragmentView);
                    return;
                }
                return;
            case 29:
                ra1 ra1Var = (ra1) obj;
                if (ra1Var.f37076r0.size() != ra1Var.f37078s0.size() && !ra1Var.f37083w0 && ra1Var.T.N0() > ra1Var.W.f38853c0 - 20) {
                    ra1Var.f0();
                    return;
                }
                return;
        }
    }

    public j3(wb wbVar) {
        this.f34578a = 4;
        this.f34579b = wbVar;
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
