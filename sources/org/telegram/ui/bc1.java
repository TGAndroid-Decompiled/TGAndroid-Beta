package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
public final class bc1 implements Runnable {
    public final int f32385a;
    public final od1 f32386b;

    public bc1(od1 od1Var, int i10) {
        this.f32385a = i10;
        this.f32386b = od1Var;
    }

    @Override
    public final void run() {
        int i10;
        int i11 = this.f32385a;
        float f7 = 0.0f;
        od1 od1Var = this.f32386b;
        switch (i11) {
            case 0:
                od1Var.Z = false;
                int i12 = od1Var.W;
                int i13 = od1Var.X;
                org.telegram.ui.ActionBar.f6 f6Var = od1Var.f36200s;
                int i14 = od1Var.f36188n;
                if (i14 == 1) {
                    if (i13 == 0) {
                        f6Var.f18887c = i12;
                        org.telegram.ui.ActionBar.h6.n1(false, false);
                    } else if (i13 == 1) {
                        f6Var.d = i12;
                        org.telegram.ui.ActionBar.h6.n1(true, true);
                        od1Var.f36205u0.f1();
                        od1Var.V.setHasChanges(od1Var.T0(od1Var.f36188n));
                        od1Var.m1(true);
                    }
                } else if (i14 == 2) {
                    if (i13 == 0) {
                        f6Var.f18891j = i12;
                    } else if (i13 == 1) {
                        int B0 = org.telegram.ui.ActionBar.h6.B0(org.telegram.ui.ActionBar.h6.Od);
                        if (i12 == 0 && B0 != 0) {
                            f6Var.f18892k = 4294967296L;
                        } else {
                            f6Var.f18892k = i12;
                        }
                    } else if (i13 == 2) {
                        int B02 = org.telegram.ui.ActionBar.h6.B0(org.telegram.ui.ActionBar.h6.Pd);
                        if (i12 == 0 && B02 != 0) {
                            f6Var.f18893l = 4294967296L;
                        } else {
                            f6Var.f18893l = i12;
                        }
                    } else if (i13 == 3) {
                        int B03 = org.telegram.ui.ActionBar.h6.B0(org.telegram.ui.ActionBar.h6.Qd);
                        if (i12 == 0 && B03 != 0) {
                            f6Var.f18894m = 4294967296L;
                        } else {
                            f6Var.f18894m = i12;
                        }
                    }
                    org.telegram.ui.ActionBar.h6.n1(true, false);
                    od1Var.V.setHasChanges(od1Var.T0(od1Var.f36188n));
                    od1Var.m1(true);
                } else if (i14 == 3) {
                    if (i13 == 0) {
                        f6Var.e = i12;
                    } else if (i13 == 1) {
                        f6Var.f18888f = i12;
                    } else if (i13 == 2) {
                        int i15 = f6Var.f18889g;
                        f6Var.f18889g = i12;
                        if (i15 != 0 && i12 == 0) {
                            od1Var.f36207v0.u(0);
                        } else if (i15 == 0 && i12 != 0) {
                            od1Var.f36207v0.o(0);
                            od1Var.e1();
                        }
                    } else {
                        f6Var.h = i12;
                    }
                    int i16 = od1Var.X;
                    if (i16 >= 0) {
                        od1Var.K0[1].b(i16, i12);
                    }
                    org.telegram.ui.ActionBar.h6.n1(true, true);
                    od1Var.f36205u0.f1();
                    od1Var.V.setHasChanges(od1Var.T0(od1Var.f36188n));
                    od1Var.m1(true);
                }
                int size = od1Var.f36178i0.size();
                for (int i17 = 0; i17 < size; i17++) {
                    org.telegram.ui.ActionBar.j6 j6Var = (org.telegram.ui.ActionBar.j6) od1Var.f36178i0.get(i17);
                    j6Var.e(od1Var.getThemedColor(j6Var.f19517f), false, false);
                }
                od1Var.f36189n0.f1();
                od1Var.f36205u0.f1();
                ci.r6 r6Var = od1Var.f36152a0;
                if (r6Var != null) {
                    r6Var.invalidate();
                }
                od1Var.X = -1;
                return;
            case 1:
                od1Var.presentFragment(sa1.d0(od1Var.getMessagesController().getChat(Long.valueOf(-od1Var.J1)), true));
                return;
            case 2:
                od1Var.f36194p1.o1(false);
                boolean a2 = od1Var.f36151a.a();
                org.telegram.ui.Components.jj0 jj0Var = od1Var.N1;
                if (a2) {
                    i10 = jj0Var.e[0];
                } else {
                    i10 = 0;
                }
                jj0Var.P(i10);
                org.telegram.ui.Components.jj0 jj0Var2 = od1Var.N1;
                if (jj0Var2 != null) {
                    jj0Var2.start();
                }
                od1Var.b1(false);
                od1Var.V0();
                od1Var.i1();
                if (od1Var.f36178i0 != null) {
                    for (int i18 = 0; i18 < od1Var.f36178i0.size(); i18++) {
                        ((org.telegram.ui.ActionBar.j6) od1Var.f36178i0.get(i18)).e(od1Var.getThemedColor(((org.telegram.ui.ActionBar.j6) od1Var.f36178i0.get(i18)).f19517f), false, false);
                    }
                }
                if (od1Var.M1) {
                    fd1 fd1Var = od1Var.f36194p1;
                    if (fd1Var != null && fd1Var.a()) {
                        od1Var.R1.setVisibility(0);
                        od1Var.R1.a(od1Var.f36190n1);
                    } else {
                        od1Var.R1.a(0.0f);
                    }
                    ValueAnimator valueAnimator = od1Var.P1;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        od1Var.P1.cancel();
                    }
                    float f10 = od1Var.f36192o1;
                    if (od1Var.f36194p1.a()) {
                        f7 = 1.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
                    od1Var.P1 = ofFloat;
                    ofFloat.addUpdateListener(new q11(od1Var, 13));
                    od1Var.P1.addListener(new sc1(od1Var, 5));
                    od1Var.P1.setDuration(250L);
                    od1Var.P1.setInterpolator(org.telegram.ui.Components.sr.f28339f);
                    od1Var.P1.start();
                    return;
                }
                return;
            default:
                if (od1Var.getParentActivity() != null && od1Var.getParentActivity() != null) {
                    SharedConfig.increaseDayNightWallpaperSiwtchHint();
                    org.telegram.ui.Components.k40 k40Var = new org.telegram.ui.Components.k40(7, od1Var.getParentActivity(), null, true);
                    k40Var.setAlpha(0.0f);
                    k40Var.setVisibility(4);
                    k40Var.setShowingDuration(4000L);
                    od1Var.f36184k0.addView(k40Var, w7.y5.d(-2, -2.0f, 51, 4.0f, 0.0f, 4.0f, 0.0f));
                    if (od1Var.f36194p1.a()) {
                        k40Var.setText(LocaleController.getString(R.string.PreviewWallpaperDay));
                    } else {
                        k40Var.setText(LocaleController.getString(R.string.PreviewWallpaperNight));
                    }
                    k40Var.d();
                    k40Var.f(od1Var.O1, true);
                    k40Var.setExtraTranslationY(-AndroidUtilities.dp(14.0f));
                    return;
                }
                return;
        }
    }
}
