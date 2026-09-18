package org.telegram.ui.Components;

import android.content.Context;
import android.content.DialogInterface;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class z2 implements DialogInterface.OnClickListener {
    public final int f30373a;
    public final Object f30374b;
    public final Object f30375c;
    public final Object d;
    public final Object e;

    public z2(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f30373a = i10;
        this.f30374b = obj;
        this.f30375c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        int i11;
        switch (this.f30373a) {
            case 0:
                Context context = (Context) this.f30375c;
                ai.d dVar = (ai.d) this.d;
                y2 y2Var = (y2) this.e;
                int i12 = ((int[]) this.f30374b)[i10];
                if (i12 == 100) {
                    new o4(context, i12, dVar, y2Var).show();
                    return;
                } else {
                    y2Var.run(Integer.valueOf(i12), "");
                    return;
                }
            default:
                org.telegram.ui.yo0 yo0Var = (org.telegram.ui.yo0) this.f30374b;
                ArrayList arrayList = (ArrayList) this.d;
                ArrayList arrayList2 = (ArrayList) this.e;
                org.telegram.ui.ko0 ko0Var = new org.telegram.ui.ko0(yo0Var, (Runnable) this.f30375c);
                TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard = yo0Var.f39988y0;
                if (tL_paymentSavedCredentialsCard == null && yo0Var.f39986x0 == null) {
                    i11 = 0;
                } else {
                    i11 = 1;
                }
                if ((tL_paymentSavedCredentialsCard == null && yo0Var.f39986x0 == null) || i10 != 0) {
                    if (i10 >= i11 && i10 < arrayList.size() + i11) {
                        TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard2 = (TLRPC.TL_paymentSavedCredentialsCard) arrayList.get(i10 - i11);
                        yo0Var.f39988y0 = tL_paymentSavedCredentialsCard2;
                        ko0Var.c(null, tL_paymentSavedCredentialsCard2.title, true, null, tL_paymentSavedCredentialsCard2);
                        return;
                    } else if (i10 < arrayList2.size() - 1) {
                        org.telegram.ui.yo0 yo0Var2 = new org.telegram.ui.yo0(yo0Var.f39954b1, yo0Var.C0, yo0Var.N0, yo0Var.O0, 2, yo0Var.E0, yo0Var.G0, yo0Var.H0, null, yo0Var.f39986x0, yo0Var.I0, yo0Var.U0, null, yo0Var.f39977r0, yo0Var.W0);
                        yo0Var2.f39957c1 = yo0Var.f39957c1;
                        yo0Var2.f39959d1 = yo0Var.f39959d1;
                        yo0Var2.F0 = yo0Var.C0.additional_methods.get((i10 - arrayList.size()) - i11);
                        yo0Var2.T = ko0Var;
                        yo0Var.presentFragment(yo0Var2);
                        return;
                    } else if (i10 == arrayList2.size() - 1) {
                        org.telegram.ui.yo0 yo0Var3 = new org.telegram.ui.yo0(yo0Var.f39954b1, yo0Var.C0, yo0Var.N0, yo0Var.O0, 2, yo0Var.E0, yo0Var.G0, yo0Var.H0, null, yo0Var.f39986x0, yo0Var.I0, yo0Var.U0, null, yo0Var.f39977r0, yo0Var.W0);
                        yo0Var3.f39957c1 = yo0Var.f39957c1;
                        yo0Var3.f39959d1 = yo0Var.f39959d1;
                        yo0Var3.T = ko0Var;
                        yo0Var.presentFragment(yo0Var3);
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }
}
