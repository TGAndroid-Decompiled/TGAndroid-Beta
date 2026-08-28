package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLRPC;
public final class ec0 implements org.telegram.ui.Components.qs0 {
    public final pc0 f37898a;

    public ec0(pc0 pc0Var) {
        this.f37898a = pc0Var;
    }

    @Override
    public final void Q() {
        int c02;
        boolean z10;
        pc0 pc0Var = this.f37898a;
        fc0 fc0Var = pc0Var.G0;
        if (fc0Var == null) {
            c02 = 0;
        } else {
            c02 = fc0Var.c0(8);
        }
        pc0Var.H0.setText(LocaleController.formatPluralString("LocationStories", c02, new Object[0]));
        dc0 dc0Var = pc0Var.P;
        if (c02 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (dc0Var.f19454e0 != z10) {
            dc0Var.f19454e0 = z10;
            dc0Var.l();
            pc0Var.Q.v0(0, AndroidUtilities.dp(200.0f), null);
        }
    }

    @Override
    public final boolean S() {
        return false;
    }

    @Override
    public final org.telegram.ui.Components.wk0 f() {
        return this.f37898a.Q;
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
    public final boolean q() {
        return true;
    }

    @Override
    public final void E() {
    }
}
