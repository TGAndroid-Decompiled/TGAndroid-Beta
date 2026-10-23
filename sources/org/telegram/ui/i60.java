package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
public final class i60 implements View.OnKeyListener {
    public final int f38078a;
    public boolean f38079b;
    public final org.telegram.ui.ActionBar.o2 f38080c;

    public i60(int i10, org.telegram.ui.ActionBar.o2 o2Var) {
        this.f38078a = i10;
        this.f38080c = o2Var;
    }

    @Override
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        switch (this.f38078a) {
            case 0:
                p60 p60Var = (p60) this.f38080c;
                if (i10 != 67) {
                    return false;
                }
                boolean z10 = true;
                if (keyEvent.getAction() == 0) {
                    if (p60Var.f40364f.f27836r.length() != 0) {
                        z10 = false;
                    }
                    this.f38079b = z10;
                    return false;
                } else if (keyEvent.getAction() != 1 || !this.f38079b || p60Var.f40357a0.isEmpty()) {
                    return false;
                } else {
                    p60Var.h.c((org.telegram.ui.Components.v30) i2.o1.i(1, p60Var.f40357a0));
                    p60Var.s0();
                    p60Var.k0();
                    return true;
                }
            default:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.f38080c;
                ArrayList arrayList = usersSelectActivity.O;
                if (i10 != 67) {
                    return false;
                }
                boolean z11 = true;
                if (keyEvent.getAction() == 0) {
                    if (usersSelectActivity.f34259c.length() != 0) {
                        z11 = false;
                    }
                    this.f38079b = z11;
                    return false;
                } else if (keyEvent.getAction() != 1 || !this.f38079b || arrayList.isEmpty()) {
                    return false;
                } else {
                    org.telegram.ui.Components.v30 v30Var = (org.telegram.ui.Components.v30) i2.o1.i(1, arrayList);
                    usersSelectActivity.f34258b.b(v30Var);
                    if (usersSelectActivity.f34265x == 2) {
                        if (v30Var.getUid() == -9223372036854775800L) {
                            usersSelectActivity.J &= -2;
                        } else if (v30Var.getUid() == -9223372036854775799L) {
                            usersSelectActivity.J &= -3;
                        } else if (v30Var.getUid() == Long.MIN_VALUE) {
                            usersSelectActivity.J &= -5;
                        } else if (v30Var.getUid() == -9223372036854775807L) {
                            usersSelectActivity.J &= -9;
                        }
                    } else if (v30Var.getUid() == Long.MIN_VALUE) {
                        usersSelectActivity.J = (~MessagesController.DIALOG_FILTER_FLAG_CONTACTS) & usersSelectActivity.J;
                    } else if (v30Var.getUid() == -9223372036854775807L) {
                        usersSelectActivity.J = (~MessagesController.DIALOG_FILTER_FLAG_NON_CONTACTS) & usersSelectActivity.J;
                    } else if (v30Var.getUid() == -9223372036854775806L) {
                        usersSelectActivity.J = (~MessagesController.DIALOG_FILTER_FLAG_GROUPS) & usersSelectActivity.J;
                    } else if (v30Var.getUid() == -9223372036854775805L) {
                        usersSelectActivity.J = (~MessagesController.DIALOG_FILTER_FLAG_CHANNELS) & usersSelectActivity.J;
                    } else if (v30Var.getUid() == -9223372036854775804L) {
                        usersSelectActivity.J = (~MessagesController.DIALOG_FILTER_FLAG_BOTS) & usersSelectActivity.J;
                    } else if (v30Var.getUid() == -9223372036854775803L) {
                        usersSelectActivity.J = (~MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_MUTED) & usersSelectActivity.J;
                    } else if (v30Var.getUid() == -9223372036854775802L) {
                        usersSelectActivity.J = (~MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ) & usersSelectActivity.J;
                    } else if (v30Var.getUid() == -9223372036854775801L) {
                        usersSelectActivity.J = (~MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_ARCHIVED) & usersSelectActivity.J;
                    }
                    usersSelectActivity.Y();
                    usersSelectActivity.W();
                    return true;
                }
        }
    }
}
