package org.telegram.ui.Components;

import android.content.Context;
public final class a1 implements Runnable {
    public final int f32813a;
    public final org.telegram.ui.ActionBar.t1 f32814b;
    public final Context f32815c;

    public a1(int i7, Context context, org.telegram.ui.ActionBar.t1 t1Var) {
        this.f32813a = i7;
        this.f32814b = t1Var;
        this.f32815c = context;
    }

    @Override
    public final void run() {
        int i7 = this.f32813a;
        Context context = this.f32815c;
        org.telegram.ui.ActionBar.t1 t1Var = this.f32814b;
        switch (i7) {
            case 0:
                if (t1Var != null) {
                    t1Var.dismiss();
                }
                vf.c.t(context, org.telegram.messenger.hd.M0(2131752895, null));
                return;
            default:
                if (t1Var != null) {
                    t1Var.dismiss();
                }
                vf.c.t(context, org.telegram.messenger.hd.M0(2131752895, null));
                return;
        }
    }
}
