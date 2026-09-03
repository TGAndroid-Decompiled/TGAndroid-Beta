package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class l3 extends f2.a1 {
    public final int f38476a;
    public final Object f38477b;

    public l3(Object obj, int i10) {
        this.f38476a = i10;
        this.f38477b = obj;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        org.telegram.ui.ActionBar.k kVar;
        View view;
        View view2;
        View m9;
        org.telegram.ui.ActionBar.k kVar2;
        View view3;
        switch (this.f38476a) {
            case 0:
                if (i10 == 0) {
                    ((p3) this.f38477b).H.L0.W();
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
                sb sbVar = (sb) this.f38477b;
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
                    AndroidUtilities.hideKeyboard(((xn) this.f38477b).U0);
                    return;
                }
                return;
            case 6:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((kq) this.f38477b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 7:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((qr) this.f38477b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 8:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((zt) this.f38477b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 11:
                m20 m20Var = (m20) this.f38477b;
                if (i10 == 0) {
                    kVar = ((org.telegram.ui.ActionBar.p2) m20Var).actionBar;
                    int dp = AndroidUtilities.dp(16.0f) + kVar.getBottom();
                    if (m20Var.v > 0.5f) {
                        m20Var.f38834c.v0(0, m20Var.f38838r - dp, null);
                        return;
                    }
                    if (m20Var.f38834c.getLayoutManager() != null) {
                        view = m20Var.f38834c.getLayoutManager().m(0);
                    } else {
                        view = null;
                    }
                    if (view != null && view.getTop() < 0) {
                        m20Var.f38834c.v0(0, view.getTop(), null);
                        return;
                    }
                    return;
                }
                return;
            case 12:
                n60 n60Var = (n60) this.f38477b;
                if (i10 == 0) {
                    float f10 = n60Var.f39202x0;
                    if (f10 >= 0.5f && f10 < 1.0f) {
                        int bottom = n60.h1(n60Var).getBottom();
                        f2.w0 layoutManager = n60Var.J.getLayoutManager();
                        if (layoutManager != null && (m9 = layoutManager.m(0)) != null) {
                            n60Var.J.v0(0, m9.getBottom() - bottom, null);
                            return;
                        }
                        return;
                    } else if (f10 < 0.5f) {
                        if (n60Var.J.getLayoutManager() != null) {
                            view2 = n60Var.J.getLayoutManager().m(0);
                        } else {
                            view2 = null;
                        }
                        if (view2 != null && view2.getTop() < 0) {
                            n60Var.J.v0(0, view2.getTop(), null);
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 13:
                z60 z60Var = (z60) this.f38477b;
                if (i10 == 1) {
                    z60Var.f43820f.f26132r.hideActionMode();
                    AndroidUtilities.hideKeyboard(z60Var.f43820f.f26132r);
                    return;
                }
                return;
            case 14:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((f70) this.f38477b).f36692c);
                    return;
                }
                return;
            case 15:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((n70) this.f38477b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 16:
                d80 d80Var = (d80) this.f38477b;
                if (i10 == 1) {
                    d80Var.d.d.hideActionMode();
                    AndroidUtilities.hideKeyboard(d80Var.d.d);
                    return;
                }
                return;
            case 17:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((LanguageSelectActivity) this.f38477b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 18:
                if (i10 == 1) {
                    bd0 bd0Var = (bd0) this.f38477b;
                    if (bd0Var.f35487o0 && bd0Var.f35488p0) {
                        AndroidUtilities.hideKeyboard(bd0Var.getParentActivity().getCurrentFocus());
                        return;
                    }
                    return;
                }
                return;
            case 20:
                return;
            case 21:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((ij0) this.f38477b).V.getEditText());
                    return;
                }
                return;
            case 22:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((NotificationsCustomSettingsActivity) this.f38477b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 23:
                return;
            case 24:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.f38477b;
                if (i10 == 0) {
                    kVar2 = ((org.telegram.ui.ActionBar.p2) premiumPreviewFragment).actionBar;
                    int dp2 = AndroidUtilities.dp(16.0f) + kVar2.getBottom();
                    if (premiumPreviewFragment.f34485c0 > 0.5f) {
                        premiumPreviewFragment.f34480a.v0(0, premiumPreviewFragment.Z - dp2, null);
                        return;
                    }
                    if (premiumPreviewFragment.f34480a.getLayoutManager() != null) {
                        view3 = premiumPreviewFragment.f34480a.getLayoutManager().m(0);
                    } else {
                        view3 = null;
                    }
                    if (view3 != null && view3.getTop() < 0) {
                        premiumPreviewFragment.f34480a.v0(0, view3.getTop(), null);
                        return;
                    }
                    return;
                }
                return;
            case 27:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((t31) this.f38477b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 29:
                if (i10 == 0) {
                    ((jd1) this.f38477b).f37999o0 = false;
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
        og.e eVar;
        og.e eVar2;
        f2.m1 T;
        org.telegram.ui.Components.m40 m40Var;
        og.e eVar3;
        og.e eVar4;
        int i13 = this.f38476a;
        boolean z4 = false;
        int i14 = 0;
        Object obj = this.f38477b;
        switch (i13) {
            case 0:
                p3 p3Var = (p3) obj;
                if (recyclerView.getChildCount() != 0) {
                    recyclerView.invalidate();
                    p3Var.H.L0.H();
                    l4 l4Var = p3Var.H;
                    y3 y3Var = l4Var.H;
                    if (y3Var != null) {
                        y3Var.f43523c.invalidate();
                    } else {
                        ArticleViewer$WindowView articleViewer$WindowView = l4Var.f38510c0;
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
                if (!rVar.F && !rVar.f40728r && rVar.d.N0() > rVar.B - 2) {
                    rVar.W();
                    return;
                }
                return;
            case 2:
                l4 l4Var3 = (l4) obj;
                if (l4Var3.f38513f0.f42574w.H1) {
                    AndroidUtilities.hideKeyboard(l4Var3.f38512e0.V);
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
            case 27:
            default:
                return;
            case 7:
                return;
            case 9:
                hv hvVar = (hv) obj;
                org.telegram.ui.Components.na naVar = hvVar.f31019s;
                if (naVar != null) {
                    hvVar.f31020w = !naVar.Z();
                    naVar.invalidate();
                    return;
                }
                return;
            case 10:
                b10 b10Var = (b10) obj;
                if (b10Var.f35304a.H1 && (v00Var = b10Var.H) != null && (d3Var = v00Var.f22795b) != null) {
                    if (d3Var.f27000e) {
                        d3Var.k(true);
                        return;
                    } else {
                        d3Var.d();
                        return;
                    }
                }
                return;
            case 11:
                ((m20) obj).f38839s.invalidate();
                return;
            case 12:
                n60 n60Var = (n60) obj;
                if (n60Var.f39201w0 == null) {
                    n60Var.f39201w0 = (tc) n60Var.y0(n60Var.W);
                }
                int measuredHeight = n60Var.f39201w0.getMeasuredHeight() - n60.g1(n60Var).getMeasuredHeight();
                float top = n60Var.f39201w0.getTop() * (-1);
                float f10 = measuredHeight;
                float max = Math.max(Math.min(1.0f, top / f10), 0.0f);
                n60Var.f39202x0 = max;
                float min = Math.min(max * 2.0f, 1.0f);
                float min2 = Math.min(Math.max(n60Var.f39202x0 - 0.45f, 0.0f) * 2.0f, 1.0f);
                n60Var.f39201w0.f41503b.setAlpha(AndroidUtilities.lerp(1.0f, 0.0f, min));
                n60Var.f39201w0.f41506f.setAlpha(AndroidUtilities.lerp(1.0f, 0.0f, min));
                n60Var.f39201w0.f41504c.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, min2));
                if (n60Var.f39202x0 >= 1.0f) {
                    n60Var.f39201w0.setTranslationY(top - f10);
                    return;
                } else {
                    n60Var.f39201w0.setTranslationY(0.0f);
                    return;
                }
            case 13:
                z60 z60Var = (z60) obj;
                int L0 = z60Var.f43833r.L0();
                View childAt = z60Var.f43828n.getChildAt(0);
                if (childAt != null) {
                    i12 = childAt.getTop();
                } else {
                    i12 = 0;
                }
                z60Var.f43818e.b((L0 != 0 || i12 < z60Var.f43828n.getPaddingTop()) ? true : true, true);
                if (Build.VERSION.SDK_INT >= 31 && (eVar = z60Var.m0) != null) {
                    eVar.f(i10, i11);
                    z60Var.e0();
                    return;
                }
                return;
            case 16:
                d80 d80Var = (d80) obj;
                d80Var.f36116n.L0();
                View childAt2 = d80Var.h.getChildAt(0);
                if (childAt2 != null) {
                    childAt2.getTop();
                }
                if (Build.VERSION.SDK_INT >= 31 && (eVar2 = d80Var.I) != null) {
                    eVar2.f(i10, i11);
                    d80Var.Y();
                    return;
                }
                return;
            case 19:
                ((ti0) obj).H.invalidate();
                return;
            case 20:
                bj0 bj0Var = (bj0) obj;
                int L02 = bj0Var.h.L0();
                if (L02 != -1) {
                    i14 = Math.abs(bj0Var.h.N0() - L02) + 1;
                }
                int h = recyclerView.getAdapter().h();
                if (i14 > 0 && !bj0Var.S && !bj0Var.B && !bj0Var.f35555x.isEmpty() && L02 + i14 >= h - 5 && bj0Var.f35556y) {
                    bj0Var.b0();
                    return;
                }
                return;
            case 22:
                return;
            case 23:
                mv0 mv0Var = (mv0) obj;
                if (i11 != 0 && (m40Var = mv0Var.h) != null) {
                    m40Var.b(true);
                }
                org.telegram.ui.Components.qy0 qy0Var = mv0Var.N;
                if (qy0Var != null && qy0Var.f30566s) {
                    org.telegram.ui.Components.oy0 delegate = qy0Var.getDelegate();
                    if (delegate instanceof org.telegram.ui.Cells.c6) {
                        qb1 qb1Var = mv0Var.f39093c;
                        View F = qb1Var.F((org.telegram.ui.Cells.c6) delegate);
                        if (F == null) {
                            T = null;
                        } else {
                            T = qb1Var.T(F);
                        }
                        if (T != null) {
                            View view = T.f5875a;
                            if (mv0Var.N.getDirection() == 0) {
                                mv0Var.N.setTranslationY((view.getY() - AndroidUtilities.dp(166.0f)) + view.getMeasuredHeight());
                            } else {
                                mv0Var.N.setTranslationY(view.getY());
                            }
                            f2.j0 j0Var = mv0Var.d;
                            if (!j0Var.f5942c.V(view) || !j0Var.d.V(view)) {
                                mv0Var.N.f();
                                return;
                            }
                            return;
                        }
                        mv0Var.N.f();
                        return;
                    }
                    mv0Var.N.f();
                    return;
                }
                return;
            case 24:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) obj;
                premiumPreviewFragment.f34481a0.invalidate();
                if (Build.VERSION.SDK_INT >= 31 && (eVar3 = premiumPreviewFragment.f34503r0) != null) {
                    eVar3.f(i10, i11);
                    premiumPreviewFragment.j0();
                    return;
                }
                return;
            case 25:
                tx0 tx0Var = (tx0) obj;
                if (!tx0Var.getMessagesController().blockedEndReached) {
                    int abs = Math.abs(tx0Var.f41650b.N0() - tx0Var.f41650b.L0()) + 1;
                    int h9 = recyclerView.getAdapter().h();
                    if (abs > 0 && tx0Var.f41650b.N0() >= h9 - 10) {
                        tx0Var.getMessagesController().getBlockedPeers(false);
                        return;
                    }
                    return;
                }
                return;
            case 26:
                p31 p31Var = (p31) obj;
                p31Var.f39875e.invalidate();
                q31.t(p31Var.v).invalidate();
                return;
            case 28:
                v81 v81Var = (v81) obj;
                v81Var.o0(false, true);
                if (v81Var.f42046c.H1) {
                    AndroidUtilities.hideKeyboard(v81Var.fragmentView);
                }
                if (Build.VERSION.SDK_INT >= 31 && (eVar4 = v81Var.S) != null) {
                    eVar4.f(i10, i11);
                    v81Var.i0();
                    return;
                }
                return;
            case 29:
                jd1 jd1Var = (jd1) obj;
                jd1Var.f38006r0.e1();
                jd1Var.f37999o0 = true;
                return;
        }
    }

    public l3(sb sbVar) {
        this.f38476a = 4;
        this.f38477b = sbVar;
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
