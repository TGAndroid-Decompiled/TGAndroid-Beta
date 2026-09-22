package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class h3 extends s4.s0 {
    public final int f34038a;
    public final Object f34039b;

    public h3(Object obj, int i10) {
        this.f34038a = i10;
        this.f34039b = obj;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        org.telegram.ui.ActionBar.k kVar;
        View view;
        View view2;
        View m10;
        org.telegram.ui.ActionBar.k kVar2;
        View view3;
        switch (this.f34038a) {
            case 0:
                if (i10 == 0) {
                    ((l3) this.f34039b).K.O0.W();
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
                ub ubVar = (ub) this.f34039b;
                if (i10 == 1) {
                    ubVar.S = true;
                    ubVar.V = true;
                    return;
                } else if (i10 == 0) {
                    ubVar.S = false;
                    ubVar.V = false;
                    ubVar.T0(true);
                    return;
                } else {
                    return;
                }
            case 5:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((bo) this.f34039b).X0);
                    return;
                }
                return;
            case 6:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((pq) this.f34039b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 7:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((ur) this.f34039b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 8:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((au) this.f34039b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 11:
                r20 r20Var = (r20) this.f34039b;
                if (i10 == 0) {
                    kVar = ((org.telegram.ui.ActionBar.n2) r20Var).actionBar;
                    int dp = AndroidUtilities.dp(16.0f) + kVar.getBottom();
                    if (r20Var.v > 0.5f) {
                        r20Var.f37004c.v0(0, r20Var.f37007r - dp, null);
                        return;
                    }
                    if (r20Var.f37004c.getLayoutManager() != null) {
                        view = r20Var.f37004c.getLayoutManager().m(0);
                    } else {
                        view = null;
                    }
                    if (view != null && view.getTop() < 0) {
                        r20Var.f37004c.v0(0, view.getTop(), null);
                        return;
                    }
                    return;
                }
                return;
            case 12:
                s60 s60Var = (s60) this.f34039b;
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
                e70 e70Var = (e70) this.f34039b;
                if (i10 == 1) {
                    e70Var.f33192f.f22569r.hideActionMode();
                    AndroidUtilities.hideKeyboard(e70Var.f33192f.f22569r);
                    return;
                }
                return;
            case 14:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((l70) this.f34039b).f35336c);
                    return;
                }
                return;
            case 15:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((t70) this.f34039b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 16:
                l80 l80Var = (l80) this.f34039b;
                if (i10 == 1) {
                    l80Var.d.d.hideActionMode();
                    AndroidUtilities.hideKeyboard(l80Var.d.d);
                    return;
                }
                return;
            case 17:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((LanguageSelectActivity) this.f34039b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 18:
                if (i10 == 1) {
                    id0 id0Var = (id0) this.f34039b;
                    if (id0Var.f34628r0 && id0Var.f34630s0) {
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
                    AndroidUtilities.hideKeyboard(((rj0) this.f34039b).Y.getEditText());
                    return;
                }
                return;
            case 22:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((NotificationsCustomSettingsActivity) this.f34039b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 23:
                return;
            case 24:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.f34039b;
                if (i10 == 0) {
                    kVar2 = ((org.telegram.ui.ActionBar.n2) premiumPreviewFragment).actionBar;
                    int dp2 = AndroidUtilities.dp(16.0f) + kVar2.getBottom();
                    if (premiumPreviewFragment.f31161f0 > 0.5f) {
                        premiumPreviewFragment.f31152a.v0(0, premiumPreviewFragment.f31157c0 - dp2, null);
                        return;
                    }
                    if (premiumPreviewFragment.f31152a.getLayoutManager() != null) {
                        view3 = premiumPreviewFragment.f31152a.getLayoutManager().m(0);
                    } else {
                        view3 = null;
                    }
                    if (view3 != null && view3.getTop() < 0) {
                        premiumPreviewFragment.f31152a.v0(0, view3.getTop(), null);
                        return;
                    }
                    return;
                }
                return;
            case 27:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((f41) this.f34039b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 29:
                if (i10 == 0) {
                    ((wd1) this.f34039b).f38833r0 = false;
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
        ah.h hVar;
        ah.h hVar2;
        s4.c1 T;
        org.telegram.ui.Components.i40 i40Var;
        ah.h hVar3;
        ViewGroup viewGroup;
        ah.h hVar4;
        int i13 = this.f34038a;
        boolean z10 = false;
        int i14 = 0;
        Object obj = this.f34039b;
        switch (i13) {
            case 0:
                l3 l3Var = (l3) obj;
                if (recyclerView.getChildCount() != 0) {
                    recyclerView.invalidate();
                    l3Var.K.O0.H();
                    h4 h4Var = l3Var.K;
                    u3 u3Var = h4Var.K;
                    if (u3Var != null) {
                        u3Var.f37788c.invalidate();
                    } else {
                        ArticleViewer$WindowView articleViewer$WindowView = h4Var.f34076f0;
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
                if (!pVar.I && !pVar.f36384r && pVar.d.N0() > pVar.E - 2) {
                    pVar.W();
                    return;
                }
                return;
            case 2:
                h4 h4Var3 = (h4) obj;
                if (h4Var3.f34079i0.f39012w.K1) {
                    AndroidUtilities.hideKeyboard(h4Var3.f34078h0.f39113b0);
                    return;
                }
                return;
            case 3:
                ((h8) obj).p0();
                return;
            case 4:
                ub ubVar = (ub) obj;
                ubVar.v.invalidate();
                if (i11 != 0 && ubVar.S && !ubVar.Q && ubVar.M.getTag() == null) {
                    AnimatorSet animatorSet = ubVar.R;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                    }
                    ubVar.M.setTag(1);
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    ubVar.R = animatorSet2;
                    animatorSet2.setDuration(150L);
                    ubVar.R.playTogether(ObjectAnimator.ofFloat(ubVar.M, "alpha", 1.0f));
                    ubVar.R.addListener(new t4(this, 14));
                    ubVar.R.start();
                }
                ubVar.O0(true);
                ubVar.c1();
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
                jv jvVar = (jv) obj;
                org.telegram.ui.Components.ta taVar = jvVar.f30527s;
                if (taVar != null) {
                    jvVar.f30528w = !taVar.Z();
                    taVar.invalidate();
                    return;
                }
                return;
            case 10:
                f10 f10Var = (f10) obj;
                if (f10Var.f33447a.K1 && (z00Var = f10Var.K) != null && (d3Var = z00Var.f20058b) != null) {
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
                ((r20) obj).f37008s.invalidate();
                return;
            case 12:
                s60 s60Var = (s60) obj;
                if (s60Var.f37277z0 == null) {
                    s60Var.f37277z0 = (tc) s60Var.y0(s60Var.Z);
                }
                int measuredHeight = s60Var.f37277z0.getMeasuredHeight() - s60.g1(s60Var).getMeasuredHeight();
                float top = s60Var.f37277z0.getTop() * (-1);
                float f7 = measuredHeight;
                float max = Math.max(Math.min(1.0f, top / f7), 0.0f);
                s60Var.A0 = max;
                float min = Math.min(max * 2.0f, 1.0f);
                float min2 = Math.min(Math.max(s60Var.A0 - 0.45f, 0.0f) * 2.0f, 1.0f);
                s60Var.f37277z0.f37631b.setAlpha(AndroidUtilities.lerp(1.0f, 0.0f, min));
                s60Var.f37277z0.f37633f.setAlpha(AndroidUtilities.lerp(1.0f, 0.0f, min));
                s60Var.f37277z0.f37632c.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, min2));
                if (s60Var.A0 >= 1.0f) {
                    s60Var.f37277z0.setTranslationY(top - f7);
                    return;
                } else {
                    s60Var.f37277z0.setTranslationY(0.0f);
                    return;
                }
            case 13:
                e70 e70Var = (e70) obj;
                int L0 = e70Var.f33205r.L0();
                View childAt = e70Var.f33200n.getChildAt(0);
                if (childAt != null) {
                    i12 = childAt.getTop();
                } else {
                    i12 = 0;
                }
                e70Var.e.b((L0 != 0 || i12 < e70Var.f33200n.getPaddingTop()) ? true : true, true);
                if (Build.VERSION.SDK_INT >= 31 && (hVar = e70Var.f33203p0) != null) {
                    hVar.f(i10, i11);
                    e70Var.e0();
                    return;
                }
                return;
            case 16:
                l80 l80Var = (l80) obj;
                l80Var.f35349n.L0();
                View childAt2 = l80Var.h.getChildAt(0);
                if (childAt2 != null) {
                    childAt2.getTop();
                }
                if (Build.VERSION.SDK_INT >= 31 && (hVar2 = l80Var.L) != null) {
                    hVar2.f(i10, i11);
                    l80Var.Y();
                    return;
                }
                return;
            case 19:
                ((bj0) obj).K.invalidate();
                return;
            case 20:
                jj0 jj0Var = (jj0) obj;
                int L02 = jj0Var.h.L0();
                if (L02 != -1) {
                    i14 = Math.abs(jj0Var.h.N0() - L02) + 1;
                }
                int h = recyclerView.getAdapter().h();
                if (i14 > 0 && !jj0Var.V && !jj0Var.E && !jj0Var.f34935x.isEmpty() && L02 + i14 >= h - 5 && jj0Var.f34936y) {
                    jj0Var.b0();
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
                org.telegram.ui.Components.ny0 ny0Var = aw0Var.Q;
                if (ny0Var != null && ny0Var.f26623s) {
                    org.telegram.ui.Components.ly0 delegate = ny0Var.getDelegate();
                    if (delegate instanceof org.telegram.ui.Cells.d6) {
                        ec1 ec1Var = aw0Var.f31954c;
                        View F = ec1Var.F((org.telegram.ui.Cells.d6) delegate);
                        if (F == null) {
                            T = null;
                        } else {
                            T = ec1Var.T(F);
                        }
                        if (T != null) {
                            View view = T.f42671a;
                            if (aw0Var.Q.getDirection() == 0) {
                                aw0Var.Q.setTranslationY((view.getY() - AndroidUtilities.dp(166.0f)) + view.getMeasuredHeight());
                            } else {
                                aw0Var.Q.setTranslationY(view.getY());
                            }
                            s4.c0 c0Var = aw0Var.d;
                            if (!c0Var.f42765c.v(view) || !c0Var.d.v(view)) {
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
                premiumPreviewFragment.f31158d0.invalidate();
                if (Build.VERSION.SDK_INT >= 31 && (hVar3 = premiumPreviewFragment.f31178u0) != null) {
                    hVar3.f(i10, i11);
                    premiumPreviewFragment.j0();
                    return;
                }
                return;
            case 25:
                gy0 gy0Var = (gy0) obj;
                if (!gy0Var.getMessagesController().blockedEndReached) {
                    int abs = Math.abs(gy0Var.f33967b.N0() - gy0Var.f33967b.L0()) + 1;
                    int h10 = recyclerView.getAdapter().h();
                    if (abs > 0 && gy0Var.f33967b.N0() >= h10 - 10) {
                        gy0Var.getMessagesController().getBlockedPeers(false);
                        return;
                    }
                    return;
                }
                return;
            case 26:
                b41 b41Var = (b41) obj;
                b41Var.e.invalidate();
                viewGroup = ((org.telegram.ui.ActionBar.f3) b41Var.v).containerView;
                viewGroup.invalidate();
                return;
            case 28:
                f91 f91Var = (f91) obj;
                f91Var.o0(false, true);
                if (f91Var.f33546c.K1) {
                    AndroidUtilities.hideKeyboard(f91Var.fragmentView);
                }
                if (Build.VERSION.SDK_INT >= 31 && (hVar4 = f91Var.V) != null) {
                    hVar4.f(i10, i11);
                    f91Var.i0();
                    return;
                }
                return;
            case 29:
                wd1 wd1Var = (wd1) obj;
                wd1Var.f38840u0.f1();
                wd1Var.f38833r0 = true;
                return;
        }
    }

    public h3(ub ubVar) {
        this.f34038a = 4;
        this.f34039b = ubVar;
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
