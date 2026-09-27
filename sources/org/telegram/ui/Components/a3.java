package org.telegram.ui.Components;

import android.content.Context;
import android.content.DialogInterface;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class a3 implements DialogInterface.OnClickListener {
    public final int f22525a;
    public final Object f22526b;
    public final Object f22527c;
    public final Object d;
    public final Object e;

    public a3(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f22525a = i10;
        this.f22526b = obj;
        this.f22527c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        int i11;
        switch (this.f22525a) {
            case 0:
                Context context = (Context) this.f22527c;
                ai.d dVar = (ai.d) this.d;
                z2 z2Var = (z2) this.e;
                int i12 = ((int[]) this.f22526b)[i10];
                if (i12 == 100) {
                    new q4(context, i12, dVar, z2Var).show();
                    return;
                } else {
                    z2Var.run(Integer.valueOf(i12), "");
                    return;
                }
            default:
                org.telegram.ui.ro0 ro0Var = (org.telegram.ui.ro0) this.f22526b;
                ArrayList arrayList = (ArrayList) this.d;
                ArrayList arrayList2 = (ArrayList) this.e;
                org.telegram.ui.do0 do0Var = new org.telegram.ui.do0(ro0Var, (Runnable) this.f22527c);
                TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard = ro0Var.f37206y0;
                if (tL_paymentSavedCredentialsCard == null && ro0Var.f37204x0 == null) {
                    i11 = 0;
                } else {
                    i11 = 1;
                }
                if ((tL_paymentSavedCredentialsCard == null && ro0Var.f37204x0 == null) || i10 != 0) {
                    if (i10 >= i11 && i10 < arrayList.size() + i11) {
                        TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard2 = (TLRPC.TL_paymentSavedCredentialsCard) arrayList.get(i10 - i11);
                        ro0Var.f37206y0 = tL_paymentSavedCredentialsCard2;
                        do0Var.c(null, tL_paymentSavedCredentialsCard2.title, true, null, tL_paymentSavedCredentialsCard2);
                        return;
                    } else if (i10 < arrayList2.size() - 1) {
                        org.telegram.ui.ro0 ro0Var2 = new org.telegram.ui.ro0(ro0Var.f37172b1, ro0Var.C0, ro0Var.N0, ro0Var.O0, 2, ro0Var.E0, ro0Var.G0, ro0Var.H0, null, ro0Var.f37204x0, ro0Var.I0, ro0Var.U0, null, ro0Var.f37195r0, ro0Var.W0);
                        ro0Var2.f37175c1 = ro0Var.f37175c1;
                        ro0Var2.f37177d1 = ro0Var.f37177d1;
                        ro0Var2.F0 = ro0Var.C0.additional_methods.get((i10 - arrayList.size()) - i11);
                        ro0Var2.T = do0Var;
                        ro0Var.presentFragment(ro0Var2);
                        return;
                    } else if (i10 == arrayList2.size() - 1) {
                        org.telegram.ui.ro0 ro0Var3 = new org.telegram.ui.ro0(ro0Var.f37172b1, ro0Var.C0, ro0Var.N0, ro0Var.O0, 2, ro0Var.E0, ro0Var.G0, ro0Var.H0, null, ro0Var.f37204x0, ro0Var.I0, ro0Var.U0, null, ro0Var.f37195r0, ro0Var.W0);
                        ro0Var3.f37175c1 = ro0Var.f37175c1;
                        ro0Var3.f37177d1 = ro0Var.f37177d1;
                        ro0Var3.T = do0Var;
                        ro0Var.presentFragment(ro0Var3);
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }
}
