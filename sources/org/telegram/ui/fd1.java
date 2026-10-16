package org.telegram.ui;

import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class fd1 implements org.telegram.ui.Components.yq {
    public final ce1 f35513a;

    public fd1(ce1 ce1Var) {
        this.f35513a = ce1Var;
    }

    @Override
    public final int J0(int i10) {
        org.telegram.ui.ActionBar.e6 e6Var;
        ce1 ce1Var = this.f35513a;
        if (ce1Var.f34614n == 3) {
            org.telegram.ui.ActionBar.f6 f6Var = ce1Var.f34591e0;
            if (f6Var.S && i10 == 0 && (e6Var = (org.telegram.ui.ActionBar.e6) f6Var.f19492a0.get(org.telegram.ui.ActionBar.g6.f19777n)) != null) {
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
        ce1 ce1Var = this.f35513a;
        org.telegram.ui.ActionBar.e6 e6Var = ce1Var.f34626s;
        if (z10) {
            if (e6Var.f19459r == null) {
                ce1Var.finishFragment();
                i11 = ((org.telegram.ui.ActionBar.m2) ce1Var).currentAccount;
                MessagesController.getInstance(i11).saveThemeToServer(e6Var.f19446b, e6Var);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needShareTheme, e6Var.f19446b, e6Var);
                return;
            }
            StringBuilder sb2 = new StringBuilder("https://");
            i10 = ((org.telegram.ui.ActionBar.m2) ce1Var).currentAccount;
            sb2.append(MessagesController.getInstance(i10).linkPrefix);
            sb2.append("/addtheme/");
            sb2.append(e6Var.f19459r.slug);
            String sb3 = sb2.toString();
            ce1Var.showDialog(new org.telegram.ui.Components.ir0(ce1Var.getParentActivity(), null, sb3, false, sb3, false, null));
            return;
        }
        org.telegram.ui.Components.g5.V(ce1Var, 1, null, null);
    }

    @Override
    public final void t0(int i10, int i11, boolean z10) {
        ce1 ce1Var = this.f35513a;
        if (ce1Var.f34580b == 2) {
            ce1Var.a1(i10, i11, true);
            return;
        }
        Runnable runnable = ce1Var.Y;
        org.telegram.ui.ActionBar.e6 e6Var = ce1Var.f34626s;
        if (i11 == -1) {
            int i12 = ce1Var.f34614n;
            if (i12 == 1 || i12 == 2) {
                long j10 = ce1Var.I;
                if (j10 != 0) {
                    e6Var.f19451j = j10;
                } else {
                    e6Var.f19451j = 0L;
                }
                long j11 = ce1Var.J;
                if (j11 != 0) {
                    e6Var.f19452k = j11;
                } else {
                    e6Var.f19452k = 0L;
                }
                long j12 = ce1Var.K;
                if (j12 != 0) {
                    e6Var.f19453l = j12;
                } else {
                    e6Var.f19453l = 0L;
                }
                long j13 = ce1Var.L;
                if (j13 != 0) {
                    e6Var.f19454m = j13;
                } else {
                    e6Var.f19454m = 0L;
                }
                e6Var.f19455n = ce1Var.O;
                if (i12 == 2) {
                    int C0 = org.telegram.ui.ActionBar.g6.C0(org.telegram.ui.ActionBar.g6.Nd);
                    int C02 = org.telegram.ui.ActionBar.g6.C0(org.telegram.ui.ActionBar.g6.Od);
                    int C03 = org.telegram.ui.ActionBar.g6.C0(org.telegram.ui.ActionBar.g6.Pd);
                    int C04 = org.telegram.ui.ActionBar.g6.C0(org.telegram.ui.ActionBar.g6.Qd);
                    int i13 = (int) e6Var.f19452k;
                    int i14 = (int) e6Var.f19453l;
                    int i15 = (int) e6Var.f19454m;
                    int i16 = (int) e6Var.f19451j;
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
            int i17 = ce1Var.f34614n;
            if (i17 == 1 || i17 == 3) {
                int i18 = ce1Var.f34641y;
                if (i18 != 0) {
                    e6Var.e = i18;
                } else {
                    e6Var.e = 0;
                }
                int i19 = ce1Var.E;
                if (i19 != 0) {
                    e6Var.f19448f = i19;
                } else {
                    e6Var.f19448f = 0;
                }
                int i20 = ce1Var.F;
                if (i20 != 0) {
                    e6Var.f19449g = i20;
                } else {
                    e6Var.f19449g = 0;
                }
                int i21 = ce1Var.G;
                if (i21 != 0) {
                    e6Var.h = i21;
                } else {
                    e6Var.h = 0;
                }
                if (i17 == 3) {
                    ce1Var.V.e(e6Var.h, 3);
                    ce1Var.V.e(e6Var.f19449g, 2);
                    ce1Var.V.e(e6Var.f19448f, 1);
                    org.telegram.ui.Components.zq zqVar5 = ce1Var.V;
                    int i22 = e6Var.e;
                    if (i22 == 0) {
                        i22 = e6Var.f19447c;
                    }
                    zqVar5.e(i22, 0);
                }
            }
            org.telegram.ui.ActionBar.g6.o1(false, false);
            ce1Var.f34631u0.f1();
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
        ce1 ce1Var = this.f35513a;
        if (ce1Var.getParentActivity() != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ce1Var.getParentActivity());
            alertDialog$Builder.f19248a.R = LocaleController.getString(R.string.DeleteThemeTitle);
            alertDialog$Builder.f19248a.T = LocaleController.getString(R.string.DeleteThemeAlert);
            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new lq0(this, 20));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19248a;
            ce1Var.showDialog(a2Var);
            TextView textView = (TextView) a2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(ce1Var.getThemedColor(org.telegram.ui.ActionBar.g6.f19839q7));
            }
        }
    }
}
