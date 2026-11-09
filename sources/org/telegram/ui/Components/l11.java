package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class l11 extends x31 {
    public static final int f35553b = 0;

    static {
        x31.h(new x31());
    }

    @Override
    public final void b(View view, y31 y31Var, boolean z9, m41 m41Var, r41 r41Var) {
        boolean z10;
        m11 m11Var = (m11) view;
        boolean z11 = false;
        if (y31Var.f40574r) {
            m11Var.e();
        } else {
            Object obj = y31Var.G;
            if (obj == null) {
                if (y31Var.B == -2) {
                    m11Var.b(y31Var.f40573q, y31Var.f40562e);
                } else {
                    if ((y31Var.f40580y & 1) != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    m11Var.c(z10, y31Var.f40573q, y31Var.f40562e);
                }
            } else if (obj instanceof TLRPC.TL_forumTopic) {
                if (!y31Var.I) {
                    m11Var.f((TLRPC.TL_forumTopic) obj, y31Var.f40562e);
                } else {
                    m11Var.a(y31Var.f40579x, (TLRPC.TL_forumTopic) obj, y31Var.f40562e);
                }
            }
        }
        if (r41Var != null && r41Var.j3 && m11Var.E) {
            z11 = true;
        }
        m11Var.setReorder(z11);
    }

    @Override
    public final View d(Context context, qj0 qj0Var, int i7, org.telegram.ui.ActionBar.g6 g6Var) {
        return new m11(i7, context, g6Var);
    }
}
