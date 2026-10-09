package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class w31 extends o61 {
    public static final int f32540a = 0;

    static {
        o61.setup(new o61());
    }

    @Override
    public final void bindView(View view, p61 p61Var, boolean z10, c71 c71Var, k71 k71Var) {
        boolean z11;
        int i10;
        x31 x31Var = (x31) view;
        boolean z12 = false;
        if (p61Var.f29740r) {
            x31Var.f();
        } else {
            Object obj = p61Var.G;
            if (obj == null) {
                if (p61Var.d == -2) {
                    x31Var.c();
                } else {
                    if ((p61Var.f29746y & 1) != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    x31Var.d(z11, p61Var.f29739q, p61Var.f29728e);
                }
            } else if (obj instanceof TLRPC.TL_forumTopic) {
                if (!p61Var.I) {
                    x31Var.g(p61Var.f29745x, (TLRPC.TL_forumTopic) obj, p61Var.f29728e);
                } else {
                    x31Var.b(p61Var.f29745x, (TLRPC.TL_forumTopic) obj, p61Var.f29728e);
                }
            }
        }
        if (w7.g0.a(p61Var.f29746y, 8)) {
            i10 = AndroidUtilities.dp(10.0f);
        } else {
            i10 = 0;
        }
        x31Var.L = i10;
        if (k71Var != null && k71Var.f27866a3 && x31Var.f32740s) {
            z12 = true;
        }
        x31Var.setReorder(z12);
    }

    @Override
    public final View createView(Context context, qm0 qm0Var, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        return new x31(context, i10, e6Var);
    }
}
