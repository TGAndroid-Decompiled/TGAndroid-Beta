package org.telegram.ui.Components;

import android.content.Context;
import android.content.DialogInterface;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class z2 implements DialogInterface.OnClickListener {
    public final int f30451a;
    public final Object f30452b;
    public final Object f30453c;
    public final Object d;
    public final Object e;

    public z2(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f30451a = i10;
        this.f30452b = obj;
        this.f30453c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        int i11;
        switch (this.f30451a) {
            case 0:
                Context context = (Context) this.f30453c;
                ai.d dVar = (ai.d) this.d;
                y2 y2Var = (y2) this.e;
                int i12 = ((int[]) this.f30452b)[i10];
                if (i12 == 100) {
                    new o4(context, i12, dVar, y2Var).show();
                    return;
                } else {
                    y2Var.run(Integer.valueOf(i12), "");
                    return;
                }
            default:
                org.telegram.ui.wo0 wo0Var = (org.telegram.ui.wo0) this.f30452b;
                ArrayList arrayList = (ArrayList) this.d;
                ArrayList arrayList2 = (ArrayList) this.e;
                org.telegram.ui.io0 io0Var = new org.telegram.ui.io0(wo0Var, (Runnable) this.f30453c);
                TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard = wo0Var.f39345y0;
                if (tL_paymentSavedCredentialsCard == null && wo0Var.f39343x0 == null) {
                    i11 = 0;
                } else {
                    i11 = 1;
                }
                if ((tL_paymentSavedCredentialsCard == null && wo0Var.f39343x0 == null) || i10 != 0) {
                    if (i10 >= i11 && i10 < arrayList.size() + i11) {
                        TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard2 = (TLRPC.TL_paymentSavedCredentialsCard) arrayList.get(i10 - i11);
                        wo0Var.f39345y0 = tL_paymentSavedCredentialsCard2;
                        io0Var.c(null, tL_paymentSavedCredentialsCard2.title, true, null, tL_paymentSavedCredentialsCard2);
                        return;
                    } else if (i10 < arrayList2.size() - 1) {
                        org.telegram.ui.wo0 wo0Var2 = new org.telegram.ui.wo0(wo0Var.f39311b1, wo0Var.C0, wo0Var.N0, wo0Var.O0, 2, wo0Var.E0, wo0Var.G0, wo0Var.H0, null, wo0Var.f39343x0, wo0Var.I0, wo0Var.U0, null, wo0Var.f39334r0, wo0Var.W0);
                        wo0Var2.f39314c1 = wo0Var.f39314c1;
                        wo0Var2.f39316d1 = wo0Var.f39316d1;
                        wo0Var2.F0 = wo0Var.C0.additional_methods.get((i10 - arrayList.size()) - i11);
                        wo0Var2.T = io0Var;
                        wo0Var.presentFragment(wo0Var2);
                        return;
                    } else if (i10 == arrayList2.size() - 1) {
                        org.telegram.ui.wo0 wo0Var3 = new org.telegram.ui.wo0(wo0Var.f39311b1, wo0Var.C0, wo0Var.N0, wo0Var.O0, 2, wo0Var.E0, wo0Var.G0, wo0Var.H0, null, wo0Var.f39343x0, wo0Var.I0, wo0Var.U0, null, wo0Var.f39334r0, wo0Var.W0);
                        wo0Var3.f39314c1 = wo0Var.f39314c1;
                        wo0Var3.f39316d1 = wo0Var.f39316d1;
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
