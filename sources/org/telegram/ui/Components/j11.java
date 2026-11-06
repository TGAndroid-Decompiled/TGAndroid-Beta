package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class j11 extends v31 {
    public static final int f34819b = 0;

    static {
        v31.h(new v31());
    }

    @Override
    public final void b(View view, w31 w31Var, boolean z9, k41 k41Var, p41 p41Var) {
        boolean z10;
        k11 k11Var = (k11) view;
        boolean z11 = false;
        if (w31Var.f39836r) {
            k11Var.e();
        } else {
            Object obj = w31Var.G;
            if (obj == null) {
                if (w31Var.B == -2) {
                    k11Var.b(w31Var.f39835q, w31Var.f39824e);
                } else {
                    if ((w31Var.f39842y & 1) != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    k11Var.c(z10, w31Var.f39835q, w31Var.f39824e);
                }
            } else if (obj instanceof TLRPC.TL_forumTopic) {
                if (!w31Var.I) {
                    k11Var.f((TLRPC.TL_forumTopic) obj, w31Var.f39824e);
                } else {
                    k11Var.a(w31Var.f39841x, (TLRPC.TL_forumTopic) obj, w31Var.f39824e);
                }
            }
        }
        if (p41Var != null && p41Var.j3 && k11Var.E) {
            z11 = true;
        }
        k11Var.setReorder(z11);
    }

    @Override
    public final View d(Context context, pj0 pj0Var, int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        return new k11(i7, context, f6Var);
    }
}
