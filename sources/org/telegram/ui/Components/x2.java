package org.telegram.ui.Components;

import android.content.Context;
import android.content.DialogInterface;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class x2 implements DialogInterface.OnClickListener {
    public final int f32932a;
    public final Object f32933b;
    public final Object f32934c;
    public final Object d;
    public final Object f32935e;

    public x2(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f32932a = i10;
        this.f32933b = obj;
        this.f32934c = obj2;
        this.d = obj3;
        this.f32935e = obj4;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        int i11;
        switch (this.f32932a) {
            case 0:
                Context context = (Context) this.f32934c;
                oh.b bVar = (oh.b) this.d;
                lh.t tVar = (lh.t) this.f32935e;
                int i12 = ((int[]) this.f32933b)[i10];
                if (i12 == 100) {
                    new l4(context, i12, bVar, tVar).show();
                    return;
                } else {
                    tVar.run(Integer.valueOf(i12), "");
                    return;
                }
            default:
                org.telegram.ui.lo0 lo0Var = (org.telegram.ui.lo0) this.f32933b;
                ArrayList arrayList = (ArrayList) this.d;
                ArrayList arrayList2 = (ArrayList) this.f32935e;
                org.telegram.ui.yn0 yn0Var = new org.telegram.ui.yn0(lo0Var, (Runnable) this.f32934c);
                TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard = lo0Var.f38738v0;
                if (tL_paymentSavedCredentialsCard == null && lo0Var.f38737u0 == null) {
                    i11 = 0;
                } else {
                    i11 = 1;
                }
                if ((tL_paymentSavedCredentialsCard == null && lo0Var.f38737u0 == null) || i10 != 0) {
                    if (i10 >= i11 && i10 < arrayList.size() + i11) {
                        TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard2 = (TLRPC.TL_paymentSavedCredentialsCard) arrayList.get(i10 - i11);
                        lo0Var.f38738v0 = tL_paymentSavedCredentialsCard2;
                        yn0Var.c(null, tL_paymentSavedCredentialsCard2.title, true, null, tL_paymentSavedCredentialsCard2);
                        return;
                    } else if (i10 < arrayList2.size() - 1) {
                        org.telegram.ui.lo0 lo0Var2 = new org.telegram.ui.lo0(lo0Var.Y0, lo0Var.f38745z0, lo0Var.K0, lo0Var.L0, 2, lo0Var.B0, lo0Var.D0, lo0Var.E0, null, lo0Var.f38737u0, lo0Var.F0, lo0Var.R0, null, lo0Var.f38729o0, lo0Var.T0);
                        lo0Var2.Z0 = lo0Var.Z0;
                        lo0Var2.f38709a1 = lo0Var.f38709a1;
                        lo0Var2.C0 = lo0Var.f38745z0.additional_methods.get((i10 - arrayList.size()) - i11);
                        lo0Var2.Q = yn0Var;
                        lo0Var.presentFragment(lo0Var2);
                        return;
                    } else if (i10 == arrayList2.size() - 1) {
                        org.telegram.ui.lo0 lo0Var3 = new org.telegram.ui.lo0(lo0Var.Y0, lo0Var.f38745z0, lo0Var.K0, lo0Var.L0, 2, lo0Var.B0, lo0Var.D0, lo0Var.E0, null, lo0Var.f38737u0, lo0Var.F0, lo0Var.R0, null, lo0Var.f38729o0, lo0Var.T0);
                        lo0Var3.Z0 = lo0Var.Z0;
                        lo0Var3.f38709a1 = lo0Var.f38709a1;
                        lo0Var3.Q = yn0Var;
                        lo0Var.presentFragment(lo0Var3);
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }
}
