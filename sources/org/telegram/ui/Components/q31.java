package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class q31 extends g61 {
    public static final int f29915a = 0;

    static {
        g61.setup(new g61());
    }

    @Override
    public final void bindView(View view, h61 h61Var, boolean z10, w61 w61Var, e71 e71Var) {
        boolean z11;
        int i10;
        r31 r31Var = (r31) view;
        boolean z12 = false;
        if (h61Var.f27099r) {
            r31Var.f();
        } else {
            Object obj = h61Var.G;
            if (obj == null) {
                if (h61Var.d == -2) {
                    r31Var.c();
                } else {
                    if ((h61Var.f27105y & 1) != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    r31Var.d(z11, h61Var.f27098q, h61Var.f27087e);
                }
            } else if (obj instanceof TLRPC.TL_forumTopic) {
                if (!h61Var.I) {
                    r31Var.g(h61Var.f27104x, (TLRPC.TL_forumTopic) obj, h61Var.f27087e);
                } else {
                    r31Var.b(h61Var.f27104x, (TLRPC.TL_forumTopic) obj, h61Var.f27087e);
                }
            }
        }
        if (w7.e0.a(h61Var.f27105y, 8)) {
            i10 = AndroidUtilities.dp(10.0f);
        } else {
            i10 = 0;
        }
        r31Var.L = i10;
        if (e71Var != null && e71Var.j3 && r31Var.f30348s) {
            z12 = true;
        }
        r31Var.setReorder(z12);
    }

    @Override
    public final View createView(Context context, zl0 zl0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new r31(context, i10, d6Var);
    }
}
