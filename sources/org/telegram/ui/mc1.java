package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
public final class mc1 implements Runnable {
    public final int f40002a;
    public final zd1 f40003b;

    public mc1(zd1 zd1Var, int i10) {
        this.f40002a = i10;
        this.f40003b = zd1Var;
    }

    @Override
    public final void run() {
        int i10;
        int i11 = this.f40002a;
        float f7 = 0.0f;
        zd1 zd1Var = this.f40003b;
        switch (i11) {
            case 0:
                zd1Var.Z = false;
                int i12 = zd1Var.W;
                int i13 = zd1Var.X;
                org.telegram.ui.ActionBar.e6 e6Var = zd1Var.f44779s;
                int i14 = zd1Var.f44767n;
                if (i14 == 1) {
                    if (i13 == 0) {
                        e6Var.f20351c = i12;
                        org.telegram.ui.ActionBar.h6.o1(false, false);
                    } else if (i13 == 1) {
                        e6Var.d = i12;
                        org.telegram.ui.ActionBar.h6.o1(true, true);
                        zd1Var.f44784u0.f1();
                        zd1Var.V.setHasChanges(zd1Var.T0(zd1Var.f44767n));
                        zd1Var.m1(true);
                    }
                } else if (i14 == 2) {
                    if (i13 == 0) {
                        e6Var.f20356j = i12;
                    } else if (i13 == 1) {
                        int C0 = org.telegram.ui.ActionBar.h6.C0(org.telegram.ui.ActionBar.h6.Od);
                        if (i12 == 0 && C0 != 0) {
                            e6Var.f20357k = 4294967296L;
                        } else {
                            e6Var.f20357k = i12;
                        }
                    } else if (i13 == 2) {
                        int C02 = org.telegram.ui.ActionBar.h6.C0(org.telegram.ui.ActionBar.h6.Pd);
                        if (i12 == 0 && C02 != 0) {
                            e6Var.f20358l = 4294967296L;
                        } else {
                            e6Var.f20358l = i12;
                        }
                    } else if (i13 == 3) {
                        int C03 = org.telegram.ui.ActionBar.h6.C0(org.telegram.ui.ActionBar.h6.Qd);
                        if (i12 == 0 && C03 != 0) {
                            e6Var.f20359m = 4294967296L;
                        } else {
                            e6Var.f20359m = i12;
                        }
                    }
                    org.telegram.ui.ActionBar.h6.o1(true, false);
                    zd1Var.V.setHasChanges(zd1Var.T0(zd1Var.f44767n));
                    zd1Var.m1(true);
                } else if (i14 == 3) {
                    if (i13 == 0) {
                        e6Var.f20352e = i12;
                    } else if (i13 == 1) {
                        e6Var.f20353f = i12;
                    } else if (i13 == 2) {
                        int i15 = e6Var.f20354g;
                        e6Var.f20354g = i12;
                        if (i15 != 0 && i12 == 0) {
                            zd1Var.f44786v0.u(0);
                        } else if (i15 == 0 && i12 != 0) {
                            zd1Var.f44786v0.o(0);
                            zd1Var.e1();
                        }
                    } else {
                        e6Var.h = i12;
                    }
                    int i16 = zd1Var.X;
                    if (i16 >= 0) {
                        zd1Var.K0[1].b(i16, i12);
                    }
                    org.telegram.ui.ActionBar.h6.o1(true, true);
                    zd1Var.f44784u0.f1();
                    zd1Var.V.setHasChanges(zd1Var.T0(zd1Var.f44767n));
                    zd1Var.m1(true);
                }
                int size = zd1Var.f44757i0.size();
                for (int i17 = 0; i17 < size; i17++) {
                    org.telegram.ui.ActionBar.j6 j6Var = (org.telegram.ui.ActionBar.j6) zd1Var.f44757i0.get(i17);
                    j6Var.e(zd1Var.getThemedColor(j6Var.f21021f), false, false);
                }
                zd1Var.f44768n0.f1();
                zd1Var.f44784u0.f1();
                ci.r6 r6Var = zd1Var.f44730a0;
                if (r6Var != null) {
                    r6Var.invalidate();
                }
                zd1Var.X = -1;
                return;
            case 1:
                zd1Var.presentFragment(db1.d0(zd1Var.getMessagesController().getChat(Long.valueOf(-zd1Var.J1)), true));
                return;
            case 2:
                zd1Var.f44773p1.l1(false);
                boolean a2 = zd1Var.f44729a.a();
                org.telegram.ui.Components.fk0 fk0Var = zd1Var.N1;
                if (a2) {
                    i10 = fk0Var.f26107e[0];
                } else {
                    i10 = 0;
                }
                fk0Var.P(i10);
                org.telegram.ui.Components.fk0 fk0Var2 = zd1Var.N1;
                if (fk0Var2 != null) {
                    fk0Var2.start();
                }
                zd1Var.b1(false);
                zd1Var.V0();
                zd1Var.i1();
                if (zd1Var.f44757i0 != null) {
                    for (int i18 = 0; i18 < zd1Var.f44757i0.size(); i18++) {
                        ((org.telegram.ui.ActionBar.j6) zd1Var.f44757i0.get(i18)).e(zd1Var.getThemedColor(((org.telegram.ui.ActionBar.j6) zd1Var.f44757i0.get(i18)).f21021f), false, false);
                    }
                }
                if (zd1Var.M1) {
                    qd1 qd1Var = zd1Var.f44773p1;
                    if (qd1Var != null && qd1Var.a()) {
                        zd1Var.R1.setVisibility(0);
                        zd1Var.R1.a(zd1Var.f44769n1);
                    } else {
                        zd1Var.R1.a(0.0f);
                    }
                    ValueAnimator valueAnimator = zd1Var.P1;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        zd1Var.P1.cancel();
                    }
                    float f10 = zd1Var.f44771o1;
                    if (zd1Var.f44773p1.a()) {
                        f7 = 1.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
                    zd1Var.P1 = ofFloat;
                    ofFloat.addUpdateListener(new a21(zd1Var, 13));
                    zd1Var.P1.addListener(new dd1(zd1Var, 5));
                    zd1Var.P1.setDuration(250L);
                    zd1Var.P1.setInterpolator(org.telegram.ui.Components.js.f27627f);
                    zd1Var.P1.start();
                    return;
                }
                return;
            default:
                if (zd1Var.getParentActivity() != null && zd1Var.getParentActivity() != null) {
                    SharedConfig.increaseDayNightWallpaperSiwtchHint();
                    org.telegram.ui.Components.c50 c50Var = new org.telegram.ui.Components.c50(7, zd1Var.getParentActivity(), null, true);
                    c50Var.setAlpha(0.0f);
                    c50Var.setVisibility(4);
                    c50Var.setShowingDuration(4000L);
                    zd1Var.f44763k0.addView(c50Var, w7.w5.a(-2.0f, 4.0f, 0.0f, 4.0f, 0.0f, -2, 51));
                    if (zd1Var.f44773p1.a()) {
                        c50Var.setText(LocaleController.getString(R.string.PreviewWallpaperDay));
                    } else {
                        c50Var.setText(LocaleController.getString(R.string.PreviewWallpaperNight));
                    }
                    c50Var.d();
                    c50Var.f(zd1Var.O1, true);
                    c50Var.setExtraTranslationY(-AndroidUtilities.dp(14.0f));
                    return;
                }
                return;
        }
    }
}
