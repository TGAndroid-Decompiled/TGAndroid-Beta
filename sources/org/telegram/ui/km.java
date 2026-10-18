package org.telegram.ui;

import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class km extends org.telegram.ui.ActionBar.o1 {
    public final lm f38585x;

    public km(lm lmVar, lm lmVar2) {
        super(lmVar2);
        this.f38585x = lmVar;
    }

    @Override
    public final boolean b() {
        boolean z10;
        boolean z11;
        boolean z12;
        sn snVar = this.f38585x.J0;
        org.telegram.ui.ActionBar.d5 parentLayout = snVar.getParentLayout();
        if (!snVar.Pa) {
            z10 = ((org.telegram.ui.ActionBar.n2) snVar).inPreviewMode;
            if (!z10) {
                z11 = ((org.telegram.ui.ActionBar.n2) snVar).inBubbleMode;
                if (!z11 && !AndroidUtilities.isInMultiwindow && parentLayout != null && snVar.f41359pa <= 0 && System.currentTimeMillis() - snVar.E9 >= 250) {
                    if ((snVar != parentLayout.getLastFragment() || !((ActionBarLayout) parentLayout).A()) && !((ActionBarLayout) parentLayout).f20577n) {
                        z12 = ((org.telegram.ui.ActionBar.n2) snVar).isPaused;
                        if (!z12 && snVar.N5) {
                            ci.b3 b3Var = snVar.J1;
                            if (b3Var == null || !b3Var.isShowing()) {
                                hk hkVar = snVar.Y;
                                if (hkVar == null || hkVar.getTrendingStickersAlert() == null || !snVar.Y.getTrendingStickersAlert().isShowing()) {
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
    public final void e(float f7, float f10, boolean z10) {
        org.telegram.ui.ActionBar.k kVar;
        int i10;
        org.telegram.ui.Components.c20 c20Var;
        lm lmVar = this.f38585x;
        sn snVar = lmVar.J0;
        if (snVar.getParentLayout() == null || !((ActionBarLayout) snVar.getParentLayout()).f20577n) {
            snVar.w9 = f7;
            snVar.f41463x9 = f10;
            ci.b3 b3Var = snVar.J1;
            if (b3Var == null || !b3Var.isShowing()) {
                kVar = ((org.telegram.ui.ActionBar.n2) snVar).actionBar;
                kVar.setTranslationY(f7);
                xk xkVar = snVar.f41189bb;
                if (xkVar != null) {
                    float f11 = snVar.w9;
                    sk skVar = snVar.f41341o1;
                    if (skVar != null) {
                        i10 = skVar.getCurrentHeight();
                    } else {
                        i10 = 0;
                    }
                    xkVar.setTranslationY(f11 + i10);
                }
                ei.x3 x3Var = snVar.f41442w1;
                if (x3Var != null) {
                    x3Var.setTranslationY(f7);
                }
                ei.x3 x3Var2 = snVar.f41428v1;
                if (x3Var2 != null) {
                    x3Var2.setTranslationY(f7);
                }
                FrameLayout frameLayout = snVar.Q0;
                if (frameLayout != null) {
                    frameLayout.setTranslationY(f7 / 2.0f);
                }
                snVar.P.setTranslationY(f7 / 2.0f);
                int i11 = (int) f7;
                snVar.X0.setBackgroundTranslation(i11);
                org.telegram.ui.Components.r60 r60Var = snVar.f41181b3;
                if (r60Var != null) {
                    r60Var.e(f7);
                }
                ei.g6 g6Var = snVar.f41470y2;
                if (g6Var != null) {
                    org.telegram.ui.Components.fa faVar = (org.telegram.ui.Components.fa) g6Var.f9072b;
                    faVar.f26207u = f7;
                    faVar.d.invalidate();
                }
                snVar.setFragmentPanTranslationOffset(i11);
                snVar.t9();
                snVar.w9();
            } else {
                lmVar.setNonNoveTranslation(f7);
            }
            snVar.f41454x0.invalidate();
            org.telegram.ui.Components.qc qcVar = org.telegram.ui.Components.qc.f29638w;
            if (qcVar != null && snVar.Zb != null) {
                qcVar.l();
            }
            if (AndroidUtilities.isTablet() && (snVar.getParentActivity() instanceof LaunchActivity)) {
                org.telegram.ui.ActionBar.n2 lastFragment = ((LaunchActivity) snVar.getParentActivity()).O().getLastFragment();
                if (lastFragment instanceof ey) {
                    ey eyVar = (ey) lastFragment;
                    eyVar.f36740v1 = f7;
                    eyVar.V4();
                }
            }
            org.telegram.ui.Components.r40 r40Var = snVar.f41391s2;
            if (r40Var != null && r40Var.getVisibility() == 0) {
                snVar.f41391s2.f(snVar.Y.getAudioVideoButtonContainer(), false);
            }
            bk bkVar = snVar.X1;
            if (bkVar != null && (c20Var = bkVar.B0) != null) {
                c20Var.setExtraTranslationY(AndroidUtilities.dp(72.0f) + f7);
            }
        }
    }

    @Override
    public final void f() {
        org.telegram.ui.Components.ie ieVar;
        sn snVar = this.f38585x.J0;
        hk hkVar = snVar.Y;
        if (hkVar != null && (ieVar = hkVar.f24028u0) != null) {
            ieVar.run();
            hkVar.f24028u0 = null;
        }
        org.telegram.ui.Components.r40 r40Var = snVar.f41391s2;
        if (r40Var != null && r40Var.getVisibility() == 0) {
            snVar.f41391s2.f(snVar.Y.getAudioVideoButtonContainer(), false);
        }
    }

    @Override
    public final void g(int i10, boolean z10) {
        org.telegram.ui.Components.rd rdVar;
        sn snVar = this.f38585x.J0;
        snVar.D4 = true;
        hk hkVar = snVar.Y;
        if (hkVar != null) {
            if (z10 && (rdVar = hkVar.V) != null) {
                AndroidUtilities.cancelRunOnUIThread(rdVar);
                hkVar.V.run();
            }
            org.telegram.ui.Components.ee eeVar = hkVar.W;
            if (eeVar != null) {
                AndroidUtilities.cancelRunOnUIThread(eeVar);
                hkVar.W.run();
            }
        }
        org.telegram.ui.Components.r40 r40Var = snVar.f41232f2;
        if (r40Var != null) {
            r40Var.b(false);
        }
        ei.x3 x3Var = snVar.A1;
        if (x3Var != null) {
            x3Var.e(true);
        }
    }

    @Override
    public final int i() {
        lm lmVar = this.f38585x;
        sn snVar = lmVar.J0;
        if (lmVar.getKeyboardHeight() <= AndroidUtilities.dp(20.0f) && snVar.Y.r0()) {
            return snVar.Y.getEmojiPadding();
        }
        return 0;
    }
}
