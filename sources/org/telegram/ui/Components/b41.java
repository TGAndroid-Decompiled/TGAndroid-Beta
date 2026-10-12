package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class b41 extends t61 {
    public static final int f24566a = 0;

    static {
        t61.setup(new t61());
    }

    @Override
    public final void bindView(View view, u61 u61Var, boolean z10, h71 h71Var, p71 p71Var) {
        boolean z11;
        int i10;
        c41 c41Var = (c41) view;
        boolean z12 = false;
        if (u61Var.f31082r) {
            c41Var.f();
        } else {
            Object obj = u61Var.G;
            if (obj == null) {
                if (u61Var.d == -2) {
                    c41Var.c();
                } else {
                    if ((u61Var.f31088y & 1) != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    c41Var.d(z11, u61Var.f31081q, u61Var.f31070e);
                }
            } else if (obj instanceof TLRPC.TL_forumTopic) {
                if (!u61Var.I) {
                    c41Var.g(u61Var.f31087x, (TLRPC.TL_forumTopic) obj, u61Var.f31070e);
                } else {
                    c41Var.b(u61Var.f31087x, (TLRPC.TL_forumTopic) obj, u61Var.f31070e);
                }
            }
        }
        if (w7.f0.a(u61Var.f31088y, 8)) {
            i10 = AndroidUtilities.dp(10.0f);
        } else {
            i10 = 0;
        }
        c41Var.L = i10;
        if (p71Var != null && p71Var.f29439a3 && c41Var.f24814s) {
            z12 = true;
        }
        c41Var.setReorder(z12);
    }

    @Override
    public final View createView(Context context, wm0 wm0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        return new c41(context, i10, c6Var);
    }
}
