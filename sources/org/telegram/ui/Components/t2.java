package org.telegram.ui.Components;

import android.content.Context;
import android.content.DialogInterface;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class t2 implements DialogInterface.OnClickListener {
    public final int f38256a;
    public final Object f38257b;
    public final Object f38258c;
    public final Object d;
    public final Object f38259e;

    public t2(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.f38256a = i7;
        this.f38257b = obj;
        this.f38258c = obj2;
        this.d = obj3;
        this.f38259e = obj4;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i7) {
        int i10;
        switch (this.f38256a) {
            case 0:
                Context context = (Context) this.f38258c;
                di.b bVar = (di.b) this.d;
                ai.v0 v0Var = (ai.v0) this.f38259e;
                int i11 = ((int[]) this.f38257b)[i7];
                if (i11 == 100) {
                    new k4(context, i11, bVar, v0Var).show();
                    return;
                } else {
                    v0Var.a(Integer.valueOf(i11), "");
                    return;
                }
            default:
                org.telegram.ui.jl0 jl0Var = (org.telegram.ui.jl0) this.f38257b;
                ArrayList arrayList = (ArrayList) this.d;
                ArrayList arrayList2 = (ArrayList) this.f38259e;
                org.telegram.ui.zk0 zk0Var = new org.telegram.ui.zk0(jl0Var, (Runnable) this.f38258c);
                TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard = jl0Var.f47033y0;
                if (tL_paymentSavedCredentialsCard == null && jl0Var.f47031x0 == null) {
                    i10 = 0;
                } else {
                    i10 = 1;
                }
                if ((tL_paymentSavedCredentialsCard == null && jl0Var.f47031x0 == null) || i7 != 0) {
                    if (i7 >= i10 && i7 < arrayList.size() + i10) {
                        TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard2 = (TLRPC.TL_paymentSavedCredentialsCard) arrayList.get(i7 - i10);
                        jl0Var.f47033y0 = tL_paymentSavedCredentialsCard2;
                        zk0Var.c(null, tL_paymentSavedCredentialsCard2.title, true, null, tL_paymentSavedCredentialsCard2);
                        return;
                    } else if (i7 < arrayList2.size() - 1) {
                        org.telegram.ui.jl0 jl0Var2 = new org.telegram.ui.jl0(jl0Var.f46998b1, jl0Var.C0, jl0Var.N0, jl0Var.O0, 2, jl0Var.E0, jl0Var.G0, jl0Var.H0, null, jl0Var.f47031x0, jl0Var.I0, jl0Var.U0, null, jl0Var.f47022r0, jl0Var.W0);
                        jl0Var2.f47001c1 = jl0Var.f47001c1;
                        jl0Var2.f47003d1 = jl0Var.f47003d1;
                        jl0Var2.F0 = jl0Var.C0.additional_methods.get((i7 - arrayList.size()) - i10);
                        jl0Var2.T = zk0Var;
                        jl0Var.presentFragment(jl0Var2);
                        return;
                    } else if (i7 == arrayList2.size() - 1) {
                        org.telegram.ui.jl0 jl0Var3 = new org.telegram.ui.jl0(jl0Var.f46998b1, jl0Var.C0, jl0Var.N0, jl0Var.O0, 2, jl0Var.E0, jl0Var.G0, jl0Var.H0, null, jl0Var.f47031x0, jl0Var.I0, jl0Var.U0, null, jl0Var.f47022r0, jl0Var.W0);
                        jl0Var3.f47001c1 = jl0Var.f47001c1;
                        jl0Var3.f47003d1 = jl0Var.f47003d1;
                        jl0Var3.T = zk0Var;
                        jl0Var.presentFragment(jl0Var3);
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }
}
