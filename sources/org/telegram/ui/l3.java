package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class l3 extends f2.z0 {
    public final int f35899a;
    public final Object f35900b;

    public l3(Object obj, int i10) {
        this.f35899a = i10;
        this.f35900b = obj;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        org.telegram.ui.ActionBar.k kVar;
        View view;
        View view2;
        View m9;
        org.telegram.ui.ActionBar.k kVar2;
        View view3;
        switch (this.f35899a) {
            case 0:
                if (i10 == 0) {
                    ((p3) this.f35900b).H.L0.W();
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
                sb sbVar = (sb) this.f35900b;
                if (i10 == 1) {
                    sbVar.T = true;
                    sbVar.W = true;
                    return;
                } else if (i10 == 0) {
                    sbVar.T = false;
                    sbVar.W = false;
                    sbVar.T0(true);
                    return;
                } else {
                    return;
                }
            case 5:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((xn) this.f35900b).U0);
                    return;
                }
                return;
            case 6:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((jq) this.f35900b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 7:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((pr) this.f35900b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 8:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((yt) this.f35900b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 11:
                l20 l20Var = (l20) this.f35900b;
                if (i10 == 0) {
                    kVar = ((org.telegram.ui.ActionBar.p2) l20Var).actionBar;
                    int dp = AndroidUtilities.dp(16.0f) + kVar.getBottom();
                    if (l20Var.v > 0.5f) {
                        l20Var.f35881c.v0(0, l20Var.f35884r - dp, null);
                        return;
                    }
                    if (l20Var.f35881c.getLayoutManager() != null) {
                        view = l20Var.f35881c.getLayoutManager().m(0);
                    } else {
                        view = null;
                    }
                    if (view != null && view.getTop() < 0) {
                        l20Var.f35881c.v0(0, view.getTop(), null);
                        return;
                    }
                    return;
                }
                return;
            case 12:
                m60 m60Var = (m60) this.f35900b;
                if (i10 == 0) {
                    float f10 = m60Var.f36200x0;
                    if (f10 >= 0.5f && f10 < 1.0f) {
                        int bottom = m60.h1(m60Var).getBottom();
                        f2.v0 layoutManager = m60Var.J.getLayoutManager();
                        if (layoutManager != null && (m9 = layoutManager.m(0)) != null) {
                            m60Var.J.v0(0, m9.getBottom() - bottom, null);
                            return;
                        }
                        return;
                    } else if (f10 < 0.5f) {
                        if (m60Var.J.getLayoutManager() != null) {
                            view2 = m60Var.J.getLayoutManager().m(0);
                        } else {
                            view2 = null;
                        }
                        if (view2 != null && view2.getTop() < 0) {
                            m60Var.J.v0(0, view2.getTop(), null);
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 13:
                y60 y60Var = (y60) this.f35900b;
                if (i10 == 1) {
                    y60Var.f40419f.f23815r.hideActionMode();
                    AndroidUtilities.hideKeyboard(y60Var.f40419f.f23815r);
                    return;
                }
                return;
            case 14:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((e70) this.f35900b).f33917c);
                    return;
                }
                return;
            case 15:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((m70) this.f35900b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 16:
                c80 c80Var = (c80) this.f35900b;
                if (i10 == 1) {
                    c80Var.d.d.hideActionMode();
                    AndroidUtilities.hideKeyboard(c80Var.d.d);
                    return;
                }
                return;
            case 17:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((LanguageSelectActivity) this.f35900b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 18:
                if (i10 == 1) {
                    ad0 ad0Var = (ad0) this.f35900b;
                    if (ad0Var.f32539o0 && ad0Var.f32540p0) {
                        AndroidUtilities.hideKeyboard(ad0Var.getParentActivity().getCurrentFocus());
                        return;
                    }
                    return;
                }
                return;
            case 20:
                return;
            case 21:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((hj0) this.f35900b).V.getEditText());
                    return;
                }
                return;
            case 22:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((NotificationsCustomSettingsActivity) this.f35900b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 24:
                return;
            case 25:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.f35900b;
                if (i10 == 0) {
                    kVar2 = ((org.telegram.ui.ActionBar.p2) premiumPreviewFragment).actionBar;
                    int dp2 = AndroidUtilities.dp(16.0f) + kVar2.getBottom();
                    if (premiumPreviewFragment.f31956c0 > 0.5f) {
                        premiumPreviewFragment.f31951a.v0(0, premiumPreviewFragment.Z - dp2, null);
                        return;
                    }
                    if (premiumPreviewFragment.f31951a.getLayoutManager() != null) {
                        view3 = premiumPreviewFragment.f31951a.getLayoutManager().m(0);
                    } else {
                        view3 = null;
                    }
                    if (view3 != null && view3.getTop() < 0) {
                        premiumPreviewFragment.f31951a.v0(0, view3.getTop(), null);
                        return;
                    }
                    return;
                }
                return;
            case 28:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((n31) this.f35900b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i10, int i11) {
        v00 v00Var;
        org.telegram.ui.Cells.d3 d3Var;
        int i12;
        ng.e eVar;
        ng.e eVar2;
        f2.l1 T;
        org.telegram.ui.Components.k40 k40Var;
        ng.e eVar3;
        ViewGroup viewGroup;
        ng.e eVar4;
        int i13 = this.f35899a;
        boolean z4 = false;
        int i14 = 0;
        Object obj = this.f35900b;
        switch (i13) {
            case 0:
                p3 p3Var = (p3) obj;
                if (recyclerView.getChildCount() != 0) {
                    recyclerView.invalidate();
                    p3Var.H.L0.H();
                    l4 l4Var = p3Var.H;
                    y3 y3Var = l4Var.H;
                    if (y3Var != null) {
                        y3Var.f40366c.invalidate();
                    } else {
                        ArticleViewer$WindowView articleViewer$WindowView = l4Var.f35931c0;
                        if (articleViewer$WindowView != null) {
                            articleViewer$WindowView.invalidate();
                        }
                    }
                    p3Var.H.f0();
                    l4 l4Var2 = p3Var.H;
                    y3 y3Var2 = l4Var2.H;
                    if (y3Var2 == null || y3Var2.C) {
                        l4Var2.X(l4Var2.F0 - i11);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                r rVar = (r) obj;
                if (!rVar.F && !rVar.f37887r && rVar.d.N0() > rVar.B - 2) {
                    rVar.W();
                    return;
                }
                return;
            case 2:
                l4 l4Var3 = (l4) obj;
                if (l4Var3.f35934f0.f39553w.H1) {
                    AndroidUtilities.hideKeyboard(l4Var3.f35933e0.V);
                    return;
                }
                return;
            case 3:
                ((j8) obj).p0();
                return;
            case 4:
                sb sbVar = (sb) obj;
                sbVar.B.invalidate();
                if (i11 != 0 && sbVar.T && !sbVar.R && sbVar.N.getTag() == null) {
                    AnimatorSet animatorSet = sbVar.S;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                    }
                    sbVar.N.setTag(1);
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    sbVar.S = animatorSet2;
                    animatorSet2.setDuration(150L);
                    sbVar.S.playTogether(ObjectAnimator.ofFloat(sbVar.N, "alpha", 1.0f));
                    sbVar.S.addListener(new s5(this, 13));
                    sbVar.S.start();
                }
                if (i11 != 0) {
                    sbVar.U0(1);
                }
                sbVar.O0(true);
                sbVar.d1();
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
                gv gvVar = (gv) obj;
                org.telegram.ui.Components.na naVar = gvVar.f28680s;
                if (naVar != null) {
                    gvVar.f28681w = !naVar.Z();
                    naVar.invalidate();
                    return;
                }
                return;
            case 10:
                b10 b10Var = (b10) obj;
                if (b10Var.f32759a.H1 && (v00Var = b10Var.H) != null && (d3Var = v00Var.f21050b) != null) {
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
                ((l20) obj).f35885s.invalidate();
                return;
            case 12:
                m60 m60Var = (m60) obj;
                if (m60Var.f36199w0 == null) {
                    m60Var.f36199w0 = (uc) m60Var.y0(m60Var.W);
                }
                int measuredHeight = m60Var.f36199w0.getMeasuredHeight() - m60.g1(m60Var).getMeasuredHeight();
                float top = m60Var.f36199w0.getTop() * (-1);
                float f10 = measuredHeight;
                float max = Math.max(Math.min(1.0f, top / f10), 0.0f);
                m60Var.f36200x0 = max;
                float min = Math.min(max * 2.0f, 1.0f);
                float min2 = Math.min(Math.max(m60Var.f36200x0 - 0.45f, 0.0f) * 2.0f, 1.0f);
                m60Var.f36199w0.f38903b.setAlpha(AndroidUtilities.lerp(1.0f, 0.0f, min));
                m60Var.f36199w0.f38905f.setAlpha(AndroidUtilities.lerp(1.0f, 0.0f, min));
                m60Var.f36199w0.f38904c.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, min2));
                if (m60Var.f36200x0 >= 1.0f) {
                    m60Var.f36199w0.setTranslationY(top - f10);
                    return;
                } else {
                    m60Var.f36199w0.setTranslationY(0.0f);
                    return;
                }
            case 13:
                y60 y60Var = (y60) obj;
                int L0 = y60Var.f40432r.L0();
                View childAt = y60Var.f40427n.getChildAt(0);
                if (childAt != null) {
                    i12 = childAt.getTop();
                } else {
                    i12 = 0;
                }
                y60Var.e.b((L0 != 0 || i12 < y60Var.f40427n.getPaddingTop()) ? true : true, true);
                if (Build.VERSION.SDK_INT >= 31 && (eVar = y60Var.m0) != null) {
                    eVar.f(i10, i11);
                    y60Var.e0();
                    return;
                }
                return;
            case 16:
                c80 c80Var = (c80) obj;
                c80Var.f33220n.L0();
                View childAt2 = c80Var.h.getChildAt(0);
                if (childAt2 != null) {
                    childAt2.getTop();
                }
                if (Build.VERSION.SDK_INT >= 31 && (eVar2 = c80Var.I) != null) {
                    eVar2.f(i10, i11);
                    c80Var.Y();
                    return;
                }
                return;
            case 19:
                ((si0) obj).H.invalidate();
                return;
            case 20:
                aj0 aj0Var = (aj0) obj;
                int L02 = aj0Var.h.L0();
                if (L02 != -1) {
                    i14 = Math.abs(aj0Var.h.N0() - L02) + 1;
                }
                int h = recyclerView.getAdapter().h();
                if (i14 > 0 && !aj0Var.S && !aj0Var.B && !aj0Var.f32656x.isEmpty() && L02 + i14 >= h - 5 && aj0Var.f32657y) {
                    aj0Var.b0();
                    return;
                }
                return;
            case 22:
                return;
            case 23:
                bp0.a((bp0) obj);
                return;
            case 24:
                fv0 fv0Var = (fv0) obj;
                if (i11 != 0 && (k40Var = fv0Var.h) != null) {
                    k40Var.b(true);
                }
                org.telegram.ui.Components.qy0 qy0Var = fv0Var.N;
                if (qy0Var != null && qy0Var.f28310s) {
                    org.telegram.ui.Components.oy0 delegate = qy0Var.getDelegate();
                    if (delegate instanceof org.telegram.ui.Cells.c6) {
                        jb1 jb1Var = fv0Var.f34376c;
                        View F = jb1Var.F((org.telegram.ui.Cells.c6) delegate);
                        if (F == null) {
                            T = null;
                        } else {
                            T = jb1Var.T(F);
                        }
                        if (T != null) {
                            View view = T.f5785a;
                            if (fv0Var.N.getDirection() == 0) {
                                fv0Var.N.setTranslationY((view.getY() - AndroidUtilities.dp(166.0f)) + view.getMeasuredHeight());
                            } else {
                                fv0Var.N.setTranslationY(view.getY());
                            }
                            f2.i0 i0Var = fv0Var.d;
                            if (!i0Var.f5849c.V(view) || !i0Var.d.V(view)) {
                                fv0Var.N.f();
                                return;
                            }
                            return;
                        }
                        fv0Var.N.f();
                        return;
                    }
                    fv0Var.N.f();
                    return;
                }
                return;
            case 25:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) obj;
                premiumPreviewFragment.f31952a0.invalidate();
                if (Build.VERSION.SDK_INT >= 31 && (eVar3 = premiumPreviewFragment.f31973r0) != null) {
                    eVar3.f(i10, i11);
                    premiumPreviewFragment.j0();
                    return;
                }
                return;
            case 26:
                mx0 mx0Var = (mx0) obj;
                if (!mx0Var.getMessagesController().blockedEndReached) {
                    int abs = Math.abs(mx0Var.f36401b.N0() - mx0Var.f36401b.L0()) + 1;
                    int h9 = recyclerView.getAdapter().h();
                    if (abs > 0 && mx0Var.f36401b.N0() >= h9 - 10) {
                        mx0Var.getMessagesController().getBlockedPeers(false);
                        return;
                    }
                    return;
                }
                return;
            case 27:
                j31 j31Var = (j31) obj;
                j31Var.e.invalidate();
                viewGroup = ((org.telegram.ui.ActionBar.g3) j31Var.v).containerView;
                viewGroup.invalidate();
                return;
            case 29:
                o81 o81Var = (o81) obj;
                o81Var.o0(false, true);
                if (o81Var.f36816c.H1) {
                    AndroidUtilities.hideKeyboard(o81Var.fragmentView);
                }
                if (Build.VERSION.SDK_INT >= 31 && (eVar4 = o81Var.S) != null) {
                    eVar4.f(i10, i11);
                    o81Var.i0();
                    return;
                }
                return;
        }
    }

    public l3(sb sbVar) {
        this.f35899a = 4;
        this.f35900b = sbVar;
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
