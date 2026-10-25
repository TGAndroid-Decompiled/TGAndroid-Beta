package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLRPC;
public final class ec0 implements org.telegram.ui.Components.mu0 {
    public final pc0 f39077a;

    public ec0(pc0 pc0Var) {
        this.f39077a = pc0Var;
    }

    @Override
    public final void S() {
        int j02;
        boolean z10;
        pc0 pc0Var = this.f39077a;
        fc0 fc0Var = pc0Var.J0;
        if (fc0Var == null) {
            j02 = 0;
        } else {
            j02 = fc0Var.j0(8);
        }
        pc0Var.K0.setText(LocaleController.formatPluralString("LocationStories", j02, new Object[0]));
        dc0 dc0Var = pc0Var.T;
        if (j02 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (dc0Var.f14239i0 != z10) {
            dc0Var.f14239i0 = z10;
            dc0Var.l();
            pc0Var.U.w0(0, AndroidUtilities.dp(200.0f), null);
        }
    }

    @Override
    public final boolean U() {
        return false;
    }

    @Override
    public final org.telegram.ui.Components.mm0 f() {
        return this.f39077a.U;
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
    public final void G() {
    }
}
