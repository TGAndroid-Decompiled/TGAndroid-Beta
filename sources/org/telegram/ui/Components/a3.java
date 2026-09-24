package org.telegram.ui.Components;

import android.content.Context;
import android.content.DialogInterface;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class a3 implements DialogInterface.OnClickListener {
    public final int f22553a;
    public final Object f22554b;
    public final Object f22555c;
    public final Object d;
    public final Object e;

    public a3(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f22553a = i10;
        this.f22554b = obj;
        this.f22555c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        int i11;
        switch (this.f22553a) {
            case 0:
                Context context = (Context) this.f22555c;
                ai.d dVar = (ai.d) this.d;
                z2 z2Var = (z2) this.e;
                int i12 = ((int[]) this.f22554b)[i10];
                if (i12 == 100) {
                    new q4(context, i12, dVar, z2Var).show();
                    return;
                } else {
                    z2Var.run(Integer.valueOf(i12), "");
                    return;
                }
            default:
                org.telegram.ui.oo0 oo0Var = (org.telegram.ui.oo0) this.f22554b;
                ArrayList arrayList = (ArrayList) this.d;
                ArrayList arrayList2 = (ArrayList) this.e;
                org.telegram.ui.ao0 ao0Var = new org.telegram.ui.ao0(oo0Var, (Runnable) this.f22555c);
                TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard = oo0Var.f36300y0;
                if (tL_paymentSavedCredentialsCard == null && oo0Var.f36298x0 == null) {
                    i11 = 0;
                } else {
                    i11 = 1;
                }
                if ((tL_paymentSavedCredentialsCard == null && oo0Var.f36298x0 == null) || i10 != 0) {
                    if (i10 >= i11 && i10 < arrayList.size() + i11) {
                        TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard2 = (TLRPC.TL_paymentSavedCredentialsCard) arrayList.get(i10 - i11);
                        oo0Var.f36300y0 = tL_paymentSavedCredentialsCard2;
                        ao0Var.c(null, tL_paymentSavedCredentialsCard2.title, true, null, tL_paymentSavedCredentialsCard2);
                        return;
                    } else if (i10 < arrayList2.size() - 1) {
                        org.telegram.ui.oo0 oo0Var2 = new org.telegram.ui.oo0(oo0Var.f36266b1, oo0Var.C0, oo0Var.N0, oo0Var.O0, 2, oo0Var.E0, oo0Var.G0, oo0Var.H0, null, oo0Var.f36298x0, oo0Var.I0, oo0Var.U0, null, oo0Var.f36289r0, oo0Var.W0);
                        oo0Var2.f36269c1 = oo0Var.f36269c1;
                        oo0Var2.f36271d1 = oo0Var.f36271d1;
                        oo0Var2.F0 = oo0Var.C0.additional_methods.get((i10 - arrayList.size()) - i11);
                        oo0Var2.T = ao0Var;
                        oo0Var.presentFragment(oo0Var2);
                        return;
                    } else if (i10 == arrayList2.size() - 1) {
                        org.telegram.ui.oo0 oo0Var3 = new org.telegram.ui.oo0(oo0Var.f36266b1, oo0Var.C0, oo0Var.N0, oo0Var.O0, 2, oo0Var.E0, oo0Var.G0, oo0Var.H0, null, oo0Var.f36298x0, oo0Var.I0, oo0Var.U0, null, oo0Var.f36289r0, oo0Var.W0);
                        oo0Var3.f36269c1 = oo0Var.f36269c1;
                        oo0Var3.f36271d1 = oo0Var.f36271d1;
                        oo0Var3.T = ao0Var;
                        oo0Var.presentFragment(oo0Var3);
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }
}
