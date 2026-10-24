package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class o4 implements DialogInterface.OnClickListener {
    public final int f40071a;
    public final Object f40072b;

    public o4(Object obj, int i10) {
        this.f40071a = i10;
        this.f40072b = obj;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        ri.h hVar;
        String str;
        int i11 = 0;
        switch (this.f40071a) {
            case 0:
                q4 q4Var = (q4) this.f40072b;
                q4Var.getClass();
                ti.b bVar = ti.e.f47659c;
                if (i10 == 0) {
                    hVar = ri.h.f46236a;
                } else {
                    hVar = ri.h.f46237b;
                }
                bVar.b(hVar);
                q4Var.f40707b.m(2);
                return;
            case 1:
                ey eyVar = (ey) this.f40072b;
                if (i10 == 0) {
                    eyVar.getMessagesStorage().readAllDialogs(1);
                    return;
                } else if (i10 != 1 || eyVar.f37034e0 == null) {
                    return;
                } else {
                    while (true) {
                        dy[] dyVarArr = eyVar.f37034e0;
                        if (i11 < dyVarArr.length) {
                            dy dyVar = dyVarArr[i11];
                            if (dyVar.f36743s == 0 && dyVar.getVisibility() == 0) {
                                org.telegram.ui.Cells.q2 O3 = ey.O3(eyVar.f37034e0[i11]);
                                zx zxVar = eyVar.f37034e0[i11].f36737a;
                                int i12 = zx.f44222w3;
                                zxVar.F1(true, O3);
                            }
                            i11++;
                        } else {
                            return;
                        }
                    }
                }
                break;
            case 2:
                gg0 gg0Var = (gg0) this.f40072b;
                if (i10 == 0) {
                    BuildVars.LOGS_ENABLED = !BuildVars.LOGS_ENABLED;
                    ApplicationLoader.applicationContext.getSharedPreferences("systemConfig", 0).edit().putBoolean("logsEnabled", BuildVars.LOGS_ENABLED).commit();
                    org.telegram.ui.Components.vc a02 = org.telegram.ui.Components.vc.a0(gg0Var.f37562a0);
                    int i13 = R.raw.chats_infotip;
                    if (BuildVars.LOGS_ENABLED) {
                        str = "Logs enabled.";
                    } else {
                        str = "Logs disabled.";
                    }
                    a02.Q(i13, 36, str).j();
                    if (BuildVars.LOGS_ENABLED) {
                        i2.o1.x(new StringBuilder("app start time = "), ApplicationLoader.startTime);
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
                ProfileActivity.J4(gg0Var.f37562a0.getParentActivity(), false);
                return;
            case 3:
                zm0 zm0Var = (zm0) this.f40072b;
                if (i10 == 0) {
                    zm0Var.f44173w = "male";
                    zm0Var.Y[4].setText(LocaleController.getString(R.string.PassportMale));
                    return;
                } else if (i10 == 1) {
                    zm0Var.f44173w = "female";
                    zm0Var.Y[4].setText(LocaleController.getString(R.string.PassportFemale));
                    return;
                } else {
                    zm0Var.getClass();
                    return;
                }
            default:
                b81.d0((b81) this.f40072b, i10);
                return;
        }
    }
}
