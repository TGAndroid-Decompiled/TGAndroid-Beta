package org.telegram.ui;

import android.content.DialogInterface;
public final class k4 implements DialogInterface.OnClickListener {
    public final int f47099a;
    public final Object f47100b;

    public k4(Object obj, int i7) {
        this.f47099a = i7;
        this.f47100b = obj;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i7) {
        vi.f fVar;
        String str;
        int i10 = 0;
        switch (this.f47099a) {
            case 0:
                xy0 xy0Var = (xy0) this.f47100b;
                xy0Var.getClass();
                xi.b bVar = xi.e.f58769c;
                if (i7 == 0) {
                    fVar = vi.f.f57441a;
                } else {
                    fVar = vi.f.f57442b;
                }
                bVar.b(fVar);
                ((l4) xy0Var.f52017c).g(2);
                return;
            case 1:
                ww wwVar = (ww) this.f47100b;
                if (i7 == 0) {
                    org.telegram.messenger.yr messagesStorage = wwVar.getMessagesStorage();
                    messagesStorage.f26696a.c(new org.telegram.messenger.tp(messagesStorage, 1, 3));
                    return;
                } else if (i7 != 1 || wwVar.f51549e0 == null) {
                    return;
                } else {
                    while (true) {
                        vw[] vwVarArr = wwVar.f51549e0;
                        if (i10 < vwVarArr.length) {
                            vw vwVar = vwVarArr[i10];
                            if (vwVar.f50845s == 0 && vwVar.getVisibility() == 0) {
                                org.telegram.ui.Cells.t2 c42 = ww.c4(wwVar.f51549e0[i10]);
                                sw swVar = wwVar.f51549e0[i10].f50838a;
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
                be0 be0Var = (be0) this.f47100b;
                if (i7 == 0) {
                    org.telegram.messenger.r2.f25199a = !org.telegram.messenger.r2.f25199a;
                    org.telegram.messenger.t0.f25563b.getSharedPreferences("systemConfig", 0).edit().putBoolean("logsEnabled", org.telegram.messenger.r2.f25199a).commit();
                    org.telegram.ui.Components.hc a02 = org.telegram.ui.Components.hc.a0(be0Var.f44301g0);
                    if (org.telegram.messenger.r2.f25199a) {
                        str = "Logs enabled.";
                    } else {
                        str = "Logs disabled.";
                    }
                    a02.Q(2131623981, 36, str).j();
                    if (org.telegram.messenger.r2.f25199a) {
                        jg.g.u(org.telegram.messenger.t0.f25569s, new StringBuilder("app start time = "));
                        try {
                            org.telegram.messenger.a8.b("buildVersion = " + org.telegram.messenger.t0.f25563b.getPackageManager().getPackageInfo(org.telegram.messenger.t0.f25563b.getPackageName(), 0).versionCode);
                            return;
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                            return;
                        }
                    }
                    return;
                }
                ProfileActivity.V4(be0Var.f44301g0.getParentActivity(), false);
                return;
            default:
                bk0 bk0Var = (bk0) this.f47100b;
                if (i7 == 0) {
                    bk0Var.f44411x = "male";
                    bk0Var.Y[4].setText(org.telegram.messenger.hd.M0(2131747507, null));
                    return;
                } else if (i7 == 1) {
                    bk0Var.f44411x = "female";
                    bk0Var.Y[4].setText(org.telegram.messenger.hd.M0(2131747568, null));
                    return;
                } else {
                    bk0Var.getClass();
                    return;
                }
        }
    }
}
