package org.telegram.ui.Components;

import android.content.Context;
public final class c1 implements Runnable {
    public final int f32413a;
    public final org.telegram.ui.ActionBar.u1 f32414b;
    public final Context f32415c;

    public c1(int i7, Context context, org.telegram.ui.ActionBar.u1 u1Var) {
        this.f32413a = i7;
        this.f32414b = u1Var;
        this.f32415c = context;
    }

    @Override
    public final void run() {
        int i7 = this.f32413a;
        Context context = this.f32415c;
        org.telegram.ui.ActionBar.u1 u1Var = this.f32414b;
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
