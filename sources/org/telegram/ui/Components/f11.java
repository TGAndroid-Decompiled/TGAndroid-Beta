package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class f11 extends v31 {
    public static final int f33441b = 0;

    static {
        v31.h(new v31());
    }

    @Override
    public final void b(View view, w31 w31Var, boolean z9, k41 k41Var, p41 p41Var) {
        boolean z10;
        int i7;
        g11 g11Var = (g11) view;
        boolean z11 = false;
        if (w31Var.f39836r) {
            g11Var.f();
        } else {
            Object obj = w31Var.G;
            if (obj == null) {
                if (w31Var.d == -2) {
                    g11Var.c();
                } else {
                    if ((w31Var.f39842y & 1) != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    g11Var.d(z10, w31Var.f39835q, w31Var.f39824e);
                }
            } else if (obj instanceof TLRPC.TL_forumTopic) {
                if (!w31Var.I) {
                    g11Var.g(w31Var.f39841x, (TLRPC.TL_forumTopic) obj, w31Var.f39824e);
                } else {
                    g11Var.b(w31Var.f39841x, (TLRPC.TL_forumTopic) obj, w31Var.f39824e);
                }
            }
        }
        if (c8.yc.a(w31Var.f39842y, 8)) {
            i7 = org.telegram.messenger.g0.L(10.0f);
        } else {
            i7 = 0;
        }
        g11Var.L = i7;
        if (p41Var != null && p41Var.j3 && g11Var.f33729s) {
            z11 = true;
        }
        g11Var.setReorder(z11);
    }

    @Override
    public final View d(Context context, pj0 pj0Var, int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        return new g11(i7, context, f6Var);
    }
}
