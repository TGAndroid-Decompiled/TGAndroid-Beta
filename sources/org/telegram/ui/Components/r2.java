package org.telegram.ui.Components;

import android.content.Context;
import android.content.DialogInterface;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class r2 implements DialogInterface.OnClickListener {
    public final int f38826a;
    public final Object f38827b;
    public final Object f38828c;
    public final Object d;
    public final Object f38829e;

    public r2(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.f38826a = i7;
        this.f38827b = obj;
        this.f38828c = obj2;
        this.d = obj3;
        this.f38829e = obj4;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i7) {
        int i10;
        switch (this.f38826a) {
            case 0:
                Context context = (Context) this.f38828c;
                fi.b bVar = (fi.b) this.d;
                bi.z zVar = (bi.z) this.f38829e;
                int i11 = ((int[]) this.f38827b)[i7];
                if (i11 == 100) {
                    new i4(context, i11, bVar, zVar).show();
                    return;
                } else {
                    zVar.a(Integer.valueOf(i11), "");
                    return;
                }
            default:
                org.telegram.ui.kl0 kl0Var = (org.telegram.ui.kl0) this.f38827b;
                ArrayList arrayList = (ArrayList) this.d;
                ArrayList arrayList2 = (ArrayList) this.f38829e;
                org.telegram.ui.al0 al0Var = new org.telegram.ui.al0(kl0Var, (Runnable) this.f38828c);
                TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard = kl0Var.f48716z0;
                if (tL_paymentSavedCredentialsCard == null && kl0Var.f48715y0 == null) {
                    i10 = 0;
                } else {
                    i10 = 1;
                }
                if ((tL_paymentSavedCredentialsCard == null && kl0Var.f48715y0 == null) || i7 != 0) {
                    if (i7 >= i10 && i7 < arrayList.size() + i10) {
                        TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard2 = (TLRPC.TL_paymentSavedCredentialsCard) arrayList.get(i7 - i10);
                        kl0Var.f48716z0 = tL_paymentSavedCredentialsCard2;
                        al0Var.c(null, tL_paymentSavedCredentialsCard2.title, true, null, tL_paymentSavedCredentialsCard2);
                        return;
                    } else if (i7 < arrayList2.size() - 1) {
                        org.telegram.ui.kl0 kl0Var2 = new org.telegram.ui.kl0(kl0Var.f48682c1, kl0Var.D0, kl0Var.O0, kl0Var.P0, 2, kl0Var.F0, kl0Var.H0, kl0Var.I0, null, kl0Var.f48715y0, kl0Var.J0, kl0Var.V0, null, kl0Var.f48706s0, kl0Var.X0);
                        kl0Var2.f48684d1 = kl0Var.f48684d1;
                        kl0Var2.f48687e1 = kl0Var.f48687e1;
                        kl0Var2.G0 = kl0Var.D0.additional_methods.get((i7 - arrayList.size()) - i10);
                        kl0Var2.U = al0Var;
                        kl0Var.presentFragment(kl0Var2);
                        return;
                    } else if (i7 == arrayList2.size() - 1) {
                        org.telegram.ui.kl0 kl0Var3 = new org.telegram.ui.kl0(kl0Var.f48682c1, kl0Var.D0, kl0Var.O0, kl0Var.P0, 2, kl0Var.F0, kl0Var.H0, kl0Var.I0, null, kl0Var.f48715y0, kl0Var.J0, kl0Var.V0, null, kl0Var.f48706s0, kl0Var.X0);
                        kl0Var3.f48684d1 = kl0Var.f48684d1;
                        kl0Var3.f48687e1 = kl0Var.f48687e1;
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
