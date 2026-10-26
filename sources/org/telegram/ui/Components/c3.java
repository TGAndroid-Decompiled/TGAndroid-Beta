package org.telegram.ui.Components;

import android.content.Context;
import android.content.DialogInterface;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class c3 implements DialogInterface.OnClickListener {
    public final int f27042a;
    public final Object f27043b;
    public final Object f27044c;
    public final Object d;
    public final Object e;

    public c3(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f27042a = i10;
        this.f27043b = obj;
        this.f27044c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        int i11;
        switch (this.f27042a) {
            case 0:
                Context context = (Context) this.f27044c;
                di.b bVar = (di.b) this.d;
                ai.c1 c1Var = (ai.c1) this.e;
                int i12 = ((int[]) this.f27043b)[i10];
                if (i12 == 100) {
                    new s4(context, i12, bVar, c1Var).show();
                    return;
                } else {
                    c1Var.run(Integer.valueOf(i12), "");
                    return;
                }
            default:
                org.telegram.ui.po0 po0Var = (org.telegram.ui.po0) this.f27043b;
                ArrayList arrayList = (ArrayList) this.d;
                ArrayList arrayList2 = (ArrayList) this.e;
                org.telegram.ui.bo0 bo0Var = new org.telegram.ui.bo0(po0Var, (Runnable) this.f27044c);
                TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard = po0Var.f42625y0;
                if (tL_paymentSavedCredentialsCard == null && po0Var.f42623x0 == null) {
                    i11 = 0;
                } else {
                    i11 = 1;
                }
                if ((tL_paymentSavedCredentialsCard == null && po0Var.f42623x0 == null) || i10 != 0) {
                    if (i10 >= i11 && i10 < arrayList.size() + i11) {
                        TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard2 = (TLRPC.TL_paymentSavedCredentialsCard) arrayList.get(i10 - i11);
                        po0Var.f42625y0 = tL_paymentSavedCredentialsCard2;
                        bo0Var.c(null, tL_paymentSavedCredentialsCard2.title, true, null, tL_paymentSavedCredentialsCard2);
                        return;
                    } else if (i10 < arrayList2.size() - 1) {
                        org.telegram.ui.po0 po0Var2 = new org.telegram.ui.po0(po0Var.f42591b1, po0Var.C0, po0Var.N0, po0Var.O0, 2, po0Var.E0, po0Var.G0, po0Var.H0, null, po0Var.f42623x0, po0Var.I0, po0Var.U0, null, po0Var.f42614r0, po0Var.W0);
                        po0Var2.f42594c1 = po0Var.f42594c1;
                        po0Var2.f42596d1 = po0Var.f42596d1;
                        po0Var2.F0 = po0Var.C0.additional_methods.get((i10 - arrayList.size()) - i11);
                        po0Var2.T = bo0Var;
                        po0Var.presentFragment(po0Var2);
                        return;
                    } else if (i10 == arrayList2.size() - 1) {
                        org.telegram.ui.po0 po0Var3 = new org.telegram.ui.po0(po0Var.f42591b1, po0Var.C0, po0Var.N0, po0Var.O0, 2, po0Var.E0, po0Var.G0, po0Var.H0, null, po0Var.f42623x0, po0Var.I0, po0Var.U0, null, po0Var.f42614r0, po0Var.W0);
                        po0Var3.f42594c1 = po0Var.f42594c1;
                        po0Var3.f42596d1 = po0Var.f42596d1;
                        po0Var3.T = bo0Var;
                        po0Var.presentFragment(po0Var3);
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }
}
