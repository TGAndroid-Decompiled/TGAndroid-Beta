package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class q21 extends g51 {
    public static final int f30274a = 0;

    static {
        g51.setup(new g51());
    }

    @Override
    public final void bindView(View view, h51 h51Var, boolean z4, w51 w51Var, h61 h61Var) {
        boolean z10;
        int i10;
        r21 r21Var = (r21) view;
        boolean z11 = false;
        if (h51Var.f27381r) {
            r21Var.f();
        } else {
            Object obj = h51Var.G;
            if (obj == null) {
                if (h51Var.d == -2) {
                    r21Var.c();
                } else {
                    if ((h51Var.f27387y & 1) != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    r21Var.d(z10, h51Var.f27380q, h51Var.f27369e);
                }
            } else if (obj instanceof TLRPC.TL_forumTopic) {
                if (!h51Var.I) {
                    r21Var.g(h51Var.f27386x, (TLRPC.TL_forumTopic) obj, h51Var.f27369e);
                } else {
                    r21Var.b(h51Var.f27386x, (TLRPC.TL_forumTopic) obj, h51Var.f27369e);
                }
            }
        }
        if (k7.x8.a(h51Var.f27387y, 8)) {
            i10 = AndroidUtilities.dp(10.0f);
        } else {
            i10 = 0;
        }
        r21Var.I = i10;
        if (h61Var != null && h61Var.Z2 && r21Var.f30632s) {
            z11 = true;
        }
        r21Var.setReorder(z11);
    }

    @Override
    public final View createView(Context context, sl0 sl0Var, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        return new r21(context, i10, g6Var);
    }
}
