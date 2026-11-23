package org.telegram.ui;

import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class ol extends org.telegram.ui.ActionBar.i1 {
    public final pl f50713x;

    public ol(pl plVar, pl plVar2) {
        super(plVar2);
        this.f50713x = plVar;
    }

    @Override
    public final boolean b() {
        boolean z10;
        boolean z11;
        boolean z12;
        bn bnVar = this.f50713x.f51056x0;
        org.telegram.ui.ActionBar.r4 parentLayout = bnVar.getParentLayout();
        if (!bnVar.mb) {
            z10 = ((org.telegram.ui.ActionBar.g2) bnVar).inPreviewMode;
            if (!z10) {
                z11 = ((org.telegram.ui.ActionBar.g2) bnVar).inBubbleMode;
                if (!z11 && !org.telegram.messenger.g0.E && parentLayout != null && bnVar.Ma <= 0 && System.currentTimeMillis() - bnVar.f46143ba >= 250) {
                    if ((bnVar != parentLayout.getLastFragment() || !((ActionBarLayout) parentLayout).B()) && !((ActionBarLayout) parentLayout).f28797n) {
                        z12 = ((org.telegram.ui.ActionBar.g2) bnVar).isPaused;
                        if (!z12 && bnVar.f46194f6) {
                            fi.n2 n2Var = bnVar.Y1;
                            if (n2Var == null || !n2Var.isShowing()) {
                                rj rjVar = bnVar.f46118a0;
                                if (rjVar == null || rjVar.getTrendingStickersAlert() == null || !bnVar.f46118a0.getTrendingStickersAlert().isShowing()) {
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
        hi.u3 u3Var;
        pl plVar = this.f50713x;
        bn bnVar = plVar.f51056x0;
        if (bnVar.getParentLayout() == null || !((ActionBarLayout) bnVar.getParentLayout()).f28797n) {
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
                hi.u3 u3Var2 = bnVar.L1;
                if (u3Var2 != null) {
                    u3Var2.setTranslationY(f10);
                }
                hi.u3 u3Var3 = bnVar.K1;
                if (u3Var3 != null) {
                    u3Var3.setTranslationY(f10);
                }
                FrameLayout frameLayout = bnVar.f46189f1;
                if (frameLayout != null) {
                    frameLayout.setTranslationY(f10 / 2.0f);
                }
                bnVar.R.setTranslationY(f10 / 2.0f);
                int i10 = (int) f10;
                bnVar.f46279m1.setBackgroundTranslation(i10);
                org.telegram.ui.Components.e50 e50Var = bnVar.f46330q3;
                if (e50Var != null) {
                    e50Var.g(f10);
                }
                hi.w5 w5Var = bnVar.N2;
                if (w5Var != null) {
                    org.telegram.ui.Components.z9 z9Var = (org.telegram.ui.Components.z9) w5Var.f15677b;
                    z9Var.f42775u = f10;
                    z9Var.d.invalidate();
                }
                bnVar.setFragmentPanTranslationOffset(i10);
                bnVar.M9();
                bnVar.O9();
            } else {
                plVar.setNonNoveTranslation(f10);
            }
            bnVar.A0.invalidate();
            org.telegram.ui.Components.fc fcVar = org.telegram.ui.Components.fc.f35083w;
            if (fcVar != null && bnVar.Ec != null) {
                fcVar.l();
            }
            if (org.telegram.messenger.g0.Q1() && (bnVar.getParentActivity() instanceof LaunchActivity)) {
                org.telegram.ui.ActionBar.g2 lastFragment = ((LaunchActivity) bnVar.getParentActivity()).M().getLastFragment();
                if (lastFragment instanceof bx) {
                    bx bxVar = (bx) lastFragment;
                    bxVar.f46640x1 = f10;
                    bxVar.s5();
                }
            }
            hi.u3 u3Var4 = bnVar.H2;
            if (u3Var4 != null && u3Var4.W) {
                u3Var4.z(bnVar.f46118a0.getAudioVideoButtonContainer(), false);
            }
            mj mjVar = bnVar.f46280m2;
            if (mjVar != null && (u3Var = mjVar.C0) != null) {
                u3Var.A();
            }
        }
    }

    @Override
    public final void f() {
        org.telegram.ui.Components.dd ddVar;
        bn bnVar = this.f50713x.f51056x0;
        rj rjVar = bnVar.f46118a0;
        if (rjVar != null && (ddVar = rjVar.f32797v0) != null) {
            ddVar.run();
            rjVar.f32797v0 = null;
        }
        hi.u3 u3Var = bnVar.H2;
        if (u3Var != null && u3Var.W) {
            u3Var.z(bnVar.f46118a0.getAudioVideoButtonContainer(), false);
        }
    }

    @Override
    public final void g(int i7, boolean z10) {
        org.telegram.ui.Components.td tdVar;
        bn bnVar = this.f50713x.f51056x0;
        bnVar.R4 = true;
        rj rjVar = bnVar.f46118a0;
        if (rjVar != null) {
            if (z10 && (tdVar = rjVar.W) != null) {
                org.telegram.messenger.g0.r(tdVar);
                rjVar.W.run();
            }
            org.telegram.ui.Components.xd xdVar = rjVar.f32635a0;
            if (xdVar != null) {
                org.telegram.messenger.g0.r(xdVar);
                rjVar.f32635a0.run();
            }
        }
        hi.u3 u3Var = bnVar.f46380u2;
        if (u3Var != null) {
            u3Var.f(false);
        }
        hi.u3 u3Var2 = bnVar.P1;
        if (u3Var2 != null) {
            u3Var2.f(true);
        }
    }

    @Override
    public final int i() {
        pl plVar = this.f50713x;
        bn bnVar = plVar.f51056x0;
        if (plVar.getKeyboardHeight() <= org.telegram.messenger.g0.L(20.0f) && bnVar.f46118a0.T0()) {
            return bnVar.f46118a0.getEmojiPadding();
        }
        return 0;
    }
}
