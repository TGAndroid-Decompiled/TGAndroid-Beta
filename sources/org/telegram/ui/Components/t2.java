package org.telegram.ui.Components;

import android.content.Context;
import android.content.DialogInterface;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class t2 implements DialogInterface.OnClickListener {
    public final int f38213a;
    public final Object f38214b;
    public final Object f38215c;
    public final Object d;
    public final Object f38216e;

    public t2(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.f38213a = i7;
        this.f38214b = obj;
        this.f38215c = obj2;
        this.d = obj3;
        this.f38216e = obj4;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i7) {
        int i10;
        switch (this.f38213a) {
            case 0:
                Context context = (Context) this.f38215c;
                di.b bVar = (di.b) this.d;
                ai.v0 v0Var = (ai.v0) this.f38216e;
                int i11 = ((int[]) this.f38214b)[i7];
                if (i11 == 100) {
                    new k4(context, i11, bVar, v0Var).show();
                    return;
                } else {
                    v0Var.a(Integer.valueOf(i11), "");
                    return;
                }
            default:
                org.telegram.ui.hl0 hl0Var = (org.telegram.ui.hl0) this.f38214b;
                ArrayList arrayList = (ArrayList) this.d;
                ArrayList arrayList2 = (ArrayList) this.f38216e;
                org.telegram.ui.xk0 xk0Var = new org.telegram.ui.xk0(hl0Var, (Runnable) this.f38215c);
                TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard = hl0Var.f46445y0;
                if (tL_paymentSavedCredentialsCard == null && hl0Var.f46443x0 == null) {
                    i10 = 0;
                } else {
                    i10 = 1;
                }
                if ((tL_paymentSavedCredentialsCard == null && hl0Var.f46443x0 == null) || i7 != 0) {
                    if (i7 >= i10 && i7 < arrayList.size() + i10) {
                        TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard2 = (TLRPC.TL_paymentSavedCredentialsCard) arrayList.get(i7 - i10);
                        hl0Var.f46445y0 = tL_paymentSavedCredentialsCard2;
                        xk0Var.c(null, tL_paymentSavedCredentialsCard2.title, true, null, tL_paymentSavedCredentialsCard2);
                        return;
                    } else if (i7 < arrayList2.size() - 1) {
                        org.telegram.ui.hl0 hl0Var2 = new org.telegram.ui.hl0(hl0Var.f46410b1, hl0Var.C0, hl0Var.N0, hl0Var.O0, 2, hl0Var.E0, hl0Var.G0, hl0Var.H0, null, hl0Var.f46443x0, hl0Var.I0, hl0Var.U0, null, hl0Var.f46434r0, hl0Var.W0);
                        hl0Var2.f46413c1 = hl0Var.f46413c1;
                        hl0Var2.f46415d1 = hl0Var.f46415d1;
                        hl0Var2.F0 = hl0Var.C0.additional_methods.get((i7 - arrayList.size()) - i10);
                        hl0Var2.T = xk0Var;
                        hl0Var.presentFragment(hl0Var2);
                        return;
                    } else if (i7 == arrayList2.size() - 1) {
                        org.telegram.ui.hl0 hl0Var3 = new org.telegram.ui.hl0(hl0Var.f46410b1, hl0Var.C0, hl0Var.N0, hl0Var.O0, 2, hl0Var.E0, hl0Var.G0, hl0Var.H0, null, hl0Var.f46443x0, hl0Var.I0, hl0Var.U0, null, hl0Var.f46434r0, hl0Var.W0);
                        hl0Var3.f46413c1 = hl0Var.f46413c1;
                        hl0Var3.f46415d1 = hl0Var.f46415d1;
                        hl0Var3.T = xk0Var;
                        hl0Var.presentFragment(hl0Var3);
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }
}
