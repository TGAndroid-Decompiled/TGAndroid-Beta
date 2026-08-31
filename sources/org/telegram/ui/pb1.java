package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
public final class pb1 implements Runnable {
    public final int f40008a;
    public final ed1 f40009b;

    public pb1(ed1 ed1Var, int i10) {
        this.f40008a = i10;
        this.f40009b = ed1Var;
    }

    @Override
    public final void run() {
        int i10;
        int i11 = this.f40008a;
        float f10 = 0.0f;
        ed1 ed1Var = this.f40009b;
        switch (i11) {
            case 0:
                ed1Var.W = false;
                int i12 = ed1Var.T;
                int i13 = ed1Var.U;
                org.telegram.ui.ActionBar.i6 i6Var = ed1Var.f36533s;
                int i14 = ed1Var.f36521n;
                if (i14 == 1) {
                    if (i13 == 0) {
                        i6Var.f21469c = i12;
                        org.telegram.ui.ActionBar.k6.n1(false, false);
                    } else if (i13 == 1) {
                        i6Var.d = i12;
                        org.telegram.ui.ActionBar.k6.n1(true, true);
                        ed1Var.f36531r0.f1();
                        ed1Var.S.setHasChanges(ed1Var.T0(ed1Var.f36521n));
                        ed1Var.m1(true);
                    }
                } else if (i14 == 2) {
                    if (i13 == 0) {
                        i6Var.f21474j = i12;
                    } else if (i13 == 1) {
                        int B0 = org.telegram.ui.ActionBar.k6.B0(org.telegram.ui.ActionBar.k6.Od);
                        if (i12 == 0 && B0 != 0) {
                            i6Var.f21475k = 4294967296L;
                        } else {
                            i6Var.f21475k = i12;
                        }
                    } else if (i13 == 2) {
                        int B02 = org.telegram.ui.ActionBar.k6.B0(org.telegram.ui.ActionBar.k6.Pd);
                        if (i12 == 0 && B02 != 0) {
                            i6Var.f21476l = 4294967296L;
                        } else {
                            i6Var.f21476l = i12;
                        }
                    } else if (i13 == 3) {
                        int B03 = org.telegram.ui.ActionBar.k6.B0(org.telegram.ui.ActionBar.k6.Qd);
                        if (i12 == 0 && B03 != 0) {
                            i6Var.f21477m = 4294967296L;
                        } else {
                            i6Var.f21477m = i12;
                        }
                    }
                    org.telegram.ui.ActionBar.k6.n1(true, false);
                    ed1Var.S.setHasChanges(ed1Var.T0(ed1Var.f36521n));
                    ed1Var.m1(true);
                } else if (i14 == 3) {
                    if (i13 == 0) {
                        i6Var.f21470e = i12;
                    } else if (i13 == 1) {
                        i6Var.f21471f = i12;
                    } else if (i13 == 2) {
                        int i15 = i6Var.f21472g;
                        i6Var.f21472g = i12;
                        if (i15 != 0 && i12 == 0) {
                            ed1Var.f36534s0.u(0);
                        } else if (i15 == 0 && i12 != 0) {
                            ed1Var.f36534s0.o(0);
                            ed1Var.e1();
                        }
                    } else {
                        i6Var.h = i12;
                    }
                    int i16 = ed1Var.U;
                    if (i16 >= 0) {
                        ed1Var.H0[1].b(i16, i12);
                    }
                    org.telegram.ui.ActionBar.k6.n1(true, true);
                    ed1Var.f36531r0.f1();
                    ed1Var.S.setHasChanges(ed1Var.T0(ed1Var.f36521n));
                    ed1Var.m1(true);
                }
                int size = ed1Var.f36505f0.size();
                for (int i17 = 0; i17 < size; i17++) {
                    org.telegram.ui.ActionBar.m6 m6Var = (org.telegram.ui.ActionBar.m6) ed1Var.f36505f0.get(i17);
                    m6Var.d(ed1Var.getThemedColor(m6Var.f22143f), false, false);
                }
                ed1Var.f36517k0.f1();
                ed1Var.f36531r0.f1();
                fg.i0 i0Var = ed1Var.X;
                if (i0Var != null) {
                    i0Var.invalidate();
                }
                ed1Var.U = -1;
                return;
            case 1:
                ed1Var.presentFragment(ha1.d0(ed1Var.getMessagesController().getChat(Long.valueOf(-ed1Var.G1)), true));
                return;
            case 2:
                ed1Var.f36520m1.l1(false);
                boolean a2 = ed1Var.f36486a.a();
                org.telegram.ui.Components.ij0 ij0Var = ed1Var.K1;
                if (a2) {
                    i10 = ij0Var.f27817e[0];
                } else {
                    i10 = 0;
                }
                ij0Var.N(i10);
                org.telegram.ui.Components.ij0 ij0Var2 = ed1Var.K1;
                if (ij0Var2 != null) {
                    ij0Var2.start();
                }
                ed1Var.b1(false);
                ed1Var.V0();
                ed1Var.i1();
                if (ed1Var.f36505f0 != null) {
                    for (int i18 = 0; i18 < ed1Var.f36505f0.size(); i18++) {
                        ((org.telegram.ui.ActionBar.m6) ed1Var.f36505f0.get(i18)).d(ed1Var.getThemedColor(((org.telegram.ui.ActionBar.m6) ed1Var.f36505f0.get(i18)).f22143f), false, false);
                    }
                }
                if (ed1Var.J1) {
                    vc1 vc1Var = ed1Var.f36520m1;
                    if (vc1Var != null && vc1Var.a()) {
                        ed1Var.O1.setVisibility(0);
                        ed1Var.O1.a(ed1Var.f36518k1);
                    } else {
                        ed1Var.O1.a(0.0f);
                    }
                    ValueAnimator valueAnimator = ed1Var.M1;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        ed1Var.M1.cancel();
                    }
                    float f11 = ed1Var.l1;
                    if (ed1Var.f36520m1.a()) {
                        f10 = 1.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
                    ed1Var.M1 = ofFloat;
                    ofFloat.addUpdateListener(new j11(ed1Var, 13));
                    ed1Var.M1.addListener(new ic1(ed1Var, 5));
                    ed1Var.M1.setDuration(250L);
                    ed1Var.M1.setInterpolator(org.telegram.ui.Components.pr.f30183f);
                    ed1Var.M1.start();
                    return;
                }
                return;
            default:
                if (ed1Var.getParentActivity() != null && ed1Var.getParentActivity() != null) {
                    SharedConfig.increaseDayNightWallpaperSiwtchHint();
                    org.telegram.ui.Components.m40 m40Var = new org.telegram.ui.Components.m40(7, ed1Var.getParentActivity(), null, true);
                    m40Var.setAlpha(0.0f);
                    m40Var.setVisibility(4);
                    m40Var.setShowingDuration(4000L);
                    ed1Var.f36511h0.addView(m40Var, k7.c6.d(-2, -2.0f, 51, 4.0f, 0.0f, 4.0f, 0.0f));
                    if (ed1Var.f36520m1.a()) {
                        m40Var.setText(LocaleController.getString(R.string.PreviewWallpaperDay));
                    } else {
                        m40Var.setText(LocaleController.getString(R.string.PreviewWallpaperNight));
                    }
                    m40Var.d();
                    m40Var.f(ed1Var.L1, true);
                    m40Var.setExtraTranslationY(-AndroidUtilities.dp(14.0f));
                    return;
                }
                return;
        }
    }
}
