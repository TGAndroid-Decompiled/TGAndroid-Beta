package org.telegram.ui.Components;

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class r9 implements View.OnClickListener {
    public final int f37692a = 0;
    public final t9 f37693b;

    public r9(t9 t9Var) {
        this.f37693b = t9Var;
    }

    @Override
    public final void onClick(View view) {
        int i3 = this.f37692a;
        t9 t9Var = this.f37693b;
        switch (i3) {
            case 0:
                int i10 = t9Var.f38361w + 1;
                t9Var.f38361w = i10;
                if (i10 >= 10) {
                    t9Var.setVisibility(8);
                    org.telegram.messenger.az.f21639j1 = null;
                    org.telegram.messenger.az.y();
                    return;
                }
                return;
            default:
                org.telegram.messenger.t0.u();
                boolean z10 = org.telegram.messenger.r2.f25040a;
                if (org.telegram.messenger.t0.f25456a.b(t9Var.getContext())) {
                    TLRPC.TL_help_appUpdate tL_help_appUpdate = t9Var.f38358n;
                    if (tL_help_appUpdate.document instanceof TLRPC.TL_document) {
                        if (!org.telegram.messenger.t0.f25456a.v((Activity) t9Var.getContext(), t9Var.f38358n.document)) {
                            org.telegram.messenger.w7.G(t9Var.f38360s).X(t9Var.f38358n.document, "update", 3, 1);
                            t9Var.a(true);
                            return;
                        }
                        return;
                    } else if (tL_help_appUpdate.url != null) {
                        sf.c.t(t9Var.getContext(), t9Var.f38358n.url);
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }

    public r9(t9 t9Var, LaunchActivity launchActivity) {
        this.f37693b = t9Var;
    }
}
