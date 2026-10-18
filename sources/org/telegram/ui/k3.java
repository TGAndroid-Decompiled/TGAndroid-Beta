package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class k3 extends s4.r0 {
    public final int f38400a;
    public final Object f38401b;

    public k3(Object obj, int i10) {
        this.f38400a = i10;
        this.f38401b = obj;
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
        switch (this.f38400a) {
            case 0:
                if (i10 == 0) {
                    ((o3) this.f38401b).K.O0.V();
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
                xb xbVar = (xb) this.f38401b;
                if (i10 == 1) {
                    xbVar.S = true;
                    xbVar.V = true;
                    return;
                } else if (i10 == 0) {
                    xbVar.S = false;
                    xbVar.V = false;
                    xbVar.T0(true);
                    return;
                } else {
                    return;
                }
            case 5:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((sn) this.f38401b).X0);
                    return;
                }
                return;
            case 6:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((dq) this.f38401b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 7:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((jr) this.f38401b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 8:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((qt) this.f38401b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 11:
                a20 a20Var = (a20) this.f38401b;
                if (i10 == 0) {
                    kVar = ((org.telegram.ui.ActionBar.n2) a20Var).actionBar;
                    int dp = AndroidUtilities.dp(16.0f) + kVar.getBottom();
                    if (a20Var.v > 0.5f) {
                        a20Var.f35290c.v0(0, a20Var.f35293r - dp, null);
                        return;
                    }
                    if (a20Var.f35290c.getLayoutManager() != null) {
                        view = a20Var.f35290c.getLayoutManager().m(0);
                    } else {
                        view = null;
                    }
                    if (view != null && view.getTop() < 0) {
                        a20Var.f35290c.v0(0, view.getTop(), null);
                        return;
                    }
                    return;
                }
                return;
            case 12:
                b60 b60Var = (b60) this.f38401b;
                if (i10 == 0) {
                    float f7 = b60Var.A0;
                    if (f7 >= 0.5f && f7 < 1.0f) {
                        kVar2 = ((org.telegram.ui.ActionBar.n2) b60Var).actionBar;
                        int bottom = kVar2.getBottom();
                        s4.n0 layoutManager = b60Var.M.getLayoutManager();
                        if (layoutManager != null && (m10 = layoutManager.m(0)) != null) {
                            b60Var.M.v0(0, m10.getBottom() - bottom, null);
                            return;
                        }
                        return;
                    } else if (f7 < 0.5f) {
                        if (b60Var.M.getLayoutManager() != null) {
                            view2 = b60Var.M.getLayoutManager().m(0);
                        } else {
                            view2 = null;
                        }
                        if (view2 != null && view2.getTop() < 0) {
                            b60Var.M.v0(0, view2.getTop(), null);
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 13:
                n60 n60Var = (n60) this.f38401b;
                if (i10 == 1) {
                    n60Var.f39362f.f27719r.hideActionMode();
                    AndroidUtilities.hideKeyboard(n60Var.f39362f.f27719r);
                    return;
                }
                return;
            case 14:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((u60) this.f38401b).f41907c);
                    return;
                }
                return;
            case 15:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((c70) this.f38401b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 16:
                t70 t70Var = (t70) this.f38401b;
                if (i10 == 1) {
                    t70Var.d.d.hideActionMode();
                    AndroidUtilities.hideKeyboard(t70Var.d.d);
                    return;
                }
                return;
            case 17:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((LanguageSelectActivity) this.f38401b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 18:
                if (i10 == 1) {
                    pc0 pc0Var = (pc0) this.f38401b;
                    if (pc0Var.f40078r0 && pc0Var.f40080s0) {
                        AndroidUtilities.hideKeyboard(pc0Var.getParentActivity().getCurrentFocus());
                        return;
                    }
                    return;
                }
                return;
            case 20:
                return;
            case 21:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((dj0) this.f38401b).Y.getEditText());
                    return;
                }
                return;
            case 22:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((NotificationsCustomSettingsActivity) this.f38401b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 23:
                return;
            case 24:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.f38401b;
                if (i10 == 0) {
                    kVar3 = ((org.telegram.ui.ActionBar.n2) premiumPreviewFragment).actionBar;
                    int dp2 = AndroidUtilities.dp(16.0f) + kVar3.getBottom();
                    if (premiumPreviewFragment.f33501f0 > 0.5f) {
                        premiumPreviewFragment.f33492a.v0(0, premiumPreviewFragment.f33497c0 - dp2, null);
                        return;
                    }
                    if (premiumPreviewFragment.f33492a.getLayoutManager() != null) {
                        view3 = premiumPreviewFragment.f33492a.getLayoutManager().m(0);
                    } else {
                        view3 = null;
                    }
                    if (view3 != null && view3.getTop() < 0) {
                        premiumPreviewFragment.f33492a.v0(0, view3.getTop(), null);
                        return;
                    }
                    return;
                }
                return;
            case 27:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((t21) this.f38401b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 29:
                if (i10 == 0) {
                    ((mc1) this.f38401b).f39169r0 = false;
                    return;
                }
                return;
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i10, int i11) {
        j00 j00Var;
        org.telegram.ui.Cells.d3 d3Var;
        org.telegram.ui.ActionBar.k kVar;
        int i12;
        bh.f fVar;
        bh.f fVar2;
        s4.b1 T;
        org.telegram.ui.Components.r40 r40Var;
        bh.f fVar3;
        bh.f fVar4;
        int i13 = this.f38400a;
        boolean z10 = false;
        int i14 = 0;
        Object obj = this.f38401b;
        switch (i13) {
            case 0:
                o3 o3Var = (o3) obj;
                if (recyclerView.getChildCount() != 0) {
                    recyclerView.invalidate();
                    o3Var.K.O0.G();
                    l4 l4Var = o3Var.K;
                    x3 x3Var = l4Var.K;
                    if (x3Var != null) {
                        x3Var.f43007c.invalidate();
                    } else {
                        ArticleViewer$WindowView articleViewer$WindowView = l4Var.f38756f0;
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
                if (!pVar.I && !pVar.f39931r && pVar.d.N0() > pVar.E - 2) {
                    pVar.W();
                    return;
                }
                return;
            case 2:
                l4 l4Var3 = (l4) obj;
                if (l4Var3.f38759i0.f42678w.I1) {
                    AndroidUtilities.hideKeyboard(l4Var3.f38758h0.f42765b0);
                    return;
                }
                return;
            case 3:
                ((k8) obj).p0();
                return;
            case 4:
                xb xbVar = (xb) obj;
                xbVar.v.invalidate();
                if (i11 != 0 && xbVar.S && !xbVar.Q && xbVar.M.getTag() == null) {
                    AnimatorSet animatorSet = xbVar.R;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                    }
                    xbVar.M.setTag(1);
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    xbVar.R = animatorSet2;
                    animatorSet2.setDuration(150L);
                    xbVar.R.playTogether(ObjectAnimator.ofFloat(xbVar.M, "alpha", 1.0f));
                    xbVar.R.addListener(new m.a(this, 19));
                    xbVar.R.start();
                }
                xbVar.O0(true);
                xbVar.c1();
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
                xu xuVar = (xu) obj;
                org.telegram.ui.Components.va vaVar = xuVar.f24924s;
                if (vaVar != null) {
                    xuVar.f24925w = !vaVar.Z();
                    vaVar.invalidate();
                    return;
                }
                return;
            case 10:
                p00 p00Var = (p00) obj;
                if (p00Var.f39939a.I1 && (j00Var = p00Var.K) != null && (d3Var = j00Var.f22232b) != null) {
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
                ((a20) obj).f35294s.invalidate();
                return;
            case 12:
                b60 b60Var = (b60) obj;
                if (b60Var.f35596z0 == null) {
                    b60Var.f35596z0 = (vc) b60Var.y0(b60Var.Z);
                }
                int measuredHeight = b60Var.f35596z0.getMeasuredHeight();
                kVar = ((org.telegram.ui.ActionBar.n2) b60Var).actionBar;
                int measuredHeight2 = measuredHeight - kVar.getMeasuredHeight();
                float top = b60Var.f35596z0.getTop() * (-1);
                float f7 = measuredHeight2;
                float max = Math.max(Math.min(1.0f, top / f7), 0.0f);
                b60Var.A0 = max;
                float min = Math.min(max * 2.0f, 1.0f);
                float min2 = Math.min(Math.max(b60Var.A0 - 0.45f, 0.0f) * 2.0f, 1.0f);
                b60Var.f35596z0.f42187b.setAlpha(AndroidUtilities.lerp(1.0f, 0.0f, min));
                b60Var.f35596z0.f42189f.setAlpha(AndroidUtilities.lerp(1.0f, 0.0f, min));
                b60Var.f35596z0.f42188c.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, min2));
                if (b60Var.A0 >= 1.0f) {
                    b60Var.f35596z0.setTranslationY(top - f7);
                    return;
                } else {
                    b60Var.f35596z0.setTranslationY(0.0f);
                    return;
                }
            case 13:
                n60 n60Var = (n60) obj;
                int L0 = n60Var.f39375r.L0();
                View childAt = n60Var.f39370n.getChildAt(0);
                if (childAt != null) {
                    i12 = childAt.getTop();
                } else {
                    i12 = 0;
                }
                if (L0 != 0 || i12 < n60Var.f39370n.getPaddingTop()) {
                    z10 = true;
                }
                n60Var.e.b(z10, true);
                if (Build.VERSION.SDK_INT >= 31 && (fVar = n60Var.f39373p0) != null) {
                    fVar.f(i10, i11);
                    n60Var.e0();
                    return;
                }
                return;
            case 16:
                t70 t70Var = (t70) obj;
                t70Var.f41632n.L0();
                View childAt2 = t70Var.h.getChildAt(0);
                if (childAt2 != null) {
                    childAt2.getTop();
                }
                if (Build.VERSION.SDK_INT >= 31 && (fVar2 = t70Var.L) != null) {
                    fVar2.f(i10, i11);
                    t70Var.Y();
                    return;
                }
                return;
            case 19:
                ((oi0) obj).K.invalidate();
                return;
            case 20:
                wi0 wi0Var = (wi0) obj;
                int L02 = wi0Var.h.L0();
                if (L02 != -1) {
                    i14 = Math.abs(wi0Var.h.N0() - L02) + 1;
                }
                int h = recyclerView.getAdapter().h();
                if (i14 > 0 && !wi0Var.V && !wi0Var.E && !wi0Var.f42900x.isEmpty() && L02 + i14 >= h - 5 && wi0Var.f42901y) {
                    wi0Var.b0();
                    return;
                }
                return;
            case 22:
                return;
            case 23:
                hv0 hv0Var = (hv0) obj;
                if (i11 != 0 && (r40Var = hv0Var.h) != null) {
                    r40Var.b(true);
                }
                org.telegram.ui.Components.gz0 gz0Var = hv0Var.Q;
                if (gz0Var != null && gz0Var.f26720s) {
                    org.telegram.ui.Components.ez0 delegate = gz0Var.getDelegate();
                    if (delegate instanceof org.telegram.ui.Cells.c6) {
                        ua1 ua1Var = hv0Var.f37666c;
                        View F = ua1Var.F((org.telegram.ui.Cells.c6) delegate);
                        if (F == null) {
                            T = null;
                        } else {
                            T = ua1Var.T(F);
                        }
                        if (T != null) {
                            View view = T.f45958a;
                            if (hv0Var.Q.getDirection() == 0) {
                                hv0Var.Q.setTranslationY((view.getY() - AndroidUtilities.dp(166.0f)) + view.getMeasuredHeight());
                            } else {
                                hv0Var.Q.setTranslationY(view.getY());
                            }
                            s4.b0 b0Var = hv0Var.d;
                            if (!b0Var.f46052c.X(view) || !b0Var.d.X(view)) {
                                hv0Var.Q.f();
                                return;
                            }
                            return;
                        }
                        hv0Var.Q.f();
                        return;
                    }
                    hv0Var.Q.f();
                    return;
                }
                return;
            case 24:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) obj;
                premiumPreviewFragment.f33498d0.invalidate();
                if (Build.VERSION.SDK_INT >= 31 && (fVar3 = premiumPreviewFragment.f33518u0) != null) {
                    fVar3.f(i10, i11);
                    premiumPreviewFragment.j0();
                    return;
                }
                return;
            case 25:
                mx0 mx0Var = (mx0) obj;
                if (!mx0Var.getMessagesController().blockedEndReached) {
                    int abs = Math.abs(mx0Var.f39287b.N0() - mx0Var.f39287b.L0()) + 1;
                    int h10 = recyclerView.getAdapter().h();
                    if (abs > 0 && mx0Var.f39287b.N0() >= h10 - 10) {
                        mx0Var.getMessagesController().getBlockedPeers(false);
                        return;
                    }
                    return;
                }
                return;
            case 26:
                p21 p21Var = (p21) obj;
                p21Var.e.invalidate();
                q21.v(p21Var.v).invalidate();
                return;
            case 28:
                z71 z71Var = (z71) obj;
                z71Var.o0(false, true);
                if (z71Var.f43680c.I1) {
                    AndroidUtilities.hideKeyboard(z71Var.fragmentView);
                }
                if (Build.VERSION.SDK_INT >= 31 && (fVar4 = z71Var.V) != null) {
                    fVar4.f(i10, i11);
                    z71Var.i0();
                    return;
                }
                return;
            case 29:
                mc1 mc1Var = (mc1) obj;
                mc1Var.f39176u0.f1();
                mc1Var.f39169r0 = true;
                return;
        }
    }

    public k3(xb xbVar) {
        this.f38400a = 4;
        this.f38401b = xbVar;
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
