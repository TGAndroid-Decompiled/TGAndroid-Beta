package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class u11 extends k41 {
    public static final int f32901a = 0;

    static {
        k41.setup(new k41());
    }

    @Override
    public final void bindView(View view, l41 l41Var, boolean z10, z41 z41Var, i51 i51Var) {
        boolean z11;
        int i9;
        v11 v11Var = (v11) view;
        boolean z12 = false;
        if (l41Var.f30345r) {
            v11Var.f();
        } else {
            Object obj = l41Var.G;
            if (obj == null) {
                if (l41Var.d == -2) {
                    v11Var.c();
                } else {
                    if ((l41Var.f30351y & 1) != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    v11Var.d(z11, l41Var.f30344q, l41Var.f30333e);
                }
            } else if (obj instanceof TLRPC.TL_forumTopic) {
                if (!l41Var.I) {
                    v11Var.g(l41Var.f30350x, (TLRPC.TL_forumTopic) obj, l41Var.f30333e);
                } else {
                    v11Var.b(l41Var.f30350x, (TLRPC.TL_forumTopic) obj, l41Var.f30333e);
                }
            }
        }
        if (g7.z7.a(l41Var.f30351y, 8)) {
            i9 = AndroidUtilities.dp(10.0f);
        } else {
            i9 = 0;
        }
        v11Var.H = i9;
        if (i51Var != null && i51Var.Y2 && v11Var.f33233s) {
            z12 = true;
        }
        v11Var.setReorder(z12);
    }

    @Override
    public final View createView(Context context, wk0 wk0Var, int i9, int i10, org.telegram.ui.ActionBar.b6 b6Var) {
        return new v11(context, i9, b6Var);
    }
}
