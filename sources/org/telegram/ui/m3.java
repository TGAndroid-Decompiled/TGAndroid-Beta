package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

public final class m3 extends f2.b1 {

    public final int f40304a;

    public final Object f40305b;

    public m3(Object obj, int i10) {
        this.f40304a = i10;
        this.f40305b = obj;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        View viewM;
        switch (this.f40304a) {
            case 0:
                if (i10 == 0) {
                    ((q3) this.f40305b).G.K0.W();
                }
                break;
            case 4:
                qb qbVar = (qb) this.f40305b;
                if (i10 == 1) {
                    qbVar.S = true;
                    qbVar.V = true;
                } else if (i10 == 0) {
                    qbVar.S = false;
                    qbVar.V = false;
                    qbVar.T0(true);
                }
                break;
            case 5:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((rn) this.f40305b).T0);
                }
                break;
            case 6:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((dq) this.f40305b).getParentActivity().getCurrentFocus());
                }
                break;
            case 7:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((lr) this.f40305b).getParentActivity().getCurrentFocus());
                }
                break;
            case 8:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((tt) this.f40305b).getParentActivity().getCurrentFocus());
                }
                break;
            case 11:
                a20 a20Var = (a20) this.f40305b;
                if (i10 == 0) {
                    int iDp = AndroidUtilities.dp(16.0f) + ((org.telegram.ui.ActionBar.n2) a20Var).actionBar.getBottom();
                    if (a20Var.v > 0.5f) {
                        a20Var.f36342c.v0(0, a20Var.f36346r - iDp, null);
                        break;
                    } else {
                        View viewM2 = a20Var.f36342c.getLayoutManager() != null ? a20Var.f36342c.getLayoutManager().m(0) : null;
                        if (viewM2 != null && viewM2.getTop() < 0) {
                            a20Var.f36342c.v0(0, viewM2.getTop(), null);
                            break;
                        }
                    }
                }
                break;
            case 12:
                c60 c60Var = (c60) this.f40305b;
                if (i10 == 0) {
                    float f10 = c60Var.f36973w0;
                    if (f10 >= 0.5f && f10 < 1.0f) {
                        int bottom = ((org.telegram.ui.ActionBar.n2) c60Var).actionBar.getBottom();
                        f2.x0 layoutManager = c60Var.I.getLayoutManager();
                        if (layoutManager != null && (viewM = layoutManager.m(0)) != null) {
                            c60Var.I.v0(0, viewM.getBottom() - bottom, null);
                            break;
                        }
                    } else if (f10 < 0.5f) {
                        View viewM3 = c60Var.I.getLayoutManager() != null ? c60Var.I.getLayoutManager().m(0) : null;
                        if (viewM3 != null && viewM3.getTop() < 0) {
                            c60Var.I.v0(0, viewM3.getTop(), null);
                            break;
                        }
                    }
                }
                break;
            case 13:
                o60 o60Var = (o60) this.f40305b;
                if (i10 == 1) {
                    o60Var.f41002f.f31468r.hideActionMode();
                    AndroidUtilities.hideKeyboard(o60Var.f41002f.f31468r);
                }
                break;
            case 14:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((u60) this.f40305b).f43135c);
                }
                break;
            case 15:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((c70) this.f40305b).getParentActivity().getCurrentFocus());
                }
                break;
            case 16:
                t70 t70Var = (t70) this.f40305b;
                if (i10 == 1) {
                    t70Var.d.d.hideActionMode();
                    AndroidUtilities.hideKeyboard(t70Var.d.d);
                }
                break;
            case 17:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((LanguageSelectActivity) this.f40305b).getParentActivity().getCurrentFocus());
                }
                break;
            case 18:
                if (i10 == 1) {
                    tc0 tc0Var = (tc0) this.f40305b;
                    if (tc0Var.f42873n0 && tc0Var.f42874o0) {
                        AndroidUtilities.hideKeyboard(tc0Var.getParentActivity().getCurrentFocus());
                        break;
                    }
                }
                break;
            case 21:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((dj0) this.f40305b).U.getEditText());
                }
                break;
            case 22:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((NotificationsCustomSettingsActivity) this.f40305b).getParentActivity().getCurrentFocus());
                }
                break;
            case 25:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.f40305b;
                if (i10 == 0) {
                    int iDp2 = AndroidUtilities.dp(16.0f) + ((org.telegram.ui.ActionBar.n2) premiumPreviewFragment).actionBar.getBottom();
                    if (premiumPreviewFragment.f35845b0 > 0.5f) {
                        premiumPreviewFragment.f35842a.v0(0, premiumPreviewFragment.Y - iDp2, null);
                        break;
                    } else {
                        View viewM4 = premiumPreviewFragment.f35842a.getLayoutManager() != null ? premiumPreviewFragment.f35842a.getLayoutManager().m(0) : null;
                        if (viewM4 != null && viewM4.getTop() < 0) {
                            premiumPreviewFragment.f35842a.v0(0, viewM4.getTop(), null);
                            break;
                        }
                    }
                }
                break;
            case 28:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((a31) this.f40305b).getParentActivity().getCurrentFocus());
                }
                break;
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i10, int i11) {
        k00 k00Var;
        org.telegram.ui.Cells.b3 b3Var;
        jg.e eVar;
        jg.e eVar2;
        org.telegram.ui.Components.x30 x30Var;
        jg.e eVar3;
        jg.e eVar4;
        int i12 = this.f40304a;
        Object obj = this.f40305b;
        switch (i12) {
            case 0:
                q3 q3Var = (q3) obj;
                if (recyclerView.getChildCount() != 0) {
                    recyclerView.invalidate();
                    q3Var.G.K0.H();
                    m4 m4Var = q3Var.G;
                    z3 z3Var = m4Var.G;
                    if (z3Var != null) {
                        z3Var.f45005c.invalidate();
                    } else {
                        ArticleViewer$WindowView articleViewer$WindowView = m4Var.f40333b0;
                        if (articleViewer$WindowView != null) {
                            articleViewer$WindowView.invalidate();
                        }
                    }
                    q3Var.G.f0();
                    m4 m4Var2 = q3Var.G;
                    z3 z3Var2 = m4Var2.G;
                    if (z3Var2 == null || z3Var2.B) {
                        m4Var2.X(m4Var2.E0 - i11);
                    }
                    break;
                }
                break;
            case 1:
                q qVar = (q) obj;
                if (!qVar.E && !qVar.f41463r && qVar.d.N0() > qVar.A - 2) {
                    qVar.W();
                    break;
                }
                break;
            case 2:
                m4 m4Var3 = (m4) obj;
                if (m4Var3.f40336e0.f43900w.G1) {
                    AndroidUtilities.hideKeyboard(m4Var3.f40335d0.U);
                }
                break;
            case 3:
                ((h8) obj).p0();
                break;
            case 4:
                qb qbVar = (qb) obj;
                qbVar.A.invalidate();
                if (i11 != 0 && qbVar.S && !qbVar.Q && qbVar.M.getTag() == null) {
                    AnimatorSet animatorSet = qbVar.R;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                    }
                    qbVar.M.setTag(1);
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    qbVar.R = animatorSet2;
                    animatorSet2.setDuration(150L);
                    qbVar.R.playTogether(ObjectAnimator.ofFloat(qbVar.M, "alpha", 1.0f));
                    qbVar.R.addListener(new lh.h9(this, 22));
                    qbVar.R.start();
                }
                if (i11 != 0) {
                    qbVar.U0(1);
                }
                qbVar.O0(true);
                qbVar.d1();
                break;
            case 9:
                av avVar = (av) obj;
                org.telegram.ui.Components.la laVar = avVar.f31857s;
                if (laVar != null) {
                    avVar.f31858w = !laVar.Z();
                    laVar.invalidate();
                }
                break;
            case 10:
                q00 q00Var = (q00) obj;
                if (q00Var.f41471a.G1 && (k00Var = q00Var.G) != null && (b3Var = k00Var.f24196b) != null) {
                    if (!b3Var.f32878e) {
                        b3Var.d();
                    } else {
                        b3Var.k(true);
                    }
                    break;
                }
                break;
            case 11:
                ((a20) obj).f36347s.invalidate();
                break;
            case 12:
                c60 c60Var = (c60) obj;
                if (c60Var.f36972v0 == null) {
                    c60Var.f36972v0 = (qc) c60Var.y0(c60Var.V);
                }
                int measuredHeight = c60Var.f36972v0.getMeasuredHeight() - ((org.telegram.ui.ActionBar.n2) c60Var).actionBar.getMeasuredHeight();
                float top = c60Var.f36972v0.getTop() * (-1);
                float f10 = measuredHeight;
                float fMax = Math.max(Math.min(1.0f, top / f10), 0.0f);
                c60Var.f36973w0 = fMax;
                float fMin = Math.min(fMax * 2.0f, 1.0f);
                float fMin2 = Math.min(Math.max(c60Var.f36973w0 - 0.45f, 0.0f) * 2.0f, 1.0f);
                c60Var.f36972v0.f41629b.setAlpha(AndroidUtilities.lerp(1.0f, 0.0f, fMin));
                c60Var.f36972v0.f41632f.setAlpha(AndroidUtilities.lerp(1.0f, 0.0f, fMin));
                c60Var.f36972v0.f41630c.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, fMin2));
                if (c60Var.f36973w0 < 1.0f) {
                    c60Var.f36972v0.setTranslationY(0.0f);
                } else {
                    c60Var.f36972v0.setTranslationY(top - f10);
                }
                break;
            case 13:
                o60 o60Var = (o60) obj;
                int iL0 = o60Var.f41015r.L0();
                View childAt = o60Var.f41010n.getChildAt(0);
                o60Var.f41000e.b(iL0 != 0 || (childAt != null ? childAt.getTop() : 0) < o60Var.f41010n.getPaddingTop(), true);
                if (Build.VERSION.SDK_INT >= 31 && (eVar = o60Var.f41009l0) != null) {
                    eVar.f(i10, i11);
                    o60Var.e0();
                    break;
                }
                break;
            case 16:
                t70 t70Var = (t70) obj;
                t70Var.f42799n.L0();
                View childAt2 = t70Var.h.getChildAt(0);
                if (childAt2 != null) {
                    childAt2.getTop();
                }
                if (Build.VERSION.SDK_INT >= 31 && (eVar2 = t70Var.H) != null) {
                    eVar2.f(i10, i11);
                    t70Var.Y();
                    break;
                }
                break;
            case 19:
                ((ni0) obj).G.invalidate();
                break;
            case 20:
                vi0 vi0Var = (vi0) obj;
                int iL1 = vi0Var.h.L0();
                int iAbs = iL1 != -1 ? Math.abs(vi0Var.h.N0() - iL1) + 1 : 0;
                int iH = recyclerView.getAdapter().h();
                if (iAbs > 0 && !vi0Var.R && !vi0Var.A && !vi0Var.f43477x.isEmpty() && iL1 + iAbs >= iH - 5 && vi0Var.f43478y) {
                    vi0Var.b0();
                    break;
                }
                break;
            case 23:
                vo0.a((vo0) obj);
                break;
            case 24:
                yu0 yu0Var = (yu0) obj;
                if (i11 != 0 && (x30Var = yu0Var.h) != null) {
                    x30Var.b(true);
                }
                org.telegram.ui.Components.wx0 wx0Var = yu0Var.M;
                if (wx0Var != null && wx0Var.f34370s) {
                    org.telegram.ui.Components.ux0 delegate = wx0Var.getDelegate();
                    if (!(delegate instanceof org.telegram.ui.Cells.z5)) {
                        yu0Var.M.f();
                    } else {
                        ta1 ta1Var = yu0Var.f44920c;
                        View viewF = ta1Var.F((org.telegram.ui.Cells.z5) delegate);
                        f2.o1 o1VarT = viewF == null ? null : ta1Var.T(viewF);
                        if (o1VarT == null) {
                            yu0Var.M.f();
                        } else {
                            View view = o1VarT.f5789a;
                            if (yu0Var.M.getDirection() == 0) {
                                yu0Var.M.setTranslationY((view.getY() - AndroidUtilities.dp(166.0f)) + view.getMeasuredHeight());
                            } else {
                                yu0Var.M.setTranslationY(view.getY());
                            }
                            f2.k0 k0Var = yu0Var.d;
                            if (!k0Var.f5854c.I(view) || !k0Var.d.I(view)) {
                                yu0Var.M.f();
                            }
                        }
                    }
                    break;
                }
                break;
            case 25:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) obj;
                premiumPreviewFragment.Z.invalidate();
                if (Build.VERSION.SDK_INT >= 31 && (eVar3 = premiumPreviewFragment.f35863q0) != null) {
                    eVar3.f(i10, i11);
                    premiumPreviewFragment.j0();
                    break;
                }
                break;
            case 26:
                cx0 cx0Var = (cx0) obj;
                if (!cx0Var.getMessagesController().blockedEndReached) {
                    int iAbs2 = Math.abs(cx0Var.f37181b.N0() - cx0Var.f37181b.L0()) + 1;
                    int iH2 = recyclerView.getAdapter().h();
                    if (iAbs2 > 0 && cx0Var.f37181b.N0() >= iH2 - 10) {
                        cx0Var.getMessagesController().getBlockedPeers(false);
                        break;
                    }
                }
                break;
            case 27:
                w21 w21Var = (w21) obj;
                w21Var.f43584e.invalidate();
                ((org.telegram.ui.ActionBar.e3) w21Var.v).containerView.invalidate();
                break;
            case 29:
                x71 x71Var = (x71) obj;
                x71Var.o0(false, true);
                if (x71Var.f44306c.G1) {
                    AndroidUtilities.hideKeyboard(x71Var.fragmentView);
                }
                if (Build.VERSION.SDK_INT >= 31 && (eVar4 = x71Var.R) != null) {
                    eVar4.f(i10, i11);
                    x71Var.i0();
                    break;
                }
                break;
        }
    }

    public m3(qb qbVar) {
        this.f40304a = 4;
        this.f40305b = qbVar;
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
