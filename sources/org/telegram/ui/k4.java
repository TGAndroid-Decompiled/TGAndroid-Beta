package org.telegram.ui;

import android.content.DialogInterface;
public final class k4 implements DialogInterface.OnClickListener {
    public final int f47191a;
    public final Object f47192b;

    public k4(Object obj, int i7) {
        this.f47191a = i7;
        this.f47192b = obj;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i7) {
        vi.f fVar;
        String str;
        int i10 = 0;
        switch (this.f47191a) {
            case 0:
                az0 az0Var = (az0) this.f47192b;
                az0Var.getClass();
                xi.b bVar = xi.e.f58868c;
                if (i7 == 0) {
                    fVar = vi.f.f57546a;
                } else {
                    fVar = vi.f.f57547b;
                }
                bVar.b(fVar);
                ((l4) az0Var.f43839c).g(2);
                return;
            case 1:
                yw ywVar = (yw) this.f47192b;
                if (i7 == 0) {
                    org.telegram.messenger.yr messagesStorage = ywVar.getMessagesStorage();
                    messagesStorage.f26719a.c(new org.telegram.messenger.tp(messagesStorage, 1, 3));
                    return;
                } else if (i7 != 1 || ywVar.f52231e0 == null) {
                    return;
                } else {
                    while (true) {
                        xw[] xwVarArr = ywVar.f52231e0;
                        if (i10 < xwVarArr.length) {
                            xw xwVar = xwVarArr[i10];
                            if (xwVar.f51779s == 0 && xwVar.getVisibility() == 0) {
                                org.telegram.ui.Cells.t2 c42 = yw.c4(ywVar.f52231e0[i10]);
                                uw uwVar = ywVar.f52231e0[i10].f51772a;
                                int i11 = uw.B3;
                                uwVar.C1(true, c42);
                            }
                            i10++;
                        } else {
                            return;
                        }
                    }
                }
                break;
            case 2:
                de0 de0Var = (de0) this.f47192b;
                if (i7 == 0) {
                    org.telegram.messenger.r2.f25212a = !org.telegram.messenger.r2.f25212a;
                    org.telegram.messenger.t0.f25566b.getSharedPreferences("systemConfig", 0).edit().putBoolean("logsEnabled", org.telegram.messenger.r2.f25212a).commit();
                    org.telegram.ui.Components.hc a02 = org.telegram.ui.Components.hc.a0(de0Var.f44935g0);
                    if (org.telegram.messenger.r2.f25212a) {
                        str = "Logs enabled.";
                    } else {
                        str = "Logs disabled.";
                    }
                    a02.Q(2131623981, 36, str).j();
                    if (org.telegram.messenger.r2.f25212a) {
                        jg.g.u(org.telegram.messenger.t0.f25572s, new StringBuilder("app start time = "));
                        try {
                            org.telegram.messenger.a8.b("buildVersion = " + org.telegram.messenger.t0.f25566b.getPackageManager().getPackageInfo(org.telegram.messenger.t0.f25566b.getPackageName(), 0).versionCode);
                            return;
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                            return;
                        }
                    }
                    return;
                }
                ProfileActivity.Y4(de0Var.f44935g0.getParentActivity(), false);
                return;
            default:
                dk0 dk0Var = (dk0) this.f47192b;
                if (i7 == 0) {
                    dk0Var.f45043x = "male";
                    dk0Var.Y[4].setText(org.telegram.messenger.id.M0(2131747508, null));
                    return;
                } else if (i7 == 1) {
                    dk0Var.f45043x = "female";
                    dk0Var.Y[4].setText(org.telegram.messenger.id.M0(2131747569, null));
                    return;
                } else {
                    dk0Var.getClass();
                    return;
                }
        }
    }
}
