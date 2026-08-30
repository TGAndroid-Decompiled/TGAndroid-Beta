package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
public final class ob1 implements Runnable {
    public final int f36867a;
    public final cd1 f36868b;

    public ob1(cd1 cd1Var, int i10) {
        this.f36867a = i10;
        this.f36868b = cd1Var;
    }

    @Override
    public final void run() {
        int i10;
        int i11 = this.f36867a;
        float f10 = 0.0f;
        cd1 cd1Var = this.f36868b;
        switch (i11) {
            case 0:
                cd1Var.W = false;
                int i12 = cd1Var.T;
                int i13 = cd1Var.U;
                org.telegram.ui.ActionBar.h6 h6Var = cd1Var.f33333s;
                int i14 = cd1Var.f33321n;
                if (i14 == 1) {
                    if (i13 == 0) {
                        h6Var.f19763c = i12;
                        org.telegram.ui.ActionBar.j6.n1(false, false);
                    } else if (i13 == 1) {
                        h6Var.d = i12;
                        org.telegram.ui.ActionBar.j6.n1(true, true);
                        cd1Var.f33331r0.f1();
                        cd1Var.S.setHasChanges(cd1Var.T0(cd1Var.f33321n));
                        cd1Var.m1(true);
                    }
                } else if (i14 == 2) {
                    if (i13 == 0) {
                        h6Var.f19767j = i12;
                    } else if (i13 == 1) {
                        int B0 = org.telegram.ui.ActionBar.j6.B0(org.telegram.ui.ActionBar.j6.Od);
                        if (i12 == 0 && B0 != 0) {
                            h6Var.f19768k = 4294967296L;
                        } else {
                            h6Var.f19768k = i12;
                        }
                    } else if (i13 == 2) {
                        int B02 = org.telegram.ui.ActionBar.j6.B0(org.telegram.ui.ActionBar.j6.Pd);
                        if (i12 == 0 && B02 != 0) {
                            h6Var.f19769l = 4294967296L;
                        } else {
                            h6Var.f19769l = i12;
                        }
                    } else if (i13 == 3) {
                        int B03 = org.telegram.ui.ActionBar.j6.B0(org.telegram.ui.ActionBar.j6.Qd);
                        if (i12 == 0 && B03 != 0) {
                            h6Var.f19770m = 4294967296L;
                        } else {
                            h6Var.f19770m = i12;
                        }
                    }
                    org.telegram.ui.ActionBar.j6.n1(true, false);
                    cd1Var.S.setHasChanges(cd1Var.T0(cd1Var.f33321n));
                    cd1Var.m1(true);
                } else if (i14 == 3) {
                    if (i13 == 0) {
                        h6Var.e = i12;
                    } else if (i13 == 1) {
                        h6Var.f19764f = i12;
                    } else if (i13 == 2) {
                        int i15 = h6Var.f19765g;
                        h6Var.f19765g = i12;
                        if (i15 != 0 && i12 == 0) {
                            cd1Var.f33334s0.u(0);
                        } else if (i15 == 0 && i12 != 0) {
                            cd1Var.f33334s0.o(0);
                            cd1Var.e1();
                        }
                    } else {
                        h6Var.h = i12;
                    }
                    int i16 = cd1Var.U;
                    if (i16 >= 0) {
                        cd1Var.H0[1].b(i16, i12);
                    }
                    org.telegram.ui.ActionBar.j6.n1(true, true);
                    cd1Var.f33331r0.f1();
                    cd1Var.S.setHasChanges(cd1Var.T0(cd1Var.f33321n));
                    cd1Var.m1(true);
                }
                int size = cd1Var.f33305f0.size();
                for (int i17 = 0; i17 < size; i17++) {
                    org.telegram.ui.ActionBar.l6 l6Var = (org.telegram.ui.ActionBar.l6) cd1Var.f33305f0.get(i17);
                    l6Var.d(cd1Var.getThemedColor(l6Var.f20434f), false, false);
                }
                cd1Var.f33317k0.f1();
                cd1Var.f33331r0.f1();
                eg.i0 i0Var = cd1Var.X;
                if (i0Var != null) {
                    i0Var.invalidate();
                }
                cd1Var.U = -1;
                return;
            case 1:
                cd1Var.presentFragment(ga1.d0(cd1Var.getMessagesController().getChat(Long.valueOf(-cd1Var.G1)), true));
                return;
            case 2:
                cd1Var.f33320m1.n1(false);
                boolean a2 = cd1Var.f33287a.a();
                org.telegram.ui.Components.gj0 gj0Var = cd1Var.K1;
                if (a2) {
                    i10 = gj0Var.e[0];
                } else {
                    i10 = 0;
                }
                gj0Var.N(i10);
                org.telegram.ui.Components.gj0 gj0Var2 = cd1Var.K1;
                if (gj0Var2 != null) {
                    gj0Var2.start();
                }
                cd1Var.b1(false);
                cd1Var.V0();
                cd1Var.i1();
                if (cd1Var.f33305f0 != null) {
                    for (int i18 = 0; i18 < cd1Var.f33305f0.size(); i18++) {
                        ((org.telegram.ui.ActionBar.l6) cd1Var.f33305f0.get(i18)).d(cd1Var.getThemedColor(((org.telegram.ui.ActionBar.l6) cd1Var.f33305f0.get(i18)).f20434f), false, false);
                    }
                }
                if (cd1Var.J1) {
                    tc1 tc1Var = cd1Var.f33320m1;
                    if (tc1Var != null && tc1Var.a()) {
                        cd1Var.O1.setVisibility(0);
                        cd1Var.O1.a(cd1Var.f33318k1);
                    } else {
                        cd1Var.O1.a(0.0f);
                    }
                    ValueAnimator valueAnimator = cd1Var.M1;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        cd1Var.M1.cancel();
                    }
                    float f11 = cd1Var.l1;
                    if (cd1Var.f33320m1.a()) {
                        f10 = 1.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
                    cd1Var.M1 = ofFloat;
                    ofFloat.addUpdateListener(new h11(cd1Var, 13));
                    cd1Var.M1.addListener(new gc1(cd1Var, 5));
                    cd1Var.M1.setDuration(250L);
                    cd1Var.M1.setInterpolator(org.telegram.ui.Components.nr.f27346f);
                    cd1Var.M1.start();
                    return;
                }
                return;
            default:
                if (cd1Var.getParentActivity() != null && cd1Var.getParentActivity() != null) {
                    SharedConfig.increaseDayNightWallpaperSiwtchHint();
                    org.telegram.ui.Components.k40 k40Var = new org.telegram.ui.Components.k40(7, cd1Var.getParentActivity(), null, true);
                    k40Var.setAlpha(0.0f);
                    k40Var.setVisibility(4);
                    k40Var.setShowingDuration(4000L);
                    cd1Var.f33311h0.addView(k40Var, k7.b6.d(-2, -2.0f, 51, 4.0f, 0.0f, 4.0f, 0.0f));
                    if (cd1Var.f33320m1.a()) {
                        k40Var.setText(LocaleController.getString(R.string.PreviewWallpaperDay));
                    } else {
                        k40Var.setText(LocaleController.getString(R.string.PreviewWallpaperNight));
                    }
                    k40Var.d();
                    k40Var.f(cd1Var.L1, true);
                    k40Var.setExtraTranslationY(-AndroidUtilities.dp(14.0f));
                    return;
                }
                return;
        }
    }
}
