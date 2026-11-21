package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class z11 extends n41 {
    public static final int f42633b = 0;

    static {
        n41.h(new n41());
    }

    @Override
    public final void b(View view, o41 o41Var, boolean z10, c51 c51Var, h51 h51Var) {
        boolean z11;
        a21 a21Var = (a21) view;
        boolean z12 = false;
        if (o41Var.f38104s) {
            a21Var.e();
        } else {
            Object obj = o41Var.H;
            if (obj == null) {
                if (o41Var.C == -2) {
                    a21Var.b(o41Var.f38103r, o41Var.f38091e);
                } else {
                    if ((o41Var.f38110z & 1) != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    a21Var.c(z11, o41Var.f38103r, o41Var.f38091e);
                }
            } else if (obj instanceof TLRPC.TL_forumTopic) {
                if (!o41Var.J) {
                    a21Var.f((TLRPC.TL_forumTopic) obj, o41Var.f38091e);
                } else {
                    a21Var.a(o41Var.f38109y, (TLRPC.TL_forumTopic) obj, o41Var.f38091e);
                }
            }
        }
        if (h51Var != null && h51Var.f35799k3 && a21Var.F) {
            z12 = true;
        }
        a21Var.setReorder(z12);
    }

    @Override
    public final View d(Context context, ek0 ek0Var, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        return new a21(i7, context, h6Var);
    }
}
