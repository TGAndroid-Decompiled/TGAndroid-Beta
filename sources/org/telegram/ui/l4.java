package org.telegram.ui;

import android.content.DialogInterface;
public final class l4 implements DialogInterface.OnClickListener {
    public final int f39049a;
    public final Object f39050b;

    public l4(Object obj, int i10) {
        this.f39049a = i10;
        this.f39050b = obj;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        ki.i iVar;
        String str;
        int i11 = 0;
        switch (this.f39049a) {
            case 0:
                l01 l01Var = (l01) this.f39050b;
                l01Var.getClass();
                mi.b bVar = mi.e.f13386c;
                if (i10 == 0) {
                    iVar = ki.i.f11406a;
                } else {
                    iVar = ki.i.f11407b;
                }
                bVar.b(iVar);
                ((fg.j) l01Var.f39019c).g(2);
                return;
            case 1:
                ay ayVar = (ay) this.f39050b;
                if (i10 == 0) {
                    org.telegram.messenger.hs messagesStorage = ayVar.getMessagesStorage();
                    messagesStorage.f15938a.c(new org.telegram.messenger.yp(messagesStorage, 1, 3));
                    return;
                } else if (i10 != 1 || ayVar.f35794e0 == null) {
                    return;
                } else {
                    while (true) {
                        zx[] zxVarArr = ayVar.f35794e0;
                        if (i11 < zxVarArr.length) {
                            zx zxVar = zxVarArr[i11];
                            if (zxVar.f44245s == 0 && zxVar.getVisibility() == 0) {
                                org.telegram.ui.Cells.v2 b42 = ay.b4(ayVar.f35794e0[i11]);
                                wx wxVar = ayVar.f35794e0[i11].f44239a;
                                int i12 = wx.B3;
                                wxVar.C1(true, b42);
                            }
                            i11++;
                        } else {
                            return;
                        }
                    }
                }
                break;
            case 2:
                gf0 gf0Var = (gf0) this.f39050b;
                if (i10 == 0) {
                    org.telegram.messenger.v2.f18448a = !org.telegram.messenger.v2.f18448a;
                    org.telegram.messenger.w0.f19025b.getSharedPreferences("systemConfig", 0).edit().putBoolean("logsEnabled", org.telegram.messenger.v2.f18448a).commit();
                    org.telegram.ui.Components.cc a02 = org.telegram.ui.Components.cc.a0(gf0Var.f37534a0);
                    if (org.telegram.messenger.v2.f18448a) {
                        str = "Logs enabled.";
                    } else {
                        str = "Logs disabled.";
                    }
                    a02.Q(2131623981, 36, str).j();
                    if (org.telegram.messenger.v2.f18448a) {
                        i0.a.q(org.telegram.messenger.w0.f19030s, new StringBuilder("app start time = "));
                        try {
                            org.telegram.messenger.f8.b("buildVersion = " + org.telegram.messenger.w0.f19025b.getPackageManager().getPackageInfo(org.telegram.messenger.w0.f19025b.getPackageName(), 0).versionCode);
                            return;
                        } catch (Exception e) {
                            org.telegram.messenger.f8.g(e, true);
                            return;
                        }
                    }
                    return;
                }
                ProfileActivity.U4(gf0Var.f37534a0.getParentActivity(), false);
                return;
            default:
                ll0 ll0Var = (ll0) this.f39050b;
                if (i10 == 0) {
                    ll0Var.f39309x = "male";
                    ll0Var.Y[4].setText(org.telegram.messenger.cd.L0(2131747524, null));
                    return;
                } else if (i10 == 1) {
                    ll0Var.f39309x = "female";
                    ll0Var.Y[4].setText(org.telegram.messenger.cd.L0(2131747585, null));
                    return;
                } else {
                    ll0Var.getClass();
                    return;
                }
        }
    }
}
