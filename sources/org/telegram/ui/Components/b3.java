package org.telegram.ui.Components;

import android.content.Context;
import android.content.DialogInterface;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class b3 implements DialogInterface.OnClickListener {
    public final int f24783a;
    public final Object f24784b;
    public final Object f24785c;
    public final Object d;
    public final Object e;

    public b3(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f24783a = i10;
        this.f24784b = obj;
        this.f24785c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        int i11;
        switch (this.f24783a) {
            case 0:
                Context context = (Context) this.f24785c;
                ci.b bVar = (ci.b) this.d;
                a3 a3Var = (a3) this.e;
                int i12 = ((int[]) this.f24784b)[i10];
                if (i12 == 100) {
                    new r4(context, i12, bVar, a3Var).show();
                    return;
                } else {
                    a3Var.run(Integer.valueOf(i12), "");
                    return;
                }
            default:
                org.telegram.ui.eo0 eo0Var = (org.telegram.ui.eo0) this.f24784b;
                ArrayList arrayList = (ArrayList) this.d;
                ArrayList arrayList2 = (ArrayList) this.e;
                org.telegram.ui.qn0 qn0Var = new org.telegram.ui.qn0(eo0Var, (Runnable) this.f24785c);
                TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard = eo0Var.f36731y0;
                if (tL_paymentSavedCredentialsCard == null && eo0Var.f36729x0 == null) {
                    i11 = 0;
                } else {
                    i11 = 1;
                }
                if ((tL_paymentSavedCredentialsCard == null && eo0Var.f36729x0 == null) || i10 != 0) {
                    if (i10 >= i11 && i10 < arrayList.size() + i11) {
                        TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard2 = (TLRPC.TL_paymentSavedCredentialsCard) arrayList.get(i10 - i11);
                        eo0Var.f36731y0 = tL_paymentSavedCredentialsCard2;
                        qn0Var.c(null, tL_paymentSavedCredentialsCard2.title, true, null, tL_paymentSavedCredentialsCard2);
                        return;
                    } else if (i10 < arrayList2.size() - 1) {
                        org.telegram.ui.eo0 eo0Var2 = new org.telegram.ui.eo0(eo0Var.f36697b1, eo0Var.C0, eo0Var.N0, eo0Var.O0, 2, eo0Var.E0, eo0Var.G0, eo0Var.H0, null, eo0Var.f36729x0, eo0Var.I0, eo0Var.U0, null, eo0Var.f36720r0, eo0Var.W0);
                        eo0Var2.f36700c1 = eo0Var.f36700c1;
                        eo0Var2.f36702d1 = eo0Var.f36702d1;
                        eo0Var2.F0 = eo0Var.C0.additional_methods.get((i10 - arrayList.size()) - i11);
                        eo0Var2.T = qn0Var;
                        eo0Var.presentFragment(eo0Var2);
                        return;
                    } else if (i10 == arrayList2.size() - 1) {
                        org.telegram.ui.eo0 eo0Var3 = new org.telegram.ui.eo0(eo0Var.f36697b1, eo0Var.C0, eo0Var.N0, eo0Var.O0, 2, eo0Var.E0, eo0Var.G0, eo0Var.H0, null, eo0Var.f36729x0, eo0Var.I0, eo0Var.U0, null, eo0Var.f36720r0, eo0Var.W0);
                        eo0Var3.f36700c1 = eo0Var.f36700c1;
                        eo0Var3.f36702d1 = eo0Var.f36702d1;
                        eo0Var3.T = qn0Var;
                        eo0Var.presentFragment(eo0Var3);
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }
}
