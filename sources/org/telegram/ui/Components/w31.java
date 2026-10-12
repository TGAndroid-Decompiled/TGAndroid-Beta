package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class w31 extends k61 {
    public static final int f30787a = 0;

    static {
        k61.setup(new k61());
    }

    @Override
    public final void bindView(View view, l61 l61Var, boolean z10, z61 z61Var, h71 h71Var) {
        boolean z11;
        x31 x31Var = (x31) view;
        boolean z12 = false;
        if (l61Var.f26960r) {
            x31Var.e();
        } else {
            Object obj = l61Var.G;
            if (obj == null) {
                if (l61Var.B == -2) {
                    x31Var.b(l61Var.f26959q, l61Var.e);
                } else {
                    if ((l61Var.f26966y & 1) != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    x31Var.c(z11, l61Var.f26959q, l61Var.e);
                }
            } else if (obj instanceof TLRPC.TL_forumTopic) {
                if (!l61Var.I) {
                    x31Var.f((TLRPC.TL_forumTopic) obj, l61Var.e);
                } else {
                    x31Var.a(l61Var.f26965x, (TLRPC.TL_forumTopic) obj, l61Var.e);
                }
            }
        }
        if (h71Var != null && h71Var.f25532a3 && x31Var.f31157y) {
            z12 = true;
        }
        x31Var.setReorder(z12);
    }

    @Override
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        return new x31(context, i10, c6Var);
    }
}
