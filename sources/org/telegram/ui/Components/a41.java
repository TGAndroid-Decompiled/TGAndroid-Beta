package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class a41 extends o61 {
    public static final int f24598a = 0;

    static {
        o61.setup(new o61());
    }

    @Override
    public final void bindView(View view, p61 p61Var, boolean z10, c71 c71Var, k71 k71Var) {
        boolean z11;
        b41 b41Var = (b41) view;
        boolean z12 = false;
        if (p61Var.f29740r) {
            b41Var.e();
        } else {
            Object obj = p61Var.G;
            if (obj == null) {
                if (p61Var.B == -2) {
                    b41Var.b(p61Var.f29739q, p61Var.f29728e);
                } else {
                    if ((p61Var.f29746y & 1) != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    b41Var.c(z11, p61Var.f29739q, p61Var.f29728e);
                }
            } else if (obj instanceof TLRPC.TL_forumTopic) {
                if (!p61Var.I) {
                    b41Var.f((TLRPC.TL_forumTopic) obj, p61Var.f29728e);
                } else {
                    b41Var.a(p61Var.f29745x, (TLRPC.TL_forumTopic) obj, p61Var.f29728e);
                }
            }
        }
        if (k71Var != null && k71Var.f27866a3 && b41Var.f24901y) {
            z12 = true;
        }
        b41Var.setReorder(z12);
    }

    @Override
    public final View createView(Context context, qm0 qm0Var, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        return new b41(context, i10, e6Var);
    }
}
