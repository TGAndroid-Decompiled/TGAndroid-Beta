package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class f41 extends t61 {
    public static final int f25889a = 0;

    static {
        t61.setup(new t61());
    }

    @Override
    public final void bindView(View view, u61 u61Var, boolean z10, h71 h71Var, p71 p71Var) {
        boolean z11;
        g41 g41Var = (g41) view;
        boolean z12 = false;
        if (u61Var.f31077r) {
            g41Var.e();
        } else {
            Object obj = u61Var.G;
            if (obj == null) {
                if (u61Var.B == -2) {
                    g41Var.b(u61Var.f31076q, u61Var.f31065e);
                } else {
                    if ((u61Var.f31083y & 1) != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    g41Var.c(z11, u61Var.f31076q, u61Var.f31065e);
                }
            } else if (obj instanceof TLRPC.TL_forumTopic) {
                if (!u61Var.I) {
                    g41Var.f((TLRPC.TL_forumTopic) obj, u61Var.f31065e);
                } else {
                    g41Var.a(u61Var.f31082x, (TLRPC.TL_forumTopic) obj, u61Var.f31065e);
                }
            }
        }
        if (p71Var != null && p71Var.f29442a3 && g41Var.f26277y) {
            z12 = true;
        }
        g41Var.setReorder(z12);
    }

    @Override
    public final View createView(Context context, wm0 wm0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        return new g41(context, i10, c6Var);
    }
}
