package org.telegram.ui;

import android.content.DialogInterface;
public final class k4 implements DialogInterface.OnClickListener {
    public final int f49190a;
    public final Object f49191b;

    public k4(Object obj, int i7) {
        this.f49190a = i7;
        this.f49191b = obj;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i7) {
        yi.g gVar;
        String str;
        int i10 = 0;
        switch (this.f49190a) {
            case 0:
                zy0 zy0Var = (zy0) this.f49191b;
                zy0Var.getClass();
                aj.b bVar = aj.e.f1663c;
                if (i7 == 0) {
                    gVar = yi.g.f61351a;
                } else {
                    gVar = yi.g.f61352b;
                }
                bVar.b(gVar);
                ((l4) zy0Var.f54664c).g(2);
                return;
            case 1:
                cx cxVar = (cx) this.f49191b;
                if (i7 == 0) {
                    org.telegram.messenger.tr messagesStorage = cxVar.getMessagesStorage();
                    messagesStorage.f27080a.c(new org.telegram.messenger.rp(messagesStorage, 1, 2));
                    return;
                } else if (i7 != 1 || cxVar.f46719f0 == null) {
                    return;
                } else {
                    while (true) {
                        bx[] bxVarArr = cxVar.f46719f0;
                        if (i10 < bxVarArr.length) {
                            bx bxVar = bxVarArr[i10];
                            if (bxVar.f46328s == 0 && bxVar.getVisibility() == 0) {
                                org.telegram.ui.Cells.u2 c42 = cx.c4(cxVar.f46719f0[i10]);
                                yw ywVar = cxVar.f46719f0[i10].f46321a;
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
                ce0 ce0Var = (ce0) this.f49191b;
                if (i7 == 0) {
                    org.telegram.messenger.s2.f26749a = !org.telegram.messenger.s2.f26749a;
                    org.telegram.messenger.t0.f26941b.getSharedPreferences("systemConfig", 0).edit().putBoolean("logsEnabled", org.telegram.messenger.s2.f26749a).commit();
                    org.telegram.ui.Components.lc b02 = org.telegram.ui.Components.lc.b0(ce0Var.f46539h0);
                    if (org.telegram.messenger.s2.f26749a) {
                        str = "Logs enabled.";
                    } else {
                        str = "Logs disabled.";
                    }
                    b02.Q(2131623982, 36, str).j();
                    if (org.telegram.messenger.s2.f26749a) {
                        i5.c.v(org.telegram.messenger.t0.f26947s, new StringBuilder("app start time = "));
                        try {
                            org.telegram.messenger.a8.b("buildVersion = " + org.telegram.messenger.t0.f26941b.getPackageManager().getPackageInfo(org.telegram.messenger.t0.f26941b.getPackageName(), 0).versionCode);
                            return;
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                            return;
                        }
                    }
                    return;
                }
                ProfileActivity.Y4(ce0Var.f46539h0.getParentActivity(), false);
                return;
            default:
                hk0 hk0Var = (hk0) this.f49191b;
                if (i7 == 0) {
                    hk0Var.f48464x = "male";
                    hk0Var.Z[4].setText(org.telegram.messenger.gd.N0(2131747314, null));
                    return;
                } else if (i7 == 1) {
                    hk0Var.f48464x = "female";
                    hk0Var.Z[4].setText(org.telegram.messenger.gd.N0(2131747375, null));
                    return;
                } else {
                    hk0Var.getClass();
                    return;
                }
        }
    }
}
