package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class u21 extends h51 {
    public static final int f29097a = 0;

    static {
        h51.setup(new h51());
    }

    @Override
    public final void bindView(View view, i51 i51Var, boolean z4, w51 w51Var, g61 g61Var) {
        boolean z10;
        v21 v21Var = (v21) view;
        boolean z11 = false;
        if (i51Var.f25571r) {
            v21Var.e();
        } else {
            Object obj = i51Var.G;
            if (obj == null) {
                if (i51Var.B == -2) {
                    v21Var.b(i51Var.f25570q, i51Var.e);
                } else {
                    if ((i51Var.f25577y & 1) != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    v21Var.c(z10, i51Var.f25570q, i51Var.e);
                }
            } else if (obj instanceof TLRPC.TL_forumTopic) {
                if (!i51Var.I) {
                    v21Var.f((TLRPC.TL_forumTopic) obj, i51Var.e);
                } else {
                    v21Var.a(i51Var.f25576x, (TLRPC.TL_forumTopic) obj, i51Var.e);
                }
            }
        }
        if (g61Var != null && g61Var.Z2 && v21Var.f29349y) {
            z11 = true;
        }
        v21Var.setReorder(z11);
    }

    @Override
    public final View createView(Context context, sl0 sl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new v21(context, i10, f6Var);
    }
}
