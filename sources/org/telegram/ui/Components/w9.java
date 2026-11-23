package org.telegram.ui.Components;

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class w9 implements View.OnClickListener {
    public final int f41551a = 0;
    public final x9 f41552b;

    public w9(x9 x9Var) {
        this.f41552b = x9Var;
    }

    @Override
    public final void onClick(View view) {
        int i7 = this.f41551a;
        x9 x9Var = this.f41552b;
        switch (i7) {
            case 0:
                int i10 = x9Var.f41943w + 1;
                x9Var.f41943w = i10;
                if (i10 >= 10) {
                    x9Var.setVisibility(8);
                    org.telegram.messenger.bz.f23297j1 = null;
                    org.telegram.messenger.bz.y();
                    return;
                }
                return;
            default:
                org.telegram.messenger.t0.u();
                boolean z10 = org.telegram.messenger.s2.f26829a;
                if (org.telegram.messenger.t0.f27012a.b(x9Var.getContext())) {
                    TLRPC.TL_help_appUpdate tL_help_appUpdate = x9Var.f41940n;
                    if (tL_help_appUpdate.document instanceof TLRPC.TL_document) {
                        if (!org.telegram.messenger.t0.f27012a.v((Activity) x9Var.getContext(), x9Var.f41940n.document)) {
                            org.telegram.messenger.w7.G(x9Var.f41942s).W(x9Var.f41940n.document, "update", 3, 1);
                            x9Var.a(true);
                            return;
                        }
                        return;
                    } else if (tL_help_appUpdate.url != null) {
                        vf.c.t(x9Var.getContext(), x9Var.f41940n.url);
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }

    public w9(x9 x9Var, LaunchActivity launchActivity) {
        this.f41552b = x9Var;
    }
}
