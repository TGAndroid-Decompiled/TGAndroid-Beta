package org.telegram.ui.Components;

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class n9 implements View.OnClickListener {
    public final int f28720a = 0;
    public final o9 f28721b;

    public n9(o9 o9Var) {
        this.f28721b = o9Var;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f28720a;
        o9 o9Var = this.f28721b;
        switch (i10) {
            case 0:
                int i11 = o9Var.f29008w + 1;
                o9Var.f29008w = i11;
                if (i11 >= 10) {
                    o9Var.setVisibility(8);
                    org.telegram.messenger.tz.f18157j1 = null;
                    org.telegram.messenger.tz.y();
                    return;
                }
                return;
            default:
                org.telegram.messenger.w0.u();
                boolean z10 = org.telegram.messenger.v2.f18448a;
                if (org.telegram.messenger.w0.f19024a.b(o9Var.getContext())) {
                    TLRPC.TL_help_appUpdate tL_help_appUpdate = o9Var.f29005n;
                    if (tL_help_appUpdate.document instanceof TLRPC.TL_document) {
                        if (!org.telegram.messenger.w0.f19024a.v((Activity) o9Var.getContext(), o9Var.f29005n.document)) {
                            org.telegram.messenger.b8.G(o9Var.f29007s).X(o9Var.f29005n.document, "update", 3, 1);
                            o9Var.a(true);
                            return;
                        }
                        return;
                    } else if (tL_help_appUpdate.url != null) {
                        gf.f.r(o9Var.getContext(), o9Var.f29005n.url);
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }

    public n9(o9 o9Var, LaunchActivity launchActivity) {
        this.f28721b = o9Var;
    }
}
