package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class h3 extends s4.s0 {
    public final int f34026a;
    public final Object f34027b;

    public h3(Object obj, int i10) {
        this.f34026a = i10;
        this.f34027b = obj;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        org.telegram.ui.ActionBar.k kVar;
        View view;
        View view2;
        View m10;
        org.telegram.ui.ActionBar.k kVar2;
        View view3;
        switch (this.f34026a) {
            case 0:
                if (i10 == 0) {
                    ((l3) this.f34027b).K.O0.W();
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
                vb vbVar = (vb) this.f34027b;
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
                    AndroidUtilities.hideKeyboard(((zn) this.f34027b).X0);
                    return;
                }
                return;
            case 6:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((nq) this.f34027b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 7:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((sr) this.f34027b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 8:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((au) this.f34027b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 11:
                r20 r20Var = (r20) this.f34027b;
                if (i10 == 0) {
                    kVar = ((org.telegram.ui.ActionBar.n2) r20Var).actionBar;
                    int dp = AndroidUtilities.dp(16.0f) + kVar.getBottom();
                    if (r20Var.v > 0.5f) {
                        r20Var.f36938c.w0(0, r20Var.f36941r - dp, null);
                        return;
                    }
                    if (r20Var.f36938c.getLayoutManager() != null) {
                        view = r20Var.f36938c.getLayoutManager().m(0);
                    } else {
                        view = null;
                    }
                    if (view != null && view.getTop() < 0) {
                        r20Var.f36938c.w0(0, view.getTop(), null);
                        return;
                    }
                    return;
                }
                return;
            case 12:
                s60 s60Var = (s60) this.f34027b;
                if (i10 == 0) {
                    float f7 = s60Var.A0;
                    if (f7 >= 0.5f && f7 < 1.0f) {
                        int bottom = s60.h1(s60Var).getBottom();
                        s4.o0 layoutManager = s60Var.M.getLayoutManager();
                        if (layoutManager != null && (m10 = layoutManager.m(0)) != null) {
                            s60Var.M.w0(0, m10.getBottom() - bottom, null);
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
                            s60Var.M.w0(0, view2.getTop(), null);
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 13:
                e70 e70Var = (e70) this.f34027b;
                if (i10 == 1) {
                    e70Var.f33198f.f22787r.hideActionMode();
                    AndroidUtilities.hideKeyboard(e70Var.f33198f.f22787r);
                    return;
                }
                return;
            case 14:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((l70) this.f34027b).f35269c);
                    return;
                }
                return;
            case 15:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((t70) this.f34027b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 16:
                l80 l80Var = (l80) this.f34027b;
                if (i10 == 1) {
                    l80Var.d.d.hideActionMode();
                    AndroidUtilities.hideKeyboard(l80Var.d.d);
                    return;
                }
                return;
            case 17:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((LanguageSelectActivity) this.f34027b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 18:
                if (i10 == 1) {
                    jd0 jd0Var = (jd0) this.f34027b;
                    if (jd0Var.f34833r0 && jd0Var.f34835s0) {
                        AndroidUtilities.hideKeyboard(jd0Var.getParentActivity().getCurrentFocus());
                        return;
                    }
                    return;
                }
                return;
            case 20:
                return;
            case 21:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((sj0) this.f34027b).Y.getEditText());
                    return;
                }
                return;
            case 22:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((NotificationsCustomSettingsActivity) this.f34027b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 23:
                return;
            case 24:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.f34027b;
                if (i10 == 0) {
                    kVar2 = ((org.telegram.ui.ActionBar.n2) premiumPreviewFragment).actionBar;
                    int dp2 = AndroidUtilities.dp(16.0f) + kVar2.getBottom();
                    if (premiumPreviewFragment.f31408f0 > 0.5f) {
                        premiumPreviewFragment.f31399a.w0(0, premiumPreviewFragment.f31404c0 - dp2, null);
                        return;
                    }
                    if (premiumPreviewFragment.f31399a.getLayoutManager() != null) {
                        view3 = premiumPreviewFragment.f31399a.getLayoutManager().m(0);
                    } else {
                        view3 = null;
                    }
                    if (view3 != null && view3.getTop() < 0) {
                        premiumPreviewFragment.f31399a.w0(0, view3.getTop(), null);
                        return;
                    }
                    return;
                }
                return;
            case 27:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((e41) this.f34027b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 29:
                if (i10 == 0) {
                    ((vd1) this.f34027b).f38514r0 = false;
                    return;
                }
                return;
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i10, int i11) {
        z00 z00Var;
        org.telegram.ui.Cells.e3 e3Var;
        int i12;
        ah.i iVar;
        ah.i iVar2;
        s4.c1 U;
        org.telegram.ui.Components.i40 i40Var;
        ah.i iVar3;
        ViewGroup viewGroup;
        ah.i iVar4;
        int i13 = this.f34026a;
        boolean z10 = false;
        int i14 = 0;
        boolean z11 = false;
        z10 = false;
        Object obj = this.f34027b;
        switch (i13) {
            case 0:
                l3 l3Var = (l3) obj;
                if (recyclerView.getChildCount() != 0) {
                    recyclerView.invalidate();
                    l3Var.K.O0.H();
                    h4 h4Var = l3Var.K;
                    u3 u3Var = h4Var.K;
                    if (u3Var != null) {
                        u3Var.f37861c.invalidate();
                    } else {
                        ArticleViewer$WindowView articleViewer$WindowView = h4Var.f34060f0;
                        if (articleViewer$WindowView != null) {
                            articleViewer$WindowView.invalidate();
                        }
                    }
                    l3Var.K.f0();
                    h4 h4Var2 = l3Var.K;
                    u3 u3Var2 = h4Var2.K;
                    if (u3Var2 == null || u3Var2.F) {
                        h4Var2.X(h4Var2.I0 - i11);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                p pVar = (p) obj;
                if (!pVar.I && !pVar.f36285r && pVar.d.N0() > pVar.E - 2) {
                    pVar.W();
                    return;
                }
                return;
            case 2:
                h4 h4Var3 = (h4) obj;
                if (h4Var3.f34063i0.f38963w.K1) {
                    AndroidUtilities.hideKeyboard(h4Var3.f34062h0.f39077b0);
                    return;
                }
                return;
            case 3:
                ((i8) obj).p0();
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
                    vbVar.R.addListener(new t4(this, 14));
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
                kv kvVar = (kv) obj;
                org.telegram.ui.Components.va vaVar = kvVar.f22945s;
                if (vaVar != null) {
                    org.telegram.ui.Components.uc0 uc0Var = vaVar.f28981y0;
                    if (uc0Var != null && uc0Var.getTop() == vaVar.A0) {
                        z10 = true;
                    }
                    kvVar.f22946w = !z10;
                    vaVar.invalidate();
                    return;
                }
                return;
            case 10:
                f10 f10Var = (f10) obj;
                if (f10Var.f33390a.K1 && (z00Var = f10Var.K) != null && (e3Var = z00Var.f20292b) != null) {
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
                ((r20) obj).f36942s.invalidate();
                return;
            case 12:
                s60 s60Var = (s60) obj;
                if (s60Var.f37204z0 == null) {
                    s60Var.f37204z0 = (uc) s60Var.y0(s60Var.Z);
                }
                int measuredHeight = s60Var.f37204z0.getMeasuredHeight() - s60.g1(s60Var).getMeasuredHeight();
                float top = s60Var.f37204z0.getTop() * (-1);
                float f7 = measuredHeight;
                float max = Math.max(Math.min(1.0f, top / f7), 0.0f);
                s60Var.A0 = max;
                float min = Math.min(max * 2.0f, 1.0f);
                float min2 = Math.min(Math.max(s60Var.A0 - 0.45f, 0.0f) * 2.0f, 1.0f);
                s60Var.f37204z0.f37961b.setAlpha(AndroidUtilities.lerp(1.0f, 0.0f, min));
                s60Var.f37204z0.f37963f.setAlpha(AndroidUtilities.lerp(1.0f, 0.0f, min));
                s60Var.f37204z0.f37962c.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, min2));
                if (s60Var.A0 >= 1.0f) {
                    s60Var.f37204z0.setTranslationY(top - f7);
                    return;
                } else {
                    s60Var.f37204z0.setTranslationY(0.0f);
                    return;
                }
            case 13:
                e70 e70Var = (e70) obj;
                int L0 = e70Var.f33211r.L0();
                View childAt = e70Var.f33206n.getChildAt(0);
                if (childAt != null) {
                    i12 = childAt.getTop();
                } else {
                    i12 = 0;
                }
                e70Var.e.b((L0 != 0 || i12 < e70Var.f33206n.getPaddingTop()) ? true : true, true);
                if (Build.VERSION.SDK_INT >= 31 && (iVar = e70Var.f33209p0) != null) {
                    iVar.f(i10, i11);
                    e70Var.e0();
                    return;
                }
                return;
            case 16:
                l80 l80Var = (l80) obj;
                l80Var.f35282n.L0();
                View childAt2 = l80Var.h.getChildAt(0);
                if (childAt2 != null) {
                    childAt2.getTop();
                }
                if (Build.VERSION.SDK_INT >= 31 && (iVar2 = l80Var.L) != null) {
                    iVar2.f(i10, i11);
                    l80Var.Y();
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
                if (i14 > 0 && !kj0Var.V && !kj0Var.E && !kj0Var.f35132x.isEmpty() && L02 + i14 >= h - 5 && kj0Var.f35133y) {
                    kj0Var.b0();
                    return;
                }
                return;
            case 22:
                return;
            case 23:
                aw0 aw0Var = (aw0) obj;
                if (i11 != 0 && (i40Var = aw0Var.h) != null) {
                    i40Var.b(true);
                }
                org.telegram.ui.Components.zy0 zy0Var = aw0Var.Q;
                if (zy0Var != null && zy0Var.f30915s) {
                    org.telegram.ui.Components.xy0 delegate = zy0Var.getDelegate();
                    if (delegate instanceof org.telegram.ui.Cells.d6) {
                        dc1 dc1Var = aw0Var.f32165c;
                        View G = dc1Var.G((org.telegram.ui.Cells.d6) delegate);
                        if (G == null) {
                            U = null;
                        } else {
                            U = dc1Var.U(G);
                        }
                        if (U != null) {
                            View view = U.f42929a;
                            if (aw0Var.Q.getDirection() == 0) {
                                aw0Var.Q.setTranslationY((view.getY() - AndroidUtilities.dp(166.0f)) + view.getMeasuredHeight());
                            } else {
                                aw0Var.Q.setTranslationY(view.getY());
                            }
                            s4.c0 c0Var = aw0Var.d;
                            if (!c0Var.f43023c.H(view) || !c0Var.d.H(view)) {
                                aw0Var.Q.f();
                                return;
                            }
                            return;
                        }
                        aw0Var.Q.f();
                        return;
                    }
                    aw0Var.Q.f();
                    return;
                }
                return;
            case 24:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) obj;
                premiumPreviewFragment.f31405d0.invalidate();
                if (Build.VERSION.SDK_INT >= 31 && (iVar3 = premiumPreviewFragment.f31425u0) != null) {
                    iVar3.f(i10, i11);
                    premiumPreviewFragment.j0();
                    return;
                }
                return;
            case 25:
                hy0 hy0Var = (hy0) obj;
                if (!hy0Var.getMessagesController().blockedEndReached) {
                    int abs = Math.abs(hy0Var.f34264b.N0() - hy0Var.f34264b.L0()) + 1;
                    int h10 = recyclerView.getAdapter().h();
                    if (abs > 0 && hy0Var.f34264b.N0() >= h10 - 10) {
                        hy0Var.getMessagesController().getBlockedPeers(false);
                        return;
                    }
                    return;
                }
                return;
            case 26:
                a41 a41Var = (a41) obj;
                a41Var.e.invalidate();
                viewGroup = ((org.telegram.ui.ActionBar.f3) a41Var.v).containerView;
                viewGroup.invalidate();
                return;
            case 28:
                f91 f91Var = (f91) obj;
                f91Var.o0(false, true);
                if (f91Var.f33483c.K1) {
                    AndroidUtilities.hideKeyboard(f91Var.fragmentView);
                }
                if (Build.VERSION.SDK_INT >= 31 && (iVar4 = f91Var.V) != null) {
                    iVar4.f(i10, i11);
                    f91Var.i0();
                    return;
                }
                return;
            case 29:
                vd1 vd1Var = (vd1) obj;
                vd1Var.f38521u0.g1();
                vd1Var.f38514r0 = true;
                return;
        }
    }

    public h3(vb vbVar) {
        this.f34026a = 4;
        this.f34027b = vbVar;
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
