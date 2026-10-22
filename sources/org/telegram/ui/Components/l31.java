package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class l31 extends g61 {
    public static final int f28015a = 0;

    static {
        g61.setup(new g61());
    }

    @Override
    public final void bindView(View view, h61 h61Var, boolean z10, u61 u61Var, c71 c71Var) {
        boolean z11;
        int i10;
        m31 m31Var = (m31) view;
        boolean z12 = false;
        if (h61Var.f26791r) {
            m31Var.f();
        } else {
            Object obj = h61Var.G;
            if (obj == null) {
                if (h61Var.d == -2) {
                    m31Var.c();
                } else {
                    if ((h61Var.f26797y & 1) != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    m31Var.d(z11, h61Var.f26790q, h61Var.e);
                }
            } else if (obj instanceof TLRPC.TL_forumTopic) {
                if (!h61Var.I) {
                    m31Var.g(h61Var.f26796x, (TLRPC.TL_forumTopic) obj, h61Var.e);
                } else {
                    m31Var.b(h61Var.f26796x, (TLRPC.TL_forumTopic) obj, h61Var.e);
                }
            }
        }
        if (w7.j6.a(h61Var.f26797y, 8)) {
            i10 = AndroidUtilities.dp(10.0f);
        } else {
            i10 = 0;
        }
        m31Var.L = i10;
        if (c71Var != null && c71Var.f25121a3 && m31Var.f28378s) {
            z12 = true;
        }
        m31Var.setReorder(z12);
    }

    @Override
    public final View createView(Context context, jm0 jm0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new m31(context, i10, d6Var);
    }
}
