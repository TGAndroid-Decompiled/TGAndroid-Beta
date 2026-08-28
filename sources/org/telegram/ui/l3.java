package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class l3 extends f2.d1 {
    public final int f39984a;
    public final Object f39985b;

    public l3(Object obj, int i9) {
        this.f39984a = i9;
        this.f39985b = obj;
    }

    @Override
    public void a(RecyclerView recyclerView, int i9) {
        org.telegram.ui.ActionBar.k kVar;
        View view;
        View view2;
        org.telegram.ui.ActionBar.k kVar2;
        View m10;
        org.telegram.ui.ActionBar.k kVar3;
        View view3;
        switch (this.f39984a) {
            case 0:
                if (i9 == 0) {
                    ((p3) this.f39985b).G.K0.W();
                    return;
                }
                return;
            case 1:
            case 2:
            case 3:
            case 9:
            case 10:
            case 19:
            case 23:
            case 26:
            case 27:
            default:
                return;
            case 4:
                pb pbVar = (pb) this.f39985b;
                if (i9 == 1) {
                    pbVar.S = true;
                    pbVar.V = true;
                    return;
                } else if (i9 == 0) {
                    pbVar.S = false;
                    pbVar.V = false;
                    pbVar.T0(true);
                    return;
                } else {
                    return;
                }
            case 5:
                if (i9 == 1) {
                    AndroidUtilities.hideKeyboard(((qn) this.f39985b).T0);
                    return;
                }
                return;
            case 6:
                if (i9 == 1) {
                    AndroidUtilities.hideKeyboard(((bq) this.f39985b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 7:
                if (i9 == 1) {
                    AndroidUtilities.hideKeyboard(((jr) this.f39985b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 8:
                if (i9 == 1) {
                    AndroidUtilities.hideKeyboard(((qt) this.f39985b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 11:
                x10 x10Var = (x10) this.f39985b;
                if (i9 == 0) {
                    kVar = ((org.telegram.ui.ActionBar.o2) x10Var).actionBar;
                    int dp = AndroidUtilities.dp(16.0f) + kVar.getBottom();
                    if (x10Var.v > 0.5f) {
                        x10Var.f44314c.v0(0, x10Var.f44318r - dp, null);
                        return;
                    }
                    if (x10Var.f44314c.getLayoutManager() != null) {
                        view = x10Var.f44314c.getLayoutManager().m(0);
                    } else {
                        view = null;
                    }
                    if (view != null && view.getTop() < 0) {
                        x10Var.f44314c.v0(0, view.getTop(), null);
                        return;
                    }
                    return;
                }
                return;
            case 12:
                y50 y50Var = (y50) this.f39985b;
                if (i9 == 0) {
                    float f10 = y50Var.f44728w0;
                    if (f10 >= 0.5f && f10 < 1.0f) {
                        kVar2 = ((org.telegram.ui.ActionBar.o2) y50Var).actionBar;
                        int bottom = kVar2.getBottom();
                        f2.z0 layoutManager = y50Var.I.getLayoutManager();
                        if (layoutManager != null && (m10 = layoutManager.m(0)) != null) {
                            y50Var.I.v0(0, m10.getBottom() - bottom, null);
                            return;
                        }
                        return;
                    } else if (f10 < 0.5f) {
                        if (y50Var.I.getLayoutManager() != null) {
                            view2 = y50Var.I.getLayoutManager().m(0);
                        } else {
                            view2 = null;
                        }
                        if (view2 != null && view2.getTop() < 0) {
                            y50Var.I.v0(0, view2.getTop(), null);
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 13:
                k60 k60Var = (k60) this.f39985b;
                if (i9 == 1) {
                    k60Var.f39734f.f30664r.hideActionMode();
                    AndroidUtilities.hideKeyboard(k60Var.f39734f.f30664r);
                    return;
                }
                return;
            case 14:
                if (i9 == 1) {
                    AndroidUtilities.hideKeyboard(((r60) this.f39985b).f42279c);
                    return;
                }
                return;
            case 15:
                if (i9 == 1) {
                    AndroidUtilities.hideKeyboard(((z60) this.f39985b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 16:
                q70 q70Var = (q70) this.f39985b;
                if (i9 == 1) {
                    q70Var.d.d.hideActionMode();
                    AndroidUtilities.hideKeyboard(q70Var.d.d);
                    return;
                }
                return;
            case 17:
                if (i9 == 1) {
                    AndroidUtilities.hideKeyboard(((LanguageSelectActivity) this.f39985b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 18:
                if (i9 == 1) {
                    pc0 pc0Var = (pc0) this.f39985b;
                    if (pc0Var.f41459n0 && pc0Var.f41460o0) {
                        AndroidUtilities.hideKeyboard(pc0Var.getParentActivity().getCurrentFocus());
                        return;
                    }
                    return;
                }
                return;
            case 20:
                return;
            case 21:
                if (i9 == 1) {
                    AndroidUtilities.hideKeyboard(((bj0) this.f39985b).U.getEditText());
                    return;
                }
                return;
            case 22:
                if (i9 == 1) {
                    AndroidUtilities.hideKeyboard(((NotificationsCustomSettingsActivity) this.f39985b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 24:
                return;
            case 25:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.f39985b;
                if (i9 == 0) {
                    kVar3 = ((org.telegram.ui.ActionBar.o2) premiumPreviewFragment).actionBar;
                    int dp2 = AndroidUtilities.dp(16.0f) + kVar3.getBottom();
                    if (premiumPreviewFragment.f35842b0 > 0.5f) {
                        premiumPreviewFragment.f35839a.v0(0, premiumPreviewFragment.Y - dp2, null);
                        return;
                    }
                    if (premiumPreviewFragment.f35839a.getLayoutManager() != null) {
                        view3 = premiumPreviewFragment.f35839a.getLayoutManager().m(0);
                    } else {
                        view3 = null;
                    }
                    if (view3 != null && view3.getTop() < 0) {
                        premiumPreviewFragment.f35839a.v0(0, view3.getTop(), null);
                        return;
                    }
                    return;
                }
                return;
            case 28:
                if (i9 == 1) {
                    AndroidUtilities.hideKeyboard(((b31) this.f39985b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i9, int i10) {
        h00 h00Var;
        org.telegram.ui.Cells.d3 d3Var;
        org.telegram.ui.ActionBar.k kVar;
        int i11;
        ig.e eVar;
        ig.e eVar2;
        f2.q1 T;
        org.telegram.ui.Components.s30 s30Var;
        ig.e eVar3;
        ig.e eVar4;
        int i12 = this.f39984a;
        boolean z10 = false;
        int i13 = 0;
        Object obj = this.f39985b;
        switch (i12) {
            case 0:
                p3 p3Var = (p3) obj;
                if (recyclerView.getChildCount() != 0) {
                    recyclerView.invalidate();
                    p3Var.G.K0.H();
                    l4 l4Var = p3Var.G;
                    y3 y3Var = l4Var.G;
                    if (y3Var != null) {
                        y3Var.f44700c.invalidate();
                    } else {
                        ArticleViewer$WindowView articleViewer$WindowView = l4Var.f40012b0;
                        if (articleViewer$WindowView != null) {
                            articleViewer$WindowView.invalidate();
                        }
                    }
                    p3Var.G.f0();
                    l4 l4Var2 = p3Var.G;
                    y3 y3Var2 = l4Var2.G;
                    if (y3Var2 == null || y3Var2.B) {
                        l4Var2.X(l4Var2.E0 - i10);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                p pVar = (p) obj;
                if (!pVar.E && !pVar.f41292r && pVar.d.N0() > pVar.A - 2) {
                    pVar.V();
                    return;
                }
                return;
            case 2:
                l4 l4Var3 = (l4) obj;
                if (l4Var3.f40015e0.f43913w.G1) {
                    AndroidUtilities.hideKeyboard(l4Var3.f40014d0.U);
                    return;
                }
                return;
            case 3:
                ((g8) obj).o0();
                return;
            case 4:
                pb pbVar = (pb) obj;
                pbVar.A.invalidate();
                if (i10 != 0 && pbVar.S && !pbVar.Q && pbVar.M.getTag() == null) {
                    AnimatorSet animatorSet = pbVar.R;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                    }
                    pbVar.M.setTag(1);
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    pbVar.R = animatorSet2;
                    animatorSet2.setDuration(150L);
                    pbVar.R.playTogether(ObjectAnimator.ofFloat(pbVar.M, "alpha", 1.0f));
                    pbVar.R.addListener(new mh.x(this, 20));
                    pbVar.R.start();
                }
                if (i10 != 0) {
                    pbVar.U0(1);
                }
                pbVar.O0(true);
                pbVar.d1();
                return;
            case 5:
            case 6:
            case 8:
            case 14:
            case 15:
            case 17:
            case 18:
            case 21:
            case 28:
            default:
                return;
            case 7:
                return;
            case 9:
                xu xuVar = (xu) obj;
                org.telegram.ui.Components.na naVar = xuVar.f32412s;
                if (naVar != null) {
                    xuVar.f32413w = !naVar.Z();
                    naVar.invalidate();
                    return;
                }
                return;
            case 10:
                n00 n00Var = (n00) obj;
                if (n00Var.f40564a.G1 && (h00Var = n00Var.G) != null && (d3Var = h00Var.f24373b) != null) {
                    if (d3Var.f33124e) {
                        d3Var.k(true);
                        return;
                    } else {
                        d3Var.d();
                        return;
                    }
                }
                return;
            case 11:
                ((x10) obj).f44319s.invalidate();
                return;
            case 12:
                y50 y50Var = (y50) obj;
                if (y50Var.f44727v0 == null) {
                    y50Var.f44727v0 = (pc) y50Var.x0(y50Var.V);
                }
                int measuredHeight = y50Var.f44727v0.getMeasuredHeight();
                kVar = ((org.telegram.ui.ActionBar.o2) y50Var).actionBar;
                int measuredHeight2 = measuredHeight - kVar.getMeasuredHeight();
                float top = y50Var.f44727v0.getTop() * (-1);
                float f10 = measuredHeight2;
                float max = Math.max(Math.min(1.0f, top / f10), 0.0f);
                y50Var.f44728w0 = max;
                float min = Math.min(max * 2.0f, 1.0f);
                float min2 = Math.min(Math.max(y50Var.f44728w0 - 0.45f, 0.0f) * 2.0f, 1.0f);
                y50Var.f44727v0.f41437b.setAlpha(AndroidUtilities.lerp(1.0f, 0.0f, min));
                y50Var.f44727v0.f41440f.setAlpha(AndroidUtilities.lerp(1.0f, 0.0f, min));
                y50Var.f44727v0.f41438c.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, min2));
                if (y50Var.f44728w0 >= 1.0f) {
                    y50Var.f44727v0.setTranslationY(top - f10);
                    return;
                } else {
                    y50Var.f44727v0.setTranslationY(0.0f);
                    return;
                }
            case 13:
                k60 k60Var = (k60) obj;
                int L0 = k60Var.f39747r.L0();
                View childAt = k60Var.f39742n.getChildAt(0);
                if (childAt != null) {
                    i11 = childAt.getTop();
                } else {
                    i11 = 0;
                }
                k60Var.f39732e.b((L0 != 0 || i11 < k60Var.f39742n.getPaddingTop()) ? true : true, true);
                if (Build.VERSION.SDK_INT >= 31 && (eVar = k60Var.f39741l0) != null) {
                    eVar.f(i9, i10);
                    k60Var.d0();
                    return;
                }
                return;
            case 16:
                q70 q70Var = (q70) obj;
                q70Var.f41705n.L0();
                View childAt2 = q70Var.h.getChildAt(0);
                if (childAt2 != null) {
                    childAt2.getTop();
                }
                if (Build.VERSION.SDK_INT >= 31 && (eVar2 = q70Var.H) != null) {
                    eVar2.f(i9, i10);
                    q70Var.X();
                    return;
                }
                return;
            case 19:
                ((li0) obj).G.invalidate();
                return;
            case 20:
                ti0 ti0Var = (ti0) obj;
                int L02 = ti0Var.h.L0();
                if (L02 != -1) {
                    i13 = Math.abs(ti0Var.h.N0() - L02) + 1;
                }
                int h = recyclerView.getAdapter().h();
                if (i13 > 0 && !ti0Var.R && !ti0Var.A && !ti0Var.f43020x.isEmpty() && L02 + i13 >= h - 5 && ti0Var.f43021y) {
                    ti0Var.a0();
                    return;
                }
                return;
            case 22:
                return;
            case 23:
                uo0.a((uo0) obj);
                return;
            case 24:
                xu0 xu0Var = (xu0) obj;
                if (i10 != 0 && (s30Var = xu0Var.h) != null) {
                    s30Var.b(true);
                }
                org.telegram.ui.Components.ux0 ux0Var = xu0Var.M;
                if (ux0Var != null && ux0Var.f33165s) {
                    org.telegram.ui.Components.sx0 delegate = ux0Var.getDelegate();
                    if (delegate instanceof org.telegram.ui.Cells.c6) {
                        va1 va1Var = xu0Var.f44611c;
                        View F = va1Var.F((org.telegram.ui.Cells.c6) delegate);
                        if (F == null) {
                            T = null;
                        } else {
                            T = va1Var.T(F);
                        }
                        if (T != null) {
                            View view = T.f5501a;
                            if (xu0Var.M.getDirection() == 0) {
                                xu0Var.M.setTranslationY((view.getY() - AndroidUtilities.dp(166.0f)) + view.getMeasuredHeight());
                            } else {
                                xu0Var.M.setTranslationY(view.getY());
                            }
                            f2.m0 m0Var = xu0Var.d;
                            if (!m0Var.f5564c.G(view) || !m0Var.d.G(view)) {
                                xu0Var.M.f();
                                return;
                            }
                            return;
                        }
                        xu0Var.M.f();
                        return;
                    }
                    xu0Var.M.f();
                    return;
                }
                return;
            case 25:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) obj;
                premiumPreviewFragment.Z.invalidate();
                if (Build.VERSION.SDK_INT >= 31 && (eVar3 = premiumPreviewFragment.f35860q0) != null) {
                    eVar3.f(i9, i10);
                    premiumPreviewFragment.i0();
                    return;
                }
                return;
            case 26:
                cx0 cx0Var = (cx0) obj;
                if (!cx0Var.getMessagesController().blockedEndReached) {
                    int abs = Math.abs(cx0Var.f37340b.N0() - cx0Var.f37340b.L0()) + 1;
                    int h10 = recyclerView.getAdapter().h();
                    if (abs > 0 && cx0Var.f37340b.N0() >= h10 - 10) {
                        cx0Var.getMessagesController().getBlockedPeers(false);
                        return;
                    }
                    return;
                }
                return;
            case 27:
                x21 x21Var = (x21) obj;
                x21Var.f44339e.invalidate();
                y21.t(x21Var.v).invalidate();
                return;
            case 29:
                z71 z71Var = (z71) obj;
                z71Var.n0(false, true);
                if (z71Var.f45062c.G1) {
                    AndroidUtilities.hideKeyboard(z71Var.fragmentView);
                }
                if (Build.VERSION.SDK_INT >= 31 && (eVar4 = z71Var.R) != null) {
                    eVar4.f(i9, i10);
                    z71Var.h0();
                    return;
                }
                return;
        }
    }

    public l3(pb pbVar) {
        this.f39984a = 4;
        this.f39985b = pbVar;
        AndroidUtilities.dp(100.0f);
    }

    private final void c(RecyclerView recyclerView, int i9) {
    }

    private final void d(RecyclerView recyclerView, int i9) {
    }

    private final void e(RecyclerView recyclerView, int i9, int i10) {
    }

    private final void f(RecyclerView recyclerView, int i9, int i10) {
    }
}
