package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class s21 extends i51 {
    public static final int f27755a = 0;

    static {
        i51.setup(new i51());
    }

    @Override
    public final void bindView(View view, j51 j51Var, boolean z10, x51 x51Var, f61 f61Var) {
        boolean z11;
        int i10;
        t21 t21Var = (t21) view;
        boolean z12 = false;
        if (j51Var.f25130r) {
            t21Var.f();
        } else {
            Object obj = j51Var.G;
            if (obj == null) {
                if (j51Var.d == -2) {
                    t21Var.c();
                } else {
                    if ((j51Var.f25136y & 1) != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    t21Var.d(z11, j51Var.f25129q, j51Var.e);
                }
            } else if (obj instanceof TLRPC.TL_forumTopic) {
                if (!j51Var.I) {
                    t21Var.g(j51Var.f25135x, (TLRPC.TL_forumTopic) obj, j51Var.e);
                } else {
                    t21Var.b(j51Var.f25135x, (TLRPC.TL_forumTopic) obj, j51Var.e);
                }
            }
        }
        if (w7.c0.a(j51Var.f25136y, 8)) {
            i10 = AndroidUtilities.dp(10.0f);
        } else {
            i10 = 0;
        }
        t21Var.L = i10;
        if (f61Var != null && f61Var.f23797c3 && t21Var.f28005s) {
            z12 = true;
        }
        t21Var.setReorder(z12);
    }

    @Override
    public final View createView(Context context, ml0 ml0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new t21(context, i10, f6Var);
    }
}
