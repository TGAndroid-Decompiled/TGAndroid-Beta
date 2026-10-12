package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class s31 extends k61 {
    public static final int f29013a = 0;

    static {
        k61.setup(new k61());
    }

    @Override
    public final void bindView(View view, l61 l61Var, boolean z10, z61 z61Var, h71 h71Var) {
        boolean z11;
        int i10;
        t31 t31Var = (t31) view;
        boolean z12 = false;
        if (l61Var.f26960r) {
            t31Var.f();
        } else {
            Object obj = l61Var.G;
            if (obj == null) {
                if (l61Var.d == -2) {
                    t31Var.c();
                } else {
                    if ((l61Var.f26966y & 1) != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    t31Var.d(z11, l61Var.f26959q, l61Var.e);
                }
            } else if (obj instanceof TLRPC.TL_forumTopic) {
                if (!l61Var.I) {
                    t31Var.g(l61Var.f26965x, (TLRPC.TL_forumTopic) obj, l61Var.e);
                } else {
                    t31Var.b(l61Var.f26965x, (TLRPC.TL_forumTopic) obj, l61Var.e);
                }
            }
        }
        if (w7.m6.a(l61Var.f26966y, 8)) {
            i10 = AndroidUtilities.dp(10.0f);
        } else {
            i10 = 0;
        }
        t31Var.L = i10;
        if (h71Var != null && h71Var.f25532a3 && t31Var.f29268s) {
            z12 = true;
        }
        t31Var.setReorder(z12);
    }

    @Override
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        return new t31(context, i10, c6Var);
    }
}
