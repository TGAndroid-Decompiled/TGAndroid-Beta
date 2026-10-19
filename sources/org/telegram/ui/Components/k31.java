package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class k31 extends f61 {
    public static final int f27694a = 0;

    static {
        f61.setup(new f61());
    }

    @Override
    public final void bindView(View view, g61 g61Var, boolean z10, t61 t61Var, b71 b71Var) {
        boolean z11;
        int i10;
        l31 l31Var = (l31) view;
        boolean z12 = false;
        if (g61Var.f26503r) {
            l31Var.f();
        } else {
            Object obj = g61Var.G;
            if (obj == null) {
                if (g61Var.d == -2) {
                    l31Var.c();
                } else {
                    if ((g61Var.f26509y & 1) != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    l31Var.d(z11, g61Var.f26502q, g61Var.e);
                }
            } else if (obj instanceof TLRPC.TL_forumTopic) {
                if (!g61Var.I) {
                    l31Var.g(g61Var.f26508x, (TLRPC.TL_forumTopic) obj, g61Var.e);
                } else {
                    l31Var.b(g61Var.f26508x, (TLRPC.TL_forumTopic) obj, g61Var.e);
                }
            }
        }
        if (w7.j6.a(g61Var.f26509y, 8)) {
            i10 = AndroidUtilities.dp(10.0f);
        } else {
            i10 = 0;
        }
        l31Var.L = i10;
        if (b71Var != null && b71Var.f24823a3 && l31Var.f28068s) {
            z12 = true;
        }
        l31Var.setReorder(z12);
    }

    @Override
    public final View createView(Context context, im0 im0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new l31(context, i10, d6Var);
    }
}
