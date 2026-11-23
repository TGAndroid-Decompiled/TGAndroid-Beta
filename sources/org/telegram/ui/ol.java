package org.telegram.ui;

import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class ol extends org.telegram.ui.ActionBar.i1 {
    public final pl f50619x;

    public ol(pl plVar, pl plVar2) {
        super(plVar2);
        this.f50619x = plVar;
    }

    @Override
    public final boolean b() {
        boolean z10;
        boolean z11;
        boolean z12;
        bn bnVar = this.f50619x.f50912x0;
        org.telegram.ui.ActionBar.r4 parentLayout = bnVar.getParentLayout();
        if (!bnVar.mb) {
            z10 = ((org.telegram.ui.ActionBar.g2) bnVar).inPreviewMode;
            if (!z10) {
                z11 = ((org.telegram.ui.ActionBar.g2) bnVar).inBubbleMode;
                if (!z11 && !org.telegram.messenger.g0.E && parentLayout != null && bnVar.Ma <= 0 && System.currentTimeMillis() - bnVar.f45975ba >= 250) {
                    if ((bnVar != parentLayout.getLastFragment() || !((ActionBarLayout) parentLayout).B()) && !((ActionBarLayout) parentLayout).f28739n) {
                        z12 = ((org.telegram.ui.ActionBar.g2) bnVar).isPaused;
                        if (!z12 && bnVar.f46026f6) {
                            fi.n2 n2Var = bnVar.Y1;
                            if (n2Var == null || !n2Var.isShowing()) {
                                rj rjVar = bnVar.f45950a0;
                                if (rjVar == null || rjVar.getTrendingStickersAlert() == null || !bnVar.f45950a0.getTrendingStickersAlert().isShowing()) {
                                    return true;
                                }
                                return false;
                            }
                            return false;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void e(float f10, float f11, boolean z10) {
        org.telegram.ui.ActionBar.k kVar;
        int i7;
        hi.l3 l3Var;
        pl plVar = this.f50619x;
        bn bnVar = plVar.f50912x0;
        if (bnVar.getParentLayout() == null || !((ActionBarLayout) bnVar.getParentLayout()).f28739n) {
            bnVar.T9 = f10;
            bnVar.U9 = f11;
            fi.n2 n2Var = bnVar.Y1;
            if (n2Var == null || !n2Var.isShowing()) {
                kVar = ((org.telegram.ui.ActionBar.g2) bnVar).actionBar;
                kVar.setTranslationY(f10);
                ik ikVar = bnVar.Bb;
                if (ikVar != null) {
                    float f12 = bnVar.T9;
                    bk bkVar = bnVar.D1;
                    if (bkVar != null) {
                        i7 = bkVar.getCurrentHeight();
                    } else {
                        i7 = 0;
                    }
                    ikVar.setTranslationY(f12 + i7);
                }
                hi.l3 l3Var2 = bnVar.L1;
                if (l3Var2 != null) {
                    l3Var2.setTranslationY(f10);
                }
                hi.l3 l3Var3 = bnVar.K1;
                if (l3Var3 != null) {
                    l3Var3.setTranslationY(f10);
                }
                FrameLayout frameLayout = bnVar.f46021f1;
                if (frameLayout != null) {
                    frameLayout.setTranslationY(f10 / 2.0f);
                }
                bnVar.R.setTranslationY(f10 / 2.0f);
                int i10 = (int) f10;
                bnVar.f46111m1.setBackgroundTranslation(i10);
                org.telegram.ui.Components.h50 h50Var = bnVar.f46162q3;
                if (h50Var != null) {
                    h50Var.g(f10);
                }
                hi.l5 l5Var = bnVar.N2;
                if (l5Var != null) {
                    org.telegram.ui.Components.aa aaVar = (org.telegram.ui.Components.aa) l5Var.f15005b;
                    aaVar.f33462u = f10;
                    aaVar.d.invalidate();
                }
                bnVar.setFragmentPanTranslationOffset(i10);
                bnVar.M9();
                bnVar.O9();
            } else {
                plVar.setNonNoveTranslation(f10);
            }
            bnVar.A0.invalidate();
            org.telegram.ui.Components.gc gcVar = org.telegram.ui.Components.gc.f35519w;
            if (gcVar != null && bnVar.Ec != null) {
                gcVar.l();
            }
            if (org.telegram.messenger.g0.Q1() && (bnVar.getParentActivity() instanceof LaunchActivity)) {
                org.telegram.ui.ActionBar.g2 lastFragment = ((LaunchActivity) bnVar.getParentActivity()).M().getLastFragment();
                if (lastFragment instanceof cx) {
                    cx cxVar = (cx) lastFragment;
                    cxVar.f46813x1 = f10;
                    cxVar.s5();
                }
            }
            hi.l3 l3Var4 = bnVar.H2;
            if (l3Var4 != null && l3Var4.W) {
                l3Var4.z(bnVar.f45950a0.getAudioVideoButtonContainer(), false);
            }
            mj mjVar = bnVar.f46112m2;
            if (mjVar != null && (l3Var = mjVar.C0) != null) {
                l3Var.A();
            }
        }
    }

    @Override
    public final void f() {
        org.telegram.ui.Components.dd ddVar;
        bn bnVar = this.f50619x.f50912x0;
        rj rjVar = bnVar.f45950a0;
        if (rjVar != null && (ddVar = rjVar.f32733v0) != null) {
            ddVar.run();
            rjVar.f32733v0 = null;
        }
        hi.l3 l3Var = bnVar.H2;
        if (l3Var != null && l3Var.W) {
            l3Var.z(bnVar.f45950a0.getAudioVideoButtonContainer(), false);
        }
    }

    @Override
    public final void g(int i7, boolean z10) {
        org.telegram.ui.Components.td tdVar;
        bn bnVar = this.f50619x.f50912x0;
        bnVar.R4 = true;
        rj rjVar = bnVar.f45950a0;
        if (rjVar != null) {
            if (z10 && (tdVar = rjVar.W) != null) {
                org.telegram.messenger.g0.r(tdVar);
                rjVar.W.run();
            }
            eh ehVar = rjVar.f32571a0;
            if (ehVar != null) {
                org.telegram.messenger.g0.r(ehVar);
                rjVar.f32571a0.run();
            }
        }
        hi.l3 l3Var = bnVar.f46212u2;
        if (l3Var != null) {
            l3Var.f(false);
        }
        hi.l3 l3Var2 = bnVar.P1;
        if (l3Var2 != null) {
            l3Var2.f(true);
        }
    }

    @Override
    public final int i() {
        pl plVar = this.f50619x;
        bn bnVar = plVar.f50912x0;
        if (plVar.getKeyboardHeight() <= org.telegram.messenger.g0.L(20.0f) && bnVar.f45950a0.S0()) {
            return bnVar.f45950a0.getEmojiPadding();
        }
        return 0;
    }
}
