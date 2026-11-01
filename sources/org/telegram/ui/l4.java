package org.telegram.ui;

import android.content.DialogInterface;
public final class l4 implements DialogInterface.OnClickListener {
    public final int f39070a;
    public final Object f39071b;

    public l4(Object obj, int i10) {
        this.f39070a = i10;
        this.f39071b = obj;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        ki.i iVar;
        String str;
        int i11 = 0;
        switch (this.f39070a) {
            case 0:
                l01 l01Var = (l01) this.f39071b;
                l01Var.getClass();
                mi.b bVar = mi.e.f13387c;
                if (i10 == 0) {
                    iVar = ki.i.f11407a;
                } else {
                    iVar = ki.i.f11408b;
                }
                bVar.b(iVar);
                ((fg.j) l01Var.f39044c).g(2);
                return;
            case 1:
                zx zxVar = (zx) this.f39071b;
                if (i10 == 0) {
                    org.telegram.messenger.is messagesStorage = zxVar.getMessagesStorage();
                    messagesStorage.f16331a.c(new org.telegram.messenger.zp(messagesStorage, 1, 3));
                    return;
                } else if (i10 != 1 || zxVar.f44137e0 == null) {
                    return;
                } else {
                    while (true) {
                        yx[] yxVarArr = zxVar.f44137e0;
                        if (i11 < yxVarArr.length) {
                            yx yxVar = yxVarArr[i11];
                            if (yxVar.f43739s == 0 && yxVar.getVisibility() == 0) {
                                org.telegram.ui.Cells.v2 c42 = zx.c4(zxVar.f44137e0[i11]);
                                vx vxVar = zxVar.f44137e0[i11].f43733a;
                                int i12 = vx.B3;
                                vxVar.C1(true, c42);
                            }
                            i11++;
                        } else {
                            return;
                        }
                    }
                }
                break;
            case 2:
                ff0 ff0Var = (ff0) this.f39071b;
                if (i10 == 0) {
                    org.telegram.messenger.v2.f18578a = !org.telegram.messenger.v2.f18578a;
                    org.telegram.messenger.w0.f18945b.getSharedPreferences("systemConfig", 0).edit().putBoolean("logsEnabled", org.telegram.messenger.v2.f18578a).commit();
                    org.telegram.ui.Components.cc a02 = org.telegram.ui.Components.cc.a0(ff0Var.f37124a0);
                    if (org.telegram.messenger.v2.f18578a) {
                        str = "Logs enabled.";
                    } else {
                        str = "Logs disabled.";
                    }
                    a02.Q(2131623981, 36, str).j();
                    if (org.telegram.messenger.v2.f18578a) {
                        i0.a.q(org.telegram.messenger.w0.f18950s, new StringBuilder("app start time = "));
                        try {
                            org.telegram.messenger.f8.b("buildVersion = " + org.telegram.messenger.w0.f18945b.getPackageManager().getPackageInfo(org.telegram.messenger.w0.f18945b.getPackageName(), 0).versionCode);
                            return;
                        } catch (Exception e) {
                            org.telegram.messenger.f8.g(e, true);
                            return;
                        }
                    }
                    return;
                }
                ProfileActivity.V4(ff0Var.f37124a0.getParentActivity(), false);
                return;
            default:
                jl0 jl0Var = (jl0) this.f39071b;
                if (i10 == 0) {
                    jl0Var.f38461x = "male";
                    jl0Var.Y[4].setText(org.telegram.messenger.dd.L0(2131747524, null));
                    return;
                } else if (i10 == 1) {
                    jl0Var.f38461x = "female";
                    jl0Var.Y[4].setText(org.telegram.messenger.dd.L0(2131747585, null));
                    return;
                } else {
                    jl0Var.getClass();
                    return;
                }
        }
    }
}
