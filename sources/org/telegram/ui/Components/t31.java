package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class t31 extends k61 {
    public static final int f30712a = 0;

    static {
        k61.setup(new k61());
    }

    @Override
    public final void bindView(View view, l61 l61Var, boolean z10, a71 a71Var, i71 i71Var) {
        boolean z11;
        u31 u31Var = (u31) view;
        boolean z12 = false;
        if (l61Var.f28233r) {
            u31Var.e();
        } else {
            Object obj = l61Var.G;
            if (obj == null) {
                if (l61Var.B == -2) {
                    u31Var.b(l61Var.f28232q, l61Var.e);
                } else {
                    if ((l61Var.f28239y & 1) != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    u31Var.c(z11, l61Var.f28232q, l61Var.e);
                }
            } else if (obj instanceof TLRPC.TL_forumTopic) {
                if (!l61Var.I) {
                    u31Var.f((TLRPC.TL_forumTopic) obj, l61Var.e);
                } else {
                    u31Var.a(l61Var.f28238x, (TLRPC.TL_forumTopic) obj, l61Var.e);
                }
            }
        }
        if (i71Var != null && i71Var.f27322d3 && u31Var.E) {
            z12 = true;
        }
        u31Var.setReorder(z12);
    }

    @Override
    public final View createView(Context context, lm0 lm0Var, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        return new u31(context, i10, g6Var);
    }
}
