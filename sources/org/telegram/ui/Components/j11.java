package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class j11 extends a41 {
    public static final int f35834b = 0;

    static {
        a41.h(new a41());
    }

    @Override
    public final void b(View view, b41 b41Var, boolean z10, p41 p41Var, u41 u41Var) {
        boolean z11;
        int i7;
        k11 k11Var = (k11) view;
        boolean z12 = false;
        if (b41Var.f33187r) {
            k11Var.f();
        } else {
            Object obj = b41Var.G;
            if (obj == null) {
                if (b41Var.d == -2) {
                    k11Var.c();
                } else {
                    if ((b41Var.f33193y & 1) != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    k11Var.d(z11, b41Var.f33186q, b41Var.f33175e);
                }
            } else if (obj instanceof TLRPC.TL_forumTopic) {
                if (!b41Var.I) {
                    k11Var.g(b41Var.f33192x, (TLRPC.TL_forumTopic) obj, b41Var.f33175e);
                } else {
                    k11Var.b(b41Var.f33192x, (TLRPC.TL_forumTopic) obj, b41Var.f33175e);
                }
            }
        }
        if (c8.zc.a(b41Var.f33193y, 8)) {
            i7 = org.telegram.messenger.g0.L(10.0f);
        } else {
            i7 = 0;
        }
        k11Var.M = i7;
        if (u41Var != null && u41Var.f39898k3 && k11Var.f36243s) {
            z12 = true;
        }
        k11Var.setReorder(z12);
    }

    @Override
    public final View d(Context context, uj0 uj0Var, int i7, org.telegram.ui.ActionBar.e6 e6Var) {
        return new k11(i7, context, e6Var);
    }
}
