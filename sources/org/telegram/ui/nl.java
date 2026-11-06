package org.telegram.ui;

import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class nl extends org.telegram.ui.ActionBar.i1 {
    public final ol f48066x;

    public nl(ol olVar, ol olVar2) {
        super(olVar2);
        this.f48066x = olVar;
    }

    @Override
    public final boolean b() {
        boolean z9;
        boolean z10;
        boolean z11;
        an anVar = this.f48066x.f48442w0;
        org.telegram.ui.ActionBar.q4 parentLayout = anVar.getParentLayout();
        if (!anVar.f43836ib) {
            z9 = ((org.telegram.ui.ActionBar.f2) anVar).inPreviewMode;
            if (!z9) {
                z10 = ((org.telegram.ui.ActionBar.f2) anVar).inBubbleMode;
                if (!z10 && !org.telegram.messenger.g0.E && parentLayout != null && anVar.Ia <= 0 && System.currentTimeMillis() - anVar.X9 >= 250) {
                    if ((anVar != parentLayout.getLastFragment() || !((ActionBarLayout) parentLayout).B()) && !((ActionBarLayout) parentLayout).f27255n) {
                        z11 = ((org.telegram.ui.ActionBar.f2) anVar).isPaused;
                        if (!z11 && anVar.f43765d6) {
                            di.u2 u2Var = anVar.X1;
                            if (u2Var == null || !u2Var.isShowing()) {
                                qj qjVar = anVar.Z;
                                if (qjVar == null || qjVar.getTrendingStickersAlert() == null || !anVar.Z.getTrendingStickersAlert().isShowing()) {
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
        ol olVar = this.f48066x;
        an anVar = olVar.f48442w0;
        if (anVar.getParentLayout() == null || !((ActionBarLayout) anVar.getParentLayout()).f27255n) {
            anVar.P9 = f10;
            anVar.Q9 = f11;
            di.u2 u2Var = anVar.X1;
            if (u2Var == null || !u2Var.isShowing()) {
                kVar = ((org.telegram.ui.ActionBar.f2) anVar).actionBar;
                kVar.setTranslationY(f10);
                hk hkVar = anVar.f44024xb;
                if (hkVar != null) {
                    float f12 = anVar.P9;
                    ak akVar = anVar.C1;
                    if (akVar != null) {
                        i7 = akVar.getCurrentHeight();
                    } else {
                        i7 = 0;
                    }
                    hkVar.setTranslationY(f12 + i7);
                }
                fi.m3 m3Var2 = anVar.K1;
                if (m3Var2 != null) {
                    m3Var2.setTranslationY(f10);
                }
                fi.m3 m3Var3 = anVar.J1;
                if (m3Var3 != null) {
                    m3Var3.setTranslationY(f10);
                }
                FrameLayout frameLayout = anVar.f43774e1;
                if (frameLayout != null) {
                    frameLayout.setTranslationY(f10 / 2.0f);
                }
                anVar.Q.setTranslationY(f10 / 2.0f);
                int i10 = (int) f10;
                anVar.l1.setBackgroundTranslation(i10);
                org.telegram.ui.Components.t40 t40Var = anVar.f43912p3;
                if (t40Var != null) {
                    t40Var.f(f10);
                }
                fi.p5 p5Var = anVar.M2;
                if (p5Var != null) {
                    org.telegram.ui.Components.w9 w9Var = (org.telegram.ui.Components.w9) p5Var.f12597b;
                    w9Var.f39940u = f10;
                    w9Var.d.invalidate();
                }
                anVar.setFragmentPanTranslationOffset(i10);
                anVar.K9();
                anVar.M9();
            } else {
                olVar.setNonNoveTranslation(f10);
            }
            anVar.f44038z0.invalidate();
            org.telegram.ui.Components.cc ccVar = org.telegram.ui.Components.cc.f32519w;
            if (ccVar != null && anVar.Ac != null) {
                ccVar.l();
            }
            if (org.telegram.messenger.g0.Q1() && (anVar.getParentActivity() instanceof LaunchActivity)) {
                org.telegram.ui.ActionBar.f2 lastFragment = ((LaunchActivity) anVar.getParentActivity()).M().getLastFragment();
                if (lastFragment instanceof ww) {
                    ww wwVar = (ww) lastFragment;
                    wwVar.f51636v1 = f10;
                    wwVar.k5();
                }
            }
            fi.m3 m3Var4 = anVar.G2;
            if (m3Var4 != null && m3Var4.V) {
                m3Var4.y(anVar.Z.getAudioVideoButtonContainer(), false);
            }
            lj ljVar = anVar.f43863l2;
            if (ljVar != null && (m3Var = ljVar.B0) != null) {
                m3Var.z();
            }
        }
    }

    @Override
    public final void f() {
        org.telegram.ui.Components.ad adVar;
        an anVar = this.f48066x.f48442w0;
        qj qjVar = anVar.Z;
        if (qjVar != null && (adVar = qjVar.f31128u0) != null) {
            adVar.run();
            qjVar.f31128u0 = null;
        }
        fi.m3 m3Var = anVar.G2;
        if (m3Var != null && m3Var.V) {
            m3Var.y(anVar.Z.getAudioVideoButtonContainer(), false);
        }
    }

    @Override
    public final void g(int i7, boolean z9) {
        org.telegram.ui.Components.ad adVar;
        an anVar = this.f48066x.f48442w0;
        anVar.P4 = true;
        qj qjVar = anVar.Z;
        if (qjVar != null) {
            if (z9 && (adVar = qjVar.V) != null) {
                org.telegram.messenger.g0.r(adVar);
                qjVar.V.run();
            }
            org.telegram.ui.Components.f fVar = qjVar.W;
            if (fVar != null) {
                org.telegram.messenger.g0.r(fVar);
                qjVar.W.run();
            }
        }
        fi.m3 m3Var = anVar.f43963t2;
        if (m3Var != null) {
            m3Var.f(false);
        }
        fi.m3 m3Var2 = anVar.O1;
        if (m3Var2 != null) {
            m3Var2.f(true);
        }
    }

    @Override
    public final int i() {
        ol olVar = this.f48066x;
        an anVar = olVar.f48442w0;
        if (olVar.getKeyboardHeight() <= org.telegram.messenger.g0.L(20.0f) && anVar.Z.s0()) {
            return anVar.Z.getEmojiPadding();
        }
        return 0;
    }
}
