package org.telegram.ui.Components;

import android.content.Context;
import android.content.DialogInterface;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class a3 implements DialogInterface.OnClickListener {
    public final int f22545a;
    public final Object f22546b;
    public final Object f22547c;
    public final Object d;
    public final Object e;

    public a3(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f22545a = i10;
        this.f22546b = obj;
        this.f22547c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        int i11;
        switch (this.f22545a) {
            case 0:
                Context context = (Context) this.f22547c;
                ai.d dVar = (ai.d) this.d;
                z2 z2Var = (z2) this.e;
                int i12 = ((int[]) this.f22546b)[i10];
                if (i12 == 100) {
                    new q4(context, i12, dVar, z2Var).show();
                    return;
                } else {
                    z2Var.run(Integer.valueOf(i12), "");
                    return;
                }
            default:
                org.telegram.ui.no0 no0Var = (org.telegram.ui.no0) this.f22546b;
                ArrayList arrayList = (ArrayList) this.d;
                ArrayList arrayList2 = (ArrayList) this.e;
                org.telegram.ui.zn0 zn0Var = new org.telegram.ui.zn0(no0Var, (Runnable) this.f22547c);
                TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard = no0Var.f36088y0;
                if (tL_paymentSavedCredentialsCard == null && no0Var.f36086x0 == null) {
                    i11 = 0;
                } else {
                    i11 = 1;
                }
                if ((tL_paymentSavedCredentialsCard == null && no0Var.f36086x0 == null) || i10 != 0) {
                    if (i10 >= i11 && i10 < arrayList.size() + i11) {
                        TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard2 = (TLRPC.TL_paymentSavedCredentialsCard) arrayList.get(i10 - i11);
                        no0Var.f36088y0 = tL_paymentSavedCredentialsCard2;
                        zn0Var.c(null, tL_paymentSavedCredentialsCard2.title, true, null, tL_paymentSavedCredentialsCard2);
                        return;
                    } else if (i10 < arrayList2.size() - 1) {
                        org.telegram.ui.no0 no0Var2 = new org.telegram.ui.no0(no0Var.f36054b1, no0Var.C0, no0Var.N0, no0Var.O0, 2, no0Var.E0, no0Var.G0, no0Var.H0, null, no0Var.f36086x0, no0Var.I0, no0Var.U0, null, no0Var.f36077r0, no0Var.W0);
                        no0Var2.f36057c1 = no0Var.f36057c1;
                        no0Var2.f36059d1 = no0Var.f36059d1;
                        no0Var2.F0 = no0Var.C0.additional_methods.get((i10 - arrayList.size()) - i11);
                        no0Var2.T = zn0Var;
                        no0Var.presentFragment(no0Var2);
                        return;
                    } else if (i10 == arrayList2.size() - 1) {
                        org.telegram.ui.no0 no0Var3 = new org.telegram.ui.no0(no0Var.f36054b1, no0Var.C0, no0Var.N0, no0Var.O0, 2, no0Var.E0, no0Var.G0, no0Var.H0, null, no0Var.f36086x0, no0Var.I0, no0Var.U0, null, no0Var.f36077r0, no0Var.W0);
                        no0Var3.f36057c1 = no0Var.f36057c1;
                        no0Var3.f36059d1 = no0Var.f36059d1;
                        no0Var3.T = zn0Var;
                        no0Var.presentFragment(no0Var3);
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }
}
