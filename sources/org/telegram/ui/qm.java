package org.telegram.ui;

import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class qm extends org.telegram.ui.ActionBar.r1 {
    public final rm f37442x;

    public qm(rm rmVar, rm rmVar2) {
        super(rmVar2);
        this.f37442x = rmVar;
    }

    @Override
    public final boolean b() {
        boolean z4;
        boolean z10;
        boolean z11;
        zn znVar = this.f37442x.G0;
        org.telegram.ui.ActionBar.e5 parentLayout = znVar.getParentLayout();
        if (!znVar.La) {
            z4 = ((org.telegram.ui.ActionBar.p2) znVar).inPreviewMode;
            if (!z4) {
                z10 = ((org.telegram.ui.ActionBar.p2) znVar).inBubbleMode;
                if (!z10 && !AndroidUtilities.isInMultiwindow && parentLayout != null && znVar.f40670ma <= 0 && System.currentTimeMillis() - znVar.B9 >= 250) {
                    if ((znVar != parentLayout.getLastFragment() || !((ActionBarLayout) parentLayout).A()) && !((ActionBarLayout) parentLayout).f19449n) {
                        z11 = ((org.telegram.ui.ActionBar.p2) znVar).isPaused;
                        if (!z11 && znVar.K5) {
                            nh.t2 t2Var = znVar.G1;
                            if (t2Var == null || !t2Var.isShowing()) {
                                lk lkVar = znVar.V;
                                if (lkVar == null || lkVar.getTrendingStickersAlert() == null || !znVar.V.getTrendingStickersAlert().isShowing()) {
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
        gj gjVar;
        rm rmVar = this.f37442x;
        zn znVar = rmVar.G0;
        if (znVar.getParentLayout() == null || !((ActionBarLayout) znVar.getParentLayout()).f19449n) {
            znVar.t9 = f10;
            znVar.f40768u9 = f11;
            nh.t2 t2Var = znVar.G1;
            if (t2Var == null || !t2Var.isShowing()) {
                kVar = ((org.telegram.ui.ActionBar.p2) znVar).actionBar;
                kVar.setTranslationY(f10);
                cl clVar = znVar.Ya;
                if (clVar != null) {
                    float f12 = znVar.t9;
                    xk xkVar = znVar.l1;
                    if (xkVar != null) {
                        i10 = xkVar.getCurrentHeight();
                    } else {
                        i10 = 0;
                    }
                    clVar.setTranslationY(f12 + i10);
                }
                ph.f3 f3Var = znVar.f40749t1;
                if (f3Var != null) {
                    f3Var.setTranslationY(f10);
                }
                ph.f3 f3Var2 = znVar.f40739s1;
                if (f3Var2 != null) {
                    f3Var2.setTranslationY(f10);
                }
                FrameLayout frameLayout = znVar.N0;
                if (frameLayout != null) {
                    frameLayout.setTranslationY(f10 / 2.0f);
                }
                float f13 = f10 / 2.0f;
                znVar.M.setTranslationY(f13);
                int i11 = (int) f10;
                znVar.U0.setBackgroundTranslation(i11);
                fl flVar = znVar.Y2;
                if (flVar != null) {
                    flVar.f30891q0 = f13;
                    flVar.s();
                }
                eg.i0 i0Var = znVar.f40774v2;
                if (i0Var != null) {
                    org.telegram.ui.Components.x9 x9Var = (org.telegram.ui.Components.x9) i0Var.f5290b;
                    x9Var.f30562u = f10;
                    x9Var.d.invalidate();
                }
                znVar.setFragmentPanTranslationOffset(i11);
                znVar.o9();
                znVar.r9();
            } else {
                rmVar.setNonNoveTranslation(f10);
            }
            znVar.f40759u0.invalidate();
            org.telegram.ui.Components.ic icVar = org.telegram.ui.Components.ic.f25664w;
            if (icVar != null && znVar.Wb != null) {
                icVar.l();
            }
            if (AndroidUtilities.isTablet() && (znVar.getParentActivity() instanceof LaunchActivity)) {
                org.telegram.ui.ActionBar.p2 lastFragment = ((LaunchActivity) znVar.getParentActivity()).O().getLastFragment();
                if (lastFragment instanceof qy) {
                    qy qyVar = (qy) lastFragment;
                    qyVar.f37615s1 = f10;
                    qyVar.X4();
                }
            }
            org.telegram.ui.Components.l40 l40Var = znVar.f40700p2;
            if (l40Var != null && l40Var.getVisibility() == 0) {
                znVar.f40700p2.f(znVar.V.getAudioVideoButtonContainer(), false);
            }
            fk fkVar = znVar.U1;
            if (fkVar != null && (gjVar = fkVar.f23027x0) != null) {
                gjVar.setExtraTranslationY(AndroidUtilities.dp(72.0f) + f10);
            }
        }
    }

    @Override
    public final void f() {
        org.telegram.ui.Components.yd ydVar;
        zn znVar = this.f37442x.G0;
        lk lkVar = znVar.V;
        if (lkVar != null && (ydVar = lkVar.f22799r0) != null) {
            ydVar.run();
            lkVar.f22799r0 = null;
        }
        org.telegram.ui.Components.l40 l40Var = znVar.f40700p2;
        if (l40Var != null && l40Var.getVisibility() == 0) {
            znVar.f40700p2.f(znVar.V.getAudioVideoButtonContainer(), false);
        }
    }

    @Override
    public final void g(int i10, boolean z4) {
        org.telegram.ui.Components.id idVar;
        zn znVar = this.f37442x.G0;
        znVar.A4 = true;
        lk lkVar = znVar.V;
        if (lkVar != null) {
            if (z4 && (idVar = lkVar.S) != null) {
                AndroidUtilities.cancelRunOnUIThread(idVar);
                lkVar.S.run();
            }
            np npVar = lkVar.T;
            if (npVar != null) {
                AndroidUtilities.cancelRunOnUIThread(npVar);
                lkVar.T.run();
            }
        }
        org.telegram.ui.Components.l40 l40Var = znVar.f40540c2;
        if (l40Var != null) {
            l40Var.b(false);
        }
        ph.f3 f3Var = znVar.f40801x1;
        if (f3Var != null) {
            f3Var.e(true);
        }
    }

    @Override
    public final int i() {
        rm rmVar = this.f37442x;
        zn znVar = rmVar.G0;
        if (rmVar.getKeyboardHeight() <= AndroidUtilities.dp(20.0f) && znVar.V.t0()) {
            return znVar.V.getEmojiPadding();
        }
        return 0;
    }
}
