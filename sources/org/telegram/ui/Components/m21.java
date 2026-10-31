package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class m21 extends z41 {
    public static final int f28264b = 0;

    static {
        z41.h(new z41());
    }

    @Override
    public final void b(View view, a51 a51Var, boolean z10, p51 p51Var, u51 u51Var) {
        boolean z11;
        n21 n21Var = (n21) view;
        boolean z12 = false;
        if (a51Var.f24298r) {
            n21Var.e();
        } else {
            Object obj = a51Var.G;
            if (obj == null) {
                if (a51Var.B == -2) {
                    n21Var.b(a51Var.f24297q, a51Var.e);
                } else {
                    if ((a51Var.f24304y & 1) != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    n21Var.c(z11, a51Var.f24297q, a51Var.e);
                }
            } else if (obj instanceof TLRPC.TL_forumTopic) {
                if (!a51Var.I) {
                    n21Var.f((TLRPC.TL_forumTopic) obj, a51Var.e);
                } else {
                    n21Var.a(a51Var.f24303x, (TLRPC.TL_forumTopic) obj, a51Var.e);
                }
            }
        }
        if (u51Var != null && u51Var.f30823j3 && n21Var.E) {
            z12 = true;
        }
        n21Var.setReorder(z12);
    }

    @Override
    public final View d(Context context, tk0 tk0Var, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        return new n21(i10, context, p6Var);
    }
}
