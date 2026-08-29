package org.telegram.ui.Components;

import android.content.Context;
import android.content.DialogInterface;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class a3 implements DialogInterface.OnClickListener {
    public final int f26639a;
    public final Object f26640b;
    public final Object f26641c;
    public final Object d;
    public final Object f26642e;

    public a3(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f26639a = i10;
        this.f26640b = obj;
        this.f26641c = obj2;
        this.d = obj3;
        this.f26642e = obj4;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        int i11;
        switch (this.f26639a) {
            case 0:
                Context context = (Context) this.f26641c;
                lh.b bVar = (lh.b) this.d;
                ih.u uVar = (ih.u) this.f26642e;
                int i12 = ((int[]) this.f26640b)[i10];
                if (i12 == 100) {
                    new o4(context, i12, bVar, uVar).show();
                    return;
                } else {
                    uVar.run(Integer.valueOf(i12), "");
                    return;
                }
            default:
                org.telegram.ui.bo0 bo0Var = (org.telegram.ui.bo0) this.f26640b;
                ArrayList arrayList = (ArrayList) this.d;
                ArrayList arrayList2 = (ArrayList) this.f26642e;
                org.telegram.ui.on0 on0Var = new org.telegram.ui.on0(bo0Var, (Runnable) this.f26641c);
                TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard = bo0Var.f36867u0;
                if (tL_paymentSavedCredentialsCard == null && bo0Var.f36866t0 == null) {
                    i11 = 0;
                } else {
                    i11 = 1;
                }
                if ((tL_paymentSavedCredentialsCard == null && bo0Var.f36866t0 == null) || i10 != 0) {
                    if (i10 >= i11 && i10 < arrayList.size() + i11) {
                        TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard2 = (TLRPC.TL_paymentSavedCredentialsCard) arrayList.get(i10 - i11);
                        bo0Var.f36867u0 = tL_paymentSavedCredentialsCard2;
                        on0Var.c(null, tL_paymentSavedCredentialsCard2.title, true, null, tL_paymentSavedCredentialsCard2);
                        return;
                    } else if (i10 < arrayList2.size() - 1) {
                        org.telegram.ui.bo0 bo0Var2 = new org.telegram.ui.bo0(bo0Var.X0, bo0Var.f36874y0, bo0Var.J0, bo0Var.K0, 2, bo0Var.A0, bo0Var.C0, bo0Var.D0, null, bo0Var.f36866t0, bo0Var.E0, bo0Var.Q0, null, bo0Var.f36858n0, bo0Var.S0);
                        bo0Var2.Y0 = bo0Var.Y0;
                        bo0Var2.Z0 = bo0Var.Z0;
                        bo0Var2.B0 = bo0Var.f36874y0.additional_methods.get((i10 - arrayList.size()) - i11);
                        bo0Var2.P = on0Var;
                        bo0Var.presentFragment(bo0Var2);
                        return;
                    } else if (i10 == arrayList2.size() - 1) {
                        org.telegram.ui.bo0 bo0Var3 = new org.telegram.ui.bo0(bo0Var.X0, bo0Var.f36874y0, bo0Var.J0, bo0Var.K0, 2, bo0Var.A0, bo0Var.C0, bo0Var.D0, null, bo0Var.f36866t0, bo0Var.E0, bo0Var.Q0, null, bo0Var.f36858n0, bo0Var.S0);
                        bo0Var3.Y0 = bo0Var.Y0;
                        bo0Var3.Z0 = bo0Var.Z0;
                        bo0Var3.P = on0Var;
                        bo0Var.presentFragment(bo0Var3);
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }
}
