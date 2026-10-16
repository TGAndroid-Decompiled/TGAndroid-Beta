package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class k3 extends s4.r0 {
    public final int f37221a;
    public final Object f37222b;

    public k3(Object obj, int i10) {
        this.f37221a = i10;
        this.f37222b = obj;
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
        switch (this.f37221a) {
            case 0:
                if (i10 == 0) {
                    ((o3) this.f37222b).K.O0.V();
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
                ac acVar = (ac) this.f37222b;
                if (i10 == 1) {
                    acVar.S = true;
                    acVar.V = true;
                    return;
                } else if (i10 == 0) {
                    acVar.S = false;
                    acVar.V = false;
                    acVar.T0(true);
                    return;
                } else {
                    return;
                }
            case 5:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((fo) this.f37222b).X0);
                    return;
                }
                return;
            case 6:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((tq) this.f37222b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 7:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((yr) this.f37222b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 8:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((fu) this.f37222b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 11:
                v20 v20Var = (v20) this.f37222b;
                if (i10 == 0) {
                    kVar = ((org.telegram.ui.ActionBar.m2) v20Var).actionBar;
                    int dp = AndroidUtilities.dp(16.0f) + kVar.getBottom();
                    if (v20Var.v > 0.5f) {
                        v20Var.f40548c.v0(0, v20Var.f40551r - dp, null);
                        return;
                    }
                    if (v20Var.f40548c.getLayoutManager() != null) {
                        view = v20Var.f40548c.getLayoutManager().m(0);
                    } else {
                        view = null;
                    }
                    if (view != null && view.getTop() < 0) {
                        v20Var.f40548c.v0(0, view.getTop(), null);
                        return;
                    }
                    return;
                }
                return;
            case 12:
                x60 x60Var = (x60) this.f37222b;
                if (i10 == 0) {
                    float f7 = x60Var.A0;
                    if (f7 >= 0.5f && f7 < 1.0f) {
                        kVar2 = ((org.telegram.ui.ActionBar.m2) x60Var).actionBar;
                        int bottom = kVar2.getBottom();
                        s4.n0 layoutManager = x60Var.M.getLayoutManager();
                        if (layoutManager != null && (m10 = layoutManager.m(0)) != null) {
                            x60Var.M.v0(0, m10.getBottom() - bottom, null);
                            return;
                        }
                        return;
                    } else if (f7 < 0.5f) {
                        if (x60Var.M.getLayoutManager() != null) {
                            view2 = x60Var.M.getLayoutManager().m(0);
                        } else {
                            view2 = null;
                        }
                        if (view2 != null && view2.getTop() < 0) {
                            x60Var.M.v0(0, view2.getTop(), null);
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 13:
                j70 j70Var = (j70) this.f37222b;
                if (i10 == 1) {
                    j70Var.f36947f.f27510r.hideActionMode();
                    AndroidUtilities.hideKeyboard(j70Var.f36947f.f27510r);
                    return;
                }
                return;
            case 14:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((p70) this.f37222b).f38826c);
                    return;
                }
                return;
            case 15:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((y70) this.f37222b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 16:
                p80 p80Var = (p80) this.f37222b;
                if (i10 == 1) {
                    p80Var.d.d.hideActionMode();
                    AndroidUtilities.hideKeyboard(p80Var.d.d);
                    return;
                }
                return;
            case 17:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((LanguageSelectActivity) this.f37222b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 18:
                if (i10 == 1) {
                    ld0 ld0Var = (ld0) this.f37222b;
                    if (ld0Var.f37705r0 && ld0Var.f37707s0) {
                        AndroidUtilities.hideKeyboard(ld0Var.getParentActivity().getCurrentFocus());
                        return;
                    }
                    return;
                }
                return;
            case 20:
                return;
            case 21:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((wj0) this.f37222b).Y.getEditText());
                    return;
                }
                return;
            case 22:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((NotificationsCustomSettingsActivity) this.f37222b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 23:
                return;
            case 24:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.f37222b;
                if (i10 == 0) {
                    kVar3 = ((org.telegram.ui.ActionBar.m2) premiumPreviewFragment).actionBar;
                    int dp2 = AndroidUtilities.dp(16.0f) + kVar3.getBottom();
                    if (premiumPreviewFragment.f32156f0 > 0.5f) {
                        premiumPreviewFragment.f32147a.v0(0, premiumPreviewFragment.f32152c0 - dp2, null);
                        return;
                    }
                    if (premiumPreviewFragment.f32147a.getLayoutManager() != null) {
                        view3 = premiumPreviewFragment.f32147a.getLayoutManager().m(0);
                    } else {
                        view3 = null;
                    }
                    if (view3 != null && view3.getTop() < 0) {
                        premiumPreviewFragment.f32147a.v0(0, view3.getTop(), null);
                        return;
                    }
                    return;
                }
                return;
            case 27:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((l41) this.f37222b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 29:
                if (i10 == 0) {
                    ((ce1) this.f37222b).f34624r0 = false;
                    return;
                }
                return;
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i10, int i11) {
        e10 e10Var;
        org.telegram.ui.Cells.e3 e3Var;
        org.telegram.ui.ActionBar.k kVar;
        int i12;
        bh.f fVar;
        bh.f fVar2;
        s4.b1 T;
        org.telegram.ui.Components.v40 v40Var;
        bh.f fVar3;
        ViewGroup viewGroup;
        bh.f fVar4;
        int i13 = this.f37221a;
        boolean z10 = false;
        int i14 = 0;
        Object obj = this.f37222b;
        switch (i13) {
            case 0:
                o3 o3Var = (o3) obj;
                if (recyclerView.getChildCount() != 0) {
                    recyclerView.invalidate();
                    o3Var.K.O0.G();
                    k4 k4Var = o3Var.K;
                    x3 x3Var = k4Var.K;
                    if (x3Var != null) {
                        x3Var.f41414c.invalidate();
                    } else {
                        ArticleViewer$WindowView articleViewer$WindowView = k4Var.f37264f0;
                        if (articleViewer$WindowView != null) {
                            articleViewer$WindowView.invalidate();
                        }
                    }
                    o3Var.K.f0();
                    k4 k4Var2 = o3Var.K;
                    x3 x3Var2 = k4Var2.K;
                    if (x3Var2 == null || x3Var2.F) {
                        k4Var2.X(k4Var2.I0 - i11);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                p pVar = (p) obj;
                if (!pVar.I && !pVar.f38777r && pVar.d.N0() > pVar.E - 2) {
                    pVar.W();
                    return;
                }
                return;
            case 2:
                k4 k4Var3 = (k4) obj;
                if (k4Var3.f37267i0.f41099w.I1) {
                    AndroidUtilities.hideKeyboard(k4Var3.f37266h0.f41204b0);
                    return;
                }
                return;
            case 3:
                ((l8) obj).p0();
                return;
            case 4:
                ac acVar = (ac) obj;
                acVar.v.invalidate();
                if (i11 != 0 && acVar.S && !acVar.Q && acVar.M.getTag() == null) {
                    AnimatorSet animatorSet = acVar.R;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                    }
                    acVar.M.setTag(1);
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    acVar.R = animatorSet2;
                    animatorSet2.setDuration(150L);
                    acVar.R.playTogether(ObjectAnimator.ofFloat(acVar.M, "alpha", 1.0f));
                    acVar.R.addListener(new u0(this, 17));
                    acVar.R.start();
                }
                acVar.O0(true);
                acVar.c1();
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
                ov ovVar = (ov) obj;
                org.telegram.ui.Components.xa xaVar = ovVar.f24072s;
                if (xaVar != null) {
                    ovVar.f24073w = !xaVar.Z();
                    xaVar.invalidate();
                    return;
                }
                return;
            case 10:
                k10 k10Var = (k10) obj;
                if (k10Var.f37198a.I1 && (e10Var = k10Var.K) != null && (e3Var = e10Var.f20905b) != null) {
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
                ((v20) obj).f40552s.invalidate();
                return;
            case 12:
                x60 x60Var = (x60) obj;
                if (x60Var.f41446z0 == null) {
                    x60Var.f41446z0 = (zc) x60Var.y0(x60Var.Z);
                }
                int measuredHeight = x60Var.f41446z0.getMeasuredHeight();
                kVar = ((org.telegram.ui.ActionBar.m2) x60Var).actionBar;
                int measuredHeight2 = measuredHeight - kVar.getMeasuredHeight();
                float top = x60Var.f41446z0.getTop() * (-1);
                float f7 = measuredHeight2;
                float max = Math.max(Math.min(1.0f, top / f7), 0.0f);
                x60Var.A0 = max;
                float min = Math.min(max * 2.0f, 1.0f);
                float min2 = Math.min(Math.max(x60Var.A0 - 0.45f, 0.0f) * 2.0f, 1.0f);
                x60Var.f41446z0.f42274b.setAlpha(AndroidUtilities.lerp(1.0f, 0.0f, min));
                x60Var.f41446z0.f42276f.setAlpha(AndroidUtilities.lerp(1.0f, 0.0f, min));
                x60Var.f41446z0.f42275c.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, min2));
                if (x60Var.A0 >= 1.0f) {
                    x60Var.f41446z0.setTranslationY(top - f7);
                    return;
                } else {
                    x60Var.f41446z0.setTranslationY(0.0f);
                    return;
                }
            case 13:
                j70 j70Var = (j70) obj;
                int L0 = j70Var.f36960r.L0();
                View childAt = j70Var.f36955n.getChildAt(0);
                if (childAt != null) {
                    i12 = childAt.getTop();
                } else {
                    i12 = 0;
                }
                if (L0 != 0 || i12 < j70Var.f36955n.getPaddingTop()) {
                    z10 = true;
                }
                j70Var.e.b(z10, true);
                if (Build.VERSION.SDK_INT >= 31 && (fVar = j70Var.f36958p0) != null) {
                    fVar.f(i10, i11);
                    j70Var.e0();
                    return;
                }
                return;
            case 16:
                p80 p80Var = (p80) obj;
                p80Var.f38840n.L0();
                View childAt2 = p80Var.h.getChildAt(0);
                if (childAt2 != null) {
                    childAt2.getTop();
                }
                if (Build.VERSION.SDK_INT >= 31 && (fVar2 = p80Var.L) != null) {
                    fVar2.f(i10, i11);
                    p80Var.Y();
                    return;
                }
                return;
            case 19:
                ((gj0) obj).K.invalidate();
                return;
            case 20:
                pj0 pj0Var = (pj0) obj;
                int L02 = pj0Var.h.L0();
                if (L02 != -1) {
                    i14 = Math.abs(pj0Var.h.N0() - L02) + 1;
                }
                int h = recyclerView.getAdapter().h();
                if (i14 > 0 && !pj0Var.V && !pj0Var.E && !pj0Var.f38959x.isEmpty() && L02 + i14 >= h - 5 && pj0Var.f38960y) {
                    pj0Var.b0();
                    return;
                }
                return;
            case 22:
                return;
            case 23:
                fw0 fw0Var = (fw0) obj;
                if (i11 != 0 && (v40Var = fw0Var.h) != null) {
                    v40Var.b(true);
                }
                org.telegram.ui.Components.lz0 lz0Var = fw0Var.Q;
                if (lz0Var != null && lz0Var.f26857s) {
                    org.telegram.ui.Components.jz0 delegate = lz0Var.getDelegate();
                    if (delegate instanceof org.telegram.ui.Cells.d6) {
                        kc1 kc1Var = fw0Var.f35983c;
                        View F = kc1Var.F((org.telegram.ui.Cells.d6) delegate);
                        if (F == null) {
                            T = null;
                        } else {
                            T = kc1Var.T(F);
                        }
                        if (T != null) {
                            View view = T.f44838a;
                            if (fw0Var.Q.getDirection() == 0) {
                                fw0Var.Q.setTranslationY((view.getY() - AndroidUtilities.dp(166.0f)) + view.getMeasuredHeight());
                            } else {
                                fw0Var.Q.setTranslationY(view.getY());
                            }
                            s4.b0 b0Var = fw0Var.d;
                            if (!b0Var.f44932c.H(view) || !b0Var.d.H(view)) {
                                fw0Var.Q.f();
                                return;
                            }
                            return;
                        }
                        fw0Var.Q.f();
                        return;
                    }
                    fw0Var.Q.f();
                    return;
                }
                return;
            case 24:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) obj;
                premiumPreviewFragment.f32153d0.invalidate();
                if (Build.VERSION.SDK_INT >= 31 && (fVar3 = premiumPreviewFragment.f32173u0) != null) {
                    fVar3.f(i10, i11);
                    premiumPreviewFragment.j0();
                    return;
                }
                return;
            case 25:
                my0 my0Var = (my0) obj;
                if (!my0Var.getMessagesController().blockedEndReached) {
                    int abs = Math.abs(my0Var.f38087b.N0() - my0Var.f38087b.L0()) + 1;
                    int h10 = recyclerView.getAdapter().h();
                    if (abs > 0 && my0Var.f38087b.N0() >= h10 - 10) {
                        my0Var.getMessagesController().getBlockedPeers(false);
                        return;
                    }
                    return;
                }
                return;
            case 26:
                h41 h41Var = (h41) obj;
                h41Var.e.invalidate();
                viewGroup = ((org.telegram.ui.ActionBar.e3) h41Var.v).containerView;
                viewGroup.invalidate();
                return;
            case 28:
                o91 o91Var = (o91) obj;
                o91Var.o0(false, true);
                if (o91Var.f38579c.I1) {
                    AndroidUtilities.hideKeyboard(o91Var.fragmentView);
                }
                if (Build.VERSION.SDK_INT >= 31 && (fVar4 = o91Var.V) != null) {
                    fVar4.f(i10, i11);
                    o91Var.i0();
                    return;
                }
                return;
            case 29:
                ce1 ce1Var = (ce1) obj;
                ce1Var.f34631u0.f1();
                ce1Var.f34624r0 = true;
                return;
        }
    }

    public k3(ac acVar) {
        this.f37221a = 4;
        this.f37222b = acVar;
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
