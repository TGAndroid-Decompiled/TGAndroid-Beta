package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class i3 extends s4.t0 {
    public final int f38611a;
    public final Object f38612b;

    public i3(Object obj, int i10) {
        this.f38611a = i10;
        this.f38612b = obj;
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
        switch (this.f38611a) {
            case 0:
                if (i10 == 0) {
                    ((m3) this.f38612b).K.O0.V();
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
                yb ybVar = (yb) this.f38612b;
                if (i10 == 1) {
                    ybVar.S = true;
                    ybVar.V = true;
                    return;
                } else if (i10 == 0) {
                    ybVar.S = false;
                    ybVar.V = false;
                    ybVar.T0(true);
                    return;
                } else {
                    return;
                }
            case 5:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((eo) this.f38612b).X0);
                    return;
                }
                return;
            case 6:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((qq) this.f38612b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 7:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((wr) this.f38612b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 8:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((cu) this.f38612b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 11:
                r20 r20Var = (r20) this.f38612b;
                if (i10 == 0) {
                    kVar = ((org.telegram.ui.ActionBar.m2) r20Var).actionBar;
                    int dp = AndroidUtilities.dp(16.0f) + kVar.getBottom();
                    if (r20Var.v > 0.5f) {
                        r20Var.f41485c.v0(0, r20Var.f41489r - dp, null);
                        return;
                    }
                    if (r20Var.f41485c.getLayoutManager() != null) {
                        view = r20Var.f41485c.getLayoutManager().m(0);
                    } else {
                        view = null;
                    }
                    if (view != null && view.getTop() < 0) {
                        r20Var.f41485c.v0(0, view.getTop(), null);
                        return;
                    }
                    return;
                }
                return;
            case 12:
                s60 s60Var = (s60) this.f38612b;
                if (i10 == 0) {
                    float f7 = s60Var.A0;
                    if (f7 >= 0.5f && f7 < 1.0f) {
                        kVar2 = ((org.telegram.ui.ActionBar.m2) s60Var).actionBar;
                        int bottom = kVar2.getBottom();
                        s4.p0 layoutManager = s60Var.M.getLayoutManager();
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
                e70 e70Var = (e70) this.f38612b;
                if (i10 == 1) {
                    e70Var.f37004f.f31362r.hideActionMode();
                    AndroidUtilities.hideKeyboard(e70Var.f37004f.f31362r);
                    return;
                }
                return;
            case 14:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((l70) this.f38612b).f39646c);
                    return;
                }
                return;
            case 15:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((v70) this.f38612b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 16:
                n80 n80Var = (n80) this.f38612b;
                if (i10 == 1) {
                    n80Var.d.d.hideActionMode();
                    AndroidUtilities.hideKeyboard(n80Var.d.d);
                    return;
                }
                return;
            case 17:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((LanguageSelectActivity) this.f38612b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 18:
                if (i10 == 1) {
                    id0 id0Var = (id0) this.f38612b;
                    if (id0Var.f38868r0 && id0Var.f38870s0) {
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
                    AndroidUtilities.hideKeyboard(((tj0) this.f38612b).Y.getEditText());
                    return;
                }
                return;
            case 22:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((NotificationsCustomSettingsActivity) this.f38612b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 23:
                return;
            case 24:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.f38612b;
                if (i10 == 0) {
                    kVar3 = ((org.telegram.ui.ActionBar.m2) premiumPreviewFragment).actionBar;
                    int dp2 = AndroidUtilities.dp(16.0f) + kVar3.getBottom();
                    if (premiumPreviewFragment.f33974f0 > 0.5f) {
                        premiumPreviewFragment.f33964a.v0(0, premiumPreviewFragment.f33969c0 - dp2, null);
                        return;
                    }
                    if (premiumPreviewFragment.f33964a.getLayoutManager() != null) {
                        view3 = premiumPreviewFragment.f33964a.getLayoutManager().m(0);
                    } else {
                        view3 = null;
                    }
                    if (view3 != null && view3.getTop() < 0) {
                        premiumPreviewFragment.f33964a.v0(0, view3.getTop(), null);
                        return;
                    }
                    return;
                }
                return;
            case 27:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((h41) this.f38612b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 29:
                if (i10 == 0) {
                    ((zd1) this.f38612b).f44782r0 = false;
                    return;
                }
                return;
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i10, int i11) {
        b10 b10Var;
        org.telegram.ui.Cells.e3 e3Var;
        org.telegram.ui.ActionBar.k kVar;
        int i12;
        ah.h hVar;
        ah.h hVar2;
        s4.d1 T;
        org.telegram.ui.Components.c50 c50Var;
        ah.h hVar3;
        ViewGroup viewGroup;
        ah.h hVar4;
        int i13 = this.f38611a;
        boolean z10 = false;
        int i14 = 0;
        Object obj = this.f38612b;
        switch (i13) {
            case 0:
                m3 m3Var = (m3) obj;
                if (recyclerView.getChildCount() != 0) {
                    recyclerView.invalidate();
                    m3Var.K.O0.G();
                    i4 i4Var = m3Var.K;
                    v3 v3Var = i4Var.K;
                    if (v3Var != null) {
                        v3Var.f42655c.invalidate();
                    } else {
                        ArticleViewer$WindowView articleViewer$WindowView = i4Var.f38650f0;
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
                if (!qVar.I && !qVar.f41129r && qVar.d.N0() > qVar.E - 2) {
                    qVar.W();
                    return;
                }
                return;
            case 2:
                i4 i4Var3 = (i4) obj;
                if (i4Var3.f38653i0.f43317w.I1) {
                    AndroidUtilities.hideKeyboard(i4Var3.f38652h0.f43422b0);
                    return;
                }
                return;
            case 3:
                ((j8) obj).p0();
                return;
            case 4:
                yb ybVar = (yb) obj;
                ybVar.v.invalidate();
                if (i11 != 0 && ybVar.S && !ybVar.Q && ybVar.M.getTag() == null) {
                    AnimatorSet animatorSet = ybVar.R;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                    }
                    ybVar.M.setTag(1);
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    ybVar.R = animatorSet2;
                    animatorSet2.setDuration(150L);
                    ybVar.R.playTogether(ObjectAnimator.ofFloat(ybVar.M, "alpha", 1.0f));
                    ybVar.R.addListener(new w4(this, 14));
                    ybVar.R.start();
                }
                ybVar.O0(true);
                ybVar.c1();
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
                org.telegram.ui.Components.xa xaVar = lvVar.f25291s;
                if (xaVar != null) {
                    lvVar.f25292w = !xaVar.Z();
                    xaVar.invalidate();
                    return;
                }
                return;
            case 10:
                h10 h10Var = (h10) obj;
                if (h10Var.f38212a.I1 && (b10Var = h10Var.K) != null && (e3Var = b10Var.f21887b) != null) {
                    if (e3Var.f25018e) {
                        e3Var.k(true);
                        return;
                    } else {
                        e3Var.d();
                        return;
                    }
                }
                return;
            case 11:
                ((r20) obj).f41490s.invalidate();
                return;
            case 12:
                s60 s60Var = (s60) obj;
                if (s60Var.f41819z0 == null) {
                    s60Var.f41819z0 = (yc) s60Var.y0(s60Var.Z);
                }
                int measuredHeight = s60Var.f41819z0.getMeasuredHeight();
                kVar = ((org.telegram.ui.ActionBar.m2) s60Var).actionBar;
                int measuredHeight2 = measuredHeight - kVar.getMeasuredHeight();
                float top = s60Var.f41819z0.getTop() * (-1);
                float f7 = measuredHeight2;
                float max = Math.max(Math.min(1.0f, top / f7), 0.0f);
                s60Var.A0 = max;
                float min = Math.min(max * 2.0f, 1.0f);
                float min2 = Math.min(Math.max(s60Var.A0 - 0.45f, 0.0f) * 2.0f, 1.0f);
                s60Var.f41819z0.f44450b.setAlpha(AndroidUtilities.lerp(1.0f, 0.0f, min));
                s60Var.f41819z0.f44453f.setAlpha(AndroidUtilities.lerp(1.0f, 0.0f, min));
                s60Var.f41819z0.f44451c.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, min2));
                if (s60Var.A0 >= 1.0f) {
                    s60Var.f41819z0.setTranslationY(top - f7);
                    return;
                } else {
                    s60Var.f41819z0.setTranslationY(0.0f);
                    return;
                }
            case 13:
                e70 e70Var = (e70) obj;
                int L0 = e70Var.f37017r.L0();
                View childAt = e70Var.f37012n.getChildAt(0);
                if (childAt != null) {
                    i12 = childAt.getTop();
                } else {
                    i12 = 0;
                }
                if (L0 != 0 || i12 < e70Var.f37012n.getPaddingTop()) {
                    z10 = true;
                }
                e70Var.f37002e.b(z10, true);
                if (Build.VERSION.SDK_INT >= 31 && (hVar = e70Var.f37015p0) != null) {
                    hVar.f(i10, i11);
                    e70Var.e0();
                    return;
                }
                return;
            case 16:
                n80 n80Var = (n80) obj;
                n80Var.f40323n.L0();
                View childAt2 = n80Var.h.getChildAt(0);
                if (childAt2 != null) {
                    childAt2.getTop();
                }
                if (Build.VERSION.SDK_INT >= 31 && (hVar2 = n80Var.L) != null) {
                    hVar2.f(i10, i11);
                    n80Var.Y();
                    return;
                }
                return;
            case 19:
                ((ej0) obj).K.invalidate();
                return;
            case 20:
                mj0 mj0Var = (mj0) obj;
                int L02 = mj0Var.h.L0();
                if (L02 != -1) {
                    i14 = Math.abs(mj0Var.h.N0() - L02) + 1;
                }
                int h = recyclerView.getAdapter().h();
                if (i14 > 0 && !mj0Var.V && !mj0Var.E && !mj0Var.f40075x.isEmpty() && L02 + i14 >= h - 5 && mj0Var.f40076y) {
                    mj0Var.b0();
                    return;
                }
                return;
            case 22:
                return;
            case 23:
                cw0 cw0Var = (cw0) obj;
                if (i11 != 0 && (c50Var = cw0Var.h) != null) {
                    c50Var.b(true);
                }
                org.telegram.ui.Components.uz0 uz0Var = cw0Var.Q;
                if (uz0Var != null && uz0Var.f31304s) {
                    org.telegram.ui.Components.sz0 delegate = uz0Var.getDelegate();
                    if (delegate instanceof org.telegram.ui.Cells.d6) {
                        hc1 hc1Var = cw0Var.f36544c;
                        View F = hc1Var.F((org.telegram.ui.Cells.d6) delegate);
                        if (F == null) {
                            T = null;
                        } else {
                            T = hc1Var.T(F);
                        }
                        if (T != null) {
                            View view = T.f47897a;
                            if (cw0Var.Q.getDirection() == 0) {
                                cw0Var.Q.setTranslationY((view.getY() - AndroidUtilities.dp(166.0f)) + view.getMeasuredHeight());
                            } else {
                                cw0Var.Q.setTranslationY(view.getY());
                            }
                            s4.d0 d0Var = cw0Var.d;
                            if (!d0Var.f48004c.o(view) || !d0Var.d.o(view)) {
                                cw0Var.Q.f();
                                return;
                            }
                            return;
                        }
                        cw0Var.Q.f();
                        return;
                    }
                    cw0Var.Q.f();
                    return;
                }
                return;
            case 24:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) obj;
                premiumPreviewFragment.f33970d0.invalidate();
                if (Build.VERSION.SDK_INT >= 31 && (hVar3 = premiumPreviewFragment.f33991u0) != null) {
                    hVar3.f(i10, i11);
                    premiumPreviewFragment.j0();
                    return;
                }
                return;
            case 25:
                iy0 iy0Var = (iy0) obj;
                if (!iy0Var.getMessagesController().blockedEndReached) {
                    int abs = Math.abs(iy0Var.f39036b.N0() - iy0Var.f39036b.L0()) + 1;
                    int h10 = recyclerView.getAdapter().h();
                    if (abs > 0 && iy0Var.f39036b.N0() >= h10 - 10) {
                        iy0Var.getMessagesController().getBlockedPeers(false);
                        return;
                    }
                    return;
                }
                return;
            case 26:
                d41 d41Var = (d41) obj;
                d41Var.f36643e.invalidate();
                viewGroup = ((org.telegram.ui.ActionBar.e3) d41Var.v).containerView;
                viewGroup.invalidate();
                return;
            case 28:
                k91 k91Var = (k91) obj;
                k91Var.o0(false, true);
                if (k91Var.f39420c.I1) {
                    AndroidUtilities.hideKeyboard(k91Var.fragmentView);
                }
                if (Build.VERSION.SDK_INT >= 31 && (hVar4 = k91Var.V) != null) {
                    hVar4.f(i10, i11);
                    k91Var.i0();
                    return;
                }
                return;
            case 29:
                zd1 zd1Var = (zd1) obj;
                zd1Var.f44789u0.f1();
                zd1Var.f44782r0 = true;
                return;
        }
    }

    public i3(yb ybVar) {
        this.f38611a = 4;
        this.f38612b = ybVar;
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
