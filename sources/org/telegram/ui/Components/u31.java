package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class u31 extends g61 {
    public static final int f31335a = 0;

    static {
        g61.setup(new g61());
    }

    @Override
    public final void bindView(View view, h61 h61Var, boolean z10, w61 w61Var, e71 e71Var) {
        boolean z11;
        v31 v31Var = (v31) view;
        boolean z12 = false;
        if (h61Var.f27099r) {
            v31Var.e();
        } else {
            Object obj = h61Var.G;
            if (obj == null) {
                if (h61Var.B == -2) {
                    v31Var.b(h61Var.f27098q, h61Var.f27087e);
                } else {
                    if ((h61Var.f27105y & 1) != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    v31Var.c(z11, h61Var.f27098q, h61Var.f27087e);
                }
            } else if (obj instanceof TLRPC.TL_forumTopic) {
                if (!h61Var.I) {
                    v31Var.f((TLRPC.TL_forumTopic) obj, h61Var.f27087e);
                } else {
                    v31Var.a(h61Var.f27104x, (TLRPC.TL_forumTopic) obj, h61Var.f27087e);
                }
            }
        }
        if (e71Var != null && e71Var.j3 && v31Var.f31655y) {
            z12 = true;
        }
        v31Var.setReorder(z12);
    }

    @Override
    public final View createView(Context context, zl0 zl0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new v31(context, i10, d6Var);
    }
}
