package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLRPC;
public final class ad0 implements org.telegram.ui.Components.ju0 {
    public final ld0 f33880a;

    public ad0(ld0 ld0Var) {
        this.f33880a = ld0Var;
    }

    @Override
    public final void R() {
        int c02;
        boolean z10;
        ld0 ld0Var = this.f33880a;
        bd0 bd0Var = ld0Var.K0;
        if (bd0Var == null) {
            c02 = 0;
        } else {
            c02 = bd0Var.c0(8);
        }
        ld0Var.L0.setText(LocaleController.formatPluralString("LocationStories", c02, new Object[0]));
        zc0 zc0Var = ld0Var.T;
        if (c02 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (zc0Var.f10742i0 != z10) {
            zc0Var.f10742i0 = z10;
            zc0Var.l();
            ld0Var.U.v0(0, AndroidUtilities.dp(200.0f), null);
        }
    }

    @Override
    public final boolean T() {
        return false;
    }

    @Override
    public final org.telegram.ui.Components.mm0 f() {
        return this.f33880a.U;
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
