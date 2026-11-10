package org.telegram.ui.Components;

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class r9 implements View.OnClickListener {
    public final int f37570a = 0;
    public final t9 f37571b;

    public r9(t9 t9Var) {
        this.f37571b = t9Var;
    }

    @Override
    public final void onClick(View view) {
        int i7 = this.f37570a;
        t9 t9Var = this.f37571b;
        switch (i7) {
            case 0:
                int i10 = t9Var.f38242w + 1;
                t9Var.f38242w = i10;
                if (i10 >= 10) {
                    t9Var.setVisibility(8);
                    org.telegram.messenger.iz.f23416j1 = null;
                    org.telegram.messenger.iz.y();
                    return;
                }
                return;
            default:
                org.telegram.messenger.t0.u();
                boolean z9 = org.telegram.messenger.r2.f25216a;
                if (org.telegram.messenger.t0.f25569a.b(t9Var.getContext())) {
                    TLRPC.TL_help_appUpdate tL_help_appUpdate = t9Var.f38239n;
                    if (tL_help_appUpdate.document instanceof TLRPC.TL_document) {
                        if (!org.telegram.messenger.t0.f25569a.v((Activity) t9Var.getContext(), t9Var.f38239n.document)) {
                            org.telegram.messenger.w7.G(t9Var.f38241s).W(t9Var.f38239n.document, "update", 3, 1);
                            t9Var.a(true);
                            return;
                        }
                        return;
                    } else if (tL_help_appUpdate.url != null) {
                        vf.c.t(t9Var.getContext(), t9Var.f38239n.url);
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }

    public r9(t9 t9Var, LaunchActivity launchActivity) {
        this.f37571b = t9Var;
    }
}
