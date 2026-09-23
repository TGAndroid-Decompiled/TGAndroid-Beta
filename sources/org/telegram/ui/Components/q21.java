package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class q21 extends g51 {
    public static final int f27209a = 0;

    static {
        g51.setup(new g51());
    }

    @Override
    public final void bindView(View view, h51 h51Var, boolean z10, v51 v51Var, d61 d61Var) {
        boolean z11;
        int i10;
        r21 r21Var = (r21) view;
        boolean z12 = false;
        if (h51Var.f24513r) {
            r21Var.f();
        } else {
            Object obj = h51Var.G;
            if (obj == null) {
                if (h51Var.d == -2) {
                    r21Var.c();
                } else {
                    if ((h51Var.f24519y & 1) != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    r21Var.d(z11, h51Var.f24512q, h51Var.e);
                }
            } else if (obj instanceof TLRPC.TL_forumTopic) {
                if (!h51Var.I) {
                    r21Var.g(h51Var.f24518x, (TLRPC.TL_forumTopic) obj, h51Var.e);
                } else {
                    r21Var.b(h51Var.f24518x, (TLRPC.TL_forumTopic) obj, h51Var.e);
                }
            }
        }
        if (w7.c0.a(h51Var.f24519y, 8)) {
            i10 = AndroidUtilities.dp(10.0f);
        } else {
            i10 = 0;
        }
        r21Var.L = i10;
        if (d61Var != null && d61Var.f23292c3 && r21Var.f27538s) {
            z12 = true;
        }
        r21Var.setReorder(z12);
    }

    @Override
    public final View createView(Context context, ml0 ml0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new r21(context, i10, d6Var);
    }
}
