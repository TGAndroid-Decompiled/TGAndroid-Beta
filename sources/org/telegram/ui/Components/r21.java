package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class r21 extends i51 {
    public static final int f30581a = 0;

    static {
        i51.setup(new i51());
    }

    @Override
    public final void bindView(View view, j51 j51Var, boolean z4, x51 x51Var, i61 i61Var) {
        boolean z10;
        int i10;
        s21 s21Var = (s21) view;
        boolean z11 = false;
        if (j51Var.f28020r) {
            s21Var.f();
        } else {
            Object obj = j51Var.G;
            if (obj == null) {
                if (j51Var.d == -2) {
                    s21Var.c();
                } else {
                    if ((j51Var.f28026y & 1) != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    s21Var.d(z10, j51Var.f28019q, j51Var.f28008e);
                }
            } else if (obj instanceof TLRPC.TL_forumTopic) {
                if (!j51Var.I) {
                    s21Var.g(j51Var.f28025x, (TLRPC.TL_forumTopic) obj, j51Var.f28008e);
                } else {
                    s21Var.b(j51Var.f28025x, (TLRPC.TL_forumTopic) obj, j51Var.f28008e);
                }
            }
        }
        if (k7.x8.a(j51Var.f28026y, 8)) {
            i10 = AndroidUtilities.dp(10.0f);
        } else {
            i10 = 0;
        }
        s21Var.I = i10;
        if (i61Var != null && i61Var.Z2 && s21Var.f30965s) {
            z11 = true;
        }
        s21Var.setReorder(z11);
    }

    @Override
    public final View createView(Context context, tl0 tl0Var, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        return new s21(context, i10, g6Var);
    }
}
