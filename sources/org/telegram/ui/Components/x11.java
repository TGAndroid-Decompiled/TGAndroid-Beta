package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class x11 extends m41 {
    public static final int f41807b = 0;

    static {
        m41.h(new m41());
    }

    @Override
    public final void b(View view, n41 n41Var, boolean z10, b51 b51Var, g51 g51Var) {
        boolean z11;
        y11 y11Var = (y11) view;
        boolean z12 = false;
        if (n41Var.f37661s) {
            y11Var.e();
        } else {
            Object obj = n41Var.H;
            if (obj == null) {
                if (n41Var.C == -2) {
                    y11Var.b(n41Var.f37660r, n41Var.f37648e);
                } else {
                    if ((n41Var.f37667z & 1) != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    y11Var.c(z11, n41Var.f37660r, n41Var.f37648e);
                }
            } else if (obj instanceof TLRPC.TL_forumTopic) {
                if (!n41Var.J) {
                    y11Var.f((TLRPC.TL_forumTopic) obj, n41Var.f37648e);
                } else {
                    y11Var.a(n41Var.f37666y, (TLRPC.TL_forumTopic) obj, n41Var.f37648e);
                }
            }
        }
        if (g51Var != null && g51Var.f35326k3 && y11Var.F) {
            z12 = true;
        }
        y11Var.setReorder(z12);
    }

    @Override
    public final View d(Context context, ek0 ek0Var, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        return new y11(i7, context, i6Var);
    }
}
