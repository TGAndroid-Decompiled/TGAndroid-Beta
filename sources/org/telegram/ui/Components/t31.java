package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class t31 extends f61 {
    public static final int f30962a = 0;

    static {
        f61.setup(new f61());
    }

    @Override
    public final void bindView(View view, g61 g61Var, boolean z10, u61 u61Var, c71 c71Var) {
        boolean z11;
        u31 u31Var = (u31) view;
        boolean z12 = false;
        if (g61Var.f26680r) {
            u31Var.e();
        } else {
            Object obj = g61Var.G;
            if (obj == null) {
                if (g61Var.B == -2) {
                    u31Var.b(g61Var.f26679q, g61Var.f26668e);
                } else {
                    if ((g61Var.f26686y & 1) != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    u31Var.c(z11, g61Var.f26679q, g61Var.f26668e);
                }
            } else if (obj instanceof TLRPC.TL_forumTopic) {
                if (!g61Var.I) {
                    u31Var.f((TLRPC.TL_forumTopic) obj, g61Var.f26668e);
                } else {
                    u31Var.a(g61Var.f26685x, (TLRPC.TL_forumTopic) obj, g61Var.f26668e);
                }
            }
        }
        if (c71Var != null && c71Var.j3 && u31Var.f31290y) {
            z12 = true;
        }
        u31Var.setReorder(z12);
    }

    @Override
    public final View createView(Context context, zl0 zl0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new u31(context, i10, d6Var);
    }
}
