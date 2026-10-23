package org.telegram.ui.Components;

import android.content.Context;
import android.content.DialogInterface;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class a3 implements DialogInterface.OnClickListener {
    public final int f24610a;
    public final Object f24611b;
    public final Object f24612c;
    public final Object d;
    public final Object e;

    public a3(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f24610a = i10;
        this.f24611b = obj;
        this.f24612c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        int i11;
        switch (this.f24610a) {
            case 0:
                Context context = (Context) this.f24612c;
                ci.b bVar = (ci.b) this.d;
                z2 z2Var = (z2) this.e;
                int i12 = ((int[]) this.f24611b)[i10];
                if (i12 == 100) {
                    new q4(context, i12, bVar, z2Var).show();
                    return;
                } else {
                    z2Var.run(Integer.valueOf(i12), "");
                    return;
                }
            default:
                org.telegram.ui.io0 io0Var = (org.telegram.ui.io0) this.f24611b;
                ArrayList arrayList = (ArrayList) this.d;
                ArrayList arrayList2 = (ArrayList) this.e;
                org.telegram.ui.un0 un0Var = new org.telegram.ui.un0(io0Var, (Runnable) this.f24612c);
                TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard = io0Var.f38326y0;
                if (tL_paymentSavedCredentialsCard == null && io0Var.f38324x0 == null) {
                    i11 = 0;
                } else {
                    i11 = 1;
                }
                if ((tL_paymentSavedCredentialsCard == null && io0Var.f38324x0 == null) || i10 != 0) {
                    if (i10 >= i11 && i10 < arrayList.size() + i11) {
                        TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard2 = (TLRPC.TL_paymentSavedCredentialsCard) arrayList.get(i10 - i11);
                        io0Var.f38326y0 = tL_paymentSavedCredentialsCard2;
                        un0Var.c(null, tL_paymentSavedCredentialsCard2.title, true, null, tL_paymentSavedCredentialsCard2);
                        return;
                    } else if (i10 < arrayList2.size() - 1) {
                        org.telegram.ui.io0 io0Var2 = new org.telegram.ui.io0(io0Var.f38292b1, io0Var.C0, io0Var.N0, io0Var.O0, 2, io0Var.E0, io0Var.G0, io0Var.H0, null, io0Var.f38324x0, io0Var.I0, io0Var.U0, null, io0Var.f38315r0, io0Var.W0);
                        io0Var2.f38295c1 = io0Var.f38295c1;
                        io0Var2.f38297d1 = io0Var.f38297d1;
                        io0Var2.F0 = io0Var.C0.additional_methods.get((i10 - arrayList.size()) - i11);
                        io0Var2.T = un0Var;
                        io0Var.presentFragment(io0Var2);
                        return;
                    } else if (i10 == arrayList2.size() - 1) {
                        org.telegram.ui.io0 io0Var3 = new org.telegram.ui.io0(io0Var.f38292b1, io0Var.C0, io0Var.N0, io0Var.O0, 2, io0Var.E0, io0Var.G0, io0Var.H0, null, io0Var.f38324x0, io0Var.I0, io0Var.U0, null, io0Var.f38315r0, io0Var.W0);
                        io0Var3.f38295c1 = io0Var.f38295c1;
                        io0Var3.f38297d1 = io0Var.f38297d1;
                        io0Var3.T = un0Var;
                        io0Var.presentFragment(io0Var3);
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }
}
