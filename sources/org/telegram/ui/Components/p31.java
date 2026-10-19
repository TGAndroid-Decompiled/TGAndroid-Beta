package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class p31 extends f61 {
    public static final int f29156a = 0;

    static {
        f61.setup(new f61());
    }

    @Override
    public final void bindView(View view, g61 g61Var, boolean z10, t61 t61Var, b71 b71Var) {
        boolean z11;
        q31 q31Var = (q31) view;
        boolean z12 = false;
        if (g61Var.f26503r) {
            q31Var.e();
        } else {
            Object obj = g61Var.G;
            if (obj == null) {
                if (g61Var.B == -2) {
                    q31Var.b(g61Var.f26502q, g61Var.e);
                } else {
                    if ((g61Var.f26509y & 1) != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    q31Var.c(z11, g61Var.f26502q, g61Var.e);
                }
            } else if (obj instanceof TLRPC.TL_forumTopic) {
                if (!g61Var.I) {
                    q31Var.f((TLRPC.TL_forumTopic) obj, g61Var.e);
                } else {
                    q31Var.a(g61Var.f26508x, (TLRPC.TL_forumTopic) obj, g61Var.e);
                }
            }
        }
        if (b71Var != null && b71Var.f24823a3 && q31Var.f29513y) {
            z12 = true;
        }
        q31Var.setReorder(z12);
    }

    @Override
    public final View createView(Context context, im0 im0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new q31(context, i10, d6Var);
    }
}
