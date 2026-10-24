package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class p31 extends k61 {
    public static final int f29460a = 0;

    static {
        k61.setup(new k61());
    }

    @Override
    public final void bindView(View view, l61 l61Var, boolean z10, a71 a71Var, i71 i71Var) {
        boolean z11;
        int i10;
        q31 q31Var = (q31) view;
        boolean z12 = false;
        if (l61Var.f28233r) {
            q31Var.f();
        } else {
            Object obj = l61Var.G;
            if (obj == null) {
                if (l61Var.d == -2) {
                    q31Var.c();
                } else {
                    if ((l61Var.f28239y & 1) != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    q31Var.d(z11, l61Var.f28232q, l61Var.e);
                }
            } else if (obj instanceof TLRPC.TL_forumTopic) {
                if (!l61Var.I) {
                    q31Var.g(l61Var.f28238x, (TLRPC.TL_forumTopic) obj, l61Var.e);
                } else {
                    q31Var.b(l61Var.f28238x, (TLRPC.TL_forumTopic) obj, l61Var.e);
                }
            }
        }
        if (w7.j6.a(l61Var.f28239y, 8)) {
            i10 = AndroidUtilities.dp(10.0f);
        } else {
            i10 = 0;
        }
        q31Var.L = i10;
        if (i71Var != null && i71Var.f27322d3 && q31Var.f29789s) {
            z12 = true;
        }
        q31Var.setReorder(z12);
    }

    @Override
    public final View createView(Context context, lm0 lm0Var, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        return new q31(context, i10, g6Var);
    }
}
