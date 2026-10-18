package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLRPC;
public final class ec0 implements org.telegram.ui.Components.eu0 {
    public final pc0 f36462a;

    public ec0(pc0 pc0Var) {
        this.f36462a = pc0Var;
    }

    @Override
    public final void R() {
        int c02;
        boolean z10;
        pc0 pc0Var = this.f36462a;
        fc0 fc0Var = pc0Var.K0;
        if (fc0Var == null) {
            c02 = 0;
        } else {
            c02 = fc0Var.c0(8);
        }
        pc0Var.L0.setText(LocaleController.formatPluralString("LocationStories", c02, new Object[0]));
        dc0 dc0Var = pc0Var.T;
        if (c02 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (dc0Var.f12044i0 != z10) {
            dc0Var.f12044i0 = z10;
            dc0Var.l();
            pc0Var.U.v0(0, AndroidUtilities.dp(200.0f), null);
        }
    }

    @Override
    public final boolean T() {
        return false;
    }

    @Override
    public final org.telegram.ui.Components.im0 f() {
        return this.f36462a.U;
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
    public final void C() {
    }
}
