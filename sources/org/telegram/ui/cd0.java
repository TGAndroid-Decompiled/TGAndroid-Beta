package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLRPC;
public final class cd0 implements org.telegram.ui.Components.ju0 {
    public final nd0 f34837a;

    public cd0(nd0 nd0Var) {
        this.f34837a = nd0Var;
    }

    @Override
    public final void R() {
        int c02;
        boolean z10;
        nd0 nd0Var = this.f34837a;
        dd0 dd0Var = nd0Var.K0;
        if (dd0Var == null) {
            c02 = 0;
        } else {
            c02 = dd0Var.c0(8);
        }
        nd0Var.L0.setText(LocaleController.formatPluralString("LocationStories", c02, new Object[0]));
        bd0 bd0Var = nd0Var.T;
        if (c02 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (bd0Var.f10738i0 != z10) {
            bd0Var.f10738i0 = z10;
            bd0Var.l();
            nd0Var.U.v0(0, AndroidUtilities.dp(200.0f), null);
        }
    }

    @Override
    public final boolean T() {
        return false;
    }

    @Override
    public final org.telegram.ui.Components.mm0 f() {
        return this.f34837a.U;
    }

    @Override
    public final TLRPC.Chat g() {
        return null;
    }

    @Override
    public final boolean h(TLRPC.ChatParticipant chatParticipant, boolean z10, boolean z11, View view) {
        return false;
    }

    @Override
    public final boolean r() {
        return true;
    }

    @Override
    public final void F() {
    }
}
