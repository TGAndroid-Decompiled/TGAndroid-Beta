package org.telegram.ui.Components;

import android.content.Context;
public final class d1 implements Runnable {
    public final int f25243a;
    public final org.telegram.ui.ActionBar.x1 f25244b;
    public final Context f25245c;

    public d1(int i10, Context context, org.telegram.ui.ActionBar.x1 x1Var) {
        this.f25243a = i10;
        this.f25244b = x1Var;
        this.f25245c = context;
    }

    @Override
    public final void run() {
        int i10 = this.f25243a;
        Context context = this.f25245c;
        org.telegram.ui.ActionBar.x1 x1Var = this.f25244b;
        switch (i10) {
            case 0:
                if (x1Var != null) {
                    x1Var.dismiss();
                }
                gf.f.r(context, org.telegram.messenger.cd.L0(2131752895, null));
                return;
            default:
                if (x1Var != null) {
                    x1Var.dismiss();
                }
                gf.f.r(context, org.telegram.messenger.cd.L0(2131752895, null));
                return;
        }
    }
}
