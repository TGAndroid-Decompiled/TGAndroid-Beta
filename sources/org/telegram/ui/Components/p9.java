package org.telegram.ui.Components;

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class p9 implements View.OnClickListener {
    public final int f38250a = 0;
    public final q9 f38251b;

    public p9(q9 q9Var) {
        this.f38251b = q9Var;
    }

    @Override
    public final void onClick(View view) {
        int i7 = this.f38250a;
        q9 q9Var = this.f38251b;
        switch (i7) {
            case 0:
                int i10 = q9Var.f38587w + 1;
                q9Var.f38587w = i10;
                if (i10 >= 10) {
                    q9Var.setVisibility(8);
                    org.telegram.messenger.gz.f23956j1 = null;
                    org.telegram.messenger.gz.y();
                    return;
                }
                return;
            default:
                org.telegram.messenger.t0.u();
                boolean z10 = org.telegram.messenger.r2.f26198a;
                if (org.telegram.messenger.t0.f26599a.b(q9Var.getContext())) {
                    TLRPC.TL_help_appUpdate tL_help_appUpdate = q9Var.f38584n;
                    if (tL_help_appUpdate.document instanceof TLRPC.TL_document) {
                        if (!org.telegram.messenger.t0.f26599a.v((Activity) q9Var.getContext(), q9Var.f38584n.document)) {
                            org.telegram.messenger.w7.G(q9Var.f38586s).W(q9Var.f38584n.document, "update", 3, 1);
                            q9Var.a(true);
                            return;
                        }
                        return;
                    } else if (tL_help_appUpdate.url != null) {
                        vf.c.t(q9Var.getContext(), q9Var.f38584n.url);
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }

    public p9(q9 q9Var, LaunchActivity launchActivity) {
        this.f38251b = q9Var;
    }
}
