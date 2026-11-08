package org.telegram.ui.Components;

import android.content.Context;
public final class d1 implements Runnable {
    public final int f32755a;
    public final org.telegram.ui.ActionBar.u1 f32756b;
    public final Context f32757c;

    public d1(int i7, Context context, org.telegram.ui.ActionBar.u1 u1Var) {
        this.f32755a = i7;
        this.f32756b = u1Var;
        this.f32757c = context;
    }

    @Override
    public final void run() {
        int i7 = this.f32755a;
        Context context = this.f32757c;
        org.telegram.ui.ActionBar.u1 u1Var = this.f32756b;
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
