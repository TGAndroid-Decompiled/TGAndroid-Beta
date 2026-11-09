package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class h11 extends x31 {
    public static final int f34150b = 0;

    static {
        x31.h(new x31());
    }

    @Override
    public final void b(View view, y31 y31Var, boolean z9, m41 m41Var, r41 r41Var) {
        boolean z10;
        int i7;
        i11 i11Var = (i11) view;
        boolean z11 = false;
        if (y31Var.f40574r) {
            i11Var.f();
        } else {
            Object obj = y31Var.G;
            if (obj == null) {
                if (y31Var.d == -2) {
                    i11Var.c();
                } else {
                    if ((y31Var.f40580y & 1) != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    i11Var.d(z10, y31Var.f40573q, y31Var.f40562e);
                }
            } else if (obj instanceof TLRPC.TL_forumTopic) {
                if (!y31Var.I) {
                    i11Var.g(y31Var.f40579x, (TLRPC.TL_forumTopic) obj, y31Var.f40562e);
                } else {
                    i11Var.b(y31Var.f40579x, (TLRPC.TL_forumTopic) obj, y31Var.f40562e);
                }
            }
        }
        if (c8.zc.a(y31Var.f40580y, 8)) {
            i7 = org.telegram.messenger.g0.L(10.0f);
        } else {
            i7 = 0;
        }
        i11Var.L = i7;
        if (r41Var != null && r41Var.j3 && i11Var.f34527s) {
            z11 = true;
        }
        i11Var.setReorder(z11);
    }

    @Override
    public final View d(Context context, qj0 qj0Var, int i7, org.telegram.ui.ActionBar.g6 g6Var) {
        return new i11(i7, context, g6Var);
    }
}
