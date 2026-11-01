package org.telegram.ui.Components;

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class n9 implements View.OnClickListener {
    public final int f28746a = 0;
    public final o9 f28747b;

    public n9(o9 o9Var) {
        this.f28747b = o9Var;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f28746a;
        o9 o9Var = this.f28747b;
        switch (i10) {
            case 0:
                int i11 = o9Var.f29069w + 1;
                o9Var.f29069w = i11;
                if (i11 >= 10) {
                    o9Var.setVisibility(8);
                    org.telegram.messenger.uz.f18526j1 = null;
                    org.telegram.messenger.uz.y();
                    return;
                }
                return;
            default:
                org.telegram.messenger.w0.u();
                boolean z10 = org.telegram.messenger.v2.f18578a;
                if (org.telegram.messenger.w0.f18944a.b(o9Var.getContext())) {
                    TLRPC.TL_help_appUpdate tL_help_appUpdate = o9Var.f29066n;
                    if (tL_help_appUpdate.document instanceof TLRPC.TL_document) {
                        if (!org.telegram.messenger.w0.f18944a.v((Activity) o9Var.getContext(), o9Var.f29066n.document)) {
                            org.telegram.messenger.b8.G(o9Var.f29068s).X(o9Var.f29066n.document, "update", 3, 1);
                            o9Var.a(true);
                            return;
                        }
                        return;
                    } else if (tL_help_appUpdate.url != null) {
                        gf.f.r(o9Var.getContext(), o9Var.f29066n.url);
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }

    public n9(o9 o9Var, LaunchActivity launchActivity) {
        this.f28747b = o9Var;
    }
}
