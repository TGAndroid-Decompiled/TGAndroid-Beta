package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class w21 extends i51 {
    public static final int f29508a = 0;

    static {
        i51.setup(new i51());
    }

    @Override
    public final void bindView(View view, j51 j51Var, boolean z10, x51 x51Var, f61 f61Var) {
        boolean z11;
        x21 x21Var = (x21) view;
        boolean z12 = false;
        if (j51Var.f25133r) {
            x21Var.e();
        } else {
            Object obj = j51Var.G;
            if (obj == null) {
                if (j51Var.B == -2) {
                    x21Var.b(j51Var.f25132q, j51Var.e);
                } else {
                    if ((j51Var.f25139y & 1) != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    x21Var.c(z11, j51Var.f25132q, j51Var.e);
                }
            } else if (obj instanceof TLRPC.TL_forumTopic) {
                if (!j51Var.I) {
                    x21Var.f((TLRPC.TL_forumTopic) obj, j51Var.e);
                } else {
                    x21Var.a(j51Var.f25138x, (TLRPC.TL_forumTopic) obj, j51Var.e);
                }
            }
        }
        if (f61Var != null && f61Var.f23800c3 && x21Var.f29841y) {
            z12 = true;
        }
        x21Var.setReorder(z12);
    }

    @Override
    public final View createView(Context context, ml0 ml0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new x21(context, i10, f6Var);
    }
}
