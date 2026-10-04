package org.telegram.ui.Components;

import android.content.Context;
import android.content.DialogInterface;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class a3 implements DialogInterface.OnClickListener {
    public final int f24446a;
    public final Object f24447b;
    public final Object f24448c;
    public final Object d;
    public final Object f24449e;

    public a3(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f24446a = i10;
        this.f24447b = obj;
        this.f24448c = obj2;
        this.d = obj3;
        this.f24449e = obj4;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        int i11;
        switch (this.f24446a) {
            case 0:
                Context context = (Context) this.f24448c;
                ai.d dVar = (ai.d) this.d;
                z2 z2Var = (z2) this.f24449e;
                int i12 = ((int[]) this.f24447b)[i10];
                if (i12 == 100) {
                    new q4(context, i12, dVar, z2Var).show();
                    return;
                } else {
                    z2Var.run(Integer.valueOf(i12), "");
                    return;
                }
            default:
                org.telegram.ui.so0 so0Var = (org.telegram.ui.so0) this.f24447b;
                ArrayList arrayList = (ArrayList) this.d;
                ArrayList arrayList2 = (ArrayList) this.f24449e;
                org.telegram.ui.eo0 eo0Var = new org.telegram.ui.eo0(so0Var, (Runnable) this.f24448c);
                TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard = so0Var.f40579y0;
                if (tL_paymentSavedCredentialsCard == null && so0Var.f40577x0 == null) {
                    i11 = 0;
                } else {
                    i11 = 1;
                }
                if ((tL_paymentSavedCredentialsCard == null && so0Var.f40577x0 == null) || i10 != 0) {
                    if (i10 >= i11 && i10 < arrayList.size() + i11) {
                        TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard2 = (TLRPC.TL_paymentSavedCredentialsCard) arrayList.get(i10 - i11);
                        so0Var.f40579y0 = tL_paymentSavedCredentialsCard2;
                        eo0Var.c(null, tL_paymentSavedCredentialsCard2.title, true, null, tL_paymentSavedCredentialsCard2);
                        return;
                    } else if (i10 < arrayList2.size() - 1) {
                        org.telegram.ui.so0 so0Var2 = new org.telegram.ui.so0(so0Var.f40544b1, so0Var.C0, so0Var.N0, so0Var.O0, 2, so0Var.E0, so0Var.G0, so0Var.H0, null, so0Var.f40577x0, so0Var.I0, so0Var.U0, null, so0Var.f40568r0, so0Var.W0);
                        so0Var2.f40547c1 = so0Var.f40547c1;
                        so0Var2.f40549d1 = so0Var.f40549d1;
                        so0Var2.F0 = so0Var.C0.additional_methods.get((i10 - arrayList.size()) - i11);
                        so0Var2.T = eo0Var;
                        so0Var.presentFragment(so0Var2);
                        return;
                    } else if (i10 == arrayList2.size() - 1) {
                        org.telegram.ui.so0 so0Var3 = new org.telegram.ui.so0(so0Var.f40544b1, so0Var.C0, so0Var.N0, so0Var.O0, 2, so0Var.E0, so0Var.G0, so0Var.H0, null, so0Var.f40577x0, so0Var.I0, so0Var.U0, null, so0Var.f40568r0, so0Var.W0);
                        so0Var3.f40547c1 = so0Var.f40547c1;
                        so0Var3.f40549d1 = so0Var.f40549d1;
                        so0Var3.T = eo0Var;
                        so0Var.presentFragment(so0Var3);
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }
}
