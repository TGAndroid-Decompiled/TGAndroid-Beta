package org.telegram.ui;

import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class lm extends org.telegram.ui.ActionBar.q1 {
    public final mm f41296x;

    public lm(mm mmVar, mm mmVar2) {
        super(mmVar2);
        this.f41296x = mmVar;
    }

    @Override
    public final boolean b() {
        boolean z10;
        boolean z11;
        boolean z12;
        un unVar = this.f41296x.B0;
        org.telegram.ui.ActionBar.j5 parentLayout = unVar.getParentLayout();
        if (!unVar.f44201bb) {
            z10 = ((org.telegram.ui.ActionBar.r2) unVar).inPreviewMode;
            if (!z10) {
                z11 = ((org.telegram.ui.ActionBar.r2) unVar).inBubbleMode;
                if (!z11 && !AndroidUtilities.isInMultiwindow && parentLayout != null && unVar.Ba <= 0 && System.currentTimeMillis() - unVar.Q9 >= 250) {
                    if ((unVar != parentLayout.getLastFragment() || !((ActionBarLayout) parentLayout).A()) && !((ActionBarLayout) parentLayout).f22329n) {
                        z12 = ((org.telegram.ui.ActionBar.r2) unVar).isPaused;
                        if (!z12 && unVar.Z5) {
                            di.a3 a3Var = unVar.V1;
                            if (a3Var == null || !a3Var.isShowing()) {
                                hk hkVar = unVar.Y;
                                if (hkVar == null || hkVar.getTrendingStickersAlert() == null || !unVar.Y.getTrendingStickersAlert().isShowing()) {
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
        org.telegram.ui.Components.e20 e20Var;
        mm mmVar = this.f41296x;
        un unVar = mmVar.B0;
        if (unVar.getParentLayout() == null || !((ActionBarLayout) unVar.getParentLayout()).f22329n) {
            unVar.I9 = f7;
            unVar.J9 = f10;
            di.a3 a3Var = unVar.V1;
            if (a3Var == null || !a3Var.isShowing()) {
                kVar = ((org.telegram.ui.ActionBar.r2) unVar).actionBar;
                kVar.setTranslationY(f7);
                xk xkVar = unVar.f44465wb;
                if (xkVar != null) {
                    float f11 = unVar.I9;
                    sk skVar = unVar.A1;
                    if (skVar != null) {
                        i10 = skVar.getCurrentHeight();
                    } else {
                        i10 = 0;
                    }
                    xkVar.setTranslationY(f11 + i10);
                }
                fi.v3 v3Var = unVar.I1;
                if (v3Var != null) {
                    v3Var.setTranslationY(f7);
                }
                fi.v3 v3Var2 = unVar.H1;
                if (v3Var2 != null) {
                    v3Var2.setTranslationY(f7);
                }
                FrameLayout frameLayout = unVar.f44205c1;
                if (frameLayout != null) {
                    frameLayout.setTranslationY(f7 / 2.0f);
                }
                unVar.P.setTranslationY(f7 / 2.0f);
                int i11 = (int) f7;
                unVar.f44292j1.setBackgroundTranslation(i11);
                org.telegram.ui.Components.t60 t60Var = unVar.f44343n3;
                if (t60Var != null) {
                    t60Var.e(f7);
                }
                fi.f6 f6Var = unVar.K2;
                if (f6Var != null) {
                    org.telegram.ui.Components.ja jaVar = (org.telegram.ui.Components.ja) f6Var.f10864b;
                    jaVar.f29571u = f7;
                    jaVar.d.invalidate();
                }
                unVar.setFragmentPanTranslationOffset(i11);
                unVar.x9();
                unVar.z9();
            } else {
                mmVar.setNonNoveTranslation(f7);
            }
            unVar.f44468x0.invalidate();
            org.telegram.ui.Components.qc qcVar = org.telegram.ui.Components.qc.f31880x;
            if (qcVar != null && unVar.f44452vc != null) {
                qcVar.l();
            }
            if (AndroidUtilities.isTablet() && (unVar.getParentActivity() instanceof LaunchActivity)) {
                org.telegram.ui.ActionBar.r2 lastFragment = ((LaunchActivity) unVar.getParentActivity()).O().getLastFragment();
                if (lastFragment instanceof cy) {
                    cy cyVar = (cy) lastFragment;
                    cyVar.f38670v1 = f7;
                    cyVar.g5();
                }
            }
            org.telegram.ui.Components.t40 t40Var = unVar.E2;
            if (t40Var != null && t40Var.getVisibility() == 0) {
                unVar.E2.f(unVar.Y.getAudioVideoButtonContainer(), false);
            }
            bk bkVar = unVar.f44293j2;
            if (bkVar != null && (e20Var = bkVar.B0) != null) {
                e20Var.setExtraTranslationY(AndroidUtilities.dp(72.0f) + f7);
            }
        }
    }

    @Override
    public final void f() {
        org.telegram.ui.Components.ie ieVar;
        un unVar = this.f41296x.B0;
        hk hkVar = unVar.Y;
        if (hkVar != null && (ieVar = hkVar.f25961u0) != null) {
            ieVar.run();
            hkVar.f25961u0 = null;
        }
        org.telegram.ui.Components.t40 t40Var = unVar.E2;
        if (t40Var != null && t40Var.getVisibility() == 0) {
            unVar.E2.f(unVar.Y.getAudioVideoButtonContainer(), false);
        }
    }

    @Override
    public final void g(int i10, boolean z10) {
        org.telegram.ui.Components.sd sdVar;
        un unVar = this.f41296x.B0;
        unVar.P4 = true;
        hk hkVar = unVar.Y;
        if (hkVar != null) {
            if (z10 && (sdVar = hkVar.V) != null) {
                AndroidUtilities.cancelRunOnUIThread(sdVar);
                hkVar.V.run();
            }
            ip ipVar = hkVar.W;
            if (ipVar != null) {
                AndroidUtilities.cancelRunOnUIThread(ipVar);
                hkVar.W.run();
            }
        }
        org.telegram.ui.Components.t40 t40Var = unVar.f44391r2;
        if (t40Var != null) {
            t40Var.b(false);
        }
        fi.v3 v3Var = unVar.M1;
        if (v3Var != null) {
            v3Var.e(true);
        }
    }

    @Override
    public final int i() {
        mm mmVar = this.f41296x;
        un unVar = mmVar.B0;
        if (mmVar.getKeyboardHeight() <= AndroidUtilities.dp(20.0f) && unVar.Y.q0()) {
            return unVar.Y.getEmojiPadding();
        }
        return 0;
    }
}
