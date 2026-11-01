package org.telegram.ui.Components;

import android.content.Context;
public final class d1 implements Runnable {
    public final int f25311a;
    public final org.telegram.ui.ActionBar.x1 f25312b;
    public final Context f25313c;

    public d1(int i10, Context context, org.telegram.ui.ActionBar.x1 x1Var) {
        this.f25311a = i10;
        this.f25312b = x1Var;
        this.f25313c = context;
    }

    @Override
    public final void run() {
        int i10 = this.f25311a;
        Context context = this.f25313c;
        org.telegram.ui.ActionBar.x1 x1Var = this.f25312b;
        switch (i10) {
            case 0:
                if (x1Var != null) {
                    x1Var.dismiss();
                }
                gf.f.r(context, org.telegram.messenger.dd.L0(2131752895, null));
                return;
            default:
                if (x1Var != null) {
                    x1Var.dismiss();
                }
                gf.f.r(context, org.telegram.messenger.dd.L0(2131752895, null));
                return;
        }
    }
}
