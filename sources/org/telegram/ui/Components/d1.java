package org.telegram.ui.Components;

import android.content.Context;
public final class d1 implements Runnable {
    public final int f32744a;
    public final org.telegram.ui.ActionBar.u1 f32745b;
    public final Context f32746c;

    public d1(int i7, Context context, org.telegram.ui.ActionBar.u1 u1Var) {
        this.f32744a = i7;
        this.f32745b = u1Var;
        this.f32746c = context;
    }

    @Override
    public final void run() {
        int i7 = this.f32744a;
        Context context = this.f32746c;
        org.telegram.ui.ActionBar.u1 u1Var = this.f32745b;
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
