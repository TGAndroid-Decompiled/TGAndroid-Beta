package org.telegram.ui.Components;

import android.content.Context;
import android.content.DialogInterface;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class r2 implements DialogInterface.OnClickListener {
    public final int f37609a;
    public final Object f37610b;
    public final Object f37611c;
    public final Object d;
    public final Object f37612e;

    public r2(Object obj, Object obj2, Object obj3, Object obj4, int i3) {
        this.f37609a = i3;
        this.f37610b = obj;
        this.f37611c = obj2;
        this.d = obj3;
        this.f37612e = obj4;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i3) {
        int i10;
        switch (this.f37609a) {
            case 0:
                Context context = (Context) this.f37611c;
                ei.b bVar = (ei.b) this.d;
                ai.f0 f0Var = (ai.f0) this.f37612e;
                int i11 = ((int[]) this.f37610b)[i3];
                if (i11 == 100) {
                    new i4(context, i11, bVar, f0Var).show();
                    return;
                } else {
                    f0Var.a(Integer.valueOf(i11), "");
                    return;
                }
            default:
                org.telegram.ui.dl0 dl0Var = (org.telegram.ui.dl0) this.f37610b;
                ArrayList arrayList = (ArrayList) this.d;
                ArrayList arrayList2 = (ArrayList) this.f37612e;
                org.telegram.ui.tk0 tk0Var = new org.telegram.ui.tk0(dl0Var, (Runnable) this.f37611c);
                TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard = dl0Var.f44778z0;
                if (tL_paymentSavedCredentialsCard == null && dl0Var.f44777y0 == null) {
                    i10 = 0;
                } else {
                    i10 = 1;
                }
                if ((tL_paymentSavedCredentialsCard == null && dl0Var.f44777y0 == null) || i3 != 0) {
                    if (i3 >= i10 && i3 < arrayList.size() + i10) {
                        TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard2 = (TLRPC.TL_paymentSavedCredentialsCard) arrayList.get(i3 - i10);
                        dl0Var.f44778z0 = tL_paymentSavedCredentialsCard2;
                        tk0Var.c(null, tL_paymentSavedCredentialsCard2.title, true, null, tL_paymentSavedCredentialsCard2);
                        return;
                    } else if (i3 < arrayList2.size() - 1) {
                        org.telegram.ui.dl0 dl0Var2 = new org.telegram.ui.dl0(dl0Var.f44744c1, dl0Var.D0, dl0Var.O0, dl0Var.P0, 2, dl0Var.F0, dl0Var.H0, dl0Var.I0, null, dl0Var.f44777y0, dl0Var.J0, dl0Var.V0, null, dl0Var.f44768s0, dl0Var.X0);
                        dl0Var2.f44746d1 = dl0Var.f44746d1;
                        dl0Var2.f44749e1 = dl0Var.f44749e1;
                        dl0Var2.G0 = dl0Var.D0.additional_methods.get((i3 - arrayList.size()) - i10);
                        dl0Var2.U = tk0Var;
                        dl0Var.presentFragment(dl0Var2);
                        return;
                    } else if (i3 == arrayList2.size() - 1) {
                        org.telegram.ui.dl0 dl0Var3 = new org.telegram.ui.dl0(dl0Var.f44744c1, dl0Var.D0, dl0Var.O0, dl0Var.P0, 2, dl0Var.F0, dl0Var.H0, dl0Var.I0, null, dl0Var.f44777y0, dl0Var.J0, dl0Var.V0, null, dl0Var.f44768s0, dl0Var.X0);
                        dl0Var3.f44746d1 = dl0Var.f44746d1;
                        dl0Var3.f44749e1 = dl0Var.f44749e1;
                        dl0Var3.U = tk0Var;
                        dl0Var.presentFragment(dl0Var3);
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }
}
