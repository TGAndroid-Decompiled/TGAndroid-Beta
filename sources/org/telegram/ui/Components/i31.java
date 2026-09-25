package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class i31 extends u51 {
    public static final int f24936a = 0;

    static {
        u51.setup(new u51());
    }

    @Override
    public final void bindView(View view, v51 v51Var, boolean z10, j61 j61Var, r61 r61Var) {
        boolean z11;
        j31 j31Var = (j31) view;
        boolean z12 = false;
        if (v51Var.f29055r) {
            j31Var.e();
        } else {
            Object obj = v51Var.G;
            if (obj == null) {
                if (v51Var.B == -2) {
                    j31Var.b(v51Var.f29054q, v51Var.e);
                } else {
                    if ((v51Var.f29061y & 1) != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    j31Var.c(z11, v51Var.f29054q, v51Var.e);
                }
            } else if (obj instanceof TLRPC.TL_forumTopic) {
                if (!v51Var.I) {
                    j31Var.f((TLRPC.TL_forumTopic) obj, v51Var.e);
                } else {
                    j31Var.a(v51Var.f29060x, (TLRPC.TL_forumTopic) obj, v51Var.e);
                }
            }
        }
        if (r61Var != null && r61Var.f27887c3 && j31Var.f25263y) {
            z12 = true;
        }
        j31Var.setReorder(z12);
    }

    @Override
    public final View createView(Context context, wl0 wl0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new j31(context, i10, d6Var);
    }
}
