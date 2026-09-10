package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class j3 extends s4.s0 {
    public final int f33863a;
    public final Object f33864b;

    public j3(Object obj, int i10) {
        this.f33863a = i10;
        this.f33864b = obj;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        org.telegram.ui.ActionBar.l lVar;
        View view;
        View view2;
        View m10;
        org.telegram.ui.ActionBar.l lVar2;
        View view3;
        switch (this.f33863a) {
            case 0:
                if (i10 == 0) {
                    ((n3) this.f33864b).K.O0.W();
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
                wb wbVar = (wb) this.f33864b;
                if (i10 == 1) {
                    wbVar.W = true;
                    wbVar.Z = true;
                    return;
                } else if (i10 == 0) {
                    wbVar.W = false;
                    wbVar.Z = false;
                    wbVar.T0(true);
                    return;
                } else {
                    return;
                }
            case 5:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((eo) this.f33864b).X0);
                    return;
                }
                return;
            case 6:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((rq) this.f33864b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 7:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((wr) this.f33864b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 8:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((bu) this.f33864b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 11:
                s20 s20Var = (s20) this.f33864b;
                if (i10 == 0) {
                    lVar = ((org.telegram.ui.ActionBar.p2) s20Var).actionBar;
                    int dp = AndroidUtilities.dp(16.0f) + lVar.getBottom();
                    if (s20Var.v > 0.5f) {
                        s20Var.f36527c.v0(0, s20Var.f36530r - dp, null);
                        return;
                    }
                    if (s20Var.f36527c.getLayoutManager() != null) {
                        view = s20Var.f36527c.getLayoutManager().m(0);
                    } else {
                        view = null;
                    }
                    if (view != null && view.getTop() < 0) {
                        s20Var.f36527c.v0(0, view.getTop(), null);
                        return;
                    }
                    return;
                }
                return;
            case 12:
                s60 s60Var = (s60) this.f33864b;
                if (i10 == 0) {
                    float f7 = s60Var.A0;
                    if (f7 >= 0.5f && f7 < 1.0f) {
                        int bottom = s60.h1(s60Var).getBottom();
                        s4.o0 layoutManager = s60Var.M.getLayoutManager();
                        if (layoutManager != null && (m10 = layoutManager.m(0)) != null) {
                            s60Var.M.v0(0, m10.getBottom() - bottom, null);
                            return;
                        }
                        return;
                    } else if (f7 < 0.5f) {
                        if (s60Var.M.getLayoutManager() != null) {
                            view2 = s60Var.M.getLayoutManager().m(0);
                        } else {
                            view2 = null;
                        }
                        if (view2 != null && view2.getTop() < 0) {
                            s60Var.M.v0(0, view2.getTop(), null);
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 13:
                e70 e70Var = (e70) this.f33864b;
                if (i10 == 1) {
                    e70Var.f32085f.f24572r.hideActionMode();
                    AndroidUtilities.hideKeyboard(e70Var.f32085f.f24572r);
                    return;
                }
                return;
            case 14:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((k70) this.f33864b).f34249c);
                    return;
                }
                return;
            case 15:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((s70) this.f33864b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 16:
                k80 k80Var = (k80) this.f33864b;
                if (i10 == 1) {
                    k80Var.d.d.hideActionMode();
                    AndroidUtilities.hideKeyboard(k80Var.d.d);
                    return;
                }
                return;
            case 17:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((LanguageSelectActivity) this.f33864b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 18:
                if (i10 == 1) {
                    id0 id0Var = (id0) this.f33864b;
                    if (id0Var.f33636r0 && id0Var.f33638s0) {
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
                    AndroidUtilities.hideKeyboard(((sj0) this.f33864b).Y.getEditText());
                    return;
                }
                return;
            case 22:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((NotificationsCustomSettingsActivity) this.f33864b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 23:
                return;
            case 24:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.f33864b;
                if (i10 == 0) {
                    lVar2 = ((org.telegram.ui.ActionBar.p2) premiumPreviewFragment).actionBar;
                    int dp2 = AndroidUtilities.dp(16.0f) + lVar2.getBottom();
                    if (premiumPreviewFragment.f30276f0 > 0.5f) {
                        premiumPreviewFragment.f30267a.v0(0, premiumPreviewFragment.f30272c0 - dp2, null);
                        return;
                    }
                    if (premiumPreviewFragment.f30267a.getLayoutManager() != null) {
                        view3 = premiumPreviewFragment.f30267a.getLayoutManager().m(0);
                    } else {
                        view3 = null;
                    }
                    if (view3 != null && view3.getTop() < 0) {
                        premiumPreviewFragment.f30267a.v0(0, view3.getTop(), null);
                        return;
                    }
                    return;
                }
                return;
            case 27:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((k41) this.f33864b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 29:
                if (i10 == 0) {
                    ((ae1) this.f33864b).f30961r0 = false;
                    return;
                }
                return;
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i10, int i11) {
        b10 b10Var;
        org.telegram.ui.Cells.d3 d3Var;
        int i12;
        zg.e eVar;
        zg.e eVar2;
        s4.c1 T;
        org.telegram.ui.Components.s40 s40Var;
        zg.e eVar3;
        ViewGroup viewGroup;
        zg.e eVar4;
        int i13 = this.f33863a;
        boolean z10 = false;
        int i14 = 0;
        Object obj = this.f33864b;
        switch (i13) {
            case 0:
                n3 n3Var = (n3) obj;
                if (recyclerView.getChildCount() != 0) {
                    recyclerView.invalidate();
                    n3Var.K.O0.H();
                    j4 j4Var = n3Var.K;
                    w3 w3Var = j4Var.K;
                    if (w3Var != null) {
                        w3Var.f37687c.invalidate();
                    } else {
                        ArticleViewer$WindowView articleViewer$WindowView = j4Var.f33906f0;
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
                q qVar = (q) obj;
                if (!qVar.I && !qVar.f35942r && qVar.d.N0() > qVar.E - 2) {
                    qVar.W();
                    return;
                }
                return;
            case 2:
                j4 j4Var3 = (j4) obj;
                if (j4Var3.f33909i0.f38004w.K1) {
                    AndroidUtilities.hideKeyboard(j4Var3.f33908h0.f38103b0);
                    return;
                }
                return;
            case 3:
                ((h8) obj).p0();
                return;
            case 4:
                wb wbVar = (wb) obj;
                wbVar.E.invalidate();
                if (i11 != 0 && wbVar.W && !wbVar.U && wbVar.Q.getTag() == null) {
                    AnimatorSet animatorSet = wbVar.V;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                    }
                    wbVar.Q.setTag(1);
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    wbVar.V = animatorSet2;
                    animatorSet2.setDuration(150L);
                    wbVar.V.playTogether(ObjectAnimator.ofFloat(wbVar.Q, "alpha", 1.0f));
                    wbVar.V.addListener(new org.telegram.ui.Cells.v5(this, 4));
                    wbVar.V.start();
                }
                if (i11 != 0) {
                    wbVar.U0(1);
                }
                wbVar.O0(true);
                wbVar.d1();
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
                lv lvVar = (lv) obj;
                org.telegram.ui.Components.ua uaVar = lvVar.f21454s;
                if (uaVar != null) {
                    lvVar.f21455w = !uaVar.Z();
                    uaVar.invalidate();
                    return;
                }
                return;
            case 10:
                h10 h10Var = (h10) obj;
                if (h10Var.f33232a.K1 && (b10Var = h10Var.K) != null && (d3Var = b10Var.f19109b) != null) {
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
                ((s20) obj).f36531s.invalidate();
                return;
            case 12:
                s60 s60Var = (s60) obj;
                if (s60Var.f36561z0 == null) {
                    s60Var.f36561z0 = (vc) s60Var.y0(s60Var.Z);
                }
                int measuredHeight = s60Var.f36561z0.getMeasuredHeight() - s60.g1(s60Var).getMeasuredHeight();
                float top = s60Var.f36561z0.getTop() * (-1);
                float f7 = measuredHeight;
                float max = Math.max(Math.min(1.0f, top / f7), 0.0f);
                s60Var.A0 = max;
                float min = Math.min(max * 2.0f, 1.0f);
                float min2 = Math.min(Math.max(s60Var.A0 - 0.45f, 0.0f) * 2.0f, 1.0f);
                s60Var.f36561z0.f37532b.setAlpha(AndroidUtilities.lerp(1.0f, 0.0f, min));
                s60Var.f36561z0.f37534f.setAlpha(AndroidUtilities.lerp(1.0f, 0.0f, min));
                s60Var.f36561z0.f37533c.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, min2));
                if (s60Var.A0 >= 1.0f) {
                    s60Var.f36561z0.setTranslationY(top - f7);
                    return;
                } else {
                    s60Var.f36561z0.setTranslationY(0.0f);
                    return;
                }
            case 13:
                e70 e70Var = (e70) obj;
                int L0 = e70Var.f32098r.L0();
                View childAt = e70Var.f32093n.getChildAt(0);
                if (childAt != null) {
                    i12 = childAt.getTop();
                } else {
                    i12 = 0;
                }
                e70Var.e.b((L0 != 0 || i12 < e70Var.f32093n.getPaddingTop()) ? true : true, true);
                if (Build.VERSION.SDK_INT >= 31 && (eVar = e70Var.f32096p0) != null) {
                    eVar.f(i10, i11);
                    e70Var.e0();
                    return;
                }
                return;
            case 16:
                k80 k80Var = (k80) obj;
                k80Var.f34262n.L0();
                View childAt2 = k80Var.h.getChildAt(0);
                if (childAt2 != null) {
                    childAt2.getTop();
                }
                if (Build.VERSION.SDK_INT >= 31 && (eVar2 = k80Var.L) != null) {
                    eVar2.f(i10, i11);
                    k80Var.Y();
                    return;
                }
                return;
            case 19:
                ((cj0) obj).K.invalidate();
                return;
            case 20:
                kj0 kj0Var = (kj0) obj;
                int L02 = kj0Var.h.L0();
                if (L02 != -1) {
                    i14 = Math.abs(kj0Var.h.N0() - L02) + 1;
                }
                int h = recyclerView.getAdapter().h();
                if (i14 > 0 && !kj0Var.V && !kj0Var.E && !kj0Var.f34397x.isEmpty() && L02 + i14 >= h - 5 && kj0Var.f34398y) {
                    kj0Var.b0();
                    return;
                }
                return;
            case 22:
                return;
            case 23:
                bw0 bw0Var = (bw0) obj;
                if (i11 != 0 && (s40Var = bw0Var.h) != null) {
                    s40Var.b(true);
                }
                org.telegram.ui.Components.zy0 zy0Var = bw0Var.Q;
                if (zy0Var != null && zy0Var.f29838s) {
                    org.telegram.ui.Components.xy0 delegate = zy0Var.getDelegate();
                    if (delegate instanceof org.telegram.ui.Cells.e6) {
                        ic1 ic1Var = bw0Var.f31428c;
                        View F = ic1Var.F((org.telegram.ui.Cells.e6) delegate);
                        if (F == null) {
                            T = null;
                        } else {
                            T = ic1Var.T(F);
                        }
                        if (T != null) {
                            View view = T.f41610a;
                            if (bw0Var.Q.getDirection() == 0) {
                                bw0Var.Q.setTranslationY((view.getY() - AndroidUtilities.dp(166.0f)) + view.getMeasuredHeight());
                            } else {
                                bw0Var.Q.setTranslationY(view.getY());
                            }
                            s4.c0 c0Var = bw0Var.d;
                            if (!c0Var.f41704c.o(view) || !c0Var.d.o(view)) {
                                bw0Var.Q.f();
                                return;
                            }
                            return;
                        }
                        bw0Var.Q.f();
                        return;
                    }
                    bw0Var.Q.f();
                    return;
                }
                return;
            case 24:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) obj;
                premiumPreviewFragment.f30273d0.invalidate();
                if (Build.VERSION.SDK_INT >= 31 && (eVar3 = premiumPreviewFragment.f30293u0) != null) {
                    eVar3.f(i10, i11);
                    premiumPreviewFragment.j0();
                    return;
                }
                return;
            case 25:
                ky0 ky0Var = (ky0) obj;
                if (!ky0Var.getMessagesController().blockedEndReached) {
                    int abs = Math.abs(ky0Var.f34474b.N0() - ky0Var.f34474b.L0()) + 1;
                    int h10 = recyclerView.getAdapter().h();
                    if (abs > 0 && ky0Var.f34474b.N0() >= h10 - 10) {
                        ky0Var.getMessagesController().getBlockedPeers(false);
                        return;
                    }
                    return;
                }
                return;
            case 26:
                g41 g41Var = (g41) obj;
                g41Var.e.invalidate();
                viewGroup = ((org.telegram.ui.ActionBar.h3) g41Var.v).containerView;
                viewGroup.invalidate();
                return;
            case 28:
                k91 k91Var = (k91) obj;
                k91Var.o0(false, true);
                if (k91Var.f34298c.K1) {
                    AndroidUtilities.hideKeyboard(k91Var.fragmentView);
                }
                if (Build.VERSION.SDK_INT >= 31 && (eVar4 = k91Var.V) != null) {
                    eVar4.f(i10, i11);
                    k91Var.i0();
                    return;
                }
                return;
            case 29:
                ae1 ae1Var = (ae1) obj;
                ae1Var.f30968u0.e1();
                ae1Var.f30961r0 = true;
                return;
        }
    }

    public j3(wb wbVar) {
        this.f33863a = 4;
        this.f33864b = wbVar;
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
