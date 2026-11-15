package org.telegram.ui;

import android.content.DialogInterface;
public final class k4 implements DialogInterface.OnClickListener {
    public final int f48533a;
    public final Object f48534b;

    public k4(Object obj, int i7) {
        this.f48533a = i7;
        this.f48534b = obj;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i7) {
        yi.h hVar;
        String str;
        int i10 = 0;
        switch (this.f48533a) {
            case 0:
                vy0 vy0Var = (vy0) this.f48534b;
                vy0Var.getClass();
                aj.b bVar = aj.e.f1659c;
                if (i7 == 0) {
                    hVar = yi.h.f60745a;
                } else {
                    hVar = yi.h.f60746b;
                }
                bVar.b(hVar);
                ((l4) vy0Var.f52328c).g(2);
                return;
            case 1:
                yw ywVar = (yw) this.f48534b;
                if (i7 == 0) {
                    org.telegram.messenger.vr messagesStorage = ywVar.getMessagesStorage();
                    messagesStorage.f27219a.c(new org.telegram.messenger.tp(messagesStorage, 1, 2));
                    return;
                } else if (i7 != 1 || ywVar.f53638f0 == null) {
                    return;
                } else {
                    while (true) {
                        xw[] xwVarArr = ywVar.f53638f0;
                        if (i10 < xwVarArr.length) {
                            xw xwVar = xwVarArr[i10];
                            if (xwVar.f53342s == 0 && xwVar.getVisibility() == 0) {
                                org.telegram.ui.Cells.t2 c42 = yw.c4(ywVar.f53638f0[i10]);
                                uw uwVar = ywVar.f53638f0[i10].f53335a;
                                int i11 = uw.C3;
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
                be0 be0Var = (be0) this.f48534b;
                if (i7 == 0) {
                    org.telegram.messenger.r2.f26206a = !org.telegram.messenger.r2.f26206a;
                    org.telegram.messenger.t0.f26609b.getSharedPreferences("systemConfig", 0).edit().putBoolean("logsEnabled", org.telegram.messenger.r2.f26206a).commit();
                    org.telegram.ui.Components.cc a02 = org.telegram.ui.Components.cc.a0(be0Var.f45693h0);
                    if (org.telegram.messenger.r2.f26206a) {
                        str = "Logs enabled.";
                    } else {
                        str = "Logs disabled.";
                    }
                    a02.Q(2131623982, 36, str).j();
                    if (org.telegram.messenger.r2.f26206a) {
                        i5.c.t(org.telegram.messenger.t0.f26615s, new StringBuilder("app start time = "));
                        try {
                            org.telegram.messenger.a8.b("buildVersion = " + org.telegram.messenger.t0.f26609b.getPackageManager().getPackageInfo(org.telegram.messenger.t0.f26609b.getPackageName(), 0).versionCode);
                            return;
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                            return;
                        }
                    }
                    return;
                }
                ProfileActivity.X4(be0Var.f45693h0.getParentActivity(), false);
                return;
            default:
                ek0 ek0Var = (ek0) this.f48534b;
                if (i7 == 0) {
                    ek0Var.f46844x = "male";
                    ek0Var.Z[4].setText(org.telegram.messenger.hd.M0(2131747508, null));
                    return;
                } else if (i7 == 1) {
                    ek0Var.f46844x = "female";
                    ek0Var.Z[4].setText(org.telegram.messenger.hd.M0(2131747569, null));
                    return;
                } else {
                    ek0Var.getClass();
                    return;
                }
        }
    }
}
