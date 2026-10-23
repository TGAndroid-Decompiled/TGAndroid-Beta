package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class u31 extends l61 {
    public static final int f31072a = 0;

    static {
        l61.setup(new l61());
    }

    @Override
    public final void bindView(View view, m61 m61Var, boolean z10, b71 b71Var, j71 j71Var) {
        boolean z11;
        v31 v31Var = (v31) view;
        boolean z12 = false;
        if (m61Var.f28565r) {
            v31Var.e();
        } else {
            Object obj = m61Var.G;
            if (obj == null) {
                if (m61Var.B == -2) {
                    v31Var.b(m61Var.f28564q, m61Var.e);
                } else {
                    if ((m61Var.f28571y & 1) != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    v31Var.c(z11, m61Var.f28564q, m61Var.e);
                }
            } else if (obj instanceof TLRPC.TL_forumTopic) {
                if (!m61Var.I) {
                    v31Var.f((TLRPC.TL_forumTopic) obj, m61Var.e);
                } else {
                    v31Var.a(m61Var.f28570x, (TLRPC.TL_forumTopic) obj, m61Var.e);
                }
            }
        }
        if (j71Var != null && j71Var.f27543d3 && v31Var.E) {
            z12 = true;
        }
        v31Var.setReorder(z12);
    }

    @Override
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        return new v31(context, i10, g6Var);
    }
}
