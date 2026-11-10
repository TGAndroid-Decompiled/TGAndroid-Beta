package org.telegram.ui.Components;

import android.content.Context;
import android.content.DialogInterface;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class s2 implements DialogInterface.OnClickListener {
    public final int f37840a;
    public final Object f37841b;
    public final Object f37842c;
    public final Object d;
    public final Object f37843e;

    public s2(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.f37840a = i7;
        this.f37841b = obj;
        this.f37842c = obj2;
        this.d = obj3;
        this.f37843e = obj4;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i7) {
        int i10;
        switch (this.f37840a) {
            case 0:
                Context context = (Context) this.f37842c;
                di.b bVar = (di.b) this.d;
                ai.v0 v0Var = (ai.v0) this.f37843e;
                int i11 = ((int[]) this.f37841b)[i7];
                if (i11 == 100) {
                    new j4(context, i11, bVar, v0Var).show();
                    return;
                } else {
                    v0Var.a(Integer.valueOf(i11), "");
                    return;
                }
            default:
                org.telegram.ui.kl0 kl0Var = (org.telegram.ui.kl0) this.f37841b;
                ArrayList arrayList = (ArrayList) this.d;
                ArrayList arrayList2 = (ArrayList) this.f37843e;
                org.telegram.ui.al0 al0Var = new org.telegram.ui.al0(kl0Var, (Runnable) this.f37842c);
                TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard = kl0Var.f47365y0;
                if (tL_paymentSavedCredentialsCard == null && kl0Var.f47363x0 == null) {
                    i10 = 0;
                } else {
                    i10 = 1;
                }
                if ((tL_paymentSavedCredentialsCard == null && kl0Var.f47363x0 == null) || i7 != 0) {
                    if (i7 >= i10 && i7 < arrayList.size() + i10) {
                        TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard2 = (TLRPC.TL_paymentSavedCredentialsCard) arrayList.get(i7 - i10);
                        kl0Var.f47365y0 = tL_paymentSavedCredentialsCard2;
                        al0Var.c(null, tL_paymentSavedCredentialsCard2.title, true, null, tL_paymentSavedCredentialsCard2);
                        return;
                    } else if (i7 < arrayList2.size() - 1) {
                        org.telegram.ui.kl0 kl0Var2 = new org.telegram.ui.kl0(kl0Var.f47330b1, kl0Var.C0, kl0Var.N0, kl0Var.O0, 2, kl0Var.E0, kl0Var.G0, kl0Var.H0, null, kl0Var.f47363x0, kl0Var.I0, kl0Var.U0, null, kl0Var.f47354r0, kl0Var.W0);
                        kl0Var2.f47333c1 = kl0Var.f47333c1;
                        kl0Var2.f47335d1 = kl0Var.f47335d1;
                        kl0Var2.F0 = kl0Var.C0.additional_methods.get((i7 - arrayList.size()) - i10);
                        kl0Var2.T = al0Var;
                        kl0Var.presentFragment(kl0Var2);
                        return;
                    } else if (i7 == arrayList2.size() - 1) {
                        org.telegram.ui.kl0 kl0Var3 = new org.telegram.ui.kl0(kl0Var.f47330b1, kl0Var.C0, kl0Var.N0, kl0Var.O0, 2, kl0Var.E0, kl0Var.G0, kl0Var.H0, null, kl0Var.f47363x0, kl0Var.I0, kl0Var.U0, null, kl0Var.f47354r0, kl0Var.W0);
                        kl0Var3.f47333c1 = kl0Var.f47333c1;
                        kl0Var3.f47335d1 = kl0Var.f47335d1;
                        kl0Var3.T = al0Var;
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
