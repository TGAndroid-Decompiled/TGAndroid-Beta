package org.telegram.ui;

import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarLayout;

public final class im extends org.telegram.ui.ActionBar.p1 {

    public final jm f39130x;

    public im(jm jmVar, jm jmVar2) {
        super(jmVar2);
        this.f39130x = jmVar;
    }

    @Override
    public final boolean b() {
        rn rnVar = this.f39130x.F0;
        org.telegram.ui.ActionBar.b5 parentLayout = rnVar.getParentLayout();
        if (rnVar.Ka || ((org.telegram.ui.ActionBar.n2) rnVar).inPreviewMode || ((org.telegram.ui.ActionBar.n2) rnVar).inBubbleMode || AndroidUtilities.isInMultiwindow || parentLayout == null || rnVar.la > 0 || System.currentTimeMillis() - rnVar.A9 < 250) {
            return false;
        }
        if ((rnVar == parentLayout.getLastFragment() && ((ActionBarLayout) parentLayout).A()) || ((ActionBarLayout) parentLayout).f22672n || ((org.telegram.ui.ActionBar.n2) rnVar).isPaused || !rnVar.J5) {
            return false;
        }
        jh.t2 t2Var = rnVar.F1;
        if (t2Var != null && t2Var.isShowing()) {
            return false;
        }
        ck ckVar = rnVar.U;
        return ckVar == null || ckVar.getTrendingStickersAlert() == null || !rnVar.U.getTrendingStickersAlert().isShowing();
    }

    @Override
    public final void e(float f10, float f11, boolean z10) {
        yi yiVar;
        jm jmVar = this.f39130x;
        rn rnVar = jmVar.F0;
        if (rnVar.getParentLayout() == null || !((ActionBarLayout) rnVar.getParentLayout()).f22672n) {
            rnVar.f42209s9 = f10;
            rnVar.f42222t9 = f11;
            jh.t2 t2Var = rnVar.F1;
            if (t2Var == null || !t2Var.isShowing()) {
                ((org.telegram.ui.ActionBar.n2) rnVar).actionBar.setTranslationY(f10);
                tk tkVar = rnVar.Xa;
                if (tkVar != null) {
                    float f12 = rnVar.f42209s9;
                    ok okVar = rnVar.f42104k1;
                    tkVar.setTranslationY(f12 + (okVar != null ? okVar.getCurrentHeight() : 0));
                }
                lh.w3 w3Var = rnVar.f42201s1;
                if (w3Var != null) {
                    w3Var.setTranslationY(f10);
                }
                lh.w3 w3Var2 = rnVar.f42187r1;
                if (w3Var2 != null) {
                    w3Var2.setTranslationY(f10);
                }
                org.telegram.ui.Components.d21 d21Var = rnVar.N1;
                if (d21Var != null) {
                    d21Var.setTranslationY(f10);
                }
                FrameLayout frameLayout = rnVar.M0;
                if (frameLayout != null) {
                    frameLayout.setTranslationY(f10 / 2.0f);
                }
                float f13 = f10 / 2.0f;
                rnVar.L.setTranslationY(f13);
                int i10 = (int) f10;
                rnVar.T0.setBackgroundTranslation(i10);
                wk wkVar = rnVar.X2;
                if (wkVar != null) {
                    wkVar.f29987p0 = f13;
                    wkVar.s();
                }
                ag.t0 t0Var = rnVar.f42228u2;
                if (t0Var != null) {
                    org.telegram.ui.Components.v9 v9Var = (org.telegram.ui.Components.v9) t0Var.f661b;
                    v9Var.f33332u = f10;
                    v9Var.d.invalidate();
                }
                rnVar.setFragmentPanTranslationOffset(i10);
                rnVar.o9();
                rnVar.r9();
            } else {
                jmVar.setNonNoveTranslation(f10);
            }
            rnVar.f42213t0.invalidate();
            org.telegram.ui.Components.ec ecVar = org.telegram.ui.Components.ec.f28012w;
            if (ecVar != null && rnVar.Vb != null) {
                ecVar.l();
            }
            if (AndroidUtilities.isTablet() && (rnVar.getParentActivity() instanceof LaunchActivity)) {
                org.telegram.ui.ActionBar.n2 lastFragment = ((LaunchActivity) rnVar.getParentActivity()).O().getLastFragment();
                if (lastFragment instanceof gy) {
                    gy gyVar = (gy) lastFragment;
                    gyVar.f38586r1 = f10;
                    gyVar.X4();
                }
            }
            org.telegram.ui.Components.x30 x30Var = rnVar.f42153o2;
            if (x30Var != null && x30Var.getVisibility() == 0) {
                rnVar.f42153o2.f(rnVar.U.getAudioVideoButtonContainer(), false);
            }
            xj xjVar = rnVar.T1;
            if (xjVar == null || (yiVar = xjVar.f26400w0) == null) {
                return;
            }
            yiVar.setExtraTranslationY(AndroidUtilities.dp(72.0f) + f10);
        }
    }

    @Override
    public final void f() {
        org.telegram.ui.Components.ud udVar;
        rn rnVar = this.f39130x.F0;
        ck ckVar = rnVar.U;
        if (ckVar != null && (udVar = ckVar.f26161q0) != null) {
            udVar.run();
            ckVar.f26161q0 = null;
        }
        org.telegram.ui.Components.x30 x30Var = rnVar.f42153o2;
        if (x30Var == null || x30Var.getVisibility() != 0) {
            return;
        }
        rnVar.f42153o2.f(rnVar.U.getAudioVideoButtonContainer(), false);
    }

    @Override
    public final void g(int i10, boolean z10) {
        org.telegram.ui.Components.ed edVar;
        rn rnVar = this.f39130x.F0;
        rnVar.f42294z4 = true;
        ck ckVar = rnVar.U;
        if (ckVar != null) {
            if (z10 && (edVar = ckVar.R) != null) {
                AndroidUtilities.cancelRunOnUIThread(edVar);
                ckVar.R.run();
            }
            yq yqVar = ckVar.S;
            if (yqVar != null) {
                AndroidUtilities.cancelRunOnUIThread(yqVar);
                ckVar.S.run();
            }
        }
        org.telegram.ui.Components.x30 x30Var = rnVar.f41989b2;
        if (x30Var != null) {
            x30Var.b(false);
        }
        lh.w3 w3Var = rnVar.f42253w1;
        if (w3Var != null) {
            w3Var.e(true);
        }
    }

    @Override
    public final int i() {
        jm jmVar = this.f39130x;
        rn rnVar = jmVar.F0;
        if (jmVar.getKeyboardHeight() > AndroidUtilities.dp(20.0f) || !rnVar.U.t0()) {
            return 0;
        }
        return rnVar.U.getEmojiPadding();
    }
}
