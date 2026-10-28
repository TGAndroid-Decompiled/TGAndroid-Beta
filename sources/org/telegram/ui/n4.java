package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class n4 implements DialogInterface.OnClickListener {
    public final int f41628a;
    public final Object f41629b;

    public n4(Object obj, int i10) {
        this.f41628a = i10;
        this.f41629b = obj;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        ui.h hVar;
        String str;
        int i11 = 0;
        switch (this.f41628a) {
            case 0:
                p4 p4Var = (p4) this.f41629b;
                p4Var.getClass();
                wi.b bVar = wi.e.f51336c;
                if (i10 == 0) {
                    hVar = ui.h.f49964a;
                } else {
                    hVar = ui.h.f49965b;
                }
                bVar.b(hVar);
                p4Var.f42297b.m(2);
                return;
            case 1:
                ey eyVar = (ey) this.f41629b;
                if (i10 == 0) {
                    eyVar.getMessagesStorage().readAllDialogs(1);
                    return;
                } else if (i10 != 1 || eyVar.f38998e0 == null) {
                    return;
                } else {
                    while (true) {
                        dy[] dyVarArr = eyVar.f38998e0;
                        if (i11 < dyVarArr.length) {
                            dy dyVar = dyVarArr[i11];
                            if (dyVar.f38708s == 0 && dyVar.getVisibility() == 0) {
                                org.telegram.ui.Cells.p2 Y3 = ey.Y3(eyVar.f38998e0[i11]);
                                zx zxVar = eyVar.f38998e0[i11].f38702a;
                                int i12 = zx.C3;
                                zxVar.F1(true, Y3);
                            }
                            i11++;
                        } else {
                            return;
                        }
                    }
                }
                break;
            case 2:
                hg0 hg0Var = (hg0) this.f41629b;
                if (i10 == 0) {
                    BuildVars.LOGS_ENABLED = !BuildVars.LOGS_ENABLED;
                    ApplicationLoader.applicationContext.getSharedPreferences("systemConfig", 0).edit().putBoolean("logsEnabled", BuildVars.LOGS_ENABLED).commit();
                    org.telegram.ui.Components.wc b02 = org.telegram.ui.Components.wc.b0(hg0Var.f39882a0);
                    int i13 = R.raw.chats_infotip;
                    if (BuildVars.LOGS_ENABLED) {
                        str = "Logs enabled.";
                    } else {
                        str = "Logs disabled.";
                    }
                    b02.R(i13, 36, str).j();
                    if (BuildVars.LOGS_ENABLED) {
                        org.telegram.messenger.t.s(new StringBuilder("app start time = "), ApplicationLoader.startTime);
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
                ProfileActivity.P4(hg0Var.f39882a0.getParentActivity(), false);
                return;
            case 3:
                kn0 kn0Var = (kn0) this.f41629b;
                if (i10 == 0) {
                    kn0Var.f40884w = "male";
                    kn0Var.Y[4].setText(LocaleController.getString(R.string.PassportMale));
                    return;
                } else if (i10 == 1) {
                    kn0Var.f40884w = "female";
                    kn0Var.Y[4].setText(LocaleController.getString(R.string.PassportFemale));
                    return;
                } else {
                    kn0Var.getClass();
                    return;
                }
            default:
                f81.d0((f81) this.f41629b, i10);
                return;
        }
    }
}
