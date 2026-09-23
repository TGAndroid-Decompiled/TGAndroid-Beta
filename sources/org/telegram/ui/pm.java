package org.telegram.ui;

import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class pm extends org.telegram.ui.ActionBar.p1 {
    public final qm f36145x;

    public pm(qm qmVar, qm qmVar2) {
        super(qmVar2);
        this.f36145x = qmVar;
    }

    @Override
    public final boolean b() {
        boolean z10;
        boolean z11;
        boolean z12;
        xn xnVar = this.f36145x.J0;
        org.telegram.ui.ActionBar.c5 parentLayout = xnVar.getParentLayout();
        if (!xnVar.Oa) {
            z10 = ((org.telegram.ui.ActionBar.n2) xnVar).inPreviewMode;
            if (!z10) {
                z11 = ((org.telegram.ui.ActionBar.n2) xnVar).inBubbleMode;
                if (!z11 && !AndroidUtilities.isInMultiwindow && parentLayout != null && xnVar.f39502pa <= 0 && System.currentTimeMillis() - xnVar.E9 >= 250) {
                    if ((xnVar != parentLayout.getLastFragment() || !((ActionBarLayout) parentLayout).B()) && !((ActionBarLayout) parentLayout).f18378n) {
                        z12 = ((org.telegram.ui.ActionBar.n2) xnVar).isPaused;
                        if (!z12 && xnVar.N5) {
                            ai.g4 g4Var = xnVar.J1;
                            if (g4Var == null || !g4Var.isShowing()) {
                                jk jkVar = xnVar.Y;
                                if (jkVar == null || jkVar.getTrendingStickersAlert() == null || !xnVar.Y.getTrendingStickersAlert().isShowing()) {
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
        qm qmVar = this.f36145x;
        xn xnVar = qmVar.J0;
        if (xnVar.getParentLayout() == null || !((ActionBarLayout) xnVar.getParentLayout()).f18378n) {
            xnVar.f39592w9 = f7;
            xnVar.f39605x9 = f10;
            ai.g4 g4Var = xnVar.J1;
            if (g4Var == null || !g4Var.isShowing()) {
                kVar = ((org.telegram.ui.ActionBar.n2) xnVar).actionBar;
                kVar.setTranslationY(f7);
                al alVar = xnVar.f39319ab;
                if (alVar != null) {
                    float f11 = xnVar.f39592w9;
                    vk vkVar = xnVar.f39482o1;
                    if (vkVar != null) {
                        i10 = vkVar.getCurrentHeight();
                    } else {
                        i10 = 0;
                    }
                    alVar.setTranslationY(f11 + i10);
                }
                ci.e4 e4Var = xnVar.f39584w1;
                if (e4Var != null) {
                    e4Var.setTranslationY(f7);
                }
                ci.e4 e4Var2 = xnVar.f39571v1;
                if (e4Var2 != null) {
                    e4Var2.setTranslationY(f7);
                }
                FrameLayout frameLayout = xnVar.Q0;
                if (frameLayout != null) {
                    frameLayout.setTranslationY(f7 / 2.0f);
                }
                float f12 = f7 / 2.0f;
                xnVar.P.setTranslationY(f12);
                int i11 = (int) f7;
                xnVar.X0.setBackgroundTranslation(i11);
                dl dlVar = xnVar.f39325b3;
                if (dlVar != null) {
                    dlVar.f29915t0 = f12;
                    dlVar.s();
                }
                ci.r6 r6Var = xnVar.f39611y2;
                if (r6Var != null) {
                    org.telegram.ui.Components.fa faVar = (org.telegram.ui.Components.fa) r6Var.f5457b;
                    faVar.f23925u = f7;
                    faVar.d.invalidate();
                }
                xnVar.setFragmentPanTranslationOffset(i11);
                xnVar.o9();
                xnVar.r9();
            } else {
                qmVar.setNonNoveTranslation(f7);
            }
            xnVar.f39596x0.invalidate();
            org.telegram.ui.Components.qc qcVar = org.telegram.ui.Components.qc.f27299w;
            if (qcVar != null && xnVar.Yb != null) {
                qcVar.l();
            }
            if (AndroidUtilities.isTablet() && (xnVar.getParentActivity() instanceof LaunchActivity)) {
                org.telegram.ui.ActionBar.n2 lastFragment = ((LaunchActivity) xnVar.getParentActivity()).O().getLastFragment();
                if (lastFragment instanceof ry) {
                    ry ryVar = (ry) lastFragment;
                    ryVar.f37064v1 = f7;
                    ryVar.X4();
                }
            }
            org.telegram.ui.Components.j40 j40Var = xnVar.f39534s2;
            if (j40Var != null && j40Var.getVisibility() == 0) {
                xnVar.f39534s2.f(xnVar.Y.getAudioVideoButtonContainer(), false);
            }
            ek ekVar = xnVar.X1;
            if (ekVar != null && (fjVar = ekVar.A0) != null) {
                fjVar.setExtraTranslationY(AndroidUtilities.dp(72.0f) + f7);
            }
        }
    }

    @Override
    public final void f() {
        org.telegram.ui.Components.ie ieVar;
        xn xnVar = this.f36145x.J0;
        jk jkVar = xnVar.Y;
        if (jkVar != null && (ieVar = jkVar.f21817u0) != null) {
            ieVar.run();
            jkVar.f21817u0 = null;
        }
        org.telegram.ui.Components.j40 j40Var = xnVar.f39534s2;
        if (j40Var != null && j40Var.getVisibility() == 0) {
            xnVar.f39534s2.f(xnVar.Y.getAudioVideoButtonContainer(), false);
        }
    }

    @Override
    public final void g(int i10, boolean z10) {
        org.telegram.ui.Components.sd sdVar;
        xn xnVar = this.f36145x.J0;
        xnVar.D4 = true;
        jk jkVar = xnVar.Y;
        if (jkVar != null) {
            if (z10 && (sdVar = jkVar.V) != null) {
                AndroidUtilities.cancelRunOnUIThread(sdVar);
                jkVar.V.run();
            }
            rh rhVar = jkVar.W;
            if (rhVar != null) {
                AndroidUtilities.cancelRunOnUIThread(rhVar);
                jkVar.W.run();
            }
        }
        org.telegram.ui.Components.j40 j40Var = xnVar.f39375f2;
        if (j40Var != null) {
            j40Var.b(false);
        }
        ci.e4 e4Var = xnVar.A1;
        if (e4Var != null) {
            e4Var.e(true);
        }
    }

    @Override
    public final int i() {
        qm qmVar = this.f36145x;
        xn xnVar = qmVar.J0;
        if (qmVar.getKeyboardHeight() <= AndroidUtilities.dp(20.0f) && xnVar.Y.u0()) {
            return xnVar.Y.getEmojiPadding();
        }
        return 0;
    }
}
