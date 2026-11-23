package org.telegram.ui.Components;

import android.content.Context;
public final class l1 implements Runnable {
    public final int f36972a;
    public final org.telegram.ui.ActionBar.t1 f36973b;
    public final Context f36974c;

    public l1(int i7, Context context, org.telegram.ui.ActionBar.t1 t1Var) {
        this.f36972a = i7;
        this.f36973b = t1Var;
        this.f36974c = context;
    }

    @Override
    public final void run() {
        int i7 = this.f36972a;
        Context context = this.f36974c;
        org.telegram.ui.ActionBar.t1 t1Var = this.f36973b;
        switch (i7) {
            case 0:
                if (t1Var != null) {
                    t1Var.dismiss();
                }
                vf.c.t(context, org.telegram.messenger.gd.N0(2131752883, null));
                return;
            default:
                if (t1Var != null) {
                    t1Var.dismiss();
                }
                vf.c.t(context, org.telegram.messenger.gd.N0(2131752883, null));
                return;
        }
    }
}
