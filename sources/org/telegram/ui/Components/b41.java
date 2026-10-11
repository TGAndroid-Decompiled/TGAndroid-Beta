package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class b41 extends p61 {
    public static final int f24908a = 0;

    static {
        p61.setup(new p61());
    }

    @Override
    public final void bindView(View view, q61 q61Var, boolean z10, d71 d71Var, l71 l71Var) {
        boolean z11;
        c41 c41Var = (c41) view;
        boolean z12 = false;
        if (q61Var.f30173r) {
            c41Var.e();
        } else {
            Object obj = q61Var.G;
            if (obj == null) {
                if (q61Var.B == -2) {
                    c41Var.b(q61Var.f30172q, q61Var.f30161e);
                } else {
                    if ((q61Var.f30179y & 1) != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    c41Var.c(z11, q61Var.f30172q, q61Var.f30161e);
                }
            } else if (obj instanceof TLRPC.TL_forumTopic) {
                if (!q61Var.I) {
                    c41Var.f((TLRPC.TL_forumTopic) obj, q61Var.f30161e);
                } else {
                    c41Var.a(q61Var.f30178x, (TLRPC.TL_forumTopic) obj, q61Var.f30161e);
                }
            }
        }
        if (l71Var != null && l71Var.f28225a3 && c41Var.f25225y) {
            z12 = true;
        }
        c41Var.setReorder(z12);
    }

    @Override
    public final View createView(Context context, rm0 rm0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new c41(context, i10, d6Var);
    }
}
