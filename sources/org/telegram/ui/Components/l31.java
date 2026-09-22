package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class l31 extends x51 {
    public static final int f25978a = 0;

    static {
        x51.setup(new x51());
    }

    @Override
    public final void bindView(View view, y51 y51Var, boolean z10, m61 m61Var, u61 u61Var) {
        boolean z11;
        m31 m31Var = (m31) view;
        boolean z12 = false;
        if (y51Var.f30524r) {
            m31Var.e();
        } else {
            Object obj = y51Var.G;
            if (obj == null) {
                if (y51Var.B == -2) {
                    m31Var.b(y51Var.f30523q, y51Var.e);
                } else {
                    if ((y51Var.f30530y & 1) != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    m31Var.c(z11, y51Var.f30523q, y51Var.e);
                }
            } else if (obj instanceof TLRPC.TL_forumTopic) {
                if (!y51Var.I) {
                    m31Var.f((TLRPC.TL_forumTopic) obj, y51Var.e);
                } else {
                    m31Var.a(y51Var.f30529x, (TLRPC.TL_forumTopic) obj, y51Var.e);
                }
            }
        }
        if (u61Var != null && u61Var.f28684c3 && m31Var.f26315y) {
            z12 = true;
        }
        m31Var.setReorder(z12);
    }

    @Override
    public final View createView(Context context, yl0 yl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new m31(context, i10, f6Var);
    }
}
