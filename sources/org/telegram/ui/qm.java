package org.telegram.ui;

import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class qm extends org.telegram.ui.ActionBar.p1 {
    public final rm f36957x;

    public qm(rm rmVar, rm rmVar2) {
        super(rmVar2);
        this.f36957x = rmVar;
    }

    @Override
    public final boolean b() {
        boolean z10;
        boolean z11;
        boolean z12;
        zn znVar = this.f36957x.J0;
        org.telegram.ui.ActionBar.d5 parentLayout = znVar.getParentLayout();
        if (!znVar.Oa) {
            z10 = ((org.telegram.ui.ActionBar.n2) znVar).inPreviewMode;
            if (!z10) {
                z11 = ((org.telegram.ui.ActionBar.n2) znVar).inBubbleMode;
                if (!z11 && !AndroidUtilities.isInMultiwindow && parentLayout != null && znVar.f40457pa <= 0 && System.currentTimeMillis() - znVar.E9 >= 250) {
                    if ((znVar != parentLayout.getLastFragment() || !((ActionBarLayout) parentLayout).B()) && !((ActionBarLayout) parentLayout).f18638n) {
                        z12 = ((org.telegram.ui.ActionBar.n2) znVar).isPaused;
                        if (!z12 && znVar.N5) {
                            ai.g4 g4Var = znVar.J1;
                            if (g4Var == null || !g4Var.isShowing()) {
                                mk mkVar = znVar.Y;
                                if (mkVar == null || mkVar.getTrendingStickersAlert() == null || !znVar.Y.getTrendingStickersAlert().isShowing()) {
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
        ij ijVar;
        rm rmVar = this.f36957x;
        zn znVar = rmVar.J0;
        if (znVar.getParentLayout() == null || !((ActionBarLayout) znVar.getParentLayout()).f18638n) {
            znVar.f40547w9 = f7;
            znVar.f40560x9 = f10;
            ai.g4 g4Var = znVar.J1;
            if (g4Var == null || !g4Var.isShowing()) {
                kVar = ((org.telegram.ui.ActionBar.n2) znVar).actionBar;
                kVar.setTranslationY(f7);
                cl clVar = znVar.f40273ab;
                if (clVar != null) {
                    float f11 = znVar.f40547w9;
                    yk ykVar = znVar.f40437o1;
                    if (ykVar != null) {
                        i10 = ykVar.getCurrentHeight();
                    } else {
                        i10 = 0;
                    }
                    clVar.setTranslationY(f11 + i10);
                }
                ci.f4 f4Var = znVar.f40539w1;
                if (f4Var != null) {
                    f4Var.setTranslationY(f7);
                }
                ci.f4 f4Var2 = znVar.f40526v1;
                if (f4Var2 != null) {
                    f4Var2.setTranslationY(f7);
                }
                FrameLayout frameLayout = znVar.Q0;
                if (frameLayout != null) {
                    frameLayout.setTranslationY(f7 / 2.0f);
                }
                znVar.P.setTranslationY(f7 / 2.0f);
                int i11 = (int) f7;
                znVar.X0.setBackgroundTranslation(i11);
                org.telegram.ui.Components.h60 h60Var = znVar.f40279b3;
                if (h60Var != null) {
                    h60Var.e(f7);
                }
                ci.s6 s6Var = znVar.f40566y2;
                if (s6Var != null) {
                    org.telegram.ui.Components.ea eaVar = (org.telegram.ui.Components.ea) s6Var.f5515b;
                    eaVar.f23908u = f7;
                    eaVar.d.invalidate();
                }
                znVar.setFragmentPanTranslationOffset(i11);
                znVar.o9();
                znVar.r9();
            } else {
                rmVar.setNonNoveTranslation(f7);
            }
            znVar.f40551x0.invalidate();
            org.telegram.ui.Components.pc pcVar = org.telegram.ui.Components.pc.f27304w;
            if (pcVar != null && znVar.Yb != null) {
                pcVar.l();
            }
            if (AndroidUtilities.isTablet() && (znVar.getParentActivity() instanceof LaunchActivity)) {
                org.telegram.ui.ActionBar.n2 lastFragment = ((LaunchActivity) znVar.getParentActivity()).O().getLastFragment();
                if (lastFragment instanceof uy) {
                    uy uyVar = (uy) lastFragment;
                    uyVar.f38363v1 = f7;
                    uyVar.X4();
                }
            }
            org.telegram.ui.Components.i40 i40Var = znVar.f40489s2;
            if (i40Var != null && i40Var.getVisibility() == 0) {
                znVar.f40489s2.f(znVar.Y.getAudioVideoButtonContainer(), false);
            }
            hk hkVar = znVar.X1;
            if (hkVar != null && (ijVar = hkVar.A0) != null) {
                ijVar.setExtraTranslationY(AndroidUtilities.dp(72.0f) + f7);
            }
        }
    }

    @Override
    public final void f() {
        org.telegram.ui.Components.ie ieVar;
        zn znVar = this.f36957x.J0;
        mk mkVar = znVar.Y;
        if (mkVar != null && (ieVar = mkVar.f22083u0) != null) {
            ieVar.run();
            mkVar.f22083u0 = null;
        }
        org.telegram.ui.Components.i40 i40Var = znVar.f40489s2;
        if (i40Var != null && i40Var.getVisibility() == 0) {
            znVar.f40489s2.f(znVar.Y.getAudioVideoButtonContainer(), false);
        }
    }

    @Override
    public final void g(int i10, boolean z10) {
        org.telegram.ui.Components.sd sdVar;
        zn znVar = this.f36957x.J0;
        znVar.D4 = true;
        mk mkVar = znVar.Y;
        if (mkVar != null) {
            if (z10 && (sdVar = mkVar.V) != null) {
                AndroidUtilities.cancelRunOnUIThread(sdVar);
                mkVar.V.run();
            }
            org.telegram.ui.Components.tc tcVar = mkVar.W;
            if (tcVar != null) {
                AndroidUtilities.cancelRunOnUIThread(tcVar);
                mkVar.W.run();
            }
        }
        org.telegram.ui.Components.i40 i40Var = znVar.f40329f2;
        if (i40Var != null) {
            i40Var.b(false);
        }
        ci.f4 f4Var = znVar.A1;
        if (f4Var != null) {
            f4Var.e(true);
        }
    }

    @Override
    public final int i() {
        rm rmVar = this.f36957x;
        zn znVar = rmVar.J0;
        if (rmVar.getKeyboardHeight() <= AndroidUtilities.dp(20.0f) && znVar.Y.t0()) {
            return znVar.Y.getEmojiPadding();
        }
        return 0;
    }
}
