package org.telegram.ui.Components;

import android.content.Context;
public final class c1 implements Runnable {
    public final int f32496a;
    public final org.telegram.ui.ActionBar.s1 f32497b;
    public final Context f32498c;

    public c1(int i3, Context context, org.telegram.ui.ActionBar.s1 s1Var) {
        this.f32496a = i3;
        this.f32497b = s1Var;
        this.f32498c = context;
    }

    @Override
    public final void run() {
        int i3 = this.f32496a;
        Context context = this.f32498c;
        org.telegram.ui.ActionBar.s1 s1Var = this.f32497b;
        switch (i3) {
            case 0:
                if (s1Var != null) {
                    s1Var.dismiss();
                }
                sf.c.t(context, org.telegram.messenger.bd.M0(2131752895, null));
                return;
            default:
                if (s1Var != null) {
                    s1Var.dismiss();
                }
                sf.c.t(context, org.telegram.messenger.bd.M0(2131752895, null));
                return;
        }
    }
}
