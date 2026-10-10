package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class x31 extends p61 {
    public static final int f32833a = 0;

    static {
        p61.setup(new p61());
    }

    @Override
    public final void bindView(View view, q61 q61Var, boolean z10, d71 d71Var, l71 l71Var) {
        boolean z11;
        int i10;
        y31 y31Var = (y31) view;
        boolean z12 = false;
        if (q61Var.f30069r) {
            y31Var.f();
        } else {
            Object obj = q61Var.G;
            if (obj == null) {
                if (q61Var.d == -2) {
                    y31Var.c();
                } else {
                    if ((q61Var.f30075y & 1) != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    y31Var.d(z11, q61Var.f30068q, q61Var.f30057e);
                }
            } else if (obj instanceof TLRPC.TL_forumTopic) {
                if (!q61Var.I) {
                    y31Var.g(q61Var.f30074x, (TLRPC.TL_forumTopic) obj, q61Var.f30057e);
                } else {
                    y31Var.b(q61Var.f30074x, (TLRPC.TL_forumTopic) obj, q61Var.f30057e);
                }
            }
        }
        if (w7.g0.a(q61Var.f30075y, 8)) {
            i10 = AndroidUtilities.dp(10.0f);
        } else {
            i10 = 0;
        }
        y31Var.L = i10;
        if (l71Var != null && l71Var.f28186a3 && y31Var.f33098s) {
            z12 = true;
        }
        y31Var.setReorder(z12);
    }

    @Override
    public final View createView(Context context, rm0 rm0Var, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        return new y31(context, i10, e6Var);
    }
}
