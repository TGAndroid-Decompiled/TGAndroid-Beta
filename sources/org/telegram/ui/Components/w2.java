package org.telegram.ui.Components;

import android.content.Context;
import android.content.DialogInterface;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

public final class w2 implements DialogInterface.OnClickListener {

    public final int f34092a;

    public final Object f34093b;

    public final Object f34094c;
    public final Object d;

    public final Object f34095e;

    public w2(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f34092a = i10;
        this.f34093b = obj;
        this.f34094c = obj2;
        this.d = obj3;
        this.f34095e = obj4;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        switch (this.f34092a) {
            case 0:
                int[] iArr = (int[]) this.f34093b;
                Context context = (Context) this.f34094c;
                jh.b bVar = (jh.b) this.d;
                gh.w wVar = (gh.w) this.f34095e;
                int i11 = iArr[i10];
                if (i11 != 100) {
                    wVar.run(Integer.valueOf(i11), "");
                } else {
                    new k4(context, i11, bVar, wVar).show();
                }
                break;
            default:
                org.telegram.ui.do0 do0Var = (org.telegram.ui.do0) this.f34093b;
                Runnable runnable = (Runnable) this.f34094c;
                ArrayList arrayList = (ArrayList) this.d;
                ArrayList arrayList2 = (ArrayList) this.f34095e;
                org.telegram.ui.qn0 qn0Var = new org.telegram.ui.qn0(do0Var, runnable);
                TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard = do0Var.f37480u0;
                int i12 = (tL_paymentSavedCredentialsCard == null && do0Var.f37479t0 == null) ? 0 : 1;
                if ((tL_paymentSavedCredentialsCard == null && do0Var.f37479t0 == null) || i10 != 0) {
                    if (i10 >= i12 && i10 < arrayList.size() + i12) {
                        TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard2 = (TLRPC.TL_paymentSavedCredentialsCard) arrayList.get(i10 - i12);
                        do0Var.f37480u0 = tL_paymentSavedCredentialsCard2;
                        qn0Var.c(null, tL_paymentSavedCredentialsCard2.title, true, null, tL_paymentSavedCredentialsCard2);
                    } else if (i10 < arrayList2.size() - 1) {
                        TLRPC.TL_paymentFormMethod tL_paymentFormMethod = do0Var.f37487y0.additional_methods.get((i10 - arrayList.size()) - i12);
                        org.telegram.ui.do0 do0Var2 = new org.telegram.ui.do0(do0Var.X0, do0Var.f37487y0, do0Var.J0, do0Var.K0, 2, do0Var.A0, do0Var.C0, do0Var.D0, null, do0Var.f37479t0, do0Var.E0, do0Var.Q0, null, do0Var.f37471n0, do0Var.S0);
                        do0Var2.Y0 = do0Var.Y0;
                        do0Var2.Z0 = do0Var.Z0;
                        do0Var2.B0 = tL_paymentFormMethod;
                        do0Var2.P = qn0Var;
                        do0Var.presentFragment(do0Var2);
                    } else if (i10 == arrayList2.size() - 1) {
                        org.telegram.ui.do0 do0Var3 = new org.telegram.ui.do0(do0Var.X0, do0Var.f37487y0, do0Var.J0, do0Var.K0, 2, do0Var.A0, do0Var.C0, do0Var.D0, null, do0Var.f37479t0, do0Var.E0, do0Var.Q0, null, do0Var.f37471n0, do0Var.S0);
                        do0Var3.Y0 = do0Var.Y0;
                        do0Var3.Z0 = do0Var.Z0;
                        do0Var3.P = qn0Var;
                        do0Var.presentFragment(do0Var3);
                    }
                    break;
                }
                break;
        }
    }
}
