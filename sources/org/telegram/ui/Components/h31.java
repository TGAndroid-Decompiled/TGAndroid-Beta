package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class h31 extends x51 {
    public static final int f24733a = 0;

    static {
        x51.setup(new x51());
    }

    @Override
    public final void bindView(View view, y51 y51Var, boolean z10, m61 m61Var, u61 u61Var) {
        boolean z11;
        int i10;
        i31 i31Var = (i31) view;
        boolean z12 = false;
        if (y51Var.f30643r) {
            i31Var.f();
        } else {
            Object obj = y51Var.G;
            if (obj == null) {
                if (y51Var.d == -2) {
                    i31Var.c();
                } else {
                    if ((y51Var.f30649y & 1) != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    i31Var.d(z11, y51Var.f30642q, y51Var.e);
                }
            } else if (obj instanceof TLRPC.TL_forumTopic) {
                if (!y51Var.I) {
                    i31Var.g(y51Var.f30648x, (TLRPC.TL_forumTopic) obj, y51Var.e);
                } else {
                    i31Var.b(y51Var.f30648x, (TLRPC.TL_forumTopic) obj, y51Var.e);
                }
            }
        }
        if (w7.d0.a(y51Var.f30649y, 8)) {
            i10 = AndroidUtilities.dp(10.0f);
        } else {
            i10 = 0;
        }
        i31Var.L = i10;
        if (u61Var != null && u61Var.j3 && i31Var.f25008s) {
            z12 = true;
        }
        i31Var.setReorder(z12);
    }

    @Override
    public final View createView(Context context, zl0 zl0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new i31(context, i10, d6Var);
    }
}
