package org.telegram.ui;

import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class jl extends org.telegram.ui.ActionBar.h1 {
    public final kl f46638x;

    public jl(kl klVar, kl klVar2) {
        super(klVar2);
        this.f46638x = klVar;
    }

    @Override
    public final boolean b() {
        boolean z10;
        boolean z11;
        boolean z12;
        wm wmVar = this.f46638x.f46979x0;
        org.telegram.ui.ActionBar.q4 parentLayout = wmVar.getParentLayout();
        if (!wmVar.jb) {
            z10 = ((org.telegram.ui.ActionBar.d2) wmVar).inPreviewMode;
            if (!z10) {
                z11 = ((org.telegram.ui.ActionBar.d2) wmVar).inBubbleMode;
                if (!z11 && !org.telegram.messenger.g0.E && parentLayout != null && wmVar.Ja <= 0 && System.currentTimeMillis() - wmVar.Y9 >= 250) {
                    if ((wmVar != parentLayout.getLastFragment() || !((ActionBarLayout) parentLayout).B()) && !((ActionBarLayout) parentLayout).f27304n) {
                        z12 = ((org.telegram.ui.ActionBar.d2) wmVar).isPaused;
                        if (!z12 && wmVar.f51299e6) {
                            ei.x2 x2Var = wmVar.Y1;
                            if (x2Var == null || !x2Var.isShowing()) {
                                mj mjVar = wmVar.f51237a0;
                                if (mjVar == null || mjVar.getTrendingStickersAlert() == null || !wmVar.f51237a0.getTrendingStickersAlert().isShowing()) {
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
        int i3;
        gi.l3 l3Var;
        kl klVar = this.f46638x;
        wm wmVar = klVar.f46979x0;
        if (wmVar.getParentLayout() == null || !((ActionBarLayout) wmVar.getParentLayout()).f27304n) {
            wmVar.Q9 = f10;
            wmVar.R9 = f11;
            ei.x2 x2Var = wmVar.Y1;
            if (x2Var == null || !x2Var.isShowing()) {
                kVar = ((org.telegram.ui.ActionBar.d2) wmVar).actionBar;
                kVar.setTranslationY(f10);
                dk dkVar = wmVar.f51558yb;
                if (dkVar != null) {
                    float f12 = wmVar.Q9;
                    wj wjVar = wmVar.D1;
                    if (wjVar != null) {
                        i3 = wjVar.getCurrentHeight();
                    } else {
                        i3 = 0;
                    }
                    dkVar.setTranslationY(f12 + i3);
                }
                gi.l3 l3Var2 = wmVar.L1;
                if (l3Var2 != null) {
                    l3Var2.setTranslationY(f10);
                }
                gi.l3 l3Var3 = wmVar.K1;
                if (l3Var3 != null) {
                    l3Var3.setTranslationY(f10);
                }
                FrameLayout frameLayout = wmVar.f51308f1;
                if (frameLayout != null) {
                    frameLayout.setTranslationY(f10 / 2.0f);
                }
                wmVar.R.setTranslationY(f10 / 2.0f);
                int i10 = (int) f10;
                wmVar.m1.setBackgroundTranslation(i10);
                org.telegram.ui.Components.p40 p40Var = wmVar.f51448q3;
                if (p40Var != null) {
                    p40Var.f(f10);
                }
                gi.n5 n5Var = wmVar.N2;
                if (n5Var != null) {
                    org.telegram.ui.Components.v9 v9Var = (org.telegram.ui.Components.v9) n5Var.f13303b;
                    v9Var.f39051u = f10;
                    v9Var.d.invalidate();
                }
                wmVar.setFragmentPanTranslationOffset(i10);
                wmVar.K9();
                wmVar.M9();
            } else {
                klVar.setNonNoveTranslation(f10);
            }
            wmVar.A0.invalidate();
            org.telegram.ui.Components.ac acVar = org.telegram.ui.Components.ac.f31784w;
            if (acVar != null && wmVar.Bc != null) {
                acVar.l();
            }
            if (org.telegram.messenger.g0.Q1() && (wmVar.getParentActivity() instanceof LaunchActivity)) {
                org.telegram.ui.ActionBar.d2 lastFragment = ((LaunchActivity) wmVar.getParentActivity()).M().getLastFragment();
                if (lastFragment instanceof uw) {
                    uw uwVar = (uw) lastFragment;
                    uwVar.f50315w1 = f10;
                    uwVar.k5();
                }
            }
            gi.l3 l3Var4 = wmVar.H2;
            if (l3Var4 != null && l3Var4.W) {
                l3Var4.y(wmVar.f51237a0.getAudioVideoButtonContainer(), false);
            }
            hj hjVar = wmVar.f51395m2;
            if (hjVar != null && (l3Var = hjVar.C0) != null) {
                l3Var.z();
            }
        }
    }

    @Override
    public final void f() {
        org.telegram.ui.Components.yc ycVar;
        wm wmVar = this.f46638x.f46979x0;
        mj mjVar = wmVar.f51237a0;
        if (mjVar != null && (ycVar = mjVar.f31208v0) != null) {
            ycVar.run();
            mjVar.f31208v0 = null;
        }
        gi.l3 l3Var = wmVar.H2;
        if (l3Var != null && l3Var.W) {
            l3Var.y(wmVar.f51237a0.getAudioVideoButtonContainer(), false);
        }
    }

    @Override
    public final void g(int i3, boolean z10) {
        org.telegram.ui.Components.yc ycVar;
        wm wmVar = this.f46638x.f46979x0;
        wmVar.Q4 = true;
        mj mjVar = wmVar.f51237a0;
        if (mjVar != null) {
            if (z10 && (ycVar = mjVar.W) != null) {
                org.telegram.messenger.g0.r(ycVar);
                mjVar.W.run();
            }
            lo loVar = mjVar.f31084a0;
            if (loVar != null) {
                org.telegram.messenger.g0.r(loVar);
                mjVar.f31084a0.run();
            }
        }
        gi.l3 l3Var = wmVar.f51497u2;
        if (l3Var != null) {
            l3Var.f(false);
        }
        gi.l3 l3Var2 = wmVar.P1;
        if (l3Var2 != null) {
            l3Var2.f(true);
        }
    }

    @Override
    public final int i() {
        kl klVar = this.f46638x;
        wm wmVar = klVar.f46979x0;
        if (klVar.getKeyboardHeight() <= org.telegram.messenger.g0.L(20.0f) && wmVar.f51237a0.r0()) {
            return wmVar.f51237a0.getEmojiPadding();
        }
        return 0;
    }
}
