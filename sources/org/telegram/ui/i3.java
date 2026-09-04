package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class i3 extends s4.s0 {
    public final int f37179a;
    public final Object f37180b;

    public i3(Object obj, int i10) {
        this.f37179a = i10;
        this.f37180b = obj;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        org.telegram.ui.ActionBar.k kVar;
        View view;
        View view2;
        View m10;
        org.telegram.ui.ActionBar.k kVar2;
        View view3;
        switch (this.f37179a) {
            case 0:
                if (i10 == 0) {
                    ((m3) this.f37180b).K.O0.W();
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
                ub ubVar = (ub) this.f37180b;
                if (i10 == 1) {
                    ubVar.W = true;
                    ubVar.Z = true;
                    return;
                } else if (i10 == 0) {
                    ubVar.W = false;
                    ubVar.Z = false;
                    ubVar.T0(true);
                    return;
                } else {
                    return;
                }
            case 5:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((co) this.f37180b).X0);
                    return;
                }
                return;
            case 6:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((qq) this.f37180b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 7:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((vr) this.f37180b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 8:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((bu) this.f37180b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 11:
                r20 r20Var = (r20) this.f37180b;
                if (i10 == 0) {
                    kVar = ((org.telegram.ui.ActionBar.n2) r20Var).actionBar;
                    int dp = AndroidUtilities.dp(16.0f) + kVar.getBottom();
                    if (r20Var.v > 0.5f) {
                        r20Var.f40041c.v0(0, r20Var.f40045r - dp, null);
                        return;
                    }
                    if (r20Var.f40041c.getLayoutManager() != null) {
                        view = r20Var.f40041c.getLayoutManager().m(0);
                    } else {
                        view = null;
                    }
                    if (view != null && view.getTop() < 0) {
                        r20Var.f40041c.v0(0, view.getTop(), null);
                        return;
                    }
                    return;
                }
                return;
            case 12:
                t60 t60Var = (t60) this.f37180b;
                if (i10 == 0) {
                    float f7 = t60Var.A0;
                    if (f7 >= 0.5f && f7 < 1.0f) {
                        int bottom = t60.h1(t60Var).getBottom();
                        s4.o0 layoutManager = t60Var.M.getLayoutManager();
                        if (layoutManager != null && (m10 = layoutManager.m(0)) != null) {
                            t60Var.M.v0(0, m10.getBottom() - bottom, null);
                            return;
                        }
                        return;
                    } else if (f7 < 0.5f) {
                        if (t60Var.M.getLayoutManager() != null) {
                            view2 = t60Var.M.getLayoutManager().m(0);
                        } else {
                            view2 = null;
                        }
                        if (view2 != null && view2.getTop() < 0) {
                            t60Var.M.v0(0, view2.getTop(), null);
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 13:
                f70 f70Var = (f70) this.f37180b;
                if (i10 == 1) {
                    f70Var.f36287f.f24522r.hideActionMode();
                    AndroidUtilities.hideKeyboard(f70Var.f36287f.f24522r);
                    return;
                }
                return;
            case 14:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((l70) this.f37180b).f38209c);
                    return;
                }
                return;
            case 15:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((u70) this.f37180b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 16:
                l80 l80Var = (l80) this.f37180b;
                if (i10 == 1) {
                    l80Var.d.d.hideActionMode();
                    AndroidUtilities.hideKeyboard(l80Var.d.d);
                    return;
                }
                return;
            case 17:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((LanguageSelectActivity) this.f37180b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 18:
                if (i10 == 1) {
                    id0 id0Var = (id0) this.f37180b;
                    if (id0Var.f37326r0 && id0Var.f37328s0) {
                        AndroidUtilities.hideKeyboard(id0Var.getParentActivity().getCurrentFocus());
                        return;
                    }
                    return;
                }
                return;
            case 20:
                return;
            case 21:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((tj0) this.f37180b).Y.getEditText());
                    return;
                }
                return;
            case 22:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((NotificationsCustomSettingsActivity) this.f37180b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 23:
                return;
            case 24:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.f37180b;
                if (i10 == 0) {
                    kVar2 = ((org.telegram.ui.ActionBar.n2) premiumPreviewFragment).actionBar;
                    int dp2 = AndroidUtilities.dp(16.0f) + kVar2.getBottom();
                    if (premiumPreviewFragment.f33780f0 > 0.5f) {
                        premiumPreviewFragment.f33770a.v0(0, premiumPreviewFragment.f33775c0 - dp2, null);
                        return;
                    }
                    if (premiumPreviewFragment.f33770a.getLayoutManager() != null) {
                        view3 = premiumPreviewFragment.f33770a.getLayoutManager().m(0);
                    } else {
                        view3 = null;
                    }
                    if (view3 != null && view3.getTop() < 0) {
                        premiumPreviewFragment.f33770a.v0(0, view3.getTop(), null);
                        return;
                    }
                    return;
                }
                return;
            case 27:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((h41) this.f37180b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 29:
                if (i10 == 0) {
                    ((wd1) this.f37180b).f41962r0 = false;
                    return;
                }
                return;
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i10, int i11) {
        z00 z00Var;
        org.telegram.ui.Cells.d3 d3Var;
        int i12;
        bh.f fVar;
        bh.f fVar2;
        s4.c1 T;
        org.telegram.ui.Components.i40 i40Var;
        bh.f fVar3;
        ViewGroup viewGroup;
        bh.f fVar4;
        int i13 = this.f37179a;
        boolean z10 = false;
        int i14 = 0;
        Object obj = this.f37180b;
        switch (i13) {
            case 0:
                m3 m3Var = (m3) obj;
                if (recyclerView.getChildCount() != 0) {
                    recyclerView.invalidate();
                    m3Var.K.O0.H();
                    i4 i4Var = m3Var.K;
                    v3 v3Var = i4Var.K;
                    if (v3Var != null) {
                        v3Var.f41395c.invalidate();
                    } else {
                        ArticleViewer$WindowView articleViewer$WindowView = i4Var.f37218f0;
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
                p pVar = (p) obj;
                if (!pVar.I && !pVar.f39372r && pVar.d.N0() > pVar.E - 2) {
                    pVar.W();
                    return;
                }
                return;
            case 2:
                i4 i4Var3 = (i4) obj;
                if (i4Var3.f37221i0.f42166w.K1) {
                    AndroidUtilities.hideKeyboard(i4Var3.f37220h0.f42277b0);
                    return;
                }
                return;
            case 3:
                ((h8) obj).p0();
                return;
            case 4:
                ub ubVar = (ub) obj;
                ubVar.E.invalidate();
                if (i11 != 0 && ubVar.W && !ubVar.U && ubVar.Q.getTag() == null) {
                    AnimatorSet animatorSet = ubVar.V;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                    }
                    ubVar.Q.setTag(1);
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    ubVar.V = animatorSet2;
                    animatorSet2.setDuration(150L);
                    ubVar.V.playTogether(ObjectAnimator.ofFloat(ubVar.Q, "alpha", 1.0f));
                    ubVar.V.addListener(new s0(this, 17));
                    ubVar.V.start();
                }
                if (i11 != 0) {
                    ubVar.U0(1);
                }
                ubVar.O0(true);
                ubVar.d1();
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
                kv kvVar = (kv) obj;
                org.telegram.ui.Components.va vaVar = kvVar.f24651s;
                if (vaVar != null) {
                    kvVar.f24652w = !vaVar.Z();
                    vaVar.invalidate();
                    return;
                }
                return;
            case 10:
                f10 f10Var = (f10) obj;
                if (f10Var.f36222a.K1 && (z00Var = f10Var.K) != null && (d3Var = z00Var.f21900b) != null) {
                    if (d3Var.f26850e) {
                        d3Var.k(true);
                        return;
                    } else {
                        d3Var.d();
                        return;
                    }
                }
                return;
            case 11:
                ((r20) obj).f40046s.invalidate();
                return;
            case 12:
                t60 t60Var = (t60) obj;
                if (t60Var.f40634z0 == null) {
                    t60Var.f40634z0 = (uc) t60Var.y0(t60Var.Z);
                }
                int measuredHeight = t60Var.f40634z0.getMeasuredHeight() - t60.g1(t60Var).getMeasuredHeight();
                float top = t60Var.f40634z0.getTop() * (-1);
                float f7 = measuredHeight;
                float max = Math.max(Math.min(1.0f, top / f7), 0.0f);
                t60Var.A0 = max;
                float min = Math.min(max * 2.0f, 1.0f);
                float min2 = Math.min(Math.max(t60Var.A0 - 0.45f, 0.0f) * 2.0f, 1.0f);
                t60Var.f40634z0.f41059b.setAlpha(AndroidUtilities.lerp(1.0f, 0.0f, min));
                t60Var.f40634z0.f41062f.setAlpha(AndroidUtilities.lerp(1.0f, 0.0f, min));
                t60Var.f40634z0.f41060c.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, min2));
                if (t60Var.A0 >= 1.0f) {
                    t60Var.f40634z0.setTranslationY(top - f7);
                    return;
                } else {
                    t60Var.f40634z0.setTranslationY(0.0f);
                    return;
                }
            case 13:
                f70 f70Var = (f70) obj;
                int L0 = f70Var.f36300r.L0();
                View childAt = f70Var.f36295n.getChildAt(0);
                if (childAt != null) {
                    i12 = childAt.getTop();
                } else {
                    i12 = 0;
                }
                f70Var.f36285e.b((L0 != 0 || i12 < f70Var.f36295n.getPaddingTop()) ? true : true, true);
                if (Build.VERSION.SDK_INT >= 31 && (fVar = f70Var.f36298p0) != null) {
                    fVar.f(i10, i11);
                    f70Var.e0();
                    return;
                }
                return;
            case 16:
                l80 l80Var = (l80) obj;
                l80Var.f38224n.L0();
                View childAt2 = l80Var.h.getChildAt(0);
                if (childAt2 != null) {
                    childAt2.getTop();
                }
                if (Build.VERSION.SDK_INT >= 31 && (fVar2 = l80Var.L) != null) {
                    fVar2.f(i10, i11);
                    l80Var.Y();
                    return;
                }
                return;
            case 19:
                ((cj0) obj).K.invalidate();
                return;
            case 20:
                lj0 lj0Var = (lj0) obj;
                int L02 = lj0Var.h.L0();
                if (L02 != -1) {
                    i14 = Math.abs(lj0Var.h.N0() - L02) + 1;
                }
                int h = recyclerView.getAdapter().h();
                if (i14 > 0 && !lj0Var.V && !lj0Var.E && !lj0Var.f38393x.isEmpty() && L02 + i14 >= h - 5 && lj0Var.f38394y) {
                    lj0Var.b0();
                    return;
                }
                return;
            case 22:
                return;
            case 23:
                zv0 zv0Var = (zv0) obj;
                if (i11 != 0 && (i40Var = zv0Var.h) != null) {
                    i40Var.b(true);
                }
                org.telegram.ui.Components.my0 my0Var = zv0Var.Q;
                if (my0Var != null && my0Var.f28566s) {
                    org.telegram.ui.Components.ky0 delegate = my0Var.getDelegate();
                    if (delegate instanceof org.telegram.ui.Cells.c6) {
                        ec1 ec1Var = zv0Var.f43531c;
                        View F = ec1Var.F((org.telegram.ui.Cells.c6) delegate);
                        if (F == null) {
                            T = null;
                        } else {
                            T = ec1Var.T(F);
                        }
                        if (T != null) {
                            View view = T.f45738a;
                            if (zv0Var.Q.getDirection() == 0) {
                                zv0Var.Q.setTranslationY((view.getY() - AndroidUtilities.dp(166.0f)) + view.getMeasuredHeight());
                            } else {
                                zv0Var.Q.setTranslationY(view.getY());
                            }
                            s4.c0 c0Var = zv0Var.d;
                            if (!c0Var.f45843c.D(view) || !c0Var.d.D(view)) {
                                zv0Var.Q.f();
                                return;
                            }
                            return;
                        }
                        zv0Var.Q.f();
                        return;
                    }
                    zv0Var.Q.f();
                    return;
                }
                return;
            case 24:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) obj;
                premiumPreviewFragment.f33776d0.invalidate();
                if (Build.VERSION.SDK_INT >= 31 && (fVar3 = premiumPreviewFragment.f33797u0) != null) {
                    fVar3.f(i10, i11);
                    premiumPreviewFragment.j0();
                    return;
                }
                return;
            case 25:
                hy0 hy0Var = (hy0) obj;
                if (!hy0Var.getMessagesController().blockedEndReached) {
                    int abs = Math.abs(hy0Var.f37131b.N0() - hy0Var.f37131b.L0()) + 1;
                    int h10 = recyclerView.getAdapter().h();
                    if (abs > 0 && hy0Var.f37131b.N0() >= h10 - 10) {
                        hy0Var.getMessagesController().getBlockedPeers(false);
                        return;
                    }
                    return;
                }
                return;
            case 26:
                d41 d41Var = (d41) obj;
                d41Var.f35648e.invalidate();
                viewGroup = ((org.telegram.ui.ActionBar.f3) d41Var.v).containerView;
                viewGroup.invalidate();
                return;
            case 28:
                i91 i91Var = (i91) obj;
                i91Var.o0(false, true);
                if (i91Var.f37268c.K1) {
                    AndroidUtilities.hideKeyboard(i91Var.fragmentView);
                }
                if (Build.VERSION.SDK_INT >= 31 && (fVar4 = i91Var.V) != null) {
                    fVar4.f(i10, i11);
                    i91Var.i0();
                    return;
                }
                return;
            case 29:
                wd1 wd1Var = (wd1) obj;
                wd1Var.f41969u0.e1();
                wd1Var.f41962r0 = true;
                return;
        }
    }

    public i3(ub ubVar) {
        this.f37179a = 4;
        this.f37180b = ubVar;
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
