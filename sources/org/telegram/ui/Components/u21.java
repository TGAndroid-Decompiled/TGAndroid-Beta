package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class u21 extends g51 {
    public static final int f31485a = 0;

    static {
        g51.setup(new g51());
    }

    @Override
    public final void bindView(View view, h51 h51Var, boolean z4, w51 w51Var, h61 h61Var) {
        boolean z10;
        v21 v21Var = (v21) view;
        boolean z11 = false;
        if (h51Var.f27381r) {
            v21Var.e();
        } else {
            Object obj = h51Var.G;
            if (obj == null) {
                if (h51Var.B == -2) {
                    v21Var.b(h51Var.f27380q, h51Var.f27369e);
                } else {
                    if ((h51Var.f27387y & 1) != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    v21Var.c(z10, h51Var.f27380q, h51Var.f27369e);
                }
            } else if (obj instanceof TLRPC.TL_forumTopic) {
                if (!h51Var.I) {
                    v21Var.f((TLRPC.TL_forumTopic) obj, h51Var.f27369e);
                } else {
                    v21Var.a(h51Var.f27386x, (TLRPC.TL_forumTopic) obj, h51Var.f27369e);
                }
            }
        }
        if (h61Var != null && h61Var.Z2 && v21Var.f31763y) {
            z11 = true;
        }
        v21Var.setReorder(z11);
    }

    @Override
    public final View createView(Context context, sl0 sl0Var, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        return new v21(context, i10, g6Var);
    }
}
