package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class t11 extends k41 {
    public static final int f39888b = 0;

    static {
        k41.h(new k41());
    }

    @Override
    public final void b(View view, l41 l41Var, boolean z10, z41 z41Var, e51 e51Var) {
        boolean z11;
        int i7;
        u11 u11Var = (u11) view;
        boolean z12 = false;
        if (l41Var.f37024s) {
            u11Var.f();
        } else {
            Object obj = l41Var.H;
            if (obj == null) {
                if (l41Var.d == -2) {
                    u11Var.c();
                } else {
                    if ((l41Var.f37030z & 1) != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    u11Var.d(z11, l41Var.f37023r, l41Var.f37011e);
                }
            } else if (obj instanceof TLRPC.TL_forumTopic) {
                if (!l41Var.J) {
                    u11Var.g(l41Var.f37029y, (TLRPC.TL_forumTopic) obj, l41Var.f37011e);
                } else {
                    u11Var.b(l41Var.f37029y, (TLRPC.TL_forumTopic) obj, l41Var.f37011e);
                }
            }
        }
        if (c8.dd.a(l41Var.f37030z, 8)) {
            i7 = org.telegram.messenger.g0.L(10.0f);
        } else {
            i7 = 0;
        }
        u11Var.M = i7;
        if (e51Var != null && e51Var.f34610k3 && u11Var.f40175s) {
            z12 = true;
        }
        u11Var.setReorder(z12);
    }

    @Override
    public final View d(Context context, ck0 ck0Var, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        return new u11(i7, context, i6Var);
    }
}
