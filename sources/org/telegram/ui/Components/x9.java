package org.telegram.ui.Components;

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class x9 implements View.OnClickListener {
    public final int f42020a = 0;
    public final y9 f42021b;

    public x9(y9 y9Var) {
        this.f42021b = y9Var;
    }

    @Override
    public final void onClick(View view) {
        int i7 = this.f42020a;
        y9 y9Var = this.f42021b;
        switch (i7) {
            case 0:
                int i10 = y9Var.f42375w + 1;
                y9Var.f42375w = i10;
                if (i10 >= 10) {
                    y9Var.setVisibility(8);
                    org.telegram.messenger.bz.f23200j1 = null;
                    org.telegram.messenger.bz.y();
                    return;
                }
                return;
            default:
                org.telegram.messenger.t0.u();
                boolean z10 = org.telegram.messenger.s2.f26749a;
                if (org.telegram.messenger.t0.f26940a.b(y9Var.getContext())) {
                    TLRPC.TL_help_appUpdate tL_help_appUpdate = y9Var.f42372n;
                    if (tL_help_appUpdate.document instanceof TLRPC.TL_document) {
                        if (!org.telegram.messenger.t0.f26940a.v((Activity) y9Var.getContext(), y9Var.f42372n.document)) {
                            org.telegram.messenger.w7.G(y9Var.f42374s).W(y9Var.f42372n.document, "update", 3, 1);
                            y9Var.a(true);
                            return;
                        }
                        return;
                    } else if (tL_help_appUpdate.url != null) {
                        vf.c.t(y9Var.getContext(), y9Var.f42372n.url);
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }

    public x9(y9 y9Var, LaunchActivity launchActivity) {
        this.f42021b = y9Var;
    }
}
