package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class d41 extends t61 {
    public static final int f27338a = 0;

    static {
        t61.setup(new t61());
    }

    @Override
    public final void bindView(View view, u61 u61Var, boolean z10, k71 k71Var, s71 s71Var) {
        boolean z11;
        e41 e41Var = (e41) view;
        boolean z12 = false;
        if (u61Var.f33255r) {
            e41Var.e();
        } else {
            Object obj = u61Var.G;
            if (obj == null) {
                if (u61Var.B == -2) {
                    e41Var.b(u61Var.f33254q, u61Var.e);
                } else {
                    if ((u61Var.f33261y & 1) != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    e41Var.c(z11, u61Var.f33254q, u61Var.e);
                }
            } else if (obj instanceof TLRPC.TL_forumTopic) {
                if (!u61Var.I) {
                    e41Var.f((TLRPC.TL_forumTopic) obj, u61Var.e);
                } else {
                    e41Var.a(u61Var.f33260x, (TLRPC.TL_forumTopic) obj, u61Var.e);
                }
            }
        }
        if (s71Var != null && s71Var.f32508k3 && e41Var.E) {
            z12 = true;
        }
        e41Var.setReorder(z12);
    }

    @Override
    public final View createView(Context context, nm0 nm0Var, int i10, int i11, org.telegram.ui.ActionBar.u6 u6Var) {
        return new e41(context, i10, u6Var);
    }
}
