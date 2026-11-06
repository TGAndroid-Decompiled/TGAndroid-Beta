package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class e11 extends q31 {
    public static final int f33095b = 0;

    static {
        q31.h(new q31());
    }

    @Override
    public final void b(View view, r31 r31Var, boolean z9, f41 f41Var, k41 k41Var) {
        boolean z10;
        f11 f11Var = (f11) view;
        boolean z11 = false;
        if (r31Var.f37604r) {
            f11Var.e();
        } else {
            Object obj = r31Var.G;
            if (obj == null) {
                if (r31Var.B == -2) {
                    f11Var.b(r31Var.f37603q, r31Var.f37592e);
                } else {
                    if ((r31Var.f37610y & 1) != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    f11Var.c(z10, r31Var.f37603q, r31Var.f37592e);
                }
            } else if (obj instanceof TLRPC.TL_forumTopic) {
                if (!r31Var.I) {
                    f11Var.f((TLRPC.TL_forumTopic) obj, r31Var.f37592e);
                } else {
                    f11Var.a(r31Var.f37609x, (TLRPC.TL_forumTopic) obj, r31Var.f37592e);
                }
            }
        }
        if (k41Var != null && k41Var.j3 && f11Var.E) {
            z11 = true;
        }
        f11Var.setReorder(z11);
    }

    @Override
    public final View d(Context context, pj0 pj0Var, int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        return new f11(i7, context, f6Var);
    }
}
