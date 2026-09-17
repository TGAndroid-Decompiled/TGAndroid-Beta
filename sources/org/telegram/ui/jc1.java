package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
public final class jc1 implements Runnable {
    public final int f37773a;
    public final wd1 f37774b;

    public jc1(wd1 wd1Var, int i10) {
        this.f37773a = i10;
        this.f37774b = wd1Var;
    }

    @Override
    public final void run() {
        int i10;
        int i11 = this.f37773a;
        float f7 = 0.0f;
        wd1 wd1Var = this.f37774b;
        switch (i11) {
            case 0:
                wd1Var.Z = false;
                int i12 = wd1Var.W;
                int i13 = wd1Var.X;
                org.telegram.ui.ActionBar.h6 h6Var = wd1Var.f41992s;
                int i14 = wd1Var.f41980n;
                if (i14 == 1) {
                    if (i13 == 0) {
                        h6Var.f20520c = i12;
                        org.telegram.ui.ActionBar.j6.n1(false, false);
                    } else if (i13 == 1) {
                        h6Var.d = i12;
                        org.telegram.ui.ActionBar.j6.n1(true, true);
                        wd1Var.f41997u0.e1();
                        wd1Var.V.setHasChanges(wd1Var.T0(wd1Var.f41980n));
                        wd1Var.m1(true);
                    }
                } else if (i14 == 2) {
                    if (i13 == 0) {
                        h6Var.f20525j = i12;
                    } else if (i13 == 1) {
                        int B0 = org.telegram.ui.ActionBar.j6.B0(org.telegram.ui.ActionBar.j6.Od);
                        if (i12 == 0 && B0 != 0) {
                            h6Var.f20526k = 4294967296L;
                        } else {
                            h6Var.f20526k = i12;
                        }
                    } else if (i13 == 2) {
                        int B02 = org.telegram.ui.ActionBar.j6.B0(org.telegram.ui.ActionBar.j6.Pd);
                        if (i12 == 0 && B02 != 0) {
                            h6Var.f20527l = 4294967296L;
                        } else {
                            h6Var.f20527l = i12;
                        }
                    } else if (i13 == 3) {
                        int B03 = org.telegram.ui.ActionBar.j6.B0(org.telegram.ui.ActionBar.j6.Qd);
                        if (i12 == 0 && B03 != 0) {
                            h6Var.f20528m = 4294967296L;
                        } else {
                            h6Var.f20528m = i12;
                        }
                    }
                    org.telegram.ui.ActionBar.j6.n1(true, false);
                    wd1Var.V.setHasChanges(wd1Var.T0(wd1Var.f41980n));
                    wd1Var.m1(true);
                } else if (i14 == 3) {
                    if (i13 == 0) {
                        h6Var.f20521e = i12;
                    } else if (i13 == 1) {
                        h6Var.f20522f = i12;
                    } else if (i13 == 2) {
                        int i15 = h6Var.f20523g;
                        h6Var.f20523g = i12;
                        if (i15 != 0 && i12 == 0) {
                            wd1Var.f41999v0.u(0);
                        } else if (i15 == 0 && i12 != 0) {
                            wd1Var.f41999v0.o(0);
                            wd1Var.e1();
                        }
                    } else {
                        h6Var.h = i12;
                    }
                    int i16 = wd1Var.X;
                    if (i16 >= 0) {
                        wd1Var.K0[1].b(i16, i12);
                    }
                    org.telegram.ui.ActionBar.j6.n1(true, true);
                    wd1Var.f41997u0.e1();
                    wd1Var.V.setHasChanges(wd1Var.T0(wd1Var.f41980n));
                    wd1Var.m1(true);
                }
                int size = wd1Var.f41970i0.size();
                for (int i17 = 0; i17 < size; i17++) {
                    org.telegram.ui.ActionBar.l6 l6Var = (org.telegram.ui.ActionBar.l6) wd1Var.f41970i0.get(i17);
                    l6Var.d(wd1Var.getThemedColor(l6Var.f21205f), false, false);
                }
                wd1Var.f41981n0.e1();
                wd1Var.f41997u0.e1();
                di.r6 r6Var = wd1Var.f41943a0;
                if (r6Var != null) {
                    r6Var.invalidate();
                }
                wd1Var.X = -1;
                return;
            case 1:
                wd1Var.presentFragment(bb1.d0(wd1Var.getMessagesController().getChat(Long.valueOf(-wd1Var.J1)), true));
                return;
            case 2:
                wd1Var.f41986p1.p1(false);
                boolean a2 = wd1Var.f41942a.a();
                org.telegram.ui.Components.xi0 xi0Var = wd1Var.N1;
                if (a2) {
                    i10 = xi0Var.f32585e[0];
                } else {
                    i10 = 0;
                }
                xi0Var.N(i10);
                org.telegram.ui.Components.xi0 xi0Var2 = wd1Var.N1;
                if (xi0Var2 != null) {
                    xi0Var2.start();
                }
                wd1Var.b1(false);
                wd1Var.V0();
                wd1Var.i1();
                if (wd1Var.f41970i0 != null) {
                    for (int i18 = 0; i18 < wd1Var.f41970i0.size(); i18++) {
                        ((org.telegram.ui.ActionBar.l6) wd1Var.f41970i0.get(i18)).d(wd1Var.getThemedColor(((org.telegram.ui.ActionBar.l6) wd1Var.f41970i0.get(i18)).f21205f), false, false);
                    }
                }
                if (wd1Var.M1) {
                    nd1 nd1Var = wd1Var.f41986p1;
                    if (nd1Var != null && nd1Var.a()) {
                        wd1Var.R1.setVisibility(0);
                        wd1Var.R1.a(wd1Var.f41982n1);
                    } else {
                        wd1Var.R1.a(0.0f);
                    }
                    ValueAnimator valueAnimator = wd1Var.P1;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        wd1Var.P1.cancel();
                    }
                    float f10 = wd1Var.f41984o1;
                    if (wd1Var.f41986p1.a()) {
                        f7 = 1.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
                    wd1Var.P1 = ofFloat;
                    ofFloat.addUpdateListener(new b21(wd1Var, 13));
                    wd1Var.P1.addListener(new ad1(wd1Var, 5));
                    wd1Var.P1.setDuration(250L);
                    wd1Var.P1.setInterpolator(org.telegram.ui.Components.pr.f29494f);
                    wd1Var.P1.start();
                    return;
                }
                return;
            default:
                if (wd1Var.getParentActivity() != null && wd1Var.getParentActivity() != null) {
                    SharedConfig.increaseDayNightWallpaperSiwtchHint();
                    org.telegram.ui.Components.i40 i40Var = new org.telegram.ui.Components.i40(7, wd1Var.getParentActivity(), null, true);
                    i40Var.setAlpha(0.0f);
                    i40Var.setVisibility(4);
                    i40Var.setShowingDuration(4000L);
                    wd1Var.f41976k0.addView(i40Var, w7.x5.d(-2, -2.0f, 51, 4.0f, 0.0f, 4.0f, 0.0f));
                    if (wd1Var.f41986p1.a()) {
                        i40Var.setText(LocaleController.getString(R.string.PreviewWallpaperDay));
                    } else {
                        i40Var.setText(LocaleController.getString(R.string.PreviewWallpaperNight));
                    }
                    i40Var.d();
                    i40Var.f(wd1Var.O1, true);
                    i40Var.setExtraTranslationY(-AndroidUtilities.dp(14.0f));
                    return;
                }
                return;
        }
    }
}
