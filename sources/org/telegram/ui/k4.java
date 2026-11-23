package org.telegram.ui;

import android.content.DialogInterface;
public final class k4 implements DialogInterface.OnClickListener {
    public final int f49148a;
    public final Object f49149b;

    public k4(Object obj, int i7) {
        this.f49148a = i7;
        this.f49149b = obj;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i7) {
        yi.g gVar;
        String str;
        int i10 = 0;
        switch (this.f49148a) {
            case 0:
                zy0 zy0Var = (zy0) this.f49149b;
                zy0Var.getClass();
                aj.b bVar = aj.e.f1621c;
                if (i7 == 0) {
                    gVar = yi.g.f61320a;
                } else {
                    gVar = yi.g.f61321b;
                }
                bVar.b(gVar);
                ((l4) zy0Var.f54627c).g(2);
                return;
            case 1:
                cx cxVar = (cx) this.f49149b;
                if (i7 == 0) {
                    org.telegram.messenger.ur messagesStorage = cxVar.getMessagesStorage();
                    messagesStorage.f27214a.c(new org.telegram.messenger.sp(messagesStorage, 1, 2));
                    return;
                } else if (i7 != 1 || cxVar.f46683f0 == null) {
                    return;
                } else {
                    while (true) {
                        bx[] bxVarArr = cxVar.f46683f0;
                        if (i10 < bxVarArr.length) {
                            bx bxVar = bxVarArr[i10];
                            if (bxVar.f46325s == 0 && bxVar.getVisibility() == 0) {
                                org.telegram.ui.Cells.u2 c42 = cx.c4(cxVar.f46683f0[i10]);
                                yw ywVar = cxVar.f46683f0[i10].f46318a;
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
                ce0 ce0Var = (ce0) this.f49149b;
                if (i7 == 0) {
                    org.telegram.messenger.s2.f26694a = !org.telegram.messenger.s2.f26694a;
                    org.telegram.messenger.t0.f26895b.getSharedPreferences("systemConfig", 0).edit().putBoolean("logsEnabled", org.telegram.messenger.s2.f26694a).commit();
                    org.telegram.ui.Components.lc b02 = org.telegram.ui.Components.lc.b0(ce0Var.f46528h0);
                    if (org.telegram.messenger.s2.f26694a) {
                        str = "Logs enabled.";
                    } else {
                        str = "Logs disabled.";
                    }
                    b02.Q(2131623982, 36, str).j();
                    if (org.telegram.messenger.s2.f26694a) {
                        i5.c.v(org.telegram.messenger.t0.f26901s, new StringBuilder("app start time = "));
                        try {
                            org.telegram.messenger.a8.b("buildVersion = " + org.telegram.messenger.t0.f26895b.getPackageManager().getPackageInfo(org.telegram.messenger.t0.f26895b.getPackageName(), 0).versionCode);
                            return;
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                            return;
                        }
                    }
                    return;
                }
                ProfileActivity.Y4(ce0Var.f46528h0.getParentActivity(), false);
                return;
            default:
                hk0 hk0Var = (hk0) this.f49149b;
                if (i7 == 0) {
                    hk0Var.f48432x = "male";
                    hk0Var.Z[4].setText(org.telegram.messenger.hd.N0(2131747314, null));
                    return;
                } else if (i7 == 1) {
                    hk0Var.f48432x = "female";
                    hk0Var.Z[4].setText(org.telegram.messenger.hd.N0(2131747375, null));
                    return;
                } else {
                    hk0Var.getClass();
                    return;
                }
        }
    }
}
