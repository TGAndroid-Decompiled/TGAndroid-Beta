package org.telegram.ui;

import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class hm extends org.telegram.ui.ActionBar.q1 {
    public final im f38830x;

    public hm(im imVar, im imVar2) {
        super(imVar2);
        this.f38830x = imVar;
    }

    @Override
    public final boolean b() {
        boolean z10;
        boolean z11;
        boolean z12;
        qn qnVar = this.f38830x.F0;
        org.telegram.ui.ActionBar.b5 parentLayout = qnVar.getParentLayout();
        if (!qnVar.Ka) {
            z10 = ((org.telegram.ui.ActionBar.o2) qnVar).inPreviewMode;
            if (!z10) {
                z11 = ((org.telegram.ui.ActionBar.o2) qnVar).inBubbleMode;
                if (!z11 && !AndroidUtilities.isInMultiwindow && parentLayout != null && qnVar.f41987la <= 0 && System.currentTimeMillis() - qnVar.A9 >= 250) {
                    if ((qnVar != parentLayout.getLastFragment() || !((ActionBarLayout) parentLayout).B()) && !((ActionBarLayout) parentLayout).f22672n) {
                        z12 = ((org.telegram.ui.ActionBar.o2) qnVar).isPaused;
                        if (!z12 && qnVar.J5) {
                            ih.u2 u2Var = qnVar.F1;
                            if (u2Var == null || !u2Var.isShowing()) {
                                ak akVar = qnVar.U;
                                if (akVar == null || akVar.getTrendingStickersAlert() == null || !qnVar.U.getTrendingStickersAlert().isShowing()) {
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
        int i9;
        wi wiVar;
        im imVar = this.f38830x;
        qn qnVar = imVar.F0;
        if (qnVar.getParentLayout() == null || !((ActionBarLayout) qnVar.getParentLayout()).f22672n) {
            qnVar.f42073s9 = f10;
            qnVar.f42086t9 = f11;
            ih.u2 u2Var = qnVar.F1;
            if (u2Var == null || !u2Var.isShowing()) {
                kVar = ((org.telegram.ui.ActionBar.o2) qnVar).actionBar;
                kVar.setTranslationY(f10);
                rk rkVar = qnVar.Xa;
                if (rkVar != null) {
                    float f12 = qnVar.f42073s9;
                    mk mkVar = qnVar.f41967k1;
                    if (mkVar != null) {
                        i9 = mkVar.getCurrentHeight();
                    } else {
                        i9 = 0;
                    }
                    rkVar.setTranslationY(f12 + i9);
                }
                kh.x3 x3Var = qnVar.f42065s1;
                if (x3Var != null) {
                    x3Var.setTranslationY(f10);
                }
                kh.x3 x3Var2 = qnVar.f42051r1;
                if (x3Var2 != null) {
                    x3Var2.setTranslationY(f10);
                }
                org.telegram.ui.Components.b21 b21Var = qnVar.N1;
                if (b21Var != null) {
                    b21Var.setTranslationY(f10);
                }
                FrameLayout frameLayout = qnVar.M0;
                if (frameLayout != null) {
                    frameLayout.setTranslationY(f10 / 2.0f);
                }
                float f13 = f10 / 2.0f;
                qnVar.L.setTranslationY(f13);
                int i10 = (int) f10;
                qnVar.T0.setBackgroundTranslation(i10);
                uk ukVar = qnVar.X2;
                if (ukVar != null) {
                    ukVar.f28292p0 = f13;
                    ukVar.s();
                }
                kh.h6 h6Var = qnVar.f42092u2;
                if (h6Var != null) {
                    org.telegram.ui.Components.x9 x9Var = (org.telegram.ui.Components.x9) h6Var.f15397b;
                    x9Var.f34620u = f10;
                    x9Var.d.invalidate();
                }
                qnVar.setFragmentPanTranslationOffset(i10);
                qnVar.o9();
                qnVar.r9();
            } else {
                imVar.setNonNoveTranslation(f10);
            }
            qnVar.f42077t0.invalidate();
            org.telegram.ui.Components.gc gcVar = org.telegram.ui.Components.gc.f28729w;
            if (gcVar != null && qnVar.Vb != null) {
                gcVar.l();
            }
            if (AndroidUtilities.isTablet() && (qnVar.getParentActivity() instanceof LaunchActivity)) {
                org.telegram.ui.ActionBar.o2 lastFragment = ((LaunchActivity) qnVar.getParentActivity()).O().getLastFragment();
                if (lastFragment instanceof dy) {
                    dy dyVar = (dy) lastFragment;
                    dyVar.f37717r1 = f10;
                    dyVar.X4();
                }
            }
            org.telegram.ui.Components.s30 s30Var = qnVar.f42017o2;
            if (s30Var != null && s30Var.getVisibility() == 0) {
                qnVar.f42017o2.f(qnVar.U.getAudioVideoButtonContainer(), false);
            }
            vj vjVar = qnVar.T1;
            if (vjVar != null && (wiVar = vjVar.f26404w0) != null) {
                wiVar.setExtraTranslationY(AndroidUtilities.dp(72.0f) + f10);
            }
        }
    }

    @Override
    public final void f() {
        org.telegram.ui.Components.yd ydVar;
        qn qnVar = this.f38830x.F0;
        ak akVar = qnVar.U;
        if (akVar != null && (ydVar = akVar.f26165q0) != null) {
            ydVar.run();
            akVar.f26165q0 = null;
        }
        org.telegram.ui.Components.s30 s30Var = qnVar.f42017o2;
        if (s30Var != null && s30Var.getVisibility() == 0) {
            qnVar.f42017o2.f(qnVar.U.getAudioVideoButtonContainer(), false);
        }
    }

    @Override
    public final void g(int i9, boolean z10) {
        org.telegram.ui.Components.hd hdVar;
        qn qnVar = this.f38830x.F0;
        qnVar.f42157z4 = true;
        ak akVar = qnVar.U;
        if (akVar != null) {
            if (z10 && (hdVar = akVar.R) != null) {
                AndroidUtilities.cancelRunOnUIThread(hdVar);
                akVar.R.run();
            }
            wq wqVar = akVar.S;
            if (wqVar != null) {
                AndroidUtilities.cancelRunOnUIThread(wqVar);
                akVar.S.run();
            }
        }
        org.telegram.ui.Components.s30 s30Var = qnVar.f41854b2;
        if (s30Var != null) {
            s30Var.b(false);
        }
        kh.x3 x3Var = qnVar.f42115w1;
        if (x3Var != null) {
            x3Var.e(true);
        }
    }

    @Override
    public final int i() {
        im imVar = this.f38830x;
        qn qnVar = imVar.F0;
        if (imVar.getKeyboardHeight() <= AndroidUtilities.dp(20.0f) && qnVar.U.s0()) {
            return qnVar.U.getEmojiPadding();
        }
        return 0;
    }
}
