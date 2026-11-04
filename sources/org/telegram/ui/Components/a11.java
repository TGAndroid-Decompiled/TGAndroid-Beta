package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class a11 extends q31 {
    public static final int f31705b = 0;

    static {
        q31.h(new q31());
    }

    @Override
    public final void b(View view, r31 r31Var, boolean z10, f41 f41Var, l41 l41Var) {
        boolean z11;
        int i3;
        b11 b11Var = (b11) view;
        boolean z12 = false;
        if (r31Var.f37633r) {
            b11Var.f();
        } else {
            Object obj = r31Var.G;
            if (obj == null) {
                if (r31Var.d == -2) {
                    b11Var.c();
                } else {
                    if ((r31Var.f37639y & 1) != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    b11Var.d(z11, r31Var.f37632q, r31Var.f37621e);
                }
            } else if (obj instanceof TLRPC.TL_forumTopic) {
                if (!r31Var.I) {
                    b11Var.g(r31Var.f37638x, (TLRPC.TL_forumTopic) obj, r31Var.f37621e);
                } else {
                    b11Var.b(r31Var.f37638x, (TLRPC.TL_forumTopic) obj, r31Var.f37621e);
                }
            }
        }
        if (x7.u.a(r31Var.f37639y, 8)) {
            i3 = org.telegram.messenger.g0.L(10.0f);
        } else {
            i3 = 0;
        }
        b11Var.M = i3;
        if (l41Var != null && l41Var.f35597k3 && b11Var.f32054s) {
            z12 = true;
        }
        b11Var.setReorder(z12);
    }

    @Override
    public final View d(Context context, tj0 tj0Var, int i3, org.telegram.ui.ActionBar.e6 e6Var) {
        return new b11(i3, context, e6Var);
    }
}
