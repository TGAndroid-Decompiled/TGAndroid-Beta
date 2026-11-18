package org.telegram.ui;

import android.content.DialogInterface;
public final class k4 implements DialogInterface.OnClickListener {
    public final int f49147a;
    public final Object f49148b;

    public k4(Object obj, int i7) {
        this.f49147a = i7;
        this.f49148b = obj;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i7) {
        yi.g gVar;
        String str;
        int i10 = 0;
        switch (this.f49147a) {
            case 0:
                zy0 zy0Var = (zy0) this.f49148b;
                zy0Var.getClass();
                aj.b bVar = aj.e.f1651c;
                if (i7 == 0) {
                    gVar = yi.g.f61310a;
                } else {
                    gVar = yi.g.f61311b;
                }
                bVar.b(gVar);
                ((l4) zy0Var.f54617c).g(2);
                return;
            case 1:
                cx cxVar = (cx) this.f49148b;
                if (i7 == 0) {
                    org.telegram.messenger.tr messagesStorage = cxVar.getMessagesStorage();
                    messagesStorage.f27052a.c(new org.telegram.messenger.rp(messagesStorage, 1, 2));
                    return;
                } else if (i7 != 1 || cxVar.f46663f0 == null) {
                    return;
                } else {
                    while (true) {
                        bx[] bxVarArr = cxVar.f46663f0;
                        if (i10 < bxVarArr.length) {
                            bx bxVar = bxVarArr[i10];
                            if (bxVar.f46305s == 0 && bxVar.getVisibility() == 0) {
                                org.telegram.ui.Cells.u2 c42 = cx.c4(cxVar.f46663f0[i10]);
                                yw ywVar = cxVar.f46663f0[i10].f46298a;
                                int i11 = yw.C3;
                                ywVar.C1(true, c42);
                            }
                            i10++;
                        } else {
                            return;
                        }
                    }
                }
                break;
            case 2:
                de0 de0Var = (de0) this.f49148b;
                if (i7 == 0) {
                    org.telegram.messenger.s2.f26721a = !org.telegram.messenger.s2.f26721a;
                    org.telegram.messenger.t0.f26913b.getSharedPreferences("systemConfig", 0).edit().putBoolean("logsEnabled", org.telegram.messenger.s2.f26721a).commit();
                    org.telegram.ui.Components.lc b02 = org.telegram.ui.Components.lc.b0(de0Var.f46878h0);
                    if (org.telegram.messenger.s2.f26721a) {
                        str = "Logs enabled.";
                    } else {
                        str = "Logs disabled.";
                    }
                    b02.Q(2131623982, 36, str).j();
                    if (org.telegram.messenger.s2.f26721a) {
                        i5.c.v(org.telegram.messenger.t0.f26919s, new StringBuilder("app start time = "));
                        try {
                            org.telegram.messenger.a8.b("buildVersion = " + org.telegram.messenger.t0.f26913b.getPackageManager().getPackageInfo(org.telegram.messenger.t0.f26913b.getPackageName(), 0).versionCode);
                            return;
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                            return;
                        }
                    }
                    return;
                }
                ProfileActivity.Y4(de0Var.f46878h0.getParentActivity(), false);
                return;
            default:
                hk0 hk0Var = (hk0) this.f49148b;
                if (i7 == 0) {
                    hk0Var.f48421x = "male";
                    hk0Var.Z[4].setText(org.telegram.messenger.gd.M0(2131747315, null));
                    return;
                } else if (i7 == 1) {
                    hk0Var.f48421x = "female";
                    hk0Var.Z[4].setText(org.telegram.messenger.gd.M0(2131747376, null));
                    return;
                } else {
                    hk0Var.getClass();
                    return;
                }
        }
    }
}
