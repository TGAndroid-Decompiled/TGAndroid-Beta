package org.telegram.ui;

import android.content.DialogInterface;
public final class k4 implements DialogInterface.OnClickListener {
    public final int f47154a;
    public final Object f47155b;

    public k4(Object obj, int i7) {
        this.f47154a = i7;
        this.f47155b = obj;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i7) {
        vi.f fVar;
        String str;
        int i10 = 0;
        switch (this.f47154a) {
            case 0:
                bz0 bz0Var = (bz0) this.f47155b;
                bz0Var.getClass();
                xi.b bVar = xi.e.f58866c;
                if (i7 == 0) {
                    fVar = vi.f.f57545a;
                } else {
                    fVar = vi.f.f57546b;
                }
                bVar.b(fVar);
                ((l4) bz0Var.f44186c).g(2);
                return;
            case 1:
                zw zwVar = (zw) this.f47155b;
                if (i7 == 0) {
                    org.telegram.messenger.yr messagesStorage = zwVar.getMessagesStorage();
                    messagesStorage.f26723a.c(new org.telegram.messenger.tp(messagesStorage, 1, 3));
                    return;
                } else if (i7 != 1 || zwVar.f52577e0 == null) {
                    return;
                } else {
                    while (true) {
                        yw[] ywVarArr = zwVar.f52577e0;
                        if (i10 < ywVarArr.length) {
                            yw ywVar = ywVarArr[i10];
                            if (ywVar.f52132s == 0 && ywVar.getVisibility() == 0) {
                                org.telegram.ui.Cells.t2 c42 = zw.c4(zwVar.f52577e0[i10]);
                                vw vwVar = zwVar.f52577e0[i10].f52125a;
                                int i11 = vw.B3;
                                vwVar.C1(true, c42);
                            }
                            i10++;
                        } else {
                            return;
                        }
                    }
                }
                break;
            case 2:
                ee0 ee0Var = (ee0) this.f47155b;
                if (i7 == 0) {
                    org.telegram.messenger.r2.f25216a = !org.telegram.messenger.r2.f25216a;
                    org.telegram.messenger.t0.f25570b.getSharedPreferences("systemConfig", 0).edit().putBoolean("logsEnabled", org.telegram.messenger.r2.f25216a).commit();
                    org.telegram.ui.Components.gc a02 = org.telegram.ui.Components.gc.a0(ee0Var.f45255g0);
                    if (org.telegram.messenger.r2.f25216a) {
                        str = "Logs enabled.";
                    } else {
                        str = "Logs disabled.";
                    }
                    a02.Q(2131623981, 36, str).j();
                    if (org.telegram.messenger.r2.f25216a) {
                        jg.g.u(org.telegram.messenger.t0.f25576s, new StringBuilder("app start time = "));
                        try {
                            org.telegram.messenger.a8.b("buildVersion = " + org.telegram.messenger.t0.f25570b.getPackageManager().getPackageInfo(org.telegram.messenger.t0.f25570b.getPackageName(), 0).versionCode);
                            return;
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                            return;
                        }
                    }
                    return;
                }
                ProfileActivity.Y4(ee0Var.f45255g0.getParentActivity(), false);
                return;
            default:
                ek0 ek0Var = (ek0) this.f47155b;
                if (i7 == 0) {
                    ek0Var.f45367x = "male";
                    ek0Var.Y[4].setText(org.telegram.messenger.id.M0(2131747508, null));
                    return;
                } else if (i7 == 1) {
                    ek0Var.f45367x = "female";
                    ek0Var.Y[4].setText(org.telegram.messenger.id.M0(2131747569, null));
                    return;
                } else {
                    ek0Var.getClass();
                    return;
                }
        }
    }
}
