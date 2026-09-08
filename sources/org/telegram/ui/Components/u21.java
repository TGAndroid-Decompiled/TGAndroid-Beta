package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class u21 extends g51 {
    public static final int f30815a = 0;

    static {
        g51.setup(new g51());
    }

    @Override
    public final void bindView(View view, h51 h51Var, boolean z10, v51 v51Var, d61 d61Var) {
        boolean z11;
        v21 v21Var = (v21) view;
        boolean z12 = false;
        if (h51Var.f26627r) {
            v21Var.e();
        } else {
            Object obj = h51Var.G;
            if (obj == null) {
                if (h51Var.B == -2) {
                    v21Var.b(h51Var.f26626q, h51Var.f26615e);
                } else {
                    if ((h51Var.f26633y & 1) != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    v21Var.c(z11, h51Var.f26626q, h51Var.f26615e);
                }
            } else if (obj instanceof TLRPC.TL_forumTopic) {
                if (!h51Var.I) {
                    v21Var.f((TLRPC.TL_forumTopic) obj, h51Var.f26615e);
                } else {
                    v21Var.a(h51Var.f26632x, (TLRPC.TL_forumTopic) obj, h51Var.f26615e);
                }
            }
        }
        if (d61Var != null && d61Var.f25308c3 && v21Var.f31098y) {
            z12 = true;
        }
        v21Var.setReorder(z12);
    }

    @Override
    public final View createView(Context context, ll0 ll0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new v21(context, i10, f6Var);
    }
}
