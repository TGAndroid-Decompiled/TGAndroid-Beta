package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class k11 extends w31 {
    public static final int f35162b = 0;

    static {
        w31.h(new w31());
    }

    @Override
    public final void b(View view, x31 x31Var, boolean z9, l41 l41Var, q41 q41Var) {
        boolean z10;
        l11 l11Var = (l11) view;
        boolean z11 = false;
        if (x31Var.f40186r) {
            l11Var.e();
        } else {
            Object obj = x31Var.G;
            if (obj == null) {
                if (x31Var.B == -2) {
                    l11Var.b(x31Var.f40185q, x31Var.f40174e);
                } else {
                    if ((x31Var.f40192y & 1) != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    l11Var.c(z10, x31Var.f40185q, x31Var.f40174e);
                }
            } else if (obj instanceof TLRPC.TL_forumTopic) {
                if (!x31Var.I) {
                    l11Var.f((TLRPC.TL_forumTopic) obj, x31Var.f40174e);
                } else {
                    l11Var.a(x31Var.f40191x, (TLRPC.TL_forumTopic) obj, x31Var.f40174e);
                }
            }
        }
        if (q41Var != null && q41Var.j3 && l11Var.E) {
            z11 = true;
        }
        l11Var.setReorder(z11);
    }

    @Override
    public final View d(Context context, pj0 pj0Var, int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        return new l11(i7, context, f6Var);
    }
}
