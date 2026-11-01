package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class n21 extends a51 {
    public static final int f28642b = 0;

    static {
        a51.h(new a51());
    }

    @Override
    public final void b(View view, b51 b51Var, boolean z10, q51 q51Var, v51 v51Var) {
        boolean z11;
        o21 o21Var = (o21) view;
        boolean z12 = false;
        if (b51Var.f24649r) {
            o21Var.e();
        } else {
            Object obj = b51Var.G;
            if (obj == null) {
                if (b51Var.B == -2) {
                    o21Var.b(b51Var.f24648q, b51Var.e);
                } else {
                    if ((b51Var.f24655y & 1) != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    o21Var.c(z11, b51Var.f24648q, b51Var.e);
                }
            } else if (obj instanceof TLRPC.TL_forumTopic) {
                if (!b51Var.I) {
                    o21Var.f((TLRPC.TL_forumTopic) obj, b51Var.e);
                } else {
                    o21Var.a(b51Var.f24654x, (TLRPC.TL_forumTopic) obj, b51Var.e);
                }
            }
        }
        if (v51Var != null && v51Var.f31187j3 && o21Var.E) {
            z12 = true;
        }
        o21Var.setReorder(z12);
    }

    @Override
    public final View d(Context context, uk0 uk0Var, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        return new o21(i10, context, p6Var);
    }
}
