package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class o4 implements DialogInterface.OnClickListener {
    public final int f38540a;
    public final Object f38541b;

    public o4(Object obj, int i10) {
        this.f38540a = i10;
        this.f38541b = obj;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        qi.j jVar;
        String str;
        int i11 = 0;
        switch (this.f38540a) {
            case 0:
                q4 q4Var = (q4) this.f38541b;
                q4Var.getClass();
                si.b bVar = si.e.f45486c;
                if (i10 == 0) {
                    jVar = qi.j.f43409a;
                } else {
                    jVar = qi.j.f43410b;
                }
                bVar.b(jVar);
                q4Var.f39058b.m(2);
                return;
            case 1:
                yy yyVar = (yy) this.f38541b;
                if (i10 == 0) {
                    yyVar.getMessagesStorage().readAllDialogs(1);
                    return;
                } else if (i10 != 1 || yyVar.f42004e0 == null) {
                    return;
                } else {
                    while (true) {
                        xy[] xyVarArr = yyVar.f42004e0;
                        if (i11 < xyVarArr.length) {
                            xy xyVar = xyVarArr[i11];
                            if (xyVar.f41685s == 0 && xyVar.getVisibility() == 0) {
                                org.telegram.ui.Cells.s2 O3 = yy.O3(yyVar.f42004e0[i11]);
                                uy uyVar = yyVar.f42004e0[i11].f41679a;
                                int i12 = uy.f40506t3;
                                uyVar.A1(true, O3);
                            }
                            i11++;
                        } else {
                            return;
                        }
                    }
                }
                break;
            case 2:
                zg0 zg0Var = (zg0) this.f38541b;
                if (i10 == 0) {
                    BuildVars.LOGS_ENABLED = !BuildVars.LOGS_ENABLED;
                    ApplicationLoader.applicationContext.getSharedPreferences("systemConfig", 0).edit().putBoolean("logsEnabled", BuildVars.LOGS_ENABLED).commit();
                    org.telegram.ui.Components.zc a02 = org.telegram.ui.Components.zc.a0(zg0Var.V);
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
                ProfileActivity.H4(zg0Var.V.getParentActivity(), false);
                return;
            case 3:
                sn0 sn0Var = (sn0) this.f38541b;
                if (i10 == 0) {
                    sn0Var.f39903w = "male";
                    sn0Var.Y[4].setText(LocaleController.getString(R.string.PassportMale));
                    return;
                } else if (i10 == 1) {
                    sn0Var.f39903w = "female";
                    sn0Var.Y[4].setText(LocaleController.getString(R.string.PassportFemale));
                    return;
                } else {
                    sn0Var.getClass();
                    return;
                }
            default:
                o91.d0((o91) this.f38541b, i10);
                return;
        }
    }
}
