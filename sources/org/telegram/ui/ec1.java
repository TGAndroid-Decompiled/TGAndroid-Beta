package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
public final class ec1 implements Runnable {
    public final int f35987a;
    public final rd1 f35988b;

    public ec1(rd1 rd1Var, int i10) {
        this.f35987a = i10;
        this.f35988b = rd1Var;
    }

    @Override
    public final void run() {
        int i10;
        int i11 = this.f35987a;
        float f7 = 0.0f;
        rd1 rd1Var = this.f35988b;
        switch (i11) {
            case 0:
                rd1Var.Z = false;
                int i12 = rd1Var.W;
                int i13 = rd1Var.X;
                org.telegram.ui.ActionBar.f6 f6Var = rd1Var.f40087s;
                int i14 = rd1Var.f40075n;
                if (i14 == 1) {
                    if (i13 == 0) {
                        f6Var.f20617c = i12;
                        org.telegram.ui.ActionBar.i6.n1(false, false);
                    } else if (i13 == 1) {
                        f6Var.d = i12;
                        org.telegram.ui.ActionBar.i6.n1(true, true);
                        rd1Var.f40092u0.h1();
                        rd1Var.V.setHasChanges(rd1Var.T0(rd1Var.f40075n));
                        rd1Var.m1(true);
                    }
                } else if (i14 == 2) {
                    if (i13 == 0) {
                        f6Var.f20622j = i12;
                    } else if (i13 == 1) {
                        int B0 = org.telegram.ui.ActionBar.i6.B0(org.telegram.ui.ActionBar.i6.Od);
                        if (i12 == 0 && B0 != 0) {
                            f6Var.f20623k = 4294967296L;
                        } else {
                            f6Var.f20623k = i12;
                        }
                    } else if (i13 == 2) {
                        int B02 = org.telegram.ui.ActionBar.i6.B0(org.telegram.ui.ActionBar.i6.Pd);
                        if (i12 == 0 && B02 != 0) {
                            f6Var.f20624l = 4294967296L;
                        } else {
                            f6Var.f20624l = i12;
                        }
                    } else if (i13 == 3) {
                        int B03 = org.telegram.ui.ActionBar.i6.B0(org.telegram.ui.ActionBar.i6.Qd);
                        if (i12 == 0 && B03 != 0) {
                            f6Var.f20625m = 4294967296L;
                        } else {
                            f6Var.f20625m = i12;
                        }
                    }
                    org.telegram.ui.ActionBar.i6.n1(true, false);
                    rd1Var.V.setHasChanges(rd1Var.T0(rd1Var.f40075n));
                    rd1Var.m1(true);
                } else if (i14 == 3) {
                    if (i13 == 0) {
                        f6Var.f20618e = i12;
                    } else if (i13 == 1) {
                        f6Var.f20619f = i12;
                    } else if (i13 == 2) {
                        int i15 = f6Var.f20620g;
                        f6Var.f20620g = i12;
                        if (i15 != 0 && i12 == 0) {
                            rd1Var.f40094v0.u(0);
                        } else if (i15 == 0 && i12 != 0) {
                            rd1Var.f40094v0.o(0);
                            rd1Var.e1();
                        }
                    } else {
                        f6Var.h = i12;
                    }
                    int i16 = rd1Var.X;
                    if (i16 >= 0) {
                        rd1Var.K0[1].b(i16, i12);
                    }
                    org.telegram.ui.ActionBar.i6.n1(true, true);
                    rd1Var.f40092u0.h1();
                    rd1Var.V.setHasChanges(rd1Var.T0(rd1Var.f40075n));
                    rd1Var.m1(true);
                }
                int size = rd1Var.f40065i0.size();
                for (int i17 = 0; i17 < size; i17++) {
                    org.telegram.ui.ActionBar.k6 k6Var = (org.telegram.ui.ActionBar.k6) rd1Var.f40065i0.get(i17);
                    k6Var.e(rd1Var.getThemedColor(k6Var.f21342f), false, false);
                }
                rd1Var.f40076n0.h1();
                rd1Var.f40092u0.h1();
                ci.r6 r6Var = rd1Var.f40038a0;
                if (r6Var != null) {
                    r6Var.invalidate();
                }
                rd1Var.X = -1;
                return;
            case 1:
                rd1Var.presentFragment(va1.b0(rd1Var.getMessagesController().getChat(Long.valueOf(-rd1Var.J1)), true));
                return;
            case 2:
                rd1Var.f40081p1.q1(false);
                boolean a2 = rd1Var.f40037a.a();
                org.telegram.ui.Components.kj0 kj0Var = rd1Var.N1;
                if (a2) {
                    i10 = kj0Var.f28130e[0];
                } else {
                    i10 = 0;
                }
                kj0Var.P(i10);
                org.telegram.ui.Components.kj0 kj0Var2 = rd1Var.N1;
                if (kj0Var2 != null) {
                    kj0Var2.start();
                }
                rd1Var.b1(false);
                rd1Var.V0();
                rd1Var.i1();
                if (rd1Var.f40065i0 != null) {
                    for (int i18 = 0; i18 < rd1Var.f40065i0.size(); i18++) {
                        ((org.telegram.ui.ActionBar.k6) rd1Var.f40065i0.get(i18)).e(rd1Var.getThemedColor(((org.telegram.ui.ActionBar.k6) rd1Var.f40065i0.get(i18)).f21342f), false, false);
                    }
                }
                if (rd1Var.M1) {
                    id1 id1Var = rd1Var.f40081p1;
                    if (id1Var != null && id1Var.a()) {
                        rd1Var.R1.setVisibility(0);
                        rd1Var.R1.a(rd1Var.f40077n1);
                    } else {
                        rd1Var.R1.a(0.0f);
                    }
                    ValueAnimator valueAnimator = rd1Var.P1;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        rd1Var.P1.cancel();
                    }
                    float f10 = rd1Var.f40079o1;
                    if (rd1Var.f40081p1.a()) {
                        f7 = 1.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
                    rd1Var.P1 = ofFloat;
                    ofFloat.addUpdateListener(new b21(rd1Var, 12));
                    rd1Var.P1.addListener(new vc1(rd1Var, 5));
                    rd1Var.P1.setDuration(250L);
                    rd1Var.P1.setInterpolator(org.telegram.ui.Components.tr.f31147f);
                    rd1Var.P1.start();
                    return;
                }
                return;
            default:
                if (rd1Var.getParentActivity() != null && rd1Var.getParentActivity() != null) {
                    SharedConfig.increaseDayNightWallpaperSiwtchHint();
                    org.telegram.ui.Components.m40 m40Var = new org.telegram.ui.Components.m40(7, rd1Var.getParentActivity(), null, true);
                    m40Var.setAlpha(0.0f);
                    m40Var.setVisibility(4);
                    m40Var.setShowingDuration(4000L);
                    rd1Var.f40071k0.addView(m40Var, w7.z5.d(-2, -2.0f, 51, 4.0f, 0.0f, 4.0f, 0.0f));
                    if (rd1Var.f40081p1.a()) {
                        m40Var.setText(LocaleController.getString(R.string.PreviewWallpaperDay));
                    } else {
                        m40Var.setText(LocaleController.getString(R.string.PreviewWallpaperNight));
                    }
                    m40Var.d();
                    m40Var.f(rd1Var.O1, true);
                    m40Var.setExtraTranslationY(-AndroidUtilities.dp(14.0f));
                    return;
                }
                return;
        }
    }
}
