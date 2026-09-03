package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLRPC;
public final class qc0 implements org.telegram.ui.Components.jt0 {
    public final bd0 f40431a;

    public qc0(bd0 bd0Var) {
        this.f40431a = bd0Var;
    }

    @Override
    public final void R() {
        int c02;
        boolean z4;
        bd0 bd0Var = this.f40431a;
        rc0 rc0Var = bd0Var.H0;
        if (rc0Var == null) {
            c02 = 0;
        } else {
            c02 = rc0Var.c0(8);
        }
        bd0Var.I0.setText(LocaleController.formatPluralString("LocationStories", c02, new Object[0]));
        pc0 pc0Var = bd0Var.Q;
        if (c02 > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (pc0Var.f48622f0 != z4) {
            pc0Var.f48622f0 = z4;
            pc0Var.l();
            bd0Var.R.v0(0, AndroidUtilities.dp(200.0f), null);
        }
    }

    @Override
    public final boolean T() {
        return false;
    }

    @Override
    public final org.telegram.ui.Components.sl0 f() {
        return this.f40431a.R;
    }

    @Override
    public final TLRPC.Chat g() {
        return null;
    }

    @Override
    public final boolean h(TLRPC.ChatParticipant chatParticipant, boolean z4, boolean z10, View view) {
        return false;
    }

    @Override
    public final boolean q() {
        return true;
    }

    @Override
    public final void E() {
    }
}
