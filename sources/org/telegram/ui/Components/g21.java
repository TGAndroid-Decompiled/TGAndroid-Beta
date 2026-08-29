package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class g21 extends v41 {
    public static final int f28738a = 0;

    static {
        v41.setup(new v41());
    }

    @Override
    public final void bindView(View view, w41 w41Var, boolean z10, k51 k51Var, u51 u51Var) {
        boolean z11;
        int i10;
        h21 h21Var = (h21) view;
        boolean z12 = false;
        if (w41Var.f34306r) {
            h21Var.f();
        } else {
            Object obj = w41Var.G;
            if (obj == null) {
                if (w41Var.d == -2) {
                    h21Var.c();
                } else {
                    if ((w41Var.f34312y & 1) != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    h21Var.d(z11, w41Var.f34305q, w41Var.f34294e);
                }
            } else if (obj instanceof TLRPC.TL_forumTopic) {
                if (!w41Var.I) {
                    h21Var.g(w41Var.f34311x, (TLRPC.TL_forumTopic) obj, w41Var.f34294e);
                } else {
                    h21Var.b(w41Var.f34311x, (TLRPC.TL_forumTopic) obj, w41Var.f34294e);
                }
            }
        }
        if (i7.n8.a(w41Var.f34312y, 8)) {
            i10 = AndroidUtilities.dp(10.0f);
        } else {
            i10 = 0;
        }
        h21Var.H = i10;
        if (u51Var != null && u51Var.Y2 && h21Var.f29044s) {
            z12 = true;
        }
        h21Var.setReorder(z12);
    }

    @Override
    public final View createView(Context context, jl0 jl0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        return new h21(context, i10, c6Var);
    }
}
