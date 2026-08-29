package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLRPC;
public final class gc0 implements org.telegram.ui.Components.bt0 {
    public final rc0 f38553a;

    public gc0(rc0 rc0Var) {
        this.f38553a = rc0Var;
    }

    @Override
    public final void R() {
        int c02;
        boolean z10;
        rc0 rc0Var = this.f38553a;
        hc0 hc0Var = rc0Var.G0;
        if (hc0Var == null) {
            c02 = 0;
        } else {
            c02 = hc0Var.c0(8);
        }
        rc0Var.H0.setText(LocaleController.formatPluralString("LocationStories", c02, new Object[0]));
        fc0 fc0Var = rc0Var.P;
        if (c02 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (fc0Var.f47258e0 != z10) {
            fc0Var.f47258e0 = z10;
            fc0Var.l();
            rc0Var.Q.v0(0, AndroidUtilities.dp(200.0f), null);
        }
    }

    @Override
    public final boolean T() {
        return false;
    }

    @Override
    public final org.telegram.ui.Components.jl0 f() {
        return this.f38553a.Q;
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
