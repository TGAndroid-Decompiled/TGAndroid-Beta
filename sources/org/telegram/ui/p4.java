package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class p4 implements DialogInterface.OnClickListener {
    public final int f39933a;
    public final Object f39934b;

    public p4(Object obj, int i10) {
        this.f39933a = i10;
        this.f39934b = obj;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        ri.i iVar;
        String str;
        int i11 = 0;
        switch (this.f39933a) {
            case 0:
                r4 r4Var = (r4) this.f39934b;
                r4Var.getClass();
                ti.b bVar = ti.e.f47212c;
                if (i10 == 0) {
                    iVar = ri.i.f45805a;
                } else {
                    iVar = ri.i.f45806b;
                }
                bVar.b(iVar);
                r4Var.f40562b.m(2);
                return;
            case 1:
                ey eyVar = (ey) this.f39934b;
                if (i10 == 0) {
                    eyVar.getMessagesStorage().readAllDialogs(1);
                    return;
                } else if (i10 != 1 || eyVar.f36637e0 == null) {
                    return;
                } else {
                    while (true) {
                        dy[] dyVarArr = eyVar.f36637e0;
                        if (i11 < dyVarArr.length) {
                            dy dyVar = dyVarArr[i11];
                            if (dyVar.f36306s == 0 && dyVar.getVisibility() == 0) {
                                org.telegram.ui.Cells.r2 O3 = ey.O3(eyVar.f36637e0[i11]);
                                zx zxVar = eyVar.f36637e0[i11].f36300a;
                                int i12 = zx.f43804t3;
                                zxVar.A1(true, O3);
                            }
                            i11++;
                        } else {
                            return;
                        }
                    }
                }
                break;
            case 2:
                dg0 dg0Var = (dg0) this.f39934b;
                if (i10 == 0) {
                    BuildVars.LOGS_ENABLED = !BuildVars.LOGS_ENABLED;
                    ApplicationLoader.applicationContext.getSharedPreferences("systemConfig", 0).edit().putBoolean("logsEnabled", BuildVars.LOGS_ENABLED).commit();
                    org.telegram.ui.Components.xc a02 = org.telegram.ui.Components.xc.a0(dg0Var.V);
                    int i13 = R.raw.chats_infotip;
                    if (BuildVars.LOGS_ENABLED) {
                        str = "Logs enabled.";
                    } else {
                        str = "Logs disabled.";
                    }
                    a02.Q(i13, 36, str).j();
                    if (BuildVars.LOGS_ENABLED) {
                        i2.d.x(new StringBuilder("app start time = "), ApplicationLoader.startTime);
                        try {
                            FileLog.d("buildVersion = " + ApplicationLoader.applicationContext.getPackageManager().getPackageInfo(ApplicationLoader.applicationContext.getPackageName(), 0).versionCode);
                            return;
                        } catch (Exception e) {
                            FileLog.e(e);
                            return;
                        }
                    }
                    return;
                }
                ProfileActivity.H4(dg0Var.V.getParentActivity(), false);
                return;
            case 3:
                xm0 xm0Var = (xm0) this.f39934b;
                if (i10 == 0) {
                    xm0Var.f43194w = "male";
                    xm0Var.Y[4].setText(LocaleController.getString(R.string.PassportMale));
                    return;
                } else if (i10 == 1) {
                    xm0Var.f43194w = "female";
                    xm0Var.Y[4].setText(LocaleController.getString(R.string.PassportFemale));
                    return;
                } else {
                    xm0Var.getClass();
                    return;
                }
            default:
                z71.d0((z71) this.f39934b, i10);
                return;
        }
    }
}
