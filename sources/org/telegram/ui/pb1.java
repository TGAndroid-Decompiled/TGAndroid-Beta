package org.telegram.ui;

import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class pb1 implements org.telegram.ui.Components.vq {
    public final mc1 f40015a;

    public pb1(mc1 mc1Var) {
        this.f40015a = mc1Var;
    }

    @Override
    public final void j0(int i10, int i11, boolean z10) {
        mc1 mc1Var = this.f40015a;
        if (mc1Var.f39081b == 2) {
            mc1Var.a1(i10, i11, true);
            return;
        }
        Runnable runnable = mc1Var.Y;
        org.telegram.ui.ActionBar.f6 f6Var = mc1Var.f39127s;
        if (i11 == -1) {
            int i12 = mc1Var.f39115n;
            if (i12 == 1 || i12 == 2) {
                long j10 = mc1Var.I;
                if (j10 != 0) {
                    f6Var.f20834j = j10;
                } else {
                    f6Var.f20834j = 0L;
                }
                long j11 = mc1Var.J;
                if (j11 != 0) {
                    f6Var.f20835k = j11;
                } else {
                    f6Var.f20835k = 0L;
                }
                long j12 = mc1Var.K;
                if (j12 != 0) {
                    f6Var.f20836l = j12;
                } else {
                    f6Var.f20836l = 0L;
                }
                long j13 = mc1Var.L;
                if (j13 != 0) {
                    f6Var.f20837m = j13;
                } else {
                    f6Var.f20837m = 0L;
                }
                f6Var.f20838n = mc1Var.O;
                if (i12 == 2) {
                    int C0 = org.telegram.ui.ActionBar.h6.C0(org.telegram.ui.ActionBar.h6.Nd);
                    int C02 = org.telegram.ui.ActionBar.h6.C0(org.telegram.ui.ActionBar.h6.Od);
                    int C03 = org.telegram.ui.ActionBar.h6.C0(org.telegram.ui.ActionBar.h6.Pd);
                    int C04 = org.telegram.ui.ActionBar.h6.C0(org.telegram.ui.ActionBar.h6.Qd);
                    int i13 = (int) f6Var.f20835k;
                    int i14 = (int) f6Var.f20836l;
                    int i15 = (int) f6Var.f20837m;
                    int i16 = (int) f6Var.f20834j;
                    org.telegram.ui.Components.wq wqVar = mc1Var.V;
                    if (i15 != 0) {
                        C04 = i15;
                    }
                    wqVar.e(C04, 3);
                    org.telegram.ui.Components.wq wqVar2 = mc1Var.V;
                    if (i14 != 0) {
                        C03 = i14;
                    }
                    wqVar2.e(C03, 2);
                    org.telegram.ui.Components.wq wqVar3 = mc1Var.V;
                    if (i13 != 0) {
                        C02 = i13;
                    }
                    wqVar3.e(C02, 1);
                    org.telegram.ui.Components.wq wqVar4 = mc1Var.V;
                    if (i16 != 0) {
                        C0 = i16;
                    }
                    wqVar4.e(C0, 0);
                }
            }
            int i17 = mc1Var.f39115n;
            if (i17 == 1 || i17 == 3) {
                int i18 = mc1Var.f39142y;
                if (i18 != 0) {
                    f6Var.e = i18;
                } else {
                    f6Var.e = 0;
                }
                int i19 = mc1Var.E;
                if (i19 != 0) {
                    f6Var.f20831f = i19;
                } else {
                    f6Var.f20831f = 0;
                }
                int i20 = mc1Var.F;
                if (i20 != 0) {
                    f6Var.f20832g = i20;
                } else {
                    f6Var.f20832g = 0;
                }
                int i21 = mc1Var.G;
                if (i21 != 0) {
                    f6Var.h = i21;
                } else {
                    f6Var.h = 0;
                }
                if (i17 == 3) {
                    mc1Var.V.e(f6Var.h, 3);
                    mc1Var.V.e(f6Var.f20832g, 2);
                    mc1Var.V.e(f6Var.f20831f, 1);
                    org.telegram.ui.Components.wq wqVar5 = mc1Var.V;
                    int i22 = f6Var.e;
                    if (i22 == 0) {
                        i22 = f6Var.f20830c;
                    }
                    wqVar5.e(i22, 0);
                }
            }
            org.telegram.ui.ActionBar.h6.o1(false, false);
            mc1Var.f39132u0.f1();
            return;
        }
        int i23 = mc1Var.X;
        if (i23 != -1 && i23 != i11) {
            runnable.run();
        }
        mc1Var.W = i10;
        mc1Var.X = i11;
        if (z10) {
            runnable.run();
        } else if (!mc1Var.Z) {
            mc1Var.Z = true;
            mc1Var.fragmentView.postDelayed(runnable, 16L);
        }
    }

    @Override
    public final void k(boolean z10) {
        int i10;
        int i11;
        mc1 mc1Var = this.f40015a;
        org.telegram.ui.ActionBar.f6 f6Var = mc1Var.f39127s;
        if (z10) {
            if (f6Var.f20842r == null) {
                mc1Var.finishFragment();
                i11 = ((org.telegram.ui.ActionBar.n2) mc1Var).currentAccount;
                MessagesController.getInstance(i11).saveThemeToServer(f6Var.f20829b, f6Var);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needShareTheme, f6Var.f20829b, f6Var);
                return;
            }
            StringBuilder sb2 = new StringBuilder("https://");
            i10 = ((org.telegram.ui.ActionBar.n2) mc1Var).currentAccount;
            sb2.append(MessagesController.getInstance(i10).linkPrefix);
            sb2.append("/addtheme/");
            sb2.append(f6Var.f20842r.slug);
            String sb3 = sb2.toString();
            mc1Var.showDialog(new org.telegram.ui.Components.dr0(mc1Var.getParentActivity(), null, sb3, false, sb3, false, null));
            return;
        }
        org.telegram.ui.Components.f5.V(mc1Var, 1, null, null);
    }

    @Override
    public final int r0(int i10) {
        org.telegram.ui.ActionBar.f6 f6Var;
        mc1 mc1Var = this.f40015a;
        if (mc1Var.f39115n == 3) {
            org.telegram.ui.ActionBar.g6 g6Var = mc1Var.f39092e0;
            if (g6Var.S && i10 == 0 && (f6Var = (org.telegram.ui.ActionBar.f6) g6Var.f20878a0.get(org.telegram.ui.ActionBar.h6.f21162n)) != null) {
                return f6Var.e;
            }
            return 0;
        }
        return 0;
    }

    @Override
    public final void u() {
        mc1 mc1Var = this.f40015a;
        if (mc1Var.getParentActivity() != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(mc1Var.getParentActivity());
            alertDialog$Builder.f20601a.R = LocaleController.getString(R.string.DeleteThemeTitle);
            alertDialog$Builder.f20601a.T = LocaleController.getString(R.string.DeleteThemeAlert);
            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new rp0(this, 20));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20601a;
            mc1Var.showDialog(b2Var);
            TextView textView = (TextView) b2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(mc1Var.getThemedColor(org.telegram.ui.ActionBar.h6.f21224q7));
            }
        }
    }
}
