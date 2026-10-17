package org.telegram.ui.Components;

import android.content.Context;
import android.content.DialogInterface;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class b3 implements DialogInterface.OnClickListener {
    public final int f24779a;
    public final Object f24780b;
    public final Object f24781c;
    public final Object d;
    public final Object e;

    public b3(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f24779a = i10;
        this.f24780b = obj;
        this.f24781c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        int i11;
        switch (this.f24779a) {
            case 0:
                Context context = (Context) this.f24781c;
                ci.b bVar = (ci.b) this.d;
                a3 a3Var = (a3) this.e;
                int i12 = ((int[]) this.f24780b)[i10];
                if (i12 == 100) {
                    new r4(context, i12, bVar, a3Var).show();
                    return;
                } else {
                    a3Var.run(Integer.valueOf(i12), "");
                    return;
                }
            default:
                org.telegram.ui.fo0 fo0Var = (org.telegram.ui.fo0) this.f24780b;
                ArrayList arrayList = (ArrayList) this.d;
                ArrayList arrayList2 = (ArrayList) this.e;
                org.telegram.ui.rn0 rn0Var = new org.telegram.ui.rn0(fo0Var, (Runnable) this.f24781c);
                TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard = fo0Var.f37009y0;
                if (tL_paymentSavedCredentialsCard == null && fo0Var.f37007x0 == null) {
                    i11 = 0;
                } else {
                    i11 = 1;
                }
                if ((tL_paymentSavedCredentialsCard == null && fo0Var.f37007x0 == null) || i10 != 0) {
                    if (i10 >= i11 && i10 < arrayList.size() + i11) {
                        TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard2 = (TLRPC.TL_paymentSavedCredentialsCard) arrayList.get(i10 - i11);
                        fo0Var.f37009y0 = tL_paymentSavedCredentialsCard2;
                        rn0Var.c(null, tL_paymentSavedCredentialsCard2.title, true, null, tL_paymentSavedCredentialsCard2);
                        return;
                    } else if (i10 < arrayList2.size() - 1) {
                        org.telegram.ui.fo0 fo0Var2 = new org.telegram.ui.fo0(fo0Var.f36975b1, fo0Var.C0, fo0Var.N0, fo0Var.O0, 2, fo0Var.E0, fo0Var.G0, fo0Var.H0, null, fo0Var.f37007x0, fo0Var.I0, fo0Var.U0, null, fo0Var.f36998r0, fo0Var.W0);
                        fo0Var2.f36978c1 = fo0Var.f36978c1;
                        fo0Var2.f36980d1 = fo0Var.f36980d1;
                        fo0Var2.F0 = fo0Var.C0.additional_methods.get((i10 - arrayList.size()) - i11);
                        fo0Var2.T = rn0Var;
                        fo0Var.presentFragment(fo0Var2);
                        return;
                    } else if (i10 == arrayList2.size() - 1) {
                        org.telegram.ui.fo0 fo0Var3 = new org.telegram.ui.fo0(fo0Var.f36975b1, fo0Var.C0, fo0Var.N0, fo0Var.O0, 2, fo0Var.E0, fo0Var.G0, fo0Var.H0, null, fo0Var.f37007x0, fo0Var.I0, fo0Var.U0, null, fo0Var.f36998r0, fo0Var.W0);
                        fo0Var3.f36978c1 = fo0Var.f36978c1;
                        fo0Var3.f36980d1 = fo0Var.f36980d1;
                        fo0Var3.T = rn0Var;
                        fo0Var.presentFragment(fo0Var3);
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }
}
