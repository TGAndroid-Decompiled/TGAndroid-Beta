package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class j3 extends s4.r0 {
    public final int f38446a;
    public final Object f38447b;

    public j3(Object obj, int i10) {
        this.f38446a = i10;
        this.f38447b = obj;
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
        switch (this.f38446a) {
            case 0:
                if (i10 == 0) {
                    ((n3) this.f38447b).L.P0.V();
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
                vb vbVar = (vb) this.f38447b;
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
                    AndroidUtilities.hideKeyboard(((sn) this.f38447b).f41558j1);
                    return;
                }
                return;
            case 6:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((dq) this.f38447b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 7:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((jr) this.f38447b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 8:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((rt) this.f38447b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 11:
                b20 b20Var = (b20) this.f38447b;
                if (i10 == 0) {
                    kVar = ((org.telegram.ui.ActionBar.o2) b20Var).actionBar;
                    int dp = AndroidUtilities.dp(16.0f) + kVar.getBottom();
                    if (b20Var.v > 0.5f) {
                        b20Var.f35894c.v0(0, b20Var.f35897r - dp, null);
                        return;
                    }
                    if (b20Var.f35894c.getLayoutManager() != null) {
                        view = b20Var.f35894c.getLayoutManager().m(0);
                    } else {
                        view = null;
                    }
                    if (view != null && view.getTop() < 0) {
                        b20Var.f35894c.v0(0, view.getTop(), null);
                        return;
                    }
                    return;
                }
                return;
            case 12:
                d60 d60Var = (d60) this.f38447b;
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
                p60 p60Var = (p60) this.f38447b;
                if (i10 == 1) {
                    p60Var.f40356f.f27258r.hideActionMode();
                    AndroidUtilities.hideKeyboard(p60Var.f40356f.f27258r);
                    return;
                }
                return;
            case 14:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((w60) this.f38447b).f42918c);
                    return;
                }
                return;
            case 15:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((e70) this.f38447b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 16:
                x70 x70Var = (x70) this.f38447b;
                if (i10 == 1) {
                    x70Var.d.d.hideActionMode();
                    AndroidUtilities.hideKeyboard(x70Var.d.d);
                    return;
                }
                return;
            case 17:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((LanguageSelectActivity) this.f38447b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 18:
                if (i10 == 1) {
                    rc0 rc0Var = (rc0) this.f38447b;
                    if (rc0Var.f41112q0 && rc0Var.f41114r0) {
                        AndroidUtilities.hideKeyboard(rc0Var.getParentActivity().getCurrentFocus());
                        return;
                    }
                    return;
                }
                return;
            case 20:
                return;
            case 21:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((ej0) this.f38447b).Y.getEditText());
                    return;
                }
                return;
            case 22:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((NotificationsCustomSettingsActivity) this.f38447b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 23:
                return;
            case 24:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.f38447b;
                if (i10 == 0) {
                    kVar3 = ((org.telegram.ui.ActionBar.o2) premiumPreviewFragment).actionBar;
                    int dp2 = AndroidUtilities.dp(16.0f) + kVar3.getBottom();
                    if (premiumPreviewFragment.f33810f0 > 0.5f) {
                        premiumPreviewFragment.f33801a.v0(0, premiumPreviewFragment.f33806c0 - dp2, null);
                        return;
                    }
                    if (premiumPreviewFragment.f33801a.getLayoutManager() != null) {
                        view3 = premiumPreviewFragment.f33801a.getLayoutManager().m(0);
                    } else {
                        view3 = null;
                    }
                    if (view3 != null && view3.getTop() < 0) {
                        premiumPreviewFragment.f33801a.v0(0, view3.getTop(), null);
                        return;
                    }
                    return;
                }
                return;
            case 27:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((u21) this.f38447b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 29:
                if (i10 == 0) {
                    ((pc1) this.f38447b).f40493s0 = false;
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
        org.telegram.ui.Components.p40 p40Var;
        bh.f fVar3;
        bh.f fVar4;
        int i13 = this.f38446a;
        boolean z10 = false;
        int i14 = 0;
        Object obj = this.f38447b;
        switch (i13) {
            case 0:
                n3 n3Var = (n3) obj;
                if (recyclerView.getChildCount() != 0) {
                    recyclerView.invalidate();
                    n3Var.L.P0.G();
                    k4 k4Var = n3Var.L;
                    w3 w3Var = k4Var.K;
                    if (w3Var != null) {
                        w3Var.f42886c.invalidate();
                    } else {
                        ArticleViewer$WindowView articleViewer$WindowView = k4Var.f38760f0;
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
                if (!oVar.I && !oVar.f40035r && oVar.d.N0() > oVar.E - 2) {
                    oVar.W();
                    return;
                }
                return;
            case 2:
                k4 k4Var3 = (k4) obj;
                if (k4Var3.f38763i0.f43173w.I1) {
                    AndroidUtilities.hideKeyboard(k4Var3.f38762h0.f43260b0);
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
                org.telegram.ui.Components.ta taVar = yuVar.f33214s;
                if (taVar != null) {
                    yuVar.f33215w = !taVar.Y();
                    taVar.invalidate();
                    return;
                }
                return;
            case 10:
                q00 q00Var = (q00) obj;
                if (q00Var.f40671a.I1 && (k00Var = q00Var.K) != null && (c3Var = k00Var.f22316b) != null) {
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
                ((b20) obj).f35898s.invalidate();
                return;
            case 12:
                d60 d60Var = (d60) obj;
                if (d60Var.f36486z0 == null) {
                    d60Var.f36486z0 = (tc) d60Var.A0(d60Var.Z);
                }
                int measuredHeight = d60Var.f36486z0.getMeasuredHeight();
                kVar = ((org.telegram.ui.ActionBar.o2) d60Var).actionBar;
                int measuredHeight2 = measuredHeight - kVar.getMeasuredHeight();
                float top = d60Var.f36486z0.getTop() * (-1);
                float f7 = measuredHeight2;
                float max = Math.max(Math.min(1.0f, top / f7), 0.0f);
                d60Var.A0 = max;
                float min = Math.min(max * 2.0f, 1.0f);
                float min2 = Math.min(Math.max(d60Var.A0 - 0.45f, 0.0f) * 2.0f, 1.0f);
                d60Var.f36486z0.f41990b.setAlpha(AndroidUtilities.lerp(1.0f, 0.0f, min));
                d60Var.f36486z0.f41992f.setAlpha(AndroidUtilities.lerp(1.0f, 0.0f, min));
                d60Var.f36486z0.f41991c.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, min2));
                if (d60Var.A0 >= 1.0f) {
                    d60Var.f36486z0.setTranslationY(top - f7);
                    return;
                } else {
                    d60Var.f36486z0.setTranslationY(0.0f);
                    return;
                }
            case 13:
                p60 p60Var = (p60) obj;
                int L0 = p60Var.f40369r.L0();
                View childAt = p60Var.f40364n.getChildAt(0);
                if (childAt != null) {
                    i12 = childAt.getTop();
                } else {
                    i12 = 0;
                }
                if (L0 != 0 || i12 < p60Var.f40364n.getPaddingTop()) {
                    z10 = true;
                }
                p60Var.e.b(z10, true);
                if (Build.VERSION.SDK_INT >= 31 && (fVar = p60Var.f40367p0) != null) {
                    fVar.f(i10, i11);
                    p60Var.e0();
                    return;
                }
                return;
            case 16:
                x70 x70Var = (x70) obj;
                x70Var.f43491n.L0();
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
                ((pi0) obj).J.invalidate();
                return;
            case 20:
                xi0 xi0Var = (xi0) obj;
                int L02 = xi0Var.h.L0();
                if (L02 != -1) {
                    i14 = Math.abs(xi0Var.h.N0() - L02) + 1;
                }
                int h = recyclerView.getAdapter().h();
                if (i14 > 0 && !xi0Var.V && !xi0Var.E && !xi0Var.f43627x.isEmpty() && L02 + i14 >= h - 5 && xi0Var.f43628y) {
                    xi0Var.c0();
                    return;
                }
                return;
            case 22:
                return;
            case 23:
                hv0 hv0Var = (hv0) obj;
                if (i11 != 0 && (p40Var = hv0Var.h) != null) {
                    p40Var.b(true);
                }
                org.telegram.ui.Components.kz0 kz0Var = hv0Var.Q;
                if (kz0Var != null && kz0Var.f28117s) {
                    org.telegram.ui.Components.iz0 delegate = kz0Var.getDelegate();
                    if (delegate instanceof org.telegram.ui.Cells.d6) {
                        wa1 wa1Var = hv0Var.f38034c;
                        View F = wa1Var.F((org.telegram.ui.Cells.d6) delegate);
                        if (F == null) {
                            T = null;
                        } else {
                            T = wa1Var.T(F);
                        }
                        if (T != null) {
                            View view = T.f46342a;
                            if (hv0Var.Q.getDirection() == 0) {
                                hv0Var.Q.setTranslationY((view.getY() - AndroidUtilities.dp(166.0f)) + view.getMeasuredHeight());
                            } else {
                                hv0Var.Q.setTranslationY(view.getY());
                            }
                            s4.b0 b0Var = hv0Var.d;
                            if (!b0Var.f46436c.X(view) || !b0Var.d.X(view)) {
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
                premiumPreviewFragment.f33807d0.invalidate();
                if (Build.VERSION.SDK_INT >= 31 && (fVar3 = premiumPreviewFragment.f33832x0) != null) {
                    fVar3.f(i10, i11);
                    premiumPreviewFragment.j0();
                    return;
                }
                return;
            case 25:
                nx0 nx0Var = (nx0) obj;
                if (!nx0Var.getMessagesController().blockedEndReached) {
                    int abs = Math.abs(nx0Var.f40008b.N0() - nx0Var.f40008b.L0()) + 1;
                    int h10 = recyclerView.getAdapter().h();
                    if (abs > 0 && nx0Var.f40008b.N0() >= h10 - 10) {
                        nx0Var.getMessagesController().getBlockedPeers(false);
                        return;
                    }
                    return;
                }
                return;
            case 26:
                q21 q21Var = (q21) obj;
                q21Var.e.invalidate();
                r21.u(q21Var.v).invalidate();
                return;
            case 28:
                b81 b81Var = (b81) obj;
                b81Var.q0(false, true);
                if (b81Var.f35956c.I1) {
                    AndroidUtilities.hideKeyboard(b81Var.fragmentView);
                }
                if (Build.VERSION.SDK_INT >= 31 && (fVar4 = b81Var.X) != null) {
                    fVar4.f(i10, i11);
                    b81Var.k0();
                    return;
                }
                return;
            case 29:
                pc1 pc1Var = (pc1) obj;
                pc1Var.f40499v0.g1();
                pc1Var.f40493s0 = true;
                return;
        }
    }

    public j3(vb vbVar) {
        this.f38446a = 4;
        this.f38447b = vbVar;
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
