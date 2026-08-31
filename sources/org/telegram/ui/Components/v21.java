package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class v21 extends i51 {
    public static final int f31785a = 0;

    static {
        i51.setup(new i51());
    }

    @Override
    public final void bindView(View view, j51 j51Var, boolean z4, x51 x51Var, i61 i61Var) {
        boolean z10;
        w21 w21Var = (w21) view;
        boolean z11 = false;
        if (j51Var.f28020r) {
            w21Var.e();
        } else {
            Object obj = j51Var.G;
            if (obj == null) {
                if (j51Var.B == -2) {
                    w21Var.b(j51Var.f28019q, j51Var.f28008e);
                } else {
                    if ((j51Var.f28026y & 1) != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    w21Var.c(z10, j51Var.f28019q, j51Var.f28008e);
                }
            } else if (obj instanceof TLRPC.TL_forumTopic) {
                if (!j51Var.I) {
                    w21Var.f((TLRPC.TL_forumTopic) obj, j51Var.f28008e);
                } else {
                    w21Var.a(j51Var.f28025x, (TLRPC.TL_forumTopic) obj, j51Var.f28008e);
                }
            }
        }
        if (i61Var != null && i61Var.Z2 && w21Var.f32624y) {
            z11 = true;
        }
        w21Var.setReorder(z11);
    }

    @Override
    public final View createView(Context context, tl0 tl0Var, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        return new w21(context, i10, g6Var);
    }
}
