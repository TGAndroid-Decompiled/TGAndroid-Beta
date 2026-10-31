package org.telegram.ui.Components;

import android.content.Context;
import android.content.DialogInterface;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class t2 implements DialogInterface.OnClickListener {
    public final int f30420a;
    public final Object f30421b;
    public final Object f30422c;
    public final Object d;
    public final Object e;

    public t2(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f30420a = i10;
        this.f30421b = obj;
        this.f30422c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        int i11;
        switch (this.f30420a) {
            case 0:
                Context context = (Context) this.f30422c;
                th.b bVar = (th.b) this.d;
                s2 s2Var = (s2) this.e;
                int i12 = ((int[]) this.f30421b)[i10];
                if (i12 == 100) {
                    new h4(context, i12, bVar, s2Var).show();
                    return;
                } else {
                    s2Var.a(Integer.valueOf(i12), "");
                    return;
                }
            default:
                org.telegram.ui.sm0 sm0Var = (org.telegram.ui.sm0) this.f30421b;
                ArrayList arrayList = (ArrayList) this.d;
                ArrayList arrayList2 = (ArrayList) this.e;
                org.telegram.ui.hm0 hm0Var = new org.telegram.ui.hm0(sm0Var, (Runnable) this.f30422c);
                TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard = sm0Var.f41585y0;
                if (tL_paymentSavedCredentialsCard == null && sm0Var.f41583x0 == null) {
                    i11 = 0;
                } else {
                    i11 = 1;
                }
                if ((tL_paymentSavedCredentialsCard == null && sm0Var.f41583x0 == null) || i10 != 0) {
                    if (i10 >= i11 && i10 < arrayList.size() + i11) {
                        TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard2 = (TLRPC.TL_paymentSavedCredentialsCard) arrayList.get(i10 - i11);
                        sm0Var.f41585y0 = tL_paymentSavedCredentialsCard2;
                        hm0Var.c(null, tL_paymentSavedCredentialsCard2.title, true, null, tL_paymentSavedCredentialsCard2);
                        return;
                    } else if (i10 < arrayList2.size() - 1) {
                        org.telegram.ui.sm0 sm0Var2 = new org.telegram.ui.sm0(sm0Var.f41551b1, sm0Var.C0, sm0Var.N0, sm0Var.O0, 2, sm0Var.E0, sm0Var.G0, sm0Var.H0, null, sm0Var.f41583x0, sm0Var.I0, sm0Var.U0, null, sm0Var.f41574r0, sm0Var.W0);
                        sm0Var2.f41554c1 = sm0Var.f41554c1;
                        sm0Var2.f41556d1 = sm0Var.f41556d1;
                        sm0Var2.F0 = sm0Var.C0.additional_methods.get((i10 - arrayList.size()) - i11);
                        sm0Var2.T = hm0Var;
                        sm0Var.presentFragment(sm0Var2);
                        return;
                    } else if (i10 == arrayList2.size() - 1) {
                        org.telegram.ui.sm0 sm0Var3 = new org.telegram.ui.sm0(sm0Var.f41551b1, sm0Var.C0, sm0Var.N0, sm0Var.O0, 2, sm0Var.E0, sm0Var.G0, sm0Var.H0, null, sm0Var.f41583x0, sm0Var.I0, sm0Var.U0, null, sm0Var.f41574r0, sm0Var.W0);
                        sm0Var3.f41554c1 = sm0Var.f41554c1;
                        sm0Var3.f41556d1 = sm0Var.f41556d1;
                        sm0Var3.T = hm0Var;
                        sm0Var.presentFragment(sm0Var3);
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }
}
