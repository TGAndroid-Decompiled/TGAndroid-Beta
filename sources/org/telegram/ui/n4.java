package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class n4 implements DialogInterface.OnClickListener {
    public final int f41753a;
    public final Object f41754b;

    public n4(Object obj, int i10) {
        this.f41753a = i10;
        this.f41754b = obj;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        ui.h hVar;
        String str;
        int i11 = 0;
        switch (this.f41753a) {
            case 0:
                p4 p4Var = (p4) this.f41754b;
                p4Var.getClass();
                wi.b bVar = wi.e.f51278c;
                if (i10 == 0) {
                    hVar = ui.h.f49929a;
                } else {
                    hVar = ui.h.f49930b;
                }
                bVar.b(hVar);
                p4Var.f42350b.m(2);
                return;
            case 1:
                cy cyVar = (cy) this.f41754b;
                if (i10 == 0) {
                    cyVar.getMessagesStorage().readAllDialogs(1);
                    return;
                } else if (i10 != 1 || cyVar.f38586e0 == null) {
                    return;
                } else {
                    while (true) {
                        ay[] ayVarArr = cyVar.f38586e0;
                        if (i11 < ayVarArr.length) {
                            ay ayVar = ayVarArr[i11];
                            if (ayVar.f37919s == 0 && ayVar.getVisibility() == 0) {
                                org.telegram.ui.Cells.p2 Y3 = cy.Y3(cyVar.f38586e0[i11]);
                                wx wxVar = cyVar.f38586e0[i11].f37913a;
                                int i12 = wx.C3;
                                wxVar.F1(true, Y3);
                            }
                            i11++;
                        } else {
                            return;
                        }
                    }
                }
                break;
            case 2:
                fg0 fg0Var = (fg0) this.f41754b;
                if (i10 == 0) {
                    BuildVars.LOGS_ENABLED = !BuildVars.LOGS_ENABLED;
                    ApplicationLoader.applicationContext.getSharedPreferences("systemConfig", 0).edit().putBoolean("logsEnabled", BuildVars.LOGS_ENABLED).commit();
                    org.telegram.ui.Components.wc b02 = org.telegram.ui.Components.wc.b0(fg0Var.f39362a0);
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
                ProfileActivity.P4(fg0Var.f39362a0.getParentActivity(), false);
                return;
            case 3:
                in0 in0Var = (in0) this.f41754b;
                if (i10 == 0) {
                    in0Var.f40321w = "male";
                    in0Var.Y[4].setText(LocaleController.getString(R.string.PassportMale));
                    return;
                } else if (i10 == 1) {
                    in0Var.f40321w = "female";
                    in0Var.Y[4].setText(LocaleController.getString(R.string.PassportFemale));
                    return;
                } else {
                    in0Var.getClass();
                    return;
                }
            default:
                d81.d0((d81) this.f41754b, i10);
                return;
        }
    }
}
