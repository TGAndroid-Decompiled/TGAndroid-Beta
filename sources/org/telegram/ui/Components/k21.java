package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class k21 extends v41 {
    public static final int f29902a = 0;

    static {
        v41.setup(new v41());
    }

    @Override
    public final void bindView(View view, w41 w41Var, boolean z10, k51 k51Var, u51 u51Var) {
        boolean z11;
        l21 l21Var = (l21) view;
        boolean z12 = false;
        if (w41Var.f34306r) {
            l21Var.e();
        } else {
            Object obj = w41Var.G;
            if (obj == null) {
                if (w41Var.B == -2) {
                    l21Var.b(w41Var.f34305q, w41Var.f34294e);
                } else {
                    if ((w41Var.f34312y & 1) != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    l21Var.c(z11, w41Var.f34305q, w41Var.f34294e);
                }
            } else if (obj instanceof TLRPC.TL_forumTopic) {
                if (!w41Var.I) {
                    l21Var.f((TLRPC.TL_forumTopic) obj, w41Var.f34294e);
                } else {
                    l21Var.a(w41Var.f34311x, (TLRPC.TL_forumTopic) obj, w41Var.f34294e);
                }
            }
        }
        if (u51Var != null && u51Var.Y2 && l21Var.f30218y) {
            z12 = true;
        }
        l21Var.setReorder(z12);
    }

    @Override
    public final View createView(Context context, jl0 jl0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        return new l21(context, i10, c6Var);
    }
}
