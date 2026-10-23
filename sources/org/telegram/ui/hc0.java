package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLRPC;
public final class hc0 implements org.telegram.ui.Components.ju0 {
    public final sc0 f37822a;

    public hc0(sc0 sc0Var) {
        this.f37822a = sc0Var;
    }

    @Override
    public final void R() {
        int d02;
        boolean z10;
        sc0 sc0Var = this.f37822a;
        ic0 ic0Var = sc0Var.K0;
        if (ic0Var == null) {
            d02 = 0;
        } else {
            d02 = ic0Var.d0(8);
        }
        sc0Var.L0.setText(LocaleController.formatPluralString("LocationStories", d02, new Object[0]));
        gc0 gc0Var = sc0Var.T;
        if (d02 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (gc0Var.f12073i0 != z10) {
            gc0Var.f12073i0 = z10;
            gc0Var.l();
            sc0Var.U.v0(0, AndroidUtilities.dp(200.0f), null);
        }
    }

    @Override
    public final boolean T() {
        return false;
    }

    @Override
    public final org.telegram.ui.Components.mm0 f() {
        return this.f37822a.U;
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
    public final void C() {
    }
}
