package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;

public final class h60 implements View.OnKeyListener {

    public final int f38688a;

    public boolean f38689b;

    public final org.telegram.ui.ActionBar.n2 f38690c;

    public h60(int i10, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f38688a = i10;
        this.f38690c = n2Var;
    }

    @Override
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        switch (this.f38688a) {
            case 0:
                o60 o60Var = (o60) this.f38690c;
                if (i10 != 67) {
                    return false;
                }
                if (keyEvent.getAction() == 0) {
                    this.f38689b = o60Var.f41002f.f31468r.length() == 0;
                    return false;
                }
                if (keyEvent.getAction() != 1 || !this.f38689b || o60Var.W.isEmpty()) {
                    return false;
                }
                o60Var.h.c((org.telegram.ui.Components.a30) i0.a.i(1, o60Var.W));
                o60Var.s0();
                o60Var.k0();
                return true;
            default:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.f38690c;
                ArrayList arrayList = usersSelectActivity.K;
                if (i10 != 67) {
                    return false;
                }
                if (keyEvent.getAction() == 0) {
                    this.f38689b = usersSelectActivity.f36290c.length() == 0;
                    return false;
                }
                if (keyEvent.getAction() != 1 || !this.f38689b || arrayList.isEmpty()) {
                    return false;
                }
                org.telegram.ui.Components.a30 a30Var = (org.telegram.ui.Components.a30) i0.a.i(1, arrayList);
                usersSelectActivity.f36289b.b(a30Var);
                if (usersSelectActivity.f36297x == 2) {
                    if (a30Var.getUid() == -9223372036854775800L) {
                        usersSelectActivity.F &= -2;
                    } else if (a30Var.getUid() == -9223372036854775799L) {
                        usersSelectActivity.F &= -3;
                    } else if (a30Var.getUid() == Long.MIN_VALUE) {
                        usersSelectActivity.F &= -5;
                    } else if (a30Var.getUid() == -9223372036854775807L) {
                        usersSelectActivity.F &= -9;
                    }
                } else if (a30Var.getUid() == Long.MIN_VALUE) {
                    usersSelectActivity.F = (~MessagesController.DIALOG_FILTER_FLAG_CONTACTS) & usersSelectActivity.F;
                } else if (a30Var.getUid() == -9223372036854775807L) {
                    usersSelectActivity.F = (~MessagesController.DIALOG_FILTER_FLAG_NON_CONTACTS) & usersSelectActivity.F;
                } else if (a30Var.getUid() == -9223372036854775806L) {
                    usersSelectActivity.F = (~MessagesController.DIALOG_FILTER_FLAG_GROUPS) & usersSelectActivity.F;
                } else if (a30Var.getUid() == -9223372036854775805L) {
                    usersSelectActivity.F = (~MessagesController.DIALOG_FILTER_FLAG_CHANNELS) & usersSelectActivity.F;
                } else if (a30Var.getUid() == -9223372036854775804L) {
                    usersSelectActivity.F = (~MessagesController.DIALOG_FILTER_FLAG_BOTS) & usersSelectActivity.F;
                } else if (a30Var.getUid() == -9223372036854775803L) {
                    usersSelectActivity.F = (~MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_MUTED) & usersSelectActivity.F;
                } else if (a30Var.getUid() == -9223372036854775802L) {
                    usersSelectActivity.F = (~MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ) & usersSelectActivity.F;
                } else if (a30Var.getUid() == -9223372036854775801L) {
                    usersSelectActivity.F = (~MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_ARCHIVED) & usersSelectActivity.F;
                }
                usersSelectActivity.Y();
                usersSelectActivity.W();
                return true;
        }
    }
}
