package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class e11 extends q31 {
    public static final int f33270b = 0;

    static {
        q31.h(new q31());
    }

    @Override
    public final void b(View view, r31 r31Var, boolean z10, f41 f41Var, l41 l41Var) {
        boolean z11;
        f11 f11Var = (f11) view;
        boolean z12 = false;
        if (r31Var.f37633r) {
            f11Var.e();
        } else {
            Object obj = r31Var.G;
            if (obj == null) {
                if (r31Var.B == -2) {
                    f11Var.b(r31Var.f37632q, r31Var.f37621e);
                } else {
                    if ((r31Var.f37639y & 1) != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    f11Var.c(z11, r31Var.f37632q, r31Var.f37621e);
                }
            } else if (obj instanceof TLRPC.TL_forumTopic) {
                if (!r31Var.I) {
                    f11Var.f((TLRPC.TL_forumTopic) obj, r31Var.f37621e);
                } else {
                    f11Var.a(r31Var.f37638x, (TLRPC.TL_forumTopic) obj, r31Var.f37621e);
                }
            }
        }
        if (l41Var != null && l41Var.f35597k3 && f11Var.F) {
            z12 = true;
        }
        f11Var.setReorder(z12);
    }

    @Override
    public final View d(Context context, tj0 tj0Var, int i3, org.telegram.ui.ActionBar.e6 e6Var) {
        return new f11(i3, context, e6Var);
    }
}
