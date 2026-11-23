package org.telegram.ui.Components;

import android.content.Context;
public final class m1 implements Runnable {
    public final int f37336a;
    public final org.telegram.ui.ActionBar.t1 f37337b;
    public final Context f37338c;

    public m1(int i7, Context context, org.telegram.ui.ActionBar.t1 t1Var) {
        this.f37336a = i7;
        this.f37337b = t1Var;
        this.f37338c = context;
    }

    @Override
    public final void run() {
        int i7 = this.f37336a;
        Context context = this.f37338c;
        org.telegram.ui.ActionBar.t1 t1Var = this.f37337b;
        switch (i7) {
            case 0:
                if (t1Var != null) {
                    t1Var.dismiss();
                }
                vf.c.t(context, org.telegram.messenger.hd.N0(2131752883, null));
                return;
            default:
                if (t1Var != null) {
                    t1Var.dismiss();
                }
                vf.c.t(context, org.telegram.messenger.hd.N0(2131752883, null));
                return;
        }
    }
}
