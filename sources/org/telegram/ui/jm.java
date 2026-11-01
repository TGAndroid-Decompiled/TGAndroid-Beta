package org.telegram.ui;

import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class jm extends org.telegram.ui.ActionBar.m1 {
    public final km f38469x;

    public jm(km kmVar, km kmVar2) {
        super(kmVar2);
        this.f38469x = kmVar;
    }

    @Override
    public final boolean b() {
        boolean z10;
        boolean z11;
        boolean z12;
        un unVar = this.f38469x.f38926w0;
        org.telegram.ui.ActionBar.z4 parentLayout = unVar.getParentLayout();
        if (!unVar.f42100ib) {
            z10 = ((org.telegram.ui.ActionBar.k2) unVar).inPreviewMode;
            if (!z10) {
                z11 = ((org.telegram.ui.ActionBar.k2) unVar).inBubbleMode;
                if (!z11 && !org.telegram.messenger.i0.E && parentLayout != null && unVar.Ia <= 0 && System.currentTimeMillis() - unVar.X9 >= 250) {
                    if ((unVar != parentLayout.getLastFragment() || !((ActionBarLayout) parentLayout).A()) && !((ActionBarLayout) parentLayout).f20098n) {
                        z12 = ((org.telegram.ui.ActionBar.k2) unVar).isPaused;
                        if (!z12 && unVar.f42036d6) {
                            ag.v vVar = unVar.X1;
                            if (vVar == null || !vVar.isShowing()) {
                                mk mkVar = unVar.Z;
                                if (mkVar == null || mkVar.getTrendingStickersAlert() == null || !unVar.Z.getTrendingStickersAlert().isShowing()) {
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
        org.telegram.ui.ActionBar.l lVar;
        int i10;
        org.telegram.ui.Components.z00 z00Var;
        km kmVar = this.f38469x;
        un unVar = kmVar.f38926w0;
        if (unVar.getParentLayout() == null || !((ActionBarLayout) unVar.getParentLayout()).f20098n) {
            unVar.P9 = f7;
            unVar.Q9 = f10;
            ag.v vVar = unVar.X1;
            if (vVar == null || !vVar.isShowing()) {
                lVar = ((org.telegram.ui.ActionBar.k2) unVar).actionBar;
                lVar.setTranslationY(f7);
                dl dlVar = unVar.xb;
                if (dlVar != null) {
                    float f11 = unVar.P9;
                    wk wkVar = unVar.C1;
                    if (wkVar != null) {
                        i10 = wkVar.getCurrentHeight();
                    } else {
                        i10 = 0;
                    }
                    dlVar.setTranslationY(f11 + i10);
                }
                vh.p2 p2Var = unVar.K1;
                if (p2Var != null) {
                    p2Var.setTranslationY(f7);
                }
                vh.p2 p2Var2 = unVar.J1;
                if (p2Var2 != null) {
                    p2Var2.setTranslationY(f7);
                }
                FrameLayout frameLayout = unVar.f42044e1;
                if (frameLayout != null) {
                    frameLayout.setTranslationY(f7 / 2.0f);
                }
                unVar.Q.setTranslationY(f7 / 2.0f);
                int i11 = (int) f7;
                unVar.l1.setBackgroundTranslation(i11);
                org.telegram.ui.Components.j50 j50Var = unVar.f42181p3;
                if (j50Var != null) {
                    j50Var.f(f7);
                }
                kg.f0 f0Var = unVar.M2;
                if (f0Var != null) {
                    org.telegram.ui.Components.q9 q9Var = (org.telegram.ui.Components.q9) f0Var.f11064b;
                    q9Var.f29698u = f7;
                    q9Var.d.invalidate();
                }
                unVar.setFragmentPanTranslationOffset(i11);
                unVar.F9();
                unVar.H9();
            } else {
                kmVar.setNonNoveTranslation(f7);
            }
            unVar.f42303z0.invalidate();
            org.telegram.ui.Components.wb wbVar = org.telegram.ui.Components.wb.f32194w;
            if (wbVar != null && unVar.vc != null) {
                wbVar.l();
            }
            if (org.telegram.messenger.i0.Q1() && (unVar.getParentActivity() instanceof LaunchActivity)) {
                org.telegram.ui.ActionBar.k2 lastFragment = ((LaunchActivity) unVar.getParentActivity()).M().getLastFragment();
                if (lastFragment instanceof zx) {
                    zx zxVar = (zx) lastFragment;
                    zxVar.f44224v1 = f7;
                    zxVar.k5();
                }
            }
            org.telegram.ui.Components.q30 q30Var = unVar.G2;
            if (q30Var != null && q30Var.getVisibility() == 0) {
                unVar.G2.f(unVar.Z.getAudioVideoButtonContainer(), false);
            }
            gk gkVar = unVar.f42129l2;
            if (gkVar != null && (z00Var = gkVar.B0) != null) {
                z00Var.setExtraTranslationY(org.telegram.messenger.i0.L(72.0f) + f7);
            }
        }
    }

    @Override
    public final void f() {
        org.telegram.ui.Components.tc tcVar;
        un unVar = this.f38469x.f38926w0;
        mk mkVar = unVar.Z;
        if (mkVar != null && (tcVar = mkVar.f23794u0) != null) {
            tcVar.run();
            mkVar.f23794u0 = null;
        }
        org.telegram.ui.Components.q30 q30Var = unVar.G2;
        if (q30Var != null && q30Var.getVisibility() == 0) {
            unVar.G2.f(unVar.Z.getAudioVideoButtonContainer(), false);
        }
    }

    @Override
    public final void g(int i10, boolean z10) {
        org.telegram.ui.Components.tc tcVar;
        un unVar = this.f38469x.f38926w0;
        unVar.P4 = true;
        mk mkVar = unVar.Z;
        if (mkVar != null) {
            if (z10 && (tcVar = mkVar.V) != null) {
                org.telegram.messenger.i0.r(tcVar);
                mkVar.V.run();
            }
            org.telegram.ui.Components.cd cdVar = mkVar.W;
            if (cdVar != null) {
                org.telegram.messenger.i0.r(cdVar);
                mkVar.W.run();
            }
        }
        org.telegram.ui.Components.q30 q30Var = unVar.f42229t2;
        if (q30Var != null) {
            q30Var.b(false);
        }
        vh.p2 p2Var = unVar.O1;
        if (p2Var != null) {
            p2Var.e(true);
        }
    }

    @Override
    public final int i() {
        km kmVar = this.f38469x;
        un unVar = kmVar.f38926w0;
        if (kmVar.getKeyboardHeight() <= org.telegram.messenger.i0.L(20.0f) && unVar.Z.q0()) {
            return unVar.Z.getEmojiPadding();
        }
        return 0;
    }
}
