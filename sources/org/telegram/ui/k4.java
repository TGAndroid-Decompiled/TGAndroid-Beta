package org.telegram.ui;

import android.content.DialogInterface;
public final class k4 implements DialogInterface.OnClickListener {
    public final int f49194a;
    public final Object f49195b;

    public k4(Object obj, int i7) {
        this.f49194a = i7;
        this.f49195b = obj;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i7) {
        yi.g gVar;
        String str;
        int i10 = 0;
        switch (this.f49194a) {
            case 0:
                zy0 zy0Var = (zy0) this.f49195b;
                zy0Var.getClass();
                aj.b bVar = aj.e.f1670c;
                if (i7 == 0) {
                    gVar = yi.g.f61355a;
                } else {
                    gVar = yi.g.f61356b;
                }
                bVar.b(gVar);
                ((l4) zy0Var.f54668c).g(2);
                return;
            case 1:
                cx cxVar = (cx) this.f49195b;
                if (i7 == 0) {
                    org.telegram.messenger.ur messagesStorage = cxVar.getMessagesStorage();
                    messagesStorage.f27250a.c(new org.telegram.messenger.sp(messagesStorage, 1, 2));
                    return;
                } else if (i7 != 1 || cxVar.f46722f0 == null) {
                    return;
                } else {
                    while (true) {
                        bx[] bxVarArr = cxVar.f46722f0;
                        if (i10 < bxVarArr.length) {
                            bx bxVar = bxVarArr[i10];
                            if (bxVar.f46332s == 0 && bxVar.getVisibility() == 0) {
                                org.telegram.ui.Cells.u2 c42 = cx.c4(cxVar.f46722f0[i10]);
                                yw ywVar = cxVar.f46722f0[i10].f46325a;
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
                ce0 ce0Var = (ce0) this.f49195b;
                if (i7 == 0) {
                    org.telegram.messenger.s2.f26730a = !org.telegram.messenger.s2.f26730a;
                    org.telegram.messenger.t0.f26931b.getSharedPreferences("systemConfig", 0).edit().putBoolean("logsEnabled", org.telegram.messenger.s2.f26730a).commit();
                    org.telegram.ui.Components.lc b02 = org.telegram.ui.Components.lc.b0(ce0Var.f46542h0);
                    if (org.telegram.messenger.s2.f26730a) {
                        str = "Logs enabled.";
                    } else {
                        str = "Logs disabled.";
                    }
                    b02.Q(2131623982, 36, str).j();
                    if (org.telegram.messenger.s2.f26730a) {
                        i5.c.v(org.telegram.messenger.t0.f26937s, new StringBuilder("app start time = "));
                        try {
                            org.telegram.messenger.a8.b("buildVersion = " + org.telegram.messenger.t0.f26931b.getPackageManager().getPackageInfo(org.telegram.messenger.t0.f26931b.getPackageName(), 0).versionCode);
                            return;
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                            return;
                        }
                    }
                    return;
                }
                ProfileActivity.Y4(ce0Var.f46542h0.getParentActivity(), false);
                return;
            default:
                hk0 hk0Var = (hk0) this.f49195b;
                if (i7 == 0) {
                    hk0Var.f48468x = "male";
                    hk0Var.Z[4].setText(org.telegram.messenger.hd.N0(2131747314, null));
                    return;
                } else if (i7 == 1) {
                    hk0Var.f48468x = "female";
                    hk0Var.Z[4].setText(org.telegram.messenger.hd.N0(2131747375, null));
                    return;
                } else {
                    hk0Var.getClass();
                    return;
                }
        }
    }
}
