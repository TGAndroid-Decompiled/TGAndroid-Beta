package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class c41 extends q61 {
    public static final int f25118a = 0;

    static {
        q61.setup(new q61());
    }

    @Override
    public final void bindView(View view, r61 r61Var, boolean z10, e71 e71Var, m71 m71Var) {
        boolean z11;
        d41 d41Var = (d41) view;
        boolean z12 = false;
        if (r61Var.f30367r) {
            d41Var.e();
        } else {
            Object obj = r61Var.G;
            if (obj == null) {
                if (r61Var.B == -2) {
                    d41Var.b(r61Var.f30366q, r61Var.f30355e);
                } else {
                    if ((r61Var.f30373y & 1) != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    d41Var.c(z11, r61Var.f30366q, r61Var.f30355e);
                }
            } else if (obj instanceof TLRPC.TL_forumTopic) {
                if (!r61Var.I) {
                    d41Var.f((TLRPC.TL_forumTopic) obj, r61Var.f30355e);
                } else {
                    d41Var.a(r61Var.f30372x, (TLRPC.TL_forumTopic) obj, r61Var.f30355e);
                }
            }
        }
        if (m71Var != null && m71Var.f28583a3 && d41Var.f25440y) {
            z12 = true;
        }
        d41Var.setReorder(z12);
    }

    @Override
    public final View createView(Context context, sm0 sm0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new d41(context, i10, d6Var);
    }
}
