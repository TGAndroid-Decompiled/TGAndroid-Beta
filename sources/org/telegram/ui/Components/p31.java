package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class p31 extends f61 {
    public static final int f29496a = 0;

    static {
        f61.setup(new f61());
    }

    @Override
    public final void bindView(View view, g61 g61Var, boolean z10, u61 u61Var, c71 c71Var) {
        boolean z11;
        int i10;
        q31 q31Var = (q31) view;
        boolean z12 = false;
        if (g61Var.f26675r) {
            q31Var.f();
        } else {
            Object obj = g61Var.G;
            if (obj == null) {
                if (g61Var.d == -2) {
                    q31Var.c();
                } else {
                    if ((g61Var.f26681y & 1) != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    q31Var.d(z11, g61Var.f26674q, g61Var.f26663e);
                }
            } else if (obj instanceof TLRPC.TL_forumTopic) {
                if (!g61Var.I) {
                    q31Var.g(g61Var.f26680x, (TLRPC.TL_forumTopic) obj, g61Var.f26663e);
                } else {
                    q31Var.b(g61Var.f26680x, (TLRPC.TL_forumTopic) obj, g61Var.f26663e);
                }
            }
        }
        if (w7.e0.a(g61Var.f26681y, 8)) {
            i10 = AndroidUtilities.dp(10.0f);
        } else {
            i10 = 0;
        }
        q31Var.L = i10;
        if (c71Var != null && c71Var.j3 && q31Var.f29888s) {
            z12 = true;
        }
        q31Var.setReorder(z12);
    }

    @Override
    public final View createView(Context context, zl0 zl0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new q31(context, i10, d6Var);
    }
}
