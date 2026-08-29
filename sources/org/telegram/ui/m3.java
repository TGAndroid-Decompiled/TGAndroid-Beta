package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class m3 extends f2.a1 {
    public final int f40359a;
    public final Object f40360b;

    public m3(Object obj, int i10) {
        this.f40359a = i10;
        this.f40360b = obj;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        org.telegram.ui.ActionBar.l lVar;
        View view;
        View view2;
        org.telegram.ui.ActionBar.l lVar2;
        View m10;
        org.telegram.ui.ActionBar.l lVar3;
        View view3;
        switch (this.f40359a) {
            case 0:
                if (i10 == 0) {
                    ((q3) this.f40360b).G.K0.W();
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
                ob obVar = (ob) this.f40360b;
                if (i10 == 1) {
                    obVar.S = true;
                    obVar.V = true;
                    return;
                } else if (i10 == 0) {
                    obVar.S = false;
                    obVar.V = false;
                    obVar.T0(true);
                    return;
                } else {
                    return;
                }
            case 5:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((tn) this.f40360b).T0);
                    return;
                }
                return;
            case 6:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((dq) this.f40360b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 7:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((jr) this.f40360b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 8:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((rt) this.f40360b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 11:
                z10 z10Var = (z10) this.f40360b;
                if (i10 == 0) {
                    lVar = ((org.telegram.ui.ActionBar.o2) z10Var).actionBar;
                    int dp = AndroidUtilities.dp(16.0f) + lVar.getBottom();
                    if (z10Var.v > 0.5f) {
                        z10Var.f45015c.v0(0, z10Var.f45019r - dp, null);
                        return;
                    }
                    if (z10Var.f45015c.getLayoutManager() != null) {
                        view = z10Var.f45015c.getLayoutManager().m(0);
                    } else {
                        view = null;
                    }
                    if (view != null && view.getTop() < 0) {
                        z10Var.f45015c.v0(0, view.getTop(), null);
                        return;
                    }
                    return;
                }
                return;
            case 12:
                a60 a60Var = (a60) this.f40360b;
                if (i10 == 0) {
                    float f9 = a60Var.f36441w0;
                    if (f9 >= 0.5f && f9 < 1.0f) {
                        lVar2 = ((org.telegram.ui.ActionBar.o2) a60Var).actionBar;
                        int bottom = lVar2.getBottom();
                        f2.w0 layoutManager = a60Var.I.getLayoutManager();
                        if (layoutManager != null && (m10 = layoutManager.m(0)) != null) {
                            a60Var.I.v0(0, m10.getBottom() - bottom, null);
                            return;
                        }
                        return;
                    } else if (f9 < 0.5f) {
                        if (a60Var.I.getLayoutManager() != null) {
                            view2 = a60Var.I.getLayoutManager().m(0);
                        } else {
                            view2 = null;
                        }
                        if (view2 != null && view2.getTop() < 0) {
                            a60Var.I.v0(0, view2.getTop(), null);
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 13:
                m60 m60Var = (m60) this.f40360b;
                if (i10 == 1) {
                    m60Var.f40450f.f34546r.hideActionMode();
                    AndroidUtilities.hideKeyboard(m60Var.f40450f.f34546r);
                    return;
                }
                return;
            case 14:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((t60) this.f40360b).f42559c);
                    return;
                }
                return;
            case 15:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((c70) this.f40360b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 16:
                s70 s70Var = (s70) this.f40360b;
                if (i10 == 1) {
                    s70Var.d.d.hideActionMode();
                    AndroidUtilities.hideKeyboard(s70Var.d.d);
                    return;
                }
                return;
            case 17:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((LanguageSelectActivity) this.f40360b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 18:
                if (i10 == 1) {
                    rc0 rc0Var = (rc0) this.f40360b;
                    if (rc0Var.f42050n0 && rc0Var.f42051o0) {
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
                    AndroidUtilities.hideKeyboard(((zi0) this.f40360b).U.getEditText());
                    return;
                }
                return;
            case 22:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((NotificationsCustomSettingsActivity) this.f40360b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 24:
                return;
            case 25:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.f40360b;
                if (i10 == 0) {
                    lVar3 = ((org.telegram.ui.ActionBar.o2) premiumPreviewFragment).actionBar;
                    int dp2 = AndroidUtilities.dp(16.0f) + lVar3.getBottom();
                    if (premiumPreviewFragment.f35908b0 > 0.5f) {
                        premiumPreviewFragment.f35905a.v0(0, premiumPreviewFragment.Y - dp2, null);
                        return;
                    }
                    if (premiumPreviewFragment.f35905a.getLayoutManager() != null) {
                        view3 = premiumPreviewFragment.f35905a.getLayoutManager().m(0);
                    } else {
                        view3 = null;
                    }
                    if (view3 != null && view3.getTop() < 0) {
                        premiumPreviewFragment.f35905a.v0(0, view3.getTop(), null);
                        return;
                    }
                    return;
                }
                return;
            case 28:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((b31) this.f40360b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i10, int i11) {
        j00 j00Var;
        org.telegram.ui.Cells.b3 b3Var;
        org.telegram.ui.ActionBar.l lVar;
        int i12;
        lg.e eVar;
        lg.e eVar2;
        f2.n1 T;
        org.telegram.ui.Components.g40 g40Var;
        lg.e eVar3;
        lg.e eVar4;
        int i13 = this.f40359a;
        boolean z10 = false;
        int i14 = 0;
        Object obj = this.f40360b;
        switch (i13) {
            case 0:
                q3 q3Var = (q3) obj;
                if (recyclerView.getChildCount() != 0) {
                    recyclerView.invalidate();
                    q3Var.G.K0.H();
                    m4 m4Var = q3Var.G;
                    z3 z3Var = m4Var.G;
                    if (z3Var != null) {
                        z3Var.f45046c.invalidate();
                    } else {
                        ArticleViewer$WindowView articleViewer$WindowView = m4Var.f40390b0;
                        if (articleViewer$WindowView != null) {
                            articleViewer$WindowView.invalidate();
                        }
                    }
                    q3Var.G.f0();
                    m4 m4Var2 = q3Var.G;
                    z3 z3Var2 = m4Var2.G;
                    if (z3Var2 == null || z3Var2.B) {
                        m4Var2.X(m4Var2.E0 - i11);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                r rVar = (r) obj;
                if (!rVar.E && !rVar.f41822r && rVar.d.N0() > rVar.A - 2) {
                    rVar.W();
                    return;
                }
                return;
            case 2:
                m4 m4Var3 = (m4) obj;
                if (m4Var3.f40393e0.f44103w.G1) {
                    AndroidUtilities.hideKeyboard(m4Var3.f40392d0.U);
                    return;
                }
                return;
            case 3:
                ((f8) obj).p0();
                return;
            case 4:
                ob obVar = (ob) obj;
                obVar.A.invalidate();
                if (i11 != 0 && obVar.S && !obVar.Q && obVar.M.getTag() == null) {
                    AnimatorSet animatorSet = obVar.R;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                    }
                    obVar.M.setTag(1);
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    obVar.R = animatorSet2;
                    animatorSet2.setDuration(150L);
                    obVar.R.playTogether(ObjectAnimator.ofFloat(obVar.M, "alpha", 1.0f));
                    obVar.R.addListener(new nh.q5(this, 22));
                    obVar.R.start();
                }
                if (i11 != 0) {
                    obVar.U0(1);
                }
                obVar.O0(true);
                obVar.d1();
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
                yu yuVar = (yu) obj;
                org.telegram.ui.Components.sa saVar = yuVar.f34664s;
                if (saVar != null) {
                    yuVar.f34665w = !saVar.Z();
                    saVar.invalidate();
                    return;
                }
                return;
            case 10:
                p00 p00Var = (p00) obj;
                if (p00Var.f41260a.G1 && (j00Var = p00Var.G) != null && (b3Var = j00Var.f24218b) != null) {
                    if (b3Var.f26885e) {
                        b3Var.k(true);
                        return;
                    } else {
                        b3Var.d();
                        return;
                    }
                }
                return;
            case 11:
                ((z10) obj).f45020s.invalidate();
                return;
            case 12:
                a60 a60Var = (a60) obj;
                if (a60Var.f36440v0 == null) {
                    a60Var.f36440v0 = (oc) a60Var.y0(a60Var.V);
                }
                int measuredHeight = a60Var.f36440v0.getMeasuredHeight();
                lVar = ((org.telegram.ui.ActionBar.o2) a60Var).actionBar;
                int measuredHeight2 = measuredHeight - lVar.getMeasuredHeight();
                float top = a60Var.f36440v0.getTop() * (-1);
                float f9 = measuredHeight2;
                float max = Math.max(Math.min(1.0f, top / f9), 0.0f);
                a60Var.f36441w0 = max;
                float min = Math.min(max * 2.0f, 1.0f);
                float min2 = Math.min(Math.max(a60Var.f36441w0 - 0.45f, 0.0f) * 2.0f, 1.0f);
                a60Var.f36440v0.f41085b.setAlpha(AndroidUtilities.lerp(1.0f, 0.0f, min));
                a60Var.f36440v0.f41088f.setAlpha(AndroidUtilities.lerp(1.0f, 0.0f, min));
                a60Var.f36440v0.f41086c.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, min2));
                if (a60Var.f36441w0 >= 1.0f) {
                    a60Var.f36440v0.setTranslationY(top - f9);
                    return;
                } else {
                    a60Var.f36440v0.setTranslationY(0.0f);
                    return;
                }
            case 13:
                m60 m60Var = (m60) obj;
                int L0 = m60Var.f40463r.L0();
                View childAt = m60Var.f40458n.getChildAt(0);
                if (childAt != null) {
                    i12 = childAt.getTop();
                } else {
                    i12 = 0;
                }
                m60Var.f40448e.b((L0 != 0 || i12 < m60Var.f40458n.getPaddingTop()) ? true : true, true);
                if (Build.VERSION.SDK_INT >= 31 && (eVar = m60Var.f40457l0) != null) {
                    eVar.f(i10, i11);
                    m60Var.e0();
                    return;
                }
                return;
            case 16:
                s70 s70Var = (s70) obj;
                s70Var.f42298n.L0();
                View childAt2 = s70Var.h.getChildAt(0);
                if (childAt2 != null) {
                    childAt2.getTop();
                }
                if (Build.VERSION.SDK_INT >= 31 && (eVar2 = s70Var.H) != null) {
                    eVar2.f(i10, i11);
                    s70Var.Y();
                    return;
                }
                return;
            case 19:
                ((ki0) obj).G.invalidate();
                return;
            case 20:
                si0 si0Var = (si0) obj;
                int L02 = si0Var.h.L0();
                if (L02 != -1) {
                    i14 = Math.abs(si0Var.h.N0() - L02) + 1;
                }
                int h = recyclerView.getAdapter().h();
                if (i14 > 0 && !si0Var.R && !si0Var.A && !si0Var.f42411x.isEmpty() && L02 + i14 >= h - 5 && si0Var.f42412y) {
                    si0Var.b0();
                    return;
                }
                return;
            case 22:
                return;
            case 23:
                to0.a((to0) obj);
                return;
            case 24:
                vu0 vu0Var = (vu0) obj;
                if (i11 != 0 && (g40Var = vu0Var.h) != null) {
                    g40Var.b(true);
                }
                org.telegram.ui.Components.fy0 fy0Var = vu0Var.M;
                if (fy0Var != null && fy0Var.f28570s) {
                    org.telegram.ui.Components.dy0 delegate = fy0Var.getDelegate();
                    if (delegate instanceof org.telegram.ui.Cells.a6) {
                        wa1 wa1Var = vu0Var.f43756c;
                        View F = wa1Var.F((org.telegram.ui.Cells.a6) delegate);
                        if (F == null) {
                            T = null;
                        } else {
                            T = wa1Var.T(F);
                        }
                        if (T != null) {
                            View view = T.f6432a;
                            if (vu0Var.M.getDirection() == 0) {
                                vu0Var.M.setTranslationY((view.getY() - AndroidUtilities.dp(166.0f)) + view.getMeasuredHeight());
                            } else {
                                vu0Var.M.setTranslationY(view.getY());
                            }
                            f2.j0 j0Var = vu0Var.d;
                            if (!j0Var.f6498c.M(view) || !j0Var.d.M(view)) {
                                vu0Var.M.f();
                                return;
                            }
                            return;
                        }
                        vu0Var.M.f();
                        return;
                    }
                    vu0Var.M.f();
                    return;
                }
                return;
            case 25:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) obj;
                premiumPreviewFragment.Z.invalidate();
                if (Build.VERSION.SDK_INT >= 31 && (eVar3 = premiumPreviewFragment.f35926q0) != null) {
                    eVar3.f(i10, i11);
                    premiumPreviewFragment.j0();
                    return;
                }
                return;
            case 26:
                bx0 bx0Var = (bx0) obj;
                if (!bx0Var.getMessagesController().blockedEndReached) {
                    int abs = Math.abs(bx0Var.f36932b.N0() - bx0Var.f36932b.L0()) + 1;
                    int h10 = recyclerView.getAdapter().h();
                    if (abs > 0 && bx0Var.f36932b.N0() >= h10 - 10) {
                        bx0Var.getMessagesController().getBlockedPeers(false);
                        return;
                    }
                    return;
                }
                return;
            case 27:
                x21 x21Var = (x21) obj;
                x21Var.f44445e.invalidate();
                y21.t(x21Var.v).invalidate();
                return;
            case 29:
                b81 b81Var = (b81) obj;
                b81Var.o0(false, true);
                if (b81Var.f36719c.G1) {
                    AndroidUtilities.hideKeyboard(b81Var.fragmentView);
                }
                if (Build.VERSION.SDK_INT >= 31 && (eVar4 = b81Var.R) != null) {
                    eVar4.f(i10, i11);
                    b81Var.i0();
                    return;
                }
                return;
        }
    }

    public m3(ob obVar) {
        this.f40359a = 4;
        this.f40360b = obVar;
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
