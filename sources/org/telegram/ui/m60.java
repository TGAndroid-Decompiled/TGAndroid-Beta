package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
public final class m60 implements View.OnKeyListener {
    public final int f41341a;
    public boolean f41342b;
    public final org.telegram.ui.ActionBar.r2 f41343c;

    public m60(int i10, org.telegram.ui.ActionBar.r2 r2Var) {
        this.f41341a = i10;
        this.f41343c = r2Var;
    }

    @Override
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        switch (this.f41341a) {
            case 0:
                t60 t60Var = (t60) this.f41343c;
                if (i10 != 67) {
                    return false;
                }
                boolean z10 = true;
                if (keyEvent.getAction() == 0) {
                    if (t60Var.f43505f.f30347r.length() != 0) {
                        z10 = false;
                    }
                    this.f41342b = z10;
                    return false;
                } else if (keyEvent.getAction() != 1 || !this.f41342b || t60Var.f43498a0.isEmpty()) {
                    return false;
                } else {
                    t60Var.h.c((org.telegram.ui.Components.x30) ic.a.g(1, t60Var.f43498a0));
                    t60Var.t0();
                    t60Var.l0();
                    return true;
                }
            default:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.f41343c;
                ArrayList arrayList = usersSelectActivity.O;
                if (i10 != 67) {
                    return false;
                }
                boolean z11 = true;
                if (keyEvent.getAction() == 0) {
                    if (usersSelectActivity.f36348c.length() != 0) {
                        z11 = false;
                    }
                    this.f41342b = z11;
                    return false;
                } else if (keyEvent.getAction() != 1 || !this.f41342b || arrayList.isEmpty()) {
                    return false;
                } else {
                    org.telegram.ui.Components.x30 x30Var = (org.telegram.ui.Components.x30) ic.a.g(1, arrayList);
                    usersSelectActivity.f36347b.b(x30Var);
                    if (usersSelectActivity.f36354x == 2) {
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
