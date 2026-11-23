package org.telegram.ui.Components;

import android.content.Context;
public final class m1 implements Runnable {
    public final int f37376a;
    public final org.telegram.ui.ActionBar.t1 f37377b;
    public final Context f37378c;

    public m1(int i7, Context context, org.telegram.ui.ActionBar.t1 t1Var) {
        this.f37376a = i7;
        this.f37377b = t1Var;
        this.f37378c = context;
    }

    @Override
    public final void run() {
        int i7 = this.f37376a;
        Context context = this.f37378c;
        org.telegram.ui.ActionBar.t1 t1Var = this.f37377b;
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
