package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class g11 extends w31 {
    public static final int f33791b = 0;

    static {
        w31.h(new w31());
    }

    @Override
    public final void b(View view, x31 x31Var, boolean z9, l41 l41Var, q41 q41Var) {
        boolean z10;
        int i7;
        h11 h11Var = (h11) view;
        boolean z11 = false;
        if (x31Var.f40186r) {
            h11Var.f();
        } else {
            Object obj = x31Var.G;
            if (obj == null) {
                if (x31Var.d == -2) {
                    h11Var.c();
                } else {
                    if ((x31Var.f40192y & 1) != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    h11Var.d(z10, x31Var.f40185q, x31Var.f40174e);
                }
            } else if (obj instanceof TLRPC.TL_forumTopic) {
                if (!x31Var.I) {
                    h11Var.g(x31Var.f40191x, (TLRPC.TL_forumTopic) obj, x31Var.f40174e);
                } else {
                    h11Var.b(x31Var.f40191x, (TLRPC.TL_forumTopic) obj, x31Var.f40174e);
                }
            }
        }
        if (c8.zc.a(x31Var.f40192y, 8)) {
            i7 = org.telegram.messenger.g0.L(10.0f);
        } else {
            i7 = 0;
        }
        h11Var.L = i7;
        if (q41Var != null && q41Var.j3 && h11Var.f34088s) {
            z11 = true;
        }
        h11Var.setReorder(z11);
    }

    @Override
    public final View d(Context context, pj0 pj0Var, int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        return new h11(i7, context, f6Var);
    }
}
