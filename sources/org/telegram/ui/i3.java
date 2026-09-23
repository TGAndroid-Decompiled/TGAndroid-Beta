package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class i3 extends s4.s0 {
    public final int f33972a;
    public final Object f33973b;

    public i3(Object obj, int i10) {
        this.f33972a = i10;
        this.f33973b = obj;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        org.telegram.ui.ActionBar.k kVar;
        View view;
        View view2;
        View m10;
        org.telegram.ui.ActionBar.k kVar2;
        View view3;
        switch (this.f33972a) {
            case 0:
                if (i10 == 0) {
                    ((m3) this.f33973b).K.O0.W();
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
                ub ubVar = (ub) this.f33973b;
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
                    AndroidUtilities.hideKeyboard(((xn) this.f33973b).X0);
                    return;
                }
                return;
            case 6:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((lq) this.f33973b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 7:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((qr) this.f33973b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 8:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((xt) this.f33973b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 11:
                o20 o20Var = (o20) this.f33973b;
                if (i10 == 0) {
                    kVar = ((org.telegram.ui.ActionBar.n2) o20Var).actionBar;
                    int dp = AndroidUtilities.dp(16.0f) + kVar.getBottom();
                    if (o20Var.v > 0.5f) {
                        o20Var.f35660c.v0(0, o20Var.f35663r - dp, null);
                        return;
                    }
                    if (o20Var.f35660c.getLayoutManager() != null) {
                        view = o20Var.f35660c.getLayoutManager().m(0);
                    } else {
                        view = null;
                    }
                    if (view != null && view.getTop() < 0) {
                        o20Var.f35660c.v0(0, view.getTop(), null);
                        return;
                    }
                    return;
                }
                return;
            case 12:
                p60 p60Var = (p60) this.f33973b;
                if (i10 == 0) {
                    float f7 = p60Var.A0;
                    if (f7 >= 0.5f && f7 < 1.0f) {
                        int bottom = p60.h1(p60Var).getBottom();
                        s4.o0 layoutManager = p60Var.M.getLayoutManager();
                        if (layoutManager != null && (m10 = layoutManager.m(0)) != null) {
                            p60Var.M.v0(0, m10.getBottom() - bottom, null);
                            return;
                        }
                        return;
                    } else if (f7 < 0.5f) {
                        if (p60Var.M.getLayoutManager() != null) {
                            view2 = p60Var.M.getLayoutManager().m(0);
                        } else {
                            view2 = null;
                        }
                        if (view2 != null && view2.getTop() < 0) {
                            p60Var.M.v0(0, view2.getTop(), null);
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 13:
                b70 b70Var = (b70) this.f33973b;
                if (i10 == 1) {
                    b70Var.f31991f.f22890r.hideActionMode();
                    AndroidUtilities.hideKeyboard(b70Var.f31991f.f22890r);
                    return;
                }
                return;
            case 14:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((i70) this.f33973b).f34045c);
                    return;
                }
                return;
            case 15:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((q70) this.f33973b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 16:
                i80 i80Var = (i80) this.f33973b;
                if (i10 == 1) {
                    i80Var.d.d.hideActionMode();
                    AndroidUtilities.hideKeyboard(i80Var.d.d);
                    return;
                }
                return;
            case 17:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((LanguageSelectActivity) this.f33973b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 18:
                if (i10 == 1) {
                    dd0 dd0Var = (dd0) this.f33973b;
                    if (dd0Var.f32602r0 && dd0Var.f32604s0) {
                        AndroidUtilities.hideKeyboard(dd0Var.getParentActivity().getCurrentFocus());
                        return;
                    }
                    return;
                }
                return;
            case 20:
                return;
            case 21:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((lj0) this.f33973b).Y.getEditText());
                    return;
                }
                return;
            case 22:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((NotificationsCustomSettingsActivity) this.f33973b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 23:
                return;
            case 24:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.f33973b;
                if (i10 == 0) {
                    kVar2 = ((org.telegram.ui.ActionBar.n2) premiumPreviewFragment).actionBar;
                    int dp2 = AndroidUtilities.dp(16.0f) + kVar2.getBottom();
                    if (premiumPreviewFragment.f31135f0 > 0.5f) {
                        premiumPreviewFragment.f31126a.v0(0, premiumPreviewFragment.f31131c0 - dp2, null);
                        return;
                    }
                    if (premiumPreviewFragment.f31126a.getLayoutManager() != null) {
                        view3 = premiumPreviewFragment.f31126a.getLayoutManager().m(0);
                    } else {
                        view3 = null;
                    }
                    if (view3 != null && view3.getTop() < 0) {
                        premiumPreviewFragment.f31126a.v0(0, view3.getTop(), null);
                        return;
                    }
                    return;
                }
                return;
            case 27:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((x31) this.f33973b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 29:
                if (i10 == 0) {
                    ((od1) this.f33973b).f35827r0 = false;
                    return;
                }
                return;
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i10, int i11) {
        w00 w00Var;
        org.telegram.ui.Cells.d3 d3Var;
        int i12;
        ah.h hVar;
        ah.h hVar2;
        s4.c1 T;
        org.telegram.ui.Components.j40 j40Var;
        ah.h hVar3;
        ah.h hVar4;
        int i13 = this.f33972a;
        boolean z10 = false;
        int i14 = 0;
        Object obj = this.f33973b;
        switch (i13) {
            case 0:
                m3 m3Var = (m3) obj;
                if (recyclerView.getChildCount() != 0) {
                    recyclerView.invalidate();
                    m3Var.K.O0.H();
                    i4 i4Var = m3Var.K;
                    v3 v3Var = i4Var.K;
                    if (v3Var != null) {
                        v3Var.f38278c.invalidate();
                    } else {
                        ArticleViewer$WindowView articleViewer$WindowView = i4Var.f34007f0;
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
                if (!pVar.I && !pVar.f35983r && pVar.d.N0() > pVar.E - 2) {
                    pVar.W();
                    return;
                }
                return;
            case 2:
                i4 i4Var3 = (i4) obj;
                if (i4Var3.f34010i0.f38755w.K1) {
                    AndroidUtilities.hideKeyboard(i4Var3.f34009h0.f38848b0);
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
                    ubVar.R.addListener(new u4(this, 14));
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
                gv gvVar = (gv) obj;
                org.telegram.ui.Components.va vaVar = gvVar.f22663s;
                if (vaVar != null) {
                    gvVar.f22664w = !vaVar.Z();
                    vaVar.invalidate();
                    return;
                }
                return;
            case 10:
                c10 c10Var = (c10) obj;
                if (c10Var.f32219a.K1 && (w00Var = c10Var.K) != null && (d3Var = w00Var.f20027b) != null) {
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
                ((o20) obj).f35664s.invalidate();
                return;
            case 12:
                p60 p60Var = (p60) obj;
                if (p60Var.f36030z0 == null) {
                    p60Var.f36030z0 = (tc) p60Var.y0(p60Var.Z);
                }
                int measuredHeight = p60Var.f36030z0.getMeasuredHeight() - p60.g1(p60Var).getMeasuredHeight();
                float top = p60Var.f36030z0.getTop() * (-1);
                float f7 = measuredHeight;
                float max = Math.max(Math.min(1.0f, top / f7), 0.0f);
                p60Var.A0 = max;
                float min = Math.min(max * 2.0f, 1.0f);
                float min2 = Math.min(Math.max(p60Var.A0 - 0.45f, 0.0f) * 2.0f, 1.0f);
                p60Var.f36030z0.f37602b.setAlpha(AndroidUtilities.lerp(1.0f, 0.0f, min));
                p60Var.f36030z0.f37604f.setAlpha(AndroidUtilities.lerp(1.0f, 0.0f, min));
                p60Var.f36030z0.f37603c.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, min2));
                if (p60Var.A0 >= 1.0f) {
                    p60Var.f36030z0.setTranslationY(top - f7);
                    return;
                } else {
                    p60Var.f36030z0.setTranslationY(0.0f);
                    return;
                }
            case 13:
                b70 b70Var = (b70) obj;
                int L0 = b70Var.f32004r.L0();
                View childAt = b70Var.f31999n.getChildAt(0);
                if (childAt != null) {
                    i12 = childAt.getTop();
                } else {
                    i12 = 0;
                }
                b70Var.e.b((L0 != 0 || i12 < b70Var.f31999n.getPaddingTop()) ? true : true, true);
                if (Build.VERSION.SDK_INT >= 31 && (hVar = b70Var.f32002p0) != null) {
                    hVar.f(i10, i11);
                    b70Var.e0();
                    return;
                }
                return;
            case 16:
                i80 i80Var = (i80) obj;
                i80Var.f34067n.L0();
                View childAt2 = i80Var.h.getChildAt(0);
                if (childAt2 != null) {
                    childAt2.getTop();
                }
                if (Build.VERSION.SDK_INT >= 31 && (hVar2 = i80Var.L) != null) {
                    hVar2.f(i10, i11);
                    i80Var.Y();
                    return;
                }
                return;
            case 19:
                ((wi0) obj).K.invalidate();
                return;
            case 20:
                ej0 ej0Var = (ej0) obj;
                int L02 = ej0Var.h.L0();
                if (L02 != -1) {
                    i14 = Math.abs(ej0Var.h.N0() - L02) + 1;
                }
                int h = recyclerView.getAdapter().h();
                if (i14 > 0 && !ej0Var.V && !ej0Var.E && !ej0Var.f32957x.isEmpty() && L02 + i14 >= h - 5 && ej0Var.f32958y) {
                    ej0Var.b0();
                    return;
                }
                return;
            case 22:
                return;
            case 23:
                tv0 tv0Var = (tv0) obj;
                if (i11 != 0 && (j40Var = tv0Var.h) != null) {
                    j40Var.b(true);
                }
                org.telegram.ui.Components.my0 my0Var = tv0Var.Q;
                if (my0Var != null && my0Var.f26298s) {
                    org.telegram.ui.Components.ky0 delegate = my0Var.getDelegate();
                    if (delegate instanceof org.telegram.ui.Cells.d6) {
                        wb1 wb1Var = tv0Var.f37771c;
                        View F = wb1Var.F((org.telegram.ui.Cells.d6) delegate);
                        if (F == null) {
                            T = null;
                        } else {
                            T = wb1Var.T(F);
                        }
                        if (T != null) {
                            View view = T.f42627a;
                            if (tv0Var.Q.getDirection() == 0) {
                                tv0Var.Q.setTranslationY((view.getY() - AndroidUtilities.dp(166.0f)) + view.getMeasuredHeight());
                            } else {
                                tv0Var.Q.setTranslationY(view.getY());
                            }
                            s4.c0 c0Var = tv0Var.d;
                            if (!c0Var.f42721c.v(view) || !c0Var.d.v(view)) {
                                tv0Var.Q.f();
                                return;
                            }
                            return;
                        }
                        tv0Var.Q.f();
                        return;
                    }
                    tv0Var.Q.f();
                    return;
                }
                return;
            case 24:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) obj;
                premiumPreviewFragment.f31132d0.invalidate();
                if (Build.VERSION.SDK_INT >= 31 && (hVar3 = premiumPreviewFragment.f31152u0) != null) {
                    hVar3.f(i10, i11);
                    premiumPreviewFragment.j0();
                    return;
                }
                return;
            case 25:
                zx0 zx0Var = (zx0) obj;
                if (!zx0Var.getMessagesController().blockedEndReached) {
                    int abs = Math.abs(zx0Var.f40265b.N0() - zx0Var.f40265b.L0()) + 1;
                    int h10 = recyclerView.getAdapter().h();
                    if (abs > 0 && zx0Var.f40265b.N0() >= h10 - 10) {
                        zx0Var.getMessagesController().getBlockedPeers(false);
                        return;
                    }
                    return;
                }
                return;
            case 26:
                t31 t31Var = (t31) obj;
                t31Var.e.invalidate();
                u31.t(t31Var.v).invalidate();
                return;
            case 28:
                x81 x81Var = (x81) obj;
                x81Var.o0(false, true);
                if (x81Var.f39210c.K1) {
                    AndroidUtilities.hideKeyboard(x81Var.fragmentView);
                }
                if (Build.VERSION.SDK_INT >= 31 && (hVar4 = x81Var.V) != null) {
                    hVar4.f(i10, i11);
                    x81Var.i0();
                    return;
                }
                return;
            case 29:
                od1 od1Var = (od1) obj;
                od1Var.f35834u0.f1();
                od1Var.f35827r0 = true;
                return;
        }
    }

    public i3(ub ubVar) {
        this.f33972a = 4;
        this.f33973b = ubVar;
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
