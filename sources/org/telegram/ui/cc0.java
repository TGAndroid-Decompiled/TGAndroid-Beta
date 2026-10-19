package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLRPC;
public final class cc0 implements org.telegram.ui.Components.fu0 {
    public final nc0 f35937a;

    public cc0(nc0 nc0Var) {
        this.f35937a = nc0Var;
    }

    @Override
    public final void R() {
        int c02;
        boolean z10;
        nc0 nc0Var = this.f35937a;
        dc0 dc0Var = nc0Var.K0;
        if (dc0Var == null) {
            c02 = 0;
        } else {
            c02 = dc0Var.c0(8);
        }
        nc0Var.L0.setText(LocaleController.formatPluralString("LocationStories", c02, new Object[0]));
        bc0 bc0Var = nc0Var.T;
        if (c02 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (bc0Var.f12045i0 != z10) {
            bc0Var.f12045i0 = z10;
            bc0Var.l();
            nc0Var.U.v0(0, AndroidUtilities.dp(200.0f), null);
        }
    }

    @Override
    public final boolean T() {
        return false;
    }

    @Override
    public final org.telegram.ui.Components.im0 f() {
        return this.f35937a.U;
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
