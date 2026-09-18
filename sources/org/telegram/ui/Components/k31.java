package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class k31 extends w51 {
    public static final int f25574a = 0;

    static {
        w51.setup(new w51());
    }

    @Override
    public final void bindView(View view, x51 x51Var, boolean z10, l61 l61Var, t61 t61Var) {
        boolean z11;
        l31 l31Var = (l31) view;
        boolean z12 = false;
        if (x51Var.f30254r) {
            l31Var.e();
        } else {
            Object obj = x51Var.G;
            if (obj == null) {
                if (x51Var.B == -2) {
                    l31Var.b(x51Var.f30253q, x51Var.e);
                } else {
                    if ((x51Var.f30260y & 1) != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    l31Var.c(z11, x51Var.f30253q, x51Var.e);
                }
            } else if (obj instanceof TLRPC.TL_forumTopic) {
                if (!x51Var.I) {
                    l31Var.f((TLRPC.TL_forumTopic) obj, x51Var.e);
                } else {
                    l31Var.a(x51Var.f30259x, (TLRPC.TL_forumTopic) obj, x51Var.e);
                }
            }
        }
        if (t61Var != null && t61Var.f28336c3 && l31Var.f26013y) {
            z12 = true;
        }
        l31Var.setReorder(z12);
    }

    @Override
    public final View createView(Context context, wl0 wl0Var, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        return new l31(context, i10, e6Var);
    }
}
