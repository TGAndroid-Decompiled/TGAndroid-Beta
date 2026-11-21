package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class v11 extends n41 {
    public static final int f40641b = 0;

    static {
        n41.h(new n41());
    }

    @Override
    public final void b(View view, o41 o41Var, boolean z10, c51 c51Var, h51 h51Var) {
        boolean z11;
        int i7;
        w11 w11Var = (w11) view;
        boolean z12 = false;
        if (o41Var.f38104s) {
            w11Var.f();
        } else {
            Object obj = o41Var.H;
            if (obj == null) {
                if (o41Var.d == -2) {
                    w11Var.c();
                } else {
                    if ((o41Var.f38110z & 1) != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    w11Var.d(z11, o41Var.f38103r, o41Var.f38091e);
                }
            } else if (obj instanceof TLRPC.TL_forumTopic) {
                if (!o41Var.J) {
                    w11Var.g(o41Var.f38109y, (TLRPC.TL_forumTopic) obj, o41Var.f38091e);
                } else {
                    w11Var.b(o41Var.f38109y, (TLRPC.TL_forumTopic) obj, o41Var.f38091e);
                }
            }
        }
        if (c8.dd.a(o41Var.f38110z, 8)) {
            i7 = org.telegram.messenger.g0.L(10.0f);
        } else {
            i7 = 0;
        }
        w11Var.M = i7;
        if (h51Var != null && h51Var.f35799k3 && w11Var.f41630s) {
            z12 = true;
        }
        w11Var.setReorder(z12);
    }

    @Override
    public final View d(Context context, ek0 ek0Var, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        return new w11(i7, context, h6Var);
    }
}
