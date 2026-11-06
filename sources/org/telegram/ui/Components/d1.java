package org.telegram.ui.Components;

import android.content.Context;
public final class d1 implements Runnable {
    public final int f32740a;
    public final org.telegram.ui.ActionBar.u1 f32741b;
    public final Context f32742c;

    public d1(int i7, Context context, org.telegram.ui.ActionBar.u1 u1Var) {
        this.f32740a = i7;
        this.f32741b = u1Var;
        this.f32742c = context;
    }

    @Override
    public final void run() {
        int i7 = this.f32740a;
        Context context = this.f32742c;
        org.telegram.ui.ActionBar.u1 u1Var = this.f32741b;
        switch (i7) {
            case 0:
                if (u1Var != null) {
                    u1Var.dismiss();
                }
                vf.c.t(context, org.telegram.messenger.hd.M0(2131752895, null));
                return;
            default:
                if (u1Var != null) {
                    u1Var.dismiss();
                }
                vf.c.t(context, org.telegram.messenger.hd.M0(2131752895, null));
                return;
        }
    }
}
