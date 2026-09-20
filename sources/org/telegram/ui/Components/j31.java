package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class j31 extends v51 {
    public static final int f25215a = 0;

    static {
        v51.setup(new v51());
    }

    @Override
    public final void bindView(View view, w51 w51Var, boolean z10, k61 k61Var, s61 s61Var) {
        boolean z11;
        k31 k31Var = (k31) view;
        boolean z12 = false;
        if (w51Var.f29954r) {
            k31Var.e();
        } else {
            Object obj = w51Var.G;
            if (obj == null) {
                if (w51Var.B == -2) {
                    k31Var.b(w51Var.f29953q, w51Var.e);
                } else {
                    if ((w51Var.f29960y & 1) != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    k31Var.c(z11, w51Var.f29953q, w51Var.e);
                }
            } else if (obj instanceof TLRPC.TL_forumTopic) {
                if (!w51Var.I) {
                    k31Var.f((TLRPC.TL_forumTopic) obj, w51Var.e);
                } else {
                    k31Var.a(w51Var.f29959x, (TLRPC.TL_forumTopic) obj, w51Var.e);
                }
            }
        }
        if (s61Var != null && s61Var.f28065c3 && k31Var.f25654y) {
            z12 = true;
        }
        k31Var.setReorder(z12);
    }

    @Override
    public final View createView(Context context, vl0 vl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new k31(context, i10, f6Var);
    }
}
