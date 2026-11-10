package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class k11 extends w31 {
    public static final int f35144b = 0;

    static {
        w31.h(new w31());
    }

    @Override
    public final void b(View view, x31 x31Var, boolean z9, m41 m41Var, r41 r41Var) {
        boolean z10;
        l11 l11Var = (l11) view;
        boolean z11 = false;
        if (x31Var.f40162r) {
            l11Var.e();
        } else {
            Object obj = x31Var.G;
            if (obj == null) {
                if (x31Var.B == -2) {
                    l11Var.b(x31Var.f40161q, x31Var.f40150e);
                } else {
                    if ((x31Var.f40168y & 1) != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    l11Var.c(z10, x31Var.f40161q, x31Var.f40150e);
                }
            } else if (obj instanceof TLRPC.TL_forumTopic) {
                if (!x31Var.I) {
                    l11Var.f((TLRPC.TL_forumTopic) obj, x31Var.f40150e);
                } else {
                    l11Var.a(x31Var.f40167x, (TLRPC.TL_forumTopic) obj, x31Var.f40150e);
                }
            }
        }
        if (r41Var != null && r41Var.j3 && l11Var.E) {
            z11 = true;
        }
        l11Var.setReorder(z11);
    }

    @Override
    public final View d(Context context, pj0 pj0Var, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        return new l11(i7, context, h6Var);
    }
}
