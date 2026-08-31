package org.telegram.ui;

import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class om extends org.telegram.ui.ActionBar.r1 {
    public final pm f39803x;

    public om(pm pmVar, pm pmVar2) {
        super(pmVar2);
        this.f39803x = pmVar;
    }

    @Override
    public final boolean b() {
        boolean z4;
        boolean z10;
        boolean z11;
        xn xnVar = this.f39803x.G0;
        org.telegram.ui.ActionBar.f5 parentLayout = xnVar.getParentLayout();
        if (!xnVar.La) {
            z4 = ((org.telegram.ui.ActionBar.p2) xnVar).inPreviewMode;
            if (!z4) {
                z10 = ((org.telegram.ui.ActionBar.p2) xnVar).inBubbleMode;
                if (!z10 && !AndroidUtilities.isInMultiwindow && parentLayout != null && xnVar.f43273ma <= 0 && System.currentTimeMillis() - xnVar.B9 >= 250) {
                    if ((xnVar != parentLayout.getLastFragment() || !((ActionBarLayout) parentLayout).A()) && !((ActionBarLayout) parentLayout).f21136n) {
                        z11 = ((org.telegram.ui.ActionBar.p2) xnVar).isPaused;
                        if (!z11 && xnVar.K5) {
                            oh.u2 u2Var = xnVar.G1;
                            if (u2Var == null || !u2Var.isShowing()) {
                                jk jkVar = xnVar.V;
                                if (jkVar == null || jkVar.getTrendingStickersAlert() == null || !xnVar.V.getTrendingStickersAlert().isShowing()) {
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
    public final void e(float f10, float f11, boolean z4) {
        org.telegram.ui.ActionBar.k kVar;
        int i10;
        ej ejVar;
        pm pmVar = this.f39803x;
        xn xnVar = pmVar.G0;
        if (xnVar.getParentLayout() == null || !((ActionBarLayout) xnVar.getParentLayout()).f21136n) {
            xnVar.t9 = f10;
            xnVar.f43371u9 = f11;
            oh.u2 u2Var = xnVar.G1;
            if (u2Var == null || !u2Var.isShowing()) {
                kVar = ((org.telegram.ui.ActionBar.p2) xnVar).actionBar;
                kVar.setTranslationY(f10);
                al alVar = xnVar.Ya;
                if (alVar != null) {
                    float f12 = xnVar.t9;
                    vk vkVar = xnVar.l1;
                    if (vkVar != null) {
                        i10 = vkVar.getCurrentHeight();
                    } else {
                        i10 = 0;
                    }
                    alVar.setTranslationY(f12 + i10);
                }
                qh.f3 f3Var = xnVar.f43352t1;
                if (f3Var != null) {
                    f3Var.setTranslationY(f10);
                }
                qh.f3 f3Var2 = xnVar.f43342s1;
                if (f3Var2 != null) {
                    f3Var2.setTranslationY(f10);
                }
                org.telegram.ui.Components.x21 x21Var = xnVar.O1;
                if (x21Var != null) {
                    x21Var.setTranslationY(f10);
                }
                FrameLayout frameLayout = xnVar.N0;
                if (frameLayout != null) {
                    frameLayout.setTranslationY(f10 / 2.0f);
                }
                float f13 = f10 / 2.0f;
                xnVar.M.setTranslationY(f13);
                int i11 = (int) f10;
                xnVar.U0.setBackgroundTranslation(i11);
                dl dlVar = xnVar.Y2;
                if (dlVar != null) {
                    dlVar.f33753q0 = f13;
                    dlVar.s();
                }
                fg.i0 i0Var = xnVar.f43377v2;
                if (i0Var != null) {
                    org.telegram.ui.Components.x9 x9Var = (org.telegram.ui.Components.x9) i0Var.f6336b;
                    x9Var.f32996u = f10;
                    x9Var.d.invalidate();
                }
                xnVar.setFragmentPanTranslationOffset(i11);
                xnVar.o9();
                xnVar.r9();
            } else {
                pmVar.setNonNoveTranslation(f10);
            }
            xnVar.f43362u0.invalidate();
            org.telegram.ui.Components.ic icVar = org.telegram.ui.Components.ic.f27737w;
            if (icVar != null && xnVar.Wb != null) {
                icVar.l();
            }
            if (AndroidUtilities.isTablet() && (xnVar.getParentActivity() instanceof LaunchActivity)) {
                org.telegram.ui.ActionBar.p2 lastFragment = ((LaunchActivity) xnVar.getParentActivity()).O().getLastFragment();
                if (lastFragment instanceof py) {
                    py pyVar = (py) lastFragment;
                    pyVar.f40274s1 = f10;
                    pyVar.X4();
                }
            }
            org.telegram.ui.Components.m40 m40Var = xnVar.f43303p2;
            if (m40Var != null && m40Var.getVisibility() == 0) {
                xnVar.f43303p2.f(xnVar.V.getAudioVideoButtonContainer(), false);
            }
            dk dkVar = xnVar.U1;
            if (dkVar != null && (ejVar = dkVar.f24903x0) != null) {
                ejVar.setExtraTranslationY(AndroidUtilities.dp(72.0f) + f10);
            }
        }
    }

    @Override
    public final void f() {
        org.telegram.ui.Components.yd ydVar;
        xn xnVar = this.f39803x.G0;
        jk jkVar = xnVar.V;
        if (jkVar != null && (ydVar = jkVar.f24666r0) != null) {
            ydVar.run();
            jkVar.f24666r0 = null;
        }
        org.telegram.ui.Components.m40 m40Var = xnVar.f43303p2;
        if (m40Var != null && m40Var.getVisibility() == 0) {
            xnVar.f43303p2.f(xnVar.V.getAudioVideoButtonContainer(), false);
        }
    }

    @Override
    public final void g(int i10, boolean z4) {
        org.telegram.ui.Components.id idVar;
        xn xnVar = this.f39803x.G0;
        xnVar.A4 = true;
        jk jkVar = xnVar.V;
        if (jkVar != null) {
            if (z4 && (idVar = jkVar.S) != null) {
                AndroidUtilities.cancelRunOnUIThread(idVar);
                jkVar.S.run();
            }
            mp mpVar = jkVar.T;
            if (mpVar != null) {
                AndroidUtilities.cancelRunOnUIThread(mpVar);
                jkVar.T.run();
            }
        }
        org.telegram.ui.Components.m40 m40Var = xnVar.f43142c2;
        if (m40Var != null) {
            m40Var.b(false);
        }
        qh.f3 f3Var = xnVar.f43404x1;
        if (f3Var != null) {
            f3Var.e(true);
        }
    }

    @Override
    public final int i() {
        pm pmVar = this.f39803x;
        xn xnVar = pmVar.G0;
        if (pmVar.getKeyboardHeight() <= AndroidUtilities.dp(20.0f) && xnVar.V.t0()) {
            return xnVar.V.getEmojiPadding();
        }
        return 0;
    }
}
