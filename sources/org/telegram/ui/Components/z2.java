package org.telegram.ui.Components;

import android.content.Context;
import android.content.DialogInterface;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class z2 implements DialogInterface.OnClickListener {
    public final int f33128a;
    public final Object f33129b;
    public final Object f33130c;
    public final Object d;
    public final Object e;

    public z2(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f33128a = i10;
        this.f33129b = obj;
        this.f33130c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        int i11;
        switch (this.f33128a) {
            case 0:
                Context context = (Context) this.f33130c;
                ci.b bVar = (ci.b) this.d;
                y2 y2Var = (y2) this.e;
                int i12 = ((int[]) this.f33129b)[i10];
                if (i12 == 100) {
                    new p4(context, i12, bVar, y2Var).show();
                    return;
                } else {
                    y2Var.run(Integer.valueOf(i12), "");
                    return;
                }
            default:
                org.telegram.ui.ho0 ho0Var = (org.telegram.ui.ho0) this.f33129b;
                ArrayList arrayList = (ArrayList) this.d;
                ArrayList arrayList2 = (ArrayList) this.e;
                org.telegram.ui.tn0 tn0Var = new org.telegram.ui.tn0(ho0Var, (Runnable) this.f33130c);
                TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard = ho0Var.f37953y0;
                if (tL_paymentSavedCredentialsCard == null && ho0Var.f37951x0 == null) {
                    i11 = 0;
                } else {
                    i11 = 1;
                }
                if ((tL_paymentSavedCredentialsCard == null && ho0Var.f37951x0 == null) || i10 != 0) {
                    if (i10 >= i11 && i10 < arrayList.size() + i11) {
                        TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard2 = (TLRPC.TL_paymentSavedCredentialsCard) arrayList.get(i10 - i11);
                        ho0Var.f37953y0 = tL_paymentSavedCredentialsCard2;
                        tn0Var.c(null, tL_paymentSavedCredentialsCard2.title, true, null, tL_paymentSavedCredentialsCard2);
                        return;
                    } else if (i10 < arrayList2.size() - 1) {
                        org.telegram.ui.ho0 ho0Var2 = new org.telegram.ui.ho0(ho0Var.f37919b1, ho0Var.C0, ho0Var.N0, ho0Var.O0, 2, ho0Var.E0, ho0Var.G0, ho0Var.H0, null, ho0Var.f37951x0, ho0Var.I0, ho0Var.U0, null, ho0Var.f37942r0, ho0Var.W0);
                        ho0Var2.f37922c1 = ho0Var.f37922c1;
                        ho0Var2.f37924d1 = ho0Var.f37924d1;
                        ho0Var2.F0 = ho0Var.C0.additional_methods.get((i10 - arrayList.size()) - i11);
                        ho0Var2.T = tn0Var;
                        ho0Var.presentFragment(ho0Var2);
                        return;
                    } else if (i10 == arrayList2.size() - 1) {
                        org.telegram.ui.ho0 ho0Var3 = new org.telegram.ui.ho0(ho0Var.f37919b1, ho0Var.C0, ho0Var.N0, ho0Var.O0, 2, ho0Var.E0, ho0Var.G0, ho0Var.H0, null, ho0Var.f37951x0, ho0Var.I0, ho0Var.U0, null, ho0Var.f37942r0, ho0Var.W0);
                        ho0Var3.f37922c1 = ho0Var.f37922c1;
                        ho0Var3.f37924d1 = ho0Var.f37924d1;
                        ho0Var3.T = tn0Var;
                        ho0Var.presentFragment(ho0Var3);
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }
}
