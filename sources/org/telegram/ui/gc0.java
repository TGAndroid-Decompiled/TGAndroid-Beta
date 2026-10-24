package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLRPC;
public final class gc0 implements org.telegram.ui.Components.iu0 {
    public final rc0 f37537a;

    public gc0(rc0 rc0Var) {
        this.f37537a = rc0Var;
    }

    @Override
    public final void R() {
        int d02;
        boolean z10;
        rc0 rc0Var = this.f37537a;
        hc0 hc0Var = rc0Var.J0;
        if (hc0Var == null) {
            d02 = 0;
        } else {
            d02 = hc0Var.d0(8);
        }
        rc0Var.K0.setText(LocaleController.formatPluralString("LocationStories", d02, new Object[0]));
        fc0 fc0Var = rc0Var.T;
        if (d02 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (fc0Var.f12073i0 != z10) {
            fc0Var.f12073i0 = z10;
            fc0Var.l();
            rc0Var.U.v0(0, AndroidUtilities.dp(200.0f), null);
        }
    }

    @Override
    public final boolean T() {
        return false;
    }

    @Override
    public final org.telegram.ui.Components.lm0 f() {
        return this.f37537a.U;
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
