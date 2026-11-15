package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class n11 extends a41 {
    public static final int f37430b = 0;

    static {
        a41.h(new a41());
    }

    @Override
    public final void b(View view, b41 b41Var, boolean z10, p41 p41Var, u41 u41Var) {
        boolean z11;
        o11 o11Var = (o11) view;
        boolean z12 = false;
        if (b41Var.f33190r) {
            o11Var.e();
        } else {
            Object obj = b41Var.G;
            if (obj == null) {
                if (b41Var.B == -2) {
                    o11Var.b(b41Var.f33189q, b41Var.f33178e);
                } else {
                    if ((b41Var.f33196y & 1) != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    o11Var.c(z11, b41Var.f33189q, b41Var.f33178e);
                }
            } else if (obj instanceof TLRPC.TL_forumTopic) {
                if (!b41Var.I) {
                    o11Var.f((TLRPC.TL_forumTopic) obj, b41Var.f33178e);
                } else {
                    o11Var.a(b41Var.f33195x, (TLRPC.TL_forumTopic) obj, b41Var.f33178e);
                }
            }
        }
        if (u41Var != null && u41Var.f39895k3 && o11Var.F) {
            z12 = true;
        }
        o11Var.setReorder(z12);
    }

    @Override
    public final View d(Context context, uj0 uj0Var, int i7, org.telegram.ui.ActionBar.e6 e6Var) {
        return new o11(i7, context, e6Var);
    }
}
