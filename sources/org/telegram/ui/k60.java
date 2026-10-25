package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
public final class k60 implements View.OnKeyListener {
    public final int f40803a;
    public boolean f40804b;
    public final org.telegram.ui.ActionBar.r2 f40805c;

    public k60(int i10, org.telegram.ui.ActionBar.r2 r2Var) {
        this.f40803a = i10;
        this.f40805c = r2Var;
    }

    @Override
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        switch (this.f40803a) {
            case 0:
                r60 r60Var = (r60) this.f40805c;
                if (i10 != 67) {
                    return false;
                }
                boolean z10 = true;
                if (keyEvent.getAction() == 0) {
                    if (r60Var.f43017f.f30365r.length() != 0) {
                        z10 = false;
                    }
                    this.f40804b = z10;
                    return false;
                } else if (keyEvent.getAction() != 1 || !this.f40804b || r60Var.f43010a0.isEmpty()) {
                    return false;
                } else {
                    r60Var.h.c((org.telegram.ui.Components.x30) ic.a.g(1, r60Var.f43010a0));
                    r60Var.t0();
                    r60Var.l0();
                    return true;
                }
            default:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.f40805c;
                ArrayList arrayList = usersSelectActivity.O;
                if (i10 != 67) {
                    return false;
                }
                boolean z11 = true;
                if (keyEvent.getAction() == 0) {
                    if (usersSelectActivity.f36321c.length() != 0) {
                        z11 = false;
                    }
                    this.f40804b = z11;
                    return false;
                } else if (keyEvent.getAction() != 1 || !this.f40804b || arrayList.isEmpty()) {
                    return false;
                } else {
                    org.telegram.ui.Components.x30 x30Var = (org.telegram.ui.Components.x30) ic.a.g(1, arrayList);
                    usersSelectActivity.f36320b.b(x30Var);
                    if (usersSelectActivity.f36327x == 2) {
                        if (x30Var.getUid() == -9223372036854775800L) {
                            usersSelectActivity.J &= -2;
                        } else if (x30Var.getUid() == -9223372036854775799L) {
                            usersSelectActivity.J &= -3;
                        } else if (x30Var.getUid() == Long.MIN_VALUE) {
                            usersSelectActivity.J &= -5;
                        } else if (x30Var.getUid() == -9223372036854775807L) {
                            usersSelectActivity.J &= -9;
                        }
                    } else if (x30Var.getUid() == Long.MIN_VALUE) {
                        usersSelectActivity.J = (~MessagesController.DIALOG_FILTER_FLAG_CONTACTS) & usersSelectActivity.J;
                    } else if (x30Var.getUid() == -9223372036854775807L) {
                        usersSelectActivity.J = (~MessagesController.DIALOG_FILTER_FLAG_NON_CONTACTS) & usersSelectActivity.J;
                    } else if (x30Var.getUid() == -9223372036854775806L) {
                        usersSelectActivity.J = (~MessagesController.DIALOG_FILTER_FLAG_GROUPS) & usersSelectActivity.J;
                    } else if (x30Var.getUid() == -9223372036854775805L) {
                        usersSelectActivity.J = (~MessagesController.DIALOG_FILTER_FLAG_CHANNELS) & usersSelectActivity.J;
                    } else if (x30Var.getUid() == -9223372036854775804L) {
                        usersSelectActivity.J = (~MessagesController.DIALOG_FILTER_FLAG_BOTS) & usersSelectActivity.J;
                    } else if (x30Var.getUid() == -9223372036854775803L) {
                        usersSelectActivity.J = (~MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_MUTED) & usersSelectActivity.J;
                    } else if (x30Var.getUid() == -9223372036854775802L) {
                        usersSelectActivity.J = (~MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ) & usersSelectActivity.J;
                    } else if (x30Var.getUid() == -9223372036854775801L) {
                        usersSelectActivity.J = (~MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_ARCHIVED) & usersSelectActivity.J;
                    }
                    usersSelectActivity.Z();
                    usersSelectActivity.X();
                    return true;
                }
        }
    }
}
