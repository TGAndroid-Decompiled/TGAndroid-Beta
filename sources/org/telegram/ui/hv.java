package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
public final class hv implements DialogInterface.OnClickListener {
    public final int f38941a;
    public final NotificationCenter.NotificationCenterDelegate f38942b;

    public hv(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i9) {
        this.f38941a = i9;
        this.f38942b = notificationCenterDelegate;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i9) {
        String str;
        int i10 = 0;
        switch (this.f38941a) {
            case 0:
                dy dyVar = (dy) this.f38942b;
                if (i9 == 0) {
                    dyVar.getMessagesStorage().readAllDialogs(1);
                    return;
                } else if (i9 != 1 || dyVar.f37629a0 == null) {
                    return;
                } else {
                    while (true) {
                        cy[] cyVarArr = dyVar.f37629a0;
                        if (i10 < cyVarArr.length) {
                            cy cyVar = cyVarArr[i10];
                            if (cyVar.f37357s == 0 && cyVar.getVisibility() == 0) {
                                org.telegram.ui.Cells.r2 Q3 = dy.Q3(dyVar.f37629a0[i10]);
                                yx yxVar = dyVar.f37629a0[i10].f37350a;
                                int i11 = yx.f44960r3;
                                yxVar.z1(true, Q3);
                            }
                            i10++;
                        } else {
                            return;
                        }
                    }
                }
                break;
            case 1:
                eg0 eg0Var = (eg0) this.f38942b;
                if (i9 == 0) {
                    BuildVars.LOGS_ENABLED = !BuildVars.LOGS_ENABLED;
                    ApplicationLoader.applicationContext.getSharedPreferences("systemConfig", 0).edit().putBoolean("logsEnabled", BuildVars.LOGS_ENABLED).commit();
                    org.telegram.ui.Components.oc a02 = org.telegram.ui.Components.oc.a0(eg0Var.R);
                    int i12 = R.raw.chats_infotip;
                    if (BuildVars.LOGS_ENABLED) {
                        str = "Logs enabled.";
                    } else {
                        str = "Logs disabled.";
                    }
                    a02.Q(i12, 36, str).j();
                    if (BuildVars.LOGS_ENABLED) {
                        j3.r0.z(new StringBuilder("app start time = "), ApplicationLoader.startTime);
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
                wm0 wm0Var = (wm0) this.f38942b;
                if (i9 == 0) {
                    wm0Var.f44198w = "male";
                    wm0Var.U[4].setText(LocaleController.getString(R.string.PassportMale));
                    return;
                } else if (i9 == 1) {
                    wm0Var.f44198w = "female";
                    wm0Var.U[4].setText(LocaleController.getString(R.string.PassportFemale));
                    return;
                } else {
                    wm0Var.getClass();
                    return;
                }
            default:
                z71.b0((z71) this.f38942b, i9);
                return;
        }
    }
}
