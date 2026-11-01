package org.telegram.ui.Components;

import android.content.Context;
public final class z31 implements Runnable {
    public final int f32986a;
    public final org.telegram.ui.ActionBar.z2[] f32987b;
    public final Context f32988c;

    public z31(Context context, org.telegram.ui.ActionBar.z2[] z2VarArr) {
        this.f32986a = 3;
        this.f32988c = context;
        this.f32987b = z2VarArr;
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.z2 z2Var;
        org.telegram.ui.ActionBar.k2 k2Var;
        int i10 = this.f32986a;
        org.telegram.ui.ActionBar.z2[] z2VarArr = this.f32987b;
        Context context = this.f32988c;
        switch (i10) {
            case 0:
                z2VarArr[0].dismiss();
                gf.f.r(context, org.telegram.messenger.dd.L0(2131752035, null));
                return;
            case 1:
                z2VarArr[0].dismiss();
                gf.f.t(context, org.telegram.messenger.dd.L0(2131752030, null));
                return;
            case 2:
                z2VarArr[0].dismiss();
                gf.f.r(context, org.telegram.messenger.dd.L0(2131752027, null));
                return;
            default:
                kv0 kv0Var = new kv0(context);
                if (!org.telegram.messenger.i0.Q1() && !org.telegram.messenger.i0.u1(z2VarArr[0].f21599f1) && (z2Var = z2VarArr[0]) != null && (k2Var = z2Var.f21599f1) != null) {
                    kv0Var.a0(k2Var);
                }
                kv0Var.show();
                return;
        }
    }

    public z31(org.telegram.ui.ActionBar.z2[] z2VarArr, Context context, int i10) {
        this.f32986a = i10;
        this.f32987b = z2VarArr;
        this.f32988c = context;
    }
}
