package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
public final class p40 implements View.OnKeyListener {
    public final int f48613a;
    public boolean f48614b;
    public final org.telegram.ui.ActionBar.f2 f48615c;

    public p40(int i7, org.telegram.ui.ActionBar.f2 f2Var) {
        this.f48613a = i7;
        this.f48615c = f2Var;
    }

    @Override
    public final boolean onKey(View view, int i7, KeyEvent keyEvent) {
        int i10 = this.f48613a;
        org.telegram.ui.ActionBar.f2 f2Var = this.f48615c;
        boolean z9 = true;
        switch (i10) {
            case 0:
                w40 w40Var = (w40) f2Var;
                if (i7 == 67) {
                    if (keyEvent.getAction() == 0) {
                        if (w40Var.f50876f.f37824r.length() != 0) {
                            z9 = false;
                        }
                        this.f48614b = z9;
                    } else if (keyEvent.getAction() == 1 && this.f48614b && !w40Var.f50868a0.isEmpty()) {
                        w40Var.h.c((org.telegram.ui.Components.c20) jg.g.i(1, w40Var.f50868a0));
                        w40Var.x0();
                        w40Var.p0();
                        return true;
                    }
                }
                return false;
            default:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) f2Var;
                ArrayList arrayList = usersSelectActivity.P;
                if (i7 == 67) {
                    if (keyEvent.getAction() == 0) {
                        if (usersSelectActivity.f42076c.length() != 0) {
                            z9 = false;
                        }
                        this.f48614b = z9;
                    } else if (keyEvent.getAction() == 1 && this.f48614b && !arrayList.isEmpty()) {
                        org.telegram.ui.Components.c20 c20Var = (org.telegram.ui.Components.c20) jg.g.i(1, arrayList);
                        usersSelectActivity.f42075b.b(c20Var);
                        if (usersSelectActivity.f42084y == 2) {
                            if (c20Var.getUid() == -9223372036854775800L) {
                                usersSelectActivity.K &= -2;
                            } else if (c20Var.getUid() == -9223372036854775799L) {
                                usersSelectActivity.K &= -3;
                            } else if (c20Var.getUid() == Long.MIN_VALUE) {
                                usersSelectActivity.K &= -5;
                            } else if (c20Var.getUid() == -9223372036854775807L) {
                                usersSelectActivity.K &= -9;
                            }
                        } else if (c20Var.getUid() == Long.MIN_VALUE) {
                            int i11 = org.telegram.messenger.qp.C8;
                            usersSelectActivity.K &= -2;
                        } else if (c20Var.getUid() == -9223372036854775807L) {
                            int i12 = org.telegram.messenger.qp.C8;
                            usersSelectActivity.K &= -3;
                        } else if (c20Var.getUid() == -9223372036854775806L) {
                            int i13 = org.telegram.messenger.qp.C8;
                            usersSelectActivity.K &= -5;
                        } else if (c20Var.getUid() == -9223372036854775805L) {
                            int i14 = org.telegram.messenger.qp.C8;
                            usersSelectActivity.K &= -9;
                        } else if (c20Var.getUid() == -9223372036854775804L) {
                            int i15 = org.telegram.messenger.qp.C8;
                            usersSelectActivity.K &= -17;
                        } else if (c20Var.getUid() == -9223372036854775803L) {
                            int i16 = org.telegram.messenger.qp.C8;
                            usersSelectActivity.K &= -33;
                        } else if (c20Var.getUid() == -9223372036854775802L) {
                            int i17 = org.telegram.messenger.qp.C8;
                            usersSelectActivity.K &= -65;
                        } else if (c20Var.getUid() == -9223372036854775801L) {
                            int i18 = org.telegram.messenger.qp.C8;
                            usersSelectActivity.K &= -129;
                        }
                        usersSelectActivity.d0();
                        usersSelectActivity.b0();
                        return true;
                    }
                }
                return false;
        }
    }
}
