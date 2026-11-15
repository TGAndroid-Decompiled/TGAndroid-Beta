package org.telegram.ui;

import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class nl extends org.telegram.ui.ActionBar.i1 {
    public final ol f49578x;

    public nl(ol olVar, ol olVar2) {
        super(olVar2);
        this.f49578x = olVar;
    }

    @Override
    public final boolean b() {
        boolean z10;
        boolean z11;
        boolean z12;
        an anVar = this.f49578x.f49990x0;
        org.telegram.ui.ActionBar.o4 parentLayout = anVar.getParentLayout();
        if (!anVar.f45275lb) {
            z10 = ((org.telegram.ui.ActionBar.e2) anVar).inPreviewMode;
            if (!z10) {
                z11 = ((org.telegram.ui.ActionBar.e2) anVar).inBubbleMode;
                if (!z11 && !org.telegram.messenger.g0.E && parentLayout != null && anVar.La <= 0 && System.currentTimeMillis() - anVar.f45127aa >= 250) {
                    if ((anVar != parentLayout.getLastFragment() || !((ActionBarLayout) parentLayout).B()) && !((ActionBarLayout) parentLayout).f28354n) {
                        z12 = ((org.telegram.ui.ActionBar.e2) anVar).isPaused;
                        if (!z12 && anVar.f45179e6) {
                            fi.p2 p2Var = anVar.Y1;
                            if (p2Var == null || !p2Var.isShowing()) {
                                qj qjVar = anVar.f45117a0;
                                if (qjVar == null || qjVar.getTrendingStickersAlert() == null || !anVar.f45117a0.getTrendingStickersAlert().isShowing()) {
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
        ol olVar = this.f49578x;
        an anVar = olVar.f49990x0;
        if (anVar.getParentLayout() == null || !((ActionBarLayout) anVar.getParentLayout()).f28354n) {
            anVar.S9 = f10;
            anVar.T9 = f11;
            fi.p2 p2Var = anVar.Y1;
            if (p2Var == null || !p2Var.isShowing()) {
                kVar = ((org.telegram.ui.ActionBar.e2) anVar).actionBar;
                kVar.setTranslationY(f10);
                hk hkVar = anVar.Ab;
                if (hkVar != null) {
                    float f12 = anVar.S9;
                    ak akVar = anVar.D1;
                    if (akVar != null) {
                        i7 = akVar.getCurrentHeight();
                    } else {
                        i7 = 0;
                    }
                    hkVar.setTranslationY(f12 + i7);
                }
                hi.l3 l3Var2 = anVar.L1;
                if (l3Var2 != null) {
                    l3Var2.setTranslationY(f10);
                }
                hi.l3 l3Var3 = anVar.K1;
                if (l3Var3 != null) {
                    l3Var3.setTranslationY(f10);
                }
                FrameLayout frameLayout = anVar.f45188f1;
                if (frameLayout != null) {
                    frameLayout.setTranslationY(f10 / 2.0f);
                }
                anVar.R.setTranslationY(f10 / 2.0f);
                int i10 = (int) f10;
                anVar.f45277m1.setBackgroundTranslation(i10);
                org.telegram.ui.Components.w40 w40Var = anVar.f45328q3;
                if (w40Var != null) {
                    w40Var.g(f10);
                }
                hi.n5 n5Var = anVar.N2;
                if (n5Var != null) {
                    org.telegram.ui.Components.s9 s9Var = (org.telegram.ui.Components.s9) n5Var.f14761b;
                    s9Var.f39254u = f10;
                    s9Var.d.invalidate();
                }
                anVar.setFragmentPanTranslationOffset(i10);
                anVar.M9();
                anVar.O9();
            } else {
                olVar.setNonNoveTranslation(f10);
            }
            anVar.A0.invalidate();
            org.telegram.ui.Components.xb xbVar = org.telegram.ui.Components.xb.f41627w;
            if (xbVar != null && anVar.Dc != null) {
                xbVar.l();
            }
            if (org.telegram.messenger.g0.Q1() && (anVar.getParentActivity() instanceof LaunchActivity)) {
                org.telegram.ui.ActionBar.e2 lastFragment = ((LaunchActivity) anVar.getParentActivity()).M().getLastFragment();
                if (lastFragment instanceof yw) {
                    yw ywVar = (yw) lastFragment;
                    ywVar.f53729x1 = f10;
                    ywVar.k5();
                }
            }
            hi.l3 l3Var4 = anVar.H2;
            if (l3Var4 != null && l3Var4.W) {
                l3Var4.y(anVar.f45117a0.getAudioVideoButtonContainer(), false);
            }
            lj ljVar = anVar.f45278m2;
            if (ljVar != null && (l3Var = ljVar.C0) != null) {
                l3Var.z();
            }
        }
    }

    @Override
    public final void f() {
        org.telegram.ui.Components.nd ndVar;
        an anVar = this.f49578x.f49990x0;
        qj qjVar = anVar.f45117a0;
        if (qjVar != null && (ndVar = qjVar.f32300v0) != null) {
            ndVar.run();
            qjVar.f32300v0 = null;
        }
        hi.l3 l3Var = anVar.H2;
        if (l3Var != null && l3Var.W) {
            l3Var.y(anVar.f45117a0.getAudioVideoButtonContainer(), false);
        }
    }

    @Override
    public final void g(int i7, boolean z10) {
        org.telegram.ui.Components.nd ndVar;
        an anVar = this.f49578x.f49990x0;
        anVar.Q4 = true;
        qj qjVar = anVar.f45117a0;
        if (qjVar != null) {
            if (z10 && (ndVar = qjVar.W) != null) {
                org.telegram.messenger.g0.r(ndVar);
                qjVar.W.run();
            }
            org.telegram.ui.Components.od odVar = qjVar.f32154a0;
            if (odVar != null) {
                org.telegram.messenger.g0.r(odVar);
                qjVar.f32154a0.run();
            }
        }
        hi.l3 l3Var = anVar.f45378u2;
        if (l3Var != null) {
            l3Var.f(false);
        }
        hi.l3 l3Var2 = anVar.P1;
        if (l3Var2 != null) {
            l3Var2.f(true);
        }
    }

    @Override
    public final int i() {
        ol olVar = this.f49578x;
        an anVar = olVar.f49990x0;
        if (olVar.getKeyboardHeight() <= org.telegram.messenger.g0.L(20.0f) && anVar.f45117a0.G0()) {
            return anVar.f45117a0.getEmojiPadding();
        }
        return 0;
    }
}
