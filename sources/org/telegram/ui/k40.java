package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
public final class k40 implements View.OnKeyListener {
    public final int f46763a;
    public boolean f46764b;
    public final org.telegram.ui.ActionBar.d2 f46765c;

    public k40(int i3, org.telegram.ui.ActionBar.d2 d2Var) {
        this.f46763a = i3;
        this.f46765c = d2Var;
    }

    @Override
    public final boolean onKey(View view, int i3, KeyEvent keyEvent) {
        int i10 = this.f46763a;
        org.telegram.ui.ActionBar.d2 d2Var = this.f46765c;
        boolean z10 = true;
        switch (i10) {
            case 0:
                r40 r40Var = (r40) d2Var;
                if (i3 == 67) {
                    if (keyEvent.getAction() == 0) {
                        if (r40Var.f49040f.f36302r.length() != 0) {
                            z10 = false;
                        }
                        this.f46764b = z10;
                    } else if (keyEvent.getAction() == 1 && this.f46764b && !r40Var.f49034b0.isEmpty()) {
                        r40Var.h.c((org.telegram.ui.Components.y10) k2.p1.h(1, r40Var.f49034b0));
                        r40Var.x0();
                        r40Var.p0();
                        return true;
                    }
                }
                return false;
            default:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) d2Var;
                ArrayList arrayList = usersSelectActivity.Q;
                if (i3 == 67) {
                    if (keyEvent.getAction() == 0) {
                        if (usersSelectActivity.f42107c.length() != 0) {
                            z10 = false;
                        }
                        this.f46764b = z10;
                    } else if (keyEvent.getAction() == 1 && this.f46764b && !arrayList.isEmpty()) {
                        org.telegram.ui.Components.y10 y10Var = (org.telegram.ui.Components.y10) k2.p1.h(1, arrayList);
                        usersSelectActivity.f42106b.b(y10Var);
                        if (usersSelectActivity.f42115y == 2) {
                            if (y10Var.getUid() == -9223372036854775800L) {
                                usersSelectActivity.L &= -2;
                            } else if (y10Var.getUid() == -9223372036854775799L) {
                                usersSelectActivity.L &= -3;
                            } else if (y10Var.getUid() == Long.MIN_VALUE) {
                                usersSelectActivity.L &= -5;
                            } else if (y10Var.getUid() == -9223372036854775807L) {
                                usersSelectActivity.L &= -9;
                            }
                        } else if (y10Var.getUid() == Long.MIN_VALUE) {
                            int i11 = org.telegram.messenger.hp.C8;
                            usersSelectActivity.L &= -2;
                        } else if (y10Var.getUid() == -9223372036854775807L) {
                            int i12 = org.telegram.messenger.hp.C8;
                            usersSelectActivity.L &= -3;
                        } else if (y10Var.getUid() == -9223372036854775806L) {
                            int i13 = org.telegram.messenger.hp.C8;
                            usersSelectActivity.L &= -5;
                        } else if (y10Var.getUid() == -9223372036854775805L) {
                            int i14 = org.telegram.messenger.hp.C8;
                            usersSelectActivity.L &= -9;
                        } else if (y10Var.getUid() == -9223372036854775804L) {
                            int i15 = org.telegram.messenger.hp.C8;
                            usersSelectActivity.L &= -17;
                        } else if (y10Var.getUid() == -9223372036854775803L) {
                            int i16 = org.telegram.messenger.hp.C8;
                            usersSelectActivity.L &= -33;
                        } else if (y10Var.getUid() == -9223372036854775802L) {
                            int i17 = org.telegram.messenger.hp.C8;
                            usersSelectActivity.L &= -65;
                        } else if (y10Var.getUid() == -9223372036854775801L) {
                            int i18 = org.telegram.messenger.hp.C8;
                            usersSelectActivity.L &= -129;
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
