package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class e31 extends u51 {
    public static final int f22548a = 0;

    static {
        u51.setup(new u51());
    }

    @Override
    public final void bindView(View view, v51 v51Var, boolean z10, j61 j61Var, r61 r61Var) {
        boolean z11;
        int i10;
        f31 f31Var = (f31) view;
        boolean z12 = false;
        if (v51Var.f27835r) {
            f31Var.f();
        } else {
            Object obj = v51Var.G;
            if (obj == null) {
                if (v51Var.d == -2) {
                    f31Var.c();
                } else {
                    if ((v51Var.f27841y & 1) != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    f31Var.d(z11, v51Var.f27834q, v51Var.e);
                }
            } else if (obj instanceof TLRPC.TL_forumTopic) {
                if (!v51Var.I) {
                    f31Var.g(v51Var.f27840x, (TLRPC.TL_forumTopic) obj, v51Var.e);
                } else {
                    f31Var.b(v51Var.f27840x, (TLRPC.TL_forumTopic) obj, v51Var.e);
                }
            }
        }
        if (w7.c0.a(v51Var.f27841y, 8)) {
            i10 = AndroidUtilities.dp(10.0f);
        } else {
            i10 = 0;
        }
        f31Var.L = i10;
        if (r61Var != null && r61Var.f26606c3 && f31Var.f22841s) {
            z12 = true;
        }
        f31Var.setReorder(z12);
    }

    @Override
    public final View createView(Context context, vl0 vl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new f31(context, i10, f6Var);
    }
}
