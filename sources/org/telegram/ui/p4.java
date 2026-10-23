package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class p4 implements DialogInterface.OnClickListener {
    public final int f40063a;
    public final Object f40064b;

    public p4(Object obj, int i10) {
        this.f40063a = i10;
        this.f40064b = obj;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        ri.h hVar;
        String str;
        int i11 = 0;
        switch (this.f40063a) {
            case 0:
                r4 r4Var = (r4) this.f40064b;
                r4Var.getClass();
                ti.b bVar = ti.e.f47225c;
                if (i10 == 0) {
                    hVar = ri.h.f45816a;
                } else {
                    hVar = ri.h.f45817b;
                }
                bVar.b(hVar);
                r4Var.f41060b.m(2);
                return;
            case 1:
                cy cyVar = (cy) this.f40064b;
                if (i10 == 0) {
                    cyVar.getMessagesStorage().readAllDialogs(1);
                    return;
                } else if (i10 != 1 || cyVar.f36096e0 == null) {
                    return;
                } else {
                    while (true) {
                        ay[] ayVarArr = cyVar.f36096e0;
                        if (i11 < ayVarArr.length) {
                            ay ayVar = ayVarArr[i11];
                            if (ayVar.f35453s == 0 && ayVar.getVisibility() == 0) {
                                org.telegram.ui.Cells.r2 O3 = cy.O3(cyVar.f36096e0[i11]);
                                xx xxVar = cyVar.f36096e0[i11].f35447a;
                                int i12 = xx.f43293t3;
                                xxVar.A1(true, O3);
                            }
                            i11++;
                        } else {
                            return;
                        }
                    }
                }
                break;
            case 2:
                cg0 cg0Var = (cg0) this.f40064b;
                if (i10 == 0) {
                    BuildVars.LOGS_ENABLED = !BuildVars.LOGS_ENABLED;
                    ApplicationLoader.applicationContext.getSharedPreferences("systemConfig", 0).edit().putBoolean("logsEnabled", BuildVars.LOGS_ENABLED).commit();
                    org.telegram.ui.Components.xc a02 = org.telegram.ui.Components.xc.a0(cg0Var.V);
                    int i13 = R.raw.chats_infotip;
                    if (BuildVars.LOGS_ENABLED) {
                        str = "Logs enabled.";
                    } else {
                        str = "Logs disabled.";
                    }
                    a02.Q(i13, 36, str).j();
                    if (BuildVars.LOGS_ENABLED) {
                        i2.e.x(new StringBuilder("app start time = "), ApplicationLoader.startTime);
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
                ProfileActivity.H4(cg0Var.V.getParentActivity(), false);
                return;
            case 3:
                vm0 vm0Var = (vm0) this.f40064b;
                if (i10 == 0) {
                    vm0Var.f42334w = "male";
                    vm0Var.Y[4].setText(LocaleController.getString(R.string.PassportMale));
                    return;
                } else if (i10 == 1) {
                    vm0Var.f42334w = "female";
                    vm0Var.Y[4].setText(LocaleController.getString(R.string.PassportFemale));
                    return;
                } else {
                    vm0Var.getClass();
                    return;
                }
            default:
                x71.d0((x71) this.f40064b, i10);
                return;
        }
    }
}
