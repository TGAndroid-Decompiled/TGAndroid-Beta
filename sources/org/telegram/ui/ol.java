package org.telegram.ui;

import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class ol extends org.telegram.ui.ActionBar.i1 {
    public final pl f50596x;

    public ol(pl plVar, pl plVar2) {
        super(plVar2);
        this.f50596x = plVar;
    }

    @Override
    public final boolean b() {
        boolean z10;
        boolean z11;
        boolean z12;
        bn bnVar = this.f50596x.f50880x0;
        org.telegram.ui.ActionBar.r4 parentLayout = bnVar.getParentLayout();
        if (!bnVar.mb) {
            z10 = ((org.telegram.ui.ActionBar.g2) bnVar).inPreviewMode;
            if (!z10) {
                z11 = ((org.telegram.ui.ActionBar.g2) bnVar).inBubbleMode;
                if (!z11 && !org.telegram.messenger.g0.E && parentLayout != null && bnVar.Ma <= 0 && System.currentTimeMillis() - bnVar.f45928ba >= 250) {
                    if ((bnVar != parentLayout.getLastFragment() || !((ActionBarLayout) parentLayout).B()) && !((ActionBarLayout) parentLayout).f28705n) {
                        z12 = ((org.telegram.ui.ActionBar.g2) bnVar).isPaused;
                        if (!z12 && bnVar.f45979f6) {
                            fi.n2 n2Var = bnVar.Y1;
                            if (n2Var == null || !n2Var.isShowing()) {
                                rj rjVar = bnVar.f45903a0;
                                if (rjVar == null || rjVar.getTrendingStickersAlert() == null || !bnVar.f45903a0.getTrendingStickersAlert().isShowing()) {
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
        int i7;
        hi.l3 l3Var;
        pl plVar = this.f50596x;
        bn bnVar = plVar.f50880x0;
        if (bnVar.getParentLayout() == null || !((ActionBarLayout) bnVar.getParentLayout()).f28705n) {
            bnVar.T9 = f10;
            bnVar.U9 = f11;
            fi.n2 n2Var = bnVar.Y1;
            if (n2Var == null || !n2Var.isShowing()) {
                kVar = ((org.telegram.ui.ActionBar.g2) bnVar).actionBar;
                kVar.setTranslationY(f10);
                ik ikVar = bnVar.Bb;
                if (ikVar != null) {
                    float f12 = bnVar.T9;
                    bk bkVar = bnVar.D1;
                    if (bkVar != null) {
                        i7 = bkVar.getCurrentHeight();
                    } else {
                        i7 = 0;
                    }
                    ikVar.setTranslationY(f12 + i7);
                }
                hi.l3 l3Var2 = bnVar.L1;
                if (l3Var2 != null) {
                    l3Var2.setTranslationY(f10);
                }
                hi.l3 l3Var3 = bnVar.K1;
                if (l3Var3 != null) {
                    l3Var3.setTranslationY(f10);
                }
                FrameLayout frameLayout = bnVar.f45974f1;
                if (frameLayout != null) {
                    frameLayout.setTranslationY(f10 / 2.0f);
                }
                bnVar.R.setTranslationY(f10 / 2.0f);
                int i10 = (int) f10;
                bnVar.f46064m1.setBackgroundTranslation(i10);
                org.telegram.ui.Components.h50 h50Var = bnVar.f46115q3;
                if (h50Var != null) {
                    h50Var.g(f10);
                }
                hi.m5 m5Var = bnVar.N2;
                if (m5Var != null) {
                    org.telegram.ui.Components.aa aaVar = (org.telegram.ui.Components.aa) m5Var.f15015b;
                    aaVar.f33428u = f10;
                    aaVar.d.invalidate();
                }
                bnVar.setFragmentPanTranslationOffset(i10);
                bnVar.M9();
                bnVar.O9();
            } else {
                plVar.setNonNoveTranslation(f10);
            }
            bnVar.A0.invalidate();
            org.telegram.ui.Components.gc gcVar = org.telegram.ui.Components.gc.f35481w;
            if (gcVar != null && bnVar.Ec != null) {
                gcVar.l();
            }
            if (org.telegram.messenger.g0.Q1() && (bnVar.getParentActivity() instanceof LaunchActivity)) {
                org.telegram.ui.ActionBar.g2 lastFragment = ((LaunchActivity) bnVar.getParentActivity()).M().getLastFragment();
                if (lastFragment instanceof cx) {
                    cx cxVar = (cx) lastFragment;
                    cxVar.f46774x1 = f10;
                    cxVar.s5();
                }
            }
            hi.l3 l3Var4 = bnVar.H2;
            if (l3Var4 != null && l3Var4.W) {
                l3Var4.z(bnVar.f45903a0.getAudioVideoButtonContainer(), false);
            }
            mj mjVar = bnVar.f46065m2;
            if (mjVar != null && (l3Var = mjVar.C0) != null) {
                l3Var.A();
            }
        }
    }

    @Override
    public final void f() {
        org.telegram.ui.Components.dd ddVar;
        bn bnVar = this.f50596x.f50880x0;
        rj rjVar = bnVar.f45903a0;
        if (rjVar != null && (ddVar = rjVar.f32699v0) != null) {
            ddVar.run();
            rjVar.f32699v0 = null;
        }
        hi.l3 l3Var = bnVar.H2;
        if (l3Var != null && l3Var.W) {
            l3Var.z(bnVar.f45903a0.getAudioVideoButtonContainer(), false);
        }
    }

    @Override
    public final void g(int i7, boolean z10) {
        org.telegram.ui.Components.td tdVar;
        bn bnVar = this.f50596x.f50880x0;
        bnVar.R4 = true;
        rj rjVar = bnVar.f45903a0;
        if (rjVar != null) {
            if (z10 && (tdVar = rjVar.W) != null) {
                org.telegram.messenger.g0.r(tdVar);
                rjVar.W.run();
            }
            ci ciVar = rjVar.f32537a0;
            if (ciVar != null) {
                org.telegram.messenger.g0.r(ciVar);
                rjVar.f32537a0.run();
            }
        }
        hi.l3 l3Var = bnVar.f46165u2;
        if (l3Var != null) {
            l3Var.f(false);
        }
        hi.l3 l3Var2 = bnVar.P1;
        if (l3Var2 != null) {
            l3Var2.f(true);
        }
    }

    @Override
    public final int i() {
        pl plVar = this.f50596x;
        bn bnVar = plVar.f50880x0;
        if (plVar.getKeyboardHeight() <= org.telegram.messenger.g0.L(20.0f) && bnVar.f45903a0.S0()) {
            return bnVar.f45903a0.getEmojiPadding();
        }
        return 0;
    }
}
