package org.telegram.ui.Components;

import android.content.Context;
import android.content.DialogInterface;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class w2 implements DialogInterface.OnClickListener {
    public final int f34074a;
    public final Object f34075b;
    public final Object f34076c;
    public final Object d;
    public final Object f34077e;

    public w2(Object obj, Object obj2, Object obj3, Object obj4, int i9) {
        this.f34074a = i9;
        this.f34075b = obj;
        this.f34076c = obj2;
        this.d = obj3;
        this.f34077e = obj4;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i9) {
        int i10;
        switch (this.f34074a) {
            case 0:
                Context context = (Context) this.f34076c;
                ih.b bVar = (ih.b) this.d;
                fh.y yVar = (fh.y) this.f34077e;
                int i11 = ((int[]) this.f34075b)[i9];
                if (i11 == 100) {
                    new k4(context, i11, bVar, yVar).show();
                    return;
                } else {
                    yVar.run(Integer.valueOf(i11), "");
                    return;
                }
            default:
                org.telegram.ui.co0 co0Var = (org.telegram.ui.co0) this.f34075b;
                ArrayList arrayList = (ArrayList) this.d;
                ArrayList arrayList2 = (ArrayList) this.f34077e;
                org.telegram.ui.pn0 pn0Var = new org.telegram.ui.pn0(co0Var, (Runnable) this.f34076c);
                TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard = co0Var.f37274u0;
                if (tL_paymentSavedCredentialsCard == null && co0Var.f37273t0 == null) {
                    i10 = 0;
                } else {
                    i10 = 1;
                }
                if ((tL_paymentSavedCredentialsCard == null && co0Var.f37273t0 == null) || i9 != 0) {
                    if (i9 >= i10 && i9 < arrayList.size() + i10) {
                        TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard2 = (TLRPC.TL_paymentSavedCredentialsCard) arrayList.get(i9 - i10);
                        co0Var.f37274u0 = tL_paymentSavedCredentialsCard2;
                        pn0Var.c(null, tL_paymentSavedCredentialsCard2.title, true, null, tL_paymentSavedCredentialsCard2);
                        return;
                    } else if (i9 < arrayList2.size() - 1) {
                        org.telegram.ui.co0 co0Var2 = new org.telegram.ui.co0(co0Var.X0, co0Var.f37281y0, co0Var.J0, co0Var.K0, 2, co0Var.A0, co0Var.C0, co0Var.D0, null, co0Var.f37273t0, co0Var.E0, co0Var.Q0, null, co0Var.f37265n0, co0Var.S0);
                        co0Var2.Y0 = co0Var.Y0;
                        co0Var2.Z0 = co0Var.Z0;
                        co0Var2.B0 = co0Var.f37281y0.additional_methods.get((i9 - arrayList.size()) - i10);
                        co0Var2.P = pn0Var;
                        co0Var.presentFragment(co0Var2);
                        return;
                    } else if (i9 == arrayList2.size() - 1) {
                        org.telegram.ui.co0 co0Var3 = new org.telegram.ui.co0(co0Var.X0, co0Var.f37281y0, co0Var.J0, co0Var.K0, 2, co0Var.A0, co0Var.C0, co0Var.D0, null, co0Var.f37273t0, co0Var.E0, co0Var.Q0, null, co0Var.f37265n0, co0Var.S0);
                        co0Var3.Y0 = co0Var.Y0;
                        co0Var3.Z0 = co0Var.Z0;
                        co0Var3.P = pn0Var;
                        co0Var.presentFragment(co0Var3);
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }
}
