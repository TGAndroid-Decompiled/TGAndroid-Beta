package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class u11 extends n41 {
    public static final int f40186b = 0;

    static {
        n41.h(new n41());
    }

    @Override
    public final void b(View view, o41 o41Var, boolean z10, c51 c51Var, h51 h51Var) {
        boolean z11;
        int i7;
        v11 v11Var = (v11) view;
        boolean z12 = false;
        if (o41Var.f38064s) {
            v11Var.f();
        } else {
            Object obj = o41Var.H;
            if (obj == null) {
                if (o41Var.d == -2) {
                    v11Var.c();
                } else {
                    if ((o41Var.f38070z & 1) != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    v11Var.d(z11, o41Var.f38063r, o41Var.f38051e);
                }
            } else if (obj instanceof TLRPC.TL_forumTopic) {
                if (!o41Var.J) {
                    v11Var.g(o41Var.f38069y, (TLRPC.TL_forumTopic) obj, o41Var.f38051e);
                } else {
                    v11Var.b(o41Var.f38069y, (TLRPC.TL_forumTopic) obj, o41Var.f38051e);
                }
            }
        }
        if (c8.ed.a(o41Var.f38070z, 8)) {
            i7 = org.telegram.messenger.g0.L(10.0f);
        } else {
            i7 = 0;
        }
        v11Var.M = i7;
        if (h51Var != null && h51Var.f35745k3 && v11Var.f40591s) {
            z12 = true;
        }
        v11Var.setReorder(z12);
    }

    @Override
    public final View d(Context context, ek0 ek0Var, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        return new v11(i7, context, h6Var);
    }
}
