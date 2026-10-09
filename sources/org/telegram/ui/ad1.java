package org.telegram.ui;

import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ad1 implements org.telegram.ui.Components.br {
    public final xd1 f35908a;

    public ad1(xd1 xd1Var) {
        this.f35908a = xd1Var;
    }

    @Override
    public final int B0(int i10) {
        org.telegram.ui.ActionBar.g6 g6Var;
        xd1 xd1Var = this.f35908a;
        if (xd1Var.f43973n == 3) {
            org.telegram.ui.ActionBar.h6 h6Var = xd1Var.f43950e0;
            if (h6Var.S && i10 == 0 && (g6Var = (org.telegram.ui.ActionBar.g6) h6Var.f20704a0.get(org.telegram.ui.ActionBar.i6.f20975n)) != null) {
                return g6Var.f20656e;
            }
            return 0;
        }
        return 0;
    }

    @Override
    public final void l(boolean z10) {
        int i10;
        int i11;
        xd1 xd1Var = this.f35908a;
        org.telegram.ui.ActionBar.g6 g6Var = xd1Var.f43985s;
        if (z10) {
            if (g6Var.f20668r == null) {
                xd1Var.finishFragment();
                i11 = ((org.telegram.ui.ActionBar.n2) xd1Var).currentAccount;
                MessagesController.getInstance(i11).saveThemeToServer(g6Var.f20654b, g6Var);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needShareTheme, g6Var.f20654b, g6Var);
                return;
            }
            StringBuilder sb2 = new StringBuilder("https://");
            i10 = ((org.telegram.ui.ActionBar.n2) xd1Var).currentAccount;
            sb2.append(MessagesController.getInstance(i10).linkPrefix);
            sb2.append("/addtheme/");
            sb2.append(g6Var.f20668r.slug);
            String sb3 = sb2.toString();
            xd1Var.showDialog(new org.telegram.ui.Components.mr0(xd1Var.getParentActivity(), null, sb3, false, sb3, false, null));
            return;
        }
        org.telegram.ui.Components.g5.V(xd1Var, 1, null, null);
    }

    @Override
    public final void s0(int i10, int i11, boolean z10) {
        xd1 xd1Var = this.f35908a;
        if (xd1Var.f43938b == 2) {
            xd1Var.a1(i10, i11, true);
            return;
        }
        Runnable runnable = xd1Var.Y;
        org.telegram.ui.ActionBar.g6 g6Var = xd1Var.f43985s;
        if (i11 == -1) {
            int i12 = xd1Var.f43973n;
            if (i12 == 1 || i12 == 2) {
                long j3 = xd1Var.I;
                if (j3 != 0) {
                    g6Var.f20660j = j3;
                } else {
                    g6Var.f20660j = 0L;
                }
                long j10 = xd1Var.J;
                if (j10 != 0) {
                    g6Var.f20661k = j10;
                } else {
                    g6Var.f20661k = 0L;
                }
                long j11 = xd1Var.K;
                if (j11 != 0) {
                    g6Var.f20662l = j11;
                } else {
                    g6Var.f20662l = 0L;
                }
                long j12 = xd1Var.L;
                if (j12 != 0) {
                    g6Var.f20663m = j12;
                } else {
                    g6Var.f20663m = 0L;
                }
                g6Var.f20664n = xd1Var.O;
                if (i12 == 2) {
                    int C0 = org.telegram.ui.ActionBar.i6.C0(org.telegram.ui.ActionBar.i6.Nd);
                    int C02 = org.telegram.ui.ActionBar.i6.C0(org.telegram.ui.ActionBar.i6.Od);
                    int C03 = org.telegram.ui.ActionBar.i6.C0(org.telegram.ui.ActionBar.i6.Pd);
                    int C04 = org.telegram.ui.ActionBar.i6.C0(org.telegram.ui.ActionBar.i6.Qd);
                    int i13 = (int) g6Var.f20661k;
                    int i14 = (int) g6Var.f20662l;
                    int i15 = (int) g6Var.f20663m;
                    int i16 = (int) g6Var.f20660j;
                    org.telegram.ui.Components.cr crVar = xd1Var.V;
                    if (i15 != 0) {
                        C04 = i15;
                    }
                    crVar.e(C04, 3);
                    org.telegram.ui.Components.cr crVar2 = xd1Var.V;
                    if (i14 != 0) {
                        C03 = i14;
                    }
                    crVar2.e(C03, 2);
                    org.telegram.ui.Components.cr crVar3 = xd1Var.V;
                    if (i13 != 0) {
                        C02 = i13;
                    }
                    crVar3.e(C02, 1);
                    org.telegram.ui.Components.cr crVar4 = xd1Var.V;
                    if (i16 != 0) {
                        C0 = i16;
                    }
                    crVar4.e(C0, 0);
                }
            }
            int i17 = xd1Var.f43973n;
            if (i17 == 1 || i17 == 3) {
                int i18 = xd1Var.f44000y;
                if (i18 != 0) {
                    g6Var.f20656e = i18;
                } else {
                    g6Var.f20656e = 0;
                }
                int i19 = xd1Var.E;
                if (i19 != 0) {
                    g6Var.f20657f = i19;
                } else {
                    g6Var.f20657f = 0;
                }
                int i20 = xd1Var.F;
                if (i20 != 0) {
                    g6Var.f20658g = i20;
                } else {
                    g6Var.f20658g = 0;
                }
                int i21 = xd1Var.G;
                if (i21 != 0) {
                    g6Var.h = i21;
                } else {
                    g6Var.h = 0;
                }
                if (i17 == 3) {
                    xd1Var.V.e(g6Var.h, 3);
                    xd1Var.V.e(g6Var.f20658g, 2);
                    xd1Var.V.e(g6Var.f20657f, 1);
                    org.telegram.ui.Components.cr crVar5 = xd1Var.V;
                    int i22 = g6Var.f20656e;
                    if (i22 == 0) {
                        i22 = g6Var.f20655c;
                    }
                    crVar5.e(i22, 0);
                }
            }
            org.telegram.ui.ActionBar.i6.o1(false, false);
            xd1Var.f43990u0.f1();
            return;
        }
        int i23 = xd1Var.X;
        if (i23 != -1 && i23 != i11) {
            runnable.run();
        }
        xd1Var.W = i10;
        xd1Var.X = i11;
        if (z10) {
            runnable.run();
        } else if (!xd1Var.Z) {
            xd1Var.Z = true;
            xd1Var.fragmentView.postDelayed(runnable, 16L);
        }
    }

    @Override
    public final void y() {
        xd1 xd1Var = this.f35908a;
        if (xd1Var.getParentActivity() != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xd1Var.getParentActivity());
            alertDialog$Builder.f20374a.R = LocaleController.getString(R.string.DeleteThemeTitle);
            alertDialog$Builder.f20374a.T = LocaleController.getString(R.string.DeleteThemeAlert);
            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new hq0(this, 20));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20374a;
            xd1Var.showDialog(b2Var);
            TextView textView = (TextView) b2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(xd1Var.getThemedColor(org.telegram.ui.ActionBar.i6.f21037q7));
            }
        }
    }
}
