package org.telegram.ui.Components;

import android.content.Context;
import android.content.DialogInterface;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class a3 implements DialogInterface.OnClickListener {
    public final int f21363a;
    public final Object f21364b;
    public final Object f21365c;
    public final Object d;
    public final Object e;

    public a3(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f21363a = i10;
        this.f21364b = obj;
        this.f21365c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        int i11;
        switch (this.f21363a) {
            case 0:
                Context context = (Context) this.f21365c;
                zh.b bVar = (zh.b) this.d;
                z2 z2Var = (z2) this.e;
                int i12 = ((int[]) this.f21364b)[i10];
                if (i12 == 100) {
                    new p4(context, i12, bVar, z2Var).show();
                    return;
                } else {
                    z2Var.run(Integer.valueOf(i12), "");
                    return;
                }
            default:
                org.telegram.ui.wo0 wo0Var = (org.telegram.ui.wo0) this.f21364b;
                ArrayList arrayList = (ArrayList) this.d;
                ArrayList arrayList2 = (ArrayList) this.e;
                org.telegram.ui.io0 io0Var = new org.telegram.ui.io0(wo0Var, (Runnable) this.f21365c);
                TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard = wo0Var.f38293y0;
                if (tL_paymentSavedCredentialsCard == null && wo0Var.f38291x0 == null) {
                    i11 = 0;
                } else {
                    i11 = 1;
                }
                if ((tL_paymentSavedCredentialsCard == null && wo0Var.f38291x0 == null) || i10 != 0) {
                    if (i10 >= i11 && i10 < arrayList.size() + i11) {
                        TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard2 = (TLRPC.TL_paymentSavedCredentialsCard) arrayList.get(i10 - i11);
                        wo0Var.f38293y0 = tL_paymentSavedCredentialsCard2;
                        io0Var.c(null, tL_paymentSavedCredentialsCard2.title, true, null, tL_paymentSavedCredentialsCard2);
                        return;
                    } else if (i10 < arrayList2.size() - 1) {
                        org.telegram.ui.wo0 wo0Var2 = new org.telegram.ui.wo0(wo0Var.f38259b1, wo0Var.C0, wo0Var.N0, wo0Var.O0, 2, wo0Var.E0, wo0Var.G0, wo0Var.H0, null, wo0Var.f38291x0, wo0Var.I0, wo0Var.U0, null, wo0Var.f38282r0, wo0Var.W0);
                        wo0Var2.f38262c1 = wo0Var.f38262c1;
                        wo0Var2.f38264d1 = wo0Var.f38264d1;
                        wo0Var2.F0 = wo0Var.C0.additional_methods.get((i10 - arrayList.size()) - i11);
                        wo0Var2.T = io0Var;
                        wo0Var.presentFragment(wo0Var2);
                        return;
                    } else if (i10 == arrayList2.size() - 1) {
                        org.telegram.ui.wo0 wo0Var3 = new org.telegram.ui.wo0(wo0Var.f38259b1, wo0Var.C0, wo0Var.N0, wo0Var.O0, 2, wo0Var.E0, wo0Var.G0, wo0Var.H0, null, wo0Var.f38291x0, wo0Var.I0, wo0Var.U0, null, wo0Var.f38282r0, wo0Var.W0);
                        wo0Var3.f38262c1 = wo0Var.f38262c1;
                        wo0Var3.f38264d1 = wo0Var.f38264d1;
                        wo0Var3.T = io0Var;
                        wo0Var.presentFragment(wo0Var3);
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }
}
