package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class z31 extends t61 {
    public static final int f35230a = 0;

    static {
        t61.setup(new t61());
    }

    @Override
    public final void bindView(View view, u61 u61Var, boolean z10, k71 k71Var, s71 s71Var) {
        boolean z11;
        int i10;
        a41 a41Var = (a41) view;
        boolean z12 = false;
        if (u61Var.f33255r) {
            a41Var.f();
        } else {
            Object obj = u61Var.G;
            if (obj == null) {
                if (u61Var.d == -2) {
                    a41Var.c();
                } else {
                    if ((u61Var.f33261y & 1) != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    a41Var.d(z11, u61Var.f33254q, u61Var.e);
                }
            } else if (obj instanceof TLRPC.TL_forumTopic) {
                if (!u61Var.I) {
                    a41Var.g(u61Var.f33260x, (TLRPC.TL_forumTopic) obj, u61Var.e);
                } else {
                    a41Var.b(u61Var.f33260x, (TLRPC.TL_forumTopic) obj, u61Var.e);
                }
            }
        }
        if (a8.pf.a(u61Var.f33261y, 8)) {
            i10 = AndroidUtilities.dp(10.0f);
        } else {
            i10 = 0;
        }
        a41Var.L = i10;
        if (s71Var != null && s71Var.f32508k3 && a41Var.f26433s) {
            z12 = true;
        }
        a41Var.setReorder(z12);
    }

    @Override
    public final View createView(Context context, nm0 nm0Var, int i10, int i11, org.telegram.ui.ActionBar.u6 u6Var) {
        return new a41(context, i10, u6Var);
    }
}
