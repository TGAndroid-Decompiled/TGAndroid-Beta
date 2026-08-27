package org.telegram.ui;

import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

public final class pb1 implements org.telegram.ui.Components.zp {

    public final nc1 f41321a;

    public pb1(nc1 nc1Var) {
        this.f41321a = nc1Var;
    }

    @Override
    public final int D0(int i10) {
        org.telegram.ui.ActionBar.e6 e6Var;
        nc1 nc1Var = this.f41321a;
        if (nc1Var.f40769n != 3) {
            return 0;
        }
        org.telegram.ui.ActionBar.f6 f6Var = nc1Var.f40736a0;
        if (f6Var.O && i10 == 0 && (e6Var = (org.telegram.ui.ActionBar.e6) f6Var.W.get(org.telegram.ui.ActionBar.g6.f23227n)) != null) {
            return e6Var.f22886e;
        }
        return 0;
    }

    @Override
    public final void g(boolean z10) throws Throwable {
        nc1 nc1Var = this.f41321a;
        org.telegram.ui.ActionBar.e6 e6Var = nc1Var.f40781s;
        if (!z10) {
            org.telegram.ui.Components.y4.W(nc1Var, 1, null, null);
            return;
        }
        if (e6Var.f22898r == null) {
            nc1Var.finishFragment();
            MessagesController.getInstance(((org.telegram.ui.ActionBar.n2) nc1Var).currentAccount).saveThemeToServer(e6Var.f22884b, e6Var);
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needShareTheme, e6Var.f22884b, e6Var);
        } else {
            String str = "https://" + MessagesController.getInstance(((org.telegram.ui.ActionBar.n2) nc1Var).currentAccount).linkPrefix + "/addtheme/" + e6Var.f22898r.slug;
            nc1Var.showDialog(new org.telegram.ui.Components.sp0(nc1Var.getParentActivity(), null, str, false, str, false, null));
        }
    }

    @Override
    public final void n() {
        nc1 nc1Var = this.f41321a;
        if (nc1Var.getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(nc1Var.getParentActivity());
        alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.DeleteThemeTitle);
        alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.DeleteThemeAlert);
        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new dl0(this, 21));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
        nc1Var.showDialog(b2Var);
        TextView textView = (TextView) b2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(nc1Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23284q7));
        }
    }

    @Override
    public final void n0(int i10, int i11, boolean z10) {
        int i12;
        int i13;
        boolean z11;
        nc1 nc1Var = this.f41321a;
        if (nc1Var.f40738b == 2) {
            nc1Var.a1(i10, i11, true);
            return;
        }
        Runnable runnable = nc1Var.U;
        org.telegram.ui.ActionBar.e6 e6Var = nc1Var.f40781s;
        if (i11 != -1) {
            int i14 = nc1Var.T;
            if (i14 != -1 && i14 != i11) {
                runnable.run();
            }
            nc1Var.S = i10;
            nc1Var.T = i11;
            if (z10) {
                runnable.run();
                return;
            } else {
                if (nc1Var.V) {
                    return;
                }
                nc1Var.V = true;
                nc1Var.fragmentView.postDelayed(runnable, 16L);
                return;
            }
        }
        int i15 = nc1Var.f40769n;
        if (i15 == 1 || i15 == 2) {
            long j10 = nc1Var.E;
            if (j10 != 0) {
                e6Var.f22890j = j10;
            } else {
                e6Var.f22890j = 0L;
            }
            long j11 = nc1Var.F;
            if (j11 != 0) {
                e6Var.f22891k = j11;
            } else {
                e6Var.f22891k = 0L;
            }
            long j12 = nc1Var.G;
            if (j12 != 0) {
                e6Var.f22892l = j12;
            } else {
                e6Var.f22892l = 0L;
            }
            long j13 = nc1Var.H;
            if (j13 != 0) {
                e6Var.f22893m = j13;
            } else {
                e6Var.f22893m = 0L;
            }
            e6Var.f22894n = nc1Var.K;
            if (i15 == 2) {
                int iB0 = org.telegram.ui.ActionBar.g6.B0(org.telegram.ui.ActionBar.g6.Nd);
                int iB1 = org.telegram.ui.ActionBar.g6.B0(org.telegram.ui.ActionBar.g6.Od);
                int iB2 = org.telegram.ui.ActionBar.g6.B0(org.telegram.ui.ActionBar.g6.Pd);
                int iB3 = org.telegram.ui.ActionBar.g6.B0(org.telegram.ui.ActionBar.g6.Qd);
                int i16 = (int) e6Var.f22891k;
                int i17 = (int) e6Var.f22892l;
                int i18 = (int) e6Var.f22893m;
                int i19 = (int) e6Var.f22890j;
                org.telegram.ui.Components.aq aqVar = nc1Var.R;
                if (i18 != 0) {
                    iB3 = i18;
                }
                aqVar.e(iB3, 3);
                org.telegram.ui.Components.aq aqVar2 = nc1Var.R;
                if (i17 != 0) {
                    iB2 = i17;
                }
                aqVar2.e(iB2, 2);
                org.telegram.ui.Components.aq aqVar3 = nc1Var.R;
                if (i16 != 0) {
                    iB1 = i16;
                }
                i12 = 1;
                aqVar3.e(iB1, 1);
                org.telegram.ui.Components.aq aqVar4 = nc1Var.R;
                if (i19 != 0) {
                    iB0 = i19;
                }
                aqVar4.e(iB0, 0);
            } else {
                i12 = 1;
            }
        } else {
            i12 = 1;
        }
        int i20 = nc1Var.f40769n;
        if (i20 == i12 || i20 == 3) {
            int i21 = nc1Var.f40796y;
            if (i21 != 0) {
                e6Var.f22886e = i21;
                i13 = 0;
            } else {
                i13 = 0;
                e6Var.f22886e = 0;
            }
            int i22 = nc1Var.A;
            if (i22 != 0) {
                e6Var.f22887f = i22;
            } else {
                e6Var.f22887f = i13;
            }
            int i23 = nc1Var.B;
            if (i23 != 0) {
                e6Var.f22888g = i23;
            } else {
                e6Var.f22888g = i13;
            }
            int i24 = nc1Var.C;
            if (i24 != 0) {
                e6Var.h = i24;
            } else {
                e6Var.h = i13;
            }
            if (i20 == 3) {
                nc1Var.R.e(e6Var.h, 3);
                nc1Var.R.e(e6Var.f22888g, 2);
                nc1Var.R.e(e6Var.f22887f, 1);
                org.telegram.ui.Components.aq aqVar5 = nc1Var.R;
                int i25 = e6Var.f22886e;
                if (i25 == 0) {
                    i25 = e6Var.f22885c;
                }
                z11 = false;
                aqVar5.e(i25, 0);
            } else {
                z11 = false;
            }
        } else {
            z11 = false;
        }
        org.telegram.ui.ActionBar.g6.n1(z11, z11);
        nc1Var.f40776q0.f1();
    }
}
