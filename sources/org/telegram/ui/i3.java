package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class i3 extends s4.s0 {
    public final int f34356a;
    public final Object f34357b;

    public i3(Object obj, int i10) {
        this.f34356a = i10;
        this.f34357b = obj;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        org.telegram.ui.ActionBar.k kVar;
        View view;
        View view2;
        View m10;
        org.telegram.ui.ActionBar.k kVar2;
        View view3;
        switch (this.f34356a) {
            case 0:
                if (i10 == 0) {
                    ((m3) this.f34357b).K.O0.W();
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
                ub ubVar = (ub) this.f34357b;
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
                    AndroidUtilities.hideKeyboard(((wn) this.f34357b).X0);
                    return;
                }
                return;
            case 6:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((kq) this.f34357b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 7:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((pr) this.f34357b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 8:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((wt) this.f34357b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 11:
                m20 m20Var = (m20) this.f34357b;
                if (i10 == 0) {
                    kVar = ((org.telegram.ui.ActionBar.m2) m20Var).actionBar;
                    int dp = AndroidUtilities.dp(16.0f) + kVar.getBottom();
                    if (m20Var.v > 0.5f) {
                        m20Var.f35448c.v0(0, m20Var.f35451r - dp, null);
                        return;
                    }
                    if (m20Var.f35448c.getLayoutManager() != null) {
                        view = m20Var.f35448c.getLayoutManager().m(0);
                    } else {
                        view = null;
                    }
                    if (view != null && view.getTop() < 0) {
                        m20Var.f35448c.v0(0, view.getTop(), null);
                        return;
                    }
                    return;
                }
                return;
            case 12:
                n60 n60Var = (n60) this.f34357b;
                if (i10 == 0) {
                    float f7 = n60Var.A0;
                    if (f7 >= 0.5f && f7 < 1.0f) {
                        int bottom = n60.h1(n60Var).getBottom();
                        s4.o0 layoutManager = n60Var.M.getLayoutManager();
                        if (layoutManager != null && (m10 = layoutManager.m(0)) != null) {
                            n60Var.M.v0(0, m10.getBottom() - bottom, null);
                            return;
                        }
                        return;
                    } else if (f7 < 0.5f) {
                        if (n60Var.M.getLayoutManager() != null) {
                            view2 = n60Var.M.getLayoutManager().m(0);
                        } else {
                            view2 = null;
                        }
                        if (view2 != null && view2.getTop() < 0) {
                            n60Var.M.v0(0, view2.getTop(), null);
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 13:
                z60 z60Var = (z60) this.f34357b;
                if (i10 == 1) {
                    z60Var.f40373f.f23475r.hideActionMode();
                    AndroidUtilities.hideKeyboard(z60Var.f40373f.f23475r);
                    return;
                }
                return;
            case 14:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((g70) this.f34357b).f33836c);
                    return;
                }
                return;
            case 15:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((o70) this.f34357b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 16:
                g80 g80Var = (g80) this.f34357b;
                if (i10 == 1) {
                    g80Var.d.d.hideActionMode();
                    AndroidUtilities.hideKeyboard(g80Var.d.d);
                    return;
                }
                return;
            case 17:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((LanguageSelectActivity) this.f34357b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 18:
                if (i10 == 1) {
                    cd0 cd0Var = (cd0) this.f34357b;
                    if (cd0Var.f32676r0 && cd0Var.f32678s0) {
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
                    AndroidUtilities.hideKeyboard(((kj0) this.f34357b).Y.getEditText());
                    return;
                }
                return;
            case 22:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((NotificationsCustomSettingsActivity) this.f34357b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 23:
                return;
            case 24:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.f34357b;
                if (i10 == 0) {
                    kVar2 = ((org.telegram.ui.ActionBar.m2) premiumPreviewFragment).actionBar;
                    int dp2 = AndroidUtilities.dp(16.0f) + kVar2.getBottom();
                    if (premiumPreviewFragment.f31449f0 > 0.5f) {
                        premiumPreviewFragment.f31440a.v0(0, premiumPreviewFragment.f31445c0 - dp2, null);
                        return;
                    }
                    if (premiumPreviewFragment.f31440a.getLayoutManager() != null) {
                        view3 = premiumPreviewFragment.f31440a.getLayoutManager().m(0);
                    } else {
                        view3 = null;
                    }
                    if (view3 != null && view3.getTop() < 0) {
                        premiumPreviewFragment.f31440a.v0(0, view3.getTop(), null);
                        return;
                    }
                    return;
                }
                return;
            case 27:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((w31) this.f34357b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 29:
                if (i10 == 0) {
                    ((od1) this.f34357b).f36198r0 = false;
                    return;
                }
                return;
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i10, int i11) {
        v00 v00Var;
        org.telegram.ui.Cells.e3 e3Var;
        int i12;
        ah.h hVar;
        ah.h hVar2;
        s4.c1 T;
        org.telegram.ui.Components.k40 k40Var;
        ah.h hVar3;
        ah.h hVar4;
        int i13 = this.f34356a;
        boolean z10 = false;
        int i14 = 0;
        Object obj = this.f34357b;
        switch (i13) {
            case 0:
                m3 m3Var = (m3) obj;
                if (recyclerView.getChildCount() != 0) {
                    recyclerView.invalidate();
                    m3Var.K.O0.H();
                    i4 i4Var = m3Var.K;
                    v3 v3Var = i4Var.K;
                    if (v3Var != null) {
                        v3Var.f38619c.invalidate();
                    } else {
                        ArticleViewer$WindowView articleViewer$WindowView = i4Var.f34392f0;
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
                if (!qVar.I && !qVar.f36713r && qVar.d.N0() > qVar.E - 2) {
                    qVar.W();
                    return;
                }
                return;
            case 2:
                i4 i4Var3 = (i4) obj;
                if (i4Var3.f34395i0.f39122w.K1) {
                    AndroidUtilities.hideKeyboard(i4Var3.f34394h0.f39228b0);
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
                fv fvVar = (fv) obj;
                org.telegram.ui.Components.va vaVar = fvVar.f22960s;
                if (vaVar != null) {
                    fvVar.f22961w = !vaVar.Z();
                    vaVar.invalidate();
                    return;
                }
                return;
            case 10:
                b10 b10Var = (b10) obj;
                if (b10Var.f32272a.K1 && (v00Var = b10Var.K) != null && (e3Var = v00Var.f20328b) != null) {
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
                ((m20) obj).f35452s.invalidate();
                return;
            case 12:
                n60 n60Var = (n60) obj;
                if (n60Var.f35752z0 == null) {
                    n60Var.f35752z0 = (tc) n60Var.y0(n60Var.Z);
                }
                int measuredHeight = n60Var.f35752z0.getMeasuredHeight() - n60.g1(n60Var).getMeasuredHeight();
                float top = n60Var.f35752z0.getTop() * (-1);
                float f7 = measuredHeight;
                float max = Math.max(Math.min(1.0f, top / f7), 0.0f);
                n60Var.A0 = max;
                float min = Math.min(max * 2.0f, 1.0f);
                float min2 = Math.min(Math.max(n60Var.A0 - 0.45f, 0.0f) * 2.0f, 1.0f);
                n60Var.f35752z0.f38043b.setAlpha(AndroidUtilities.lerp(1.0f, 0.0f, min));
                n60Var.f35752z0.f38045f.setAlpha(AndroidUtilities.lerp(1.0f, 0.0f, min));
                n60Var.f35752z0.f38044c.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, min2));
                if (n60Var.A0 >= 1.0f) {
                    n60Var.f35752z0.setTranslationY(top - f7);
                    return;
                } else {
                    n60Var.f35752z0.setTranslationY(0.0f);
                    return;
                }
            case 13:
                z60 z60Var = (z60) obj;
                int L0 = z60Var.f40386r.L0();
                View childAt = z60Var.f40381n.getChildAt(0);
                if (childAt != null) {
                    i12 = childAt.getTop();
                } else {
                    i12 = 0;
                }
                z60Var.e.b((L0 != 0 || i12 < z60Var.f40381n.getPaddingTop()) ? true : true, true);
                if (Build.VERSION.SDK_INT >= 31 && (hVar = z60Var.f40384p0) != null) {
                    hVar.f(i10, i11);
                    z60Var.e0();
                    return;
                }
                return;
            case 16:
                g80 g80Var = (g80) obj;
                g80Var.f33852n.L0();
                View childAt2 = g80Var.h.getChildAt(0);
                if (childAt2 != null) {
                    childAt2.getTop();
                }
                if (Build.VERSION.SDK_INT >= 31 && (hVar2 = g80Var.L) != null) {
                    hVar2.f(i10, i11);
                    g80Var.Y();
                    return;
                }
                return;
            case 19:
                ((vi0) obj).K.invalidate();
                return;
            case 20:
                dj0 dj0Var = (dj0) obj;
                int L02 = dj0Var.h.L0();
                if (L02 != -1) {
                    i14 = Math.abs(dj0Var.h.N0() - L02) + 1;
                }
                int h = recyclerView.getAdapter().h();
                if (i14 > 0 && !dj0Var.V && !dj0Var.E && !dj0Var.f33144x.isEmpty() && L02 + i14 >= h - 5 && dj0Var.f33145y) {
                    dj0Var.b0();
                    return;
                }
                return;
            case 22:
                return;
            case 23:
                rv0 rv0Var = (rv0) obj;
                if (i11 != 0 && (k40Var = rv0Var.h) != null) {
                    k40Var.b(true);
                }
                org.telegram.ui.Components.yy0 yy0Var = rv0Var.Q;
                if (yy0Var != null && yy0Var.f30737s) {
                    org.telegram.ui.Components.wy0 delegate = yy0Var.getDelegate();
                    if (delegate instanceof org.telegram.ui.Cells.d6) {
                        wb1 wb1Var = rv0Var.f37499c;
                        View F = wb1Var.F((org.telegram.ui.Cells.d6) delegate);
                        if (F == null) {
                            T = null;
                        } else {
                            T = wb1Var.T(F);
                        }
                        if (T != null) {
                            View view = T.f42959a;
                            if (rv0Var.Q.getDirection() == 0) {
                                rv0Var.Q.setTranslationY((view.getY() - AndroidUtilities.dp(166.0f)) + view.getMeasuredHeight());
                            } else {
                                rv0Var.Q.setTranslationY(view.getY());
                            }
                            s4.c0 c0Var = rv0Var.d;
                            if (!c0Var.f43053c.H(view) || !c0Var.d.H(view)) {
                                rv0Var.Q.f();
                                return;
                            }
                            return;
                        }
                        rv0Var.Q.f();
                        return;
                    }
                    rv0Var.Q.f();
                    return;
                }
                return;
            case 24:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) obj;
                premiumPreviewFragment.f31446d0.invalidate();
                if (Build.VERSION.SDK_INT >= 31 && (hVar3 = premiumPreviewFragment.f31466u0) != null) {
                    hVar3.f(i10, i11);
                    premiumPreviewFragment.j0();
                    return;
                }
                return;
            case 25:
                yx0 yx0Var = (yx0) obj;
                if (!yx0Var.getMessagesController().blockedEndReached) {
                    int abs = Math.abs(yx0Var.f40268b.N0() - yx0Var.f40268b.L0()) + 1;
                    int h10 = recyclerView.getAdapter().h();
                    if (abs > 0 && yx0Var.f40268b.N0() >= h10 - 10) {
                        yx0Var.getMessagesController().getBlockedPeers(false);
                        return;
                    }
                    return;
                }
                return;
            case 26:
                s31 s31Var = (s31) obj;
                s31Var.e.invalidate();
                t31.t(s31Var.v).invalidate();
                return;
            case 28:
                z81 z81Var = (z81) obj;
                z81Var.o0(false, true);
                if (z81Var.f40411c.K1) {
                    AndroidUtilities.hideKeyboard(z81Var.fragmentView);
                }
                if (Build.VERSION.SDK_INT >= 31 && (hVar4 = z81Var.V) != null) {
                    hVar4.f(i10, i11);
                    z81Var.i0();
                    return;
                }
                return;
            case 29:
                od1 od1Var = (od1) obj;
                od1Var.f36205u0.f1();
                od1Var.f36198r0 = true;
                return;
        }
    }

    public i3(ub ubVar) {
        this.f34356a = 4;
        this.f34357b = ubVar;
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
