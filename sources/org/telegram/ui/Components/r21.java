package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class r21 extends h51 {
    public static final int f27525a = 0;

    static {
        h51.setup(new h51());
    }

    @Override
    public final void bindView(View view, i51 i51Var, boolean z10, w51 w51Var, e61 e61Var) {
        boolean z11;
        int i10;
        s21 s21Var = (s21) view;
        boolean z12 = false;
        if (i51Var.f24900r) {
            s21Var.f();
        } else {
            Object obj = i51Var.G;
            if (obj == null) {
                if (i51Var.d == -2) {
                    s21Var.c();
                } else {
                    if ((i51Var.f24906y & 1) != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    s21Var.d(z11, i51Var.f24899q, i51Var.e);
                }
            } else if (obj instanceof TLRPC.TL_forumTopic) {
                if (!i51Var.I) {
                    s21Var.g(i51Var.f24905x, (TLRPC.TL_forumTopic) obj, i51Var.e);
                } else {
                    s21Var.b(i51Var.f24905x, (TLRPC.TL_forumTopic) obj, i51Var.e);
                }
            }
        }
        if (w7.c0.a(i51Var.f24906y, 8)) {
            i10 = AndroidUtilities.dp(10.0f);
        } else {
            i10 = 0;
        }
        s21Var.L = i10;
        if (e61Var != null && e61Var.f23560c3 && s21Var.f27760s) {
            z12 = true;
        }
        s21Var.setReorder(z12);
    }

    @Override
    public final View createView(Context context, ll0 ll0Var, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        return new s21(context, i10, e6Var);
    }
}
