package org.telegram.ui.Components;

import android.content.Context;
import android.content.DialogInterface;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class b3 implements DialogInterface.OnClickListener {
    public final int f24779a;
    public final Object f24780b;
    public final Object f24781c;
    public final Object d;
    public final Object e;

    public b3(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f24779a = i10;
        this.f24780b = obj;
        this.f24781c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        int i11;
        switch (this.f24779a) {
            case 0:
                Context context = (Context) this.f24781c;
                ci.b bVar = (ci.b) this.d;
                a3 a3Var = (a3) this.e;
                int i12 = ((int[]) this.f24780b)[i10];
                if (i12 == 100) {
                    new r4(context, i12, bVar, a3Var).show();
                    return;
                } else {
                    a3Var.run(Integer.valueOf(i12), "");
                    return;
                }
            default:
                org.telegram.ui.go0 go0Var = (org.telegram.ui.go0) this.f24780b;
                ArrayList arrayList = (ArrayList) this.d;
                ArrayList arrayList2 = (ArrayList) this.e;
                org.telegram.ui.sn0 sn0Var = new org.telegram.ui.sn0(go0Var, (Runnable) this.f24781c);
                TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard = go0Var.f37254y0;
                if (tL_paymentSavedCredentialsCard == null && go0Var.f37252x0 == null) {
                    i11 = 0;
                } else {
                    i11 = 1;
                }
                if ((tL_paymentSavedCredentialsCard == null && go0Var.f37252x0 == null) || i10 != 0) {
                    if (i10 >= i11 && i10 < arrayList.size() + i11) {
                        TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard2 = (TLRPC.TL_paymentSavedCredentialsCard) arrayList.get(i10 - i11);
                        go0Var.f37254y0 = tL_paymentSavedCredentialsCard2;
                        sn0Var.c(null, tL_paymentSavedCredentialsCard2.title, true, null, tL_paymentSavedCredentialsCard2);
                        return;
                    } else if (i10 < arrayList2.size() - 1) {
                        org.telegram.ui.go0 go0Var2 = new org.telegram.ui.go0(go0Var.f37220b1, go0Var.C0, go0Var.N0, go0Var.O0, 2, go0Var.E0, go0Var.G0, go0Var.H0, null, go0Var.f37252x0, go0Var.I0, go0Var.U0, null, go0Var.f37243r0, go0Var.W0);
                        go0Var2.f37223c1 = go0Var.f37223c1;
                        go0Var2.f37225d1 = go0Var.f37225d1;
                        go0Var2.F0 = go0Var.C0.additional_methods.get((i10 - arrayList.size()) - i11);
                        go0Var2.T = sn0Var;
                        go0Var.presentFragment(go0Var2);
                        return;
                    } else if (i10 == arrayList2.size() - 1) {
                        org.telegram.ui.go0 go0Var3 = new org.telegram.ui.go0(go0Var.f37220b1, go0Var.C0, go0Var.N0, go0Var.O0, 2, go0Var.E0, go0Var.G0, go0Var.H0, null, go0Var.f37252x0, go0Var.I0, go0Var.U0, null, go0Var.f37243r0, go0Var.W0);
                        go0Var3.f37223c1 = go0Var.f37223c1;
                        go0Var3.f37225d1 = go0Var.f37225d1;
                        go0Var3.T = sn0Var;
                        go0Var.presentFragment(go0Var3);
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }
}
