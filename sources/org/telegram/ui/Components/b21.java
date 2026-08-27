package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;

public final class b21 extends m41 {

    public static final int f26896a = 0;

    static {
        m41.setup(new b21());
    }

    @Override
    public final void bindView(View view, n41 n41Var, boolean z10, b51 b51Var, k51 k51Var) {
        c21 c21Var = (c21) view;
        boolean z11 = false;
        if (n41Var.f30850r) {
            c21Var.e();
        } else {
            Object obj = n41Var.G;
            if (obj == null) {
                if (n41Var.B == -2) {
                    c21Var.b(n41Var.f30849q, n41Var.f30838e);
                } else {
                    c21Var.c((n41Var.f30856y & 1) != 0, n41Var.f30849q, n41Var.f30838e);
                }
            } else if (obj instanceof TLRPC.TL_forumTopic) {
                if (n41Var.I) {
                    c21Var.a(n41Var.f30855x, (TLRPC.TL_forumTopic) obj, n41Var.f30838e);
                } else {
                    c21Var.f((TLRPC.TL_forumTopic) obj, n41Var.f30838e);
                }
            }
        }
        if (k51Var != null && k51Var.Y2 && c21Var.f27311y) {
            z11 = true;
        }
        c21Var.setReorder(z11);
    }

    @Override
    public final View createView(Context context, zk0 zk0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        return new c21(context, i10, c6Var);
    }
}
