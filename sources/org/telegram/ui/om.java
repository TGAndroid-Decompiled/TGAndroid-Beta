package org.telegram.ui;

import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class om extends org.telegram.ui.ActionBar.r1 {
    public final pm f36936x;

    public om(pm pmVar, pm pmVar2) {
        super(pmVar2);
        this.f36936x = pmVar;
    }

    @Override
    public final boolean b() {
        boolean z4;
        boolean z10;
        boolean z11;
        xn xnVar = this.f36936x.G0;
        org.telegram.ui.ActionBar.e5 parentLayout = xnVar.getParentLayout();
        if (!xnVar.La) {
            z4 = ((org.telegram.ui.ActionBar.p2) xnVar).inPreviewMode;
            if (!z4) {
                z10 = ((org.telegram.ui.ActionBar.p2) xnVar).inBubbleMode;
                if (!z10 && !AndroidUtilities.isInMultiwindow && parentLayout != null && xnVar.f40104ma <= 0 && System.currentTimeMillis() - xnVar.B9 >= 250) {
                    if ((xnVar != parentLayout.getLastFragment() || !((ActionBarLayout) parentLayout).A()) && !((ActionBarLayout) parentLayout).f19474n) {
                        z11 = ((org.telegram.ui.ActionBar.p2) xnVar).isPaused;
                        if (!z11 && xnVar.K5) {
                            nh.t2 t2Var = xnVar.G1;
                            if (t2Var == null || !t2Var.isShowing()) {
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
        pm pmVar = this.f36936x;
        xn xnVar = pmVar.G0;
        if (xnVar.getParentLayout() == null || !((ActionBarLayout) xnVar.getParentLayout()).f19474n) {
            xnVar.t9 = f10;
            xnVar.f40202u9 = f11;
            nh.t2 t2Var = xnVar.G1;
            if (t2Var == null || !t2Var.isShowing()) {
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
                ph.f3 f3Var = xnVar.f40183t1;
                if (f3Var != null) {
                    f3Var.setTranslationY(f10);
                }
                ph.f3 f3Var2 = xnVar.f40173s1;
                if (f3Var2 != null) {
                    f3Var2.setTranslationY(f10);
                }
                org.telegram.ui.Components.w21 w21Var = xnVar.O1;
                if (w21Var != null) {
                    w21Var.setTranslationY(f10);
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
                    dlVar.f30566q0 = f13;
                    dlVar.s();
                }
                eg.i0 i0Var = xnVar.f40208v2;
                if (i0Var != null) {
                    org.telegram.ui.Components.x9 x9Var = (org.telegram.ui.Components.x9) i0Var.f5301b;
                    x9Var.f30632u = f10;
                    x9Var.d.invalidate();
                }
                xnVar.setFragmentPanTranslationOffset(i11);
                xnVar.o9();
                xnVar.r9();
            } else {
                pmVar.setNonNoveTranslation(f10);
            }
            xnVar.f40193u0.invalidate();
            org.telegram.ui.Components.ic icVar = org.telegram.ui.Components.ic.f25665w;
            if (icVar != null && xnVar.Wb != null) {
                icVar.l();
            }
            if (AndroidUtilities.isTablet() && (xnVar.getParentActivity() instanceof LaunchActivity)) {
                org.telegram.ui.ActionBar.p2 lastFragment = ((LaunchActivity) xnVar.getParentActivity()).O().getLastFragment();
                if (lastFragment instanceof oy) {
                    oy oyVar = (oy) lastFragment;
                    oyVar.f37097s1 = f10;
                    oyVar.X4();
                }
            }
            org.telegram.ui.Components.k40 k40Var = xnVar.f40134p2;
            if (k40Var != null && k40Var.getVisibility() == 0) {
                xnVar.f40134p2.f(xnVar.V.getAudioVideoButtonContainer(), false);
            }
            dk dkVar = xnVar.U1;
            if (dkVar != null && (ejVar = dkVar.f23054x0) != null) {
                ejVar.setExtraTranslationY(AndroidUtilities.dp(72.0f) + f10);
            }
        }
    }

    @Override
    public final void f() {
        org.telegram.ui.Components.yd ydVar;
        xn xnVar = this.f36936x.G0;
        jk jkVar = xnVar.V;
        if (jkVar != null && (ydVar = jkVar.f22826r0) != null) {
            ydVar.run();
            jkVar.f22826r0 = null;
        }
        org.telegram.ui.Components.k40 k40Var = xnVar.f40134p2;
        if (k40Var != null && k40Var.getVisibility() == 0) {
            xnVar.f40134p2.f(xnVar.V.getAudioVideoButtonContainer(), false);
        }
    }

    @Override
    public final void g(int i10, boolean z4) {
        org.telegram.ui.Components.id idVar;
        xn xnVar = this.f36936x.G0;
        xnVar.A4 = true;
        jk jkVar = xnVar.V;
        if (jkVar != null) {
            if (z4 && (idVar = jkVar.S) != null) {
                AndroidUtilities.cancelRunOnUIThread(idVar);
                jkVar.S.run();
            }
            hp hpVar = jkVar.T;
            if (hpVar != null) {
                AndroidUtilities.cancelRunOnUIThread(hpVar);
                jkVar.T.run();
            }
        }
        org.telegram.ui.Components.k40 k40Var = xnVar.f39974c2;
        if (k40Var != null) {
            k40Var.b(false);
        }
        ph.f3 f3Var = xnVar.f40235x1;
        if (f3Var != null) {
            f3Var.e(true);
        }
    }

    @Override
    public final int i() {
        pm pmVar = this.f36936x;
        xn xnVar = pmVar.G0;
        if (pmVar.getKeyboardHeight() <= AndroidUtilities.dp(20.0f) && xnVar.V.t0()) {
            return xnVar.V.getEmojiPadding();
        }
        return 0;
    }
}
