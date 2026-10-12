package org.telegram.ui.Components;

import android.content.Context;
import android.content.DialogInterface;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class c3 implements DialogInterface.OnClickListener {
    public final int f23920a;
    public final Object f23921b;
    public final Object f23922c;
    public final Object d;
    public final Object e;

    public c3(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f23920a = i10;
        this.f23921b = obj;
        this.f23922c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        int i11;
        switch (this.f23920a) {
            case 0:
                Context context = (Context) this.f23922c;
                bi.b bVar = (bi.b) this.d;
                b3 b3Var = (b3) this.e;
                int i12 = ((int[]) this.f23921b)[i10];
                if (i12 == 100) {
                    new s4(context, i12, bVar, b3Var).show();
                    return;
                } else {
                    b3Var.run(Integer.valueOf(i12), "");
                    return;
                }
            default:
                org.telegram.ui.cp0 cp0Var = (org.telegram.ui.cp0) this.f23921b;
                ArrayList arrayList = (ArrayList) this.d;
                ArrayList arrayList2 = (ArrayList) this.e;
                org.telegram.ui.oo0 oo0Var = new org.telegram.ui.oo0(cp0Var, (Runnable) this.f23922c);
                TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard = cp0Var.f35034y0;
                if (tL_paymentSavedCredentialsCard == null && cp0Var.f35032x0 == null) {
                    i11 = 0;
                } else {
                    i11 = 1;
                }
                if ((tL_paymentSavedCredentialsCard == null && cp0Var.f35032x0 == null) || i10 != 0) {
                    if (i10 >= i11 && i10 < arrayList.size() + i11) {
                        TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard2 = (TLRPC.TL_paymentSavedCredentialsCard) arrayList.get(i10 - i11);
                        cp0Var.f35034y0 = tL_paymentSavedCredentialsCard2;
                        oo0Var.c(null, tL_paymentSavedCredentialsCard2.title, true, null, tL_paymentSavedCredentialsCard2);
                        return;
                    } else if (i10 < arrayList2.size() - 1) {
                        org.telegram.ui.cp0 cp0Var2 = new org.telegram.ui.cp0(cp0Var.f35000b1, cp0Var.C0, cp0Var.N0, cp0Var.O0, 2, cp0Var.E0, cp0Var.G0, cp0Var.H0, null, cp0Var.f35032x0, cp0Var.I0, cp0Var.U0, null, cp0Var.f35023r0, cp0Var.W0);
                        cp0Var2.f35003c1 = cp0Var.f35003c1;
                        cp0Var2.f35005d1 = cp0Var.f35005d1;
                        cp0Var2.F0 = cp0Var.C0.additional_methods.get((i10 - arrayList.size()) - i11);
                        cp0Var2.T = oo0Var;
                        cp0Var.presentFragment(cp0Var2);
                        return;
                    } else if (i10 == arrayList2.size() - 1) {
                        org.telegram.ui.cp0 cp0Var3 = new org.telegram.ui.cp0(cp0Var.f35000b1, cp0Var.C0, cp0Var.N0, cp0Var.O0, 2, cp0Var.E0, cp0Var.G0, cp0Var.H0, null, cp0Var.f35032x0, cp0Var.I0, cp0Var.U0, null, cp0Var.f35023r0, cp0Var.W0);
                        cp0Var3.f35003c1 = cp0Var.f35003c1;
                        cp0Var3.f35005d1 = cp0Var.f35005d1;
                        cp0Var3.T = oo0Var;
                        cp0Var.presentFragment(cp0Var3);
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }
}
