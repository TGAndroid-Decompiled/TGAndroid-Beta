package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
public final class g60 implements View.OnKeyListener {
    public final int f37139a;
    public boolean f37140b;
    public final org.telegram.ui.ActionBar.n2 f37141c;

    public g60(int i10, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f37139a = i10;
        this.f37141c = n2Var;
    }

    @Override
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        switch (this.f37139a) {
            case 0:
                n60 n60Var = (n60) this.f37141c;
                if (i10 != 67) {
                    return false;
                }
                boolean z10 = true;
                if (keyEvent.getAction() == 0) {
                    if (n60Var.f39336f.f27712r.length() != 0) {
                        z10 = false;
                    }
                    this.f37140b = z10;
                    return false;
                } else if (keyEvent.getAction() != 1 || !this.f37140b || n60Var.f39329a0.isEmpty()) {
                    return false;
                } else {
                    n60Var.h.c((org.telegram.ui.Components.v30) i0.a.h(1, n60Var.f39329a0));
                    n60Var.s0();
                    n60Var.k0();
                    return true;
                }
            default:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.f37141c;
                ArrayList arrayList = usersSelectActivity.O;
                if (i10 != 67) {
                    return false;
                }
                boolean z11 = true;
                if (keyEvent.getAction() == 0) {
                    if (usersSelectActivity.f33943c.length() != 0) {
                        z11 = false;
                    }
                    this.f37140b = z11;
                    return false;
                } else if (keyEvent.getAction() != 1 || !this.f37140b || arrayList.isEmpty()) {
                    return false;
                } else {
                    org.telegram.ui.Components.v30 v30Var = (org.telegram.ui.Components.v30) i0.a.h(1, arrayList);
                    usersSelectActivity.f33942b.b(v30Var);
                    if (usersSelectActivity.f33949x == 2) {
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
