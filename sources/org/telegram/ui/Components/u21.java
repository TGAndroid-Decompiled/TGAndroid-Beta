package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class u21 extends g51 {
    public static final int f28398a = 0;

    static {
        g51.setup(new g51());
    }

    @Override
    public final void bindView(View view, h51 h51Var, boolean z10, v51 v51Var, d61 d61Var) {
        boolean z11;
        v21 v21Var = (v21) view;
        boolean z12 = false;
        if (h51Var.f24513r) {
            v21Var.e();
        } else {
            Object obj = h51Var.G;
            if (obj == null) {
                if (h51Var.B == -2) {
                    v21Var.b(h51Var.f24512q, h51Var.e);
                } else {
                    if ((h51Var.f24519y & 1) != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    v21Var.c(z11, h51Var.f24512q, h51Var.e);
                }
            } else if (obj instanceof TLRPC.TL_forumTopic) {
                if (!h51Var.I) {
                    v21Var.f((TLRPC.TL_forumTopic) obj, h51Var.e);
                } else {
                    v21Var.a(h51Var.f24518x, (TLRPC.TL_forumTopic) obj, h51Var.e);
                }
            }
        }
        if (d61Var != null && d61Var.f23292c3 && v21Var.f28641y) {
            z12 = true;
        }
        v21Var.setReorder(z12);
    }

    @Override
    public final View createView(Context context, ml0 ml0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new v21(context, i10, d6Var);
    }
}
