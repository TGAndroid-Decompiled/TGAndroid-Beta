package org.telegram.ui.Components;

import android.content.Context;
import android.content.DialogInterface;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class a3 implements DialogInterface.OnClickListener {
    public final int f33303a;
    public final Object f33304b;
    public final Object f33305c;
    public final Object d;
    public final Object f33306e;

    public a3(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.f33303a = i7;
        this.f33304b = obj;
        this.f33305c = obj2;
        this.d = obj3;
        this.f33306e = obj4;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i7) {
        int i10;
        switch (this.f33303a) {
            case 0:
                Context context = (Context) this.f33305c;
                fi.b bVar = (fi.b) this.d;
                bi.z zVar = (bi.z) this.f33306e;
                int i11 = ((int[]) this.f33304b)[i7];
                if (i11 == 100) {
                    new r4(context, i11, bVar, zVar).show();
                    return;
                } else {
                    zVar.a(Integer.valueOf(i11), "");
                    return;
                }
            default:
                org.telegram.ui.ml0 ml0Var = (org.telegram.ui.ml0) this.f33304b;
                ArrayList arrayList = (ArrayList) this.d;
                ArrayList arrayList2 = (ArrayList) this.f33306e;
                org.telegram.ui.cl0 cl0Var = new org.telegram.ui.cl0(ml0Var, (Runnable) this.f33305c);
                TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard = ml0Var.f49940z0;
                if (tL_paymentSavedCredentialsCard == null && ml0Var.f49939y0 == null) {
                    i10 = 0;
                } else {
                    i10 = 1;
                }
                if ((tL_paymentSavedCredentialsCard == null && ml0Var.f49939y0 == null) || i7 != 0) {
                    if (i7 >= i10 && i7 < arrayList.size() + i10) {
                        TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard2 = (TLRPC.TL_paymentSavedCredentialsCard) arrayList.get(i7 - i10);
                        ml0Var.f49940z0 = tL_paymentSavedCredentialsCard2;
                        cl0Var.c(null, tL_paymentSavedCredentialsCard2.title, true, null, tL_paymentSavedCredentialsCard2);
                        return;
                    } else if (i7 < arrayList2.size() - 1) {
                        org.telegram.ui.ml0 ml0Var2 = new org.telegram.ui.ml0(ml0Var.f49906c1, ml0Var.D0, ml0Var.O0, ml0Var.P0, 2, ml0Var.F0, ml0Var.H0, ml0Var.I0, null, ml0Var.f49939y0, ml0Var.J0, ml0Var.V0, null, ml0Var.f49930s0, ml0Var.X0);
                        ml0Var2.f49908d1 = ml0Var.f49908d1;
                        ml0Var2.f49911e1 = ml0Var.f49911e1;
                        ml0Var2.G0 = ml0Var.D0.additional_methods.get((i7 - arrayList.size()) - i10);
                        ml0Var2.U = cl0Var;
                        ml0Var.presentFragment(ml0Var2);
                        return;
                    } else if (i7 == arrayList2.size() - 1) {
                        org.telegram.ui.ml0 ml0Var3 = new org.telegram.ui.ml0(ml0Var.f49906c1, ml0Var.D0, ml0Var.O0, ml0Var.P0, 2, ml0Var.F0, ml0Var.H0, ml0Var.I0, null, ml0Var.f49939y0, ml0Var.J0, ml0Var.V0, null, ml0Var.f49930s0, ml0Var.X0);
                        ml0Var3.f49908d1 = ml0Var.f49908d1;
                        ml0Var3.f49911e1 = ml0Var.f49911e1;
                        ml0Var3.U = cl0Var;
                        ml0Var.presentFragment(ml0Var3);
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }
}
