package org.telegram.ui.Components;

import android.content.Context;
public final class l1 implements Runnable {
    public final int f36951a;
    public final org.telegram.ui.ActionBar.u1 f36952b;
    public final Context f36953c;

    public l1(int i7, Context context, org.telegram.ui.ActionBar.u1 u1Var) {
        this.f36951a = i7;
        this.f36952b = u1Var;
        this.f36953c = context;
    }

    @Override
    public final void run() {
        int i7 = this.f36951a;
        Context context = this.f36953c;
        org.telegram.ui.ActionBar.u1 u1Var = this.f36952b;
        switch (i7) {
            case 0:
                if (u1Var != null) {
                    u1Var.dismiss();
                }
                vf.c.t(context, org.telegram.messenger.gd.M0(2131752884, null));
                return;
            default:
                if (u1Var != null) {
                    u1Var.dismiss();
                }
                vf.c.t(context, org.telegram.messenger.gd.M0(2131752884, null));
                return;
        }
    }
}
