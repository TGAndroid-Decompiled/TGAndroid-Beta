package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class s31 extends l61 {
    public static final int f28721a = 0;

    static {
        l61.setup(new l61());
    }

    @Override
    public final void bindView(View view, m61 m61Var, boolean z10, a71 a71Var, i71 i71Var) {
        boolean z11;
        int i10;
        t31 t31Var = (t31) view;
        boolean z12 = false;
        if (m61Var.f26952r) {
            t31Var.f();
        } else {
            Object obj = m61Var.G;
            if (obj == null) {
                if (m61Var.d == -2) {
                    t31Var.c();
                } else {
                    if ((m61Var.f26958y & 1) != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    t31Var.d(z11, m61Var.f26951q, m61Var.e);
                }
            } else if (obj instanceof TLRPC.TL_forumTopic) {
                if (!m61Var.I) {
                    t31Var.g(m61Var.f26957x, (TLRPC.TL_forumTopic) obj, m61Var.e);
                } else {
                    t31Var.b(m61Var.f26957x, (TLRPC.TL_forumTopic) obj, m61Var.e);
                }
            }
        }
        if (w7.l6.a(m61Var.f26958y, 8)) {
            i10 = AndroidUtilities.dp(10.0f);
        } else {
            i10 = 0;
        }
        t31Var.L = i10;
        if (i71Var != null && i71Var.f25575a3 && t31Var.f28965s) {
            z12 = true;
        }
        t31Var.setReorder(z12);
    }

    @Override
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        return new t31(context, i10, c6Var);
    }
}
