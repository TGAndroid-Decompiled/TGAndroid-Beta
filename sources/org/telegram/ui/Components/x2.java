package org.telegram.ui.Components;

import android.content.Context;
import android.content.DialogInterface;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class x2 implements DialogInterface.OnClickListener {
    public final int f30454a;
    public final Object f30455b;
    public final Object f30456c;
    public final Object d;
    public final Object e;

    public x2(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f30454a = i10;
        this.f30455b = obj;
        this.f30456c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        int i11;
        switch (this.f30454a) {
            case 0:
                Context context = (Context) this.f30456c;
                nh.b bVar = (nh.b) this.d;
                kh.t tVar = (kh.t) this.e;
                int i12 = ((int[]) this.f30455b)[i10];
                if (i12 == 100) {
                    new l4(context, i12, bVar, tVar).show();
                    return;
                } else {
                    tVar.run(Integer.valueOf(i12), "");
                    return;
                }
            default:
                org.telegram.ui.lo0 lo0Var = (org.telegram.ui.lo0) this.f30455b;
                ArrayList arrayList = (ArrayList) this.d;
                ArrayList arrayList2 = (ArrayList) this.e;
                org.telegram.ui.yn0 yn0Var = new org.telegram.ui.yn0(lo0Var, (Runnable) this.f30456c);
                TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard = lo0Var.f35845v0;
                if (tL_paymentSavedCredentialsCard == null && lo0Var.f35844u0 == null) {
                    i11 = 0;
                } else {
                    i11 = 1;
                }
                if ((tL_paymentSavedCredentialsCard == null && lo0Var.f35844u0 == null) || i10 != 0) {
                    if (i10 >= i11 && i10 < arrayList.size() + i11) {
                        TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard2 = (TLRPC.TL_paymentSavedCredentialsCard) arrayList.get(i10 - i11);
                        lo0Var.f35845v0 = tL_paymentSavedCredentialsCard2;
                        yn0Var.c(null, tL_paymentSavedCredentialsCard2.title, true, null, tL_paymentSavedCredentialsCard2);
                        return;
                    } else if (i10 < arrayList2.size() - 1) {
                        org.telegram.ui.lo0 lo0Var2 = new org.telegram.ui.lo0(lo0Var.Y0, lo0Var.f35852z0, lo0Var.K0, lo0Var.L0, 2, lo0Var.B0, lo0Var.D0, lo0Var.E0, null, lo0Var.f35844u0, lo0Var.F0, lo0Var.R0, null, lo0Var.f35836o0, lo0Var.T0);
                        lo0Var2.Z0 = lo0Var.Z0;
                        lo0Var2.f35817a1 = lo0Var.f35817a1;
                        lo0Var2.C0 = lo0Var.f35852z0.additional_methods.get((i10 - arrayList.size()) - i11);
                        lo0Var2.Q = yn0Var;
                        lo0Var.presentFragment(lo0Var2);
                        return;
                    } else if (i10 == arrayList2.size() - 1) {
                        org.telegram.ui.lo0 lo0Var3 = new org.telegram.ui.lo0(lo0Var.Y0, lo0Var.f35852z0, lo0Var.K0, lo0Var.L0, 2, lo0Var.B0, lo0Var.D0, lo0Var.E0, null, lo0Var.f35844u0, lo0Var.F0, lo0Var.R0, null, lo0Var.f35836o0, lo0Var.T0);
                        lo0Var3.Z0 = lo0Var.Z0;
                        lo0Var3.f35817a1 = lo0Var.f35817a1;
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
