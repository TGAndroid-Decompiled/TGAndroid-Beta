package org.telegram.ui.Components;

import android.content.Context;
import android.content.DialogInterface;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class c3 implements DialogInterface.OnClickListener {
    public final int f23623a;
    public final Object f23624b;
    public final Object f23625c;
    public final Object d;
    public final Object e;

    public c3(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f23623a = i10;
        this.f23624b = obj;
        this.f23625c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        int i11;
        switch (this.f23623a) {
            case 0:
                Context context = (Context) this.f23625c;
                bi.b bVar = (bi.b) this.d;
                b3 b3Var = (b3) this.e;
                int i12 = ((int[]) this.f23624b)[i10];
                if (i12 == 100) {
                    new s4(context, i12, bVar, b3Var).show();
                    return;
                } else {
                    b3Var.run(Integer.valueOf(i12), "");
                    return;
                }
            default:
                org.telegram.ui.ap0 ap0Var = (org.telegram.ui.ap0) this.f23624b;
                ArrayList arrayList = (ArrayList) this.d;
                ArrayList arrayList2 = (ArrayList) this.e;
                org.telegram.ui.mo0 mo0Var = new org.telegram.ui.mo0(ap0Var, (Runnable) this.f23625c);
                TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard = ap0Var.f34046y0;
                if (tL_paymentSavedCredentialsCard == null && ap0Var.f34044x0 == null) {
                    i11 = 0;
                } else {
                    i11 = 1;
                }
                if ((tL_paymentSavedCredentialsCard == null && ap0Var.f34044x0 == null) || i10 != 0) {
                    if (i10 >= i11 && i10 < arrayList.size() + i11) {
                        TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard2 = (TLRPC.TL_paymentSavedCredentialsCard) arrayList.get(i10 - i11);
                        ap0Var.f34046y0 = tL_paymentSavedCredentialsCard2;
                        mo0Var.c(null, tL_paymentSavedCredentialsCard2.title, true, null, tL_paymentSavedCredentialsCard2);
                        return;
                    } else if (i10 < arrayList2.size() - 1) {
                        org.telegram.ui.ap0 ap0Var2 = new org.telegram.ui.ap0(ap0Var.f34012b1, ap0Var.C0, ap0Var.N0, ap0Var.O0, 2, ap0Var.E0, ap0Var.G0, ap0Var.H0, null, ap0Var.f34044x0, ap0Var.I0, ap0Var.U0, null, ap0Var.f34035r0, ap0Var.W0);
                        ap0Var2.f34015c1 = ap0Var.f34015c1;
                        ap0Var2.f34017d1 = ap0Var.f34017d1;
                        ap0Var2.F0 = ap0Var.C0.additional_methods.get((i10 - arrayList.size()) - i11);
                        ap0Var2.T = mo0Var;
                        ap0Var.presentFragment(ap0Var2);
                        return;
                    } else if (i10 == arrayList2.size() - 1) {
                        org.telegram.ui.ap0 ap0Var3 = new org.telegram.ui.ap0(ap0Var.f34012b1, ap0Var.C0, ap0Var.N0, ap0Var.O0, 2, ap0Var.E0, ap0Var.G0, ap0Var.H0, null, ap0Var.f34044x0, ap0Var.I0, ap0Var.U0, null, ap0Var.f34035r0, ap0Var.W0);
                        ap0Var3.f34015c1 = ap0Var.f34015c1;
                        ap0Var3.f34017d1 = ap0Var.f34017d1;
                        ap0Var3.T = mo0Var;
                        ap0Var.presentFragment(ap0Var3);
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }
}
