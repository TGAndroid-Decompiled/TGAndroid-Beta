package org.telegram.ui;

import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class jm extends org.telegram.ui.ActionBar.q1 {
    public final km f39589x;

    public jm(km kmVar, km kmVar2) {
        super(kmVar2);
        this.f39589x = kmVar;
    }

    @Override
    public final boolean b() {
        boolean z10;
        boolean z11;
        boolean z12;
        tn tnVar = this.f39589x.F0;
        org.telegram.ui.ActionBar.b5 parentLayout = tnVar.getParentLayout();
        if (!tnVar.Ka) {
            z10 = ((org.telegram.ui.ActionBar.o2) tnVar).inPreviewMode;
            if (!z10) {
                z11 = ((org.telegram.ui.ActionBar.o2) tnVar).inBubbleMode;
                if (!z11 && !AndroidUtilities.isInMultiwindow && parentLayout != null && tnVar.f42885la <= 0 && System.currentTimeMillis() - tnVar.A9 >= 250) {
                    if ((tnVar != parentLayout.getLastFragment() || !((ActionBarLayout) parentLayout).A()) && !((ActionBarLayout) parentLayout).f22684n) {
                        z12 = ((org.telegram.ui.ActionBar.o2) tnVar).isPaused;
                        if (!z12 && tnVar.J5) {
                            lh.s2 s2Var = tnVar.F1;
                            if (s2Var == null || !s2Var.isShowing()) {
                                dk dkVar = tnVar.U;
                                if (dkVar == null || dkVar.getTrendingStickersAlert() == null || !tnVar.U.getTrendingStickersAlert().isShowing()) {
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
    public final void e(float f9, float f10, boolean z10) {
        org.telegram.ui.ActionBar.l lVar;
        int i10;
        zi ziVar;
        km kmVar = this.f39589x;
        tn tnVar = kmVar.F0;
        if (tnVar.getParentLayout() == null || !((ActionBarLayout) tnVar.getParentLayout()).f22684n) {
            tnVar.f42969s9 = f9;
            tnVar.f42982t9 = f10;
            lh.s2 s2Var = tnVar.F1;
            if (s2Var == null || !s2Var.isShowing()) {
                lVar = ((org.telegram.ui.ActionBar.o2) tnVar).actionBar;
                lVar.setTranslationY(f9);
                uk ukVar = tnVar.Xa;
                if (ukVar != null) {
                    float f11 = tnVar.f42969s9;
                    pk pkVar = tnVar.f42865k1;
                    if (pkVar != null) {
                        i10 = pkVar.getCurrentHeight();
                    } else {
                        i10 = 0;
                    }
                    ukVar.setTranslationY(f11 + i10);
                }
                nh.t3 t3Var = tnVar.f42961s1;
                if (t3Var != null) {
                    t3Var.setTranslationY(f9);
                }
                nh.t3 t3Var2 = tnVar.f42949r1;
                if (t3Var2 != null) {
                    t3Var2.setTranslationY(f9);
                }
                org.telegram.ui.Components.m21 m21Var = tnVar.N1;
                if (m21Var != null) {
                    m21Var.setTranslationY(f9);
                }
                FrameLayout frameLayout = tnVar.M0;
                if (frameLayout != null) {
                    frameLayout.setTranslationY(f9 / 2.0f);
                }
                float f12 = f9 / 2.0f;
                tnVar.L.setTranslationY(f12);
                int i11 = (int) f9;
                tnVar.T0.setBackgroundTranslation(i11);
                xk xkVar = tnVar.X2;
                if (xkVar != null) {
                    xkVar.f32513p0 = f12;
                    xkVar.s();
                }
                cg.i0 i0Var = tnVar.f42988u2;
                if (i0Var != null) {
                    org.telegram.ui.Components.ca caVar = (org.telegram.ui.Components.ca) i0Var.f3157b;
                    caVar.f27421u = f9;
                    caVar.d.invalidate();
                }
                tnVar.setFragmentPanTranslationOffset(i11);
                tnVar.o9();
                tnVar.r9();
            } else {
                kmVar.setNonNoveTranslation(f9);
            }
            tnVar.f42973t0.invalidate();
            org.telegram.ui.Components.mc mcVar = org.telegram.ui.Components.mc.f30644w;
            if (mcVar != null && tnVar.Vb != null) {
                mcVar.l();
            }
            if (AndroidUtilities.isTablet() && (tnVar.getParentActivity() instanceof LaunchActivity)) {
                org.telegram.ui.ActionBar.o2 lastFragment = ((LaunchActivity) tnVar.getParentActivity()).O().getLastFragment();
                if (lastFragment instanceof fy) {
                    fy fyVar = (fy) lastFragment;
                    fyVar.f38344r1 = f9;
                    fyVar.X4();
                }
            }
            org.telegram.ui.Components.g40 g40Var = tnVar.f42914o2;
            if (g40Var != null && g40Var.getVisibility() == 0) {
                tnVar.f42914o2.f(tnVar.U.getAudioVideoButtonContainer(), false);
            }
            yj yjVar = tnVar.T1;
            if (yjVar != null && (ziVar = yjVar.f26415w0) != null) {
                ziVar.setExtraTranslationY(AndroidUtilities.dp(72.0f) + f9);
            }
        }
    }

    @Override
    public final void f() {
        org.telegram.ui.Components.be beVar;
        tn tnVar = this.f39589x.F0;
        dk dkVar = tnVar.U;
        if (dkVar != null && (beVar = dkVar.f26176q0) != null) {
            beVar.run();
            dkVar.f26176q0 = null;
        }
        org.telegram.ui.Components.g40 g40Var = tnVar.f42914o2;
        if (g40Var != null && g40Var.getVisibility() == 0) {
            tnVar.f42914o2.f(tnVar.U.getAudioVideoButtonContainer(), false);
        }
    }

    @Override
    public final void g(int i10, boolean z10) {
        org.telegram.ui.Components.ld ldVar;
        tn tnVar = this.f39589x.F0;
        tnVar.f43054z4 = true;
        dk dkVar = tnVar.U;
        if (dkVar != null) {
            if (z10 && (ldVar = dkVar.R) != null) {
                AndroidUtilities.cancelRunOnUIThread(ldVar);
                dkVar.R.run();
            }
            org.telegram.ui.Components.z2 z2Var = dkVar.S;
            if (z2Var != null) {
                AndroidUtilities.cancelRunOnUIThread(z2Var);
                dkVar.S.run();
            }
        }
        org.telegram.ui.Components.g40 g40Var = tnVar.f42752b2;
        if (g40Var != null) {
            g40Var.b(false);
        }
        nh.t3 t3Var = tnVar.f43014w1;
        if (t3Var != null) {
            t3Var.e(true);
        }
    }

    @Override
    public final int i() {
        km kmVar = this.f39589x;
        tn tnVar = kmVar.F0;
        if (kmVar.getKeyboardHeight() <= AndroidUtilities.dp(20.0f) && tnVar.U.t0()) {
            return tnVar.U.getEmojiPadding();
        }
        return 0;
    }
}
