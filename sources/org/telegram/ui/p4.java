package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class p4 implements DialogInterface.OnClickListener {
    public final int f39953a;
    public final Object f39954b;

    public p4(Object obj, int i10) {
        this.f39953a = i10;
        this.f39954b = obj;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        ri.i iVar;
        String str;
        int i11 = 0;
        switch (this.f39953a) {
            case 0:
                r4 r4Var = (r4) this.f39954b;
                r4Var.getClass();
                ti.b bVar = ti.e.f47237c;
                if (i10 == 0) {
                    iVar = ri.i.f45833a;
                } else {
                    iVar = ri.i.f45834b;
                }
                bVar.b(iVar);
                r4Var.f40571b.m(2);
                return;
            case 1:
                ey eyVar = (ey) this.f39954b;
                if (i10 == 0) {
                    eyVar.getMessagesStorage().readAllDialogs(1);
                    return;
                } else if (i10 != 1 || eyVar.f36630e0 == null) {
                    return;
                } else {
                    while (true) {
                        dy[] dyVarArr = eyVar.f36630e0;
                        if (i11 < dyVarArr.length) {
                            dy dyVar = dyVarArr[i11];
                            if (dyVar.f36339s == 0 && dyVar.getVisibility() == 0) {
                                org.telegram.ui.Cells.r2 O3 = ey.O3(eyVar.f36630e0[i11]);
                                zx zxVar = eyVar.f36630e0[i11].f36333a;
                                int i12 = zx.f43824t3;
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
                eg0 eg0Var = (eg0) this.f39954b;
                if (i10 == 0) {
                    BuildVars.LOGS_ENABLED = !BuildVars.LOGS_ENABLED;
                    ApplicationLoader.applicationContext.getSharedPreferences("systemConfig", 0).edit().putBoolean("logsEnabled", BuildVars.LOGS_ENABLED).commit();
                    org.telegram.ui.Components.xc a02 = org.telegram.ui.Components.xc.a0(eg0Var.V);
                    int i13 = R.raw.chats_infotip;
                    if (BuildVars.LOGS_ENABLED) {
                        str = "Logs enabled.";
                    } else {
                        str = "Logs disabled.";
                    }
                    a02.Q(i13, 36, str).j();
                    if (BuildVars.LOGS_ENABLED) {
                        org.telegram.messenger.q.r(new StringBuilder("app start time = "), ApplicationLoader.startTime);
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
                ProfileActivity.H4(eg0Var.V.getParentActivity(), false);
                return;
            case 3:
                xm0 xm0Var = (xm0) this.f39954b;
                if (i10 == 0) {
                    xm0Var.f43212w = "male";
                    xm0Var.Y[4].setText(LocaleController.getString(R.string.PassportMale));
                    return;
                } else if (i10 == 1) {
                    xm0Var.f43212w = "female";
                    xm0Var.Y[4].setText(LocaleController.getString(R.string.PassportFemale));
                    return;
                } else {
                    xm0Var.getClass();
                    return;
                }
            default:
                z71.d0((z71) this.f39954b, i10);
                return;
        }
    }
}
