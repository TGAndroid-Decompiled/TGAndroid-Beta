package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class w31 extends l61 {
    public static final int f30462a = 0;

    static {
        l61.setup(new l61());
    }

    @Override
    public final void bindView(View view, m61 m61Var, boolean z10, a71 a71Var, i71 i71Var) {
        boolean z11;
        x31 x31Var = (x31) view;
        boolean z12 = false;
        if (m61Var.f26952r) {
            x31Var.e();
        } else {
            Object obj = m61Var.G;
            if (obj == null) {
                if (m61Var.B == -2) {
                    x31Var.b(m61Var.f26951q, m61Var.e);
                } else {
                    if ((m61Var.f26958y & 1) != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    x31Var.c(z11, m61Var.f26951q, m61Var.e);
                }
            } else if (obj instanceof TLRPC.TL_forumTopic) {
                if (!m61Var.I) {
                    x31Var.f((TLRPC.TL_forumTopic) obj, m61Var.e);
                } else {
                    x31Var.a(m61Var.f26957x, (TLRPC.TL_forumTopic) obj, m61Var.e);
                }
            }
        }
        if (i71Var != null && i71Var.f25575a3 && x31Var.f30861y) {
            z12 = true;
        }
        x31Var.setReorder(z12);
    }

    @Override
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        return new x31(context, i10, c6Var);
    }
}
