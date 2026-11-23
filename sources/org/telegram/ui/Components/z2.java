package org.telegram.ui.Components;

import android.content.Context;
import android.content.DialogInterface;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class z2 implements DialogInterface.OnClickListener {
    public final int f42646a;
    public final Object f42647b;
    public final Object f42648c;
    public final Object d;
    public final Object f42649e;

    public z2(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.f42646a = i7;
        this.f42647b = obj;
        this.f42648c = obj2;
        this.d = obj3;
        this.f42649e = obj4;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i7) {
        int i10;
        switch (this.f42646a) {
            case 0:
                Context context = (Context) this.f42648c;
                fi.b bVar = (fi.b) this.d;
                bi.z zVar = (bi.z) this.f42649e;
                int i11 = ((int[]) this.f42647b)[i7];
                if (i11 == 100) {
                    new q4(context, i11, bVar, zVar).show();
                    return;
                } else {
                    zVar.a(Integer.valueOf(i11), "");
                    return;
                }
            default:
                org.telegram.ui.kl0 kl0Var = (org.telegram.ui.kl0) this.f42647b;
                ArrayList arrayList = (ArrayList) this.d;
                ArrayList arrayList2 = (ArrayList) this.f42649e;
                org.telegram.ui.al0 al0Var = new org.telegram.ui.al0(kl0Var, (Runnable) this.f42648c);
                TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard = kl0Var.f49495z0;
                if (tL_paymentSavedCredentialsCard == null && kl0Var.f49494y0 == null) {
                    i10 = 0;
                } else {
                    i10 = 1;
                }
                if ((tL_paymentSavedCredentialsCard == null && kl0Var.f49494y0 == null) || i7 != 0) {
                    if (i7 >= i10 && i7 < arrayList.size() + i10) {
                        TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard2 = (TLRPC.TL_paymentSavedCredentialsCard) arrayList.get(i7 - i10);
                        kl0Var.f49495z0 = tL_paymentSavedCredentialsCard2;
                        al0Var.c(null, tL_paymentSavedCredentialsCard2.title, true, null, tL_paymentSavedCredentialsCard2);
                        return;
                    } else if (i7 < arrayList2.size() - 1) {
                        org.telegram.ui.kl0 kl0Var2 = new org.telegram.ui.kl0(kl0Var.f49461c1, kl0Var.D0, kl0Var.O0, kl0Var.P0, 2, kl0Var.F0, kl0Var.H0, kl0Var.I0, null, kl0Var.f49494y0, kl0Var.J0, kl0Var.V0, null, kl0Var.f49485s0, kl0Var.X0);
                        kl0Var2.f49463d1 = kl0Var.f49463d1;
                        kl0Var2.f49466e1 = kl0Var.f49466e1;
                        kl0Var2.G0 = kl0Var.D0.additional_methods.get((i7 - arrayList.size()) - i10);
                        kl0Var2.U = al0Var;
                        kl0Var.presentFragment(kl0Var2);
                        return;
                    } else if (i7 == arrayList2.size() - 1) {
                        org.telegram.ui.kl0 kl0Var3 = new org.telegram.ui.kl0(kl0Var.f49461c1, kl0Var.D0, kl0Var.O0, kl0Var.P0, 2, kl0Var.F0, kl0Var.H0, kl0Var.I0, null, kl0Var.f49494y0, kl0Var.J0, kl0Var.V0, null, kl0Var.f49485s0, kl0Var.X0);
                        kl0Var3.f49463d1 = kl0Var.f49463d1;
                        kl0Var3.f49466e1 = kl0Var.f49466e1;
                        kl0Var3.U = al0Var;
                        kl0Var.presentFragment(kl0Var3);
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }
}
