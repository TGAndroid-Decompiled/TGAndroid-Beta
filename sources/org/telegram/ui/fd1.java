package org.telegram.ui;

import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class fd1 implements org.telegram.ui.Components.yq {
    public final ce1 f35803a;

    public fd1(ce1 ce1Var) {
        this.f35803a = ce1Var;
    }

    @Override
    public final int L0(int i10) {
        org.telegram.ui.ActionBar.e6 e6Var;
        ce1 ce1Var = this.f35803a;
        if (ce1Var.f34890n == 3) {
            org.telegram.ui.ActionBar.f6 f6Var = ce1Var.f34867e0;
            if (f6Var.S && i10 == 0 && (e6Var = (org.telegram.ui.ActionBar.e6) f6Var.f19792a0.get(org.telegram.ui.ActionBar.g6.f20077n)) != null) {
                return e6Var.e;
            }
            return 0;
        }
        return 0;
    }

    @Override
    public final void k(boolean z10) {
        int i10;
        int i11;
        ce1 ce1Var = this.f35803a;
        org.telegram.ui.ActionBar.e6 e6Var = ce1Var.f34902s;
        if (z10) {
            if (e6Var.f19759r == null) {
                ce1Var.finishFragment();
                i11 = ((org.telegram.ui.ActionBar.m2) ce1Var).currentAccount;
                MessagesController.getInstance(i11).saveThemeToServer(e6Var.f19746b, e6Var);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needShareTheme, e6Var.f19746b, e6Var);
                return;
            }
            StringBuilder sb2 = new StringBuilder("https://");
            i10 = ((org.telegram.ui.ActionBar.m2) ce1Var).currentAccount;
            sb2.append(MessagesController.getInstance(i10).linkPrefix);
            sb2.append("/addtheme/");
            sb2.append(e6Var.f19759r.slug);
            String sb3 = sb2.toString();
            ce1Var.showDialog(new org.telegram.ui.Components.jr0(ce1Var.getParentActivity(), null, sb3, false, sb3, false, null));
            return;
        }
        org.telegram.ui.Components.g5.V(ce1Var, 1, null, null);
    }

    @Override
    public final void t0(int i10, int i11, boolean z10) {
        ce1 ce1Var = this.f35803a;
        if (ce1Var.f34856b == 2) {
            ce1Var.a1(i10, i11, true);
            return;
        }
        Runnable runnable = ce1Var.Y;
        org.telegram.ui.ActionBar.e6 e6Var = ce1Var.f34902s;
        if (i11 == -1) {
            int i12 = ce1Var.f34890n;
            if (i12 == 1 || i12 == 2) {
                long j10 = ce1Var.I;
                if (j10 != 0) {
                    e6Var.f19751j = j10;
                } else {
                    e6Var.f19751j = 0L;
                }
                long j11 = ce1Var.J;
                if (j11 != 0) {
                    e6Var.f19752k = j11;
                } else {
                    e6Var.f19752k = 0L;
                }
                long j12 = ce1Var.K;
                if (j12 != 0) {
                    e6Var.f19753l = j12;
                } else {
                    e6Var.f19753l = 0L;
                }
                long j13 = ce1Var.L;
                if (j13 != 0) {
                    e6Var.f19754m = j13;
                } else {
                    e6Var.f19754m = 0L;
                }
                e6Var.f19755n = ce1Var.O;
                if (i12 == 2) {
                    int C0 = org.telegram.ui.ActionBar.g6.C0(org.telegram.ui.ActionBar.g6.Nd);
                    int C02 = org.telegram.ui.ActionBar.g6.C0(org.telegram.ui.ActionBar.g6.Od);
                    int C03 = org.telegram.ui.ActionBar.g6.C0(org.telegram.ui.ActionBar.g6.Pd);
                    int C04 = org.telegram.ui.ActionBar.g6.C0(org.telegram.ui.ActionBar.g6.Qd);
                    int i13 = (int) e6Var.f19752k;
                    int i14 = (int) e6Var.f19753l;
                    int i15 = (int) e6Var.f19754m;
                    int i16 = (int) e6Var.f19751j;
                    org.telegram.ui.Components.zq zqVar = ce1Var.V;
                    if (i15 != 0) {
                        C04 = i15;
                    }
                    zqVar.e(C04, 3);
                    org.telegram.ui.Components.zq zqVar2 = ce1Var.V;
                    if (i14 != 0) {
                        C03 = i14;
                    }
                    zqVar2.e(C03, 2);
                    org.telegram.ui.Components.zq zqVar3 = ce1Var.V;
                    if (i13 != 0) {
                        C02 = i13;
                    }
                    zqVar3.e(C02, 1);
                    org.telegram.ui.Components.zq zqVar4 = ce1Var.V;
                    if (i16 != 0) {
                        C0 = i16;
                    }
                    zqVar4.e(C0, 0);
                }
            }
            int i17 = ce1Var.f34890n;
            if (i17 == 1 || i17 == 3) {
                int i18 = ce1Var.f34917y;
                if (i18 != 0) {
                    e6Var.e = i18;
                } else {
                    e6Var.e = 0;
                }
                int i19 = ce1Var.E;
                if (i19 != 0) {
                    e6Var.f19748f = i19;
                } else {
                    e6Var.f19748f = 0;
                }
                int i20 = ce1Var.F;
                if (i20 != 0) {
                    e6Var.f19749g = i20;
                } else {
                    e6Var.f19749g = 0;
                }
                int i21 = ce1Var.G;
                if (i21 != 0) {
                    e6Var.h = i21;
                } else {
                    e6Var.h = 0;
                }
                if (i17 == 3) {
                    ce1Var.V.e(e6Var.h, 3);
                    ce1Var.V.e(e6Var.f19749g, 2);
                    ce1Var.V.e(e6Var.f19748f, 1);
                    org.telegram.ui.Components.zq zqVar5 = ce1Var.V;
                    int i22 = e6Var.e;
                    if (i22 == 0) {
                        i22 = e6Var.f19747c;
                    }
                    zqVar5.e(i22, 0);
                }
            }
            org.telegram.ui.ActionBar.g6.o1(false, false);
            ce1Var.f34907u0.f1();
            return;
        }
        int i23 = ce1Var.X;
        if (i23 != -1 && i23 != i11) {
            runnable.run();
        }
        ce1Var.W = i10;
        ce1Var.X = i11;
        if (z10) {
            runnable.run();
        } else if (!ce1Var.Z) {
            ce1Var.Z = true;
            ce1Var.fragmentView.postDelayed(runnable, 16L);
        }
    }

    @Override
    public final void y() {
        ce1 ce1Var = this.f35803a;
        if (ce1Var.getParentActivity() != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ce1Var.getParentActivity());
            alertDialog$Builder.f19548a.R = LocaleController.getString(R.string.DeleteThemeTitle);
            alertDialog$Builder.f19548a.T = LocaleController.getString(R.string.DeleteThemeAlert);
            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new nq0(this, 20));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19548a;
            ce1Var.showDialog(a2Var);
            TextView textView = (TextView) a2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(ce1Var.getThemedColor(org.telegram.ui.ActionBar.g6.f20139q7));
            }
        }
    }
}
