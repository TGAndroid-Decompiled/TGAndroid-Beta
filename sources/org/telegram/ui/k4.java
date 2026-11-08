package org.telegram.ui;

import android.content.DialogInterface;
public final class k4 implements DialogInterface.OnClickListener {
    public final int f47097a;
    public final Object f47098b;

    public k4(Object obj, int i7) {
        this.f47097a = i7;
        this.f47098b = obj;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i7) {
        vi.f fVar;
        String str;
        int i10 = 0;
        switch (this.f47097a) {
            case 0:
                xy0 xy0Var = (xy0) this.f47098b;
                xy0Var.getClass();
                xi.b bVar = xi.e.f58858c;
                if (i7 == 0) {
                    fVar = vi.f.f57533a;
                } else {
                    fVar = vi.f.f57534b;
                }
                bVar.b(fVar);
                ((l4) xy0Var.f52010c).g(2);
                return;
            case 1:
                ww wwVar = (ww) this.f47098b;
                if (i7 == 0) {
                    org.telegram.messenger.yr messagesStorage = wwVar.getMessagesStorage();
                    messagesStorage.f26719a.c(new org.telegram.messenger.tp(messagesStorage, 1, 3));
                    return;
                } else if (i7 != 1 || wwVar.f51556e0 == null) {
                    return;
                } else {
                    while (true) {
                        vw[] vwVarArr = wwVar.f51556e0;
                        if (i10 < vwVarArr.length) {
                            vw vwVar = vwVarArr[i10];
                            if (vwVar.f50789s == 0 && vwVar.getVisibility() == 0) {
                                org.telegram.ui.Cells.t2 c42 = ww.c4(wwVar.f51556e0[i10]);
                                sw swVar = wwVar.f51556e0[i10].f50782a;
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
                be0 be0Var = (be0) this.f47098b;
                if (i7 == 0) {
                    org.telegram.messenger.r2.f25212a = !org.telegram.messenger.r2.f25212a;
                    org.telegram.messenger.t0.f25566b.getSharedPreferences("systemConfig", 0).edit().putBoolean("logsEnabled", org.telegram.messenger.r2.f25212a).commit();
                    org.telegram.ui.Components.hc a02 = org.telegram.ui.Components.hc.a0(be0Var.f44304g0);
                    if (org.telegram.messenger.r2.f25212a) {
                        str = "Logs enabled.";
                    } else {
                        str = "Logs disabled.";
                    }
                    a02.Q(2131623981, 36, str).j();
                    if (org.telegram.messenger.r2.f25212a) {
                        jg.g.u(org.telegram.messenger.t0.f25572s, new StringBuilder("app start time = "));
                        try {
                            org.telegram.messenger.a8.b("buildVersion = " + org.telegram.messenger.t0.f25566b.getPackageManager().getPackageInfo(org.telegram.messenger.t0.f25566b.getPackageName(), 0).versionCode);
                            return;
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                            return;
                        }
                    }
                    return;
                }
                ProfileActivity.V4(be0Var.f44304g0.getParentActivity(), false);
                return;
            default:
                bk0 bk0Var = (bk0) this.f47098b;
                if (i7 == 0) {
                    bk0Var.f44414x = "male";
                    bk0Var.Y[4].setText(org.telegram.messenger.id.M0(2131747509, null));
                    return;
                } else if (i7 == 1) {
                    bk0Var.f44414x = "female";
                    bk0Var.Y[4].setText(org.telegram.messenger.id.M0(2131747570, null));
                    return;
                } else {
                    bk0Var.getClass();
                    return;
                }
        }
    }
}
