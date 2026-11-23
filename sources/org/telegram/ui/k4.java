package org.telegram.ui;

import android.content.DialogInterface;
public final class k4 implements DialogInterface.OnClickListener {
    public final int f49312a;
    public final Object f49313b;

    public k4(Object obj, int i7) {
        this.f49312a = i7;
        this.f49313b = obj;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i7) {
        yi.g gVar;
        String str;
        int i10 = 0;
        switch (this.f49312a) {
            case 0:
                yy0 yy0Var = (yy0) this.f49313b;
                yy0Var.getClass();
                aj.b bVar = aj.e.f1622c;
                if (i7 == 0) {
                    gVar = yi.g.f61439a;
                } else {
                    gVar = yi.g.f61440b;
                }
                bVar.b(gVar);
                ((l4) yy0Var.f54451c).g(2);
                return;
            case 1:
                bx bxVar = (bx) this.f49313b;
                if (i7 == 0) {
                    org.telegram.messenger.tr messagesStorage = bxVar.getMessagesStorage();
                    messagesStorage.f27149a.c(new org.telegram.messenger.rp(messagesStorage, 1, 2));
                    return;
                } else if (i7 != 1 || bxVar.f46549f0 == null) {
                    return;
                } else {
                    while (true) {
                        ax[] axVarArr = bxVar.f46549f0;
                        if (i10 < axVarArr.length) {
                            ax axVar = axVarArr[i10];
                            if (axVar.f45829s == 0 && axVar.getVisibility() == 0) {
                                org.telegram.ui.Cells.u2 c42 = bx.c4(bxVar.f46549f0[i10]);
                                xw xwVar = bxVar.f46549f0[i10].f45822a;
                                int i11 = xw.C3;
                                xwVar.C1(true, c42);
                            }
                            i10++;
                        } else {
                            return;
                        }
                    }
                }
                break;
            case 2:
                ce0 ce0Var = (ce0) this.f49313b;
                if (i7 == 0) {
                    org.telegram.messenger.s2.f26829a = !org.telegram.messenger.s2.f26829a;
                    org.telegram.messenger.t0.f27013b.getSharedPreferences("systemConfig", 0).edit().putBoolean("logsEnabled", org.telegram.messenger.s2.f26829a).commit();
                    org.telegram.ui.Components.kc b02 = org.telegram.ui.Components.kc.b0(ce0Var.f46781h0);
                    if (org.telegram.messenger.s2.f26829a) {
                        str = "Logs enabled.";
                    } else {
                        str = "Logs disabled.";
                    }
                    b02.Q(2131623982, 36, str).j();
                    if (org.telegram.messenger.s2.f26829a) {
                        i5.c.v(org.telegram.messenger.t0.f27019s, new StringBuilder("app start time = "));
                        try {
                            org.telegram.messenger.a8.b("buildVersion = " + org.telegram.messenger.t0.f27013b.getPackageManager().getPackageInfo(org.telegram.messenger.t0.f27013b.getPackageName(), 0).versionCode);
                            return;
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                            return;
                        }
                    }
                    return;
                }
                ProfileActivity.Y4(ce0Var.f46781h0.getParentActivity(), false);
                return;
            default:
                fk0 fk0Var = (fk0) this.f49313b;
                if (i7 == 0) {
                    fk0Var.f47903x = "male";
                    fk0Var.Z[4].setText(org.telegram.messenger.gd.N0(2131747314, null));
                    return;
                } else if (i7 == 1) {
                    fk0Var.f47903x = "female";
                    fk0Var.Z[4].setText(org.telegram.messenger.gd.N0(2131747375, null));
                    return;
                } else {
                    fk0Var.getClass();
                    return;
                }
        }
    }
}
