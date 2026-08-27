package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

public final class x11 extends m41 {

    public static final int f34440a = 0;

    static {
        m41.setup(new x11());
    }

    @Override
    public final void bindView(View view, n41 n41Var, boolean z10, b51 b51Var, k51 k51Var) {
        y11 y11Var = (y11) view;
        boolean z11 = false;
        if (n41Var.f30850r) {
            y11Var.f();
        } else {
            Object obj = n41Var.G;
            if (obj == null) {
                if (n41Var.d == -2) {
                    y11Var.c();
                } else {
                    y11Var.d((n41Var.f30856y & 1) != 0, n41Var.f30849q, n41Var.f30838e);
                }
            } else if (obj instanceof TLRPC.TL_forumTopic) {
                if (n41Var.I) {
                    y11Var.b(n41Var.f30855x, (TLRPC.TL_forumTopic) obj, n41Var.f30838e);
                } else {
                    y11Var.g(n41Var.f30855x, (TLRPC.TL_forumTopic) obj, n41Var.f30838e);
                }
            }
        }
        y11Var.H = h7.a8.a(n41Var.f30856y, 8) ? AndroidUtilities.dp(10.0f) : 0;
        if (k51Var != null && k51Var.Y2 && y11Var.f34785s) {
            z11 = true;
        }
        y11Var.setReorder(z11);
    }

    @Override
    public final View createView(Context context, zk0 zk0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        return new y11(context, i10, c6Var);
    }
}
