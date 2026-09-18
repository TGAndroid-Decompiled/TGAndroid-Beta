package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class g31 extends w51 {
    public static final int f24302a = 0;

    static {
        w51.setup(new w51());
    }

    @Override
    public final void bindView(View view, x51 x51Var, boolean z10, l61 l61Var, t61 t61Var) {
        boolean z11;
        int i10;
        h31 h31Var = (h31) view;
        boolean z12 = false;
        if (x51Var.f30254r) {
            h31Var.f();
        } else {
            Object obj = x51Var.G;
            if (obj == null) {
                if (x51Var.d == -2) {
                    h31Var.c();
                } else {
                    if ((x51Var.f30260y & 1) != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    h31Var.d(z11, x51Var.f30253q, x51Var.e);
                }
            } else if (obj instanceof TLRPC.TL_forumTopic) {
                if (!x51Var.I) {
                    h31Var.g(x51Var.f30259x, (TLRPC.TL_forumTopic) obj, x51Var.e);
                } else {
                    h31Var.b(x51Var.f30259x, (TLRPC.TL_forumTopic) obj, x51Var.e);
                }
            }
        }
        if (w7.d0.a(x51Var.f30260y, 8)) {
            i10 = AndroidUtilities.dp(10.0f);
        } else {
            i10 = 0;
        }
        h31Var.L = i10;
        if (t61Var != null && t61Var.f28336c3 && h31Var.f24544s) {
            z12 = true;
        }
        h31Var.setReorder(z12);
    }

    @Override
    public final View createView(Context context, wl0 wl0Var, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        return new h31(context, i10, e6Var);
    }
}
