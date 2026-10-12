package org.telegram.ui;

import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class cd1 implements org.telegram.ui.Components.dr {
    public final zd1 f36406a;

    public cd1(zd1 zd1Var) {
        this.f36406a = zd1Var;
    }

    @Override
    public final int H0(int i10) {
        org.telegram.ui.ActionBar.e6 e6Var;
        zd1 zd1Var = this.f36406a;
        if (zd1Var.f44772n == 3) {
            org.telegram.ui.ActionBar.g6 g6Var = zd1Var.f44749e0;
            if (g6Var.S && i10 == 0 && (e6Var = (org.telegram.ui.ActionBar.e6) g6Var.f20430a0.get(org.telegram.ui.ActionBar.h6.f20738n)) != null) {
                return e6Var.f20353e;
            }
            return 0;
        }
        return 0;
    }

    @Override
    public final void l(boolean z10) {
        int i10;
        int i11;
        zd1 zd1Var = this.f36406a;
        org.telegram.ui.ActionBar.e6 e6Var = zd1Var.f44784s;
        if (z10) {
            if (e6Var.f20365r == null) {
                zd1Var.finishFragment();
                i11 = ((org.telegram.ui.ActionBar.m2) zd1Var).currentAccount;
                MessagesController.getInstance(i11).saveThemeToServer(e6Var.f20351b, e6Var);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needShareTheme, e6Var.f20351b, e6Var);
                return;
            }
            StringBuilder sb2 = new StringBuilder("https://");
            i10 = ((org.telegram.ui.ActionBar.m2) zd1Var).currentAccount;
            sb2.append(MessagesController.getInstance(i10).linkPrefix);
            sb2.append("/addtheme/");
            sb2.append(e6Var.f20365r.slug);
            String sb3 = sb2.toString();
            zd1Var.showDialog(new org.telegram.ui.Components.sr0(zd1Var.getParentActivity(), null, sb3, false, sb3, false, null));
            return;
        }
        org.telegram.ui.Components.g5.V(zd1Var, 1, null, null);
    }

    @Override
    public final void t0(int i10, int i11, boolean z10) {
        zd1 zd1Var = this.f36406a;
        if (zd1Var.f44737b == 2) {
            zd1Var.a1(i10, i11, true);
            return;
        }
        Runnable runnable = zd1Var.Y;
        org.telegram.ui.ActionBar.e6 e6Var = zd1Var.f44784s;
        if (i11 == -1) {
            int i12 = zd1Var.f44772n;
            if (i12 == 1 || i12 == 2) {
                long j3 = zd1Var.I;
                if (j3 != 0) {
                    e6Var.f20357j = j3;
                } else {
                    e6Var.f20357j = 0L;
                }
                long j10 = zd1Var.J;
                if (j10 != 0) {
                    e6Var.f20358k = j10;
                } else {
                    e6Var.f20358k = 0L;
                }
                long j11 = zd1Var.K;
                if (j11 != 0) {
                    e6Var.f20359l = j11;
                } else {
                    e6Var.f20359l = 0L;
                }
                long j12 = zd1Var.L;
                if (j12 != 0) {
                    e6Var.f20360m = j12;
                } else {
                    e6Var.f20360m = 0L;
                }
                e6Var.f20361n = zd1Var.O;
                if (i12 == 2) {
                    int C0 = org.telegram.ui.ActionBar.h6.C0(org.telegram.ui.ActionBar.h6.Nd);
                    int C02 = org.telegram.ui.ActionBar.h6.C0(org.telegram.ui.ActionBar.h6.Od);
                    int C03 = org.telegram.ui.ActionBar.h6.C0(org.telegram.ui.ActionBar.h6.Pd);
                    int C04 = org.telegram.ui.ActionBar.h6.C0(org.telegram.ui.ActionBar.h6.Qd);
                    int i13 = (int) e6Var.f20358k;
                    int i14 = (int) e6Var.f20359l;
                    int i15 = (int) e6Var.f20360m;
                    int i16 = (int) e6Var.f20357j;
                    org.telegram.ui.Components.er erVar = zd1Var.V;
                    if (i15 != 0) {
                        C04 = i15;
                    }
                    erVar.e(C04, 3);
                    org.telegram.ui.Components.er erVar2 = zd1Var.V;
                    if (i14 != 0) {
                        C03 = i14;
                    }
                    erVar2.e(C03, 2);
                    org.telegram.ui.Components.er erVar3 = zd1Var.V;
                    if (i13 != 0) {
                        C02 = i13;
                    }
                    erVar3.e(C02, 1);
                    org.telegram.ui.Components.er erVar4 = zd1Var.V;
                    if (i16 != 0) {
                        C0 = i16;
                    }
                    erVar4.e(C0, 0);
                }
            }
            int i17 = zd1Var.f44772n;
            if (i17 == 1 || i17 == 3) {
                int i18 = zd1Var.f44799y;
                if (i18 != 0) {
                    e6Var.f20353e = i18;
                } else {
                    e6Var.f20353e = 0;
                }
                int i19 = zd1Var.E;
                if (i19 != 0) {
                    e6Var.f20354f = i19;
                } else {
                    e6Var.f20354f = 0;
                }
                int i20 = zd1Var.F;
                if (i20 != 0) {
                    e6Var.f20355g = i20;
                } else {
                    e6Var.f20355g = 0;
                }
                int i21 = zd1Var.G;
                if (i21 != 0) {
                    e6Var.h = i21;
                } else {
                    e6Var.h = 0;
                }
                if (i17 == 3) {
                    zd1Var.V.e(e6Var.h, 3);
                    zd1Var.V.e(e6Var.f20355g, 2);
                    zd1Var.V.e(e6Var.f20354f, 1);
                    org.telegram.ui.Components.er erVar5 = zd1Var.V;
                    int i22 = e6Var.f20353e;
                    if (i22 == 0) {
                        i22 = e6Var.f20352c;
                    }
                    erVar5.e(i22, 0);
                }
            }
            org.telegram.ui.ActionBar.h6.o1(false, false);
            zd1Var.f44789u0.f1();
            return;
        }
        int i23 = zd1Var.X;
        if (i23 != -1 && i23 != i11) {
            runnable.run();
        }
        zd1Var.W = i10;
        zd1Var.X = i11;
        if (z10) {
            runnable.run();
        } else if (!zd1Var.Z) {
            zd1Var.Z = true;
            zd1Var.fragmentView.postDelayed(runnable, 16L);
        }
    }

    @Override
    public final void y() {
        zd1 zd1Var = this.f36406a;
        if (zd1Var.getParentActivity() != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(zd1Var.getParentActivity());
            alertDialog$Builder.f20142a.R = LocaleController.getString(R.string.DeleteThemeTitle);
            alertDialog$Builder.f20142a.T = LocaleController.getString(R.string.DeleteThemeAlert);
            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new jq0(this, 20));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20142a;
            zd1Var.showDialog(a2Var);
            TextView textView = (TextView) a2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(zd1Var.getThemedColor(org.telegram.ui.ActionBar.h6.f20800q7));
            }
        }
    }
}
