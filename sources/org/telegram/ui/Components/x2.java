package org.telegram.ui.Components;

import android.content.Context;
import android.content.DialogInterface;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class x2 implements DialogInterface.OnClickListener {
    public final int f30519a;
    public final Object f30520b;
    public final Object f30521c;
    public final Object d;
    public final Object e;

    public x2(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f30519a = i10;
        this.f30520b = obj;
        this.f30521c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        int i11;
        switch (this.f30519a) {
            case 0:
                Context context = (Context) this.f30521c;
                nh.b bVar = (nh.b) this.d;
                kh.t tVar = (kh.t) this.e;
                int i12 = ((int[]) this.f30520b)[i10];
                if (i12 == 100) {
                    new l4(context, i12, bVar, tVar).show();
                    return;
                } else {
                    tVar.run(Integer.valueOf(i12), "");
                    return;
                }
            default:
                org.telegram.ui.jo0 jo0Var = (org.telegram.ui.jo0) this.f30520b;
                ArrayList arrayList = (ArrayList) this.d;
                ArrayList arrayList2 = (ArrayList) this.e;
                org.telegram.ui.wn0 wn0Var = new org.telegram.ui.wn0(jo0Var, (Runnable) this.f30521c);
                TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard = jo0Var.f35418v0;
                if (tL_paymentSavedCredentialsCard == null && jo0Var.f35417u0 == null) {
                    i11 = 0;
                } else {
                    i11 = 1;
                }
                if ((tL_paymentSavedCredentialsCard == null && jo0Var.f35417u0 == null) || i10 != 0) {
                    if (i10 >= i11 && i10 < arrayList.size() + i11) {
                        TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard2 = (TLRPC.TL_paymentSavedCredentialsCard) arrayList.get(i10 - i11);
                        jo0Var.f35418v0 = tL_paymentSavedCredentialsCard2;
                        wn0Var.c(null, tL_paymentSavedCredentialsCard2.title, true, null, tL_paymentSavedCredentialsCard2);
                        return;
                    } else if (i10 < arrayList2.size() - 1) {
                        org.telegram.ui.jo0 jo0Var2 = new org.telegram.ui.jo0(jo0Var.Y0, jo0Var.f35425z0, jo0Var.K0, jo0Var.L0, 2, jo0Var.B0, jo0Var.D0, jo0Var.E0, null, jo0Var.f35417u0, jo0Var.F0, jo0Var.R0, null, jo0Var.f35409o0, jo0Var.T0);
                        jo0Var2.Z0 = jo0Var.Z0;
                        jo0Var2.f35390a1 = jo0Var.f35390a1;
                        jo0Var2.C0 = jo0Var.f35425z0.additional_methods.get((i10 - arrayList.size()) - i11);
                        jo0Var2.Q = wn0Var;
                        jo0Var.presentFragment(jo0Var2);
                        return;
                    } else if (i10 == arrayList2.size() - 1) {
                        org.telegram.ui.jo0 jo0Var3 = new org.telegram.ui.jo0(jo0Var.Y0, jo0Var.f35425z0, jo0Var.K0, jo0Var.L0, 2, jo0Var.B0, jo0Var.D0, jo0Var.E0, null, jo0Var.f35417u0, jo0Var.F0, jo0Var.R0, null, jo0Var.f35409o0, jo0Var.T0);
                        jo0Var3.Z0 = jo0Var.Z0;
                        jo0Var3.f35390a1 = jo0Var.f35390a1;
                        jo0Var3.Q = wn0Var;
                        jo0Var.presentFragment(jo0Var3);
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }
}
