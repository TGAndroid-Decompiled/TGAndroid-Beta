package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class y11 extends n41 {
    public static final int f42305b = 0;

    static {
        n41.h(new n41());
    }

    @Override
    public final void b(View view, o41 o41Var, boolean z10, c51 c51Var, h51 h51Var) {
        boolean z11;
        z11 z11Var = (z11) view;
        boolean z12 = false;
        if (o41Var.f38098s) {
            z11Var.e();
        } else {
            Object obj = o41Var.H;
            if (obj == null) {
                if (o41Var.C == -2) {
                    z11Var.b(o41Var.f38097r, o41Var.f38085e);
                } else {
                    if ((o41Var.f38104z & 1) != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    z11Var.c(z11, o41Var.f38097r, o41Var.f38085e);
                }
            } else if (obj instanceof TLRPC.TL_forumTopic) {
                if (!o41Var.J) {
                    z11Var.f((TLRPC.TL_forumTopic) obj, o41Var.f38085e);
                } else {
                    z11Var.a(o41Var.f38103y, (TLRPC.TL_forumTopic) obj, o41Var.f38085e);
                }
            }
        }
        if (h51Var != null && h51Var.f35793k3 && z11Var.F) {
            z12 = true;
        }
        z11Var.setReorder(z12);
    }

    @Override
    public final View d(Context context, ek0 ek0Var, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        return new z11(i7, context, h6Var);
    }
}
