package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
public final class e60 implements View.OnKeyListener {
    public final int f36549a;
    public boolean f36550b;
    public final org.telegram.ui.ActionBar.n2 f36551c;

    public e60(int i10, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f36549a = i10;
        this.f36551c = n2Var;
    }

    @Override
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        switch (this.f36549a) {
            case 0:
                l60 l60Var = (l60) this.f36551c;
                if (i10 != 67) {
                    return false;
                }
                boolean z10 = true;
                if (keyEvent.getAction() == 0) {
                    if (l60Var.f38802f.f27686r.length() != 0) {
                        z10 = false;
                    }
                    this.f36550b = z10;
                    return false;
                } else if (keyEvent.getAction() != 1 || !this.f36550b || l60Var.f38795a0.isEmpty()) {
                    return false;
                } else {
                    l60Var.h.c((org.telegram.ui.Components.v30) i2.e.h(1, l60Var.f38795a0));
                    l60Var.s0();
                    l60Var.k0();
                    return true;
                }
            default:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.f36551c;
                ArrayList arrayList = usersSelectActivity.O;
                if (i10 != 67) {
                    return false;
                }
                boolean z11 = true;
                if (keyEvent.getAction() == 0) {
                    if (usersSelectActivity.f33951c.length() != 0) {
                        z11 = false;
                    }
                    this.f36550b = z11;
                    return false;
                } else if (keyEvent.getAction() != 1 || !this.f36550b || arrayList.isEmpty()) {
                    return false;
                } else {
                    org.telegram.ui.Components.v30 v30Var = (org.telegram.ui.Components.v30) i2.e.h(1, arrayList);
                    usersSelectActivity.f33950b.b(v30Var);
                    if (usersSelectActivity.f33957x == 2) {
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
