package org.telegram.ui.Components;

import android.content.Context;
import android.content.DialogInterface;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class c3 implements DialogInterface.OnClickListener {
    public final int f25078a;
    public final Object f25079b;
    public final Object f25080c;
    public final Object d;
    public final Object f25081e;

    public c3(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f25078a = i10;
        this.f25079b = obj;
        this.f25080c = obj2;
        this.d = obj3;
        this.f25081e = obj4;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        int i11;
        switch (this.f25078a) {
            case 0:
                Context context = (Context) this.f25080c;
                ai.d dVar = (ai.d) this.d;
                b3 b3Var = (b3) this.f25081e;
                int i12 = ((int[]) this.f25079b)[i10];
                if (i12 == 100) {
                    new s4(context, i12, dVar, b3Var).show();
                    return;
                } else {
                    b3Var.run(Integer.valueOf(i12), "");
                    return;
                }
            default:
                org.telegram.ui.uo0 uo0Var = (org.telegram.ui.uo0) this.f25079b;
                ArrayList arrayList = (ArrayList) this.d;
                ArrayList arrayList2 = (ArrayList) this.f25081e;
                org.telegram.ui.go0 go0Var = new org.telegram.ui.go0(uo0Var, (Runnable) this.f25080c);
                TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard = uo0Var.f42732y0;
                if (tL_paymentSavedCredentialsCard == null && uo0Var.f42730x0 == null) {
                    i11 = 0;
                } else {
                    i11 = 1;
                }
                if ((tL_paymentSavedCredentialsCard == null && uo0Var.f42730x0 == null) || i10 != 0) {
                    if (i10 >= i11 && i10 < arrayList.size() + i11) {
                        TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard2 = (TLRPC.TL_paymentSavedCredentialsCard) arrayList.get(i10 - i11);
                        uo0Var.f42732y0 = tL_paymentSavedCredentialsCard2;
                        go0Var.c(null, tL_paymentSavedCredentialsCard2.title, true, null, tL_paymentSavedCredentialsCard2);
                        return;
                    } else if (i10 < arrayList2.size() - 1) {
                        org.telegram.ui.uo0 uo0Var2 = new org.telegram.ui.uo0(uo0Var.f42697b1, uo0Var.C0, uo0Var.N0, uo0Var.O0, 2, uo0Var.E0, uo0Var.G0, uo0Var.H0, null, uo0Var.f42730x0, uo0Var.I0, uo0Var.U0, null, uo0Var.f42721r0, uo0Var.W0);
                        uo0Var2.f42700c1 = uo0Var.f42700c1;
                        uo0Var2.f42702d1 = uo0Var.f42702d1;
                        uo0Var2.F0 = uo0Var.C0.additional_methods.get((i10 - arrayList.size()) - i11);
                        uo0Var2.T = go0Var;
                        uo0Var.presentFragment(uo0Var2);
                        return;
                    } else if (i10 == arrayList2.size() - 1) {
                        org.telegram.ui.uo0 uo0Var3 = new org.telegram.ui.uo0(uo0Var.f42697b1, uo0Var.C0, uo0Var.N0, uo0Var.O0, 2, uo0Var.E0, uo0Var.G0, uo0Var.H0, null, uo0Var.f42730x0, uo0Var.I0, uo0Var.U0, null, uo0Var.f42721r0, uo0Var.W0);
                        uo0Var3.f42700c1 = uo0Var.f42700c1;
                        uo0Var3.f42702d1 = uo0Var.f42702d1;
                        uo0Var3.T = go0Var;
                        uo0Var.presentFragment(uo0Var3);
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }
}
