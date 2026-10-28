package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLRPC;
public final class gc0 implements org.telegram.ui.Components.nu0 {
    public final rc0 f39585a;

    public gc0(rc0 rc0Var) {
        this.f39585a = rc0Var;
    }

    @Override
    public final void S() {
        int j02;
        boolean z10;
        rc0 rc0Var = this.f39585a;
        hc0 hc0Var = rc0Var.J0;
        if (hc0Var == null) {
            j02 = 0;
        } else {
            j02 = hc0Var.j0(8);
        }
        rc0Var.K0.setText(LocaleController.formatPluralString("LocationStories", j02, new Object[0]));
        fc0 fc0Var = rc0Var.T;
        if (j02 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (fc0Var.f14238i0 != z10) {
            fc0Var.f14238i0 = z10;
            fc0Var.l();
            rc0Var.U.w0(0, AndroidUtilities.dp(200.0f), null);
        }
    }

    @Override
    public final boolean U() {
        return false;
    }

    @Override
    public final org.telegram.ui.Components.nm0 f() {
        return this.f39585a.U;
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
