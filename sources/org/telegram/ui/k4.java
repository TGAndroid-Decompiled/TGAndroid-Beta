package org.telegram.ui;

import android.content.DialogInterface;
public final class k4 implements DialogInterface.OnClickListener {
    public final int f47077a;
    public final Object f47078b;

    public k4(Object obj, int i7) {
        this.f47077a = i7;
        this.f47078b = obj;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i7) {
        vi.f fVar;
        String str;
        int i10 = 0;
        switch (this.f47077a) {
            case 0:
                xy0 xy0Var = (xy0) this.f47078b;
                xy0Var.getClass();
                xi.b bVar = xi.e.f58739c;
                if (i7 == 0) {
                    fVar = vi.f.f57417a;
                } else {
                    fVar = vi.f.f57418b;
                }
                bVar.b(fVar);
                ((l4) xy0Var.f51998c).g(2);
                return;
            case 1:
                ww wwVar = (ww) this.f47078b;
                if (i7 == 0) {
                    org.telegram.messenger.yr messagesStorage = wwVar.getMessagesStorage();
                    messagesStorage.f26688a.c(new org.telegram.messenger.tp(messagesStorage, 1, 3));
                    return;
                } else if (i7 != 1 || wwVar.f51534e0 == null) {
                    return;
                } else {
                    while (true) {
                        vw[] vwVarArr = wwVar.f51534e0;
                        if (i10 < vwVarArr.length) {
                            vw vwVar = vwVarArr[i10];
                            if (vwVar.f50840s == 0 && vwVar.getVisibility() == 0) {
                                org.telegram.ui.Cells.t2 c42 = ww.c4(wwVar.f51534e0[i10]);
                                sw swVar = wwVar.f51534e0[i10].f50833a;
                                int i11 = sw.B3;
                                swVar.C1(true, c42);
                            }
                            i10++;
                        } else {
                            return;
                        }
                    }
                }
                break;
            case 2:
                be0 be0Var = (be0) this.f47078b;
                if (i7 == 0) {
                    org.telegram.messenger.r2.f25191a = !org.telegram.messenger.r2.f25191a;
                    org.telegram.messenger.t0.f25555b.getSharedPreferences("systemConfig", 0).edit().putBoolean("logsEnabled", org.telegram.messenger.r2.f25191a).commit();
                    org.telegram.ui.Components.hc a02 = org.telegram.ui.Components.hc.a0(be0Var.f44286g0);
                    if (org.telegram.messenger.r2.f25191a) {
                        str = "Logs enabled.";
                    } else {
                        str = "Logs disabled.";
                    }
                    a02.Q(2131623981, 36, str).j();
                    if (org.telegram.messenger.r2.f25191a) {
                        jg.g.u(org.telegram.messenger.t0.f25561s, new StringBuilder("app start time = "));
                        try {
                            org.telegram.messenger.a8.b("buildVersion = " + org.telegram.messenger.t0.f25555b.getPackageManager().getPackageInfo(org.telegram.messenger.t0.f25555b.getPackageName(), 0).versionCode);
                            return;
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                            return;
                        }
                    }
                    return;
                }
                ProfileActivity.V4(be0Var.f44286g0.getParentActivity(), false);
                return;
            default:
                bk0 bk0Var = (bk0) this.f47078b;
                if (i7 == 0) {
                    bk0Var.f44396x = "male";
                    bk0Var.Y[4].setText(org.telegram.messenger.hd.M0(2131747507, null));
                    return;
                } else if (i7 == 1) {
                    bk0Var.f44396x = "female";
                    bk0Var.Y[4].setText(org.telegram.messenger.hd.M0(2131747568, null));
                    return;
                } else {
                    bk0Var.getClass();
                    return;
                }
        }
    }
}
