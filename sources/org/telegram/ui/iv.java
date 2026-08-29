package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
public final class iv implements DialogInterface.OnClickListener {
    public final int f39339a;
    public final NotificationCenter.NotificationCenterDelegate f39340b;

    public iv(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f39339a = i10;
        this.f39340b = notificationCenterDelegate;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        String str;
        int i11 = 0;
        switch (this.f39339a) {
            case 0:
                fy fyVar = (fy) this.f39340b;
                if (i10 == 0) {
                    fyVar.getMessagesStorage().readAllDialogs(1);
                    return;
                } else if (i10 != 1 || fyVar.f38256a0 == null) {
                    return;
                } else {
                    while (true) {
                        ey[] eyVarArr = fyVar.f38256a0;
                        if (i11 < eyVarArr.length) {
                            ey eyVar = eyVarArr[i11];
                            if (eyVar.f37928s == 0 && eyVar.getVisibility() == 0) {
                                org.telegram.ui.Cells.p2 Q3 = fy.Q3(fyVar.f38256a0[i11]);
                                ay ayVar = fyVar.f38256a0[i11].f37921a;
                                int i12 = ay.f36618r3;
                                ayVar.z1(true, Q3);
                            }
                            i11++;
                        } else {
                            return;
                        }
                    }
                }
                break;
            case 1:
                eg0 eg0Var = (eg0) this.f39340b;
                if (i10 == 0) {
                    BuildVars.LOGS_ENABLED = !BuildVars.LOGS_ENABLED;
                    ApplicationLoader.applicationContext.getSharedPreferences("systemConfig", 0).edit().putBoolean("logsEnabled", BuildVars.LOGS_ENABLED).commit();
                    org.telegram.ui.Components.tc a02 = org.telegram.ui.Components.tc.a0(eg0Var.R);
                    int i13 = R.raw.chats_infotip;
                    if (BuildVars.LOGS_ENABLED) {
                        str = "Logs enabled.";
                    } else {
                        str = "Logs disabled.";
                    }
                    a02.Q(i13, 36, str).j();
                    if (BuildVars.LOGS_ENABLED) {
                        j7.l1.x(new StringBuilder("app start time = "), ApplicationLoader.startTime);
                        try {
                            FileLog.d("buildVersion = " + ApplicationLoader.applicationContext.getPackageManager().getPackageInfo(ApplicationLoader.applicationContext.getPackageName(), 0).versionCode);
                            return;
                        } catch (Exception e10) {
                            FileLog.e(e10);
                            return;
                        }
                    }
                    return;
                }
                ProfileActivity.H4(eg0Var.R.getParentActivity(), false);
                return;
            case 2:
                vm0 vm0Var = (vm0) this.f39340b;
                if (i10 == 0) {
                    vm0Var.f43672w = "male";
                    vm0Var.U[4].setText(LocaleController.getString(R.string.PassportMale));
                    return;
                } else if (i10 == 1) {
                    vm0Var.f43672w = "female";
                    vm0Var.U[4].setText(LocaleController.getString(R.string.PassportFemale));
                    return;
                } else {
                    vm0Var.getClass();
                    return;
                }
            default:
                b81.c0((b81) this.f39340b, i10);
                return;
        }
    }
}
