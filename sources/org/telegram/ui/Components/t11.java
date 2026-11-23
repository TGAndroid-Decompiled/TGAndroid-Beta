package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class t11 extends m41 {
    public static final int f39781b = 0;

    static {
        m41.h(new m41());
    }

    @Override
    public final void b(View view, n41 n41Var, boolean z10, b51 b51Var, g51 g51Var) {
        boolean z11;
        int i7;
        u11 u11Var = (u11) view;
        boolean z12 = false;
        if (n41Var.f37661s) {
            u11Var.f();
        } else {
            Object obj = n41Var.H;
            if (obj == null) {
                if (n41Var.d == -2) {
                    u11Var.c();
                } else {
                    if ((n41Var.f37667z & 1) != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    u11Var.d(z11, n41Var.f37660r, n41Var.f37648e);
                }
            } else if (obj instanceof TLRPC.TL_forumTopic) {
                if (!n41Var.J) {
                    u11Var.g(n41Var.f37666y, (TLRPC.TL_forumTopic) obj, n41Var.f37648e);
                } else {
                    u11Var.b(n41Var.f37666y, (TLRPC.TL_forumTopic) obj, n41Var.f37648e);
                }
            }
        }
        if (c8.ed.a(n41Var.f37667z, 8)) {
            i7 = org.telegram.messenger.g0.L(10.0f);
        } else {
            i7 = 0;
        }
        u11Var.M = i7;
        if (g51Var != null && g51Var.f35326k3 && u11Var.f40230s) {
            z12 = true;
        }
        u11Var.setReorder(z12);
    }

    @Override
    public final View d(Context context, ek0 ek0Var, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        return new u11(i7, context, i6Var);
    }
}
