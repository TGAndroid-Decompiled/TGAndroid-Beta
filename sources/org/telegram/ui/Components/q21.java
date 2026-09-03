package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class q21 extends h51 {
    public static final int f28058a = 0;

    static {
        h51.setup(new h51());
    }

    @Override
    public final void bindView(View view, i51 i51Var, boolean z4, w51 w51Var, g61 g61Var) {
        boolean z10;
        int i10;
        r21 r21Var = (r21) view;
        boolean z11 = false;
        if (i51Var.f25591r) {
            r21Var.f();
        } else {
            Object obj = i51Var.G;
            if (obj == null) {
                if (i51Var.d == -2) {
                    r21Var.c();
                } else {
                    if ((i51Var.f25597y & 1) != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    r21Var.d(z10, i51Var.f25590q, i51Var.e);
                }
            } else if (obj instanceof TLRPC.TL_forumTopic) {
                if (!i51Var.I) {
                    r21Var.g(i51Var.f25596x, (TLRPC.TL_forumTopic) obj, i51Var.e);
                } else {
                    r21Var.b(i51Var.f25596x, (TLRPC.TL_forumTopic) obj, i51Var.e);
                }
            }
        }
        if (k7.w8.a(i51Var.f25597y, 8)) {
            i10 = AndroidUtilities.dp(10.0f);
        } else {
            i10 = 0;
        }
        r21Var.I = i10;
        if (g61Var != null && g61Var.Z2 && r21Var.f28391s) {
            z11 = true;
        }
        r21Var.setReorder(z11);
    }

    @Override
    public final View createView(Context context, rl0 rl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new r21(context, i10, f6Var);
    }
}
