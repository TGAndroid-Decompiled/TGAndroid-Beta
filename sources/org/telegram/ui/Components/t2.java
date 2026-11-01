package org.telegram.ui.Components;

import android.content.Context;
import android.content.DialogInterface;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class t2 implements DialogInterface.OnClickListener {
    public final int f30498a;
    public final Object f30499b;
    public final Object f30500c;
    public final Object d;
    public final Object e;

    public t2(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f30498a = i10;
        this.f30499b = obj;
        this.f30500c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        int i11;
        switch (this.f30498a) {
            case 0:
                Context context = (Context) this.f30500c;
                th.b bVar = (th.b) this.d;
                s2 s2Var = (s2) this.e;
                int i12 = ((int[]) this.f30499b)[i10];
                if (i12 == 100) {
                    new h4(context, i12, bVar, s2Var).show();
                    return;
                } else {
                    s2Var.a(Integer.valueOf(i12), "");
                    return;
                }
            default:
                org.telegram.ui.qm0 qm0Var = (org.telegram.ui.qm0) this.f30499b;
                ArrayList arrayList = (ArrayList) this.d;
                ArrayList arrayList2 = (ArrayList) this.e;
                org.telegram.ui.fm0 fm0Var = new org.telegram.ui.fm0(qm0Var, (Runnable) this.f30500c);
                TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard = qm0Var.f40851y0;
                if (tL_paymentSavedCredentialsCard == null && qm0Var.f40849x0 == null) {
                    i11 = 0;
                } else {
                    i11 = 1;
                }
                if ((tL_paymentSavedCredentialsCard == null && qm0Var.f40849x0 == null) || i10 != 0) {
                    if (i10 >= i11 && i10 < arrayList.size() + i11) {
                        TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard2 = (TLRPC.TL_paymentSavedCredentialsCard) arrayList.get(i10 - i11);
                        qm0Var.f40851y0 = tL_paymentSavedCredentialsCard2;
                        fm0Var.c(null, tL_paymentSavedCredentialsCard2.title, true, null, tL_paymentSavedCredentialsCard2);
                        return;
                    } else if (i10 < arrayList2.size() - 1) {
                        org.telegram.ui.qm0 qm0Var2 = new org.telegram.ui.qm0(qm0Var.f40817b1, qm0Var.C0, qm0Var.N0, qm0Var.O0, 2, qm0Var.E0, qm0Var.G0, qm0Var.H0, null, qm0Var.f40849x0, qm0Var.I0, qm0Var.U0, null, qm0Var.f40840r0, qm0Var.W0);
                        qm0Var2.f40820c1 = qm0Var.f40820c1;
                        qm0Var2.f40822d1 = qm0Var.f40822d1;
                        qm0Var2.F0 = qm0Var.C0.additional_methods.get((i10 - arrayList.size()) - i11);
                        qm0Var2.T = fm0Var;
                        qm0Var.presentFragment(qm0Var2);
                        return;
                    } else if (i10 == arrayList2.size() - 1) {
                        org.telegram.ui.qm0 qm0Var3 = new org.telegram.ui.qm0(qm0Var.f40817b1, qm0Var.C0, qm0Var.N0, qm0Var.O0, 2, qm0Var.E0, qm0Var.G0, qm0Var.H0, null, qm0Var.f40849x0, qm0Var.I0, qm0Var.U0, null, qm0Var.f40840r0, qm0Var.W0);
                        qm0Var3.f40820c1 = qm0Var.f40820c1;
                        qm0Var3.f40822d1 = qm0Var.f40822d1;
                        qm0Var3.T = fm0Var;
                        qm0Var.presentFragment(qm0Var3);
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }
}
