package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class z11 extends k41 {
    public static final int f35164a = 0;

    static {
        k41.setup(new k41());
    }

    @Override
    public final void bindView(View view, l41 l41Var, boolean z10, z41 z41Var, i51 i51Var) {
        boolean z11;
        a21 a21Var = (a21) view;
        boolean z12 = false;
        if (l41Var.f30345r) {
            a21Var.e();
        } else {
            Object obj = l41Var.G;
            if (obj == null) {
                if (l41Var.B == -2) {
                    a21Var.b(l41Var.f30344q, l41Var.f30333e);
                } else {
                    if ((l41Var.f30351y & 1) != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    a21Var.c(z11, l41Var.f30344q, l41Var.f30333e);
                }
            } else if (obj instanceof TLRPC.TL_forumTopic) {
                if (!l41Var.I) {
                    a21Var.f((TLRPC.TL_forumTopic) obj, l41Var.f30333e);
                } else {
                    a21Var.a(l41Var.f30350x, (TLRPC.TL_forumTopic) obj, l41Var.f30333e);
                }
            }
        }
        if (i51Var != null && i51Var.Y2 && a21Var.f26644y) {
            z12 = true;
        }
        a21Var.setReorder(z12);
    }

    @Override
    public final View createView(Context context, wk0 wk0Var, int i9, int i10, org.telegram.ui.ActionBar.b6 b6Var) {
        return new a21(context, i9, b6Var);
    }
}
