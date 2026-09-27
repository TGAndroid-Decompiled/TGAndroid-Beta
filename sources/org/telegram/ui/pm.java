package org.telegram.ui;

import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class pm extends org.telegram.ui.ActionBar.q1 {
    public final qm f36506x;

    public pm(qm qmVar, qm qmVar2) {
        super(qmVar2);
        this.f36506x = qmVar;
    }

    @Override
    public final boolean b() {
        boolean z10;
        boolean z11;
        boolean z12;
        xn xnVar = this.f36506x.J0;
        org.telegram.ui.ActionBar.d5 parentLayout = xnVar.getParentLayout();
        if (!xnVar.Oa) {
            z10 = ((org.telegram.ui.ActionBar.o2) xnVar).inPreviewMode;
            if (!z10) {
                z11 = ((org.telegram.ui.ActionBar.o2) xnVar).inBubbleMode;
                if (!z11 && !AndroidUtilities.isInMultiwindow && parentLayout != null && xnVar.f39883pa <= 0 && System.currentTimeMillis() - xnVar.E9 >= 250) {
                    if ((xnVar != parentLayout.getLastFragment() || !((ActionBarLayout) parentLayout).B()) && !((ActionBarLayout) parentLayout).f18624n) {
                        z12 = ((org.telegram.ui.ActionBar.o2) xnVar).isPaused;
                        if (!z12 && xnVar.N5) {
                            ai.g4 g4Var = xnVar.J1;
                            if (g4Var == null || !g4Var.isShowing()) {
                                lk lkVar = xnVar.Y;
                                if (lkVar == null || lkVar.getTrendingStickersAlert() == null || !xnVar.Y.getTrendingStickersAlert().isShowing()) {
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
        org.telegram.ui.Components.w10 w10Var;
        qm qmVar = this.f36506x;
        xn xnVar = qmVar.J0;
        if (xnVar.getParentLayout() == null || !((ActionBarLayout) xnVar.getParentLayout()).f18624n) {
            xnVar.f39973w9 = f7;
            xnVar.f39986x9 = f10;
            ai.g4 g4Var = xnVar.J1;
            if (g4Var == null || !g4Var.isShowing()) {
                lVar = ((org.telegram.ui.ActionBar.o2) xnVar).actionBar;
                lVar.setTranslationY(f7);
                bl blVar = xnVar.f39699ab;
                if (blVar != null) {
                    float f11 = xnVar.f39973w9;
                    xk xkVar = xnVar.f39863o1;
                    if (xkVar != null) {
                        i10 = xkVar.getCurrentHeight();
                    } else {
                        i10 = 0;
                    }
                    blVar.setTranslationY(f11 + i10);
                }
                ci.e4 e4Var = xnVar.f39965w1;
                if (e4Var != null) {
                    e4Var.setTranslationY(f7);
                }
                ci.e4 e4Var2 = xnVar.f39952v1;
                if (e4Var2 != null) {
                    e4Var2.setTranslationY(f7);
                }
                FrameLayout frameLayout = xnVar.Q0;
                if (frameLayout != null) {
                    frameLayout.setTranslationY(f7 / 2.0f);
                }
                xnVar.P.setTranslationY(f7 / 2.0f);
                int i11 = (int) f7;
                xnVar.X0.setBackgroundTranslation(i11);
                org.telegram.ui.Components.j60 j60Var = xnVar.f39705b3;
                if (j60Var != null) {
                    j60Var.e(f7);
                }
                ci.r6 r6Var = xnVar.f39992y2;
                if (r6Var != null) {
                    org.telegram.ui.Components.fa faVar = (org.telegram.ui.Components.fa) r6Var.f5454b;
                    faVar.f24224u = f7;
                    faVar.d.invalidate();
                }
                xnVar.setFragmentPanTranslationOffset(i11);
                xnVar.o9();
                xnVar.r9();
            } else {
                qmVar.setNonNoveTranslation(f7);
            }
            xnVar.f39977x0.invalidate();
            org.telegram.ui.Components.qc qcVar = org.telegram.ui.Components.qc.f27684w;
            if (qcVar != null && xnVar.Yb != null) {
                qcVar.l();
            }
            if (AndroidUtilities.isTablet() && (xnVar.getParentActivity() instanceof LaunchActivity)) {
                org.telegram.ui.ActionBar.o2 lastFragment = ((LaunchActivity) xnVar.getParentActivity()).O().getLastFragment();
                if (lastFragment instanceof ty) {
                    ty tyVar = (ty) lastFragment;
                    tyVar.f38062v1 = f7;
                    tyVar.g5();
                }
            }
            org.telegram.ui.Components.l40 l40Var = xnVar.f39915s2;
            if (l40Var != null && l40Var.getVisibility() == 0) {
                xnVar.f39915s2.f(xnVar.Y.getAudioVideoButtonContainer(), false);
            }
            gk gkVar = xnVar.X1;
            if (gkVar != null && (w10Var = gkVar.A0) != null) {
                w10Var.setExtraTranslationY(AndroidUtilities.dp(72.0f) + f7);
            }
        }
    }

    @Override
    public final void f() {
        org.telegram.ui.Components.je jeVar;
        xn xnVar = this.f36506x.J0;
        lk lkVar = xnVar.Y;
        if (lkVar != null && (jeVar = lkVar.f22071u0) != null) {
            jeVar.run();
            lkVar.f22071u0 = null;
        }
        org.telegram.ui.Components.l40 l40Var = xnVar.f39915s2;
        if (l40Var != null && l40Var.getVisibility() == 0) {
            xnVar.f39915s2.f(xnVar.Y.getAudioVideoButtonContainer(), false);
        }
    }

    @Override
    public final void g(int i10, boolean z10) {
        org.telegram.ui.Components.sd sdVar;
        xn xnVar = this.f36506x.J0;
        xnVar.D4 = true;
        lk lkVar = xnVar.Y;
        if (lkVar != null) {
            if (z10 && (sdVar = lkVar.V) != null) {
                AndroidUtilities.cancelRunOnUIThread(sdVar);
                lkVar.V.run();
            }
            org.telegram.ui.Components.fe feVar = lkVar.W;
            if (feVar != null) {
                AndroidUtilities.cancelRunOnUIThread(feVar);
                lkVar.W.run();
            }
        }
        org.telegram.ui.Components.l40 l40Var = xnVar.f39755f2;
        if (l40Var != null) {
            l40Var.b(false);
        }
        ci.e4 e4Var = xnVar.A1;
        if (e4Var != null) {
            e4Var.e(true);
        }
    }

    @Override
    public final int i() {
        qm qmVar = this.f36506x;
        xn xnVar = qmVar.J0;
        if (qmVar.getKeyboardHeight() <= AndroidUtilities.dp(20.0f) && xnVar.Y.t0()) {
            return xnVar.Y.getEmojiPadding();
        }
        return 0;
    }
}
