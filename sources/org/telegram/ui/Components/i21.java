package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class i21 extends z41 {
    public static final int f26870b = 0;

    static {
        z41.h(new z41());
    }

    @Override
    public final void b(View view, a51 a51Var, boolean z10, p51 p51Var, u51 u51Var) {
        boolean z11;
        int i10;
        j21 j21Var = (j21) view;
        boolean z12 = false;
        if (a51Var.f24298r) {
            j21Var.f();
        } else {
            Object obj = a51Var.G;
            if (obj == null) {
                if (a51Var.d == -2) {
                    j21Var.c();
                } else {
                    if ((a51Var.f24304y & 1) != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    j21Var.d(z11, a51Var.f24297q, a51Var.e);
                }
            } else if (obj instanceof TLRPC.TL_forumTopic) {
                if (!a51Var.I) {
                    j21Var.g(a51Var.f24303x, (TLRPC.TL_forumTopic) obj, a51Var.e);
                } else {
                    j21Var.b(a51Var.f24303x, (TLRPC.TL_forumTopic) obj, a51Var.e);
                }
            }
        }
        if (v7.u7.a(a51Var.f24304y, 8)) {
            i10 = org.telegram.messenger.i0.L(10.0f);
        } else {
            i10 = 0;
        }
        j21Var.L = i10;
        if (u51Var != null && u51Var.f30823j3 && j21Var.f27205s) {
            z12 = true;
        }
        j21Var.setReorder(z12);
    }

    @Override
    public final View d(Context context, tk0 tk0Var, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        return new j21(i10, context, p6Var);
    }
}
