package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
public final class f60 implements View.OnKeyListener {
    public final int f38005a;
    public boolean f38006b;
    public final org.telegram.ui.ActionBar.o2 f38007c;

    public f60(int i10, org.telegram.ui.ActionBar.o2 o2Var) {
        this.f38005a = i10;
        this.f38007c = o2Var;
    }

    @Override
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        switch (this.f38005a) {
            case 0:
                m60 m60Var = (m60) this.f38007c;
                if (i10 != 67) {
                    return false;
                }
                boolean z10 = true;
                if (keyEvent.getAction() == 0) {
                    if (m60Var.f40450f.f34546r.length() != 0) {
                        z10 = false;
                    }
                    this.f38006b = z10;
                    return false;
                } else if (keyEvent.getAction() != 1 || !this.f38006b || m60Var.W.isEmpty()) {
                    return false;
                } else {
                    m60Var.h.c((org.telegram.ui.Components.j30) j7.l1.i(1, m60Var.W));
                    m60Var.s0();
                    m60Var.k0();
                    return true;
                }
            default:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.f38007c;
                ArrayList arrayList = usersSelectActivity.K;
                if (i10 != 67) {
                    return false;
                }
                boolean z11 = true;
                if (keyEvent.getAction() == 0) {
                    if (usersSelectActivity.f36352c.length() != 0) {
                        z11 = false;
                    }
                    this.f38006b = z11;
                    return false;
                } else if (keyEvent.getAction() != 1 || !this.f38006b || arrayList.isEmpty()) {
                    return false;
                } else {
                    org.telegram.ui.Components.j30 j30Var = (org.telegram.ui.Components.j30) j7.l1.i(1, arrayList);
                    usersSelectActivity.f36351b.b(j30Var);
                    if (usersSelectActivity.f36359x == 2) {
                        if (j30Var.getUid() == -9223372036854775800L) {
                            usersSelectActivity.F &= -2;
                        } else if (j30Var.getUid() == -9223372036854775799L) {
                            usersSelectActivity.F &= -3;
                        } else if (j30Var.getUid() == Long.MIN_VALUE) {
                            usersSelectActivity.F &= -5;
                        } else if (j30Var.getUid() == -9223372036854775807L) {
                            usersSelectActivity.F &= -9;
                        }
                    } else if (j30Var.getUid() == Long.MIN_VALUE) {
                        usersSelectActivity.F = (~MessagesController.DIALOG_FILTER_FLAG_CONTACTS) & usersSelectActivity.F;
                    } else if (j30Var.getUid() == -9223372036854775807L) {
                        usersSelectActivity.F = (~MessagesController.DIALOG_FILTER_FLAG_NON_CONTACTS) & usersSelectActivity.F;
                    } else if (j30Var.getUid() == -9223372036854775806L) {
                        usersSelectActivity.F = (~MessagesController.DIALOG_FILTER_FLAG_GROUPS) & usersSelectActivity.F;
                    } else if (j30Var.getUid() == -9223372036854775805L) {
                        usersSelectActivity.F = (~MessagesController.DIALOG_FILTER_FLAG_CHANNELS) & usersSelectActivity.F;
                    } else if (j30Var.getUid() == -9223372036854775804L) {
                        usersSelectActivity.F = (~MessagesController.DIALOG_FILTER_FLAG_BOTS) & usersSelectActivity.F;
                    } else if (j30Var.getUid() == -9223372036854775803L) {
                        usersSelectActivity.F = (~MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_MUTED) & usersSelectActivity.F;
                    } else if (j30Var.getUid() == -9223372036854775802L) {
                        usersSelectActivity.F = (~MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ) & usersSelectActivity.F;
                    } else if (j30Var.getUid() == -9223372036854775801L) {
                        usersSelectActivity.F = (~MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_ARCHIVED) & usersSelectActivity.F;
                    }
                    usersSelectActivity.Y();
                    usersSelectActivity.W();
                    return true;
                }
        }
    }
}
