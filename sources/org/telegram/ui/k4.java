package org.telegram.ui;

import android.content.DialogInterface;
public final class k4 implements DialogInterface.OnClickListener {
    public final int f48579a;
    public final Object f48580b;

    public k4(Object obj, int i7) {
        this.f48579a = i7;
        this.f48580b = obj;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i7) {
        yi.h hVar;
        String str;
        int i10 = 0;
        switch (this.f48579a) {
            case 0:
                vy0 vy0Var = (vy0) this.f48580b;
                vy0Var.getClass();
                aj.b bVar = aj.e.f1652c;
                if (i7 == 0) {
                    hVar = yi.h.f60745a;
                } else {
                    hVar = yi.h.f60746b;
                }
                bVar.b(hVar);
                ((l4) vy0Var.f52325c).g(2);
                return;
            case 1:
                yw ywVar = (yw) this.f48580b;
                if (i7 == 0) {
                    org.telegram.messenger.vr messagesStorage = ywVar.getMessagesStorage();
                    messagesStorage.f27220a.c(new org.telegram.messenger.qp(messagesStorage, 1, 3));
                    return;
                } else if (i7 != 1 || ywVar.f53673f0 == null) {
                    return;
                } else {
                    while (true) {
                        xw[] xwVarArr = ywVar.f53673f0;
                        if (i10 < xwVarArr.length) {
                            xw xwVar = xwVarArr[i10];
                            if (xwVar.f53338s == 0 && xwVar.getVisibility() == 0) {
                                org.telegram.ui.Cells.t2 c42 = yw.c4(ywVar.f53673f0[i10]);
                                uw uwVar = ywVar.f53673f0[i10].f53331a;
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
                be0 be0Var = (be0) this.f48580b;
                if (i7 == 0) {
                    org.telegram.messenger.r2.f26198a = !org.telegram.messenger.r2.f26198a;
                    org.telegram.messenger.t0.f26600b.getSharedPreferences("systemConfig", 0).edit().putBoolean("logsEnabled", org.telegram.messenger.r2.f26198a).commit();
                    org.telegram.ui.Components.cc a02 = org.telegram.ui.Components.cc.a0(be0Var.f45699h0);
                    if (org.telegram.messenger.r2.f26198a) {
                        str = "Logs enabled.";
                    } else {
                        str = "Logs disabled.";
                    }
                    a02.Q(2131623982, 36, str).j();
                    if (org.telegram.messenger.r2.f26198a) {
                        i5.c.t(org.telegram.messenger.t0.f26606s, new StringBuilder("app start time = "));
                        try {
                            org.telegram.messenger.a8.b("buildVersion = " + org.telegram.messenger.t0.f26600b.getPackageManager().getPackageInfo(org.telegram.messenger.t0.f26600b.getPackageName(), 0).versionCode);
                            return;
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                            return;
                        }
                    }
                    return;
                }
                ProfileActivity.X4(be0Var.f45699h0.getParentActivity(), false);
                return;
            default:
                ek0 ek0Var = (ek0) this.f48580b;
                if (i7 == 0) {
                    ek0Var.f46854x = "male";
                    ek0Var.Z[4].setText(org.telegram.messenger.hd.M0(2131747508, null));
                    return;
                } else if (i7 == 1) {
                    ek0Var.f46854x = "female";
                    ek0Var.Z[4].setText(org.telegram.messenger.hd.M0(2131747569, null));
                    return;
                } else {
                    ek0Var.getClass();
                    return;
                }
        }
    }
}
