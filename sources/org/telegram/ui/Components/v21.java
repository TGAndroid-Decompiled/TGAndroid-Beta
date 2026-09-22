package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class v21 extends h51 {
    public static final int f28572a = 0;

    static {
        h51.setup(new h51());
    }

    @Override
    public final void bindView(View view, i51 i51Var, boolean z10, w51 w51Var, e61 e61Var) {
        boolean z11;
        w21 w21Var = (w21) view;
        boolean z12 = false;
        if (i51Var.f24906r) {
            w21Var.e();
        } else {
            Object obj = i51Var.G;
            if (obj == null) {
                if (i51Var.B == -2) {
                    w21Var.b(i51Var.f24905q, i51Var.e);
                } else {
                    if ((i51Var.f24912y & 1) != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    w21Var.c(z11, i51Var.f24905q, i51Var.e);
                }
            } else if (obj instanceof TLRPC.TL_forumTopic) {
                if (!i51Var.I) {
                    w21Var.f((TLRPC.TL_forumTopic) obj, i51Var.e);
                } else {
                    w21Var.a(i51Var.f24911x, (TLRPC.TL_forumTopic) obj, i51Var.e);
                }
            }
        }
        if (e61Var != null && e61Var.f23557c3 && w21Var.f29552y) {
            z12 = true;
        }
        w21Var.setReorder(z12);
    }

    @Override
    public final View createView(Context context, ll0 ll0Var, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        return new w21(context, i10, e6Var);
    }
}
