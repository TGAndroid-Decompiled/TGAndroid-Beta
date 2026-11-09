package org.telegram.ui.Components;

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class s9 implements View.OnClickListener {
    public final int f37984a = 0;
    public final u9 f37985b;

    public s9(u9 u9Var) {
        this.f37985b = u9Var;
    }

    @Override
    public final void onClick(View view) {
        int i7 = this.f37984a;
        u9 u9Var = this.f37985b;
        switch (i7) {
            case 0:
                int i10 = u9Var.f38654w + 1;
                u9Var.f38654w = i10;
                if (i10 >= 10) {
                    u9Var.setVisibility(8);
                    org.telegram.messenger.iz.f23412j1 = null;
                    org.telegram.messenger.iz.y();
                    return;
                }
                return;
            default:
                org.telegram.messenger.t0.u();
                boolean z9 = org.telegram.messenger.r2.f25212a;
                if (org.telegram.messenger.t0.f25565a.b(u9Var.getContext())) {
                    TLRPC.TL_help_appUpdate tL_help_appUpdate = u9Var.f38651n;
                    if (tL_help_appUpdate.document instanceof TLRPC.TL_document) {
                        if (!org.telegram.messenger.t0.f25565a.v((Activity) u9Var.getContext(), u9Var.f38651n.document)) {
                            org.telegram.messenger.w7.G(u9Var.f38653s).W(u9Var.f38651n.document, "update", 3, 1);
                            u9Var.a(true);
                            return;
                        }
                        return;
                    } else if (tL_help_appUpdate.url != null) {
                        vf.c.t(u9Var.getContext(), u9Var.f38651n.url);
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }

    public s9(u9 u9Var, LaunchActivity launchActivity) {
        this.f37985b = u9Var;
    }
}
