package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class q31 extends l61 {
    public static final int f29765a = 0;

    static {
        l61.setup(new l61());
    }

    @Override
    public final void bindView(View view, m61 m61Var, boolean z10, b71 b71Var, j71 j71Var) {
        boolean z11;
        int i10;
        r31 r31Var = (r31) view;
        boolean z12 = false;
        if (m61Var.f28565r) {
            r31Var.f();
        } else {
            Object obj = m61Var.G;
            if (obj == null) {
                if (m61Var.d == -2) {
                    r31Var.c();
                } else {
                    if ((m61Var.f28571y & 1) != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    r31Var.d(z11, m61Var.f28564q, m61Var.e);
                }
            } else if (obj instanceof TLRPC.TL_forumTopic) {
                if (!m61Var.I) {
                    r31Var.g(m61Var.f28570x, (TLRPC.TL_forumTopic) obj, m61Var.e);
                } else {
                    r31Var.b(m61Var.f28570x, (TLRPC.TL_forumTopic) obj, m61Var.e);
                }
            }
        }
        if (w7.j6.a(m61Var.f28571y, 8)) {
            i10 = AndroidUtilities.dp(10.0f);
        } else {
            i10 = 0;
        }
        r31Var.L = i10;
        if (j71Var != null && j71Var.f27543d3 && r31Var.f30068s) {
            z12 = true;
        }
        r31Var.setReorder(z12);
    }

    @Override
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        return new r31(context, i10, g6Var);
    }
}
