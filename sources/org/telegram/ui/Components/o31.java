package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class o31 extends e61 {
    public static final int f28883a = 0;

    static {
        e61.setup(new e61());
    }

    @Override
    public final void bindView(View view, f61 f61Var, boolean z10, s61 s61Var, a71 a71Var) {
        boolean z11;
        p31 p31Var = (p31) view;
        boolean z12 = false;
        if (f61Var.f26146r) {
            p31Var.e();
        } else {
            Object obj = f61Var.G;
            if (obj == null) {
                if (f61Var.B == -2) {
                    p31Var.b(f61Var.f26145q, f61Var.e);
                } else {
                    if ((f61Var.f26152y & 1) != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    p31Var.c(z11, f61Var.f26145q, f61Var.e);
                }
            } else if (obj instanceof TLRPC.TL_forumTopic) {
                if (!f61Var.I) {
                    p31Var.f((TLRPC.TL_forumTopic) obj, f61Var.e);
                } else {
                    p31Var.a(f61Var.f26151x, (TLRPC.TL_forumTopic) obj, f61Var.e);
                }
            }
        }
        if (a71Var != null && a71Var.f24513a3 && p31Var.f29164y) {
            z12 = true;
        }
        p31Var.setReorder(z12);
    }

    @Override
    public final View createView(Context context, im0 im0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new p31(context, i10, d6Var);
    }
}
