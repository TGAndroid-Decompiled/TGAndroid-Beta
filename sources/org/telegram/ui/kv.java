package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;

public final class kv implements DialogInterface.OnClickListener {

    public final int f39887a;

    public final NotificationCenter.NotificationCenterDelegate f39888b;

    public kv(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f39887a = i10;
        this.f39888b = notificationCenterDelegate;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) throws Throwable {
        int i11 = 0;
        switch (this.f39887a) {
            case 0:
                gy gyVar = (gy) this.f39888b;
                if (i10 == 0) {
                    gyVar.getMessagesStorage().readAllDialogs(1);
                    break;
                } else if (i10 == 1 && gyVar.f38498a0 != null) {
                    while (true) {
                        fy[] fyVarArr = gyVar.f38498a0;
                        if (i11 < fyVarArr.length) {
                            fy fyVar = fyVarArr[i11];
                            if (fyVar.f38232s == 0 && fyVar.getVisibility() == 0) {
                                org.telegram.ui.Cells.p2 p2VarQ3 = gy.Q3(gyVar.f38498a0[i11]);
                                cy cyVar = gyVar.f38498a0[i11].f38225a;
                                int i12 = cy.f37191r3;
                                cyVar.z1(true, p2VarQ3);
                            }
                            i11++;
                        }
                        break;
                    }
                }
                break;
            case 1:
                hg0 hg0Var = (hg0) this.f39888b;
                if (i10 != 0) {
                    ProfileActivity.H4(hg0Var.R.getParentActivity(), false);
                } else {
                    BuildVars.LOGS_ENABLED = !BuildVars.LOGS_ENABLED;
                    ApplicationLoader.applicationContext.getSharedPreferences("systemConfig", 0).edit().putBoolean("logsEnabled", BuildVars.LOGS_ENABLED).commit();
                    org.telegram.ui.Components.mc.a0(hg0Var.R).Q(R.raw.chats_infotip, 36, BuildVars.LOGS_ENABLED ? "Logs enabled." : "Logs disabled.").j();
                    if (BuildVars.LOGS_ENABLED) {
                        i0.a.y(new StringBuilder("app start time = "), ApplicationLoader.startTime);
                        try {
                            FileLog.d("buildVersion = " + ApplicationLoader.applicationContext.getPackageManager().getPackageInfo(ApplicationLoader.applicationContext.getPackageName(), 0).versionCode);
                        } catch (Exception e9) {
                            FileLog.e(e9);
                            return;
                        }
                    }
                }
                break;
            case 2:
                xm0 xm0Var = (xm0) this.f39888b;
                if (i10 == 0) {
                    xm0Var.f44529w = "male";
                    xm0Var.U[4].setText(LocaleController.getString(R.string.PassportMale));
                } else if (i10 != 1) {
                    xm0Var.getClass();
                } else {
                    xm0Var.f44529w = "female";
                    xm0Var.U[4].setText(LocaleController.getString(R.string.PassportFemale));
                }
                break;
            default:
                x71.c0((x71) this.f39888b, i10);
                break;
        }
    }
}
