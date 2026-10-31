package org.telegram.ui.Components;

import android.content.Context;
public final class y31 implements Runnable {
    public final int f32622a;
    public final org.telegram.ui.ActionBar.z2[] f32623b;
    public final Context f32624c;

    public y31(Context context, org.telegram.ui.ActionBar.z2[] z2VarArr) {
        this.f32622a = 3;
        this.f32624c = context;
        this.f32623b = z2VarArr;
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.z2 z2Var;
        org.telegram.ui.ActionBar.k2 k2Var;
        int i10 = this.f32622a;
        org.telegram.ui.ActionBar.z2[] z2VarArr = this.f32623b;
        Context context = this.f32624c;
        switch (i10) {
            case 0:
                z2VarArr[0].dismiss();
                gf.f.r(context, org.telegram.messenger.cd.L0(2131752035, null));
                return;
            case 1:
                z2VarArr[0].dismiss();
                gf.f.t(context, org.telegram.messenger.cd.L0(2131752030, null));
                return;
            case 2:
                z2VarArr[0].dismiss();
                gf.f.r(context, org.telegram.messenger.cd.L0(2131752027, null));
                return;
            default:
                jv0 jv0Var = new jv0(context);
                if (!org.telegram.messenger.i0.Q1() && !org.telegram.messenger.i0.u1(z2VarArr[0].f21598f1) && (z2Var = z2VarArr[0]) != null && (k2Var = z2Var.f21598f1) != null) {
                    jv0Var.a0(k2Var);
                }
                jv0Var.show();
                return;
        }
    }

    public y31(org.telegram.ui.ActionBar.z2[] z2VarArr, Context context, int i10) {
        this.f32622a = i10;
        this.f32623b = z2VarArr;
        this.f32624c = context;
    }
}
