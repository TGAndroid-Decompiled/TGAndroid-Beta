package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class c41 extends s61 {
    public static final int f27072a = 0;

    static {
        s61.setup(new s61());
    }

    @Override
    public final void bindView(View view, t61 t61Var, boolean z10, j71 j71Var, r71 r71Var) {
        boolean z11;
        d41 d41Var = (d41) view;
        boolean z12 = false;
        if (t61Var.f32878r) {
            d41Var.e();
        } else {
            Object obj = t61Var.G;
            if (obj == null) {
                if (t61Var.B == -2) {
                    d41Var.b(t61Var.f32877q, t61Var.e);
                } else {
                    if ((t61Var.f32884y & 1) != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    d41Var.c(z11, t61Var.f32877q, t61Var.e);
                }
            } else if (obj instanceof TLRPC.TL_forumTopic) {
                if (!t61Var.I) {
                    d41Var.f((TLRPC.TL_forumTopic) obj, t61Var.e);
                } else {
                    d41Var.a(t61Var.f32883x, (TLRPC.TL_forumTopic) obj, t61Var.e);
                }
            }
        }
        if (r71Var != null && r71Var.f32154k3 && d41Var.E) {
            z12 = true;
        }
        d41Var.setReorder(z12);
    }

    @Override
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.u6 u6Var) {
        return new d41(context, i10, u6Var);
    }
}
