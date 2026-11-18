package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class x11 extends k41 {
    public static final int f41864b = 0;

    static {
        k41.h(new k41());
    }

    @Override
    public final void b(View view, l41 l41Var, boolean z10, z41 z41Var, e51 e51Var) {
        boolean z11;
        y11 y11Var = (y11) view;
        boolean z12 = false;
        if (l41Var.f37024s) {
            y11Var.e();
        } else {
            Object obj = l41Var.H;
            if (obj == null) {
                if (l41Var.C == -2) {
                    y11Var.b(l41Var.f37023r, l41Var.f37011e);
                } else {
                    if ((l41Var.f37030z & 1) != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    y11Var.c(z11, l41Var.f37023r, l41Var.f37011e);
                }
            } else if (obj instanceof TLRPC.TL_forumTopic) {
                if (!l41Var.J) {
                    y11Var.f((TLRPC.TL_forumTopic) obj, l41Var.f37011e);
                } else {
                    y11Var.a(l41Var.f37029y, (TLRPC.TL_forumTopic) obj, l41Var.f37011e);
                }
            }
        }
        if (e51Var != null && e51Var.f34610k3 && y11Var.F) {
            z12 = true;
        }
        y11Var.setReorder(z12);
    }

    @Override
    public final View d(Context context, ck0 ck0Var, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        return new y11(i7, context, i6Var);
    }
}
