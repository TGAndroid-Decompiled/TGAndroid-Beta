package org.telegram.ui.Components;

import android.content.Context;
public final class d1 implements Runnable {
    public final int f32822a;
    public final org.telegram.ui.ActionBar.u1 f32823b;
    public final Context f32824c;

    public d1(int i7, Context context, org.telegram.ui.ActionBar.u1 u1Var) {
        this.f32822a = i7;
        this.f32823b = u1Var;
        this.f32824c = context;
    }

    @Override
    public final void run() {
        int i7 = this.f32822a;
        Context context = this.f32824c;
        org.telegram.ui.ActionBar.u1 u1Var = this.f32823b;
        switch (i7) {
            case 0:
                if (u1Var != null) {
                    u1Var.dismiss();
                }
                vf.c.t(context, org.telegram.messenger.id.M0(2131752895, null));
                return;
            default:
                if (u1Var != null) {
                    u1Var.dismiss();
                }
                vf.c.t(context, org.telegram.messenger.id.M0(2131752895, null));
                return;
        }
    }
}
