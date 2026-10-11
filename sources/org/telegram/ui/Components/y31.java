package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class y31 extends q61 {
    public static final int f33084a = 0;

    static {
        q61.setup(new q61());
    }

    @Override
    public final void bindView(View view, r61 r61Var, boolean z10, e71 e71Var, m71 m71Var) {
        boolean z11;
        int i10;
        z31 z31Var = (z31) view;
        boolean z12 = false;
        if (r61Var.f30367r) {
            z31Var.f();
        } else {
            Object obj = r61Var.G;
            if (obj == null) {
                if (r61Var.d == -2) {
                    z31Var.c();
                } else {
                    if ((r61Var.f30373y & 1) != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    z31Var.d(z11, r61Var.f30366q, r61Var.f30355e);
                }
            } else if (obj instanceof TLRPC.TL_forumTopic) {
                if (!r61Var.I) {
                    z31Var.g(r61Var.f30372x, (TLRPC.TL_forumTopic) obj, r61Var.f30355e);
                } else {
                    z31Var.b(r61Var.f30372x, (TLRPC.TL_forumTopic) obj, r61Var.f30355e);
                }
            }
        }
        if (w7.g0.a(r61Var.f30373y, 8)) {
            i10 = AndroidUtilities.dp(10.0f);
        } else {
            i10 = 0;
        }
        z31Var.L = i10;
        if (m71Var != null && m71Var.f28583a3 && z31Var.f33407s) {
            z12 = true;
        }
        z31Var.setReorder(z12);
    }

    @Override
    public final View createView(Context context, sm0 sm0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new z31(context, i10, d6Var);
    }
}
