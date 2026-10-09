package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class i3 extends s4.t0 {
    public final int f38463a;
    public final Object f38464b;

    public i3(Object obj, int i10) {
        this.f38463a = i10;
        this.f38464b = obj;
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
        switch (this.f38463a) {
            case 0:
                if (i10 == 0) {
                    ((m3) this.f38464b).K.O0.V();
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
                vb vbVar = (vb) this.f38464b;
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
                    AndroidUtilities.hideKeyboard(((zn) this.f38464b).X0);
                    return;
                }
                return;
            case 6:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((nq) this.f38464b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 7:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((tr) this.f38464b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 8:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((zt) this.f38464b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 11:
                p20 p20Var = (p20) this.f38464b;
                if (i10 == 0) {
                    kVar = ((org.telegram.ui.ActionBar.n2) p20Var).actionBar;
                    int dp = AndroidUtilities.dp(16.0f) + kVar.getBottom();
                    if (p20Var.v > 0.5f) {
                        p20Var.f40638c.v0(0, p20Var.f40642r - dp, null);
                        return;
                    }
                    if (p20Var.f40638c.getLayoutManager() != null) {
                        view = p20Var.f40638c.getLayoutManager().m(0);
                    } else {
                        view = null;
                    }
                    if (view != null && view.getTop() < 0) {
                        p20Var.f40638c.v0(0, view.getTop(), null);
                        return;
                    }
                    return;
                }
                return;
            case 12:
                q60 q60Var = (q60) this.f38464b;
                if (i10 == 0) {
                    float f7 = q60Var.A0;
                    if (f7 >= 0.5f && f7 < 1.0f) {
                        kVar2 = ((org.telegram.ui.ActionBar.n2) q60Var).actionBar;
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
                c70 c70Var = (c70) this.f38464b;
                if (i10 == 1) {
                    c70Var.f36549f.f30614r.hideActionMode();
                    AndroidUtilities.hideKeyboard(c70Var.f36549f.f30614r);
                    return;
                }
                return;
            case 14:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((j70) this.f38464b).f38845c);
                    return;
                }
                return;
            case 15:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((s70) this.f38464b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 16:
                l80 l80Var = (l80) this.f38464b;
                if (i10 == 1) {
                    l80Var.d.d.hideActionMode();
                    AndroidUtilities.hideKeyboard(l80Var.d.d);
                    return;
                }
                return;
            case 17:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((LanguageSelectActivity) this.f38464b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 18:
                if (i10 == 1) {
                    hd0 hd0Var = (hd0) this.f38464b;
                    if (hd0Var.f38276r0 && hd0Var.f38278s0) {
                        AndroidUtilities.hideKeyboard(hd0Var.getParentActivity().getCurrentFocus());
                        return;
                    }
                    return;
                }
                return;
            case 20:
                return;
            case 21:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((sj0) this.f38464b).Y.getEditText());
                    return;
                }
                return;
            case 22:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((NotificationsCustomSettingsActivity) this.f38464b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 23:
                return;
            case 24:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.f38464b;
                if (i10 == 0) {
                    kVar3 = ((org.telegram.ui.ActionBar.n2) premiumPreviewFragment).actionBar;
                    int dp2 = AndroidUtilities.dp(16.0f) + kVar3.getBottom();
                    if (premiumPreviewFragment.f34135f0 > 0.5f) {
                        premiumPreviewFragment.f34125a.v0(0, premiumPreviewFragment.f34130c0 - dp2, null);
                        return;
                    }
                    if (premiumPreviewFragment.f34125a.getLayoutManager() != null) {
                        view3 = premiumPreviewFragment.f34125a.getLayoutManager().m(0);
                    } else {
                        view3 = null;
                    }
                    if (view3 != null && view3.getTop() < 0) {
                        premiumPreviewFragment.f34125a.v0(0, view3.getTop(), null);
                        return;
                    }
                    return;
                }
                return;
            case 27:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((f41) this.f38464b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 29:
                if (i10 == 0) {
                    ((xd1) this.f38464b).f43983r0 = false;
                    return;
                }
                return;
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i10, int i11) {
        z00 z00Var;
        org.telegram.ui.Cells.e3 e3Var;
        org.telegram.ui.ActionBar.k kVar;
        int i12;
        ah.h hVar;
        ah.h hVar2;
        s4.d1 T;
        org.telegram.ui.Components.z40 z40Var;
        ah.h hVar3;
        ViewGroup viewGroup;
        ah.h hVar4;
        int i13 = this.f38463a;
        boolean z10 = false;
        int i14 = 0;
        Object obj = this.f38464b;
        switch (i13) {
            case 0:
                m3 m3Var = (m3) obj;
                if (recyclerView.getChildCount() != 0) {
                    recyclerView.invalidate();
                    m3Var.K.O0.G();
                    i4 i4Var = m3Var.K;
                    v3 v3Var = i4Var.K;
                    if (v3Var != null) {
                        v3Var.f42624c.invalidate();
                    } else {
                        ArticleViewer$WindowView articleViewer$WindowView = i4Var.f38499f0;
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
                q qVar = (q) obj;
                if (!qVar.I && !qVar.f40942r && qVar.d.N0() > qVar.E - 2) {
                    qVar.W();
                    return;
                }
                return;
            case 2:
                i4 i4Var3 = (i4) obj;
                if (i4Var3.f38502i0.f43372w.I1) {
                    AndroidUtilities.hideKeyboard(i4Var3.f38501h0.f43477b0);
                    return;
                }
                return;
            case 3:
                ((g8) obj).p0();
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
                iv ivVar = (iv) obj;
                org.telegram.ui.Components.ya yaVar = ivVar.f26027s;
                if (yaVar != null) {
                    ivVar.f26028w = !yaVar.Z();
                    yaVar.invalidate();
                    return;
                }
                return;
            case 10:
                f10 f10Var = (f10) obj;
                if (f10Var.f37410a.I1 && (z00Var = f10Var.K) != null && (e3Var = z00Var.f22114b) != null) {
                    if (e3Var.f33652e) {
                        e3Var.k(true);
                        return;
                    } else {
                        e3Var.d();
                        return;
                    }
                }
                return;
            case 11:
                ((p20) obj).f40643s.invalidate();
                return;
            case 12:
                q60 q60Var = (q60) obj;
                if (q60Var.f41027z0 == null) {
                    q60Var.f41027z0 = (uc) q60Var.y0(q60Var.Z);
                }
                int measuredHeight = q60Var.f41027z0.getMeasuredHeight();
                kVar = ((org.telegram.ui.ActionBar.n2) q60Var).actionBar;
                int measuredHeight2 = measuredHeight - kVar.getMeasuredHeight();
                float top = q60Var.f41027z0.getTop() * (-1);
                float f7 = measuredHeight2;
                float max = Math.max(Math.min(1.0f, top / f7), 0.0f);
                q60Var.A0 = max;
                float min = Math.min(max * 2.0f, 1.0f);
                float min2 = Math.min(Math.max(q60Var.A0 - 0.45f, 0.0f) * 2.0f, 1.0f);
                q60Var.f41027z0.f42395b.setAlpha(AndroidUtilities.lerp(1.0f, 0.0f, min));
                q60Var.f41027z0.f42398f.setAlpha(AndroidUtilities.lerp(1.0f, 0.0f, min));
                q60Var.f41027z0.f42396c.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, min2));
                if (q60Var.A0 >= 1.0f) {
                    q60Var.f41027z0.setTranslationY(top - f7);
                    return;
                } else {
                    q60Var.f41027z0.setTranslationY(0.0f);
                    return;
                }
            case 13:
                c70 c70Var = (c70) obj;
                int L0 = c70Var.f36562r.L0();
                View childAt = c70Var.f36557n.getChildAt(0);
                if (childAt != null) {
                    i12 = childAt.getTop();
                } else {
                    i12 = 0;
                }
                if (L0 != 0 || i12 < c70Var.f36557n.getPaddingTop()) {
                    z10 = true;
                }
                c70Var.f36547e.b(z10, true);
                if (Build.VERSION.SDK_INT >= 31 && (hVar = c70Var.f36560p0) != null) {
                    hVar.f(i10, i11);
                    c70Var.e0();
                    return;
                }
                return;
            case 16:
                l80 l80Var = (l80) obj;
                l80Var.f39465n.L0();
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
                ((dj0) obj).K.invalidate();
                return;
            case 20:
                lj0 lj0Var = (lj0) obj;
                int L02 = lj0Var.h.L0();
                if (L02 != -1) {
                    i14 = Math.abs(lj0Var.h.N0() - L02) + 1;
                }
                int h = recyclerView.getAdapter().h();
                if (i14 > 0 && !lj0Var.V && !lj0Var.E && !lj0Var.f39607x.isEmpty() && L02 + i14 >= h - 5 && lj0Var.f39608y) {
                    lj0Var.b0();
                    return;
                }
                return;
            case 22:
                return;
            case 23:
                aw0 aw0Var = (aw0) obj;
                if (i11 != 0 && (z40Var = aw0Var.h) != null) {
                    z40Var.b(true);
                }
                org.telegram.ui.Components.oz0 oz0Var = aw0Var.Q;
                if (oz0Var != null && oz0Var.f29612s) {
                    org.telegram.ui.Components.mz0 delegate = oz0Var.getDelegate();
                    if (delegate instanceof org.telegram.ui.Cells.d6) {
                        fc1 fc1Var = aw0Var.f36036c;
                        View F = fc1Var.F((org.telegram.ui.Cells.d6) delegate);
                        if (F == null) {
                            T = null;
                        } else {
                            T = fc1Var.T(F);
                        }
                        if (T != null) {
                            View view = T.f47656a;
                            if (aw0Var.Q.getDirection() == 0) {
                                aw0Var.Q.setTranslationY((view.getY() - AndroidUtilities.dp(166.0f)) + view.getMeasuredHeight());
                            } else {
                                aw0Var.Q.setTranslationY(view.getY());
                            }
                            s4.d0 d0Var = aw0Var.d;
                            if (!d0Var.f47763c.r(view) || !d0Var.d.r(view)) {
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
                premiumPreviewFragment.f34131d0.invalidate();
                if (Build.VERSION.SDK_INT >= 31 && (hVar3 = premiumPreviewFragment.f34152u0) != null) {
                    hVar3.f(i10, i11);
                    premiumPreviewFragment.k0();
                    return;
                }
                return;
            case 25:
                gy0 gy0Var = (gy0) obj;
                if (!gy0Var.getMessagesController().blockedEndReached) {
                    int abs = Math.abs(gy0Var.f38141b.N0() - gy0Var.f38141b.L0()) + 1;
                    int h10 = recyclerView.getAdapter().h();
                    if (abs > 0 && gy0Var.f38141b.N0() >= h10 - 10) {
                        gy0Var.getMessagesController().getBlockedPeers(false);
                        return;
                    }
                    return;
                }
                return;
            case 26:
                b41 b41Var = (b41) obj;
                b41Var.f36132e.invalidate();
                viewGroup = ((org.telegram.ui.ActionBar.f3) b41Var.v).containerView;
                viewGroup.invalidate();
                return;
            case 28:
                i91 i91Var = (i91) obj;
                i91Var.o0(false, true);
                if (i91Var.f38582c.I1) {
                    AndroidUtilities.hideKeyboard(i91Var.fragmentView);
                }
                if (Build.VERSION.SDK_INT >= 31 && (hVar4 = i91Var.V) != null) {
                    hVar4.f(i10, i11);
                    i91Var.i0();
                    return;
                }
                return;
            case 29:
                xd1 xd1Var = (xd1) obj;
                xd1Var.f43990u0.f1();
                xd1Var.f43983r0 = true;
                return;
        }
    }

    public i3(vb vbVar) {
        this.f38463a = 4;
        this.f38464b = vbVar;
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
