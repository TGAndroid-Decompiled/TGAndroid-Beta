package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class j21 extends a51 {
    public static final int f27254b = 0;

    static {
        a51.h(new a51());
    }

    @Override
    public final void b(View view, b51 b51Var, boolean z10, q51 q51Var, v51 v51Var) {
        boolean z11;
        int i10;
        k21 k21Var = (k21) view;
        boolean z12 = false;
        if (b51Var.f24649r) {
            k21Var.f();
        } else {
            Object obj = b51Var.G;
            if (obj == null) {
                if (b51Var.d == -2) {
                    k21Var.c();
                } else {
                    if ((b51Var.f24655y & 1) != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    k21Var.d(z11, b51Var.f24648q, b51Var.e);
                }
            } else if (obj instanceof TLRPC.TL_forumTopic) {
                if (!b51Var.I) {
                    k21Var.g(b51Var.f24654x, (TLRPC.TL_forumTopic) obj, b51Var.e);
                } else {
                    k21Var.b(b51Var.f24654x, (TLRPC.TL_forumTopic) obj, b51Var.e);
                }
            }
        }
        if (v7.u7.a(b51Var.f24655y, 8)) {
            i10 = org.telegram.messenger.i0.L(10.0f);
        } else {
            i10 = 0;
        }
        k21Var.L = i10;
        if (v51Var != null && v51Var.f31187j3 && k21Var.f27717s) {
            z12 = true;
        }
        k21Var.setReorder(z12);
    }

    @Override
    public final View d(Context context, uk0 uk0Var, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        return new k21(i10, context, p6Var);
    }
}
