package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class n3 extends f2.z0 {
    public final int f36329a;
    public final Object f36330b;

    public n3(Object obj, int i10) {
        this.f36329a = i10;
        this.f36330b = obj;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        org.telegram.ui.ActionBar.k kVar;
        View view;
        View view2;
        View m9;
        org.telegram.ui.ActionBar.k kVar2;
        View view3;
        switch (this.f36329a) {
            case 0:
                if (i10 == 0) {
                    ((r3) this.f36330b).H.L0.W();
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
                ub ubVar = (ub) this.f36330b;
                if (i10 == 1) {
                    ubVar.T = true;
                    ubVar.W = true;
                    return;
                } else if (i10 == 0) {
                    ubVar.T = false;
                    ubVar.W = false;
                    ubVar.T0(true);
                    return;
                } else {
                    return;
                }
            case 5:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((zn) this.f36330b).U0);
                    return;
                }
                return;
            case 6:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((lq) this.f36330b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 7:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((rr) this.f36330b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 8:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((au) this.f36330b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 11:
                n20 n20Var = (n20) this.f36330b;
                if (i10 == 0) {
                    kVar = ((org.telegram.ui.ActionBar.p2) n20Var).actionBar;
                    int dp = AndroidUtilities.dp(16.0f) + kVar.getBottom();
                    if (n20Var.v > 0.5f) {
                        n20Var.f36318c.v0(0, n20Var.f36321r - dp, null);
                        return;
                    }
                    if (n20Var.f36318c.getLayoutManager() != null) {
                        view = n20Var.f36318c.getLayoutManager().m(0);
                    } else {
                        view = null;
                    }
                    if (view != null && view.getTop() < 0) {
                        n20Var.f36318c.v0(0, view.getTop(), null);
                        return;
                    }
                    return;
                }
                return;
            case 12:
                o60 o60Var = (o60) this.f36330b;
                if (i10 == 0) {
                    float f10 = o60Var.f36661x0;
                    if (f10 >= 0.5f && f10 < 1.0f) {
                        int bottom = o60.h1(o60Var).getBottom();
                        f2.v0 layoutManager = o60Var.J.getLayoutManager();
                        if (layoutManager != null && (m9 = layoutManager.m(0)) != null) {
                            o60Var.J.v0(0, m9.getBottom() - bottom, null);
                            return;
                        }
                        return;
                    } else if (f10 < 0.5f) {
                        if (o60Var.J.getLayoutManager() != null) {
                            view2 = o60Var.J.getLayoutManager().m(0);
                        } else {
                            view2 = null;
                        }
                        if (view2 != null && view2.getTop() < 0) {
                            o60Var.J.v0(0, view2.getTop(), null);
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 13:
                a70 a70Var = (a70) this.f36330b;
                if (i10 == 1) {
                    a70Var.f32491f.f24117r.hideActionMode();
                    AndroidUtilities.hideKeyboard(a70Var.f32491f.f24117r);
                    return;
                }
                return;
            case 14:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((g70) this.f36330b).f34342c);
                    return;
                }
                return;
            case 15:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((o70) this.f36330b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 16:
                e80 e80Var = (e80) this.f36330b;
                if (i10 == 1) {
                    e80Var.d.d.hideActionMode();
                    AndroidUtilities.hideKeyboard(e80Var.d.d);
                    return;
                }
                return;
            case 17:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((LanguageSelectActivity) this.f36330b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 18:
                if (i10 == 1) {
                    cd0 cd0Var = (cd0) this.f36330b;
                    if (cd0Var.f33101o0 && cd0Var.f33102p0) {
                        AndroidUtilities.hideKeyboard(cd0Var.getParentActivity().getCurrentFocus());
                        return;
                    }
                    return;
                }
                return;
            case 20:
                return;
            case 21:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((jj0) this.f36330b).V.getEditText());
                    return;
                }
                return;
            case 22:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((NotificationsCustomSettingsActivity) this.f36330b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 23:
                return;
            case 24:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.f36330b;
                if (i10 == 0) {
                    kVar2 = ((org.telegram.ui.ActionBar.p2) premiumPreviewFragment).actionBar;
                    int dp2 = AndroidUtilities.dp(16.0f) + kVar2.getBottom();
                    if (premiumPreviewFragment.f31930c0 > 0.5f) {
                        premiumPreviewFragment.f31925a.v0(0, premiumPreviewFragment.Z - dp2, null);
                        return;
                    }
                    if (premiumPreviewFragment.f31925a.getLayoutManager() != null) {
                        view3 = premiumPreviewFragment.f31925a.getLayoutManager().m(0);
                    } else {
                        view3 = null;
                    }
                    if (view3 != null && view3.getTop() < 0) {
                        premiumPreviewFragment.f31925a.v0(0, view3.getTop(), null);
                        return;
                    }
                    return;
                }
                return;
            case 27:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((t31) this.f36330b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 29:
                if (i10 == 0) {
                    ((jd1) this.f36330b).f35216o0 = false;
                    return;
                }
                return;
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i10, int i11) {
        w00 w00Var;
        org.telegram.ui.Cells.c3 c3Var;
        int i12;
        ng.e eVar;
        ng.e eVar2;
        f2.l1 T;
        org.telegram.ui.Components.l40 l40Var;
        ng.e eVar3;
        ng.e eVar4;
        int i13 = this.f36329a;
        boolean z4 = false;
        int i14 = 0;
        Object obj = this.f36330b;
        switch (i13) {
            case 0:
                r3 r3Var = (r3) obj;
                if (recyclerView.getChildCount() != 0) {
                    recyclerView.invalidate();
                    r3Var.H.L0.H();
                    n4 n4Var = r3Var.H;
                    a4 a4Var = n4Var.H;
                    if (a4Var != null) {
                        a4Var.f32442c.invalidate();
                    } else {
                        ArticleViewer$WindowView articleViewer$WindowView = n4Var.f36361c0;
                        if (articleViewer$WindowView != null) {
                            articleViewer$WindowView.invalidate();
                        }
                    }
                    r3Var.H.f0();
                    n4 n4Var2 = r3Var.H;
                    a4 a4Var2 = n4Var2.H;
                    if (a4Var2 == null || a4Var2.C) {
                        n4Var2.X(n4Var2.F0 - i11);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                r rVar = (r) obj;
                if (!rVar.F && !rVar.f37663r && rVar.d.N0() > rVar.B - 2) {
                    rVar.W();
                    return;
                }
                return;
            case 2:
                n4 n4Var3 = (n4) obj;
                if (n4Var3.f36364f0.f39503w.H1) {
                    AndroidUtilities.hideKeyboard(n4Var3.f36363e0.V);
                    return;
                }
                return;
            case 3:
                ((l8) obj).p0();
                return;
            case 4:
                ub ubVar = (ub) obj;
                ubVar.B.invalidate();
                if (i11 != 0 && ubVar.T && !ubVar.R && ubVar.N.getTag() == null) {
                    AnimatorSet animatorSet = ubVar.S;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                    }
                    ubVar.N.setTag(1);
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    ubVar.S = animatorSet2;
                    animatorSet2.setDuration(150L);
                    ubVar.S.playTogether(ObjectAnimator.ofFloat(ubVar.N, "alpha", 1.0f));
                    ubVar.S.addListener(new u5(this, 13));
                    ubVar.S.start();
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
                iv ivVar = (iv) obj;
                org.telegram.ui.Components.na naVar = ivVar.f28703s;
                if (naVar != null) {
                    ivVar.f28704w = !naVar.Z();
                    naVar.invalidate();
                    return;
                }
                return;
            case 10:
                c10 c10Var = (c10) obj;
                if (c10Var.f32976a.H1 && (w00Var = c10Var.H) != null && (c3Var = w00Var.f20986b) != null) {
                    if (c3Var.e) {
                        c3Var.k(true);
                        return;
                    } else {
                        c3Var.d();
                        return;
                    }
                }
                return;
            case 11:
                ((n20) obj).f36322s.invalidate();
                return;
            case 12:
                o60 o60Var = (o60) obj;
                if (o60Var.f36660w0 == null) {
                    o60Var.f36660w0 = (wc) o60Var.y0(o60Var.W);
                }
                int measuredHeight = o60Var.f36660w0.getMeasuredHeight() - o60.g1(o60Var).getMeasuredHeight();
                float top = o60Var.f36660w0.getTop() * (-1);
                float f10 = measuredHeight;
                float max = Math.max(Math.min(1.0f, top / f10), 0.0f);
                o60Var.f36661x0 = max;
                float min = Math.min(max * 2.0f, 1.0f);
                float min2 = Math.min(Math.max(o60Var.f36661x0 - 0.45f, 0.0f) * 2.0f, 1.0f);
                o60Var.f36660w0.f39335b.setAlpha(AndroidUtilities.lerp(1.0f, 0.0f, min));
                o60Var.f36660w0.f39337f.setAlpha(AndroidUtilities.lerp(1.0f, 0.0f, min));
                o60Var.f36660w0.f39336c.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, min2));
                if (o60Var.f36661x0 >= 1.0f) {
                    o60Var.f36660w0.setTranslationY(top - f10);
                    return;
                } else {
                    o60Var.f36660w0.setTranslationY(0.0f);
                    return;
                }
            case 13:
                a70 a70Var = (a70) obj;
                int L0 = a70Var.f32504r.L0();
                View childAt = a70Var.f32499n.getChildAt(0);
                if (childAt != null) {
                    i12 = childAt.getTop();
                } else {
                    i12 = 0;
                }
                a70Var.e.b((L0 != 0 || i12 < a70Var.f32499n.getPaddingTop()) ? true : true, true);
                if (Build.VERSION.SDK_INT >= 31 && (eVar = a70Var.m0) != null) {
                    eVar.f(i10, i11);
                    a70Var.e0();
                    return;
                }
                return;
            case 16:
                e80 e80Var = (e80) obj;
                e80Var.f33737n.L0();
                View childAt2 = e80Var.h.getChildAt(0);
                if (childAt2 != null) {
                    childAt2.getTop();
                }
                if (Build.VERSION.SDK_INT >= 31 && (eVar2 = e80Var.I) != null) {
                    eVar2.f(i10, i11);
                    e80Var.Y();
                    return;
                }
                return;
            case 19:
                ((ui0) obj).H.invalidate();
                return;
            case 20:
                cj0 cj0Var = (cj0) obj;
                int L02 = cj0Var.h.L0();
                if (L02 != -1) {
                    i14 = Math.abs(cj0Var.h.N0() - L02) + 1;
                }
                int h = recyclerView.getAdapter().h();
                if (i14 > 0 && !cj0Var.S && !cj0Var.B && !cj0Var.f33177x.isEmpty() && L02 + i14 >= h - 5 && cj0Var.f33178y) {
                    cj0Var.b0();
                    return;
                }
                return;
            case 22:
                return;
            case 23:
                mv0 mv0Var = (mv0) obj;
                if (i11 != 0 && (l40Var = mv0Var.h) != null) {
                    l40Var.b(true);
                }
                org.telegram.ui.Components.qy0 qy0Var = mv0Var.N;
                if (qy0Var != null && qy0Var.f28324s) {
                    org.telegram.ui.Components.oy0 delegate = qy0Var.getDelegate();
                    if (delegate instanceof org.telegram.ui.Cells.b6) {
                        rb1 rb1Var = mv0Var.f36233c;
                        View F = rb1Var.F((org.telegram.ui.Cells.b6) delegate);
                        if (F == null) {
                            T = null;
                        } else {
                            T = rb1Var.T(F);
                        }
                        if (T != null) {
                            View view = T.f5774a;
                            if (mv0Var.N.getDirection() == 0) {
                                mv0Var.N.setTranslationY((view.getY() - AndroidUtilities.dp(166.0f)) + view.getMeasuredHeight());
                            } else {
                                mv0Var.N.setTranslationY(view.getY());
                            }
                            f2.i0 i0Var = mv0Var.d;
                            if (!i0Var.f5838c.W(view) || !i0Var.d.W(view)) {
                                mv0Var.N.f();
                                return;
                            }
                            return;
                        }
                        mv0Var.N.f();
                        return;
                    }
                    mv0Var.N.f();
                    return;
                }
                return;
            case 24:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) obj;
                premiumPreviewFragment.f31926a0.invalidate();
                if (Build.VERSION.SDK_INT >= 31 && (eVar3 = premiumPreviewFragment.f31947r0) != null) {
                    eVar3.f(i10, i11);
                    premiumPreviewFragment.j0();
                    return;
                }
                return;
            case 25:
                tx0 tx0Var = (tx0) obj;
                if (!tx0Var.getMessagesController().blockedEndReached) {
                    int abs = Math.abs(tx0Var.f38604b.N0() - tx0Var.f38604b.L0()) + 1;
                    int h9 = recyclerView.getAdapter().h();
                    if (abs > 0 && tx0Var.f38604b.N0() >= h9 - 10) {
                        tx0Var.getMessagesController().getBlockedPeers(false);
                        return;
                    }
                    return;
                }
                return;
            case 26:
                p31 p31Var = (p31) obj;
                p31Var.e.invalidate();
                q31.t(p31Var.v).invalidate();
                return;
            case 28:
                w81 w81Var = (w81) obj;
                w81Var.o0(false, true);
                if (w81Var.f39311c.H1) {
                    AndroidUtilities.hideKeyboard(w81Var.fragmentView);
                }
                if (Build.VERSION.SDK_INT >= 31 && (eVar4 = w81Var.S) != null) {
                    eVar4.f(i10, i11);
                    w81Var.i0();
                    return;
                }
                return;
            case 29:
                jd1 jd1Var = (jd1) obj;
                jd1Var.f35223r0.e1();
                jd1Var.f35216o0 = true;
                return;
        }
    }

    public n3(ub ubVar) {
        this.f36329a = 4;
        this.f36330b = ubVar;
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
