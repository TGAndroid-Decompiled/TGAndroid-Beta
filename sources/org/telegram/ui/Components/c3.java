package org.telegram.ui.Components;

import android.content.Context;
import android.content.DialogInterface;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class c3 implements DialogInterface.OnClickListener {
    public final int f25217a;
    public final Object f25218b;
    public final Object f25219c;
    public final Object d;
    public final Object f25220e;

    public c3(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f25217a = i10;
        this.f25218b = obj;
        this.f25219c = obj2;
        this.d = obj3;
        this.f25220e = obj4;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        int i11;
        switch (this.f25217a) {
            case 0:
                Context context = (Context) this.f25219c;
                ai.d dVar = (ai.d) this.d;
                b3 b3Var = (b3) this.f25220e;
                int i12 = ((int[]) this.f25218b)[i10];
                if (i12 == 100) {
                    new s4(context, i12, dVar, b3Var).show();
                    return;
                } else {
                    b3Var.run(Integer.valueOf(i12), "");
                    return;
                }
            default:
                org.telegram.ui.vo0 vo0Var = (org.telegram.ui.vo0) this.f25218b;
                ArrayList arrayList = (ArrayList) this.d;
                ArrayList arrayList2 = (ArrayList) this.f25220e;
                org.telegram.ui.ho0 ho0Var = new org.telegram.ui.ho0(vo0Var, (Runnable) this.f25219c);
                TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard = vo0Var.f42951y0;
                if (tL_paymentSavedCredentialsCard == null && vo0Var.f42949x0 == null) {
                    i11 = 0;
                } else {
                    i11 = 1;
                }
                if ((tL_paymentSavedCredentialsCard == null && vo0Var.f42949x0 == null) || i10 != 0) {
                    if (i10 >= i11 && i10 < arrayList.size() + i11) {
                        TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard2 = (TLRPC.TL_paymentSavedCredentialsCard) arrayList.get(i10 - i11);
                        vo0Var.f42951y0 = tL_paymentSavedCredentialsCard2;
                        ho0Var.c(null, tL_paymentSavedCredentialsCard2.title, true, null, tL_paymentSavedCredentialsCard2);
                        return;
                    } else if (i10 < arrayList2.size() - 1) {
                        org.telegram.ui.vo0 vo0Var2 = new org.telegram.ui.vo0(vo0Var.f42916b1, vo0Var.C0, vo0Var.N0, vo0Var.O0, 2, vo0Var.E0, vo0Var.G0, vo0Var.H0, null, vo0Var.f42949x0, vo0Var.I0, vo0Var.U0, null, vo0Var.f42940r0, vo0Var.W0);
                        vo0Var2.f42919c1 = vo0Var.f42919c1;
                        vo0Var2.f42921d1 = vo0Var.f42921d1;
                        vo0Var2.F0 = vo0Var.C0.additional_methods.get((i10 - arrayList.size()) - i11);
                        vo0Var2.T = ho0Var;
                        vo0Var.presentFragment(vo0Var2);
                        return;
                    } else if (i10 == arrayList2.size() - 1) {
                        org.telegram.ui.vo0 vo0Var3 = new org.telegram.ui.vo0(vo0Var.f42916b1, vo0Var.C0, vo0Var.N0, vo0Var.O0, 2, vo0Var.E0, vo0Var.G0, vo0Var.H0, null, vo0Var.f42949x0, vo0Var.I0, vo0Var.U0, null, vo0Var.f42940r0, vo0Var.W0);
                        vo0Var3.f42919c1 = vo0Var.f42919c1;
                        vo0Var3.f42921d1 = vo0Var.f42921d1;
                        vo0Var3.T = ho0Var;
                        vo0Var.presentFragment(vo0Var3);
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }
}
