package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
public final class d60 implements View.OnKeyListener {
    public final int f37422a;
    public boolean f37423b;
    public final org.telegram.ui.ActionBar.o2 f37424c;

    public d60(int i9, org.telegram.ui.ActionBar.o2 o2Var) {
        this.f37422a = i9;
        this.f37424c = o2Var;
    }

    @Override
    public final boolean onKey(View view, int i9, KeyEvent keyEvent) {
        switch (this.f37422a) {
            case 0:
                k60 k60Var = (k60) this.f37424c;
                if (i9 != 67) {
                    return false;
                }
                boolean z10 = true;
                if (keyEvent.getAction() == 0) {
                    if (k60Var.f39734f.f30664r.length() != 0) {
                        z10 = false;
                    }
                    this.f37423b = z10;
                    return false;
                } else if (keyEvent.getAction() != 1 || !this.f37423b || k60Var.W.isEmpty()) {
                    return false;
                } else {
                    k60Var.h.c((org.telegram.ui.Components.w20) j3.r0.j(1, k60Var.W));
                    k60Var.r0();
                    k60Var.j0();
                    return true;
                }
            default:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.f37424c;
                ArrayList arrayList = usersSelectActivity.K;
                if (i9 != 67) {
                    return false;
                }
                boolean z11 = true;
                if (keyEvent.getAction() == 0) {
                    if (usersSelectActivity.f36287c.length() != 0) {
                        z11 = false;
                    }
                    this.f37423b = z11;
                    return false;
                } else if (keyEvent.getAction() != 1 || !this.f37423b || arrayList.isEmpty()) {
                    return false;
                } else {
                    org.telegram.ui.Components.w20 w20Var = (org.telegram.ui.Components.w20) j3.r0.j(1, arrayList);
                    usersSelectActivity.f36286b.b(w20Var);
                    if (usersSelectActivity.f36294x == 2) {
                        if (w20Var.getUid() == -9223372036854775800L) {
                            usersSelectActivity.F &= -2;
                        } else if (w20Var.getUid() == -9223372036854775799L) {
                            usersSelectActivity.F &= -3;
                        } else if (w20Var.getUid() == Long.MIN_VALUE) {
                            usersSelectActivity.F &= -5;
                        } else if (w20Var.getUid() == -9223372036854775807L) {
                            usersSelectActivity.F &= -9;
                        }
                    } else if (w20Var.getUid() == Long.MIN_VALUE) {
                        usersSelectActivity.F = (~MessagesController.DIALOG_FILTER_FLAG_CONTACTS) & usersSelectActivity.F;
                    } else if (w20Var.getUid() == -9223372036854775807L) {
                        usersSelectActivity.F = (~MessagesController.DIALOG_FILTER_FLAG_NON_CONTACTS) & usersSelectActivity.F;
                    } else if (w20Var.getUid() == -9223372036854775806L) {
                        usersSelectActivity.F = (~MessagesController.DIALOG_FILTER_FLAG_GROUPS) & usersSelectActivity.F;
                    } else if (w20Var.getUid() == -9223372036854775805L) {
                        usersSelectActivity.F = (~MessagesController.DIALOG_FILTER_FLAG_CHANNELS) & usersSelectActivity.F;
                    } else if (w20Var.getUid() == -9223372036854775804L) {
                        usersSelectActivity.F = (~MessagesController.DIALOG_FILTER_FLAG_BOTS) & usersSelectActivity.F;
                    } else if (w20Var.getUid() == -9223372036854775803L) {
                        usersSelectActivity.F = (~MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_MUTED) & usersSelectActivity.F;
                    } else if (w20Var.getUid() == -9223372036854775802L) {
                        usersSelectActivity.F = (~MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ) & usersSelectActivity.F;
                    } else if (w20Var.getUid() == -9223372036854775801L) {
                        usersSelectActivity.F = (~MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_ARCHIVED) & usersSelectActivity.F;
                    }
                    usersSelectActivity.X();
                    usersSelectActivity.V();
                    return true;
                }
        }
    }
}
