package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLRPC;

public final class ic0 implements org.telegram.ui.Components.ss0 {

    public final tc0 f39028a;

    public ic0(tc0 tc0Var) {
        this.f39028a = tc0Var;
    }

    @Override
    public final void R() {
        tc0 tc0Var = this.f39028a;
        jc0 jc0Var = tc0Var.G0;
        int iC0 = jc0Var == null ? 0 : jc0Var.c0(8);
        tc0Var.H0.setText(LocaleController.formatPluralString("LocationStories", iC0, new Object[0]));
        hc0 hc0Var = tc0Var.P;
        boolean z10 = iC0 > 0;
        if (hc0Var.f45817e0 != z10) {
            hc0Var.f45817e0 = z10;
            hc0Var.l();
            tc0Var.Q.v0(0, AndroidUtilities.dp(200.0f), null);
        }
    }

    @Override
    public final boolean T() {
        return false;
    }

    @Override
    public final org.telegram.ui.Components.zk0 f() {
        return this.f39028a.Q;
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
