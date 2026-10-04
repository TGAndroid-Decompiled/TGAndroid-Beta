package org.telegram.ui;

import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class pm extends org.telegram.ui.ActionBar.p1 {
    public final qm f39515x;

    public pm(qm qmVar, qm qmVar2) {
        super(qmVar2);
        this.f39515x = qmVar;
    }

    @Override
    public final boolean b() {
        boolean z10;
        boolean z11;
        boolean z12;
        yn ynVar = this.f39515x.M0;
        org.telegram.ui.ActionBar.c5 parentLayout = ynVar.getParentLayout();
        if (!ynVar.Ma) {
            z10 = ((org.telegram.ui.ActionBar.n2) ynVar).inPreviewMode;
            if (!z10) {
                z11 = ((org.telegram.ui.ActionBar.n2) ynVar).inBubbleMode;
                if (!z11 && !AndroidUtilities.isInMultiwindow && parentLayout != null && ynVar.f43436na <= 0 && System.currentTimeMillis() - ynVar.C9 >= 250) {
                    if ((ynVar != parentLayout.getLastFragment() || !((ActionBarLayout) parentLayout).B()) && !((ActionBarLayout) parentLayout).f20336n) {
                        z12 = ((org.telegram.ui.ActionBar.n2) ynVar).isPaused;
                        if (!z12 && ynVar.L5) {
                            ai.g4 g4Var = ynVar.H1;
                            if (g4Var == null || !g4Var.isShowing()) {
                                jk jkVar = ynVar.W;
                                if (jkVar == null || jkVar.getTrendingStickersAlert() == null || !ynVar.W.getTrendingStickersAlert().isShowing()) {
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
        org.telegram.ui.Components.x10 x10Var;
        qm qmVar = this.f39515x;
        yn ynVar = qmVar.M0;
        if (ynVar.getParentLayout() == null || !((ActionBarLayout) ynVar.getParentLayout()).f20336n) {
            ynVar.f43522u9 = f7;
            ynVar.v9 = f10;
            ai.g4 g4Var = ynVar.H1;
            if (g4Var == null || !g4Var.isShowing()) {
                kVar = ((org.telegram.ui.ActionBar.n2) ynVar).actionBar;
                kVar.setTranslationY(f7);
                al alVar = ynVar.Ya;
                if (alVar != null) {
                    float f11 = ynVar.f43522u9;
                    vk vkVar = ynVar.f43413m1;
                    if (vkVar != null) {
                        i10 = vkVar.getCurrentHeight();
                    } else {
                        i10 = 0;
                    }
                    alVar.setTranslationY(f11 + i10);
                }
                ci.e4 e4Var = ynVar.f43514u1;
                if (e4Var != null) {
                    e4Var.setTranslationY(f7);
                }
                ci.e4 e4Var2 = ynVar.f43502t1;
                if (e4Var2 != null) {
                    e4Var2.setTranslationY(f7);
                }
                FrameLayout frameLayout = ynVar.O0;
                if (frameLayout != null) {
                    frameLayout.setTranslationY(f7 / 2.0f);
                }
                ynVar.N.setTranslationY(f7 / 2.0f);
                int i11 = (int) f7;
                ynVar.V0.setBackgroundTranslation(i11);
                org.telegram.ui.Components.k60 k60Var = ynVar.Z2;
                if (k60Var != null) {
                    k60Var.e(f7);
                }
                ci.r6 r6Var = ynVar.f43541w2;
                if (r6Var != null) {
                    org.telegram.ui.Components.ga gaVar = (org.telegram.ui.Components.ga) r6Var.f5867b;
                    gaVar.f26759u = f7;
                    gaVar.d.invalidate();
                }
                ynVar.setFragmentPanTranslationOffset(i11);
                ynVar.o9();
                ynVar.q9();
            } else {
                qmVar.setNonNoveTranslation(f7);
            }
            ynVar.f43526v0.invalidate();
            org.telegram.ui.Components.rc rcVar = org.telegram.ui.Components.rc.f30331w;
            if (rcVar != null && ynVar.Wb != null) {
                rcVar.l();
            }
            if (AndroidUtilities.isTablet() && (ynVar.getParentActivity() instanceof LaunchActivity)) {
                org.telegram.ui.ActionBar.n2 lastFragment = ((LaunchActivity) ynVar.getParentActivity()).O().getLastFragment();
                if (lastFragment instanceof uy) {
                    uy uyVar = (uy) lastFragment;
                    uyVar.f41479v1 = f7;
                    uyVar.g5();
                }
            }
            org.telegram.ui.Components.m40 m40Var = ynVar.f43463q2;
            if (m40Var != null && m40Var.getVisibility() == 0) {
                ynVar.f43463q2.f(ynVar.W.getAudioVideoButtonContainer(), false);
            }
            ek ekVar = ynVar.V1;
            if (ekVar != null && (x10Var = ekVar.A0) != null) {
                x10Var.setExtraTranslationY(AndroidUtilities.dp(72.0f) + f7);
            }
        }
    }

    @Override
    public final void f() {
        org.telegram.ui.Components.ke keVar;
        yn ynVar = this.f39515x.M0;
        jk jkVar = ynVar.W;
        if (jkVar != null && (keVar = jkVar.f23964u0) != null) {
            keVar.run();
            jkVar.f23964u0 = null;
        }
        org.telegram.ui.Components.m40 m40Var = ynVar.f43463q2;
        if (m40Var != null && m40Var.getVisibility() == 0) {
            ynVar.f43463q2.f(ynVar.W.getAudioVideoButtonContainer(), false);
        }
    }

    @Override
    public final void g(int i10, boolean z10) {
        org.telegram.ui.Components.td tdVar;
        yn ynVar = this.f39515x.M0;
        ynVar.B4 = true;
        jk jkVar = ynVar.W;
        if (jkVar != null) {
            if (z10 && (tdVar = jkVar.V) != null) {
                AndroidUtilities.cancelRunOnUIThread(tdVar);
                jkVar.V.run();
            }
            org.telegram.ui.Components.be beVar = jkVar.W;
            if (beVar != null) {
                AndroidUtilities.cancelRunOnUIThread(beVar);
                jkVar.W.run();
            }
        }
        org.telegram.ui.Components.m40 m40Var = ynVar.f43304d2;
        if (m40Var != null) {
            m40Var.b(false);
        }
        ci.e4 e4Var = ynVar.f43566y1;
        if (e4Var != null) {
            e4Var.e(true);
        }
    }

    @Override
    public final int i() {
        qm qmVar = this.f39515x;
        yn ynVar = qmVar.M0;
        if (qmVar.getKeyboardHeight() <= AndroidUtilities.dp(20.0f) && ynVar.W.t0()) {
            return ynVar.W.getEmojiPadding();
        }
        return 0;
    }
}
