package org.telegram.ui.Components;

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class x9 implements View.OnClickListener {
    public final int f41969a = 0;
    public final y9 f41970b;

    public x9(y9 y9Var) {
        this.f41970b = y9Var;
    }

    @Override
    public final void onClick(View view) {
        int i7 = this.f41969a;
        y9 y9Var = this.f41970b;
        switch (i7) {
            case 0:
                int i10 = y9Var.f42345w + 1;
                y9Var.f42345w = i10;
                if (i10 >= 10) {
                    y9Var.setVisibility(8);
                    org.telegram.messenger.cz.f23381j1 = null;
                    org.telegram.messenger.cz.y();
                    return;
                }
                return;
            default:
                org.telegram.messenger.t0.u();
                boolean z10 = org.telegram.messenger.s2.f26694a;
                if (org.telegram.messenger.t0.f26894a.b(y9Var.getContext())) {
                    TLRPC.TL_help_appUpdate tL_help_appUpdate = y9Var.f42342n;
                    if (tL_help_appUpdate.document instanceof TLRPC.TL_document) {
                        if (!org.telegram.messenger.t0.f26894a.v((Activity) y9Var.getContext(), y9Var.f42342n.document)) {
                            org.telegram.messenger.w7.G(y9Var.f42344s).W(y9Var.f42342n.document, "update", 3, 1);
                            y9Var.a(true);
                            return;
                        }
                        return;
                    } else if (tL_help_appUpdate.url != null) {
                        vf.c.t(y9Var.getContext(), y9Var.f42342n.url);
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }

    public x9(y9 y9Var, LaunchActivity launchActivity) {
        this.f41970b = y9Var;
    }
}
