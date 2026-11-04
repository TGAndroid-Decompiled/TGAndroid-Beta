package org.telegram.ui;

import android.content.DialogInterface;
public final class m4 implements DialogInterface.OnClickListener {
    public final int f47498a;
    public final Object f47499b;

    public m4(Object obj, int i3) {
        this.f47498a = i3;
        this.f47499b = obj;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i3) {
        vi.h hVar;
        String str;
        int i10 = 0;
        switch (this.f47498a) {
            case 0:
                ny0 ny0Var = (ny0) this.f47499b;
                ny0Var.getClass();
                xi.b bVar = xi.e.f58879c;
                if (i3 == 0) {
                    hVar = vi.h.f56974a;
                } else {
                    hVar = vi.h.f56975b;
                }
                bVar.b(hVar);
                ((n4) ny0Var.f48145c).g(2);
                return;
            case 1:
                uw uwVar = (uw) this.f47499b;
                if (i3 == 0) {
                    org.telegram.messenger.qr messagesStorage = uwVar.getMessagesStorage();
                    messagesStorage.f24934a.c(new org.telegram.messenger.kp(messagesStorage, 1, 3));
                    return;
                } else if (i3 != 1 || uwVar.f50230f0 == null) {
                    return;
                } else {
                    while (true) {
                        tw[] twVarArr = uwVar.f50230f0;
                        if (i10 < twVarArr.length) {
                            tw twVar = twVarArr[i10];
                            if (twVar.f49904s == 0 && twVar.getVisibility() == 0) {
                                org.telegram.ui.Cells.t2 c42 = uw.c4(uwVar.f50230f0[i10]);
                                pw pwVar = uwVar.f50230f0[i10].f49897a;
                                int i11 = pw.C3;
                                pwVar.C1(true, c42);
                            }
                            i10++;
                        } else {
                            return;
                        }
                    }
                }
                break;
            case 2:
                wd0 wd0Var = (wd0) this.f47499b;
                if (i3 == 0) {
                    org.telegram.messenger.r2.f25040a = !org.telegram.messenger.r2.f25040a;
                    org.telegram.messenger.t0.f25457b.getSharedPreferences("systemConfig", 0).edit().putBoolean("logsEnabled", org.telegram.messenger.r2.f25040a).commit();
                    org.telegram.ui.Components.fc a02 = org.telegram.ui.Components.fc.a0(wd0Var.f50785b0);
                    if (org.telegram.messenger.r2.f25040a) {
                        str = "Logs enabled.";
                    } else {
                        str = "Logs disabled.";
                    }
                    a02.Q(2131623981, 36, str).j();
                    if (org.telegram.messenger.r2.f25040a) {
                        k2.p1.r(org.telegram.messenger.t0.f25463s, new StringBuilder("app start time = "));
                        try {
                            org.telegram.messenger.a8.b("buildVersion = " + org.telegram.messenger.t0.f25457b.getPackageManager().getPackageInfo(org.telegram.messenger.t0.f25457b.getPackageName(), 0).versionCode);
                            return;
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                            return;
                        }
                    }
                    return;
                }
                ProfileActivity.V4(wd0Var.f50785b0.getParentActivity(), false);
                return;
            default:
                yj0 yj0Var = (yj0) this.f47499b;
                if (i3 == 0) {
                    yj0Var.f52336x = "male";
                    yj0Var.Z[4].setText(org.telegram.messenger.bd.M0(2131747516, null));
                    return;
                } else if (i3 == 1) {
                    yj0Var.f52336x = "female";
                    yj0Var.Z[4].setText(org.telegram.messenger.bd.M0(2131747577, null));
                    return;
                } else {
                    yj0Var.getClass();
                    return;
                }
        }
    }
}
