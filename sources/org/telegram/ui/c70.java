package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
public final class c70 implements View.OnKeyListener {
    public final int f34471a;
    public boolean f34472b;
    public final org.telegram.ui.ActionBar.m2 f34473c;

    public c70(int i10, org.telegram.ui.ActionBar.m2 m2Var) {
        this.f34471a = i10;
        this.f34473c = m2Var;
    }

    @Override
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        switch (this.f34471a) {
            case 0:
                j70 j70Var = (j70) this.f34473c;
                if (i10 != 67) {
                    return false;
                }
                boolean z10 = true;
                if (keyEvent.getAction() == 0) {
                    if (j70Var.f36947f.f27510r.length() != 0) {
                        z10 = false;
                    }
                    this.f34472b = z10;
                    return false;
                } else if (keyEvent.getAction() != 1 || !this.f34472b || j70Var.f36940a0.isEmpty()) {
                    return false;
                } else {
                    j70Var.h.c((org.telegram.ui.Components.z30) i2.d.h(1, j70Var.f36940a0));
                    j70Var.s0();
                    j70Var.k0();
                    return true;
                }
            default:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.f34473c;
                ArrayList arrayList = usersSelectActivity.O;
                if (i10 != 67) {
                    return false;
                }
                boolean z11 = true;
                if (keyEvent.getAction() == 0) {
                    if (usersSelectActivity.f32603c.length() != 0) {
                        z11 = false;
                    }
                    this.f34472b = z11;
                    return false;
                } else if (keyEvent.getAction() != 1 || !this.f34472b || arrayList.isEmpty()) {
                    return false;
                } else {
                    org.telegram.ui.Components.z30 z30Var = (org.telegram.ui.Components.z30) i2.d.h(1, arrayList);
                    usersSelectActivity.f32602b.b(z30Var);
                    if (usersSelectActivity.f32609x == 2) {
                        if (z30Var.getUid() == -9223372036854775800L) {
                            usersSelectActivity.J &= -2;
                        } else if (z30Var.getUid() == -9223372036854775799L) {
                            usersSelectActivity.J &= -3;
                        } else if (z30Var.getUid() == Long.MIN_VALUE) {
                            usersSelectActivity.J &= -5;
                        } else if (z30Var.getUid() == -9223372036854775807L) {
                            usersSelectActivity.J &= -9;
                        }
                    } else if (z30Var.getUid() == Long.MIN_VALUE) {
                        usersSelectActivity.J = (~MessagesController.DIALOG_FILTER_FLAG_CONTACTS) & usersSelectActivity.J;
                    } else if (z30Var.getUid() == -9223372036854775807L) {
                        usersSelectActivity.J = (~MessagesController.DIALOG_FILTER_FLAG_NON_CONTACTS) & usersSelectActivity.J;
                    } else if (z30Var.getUid() == -9223372036854775806L) {
                        usersSelectActivity.J = (~MessagesController.DIALOG_FILTER_FLAG_GROUPS) & usersSelectActivity.J;
                    } else if (z30Var.getUid() == -9223372036854775805L) {
                        usersSelectActivity.J = (~MessagesController.DIALOG_FILTER_FLAG_CHANNELS) & usersSelectActivity.J;
                    } else if (z30Var.getUid() == -9223372036854775804L) {
                        usersSelectActivity.J = (~MessagesController.DIALOG_FILTER_FLAG_BOTS) & usersSelectActivity.J;
                    } else if (z30Var.getUid() == -9223372036854775803L) {
                        usersSelectActivity.J = (~MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_MUTED) & usersSelectActivity.J;
                    } else if (z30Var.getUid() == -9223372036854775802L) {
                        usersSelectActivity.J = (~MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ) & usersSelectActivity.J;
                    } else if (z30Var.getUid() == -9223372036854775801L) {
                        usersSelectActivity.J = (~MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_ARCHIVED) & usersSelectActivity.J;
                    }
                    usersSelectActivity.Y();
                    usersSelectActivity.W();
                    return true;
                }
        }
    }
}
