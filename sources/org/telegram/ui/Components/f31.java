package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class f31 extends v51 {
    public static final int f23995a = 0;

    static {
        v51.setup(new v51());
    }

    @Override
    public final void bindView(View view, w51 w51Var, boolean z10, k61 k61Var, s61 s61Var) {
        boolean z11;
        int i10;
        g31 g31Var = (g31) view;
        boolean z12 = false;
        if (w51Var.f29954r) {
            g31Var.f();
        } else {
            Object obj = w51Var.G;
            if (obj == null) {
                if (w51Var.d == -2) {
                    g31Var.c();
                } else {
                    if ((w51Var.f29960y & 1) != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    g31Var.d(z11, w51Var.f29953q, w51Var.e);
                }
            } else if (obj instanceof TLRPC.TL_forumTopic) {
                if (!w51Var.I) {
                    g31Var.g(w51Var.f29959x, (TLRPC.TL_forumTopic) obj, w51Var.e);
                } else {
                    g31Var.b(w51Var.f29959x, (TLRPC.TL_forumTopic) obj, w51Var.e);
                }
            }
        }
        if (w7.d0.a(w51Var.f29960y, 8)) {
            i10 = AndroidUtilities.dp(10.0f);
        } else {
            i10 = 0;
        }
        g31Var.L = i10;
        if (s61Var != null && s61Var.f28065c3 && g31Var.f24246s) {
            z12 = true;
        }
        g31Var.setReorder(z12);
    }

    @Override
    public final View createView(Context context, vl0 vl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new g31(context, i10, f6Var);
    }
}
