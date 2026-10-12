package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class m4 implements DialogInterface.OnClickListener {
    public final int f39905a;
    public final Object f39906b;

    public m4(Object obj, int i10) {
        this.f39905a = i10;
        this.f39906b = obj;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        pi.l lVar;
        String str;
        int i11 = 0;
        switch (this.f39905a) {
            case 0:
                o4 o4Var = (o4) this.f39906b;
                o4Var.getClass();
                ri.b bVar = ri.e.f47790c;
                if (i10 == 0) {
                    lVar = pi.l.f45790a;
                } else {
                    lVar = pi.l.f45791b;
                }
                bVar.b(lVar);
                o4Var.f40555b.m(2);
                return;
            case 1:
                vy vyVar = (vy) this.f39906b;
                if (i10 == 0) {
                    vyVar.getMessagesStorage().readAllDialogs(1);
                    return;
                } else if (i10 != 1 || vyVar.f42903e0 == null) {
                    return;
                } else {
                    while (true) {
                        uy[] uyVarArr = vyVar.f42903e0;
                        if (i11 < uyVarArr.length) {
                            uy uyVar = uyVarArr[i11];
                            if (uyVar.f42618s == 0 && uyVar.getVisibility() == 0) {
                                org.telegram.ui.Cells.s2 N3 = vy.N3(vyVar.f42903e0[i11]);
                                ry ryVar = vyVar.f42903e0[i11].f42611a;
                                int i12 = ry.f41749t3;
                                ryVar.A1(true, N3);
                            }
                            i11++;
                        } else {
                            return;
                        }
                    }
                }
                break;
            case 2:
                wg0 wg0Var = (wg0) this.f39906b;
                if (i10 == 0) {
                    BuildVars.LOGS_ENABLED = !BuildVars.LOGS_ENABLED;
                    ApplicationLoader.applicationContext.getSharedPreferences("systemConfig", 0).edit().putBoolean("logsEnabled", BuildVars.LOGS_ENABLED).commit();
                    org.telegram.ui.Components.zc a02 = org.telegram.ui.Components.zc.a0(wg0Var.V);
                    int i13 = R.raw.chats_infotip;
                    if (BuildVars.LOGS_ENABLED) {
                        str = "Logs enabled.";
                    } else {
                        str = "Logs disabled.";
                    }
                    a02.Q(i13, 36, str).j();
                    if (BuildVars.LOGS_ENABLED) {
                        hg.c.x(new StringBuilder("app start time = "), ApplicationLoader.startTime);
                        try {
                            FileLog.d("buildVersion = " + ApplicationLoader.applicationContext.getPackageManager().getPackageInfo(ApplicationLoader.applicationContext.getPackageName(), 0).versionCode);
                            return;
                        } catch (Exception e7) {
                            FileLog.e(e7);
                            return;
                        }
                    }
                    return;
                }
                ProfileActivity.H4(wg0Var.V.getParentActivity(), false);
                return;
            case 3:
                pn0 pn0Var = (pn0) this.f39906b;
                if (i10 == 0) {
                    pn0Var.f41049w = "male";
                    pn0Var.Y[4].setText(LocaleController.getString(R.string.PassportMale));
                    return;
                } else if (i10 == 1) {
                    pn0Var.f41049w = "female";
                    pn0Var.Y[4].setText(LocaleController.getString(R.string.PassportFemale));
                    return;
                } else {
                    pn0Var.getClass();
                    return;
                }
            default:
                k91.d0((k91) this.f39906b, i10);
                return;
        }
    }
}
