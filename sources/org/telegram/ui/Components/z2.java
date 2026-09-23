package org.telegram.ui.Components;

import android.content.Context;
import android.content.DialogInterface;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class z2 implements DialogInterface.OnClickListener {
    public final int f30516a;
    public final Object f30517b;
    public final Object f30518c;
    public final Object d;
    public final Object e;

    public z2(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f30516a = i10;
        this.f30517b = obj;
        this.f30518c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        int i11;
        switch (this.f30516a) {
            case 0:
                Context context = (Context) this.f30518c;
                ai.d dVar = (ai.d) this.d;
                y2 y2Var = (y2) this.e;
                int i12 = ((int[]) this.f30517b)[i10];
                if (i12 == 100) {
                    new q4(context, i12, dVar, y2Var).show();
                    return;
                } else {
                    y2Var.run(Integer.valueOf(i12), "");
                    return;
                }
            default:
                org.telegram.ui.qo0 qo0Var = (org.telegram.ui.qo0) this.f30517b;
                ArrayList arrayList = (ArrayList) this.d;
                ArrayList arrayList2 = (ArrayList) this.e;
                org.telegram.ui.co0 co0Var = new org.telegram.ui.co0(qo0Var, (Runnable) this.f30518c);
                TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard = qo0Var.f36522y0;
                if (tL_paymentSavedCredentialsCard == null && qo0Var.f36520x0 == null) {
                    i11 = 0;
                } else {
                    i11 = 1;
                }
                if ((tL_paymentSavedCredentialsCard == null && qo0Var.f36520x0 == null) || i10 != 0) {
                    if (i10 >= i11 && i10 < arrayList.size() + i11) {
                        TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard2 = (TLRPC.TL_paymentSavedCredentialsCard) arrayList.get(i10 - i11);
                        qo0Var.f36522y0 = tL_paymentSavedCredentialsCard2;
                        co0Var.c(null, tL_paymentSavedCredentialsCard2.title, true, null, tL_paymentSavedCredentialsCard2);
                        return;
                    } else if (i10 < arrayList2.size() - 1) {
                        org.telegram.ui.qo0 qo0Var2 = new org.telegram.ui.qo0(qo0Var.f36488b1, qo0Var.C0, qo0Var.N0, qo0Var.O0, 2, qo0Var.E0, qo0Var.G0, qo0Var.H0, null, qo0Var.f36520x0, qo0Var.I0, qo0Var.U0, null, qo0Var.f36511r0, qo0Var.W0);
                        qo0Var2.f36491c1 = qo0Var.f36491c1;
                        qo0Var2.f36493d1 = qo0Var.f36493d1;
                        qo0Var2.F0 = qo0Var.C0.additional_methods.get((i10 - arrayList.size()) - i11);
                        qo0Var2.T = co0Var;
                        qo0Var.presentFragment(qo0Var2);
                        return;
                    } else if (i10 == arrayList2.size() - 1) {
                        org.telegram.ui.qo0 qo0Var3 = new org.telegram.ui.qo0(qo0Var.f36488b1, qo0Var.C0, qo0Var.N0, qo0Var.O0, 2, qo0Var.E0, qo0Var.G0, qo0Var.H0, null, qo0Var.f36520x0, qo0Var.I0, qo0Var.U0, null, qo0Var.f36511r0, qo0Var.W0);
                        qo0Var3.f36491c1 = qo0Var.f36491c1;
                        qo0Var3.f36493d1 = qo0Var.f36493d1;
                        qo0Var3.T = co0Var;
                        qo0Var.presentFragment(qo0Var3);
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }
}
