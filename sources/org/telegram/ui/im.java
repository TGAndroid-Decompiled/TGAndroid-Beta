package org.telegram.ui;

import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class im extends org.telegram.ui.ActionBar.o1 {
    public final jm f38020x;

    public im(jm jmVar, jm jmVar2) {
        super(jmVar2);
        this.f38020x = jmVar;
    }

    @Override
    public final boolean b() {
        boolean z10;
        boolean z11;
        boolean z12;
        qn qnVar = this.f38020x.J0;
        org.telegram.ui.ActionBar.d5 parentLayout = qnVar.getParentLayout();
        if (!qnVar.Pa) {
            z10 = ((org.telegram.ui.ActionBar.n2) qnVar).inPreviewMode;
            if (!z10) {
                z11 = ((org.telegram.ui.ActionBar.n2) qnVar).inBubbleMode;
                if (!z11 && !AndroidUtilities.isInMultiwindow && parentLayout != null && qnVar.f40800pa <= 0 && System.currentTimeMillis() - qnVar.E9 >= 250) {
                    if ((qnVar != parentLayout.getLastFragment() || !((ActionBarLayout) parentLayout).A()) && !((ActionBarLayout) parentLayout).f20571n) {
                        z12 = ((org.telegram.ui.ActionBar.n2) qnVar).isPaused;
                        if (!z12 && qnVar.N5) {
                            ci.b3 b3Var = qnVar.J1;
                            if (b3Var == null || !b3Var.isShowing()) {
                                fk fkVar = qnVar.Y;
                                if (fkVar == null || fkVar.getTrendingStickersAlert() == null || !qnVar.Y.getTrendingStickersAlert().isShowing()) {
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
        jm jmVar = this.f38020x;
        qn qnVar = jmVar.J0;
        if (qnVar.getParentLayout() == null || !((ActionBarLayout) qnVar.getParentLayout()).f20571n) {
            qnVar.w9 = f7;
            qnVar.f40904x9 = f10;
            ci.b3 b3Var = qnVar.J1;
            if (b3Var == null || !b3Var.isShowing()) {
                kVar = ((org.telegram.ui.ActionBar.n2) qnVar).actionBar;
                kVar.setTranslationY(f7);
                vk vkVar = qnVar.f40630bb;
                if (vkVar != null) {
                    float f11 = qnVar.w9;
                    qk qkVar = qnVar.f40782o1;
                    if (qkVar != null) {
                        i10 = qkVar.getCurrentHeight();
                    } else {
                        i10 = 0;
                    }
                    vkVar.setTranslationY(f11 + i10);
                }
                ei.x3 x3Var = qnVar.f40883w1;
                if (x3Var != null) {
                    x3Var.setTranslationY(f7);
                }
                ei.x3 x3Var2 = qnVar.f40869v1;
                if (x3Var2 != null) {
                    x3Var2.setTranslationY(f7);
                }
                FrameLayout frameLayout = qnVar.Q0;
                if (frameLayout != null) {
                    frameLayout.setTranslationY(f7 / 2.0f);
                }
                qnVar.P.setTranslationY(f7 / 2.0f);
                int i11 = (int) f7;
                qnVar.X0.setBackgroundTranslation(i11);
                org.telegram.ui.Components.r60 r60Var = qnVar.f40622b3;
                if (r60Var != null) {
                    r60Var.e(f7);
                }
                ei.g6 g6Var = qnVar.f40911y2;
                if (g6Var != null) {
                    org.telegram.ui.Components.fa faVar = (org.telegram.ui.Components.fa) g6Var.f9069b;
                    faVar.f26185u = f7;
                    faVar.d.invalidate();
                }
                qnVar.setFragmentPanTranslationOffset(i11);
                qnVar.t9();
                qnVar.w9();
            } else {
                jmVar.setNonNoveTranslation(f7);
            }
            qnVar.f40895x0.invalidate();
            org.telegram.ui.Components.qc qcVar = org.telegram.ui.Components.qc.f29587w;
            if (qcVar != null && qnVar.Zb != null) {
                qcVar.l();
            }
            if (AndroidUtilities.isTablet() && (qnVar.getParentActivity() instanceof LaunchActivity)) {
                org.telegram.ui.ActionBar.n2 lastFragment = ((LaunchActivity) qnVar.getParentActivity()).O().getLastFragment();
                if (lastFragment instanceof cy) {
                    cy cyVar = (cy) lastFragment;
                    cyVar.f36172v1 = f7;
                    cyVar.V4();
                }
            }
            org.telegram.ui.Components.r40 r40Var = qnVar.f40832s2;
            if (r40Var != null && r40Var.getVisibility() == 0) {
                qnVar.f40832s2.f(qnVar.Y.getAudioVideoButtonContainer(), false);
            }
            zj zjVar = qnVar.X1;
            if (zjVar != null && (c20Var = zjVar.B0) != null) {
                c20Var.setExtraTranslationY(AndroidUtilities.dp(72.0f) + f7);
            }
        }
    }

    @Override
    public final void f() {
        org.telegram.ui.Components.ie ieVar;
        qn qnVar = this.f38020x.J0;
        fk fkVar = qnVar.Y;
        if (fkVar != null && (ieVar = fkVar.f24022u0) != null) {
            ieVar.run();
            fkVar.f24022u0 = null;
        }
        org.telegram.ui.Components.r40 r40Var = qnVar.f40832s2;
        if (r40Var != null && r40Var.getVisibility() == 0) {
            qnVar.f40832s2.f(qnVar.Y.getAudioVideoButtonContainer(), false);
        }
    }

    @Override
    public final void g(int i10, boolean z10) {
        org.telegram.ui.Components.rd rdVar;
        qn qnVar = this.f38020x.J0;
        qnVar.D4 = true;
        fk fkVar = qnVar.Y;
        if (fkVar != null) {
            if (z10 && (rdVar = fkVar.V) != null) {
                AndroidUtilities.cancelRunOnUIThread(rdVar);
                fkVar.V.run();
            }
            org.telegram.ui.Components.ee eeVar = fkVar.W;
            if (eeVar != null) {
                AndroidUtilities.cancelRunOnUIThread(eeVar);
                fkVar.W.run();
            }
        }
        org.telegram.ui.Components.r40 r40Var = qnVar.f40673f2;
        if (r40Var != null) {
            r40Var.b(false);
        }
        ei.x3 x3Var = qnVar.A1;
        if (x3Var != null) {
            x3Var.e(true);
        }
    }

    @Override
    public final int i() {
        jm jmVar = this.f38020x;
        qn qnVar = jmVar.J0;
        if (jmVar.getKeyboardHeight() <= AndroidUtilities.dp(20.0f) && qnVar.Y.r0()) {
            return qnVar.Y.getEmojiPadding();
        }
        return 0;
    }
}
