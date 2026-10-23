package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class o4 implements DialogInterface.OnClickListener {
    public final int f40059a;
    public final Object f40060b;

    public o4(Object obj, int i10) {
        this.f40059a = i10;
        this.f40060b = obj;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        ri.h hVar;
        String str;
        int i11 = 0;
        switch (this.f40059a) {
            case 0:
                q4 q4Var = (q4) this.f40060b;
                q4Var.getClass();
                ti.b bVar = ti.e.f47660c;
                if (i10 == 0) {
                    hVar = ri.h.f46237a;
                } else {
                    hVar = ri.h.f46238b;
                }
                bVar.b(hVar);
                q4Var.f40620b.m(2);
                return;
            case 1:
                ey eyVar = (ey) this.f40060b;
                if (i10 == 0) {
                    eyVar.getMessagesStorage().readAllDialogs(1);
                    return;
                } else if (i10 != 1 || eyVar.f37059e0 == null) {
                    return;
                } else {
                    while (true) {
                        dy[] dyVarArr = eyVar.f37059e0;
                        if (i11 < dyVarArr.length) {
                            dy dyVar = dyVarArr[i11];
                            if (dyVar.f36756s == 0 && dyVar.getVisibility() == 0) {
                                org.telegram.ui.Cells.q2 O3 = ey.O3(eyVar.f37059e0[i11]);
                                zx zxVar = eyVar.f37059e0[i11].f36750a;
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
                hg0 hg0Var = (hg0) this.f40060b;
                if (i10 == 0) {
                    BuildVars.LOGS_ENABLED = !BuildVars.LOGS_ENABLED;
                    ApplicationLoader.applicationContext.getSharedPreferences("systemConfig", 0).edit().putBoolean("logsEnabled", BuildVars.LOGS_ENABLED).commit();
                    org.telegram.ui.Components.xc a02 = org.telegram.ui.Components.xc.a0(hg0Var.f37846a0);
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
                ProfileActivity.J4(hg0Var.f37846a0.getParentActivity(), false);
                return;
            case 3:
                an0 an0Var = (an0) this.f40060b;
                if (i10 == 0) {
                    an0Var.f35750w = "male";
                    an0Var.Y[4].setText(LocaleController.getString(R.string.PassportMale));
                    return;
                } else if (i10 == 1) {
                    an0Var.f35750w = "female";
                    an0Var.Y[4].setText(LocaleController.getString(R.string.PassportFemale));
                    return;
                } else {
                    an0Var.getClass();
                    return;
                }
            default:
                c81.d0((c81) this.f40060b, i10);
                return;
        }
    }
}
