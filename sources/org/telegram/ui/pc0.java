package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLRPC;
public final class pc0 implements org.telegram.ui.Components.jt0 {
    public final ad0 f37276a;

    public pc0(ad0 ad0Var) {
        this.f37276a = ad0Var;
    }

    @Override
    public final void R() {
        int c02;
        boolean z4;
        ad0 ad0Var = this.f37276a;
        qc0 qc0Var = ad0Var.H0;
        if (qc0Var == null) {
            c02 = 0;
        } else {
            c02 = qc0Var.c0(8);
        }
        ad0Var.I0.setText(LocaleController.formatPluralString("LocationStories", c02, new Object[0]));
        oc0 oc0Var = ad0Var.Q;
        if (c02 > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (oc0Var.f44739f0 != z4) {
            oc0Var.f44739f0 = z4;
            oc0Var.l();
            ad0Var.R.v0(0, AndroidUtilities.dp(200.0f), null);
        }
    }

    @Override
    public final boolean T() {
        return false;
    }

    @Override
    public final org.telegram.ui.Components.sl0 f() {
        return this.f37276a.R;
    }

    @Override
    public final TLRPC.Chat g() {
        return null;
    }

    @Override
    public final boolean h(TLRPC.ChatParticipant chatParticipant, boolean z4, boolean z10, View view) {
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
