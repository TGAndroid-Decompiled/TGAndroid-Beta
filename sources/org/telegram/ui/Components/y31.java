package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class y31 extends s61 {
    public static final int f34918a = 0;

    static {
        s61.setup(new s61());
    }

    @Override
    public final void bindView(View view, t61 t61Var, boolean z10, j71 j71Var, r71 r71Var) {
        boolean z11;
        int i10;
        z31 z31Var = (z31) view;
        boolean z12 = false;
        if (t61Var.f32878r) {
            z31Var.f();
        } else {
            Object obj = t61Var.G;
            if (obj == null) {
                if (t61Var.d == -2) {
                    z31Var.c();
                } else {
                    if ((t61Var.f32884y & 1) != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    z31Var.d(z11, t61Var.f32877q, t61Var.e);
                }
            } else if (obj instanceof TLRPC.TL_forumTopic) {
                if (!t61Var.I) {
                    z31Var.g(t61Var.f32883x, (TLRPC.TL_forumTopic) obj, t61Var.e);
                } else {
                    z31Var.b(t61Var.f32883x, (TLRPC.TL_forumTopic) obj, t61Var.e);
                }
            }
        }
        if (a8.pf.a(t61Var.f32884y, 8)) {
            i10 = AndroidUtilities.dp(10.0f);
        } else {
            i10 = 0;
        }
        z31Var.L = i10;
        if (r71Var != null && r71Var.f32154k3 && z31Var.f35201s) {
            z12 = true;
        }
        z31Var.setReorder(z12);
    }

    @Override
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.u6 u6Var) {
        return new z31(context, i10, u6Var);
    }
}
