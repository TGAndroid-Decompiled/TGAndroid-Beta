package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class a11 extends q31 {
    public static final int f31649b = 0;

    static {
        q31.h(new q31());
    }

    @Override
    public final void b(View view, r31 r31Var, boolean z9, f41 f41Var, k41 k41Var) {
        boolean z10;
        int i7;
        b11 b11Var = (b11) view;
        boolean z11 = false;
        if (r31Var.f37604r) {
            b11Var.f();
        } else {
            Object obj = r31Var.G;
            if (obj == null) {
                if (r31Var.d == -2) {
                    b11Var.c();
                } else {
                    if ((r31Var.f37610y & 1) != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    b11Var.d(z10, r31Var.f37603q, r31Var.f37592e);
                }
            } else if (obj instanceof TLRPC.TL_forumTopic) {
                if (!r31Var.I) {
                    b11Var.g(r31Var.f37609x, (TLRPC.TL_forumTopic) obj, r31Var.f37592e);
                } else {
                    b11Var.b(r31Var.f37609x, (TLRPC.TL_forumTopic) obj, r31Var.f37592e);
                }
            }
        }
        if (c8.yc.a(r31Var.f37610y, 8)) {
            i7 = org.telegram.messenger.g0.L(10.0f);
        } else {
            i7 = 0;
        }
        b11Var.L = i7;
        if (k41Var != null && k41Var.j3 && b11Var.f31974s) {
            z11 = true;
        }
        b11Var.setReorder(z11);
    }

    @Override
    public final View d(Context context, pj0 pj0Var, int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        return new b11(i7, context, f6Var);
    }
}
