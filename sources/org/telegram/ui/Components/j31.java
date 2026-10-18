package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class j31 extends e61 {
    public static final int f27412a = 0;

    static {
        e61.setup(new e61());
    }

    @Override
    public final void bindView(View view, f61 f61Var, boolean z10, s61 s61Var, a71 a71Var) {
        boolean z11;
        int i10;
        k31 k31Var = (k31) view;
        boolean z12 = false;
        if (f61Var.f26153r) {
            k31Var.f();
        } else {
            Object obj = f61Var.G;
            if (obj == null) {
                if (f61Var.d == -2) {
                    k31Var.c();
                } else {
                    if ((f61Var.f26159y & 1) != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    k31Var.d(z11, f61Var.f26152q, f61Var.e);
                }
            } else if (obj instanceof TLRPC.TL_forumTopic) {
                if (!f61Var.I) {
                    k31Var.g(f61Var.f26158x, (TLRPC.TL_forumTopic) obj, f61Var.e);
                } else {
                    k31Var.b(f61Var.f26158x, (TLRPC.TL_forumTopic) obj, f61Var.e);
                }
            }
        }
        if (w7.m6.a(f61Var.f26159y, 8)) {
            i10 = AndroidUtilities.dp(10.0f);
        } else {
            i10 = 0;
        }
        k31Var.L = i10;
        if (a71Var != null && a71Var.f24520a3 && k31Var.f27733s) {
            z12 = true;
        }
        k31Var.setReorder(z12);
    }

    @Override
    public final View createView(Context context, im0 im0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new k31(context, i10, d6Var);
    }
}
