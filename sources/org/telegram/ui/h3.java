package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class h3 extends s4.t0 {
    public final int f38235a;
    public final Object f38236b;

    public h3(Object obj, int i10) {
        this.f38235a = i10;
        this.f38236b = obj;
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
        switch (this.f38235a) {
            case 0:
                if (i10 == 0) {
                    ((l3) this.f38236b).K.O0.V();
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
                ub ubVar = (ub) this.f38236b;
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
                    AndroidUtilities.hideKeyboard(((zn) this.f38236b).X0);
                    return;
                }
                return;
            case 6:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((nq) this.f38236b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 7:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((sr) this.f38236b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 8:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((yt) this.f38236b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 11:
                o20 o20Var = (o20) this.f38236b;
                if (i10 == 0) {
                    kVar = ((org.telegram.ui.ActionBar.m2) o20Var).actionBar;
                    int dp = AndroidUtilities.dp(16.0f) + kVar.getBottom();
                    if (o20Var.v > 0.5f) {
                        o20Var.f40392c.v0(0, o20Var.f40396r - dp, null);
                        return;
                    }
                    if (o20Var.f40392c.getLayoutManager() != null) {
                        view = o20Var.f40392c.getLayoutManager().m(0);
                    } else {
                        view = null;
                    }
                    if (view != null && view.getTop() < 0) {
                        o20Var.f40392c.v0(0, view.getTop(), null);
                        return;
                    }
                    return;
                }
                return;
            case 12:
                q60 q60Var = (q60) this.f38236b;
                if (i10 == 0) {
                    float f7 = q60Var.A0;
                    if (f7 >= 0.5f && f7 < 1.0f) {
                        kVar2 = ((org.telegram.ui.ActionBar.m2) q60Var).actionBar;
                        int bottom = kVar2.getBottom();
                        s4.p0 layoutManager = q60Var.M.getLayoutManager();
                        if (layoutManager != null && (m10 = layoutManager.m(0)) != null) {
                            q60Var.M.v0(0, m10.getBottom() - bottom, null);
                            return;
                        }
                        return;
                    } else if (f7 < 0.5f) {
                        if (q60Var.M.getLayoutManager() != null) {
                            view2 = q60Var.M.getLayoutManager().m(0);
                        } else {
                            view2 = null;
                        }
                        if (view2 != null && view2.getTop() < 0) {
                            q60Var.M.v0(0, view2.getTop(), null);
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 13:
                c70 c70Var = (c70) this.f38236b;
                if (i10 == 1) {
                    c70Var.f36593f.f30964r.hideActionMode();
                    AndroidUtilities.hideKeyboard(c70Var.f36593f.f30964r);
                    return;
                }
                return;
            case 14:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((j70) this.f38236b).f38864c);
                    return;
                }
                return;
            case 15:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((s70) this.f38236b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 16:
                k80 k80Var = (k80) this.f38236b;
                if (i10 == 1) {
                    k80Var.d.d.hideActionMode();
                    AndroidUtilities.hideKeyboard(k80Var.d.d);
                    return;
                }
                return;
            case 17:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((LanguageSelectActivity) this.f38236b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 18:
                if (i10 == 1) {
                    gd0 gd0Var = (gd0) this.f38236b;
                    if (gd0Var.f38036r0 && gd0Var.f38038s0) {
                        AndroidUtilities.hideKeyboard(gd0Var.getParentActivity().getCurrentFocus());
                        return;
                    }
                    return;
                }
                return;
            case 20:
                return;
            case 21:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((rj0) this.f38236b).Y.getEditText());
                    return;
                }
                return;
            case 22:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((NotificationsCustomSettingsActivity) this.f38236b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 23:
                return;
            case 24:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.f38236b;
                if (i10 == 0) {
                    kVar3 = ((org.telegram.ui.ActionBar.m2) premiumPreviewFragment).actionBar;
                    int dp2 = AndroidUtilities.dp(16.0f) + kVar3.getBottom();
                    if (premiumPreviewFragment.f34163f0 > 0.5f) {
                        premiumPreviewFragment.f34153a.v0(0, premiumPreviewFragment.f34158c0 - dp2, null);
                        return;
                    }
                    if (premiumPreviewFragment.f34153a.getLayoutManager() != null) {
                        view3 = premiumPreviewFragment.f34153a.getLayoutManager().m(0);
                    } else {
                        view3 = null;
                    }
                    if (view3 != null && view3.getTop() < 0) {
                        premiumPreviewFragment.f34153a.v0(0, view3.getTop(), null);
                        return;
                    }
                    return;
                }
                return;
            case 27:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((e41) this.f38236b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 29:
                if (i10 == 0) {
                    ((wd1) this.f38236b).f43373r0 = false;
                    return;
                }
                return;
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i10, int i11) {
        y00 y00Var;
        org.telegram.ui.Cells.e3 e3Var;
        org.telegram.ui.ActionBar.k kVar;
        int i12;
        ah.h hVar;
        ah.h hVar2;
        s4.d1 T;
        org.telegram.ui.Components.a50 a50Var;
        ah.h hVar3;
        ViewGroup viewGroup;
        ah.h hVar4;
        int i13 = this.f38235a;
        boolean z10 = false;
        int i14 = 0;
        Object obj = this.f38236b;
        switch (i13) {
            case 0:
                l3 l3Var = (l3) obj;
                if (recyclerView.getChildCount() != 0) {
                    recyclerView.invalidate();
                    l3Var.K.O0.G();
                    h4 h4Var = l3Var.K;
                    u3 u3Var = h4Var.K;
                    if (u3Var != null) {
                        u3Var.f42336c.invalidate();
                    } else {
                        ArticleViewer$WindowView articleViewer$WindowView = h4Var.f38271f0;
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
                if (!pVar.I && !pVar.f40674r && pVar.d.N0() > pVar.E - 2) {
                    pVar.W();
                    return;
                }
                return;
            case 2:
                h4 h4Var3 = (h4) obj;
                if (h4Var3.f38274i0.f43562w.I1) {
                    AndroidUtilities.hideKeyboard(h4Var3.f38273h0.f43667b0);
                    return;
                }
                return;
            case 3:
                ((f8) obj).p0();
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
                    ubVar.R.addListener(new s4(this, 14));
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
                hv hvVar = (hv) obj;
                org.telegram.ui.Components.xa xaVar = hvVar.f25525s;
                if (xaVar != null) {
                    hvVar.f25526w = !xaVar.Z();
                    xaVar.invalidate();
                    return;
                }
                return;
            case 10:
                e10 e10Var = (e10) obj;
                if (e10Var.f37169a.I1 && (y00Var = e10Var.K) != null && (e3Var = y00Var.f22106b) != null) {
                    if (e3Var.f24592e) {
                        e3Var.k(true);
                        return;
                    } else {
                        e3Var.d();
                        return;
                    }
                }
                return;
            case 11:
                ((o20) obj).f40397s.invalidate();
                return;
            case 12:
                q60 q60Var = (q60) obj;
                if (q60Var.f41049z0 == null) {
                    q60Var.f41049z0 = (tc) q60Var.y0(q60Var.Z);
                }
                int measuredHeight = q60Var.f41049z0.getMeasuredHeight();
                kVar = ((org.telegram.ui.ActionBar.m2) q60Var).actionBar;
                int measuredHeight2 = measuredHeight - kVar.getMeasuredHeight();
                float top = q60Var.f41049z0.getTop() * (-1);
                float f7 = measuredHeight2;
                float max = Math.max(Math.min(1.0f, top / f7), 0.0f);
                q60Var.A0 = max;
                float min = Math.min(max * 2.0f, 1.0f);
                float min2 = Math.min(Math.max(q60Var.A0 - 0.45f, 0.0f) * 2.0f, 1.0f);
                q60Var.f41049z0.f42152b.setAlpha(AndroidUtilities.lerp(1.0f, 0.0f, min));
                q60Var.f41049z0.f42155f.setAlpha(AndroidUtilities.lerp(1.0f, 0.0f, min));
                q60Var.f41049z0.f42153c.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, min2));
                if (q60Var.A0 >= 1.0f) {
                    q60Var.f41049z0.setTranslationY(top - f7);
                    return;
                } else {
                    q60Var.f41049z0.setTranslationY(0.0f);
                    return;
                }
            case 13:
                c70 c70Var = (c70) obj;
                int L0 = c70Var.f36606r.L0();
                View childAt = c70Var.f36601n.getChildAt(0);
                if (childAt != null) {
                    i12 = childAt.getTop();
                } else {
                    i12 = 0;
                }
                if (L0 != 0 || i12 < c70Var.f36601n.getPaddingTop()) {
                    z10 = true;
                }
                c70Var.f36591e.b(z10, true);
                if (Build.VERSION.SDK_INT >= 31 && (hVar = c70Var.f36604p0) != null) {
                    hVar.f(i10, i11);
                    c70Var.e0();
                    return;
                }
                return;
            case 16:
                k80 k80Var = (k80) obj;
                k80Var.f39227n.L0();
                View childAt2 = k80Var.h.getChildAt(0);
                if (childAt2 != null) {
                    childAt2.getTop();
                }
                if (Build.VERSION.SDK_INT >= 31 && (hVar2 = k80Var.L) != null) {
                    hVar2.f(i10, i11);
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
                if (i14 > 0 && !kj0Var.V && !kj0Var.E && !kj0Var.f39363x.isEmpty() && L02 + i14 >= h - 5 && kj0Var.f39364y) {
                    kj0Var.b0();
                    return;
                }
                return;
            case 22:
                return;
            case 23:
                zv0 zv0Var = (zv0) obj;
                if (i11 != 0 && (a50Var = zv0Var.h) != null) {
                    a50Var.b(true);
                }
                org.telegram.ui.Components.qz0 qz0Var = zv0Var.Q;
                if (qz0Var != null && qz0Var.f30279s) {
                    org.telegram.ui.Components.oz0 delegate = qz0Var.getDelegate();
                    if (delegate instanceof org.telegram.ui.Cells.d6) {
                        ec1 ec1Var = zv0Var.f45092c;
                        View F = ec1Var.F((org.telegram.ui.Cells.d6) delegate);
                        if (F == null) {
                            T = null;
                        } else {
                            T = ec1Var.T(F);
                        }
                        if (T != null) {
                            View view = T.f47748a;
                            if (zv0Var.Q.getDirection() == 0) {
                                zv0Var.Q.setTranslationY((view.getY() - AndroidUtilities.dp(166.0f)) + view.getMeasuredHeight());
                            } else {
                                zv0Var.Q.setTranslationY(view.getY());
                            }
                            s4.d0 d0Var = zv0Var.d;
                            if (!d0Var.f47855c.r(view) || !d0Var.d.r(view)) {
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
                premiumPreviewFragment.f34159d0.invalidate();
                if (Build.VERSION.SDK_INT >= 31 && (hVar3 = premiumPreviewFragment.f34180u0) != null) {
                    hVar3.f(i10, i11);
                    premiumPreviewFragment.j0();
                    return;
                }
                return;
            case 25:
                fy0 fy0Var = (fy0) obj;
                if (!fy0Var.getMessagesController().blockedEndReached) {
                    int abs = Math.abs(fy0Var.f37805b.N0() - fy0Var.f37805b.L0()) + 1;
                    int h10 = recyclerView.getAdapter().h();
                    if (abs > 0 && fy0Var.f37805b.N0() >= h10 - 10) {
                        fy0Var.getMessagesController().getBlockedPeers(false);
                        return;
                    }
                    return;
                }
                return;
            case 26:
                a41 a41Var = (a41) obj;
                a41Var.f35879e.invalidate();
                viewGroup = ((org.telegram.ui.ActionBar.e3) a41Var.v).containerView;
                viewGroup.invalidate();
                return;
            case 28:
                h91 h91Var = (h91) obj;
                h91Var.o0(false, true);
                if (h91Var.f38353c.I1) {
                    AndroidUtilities.hideKeyboard(h91Var.fragmentView);
                }
                if (Build.VERSION.SDK_INT >= 31 && (hVar4 = h91Var.V) != null) {
                    hVar4.f(i10, i11);
                    h91Var.i0();
                    return;
                }
                return;
            case 29:
                wd1 wd1Var = (wd1) obj;
                wd1Var.f43380u0.f1();
                wd1Var.f43373r0 = true;
                return;
        }
    }

    public h3(ub ubVar) {
        this.f38235a = 4;
        this.f38236b = ubVar;
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
