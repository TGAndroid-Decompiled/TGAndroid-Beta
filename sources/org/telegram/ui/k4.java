package org.telegram.ui;

import android.content.DialogInterface;
public final class k4 implements DialogInterface.OnClickListener {
    public final int f49170a;
    public final Object f49171b;

    public k4(Object obj, int i7) {
        this.f49170a = i7;
        this.f49171b = obj;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i7) {
        yi.g gVar;
        String str;
        int i10 = 0;
        switch (this.f49170a) {
            case 0:
                zy0 zy0Var = (zy0) this.f49171b;
                zy0Var.getClass();
                aj.b bVar = aj.e.f1650c;
                if (i7 == 0) {
                    gVar = yi.g.f61309a;
                } else {
                    gVar = yi.g.f61310b;
                }
                bVar.b(gVar);
                ((l4) zy0Var.f54616c).g(2);
                return;
            case 1:
                cx cxVar = (cx) this.f49171b;
                if (i7 == 0) {
                    org.telegram.messenger.tr messagesStorage = cxVar.getMessagesStorage();
                    messagesStorage.f27054a.c(new org.telegram.messenger.rp(messagesStorage, 1, 2));
                    return;
                } else if (i7 != 1 || cxVar.f46683f0 == null) {
                    return;
                } else {
                    while (true) {
                        bx[] bxVarArr = cxVar.f46683f0;
                        if (i10 < bxVarArr.length) {
                            bx bxVar = bxVarArr[i10];
                            if (bxVar.f46314s == 0 && bxVar.getVisibility() == 0) {
                                org.telegram.ui.Cells.t2 c42 = cx.c4(cxVar.f46683f0[i10]);
                                yw ywVar = cxVar.f46683f0[i10].f46307a;
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
                ce0 ce0Var = (ce0) this.f49171b;
                if (i7 == 0) {
                    org.telegram.messenger.s2.f26723a = !org.telegram.messenger.s2.f26723a;
                    org.telegram.messenger.t0.f26915b.getSharedPreferences("systemConfig", 0).edit().putBoolean("logsEnabled", org.telegram.messenger.s2.f26723a).commit();
                    org.telegram.ui.Components.lc b02 = org.telegram.ui.Components.lc.b0(ce0Var.f46512h0);
                    if (org.telegram.messenger.s2.f26723a) {
                        str = "Logs enabled.";
                    } else {
                        str = "Logs disabled.";
                    }
                    b02.Q(2131623982, 36, str).j();
                    if (org.telegram.messenger.s2.f26723a) {
                        i5.c.v(org.telegram.messenger.t0.f26921s, new StringBuilder("app start time = "));
                        try {
                            org.telegram.messenger.a8.b("buildVersion = " + org.telegram.messenger.t0.f26915b.getPackageManager().getPackageInfo(org.telegram.messenger.t0.f26915b.getPackageName(), 0).versionCode);
                            return;
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                            return;
                        }
                    }
                    return;
                }
                ProfileActivity.Y4(ce0Var.f46512h0.getParentActivity(), false);
                return;
            default:
                hk0 hk0Var = (hk0) this.f49171b;
                if (i7 == 0) {
                    hk0Var.f48465x = "male";
                    hk0Var.Z[4].setText(org.telegram.messenger.gd.M0(2131747315, null));
                    return;
                } else if (i7 == 1) {
                    hk0Var.f48465x = "female";
                    hk0Var.Z[4].setText(org.telegram.messenger.gd.M0(2131747376, null));
                    return;
                } else {
                    hk0Var.getClass();
                    return;
                }
        }
    }
}
