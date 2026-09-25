package org.telegram.ui;

import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class om extends org.telegram.ui.ActionBar.o1 {
    public final pm f36269x;

    public om(pm pmVar, pm pmVar2) {
        super(pmVar2);
        this.f36269x = pmVar;
    }

    @Override
    public final boolean b() {
        boolean z10;
        boolean z11;
        boolean z12;
        wn wnVar = this.f36269x.J0;
        org.telegram.ui.ActionBar.b5 parentLayout = wnVar.getParentLayout();
        if (!wnVar.Oa) {
            z10 = ((org.telegram.ui.ActionBar.m2) wnVar).inPreviewMode;
            if (!z10) {
                z11 = ((org.telegram.ui.ActionBar.m2) wnVar).inBubbleMode;
                if (!z11 && !AndroidUtilities.isInMultiwindow && parentLayout != null && wnVar.f39602pa <= 0 && System.currentTimeMillis() - wnVar.E9 >= 250) {
                    if ((wnVar != parentLayout.getLastFragment() || !((ActionBarLayout) parentLayout).B()) && !((ActionBarLayout) parentLayout).f18631n) {
                        z12 = ((org.telegram.ui.ActionBar.m2) wnVar).isPaused;
                        if (!z12 && wnVar.N5) {
                            ai.g4 g4Var = wnVar.J1;
                            if (g4Var == null || !g4Var.isShowing()) {
                                jk jkVar = wnVar.Y;
                                if (jkVar == null || jkVar.getTrendingStickersAlert() == null || !wnVar.Y.getTrendingStickersAlert().isShowing()) {
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
        fj fjVar;
        pm pmVar = this.f36269x;
        wn wnVar = pmVar.J0;
        if (wnVar.getParentLayout() == null || !((ActionBarLayout) wnVar.getParentLayout()).f18631n) {
            wnVar.f39692w9 = f7;
            wnVar.f39705x9 = f10;
            ai.g4 g4Var = wnVar.J1;
            if (g4Var == null || !g4Var.isShowing()) {
                kVar = ((org.telegram.ui.ActionBar.m2) wnVar).actionBar;
                kVar.setTranslationY(f7);
                al alVar = wnVar.f39419ab;
                if (alVar != null) {
                    float f11 = wnVar.f39692w9;
                    vk vkVar = wnVar.f39582o1;
                    if (vkVar != null) {
                        i10 = vkVar.getCurrentHeight();
                    } else {
                        i10 = 0;
                    }
                    alVar.setTranslationY(f11 + i10);
                }
                ci.e4 e4Var = wnVar.f39684w1;
                if (e4Var != null) {
                    e4Var.setTranslationY(f7);
                }
                ci.e4 e4Var2 = wnVar.f39671v1;
                if (e4Var2 != null) {
                    e4Var2.setTranslationY(f7);
                }
                FrameLayout frameLayout = wnVar.Q0;
                if (frameLayout != null) {
                    frameLayout.setTranslationY(f7 / 2.0f);
                }
                wnVar.P.setTranslationY(f7 / 2.0f);
                int i11 = (int) f7;
                wnVar.X0.setBackgroundTranslation(i11);
                org.telegram.ui.Components.h60 h60Var = wnVar.f39425b3;
                if (h60Var != null) {
                    h60Var.e(f7);
                }
                ci.r6 r6Var = wnVar.f39711y2;
                if (r6Var != null) {
                    org.telegram.ui.Components.fa faVar = (org.telegram.ui.Components.fa) r6Var.f5457b;
                    faVar.f24121u = f7;
                    faVar.d.invalidate();
                }
                wnVar.setFragmentPanTranslationOffset(i11);
                wnVar.o9();
                wnVar.r9();
            } else {
                pmVar.setNonNoveTranslation(f7);
            }
            wnVar.f39696x0.invalidate();
            org.telegram.ui.Components.qc qcVar = org.telegram.ui.Components.qc.f27571w;
            if (qcVar != null && wnVar.Yb != null) {
                qcVar.l();
            }
            if (AndroidUtilities.isTablet() && (wnVar.getParentActivity() instanceof LaunchActivity)) {
                org.telegram.ui.ActionBar.m2 lastFragment = ((LaunchActivity) wnVar.getParentActivity()).O().getLastFragment();
                if (lastFragment instanceof qy) {
                    qy qyVar = (qy) lastFragment;
                    qyVar.f37120v1 = f7;
                    qyVar.X4();
                }
            }
            org.telegram.ui.Components.j40 j40Var = wnVar.f39634s2;
            if (j40Var != null && j40Var.getVisibility() == 0) {
                wnVar.f39634s2.f(wnVar.Y.getAudioVideoButtonContainer(), false);
            }
            ek ekVar = wnVar.X1;
            if (ekVar != null && (fjVar = ekVar.A0) != null) {
                fjVar.setExtraTranslationY(AndroidUtilities.dp(72.0f) + f7);
            }
        }
    }

    @Override
    public final void f() {
        org.telegram.ui.Components.je jeVar;
        wn wnVar = this.f36269x.J0;
        jk jkVar = wnVar.Y;
        if (jkVar != null && (jeVar = jkVar.f22069u0) != null) {
            jeVar.run();
            jkVar.f22069u0 = null;
        }
        org.telegram.ui.Components.j40 j40Var = wnVar.f39634s2;
        if (j40Var != null && j40Var.getVisibility() == 0) {
            wnVar.f39634s2.f(wnVar.Y.getAudioVideoButtonContainer(), false);
        }
    }

    @Override
    public final void g(int i10, boolean z10) {
        org.telegram.ui.Components.td tdVar;
        wn wnVar = this.f36269x.J0;
        wnVar.D4 = true;
        jk jkVar = wnVar.Y;
        if (jkVar != null) {
            if (z10 && (tdVar = jkVar.V) != null) {
                AndroidUtilities.cancelRunOnUIThread(tdVar);
                jkVar.V.run();
            }
            org.telegram.ui.Components.kd kdVar = jkVar.W;
            if (kdVar != null) {
                AndroidUtilities.cancelRunOnUIThread(kdVar);
                jkVar.W.run();
            }
        }
        org.telegram.ui.Components.j40 j40Var = wnVar.f39475f2;
        if (j40Var != null) {
            j40Var.b(false);
        }
        ci.e4 e4Var = wnVar.A1;
        if (e4Var != null) {
            e4Var.e(true);
        }
    }

    @Override
    public final int i() {
        pm pmVar = this.f36269x;
        wn wnVar = pmVar.J0;
        if (pmVar.getKeyboardHeight() <= AndroidUtilities.dp(20.0f) && wnVar.Y.t0()) {
            return wnVar.Y.getEmojiPadding();
        }
        return 0;
    }
}
