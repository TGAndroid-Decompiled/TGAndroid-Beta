package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class q31 extends g61 {
    public static final int f29471a = 0;

    static {
        g61.setup(new g61());
    }

    @Override
    public final void bindView(View view, h61 h61Var, boolean z10, u61 u61Var, c71 c71Var) {
        boolean z11;
        r31 r31Var = (r31) view;
        boolean z12 = false;
        if (h61Var.f26788r) {
            r31Var.e();
        } else {
            Object obj = h61Var.G;
            if (obj == null) {
                if (h61Var.B == -2) {
                    r31Var.b(h61Var.f26787q, h61Var.e);
                } else {
                    if ((h61Var.f26794y & 1) != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    r31Var.c(z11, h61Var.f26787q, h61Var.e);
                }
            } else if (obj instanceof TLRPC.TL_forumTopic) {
                if (!h61Var.I) {
                    r31Var.f((TLRPC.TL_forumTopic) obj, h61Var.e);
                } else {
                    r31Var.a(h61Var.f26793x, (TLRPC.TL_forumTopic) obj, h61Var.e);
                }
            }
        }
        if (c71Var != null && c71Var.f25118a3 && r31Var.f29809y) {
            z12 = true;
        }
        r31Var.setReorder(z12);
    }

    @Override
    public final View createView(Context context, jm0 jm0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new r31(context, i10, d6Var);
    }
}
