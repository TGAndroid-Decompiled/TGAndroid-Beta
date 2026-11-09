package org.telegram.ui;

import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class pl extends org.telegram.ui.ActionBar.i1 {
    public final ql f48736x;

    public pl(ql qlVar, ql qlVar2) {
        super(qlVar2);
        this.f48736x = qlVar;
    }

    @Override
    public final boolean b() {
        boolean z9;
        boolean z10;
        boolean z11;
        cn cnVar = this.f48736x.f49088w0;
        org.telegram.ui.ActionBar.q4 parentLayout = cnVar.getParentLayout();
        if (!cnVar.kb) {
            z9 = ((org.telegram.ui.ActionBar.f2) cnVar).inPreviewMode;
            if (!z9) {
                z10 = ((org.telegram.ui.ActionBar.f2) cnVar).inBubbleMode;
                if (!z10 && !org.telegram.messenger.g0.E && parentLayout != null && cnVar.Ka <= 0 && System.currentTimeMillis() - cnVar.Z9 >= 250) {
                    if ((cnVar != parentLayout.getLastFragment() || !((ActionBarLayout) parentLayout).B()) && !((ActionBarLayout) parentLayout).f27259n) {
                        z11 = ((org.telegram.ui.ActionBar.f2) cnVar).isPaused;
                        if (!z11 && cnVar.f44425d6) {
                            di.u2 u2Var = cnVar.X1;
                            if (u2Var == null || !u2Var.isShowing()) {
                                sj sjVar = cnVar.Z;
                                if (sjVar == null || sjVar.getTrendingStickersAlert() == null || !cnVar.Z.getTrendingStickersAlert().isShowing()) {
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
    public final void e(float f10, float f11, boolean z9) {
        org.telegram.ui.ActionBar.k kVar;
        int i7;
        fi.m3 m3Var;
        ql qlVar = this.f48736x;
        cn cnVar = qlVar.f49088w0;
        if (cnVar.getParentLayout() == null || !((ActionBarLayout) cnVar.getParentLayout()).f27259n) {
            cnVar.R9 = f10;
            cnVar.S9 = f11;
            di.u2 u2Var = cnVar.X1;
            if (u2Var == null || !u2Var.isShowing()) {
                kVar = ((org.telegram.ui.ActionBar.f2) cnVar).actionBar;
                kVar.setTranslationY(f10);
                jk jkVar = cnVar.f44710zb;
                if (jkVar != null) {
                    float f12 = cnVar.R9;
                    ck ckVar = cnVar.C1;
                    if (ckVar != null) {
                        i7 = ckVar.getCurrentHeight();
                    } else {
                        i7 = 0;
                    }
                    jkVar.setTranslationY(f12 + i7);
                }
                fi.m3 m3Var2 = cnVar.K1;
                if (m3Var2 != null) {
                    m3Var2.setTranslationY(f10);
                }
                fi.m3 m3Var3 = cnVar.J1;
                if (m3Var3 != null) {
                    m3Var3.setTranslationY(f10);
                }
                FrameLayout frameLayout = cnVar.f44434e1;
                if (frameLayout != null) {
                    frameLayout.setTranslationY(f10 / 2.0f);
                }
                cnVar.Q.setTranslationY(f10 / 2.0f);
                int i10 = (int) f10;
                cnVar.l1.setBackgroundTranslation(i10);
                org.telegram.ui.Components.u40 u40Var = cnVar.f44574p3;
                if (u40Var != null) {
                    u40Var.g(f10);
                }
                fi.p5 p5Var = cnVar.M2;
                if (p5Var != null) {
                    org.telegram.ui.Components.w9 w9Var = (org.telegram.ui.Components.w9) p5Var.f12595b;
                    w9Var.f40013u = f10;
                    w9Var.d.invalidate();
                }
                cnVar.setFragmentPanTranslationOffset(i10);
                cnVar.L9();
                cnVar.N9();
            } else {
                qlVar.setNonNoveTranslation(f10);
            }
            cnVar.f44700z0.invalidate();
            org.telegram.ui.Components.cc ccVar = org.telegram.ui.Components.cc.f32619w;
            if (ccVar != null && cnVar.Cc != null) {
                ccVar.l();
            }
            if (org.telegram.messenger.g0.Q1() && (cnVar.getParentActivity() instanceof LaunchActivity)) {
                org.telegram.ui.ActionBar.f2 lastFragment = ((LaunchActivity) cnVar.getParentActivity()).M().getLastFragment();
                if (lastFragment instanceof yw) {
                    yw ywVar = (yw) lastFragment;
                    ywVar.f52322w1 = f10;
                    ywVar.k5();
                }
            }
            fi.m3 m3Var4 = cnVar.G2;
            if (m3Var4 != null && m3Var4.V) {
                m3Var4.y(cnVar.Z.getAudioVideoButtonContainer(), false);
            }
            nj njVar = cnVar.f44525l2;
            if (njVar != null && (m3Var = njVar.B0) != null) {
                m3Var.z();
            }
        }
    }

    @Override
    public final void f() {
        org.telegram.ui.Components.ad adVar;
        cn cnVar = this.f48736x.f49088w0;
        sj sjVar = cnVar.Z;
        if (sjVar != null && (adVar = sjVar.f31138u0) != null) {
            adVar.run();
            sjVar.f31138u0 = null;
        }
        fi.m3 m3Var = cnVar.G2;
        if (m3Var != null && m3Var.V) {
            m3Var.y(cnVar.Z.getAudioVideoButtonContainer(), false);
        }
    }

    @Override
    public final void g(int i7, boolean z9) {
        org.telegram.ui.Components.ad adVar;
        cn cnVar = this.f48736x.f49088w0;
        cnVar.P4 = true;
        sj sjVar = cnVar.Z;
        if (sjVar != null) {
            if (z9 && (adVar = sjVar.V) != null) {
                org.telegram.messenger.g0.r(adVar);
                sjVar.V.run();
            }
            org.telegram.ui.Components.f fVar = sjVar.W;
            if (fVar != null) {
                org.telegram.messenger.g0.r(fVar);
                sjVar.W.run();
            }
        }
        fi.m3 m3Var = cnVar.f44625t2;
        if (m3Var != null) {
            m3Var.f(false);
        }
        fi.m3 m3Var2 = cnVar.O1;
        if (m3Var2 != null) {
            m3Var2.f(true);
        }
    }

    @Override
    public final int i() {
        ql qlVar = this.f48736x;
        cn cnVar = qlVar.f49088w0;
        if (qlVar.getKeyboardHeight() <= org.telegram.messenger.g0.L(20.0f) && cnVar.Z.s0()) {
            return cnVar.Z.getEmojiPadding();
        }
        return 0;
    }
}
