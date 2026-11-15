package org.telegram.ui.Components;

import android.content.Context;
import android.content.DialogInterface;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class r2 implements DialogInterface.OnClickListener {
    public final int f38828a;
    public final Object f38829b;
    public final Object f38830c;
    public final Object d;
    public final Object f38831e;

    public r2(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.f38828a = i7;
        this.f38829b = obj;
        this.f38830c = obj2;
        this.d = obj3;
        this.f38831e = obj4;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i7) {
        int i10;
        switch (this.f38828a) {
            case 0:
                Context context = (Context) this.f38830c;
                fi.b bVar = (fi.b) this.d;
                bi.z zVar = (bi.z) this.f38831e;
                int i11 = ((int[]) this.f38829b)[i7];
                if (i11 == 100) {
                    new i4(context, i11, bVar, zVar).show();
                    return;
                } else {
                    zVar.a(Integer.valueOf(i11), "");
                    return;
                }
            default:
                org.telegram.ui.jl0 jl0Var = (org.telegram.ui.jl0) this.f38829b;
                ArrayList arrayList = (ArrayList) this.d;
                ArrayList arrayList2 = (ArrayList) this.f38831e;
                org.telegram.ui.zk0 zk0Var = new org.telegram.ui.zk0(jl0Var, (Runnable) this.f38830c);
                TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard = jl0Var.f48424z0;
                if (tL_paymentSavedCredentialsCard == null && jl0Var.f48423y0 == null) {
                    i10 = 0;
                } else {
                    i10 = 1;
                }
                if ((tL_paymentSavedCredentialsCard == null && jl0Var.f48423y0 == null) || i7 != 0) {
                    if (i7 >= i10 && i7 < arrayList.size() + i10) {
                        TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard2 = (TLRPC.TL_paymentSavedCredentialsCard) arrayList.get(i7 - i10);
                        jl0Var.f48424z0 = tL_paymentSavedCredentialsCard2;
                        zk0Var.c(null, tL_paymentSavedCredentialsCard2.title, true, null, tL_paymentSavedCredentialsCard2);
                        return;
                    } else if (i7 < arrayList2.size() - 1) {
                        org.telegram.ui.jl0 jl0Var2 = new org.telegram.ui.jl0(jl0Var.f48390c1, jl0Var.D0, jl0Var.O0, jl0Var.P0, 2, jl0Var.F0, jl0Var.H0, jl0Var.I0, null, jl0Var.f48423y0, jl0Var.J0, jl0Var.V0, null, jl0Var.f48414s0, jl0Var.X0);
                        jl0Var2.f48392d1 = jl0Var.f48392d1;
                        jl0Var2.f48395e1 = jl0Var.f48395e1;
                        jl0Var2.G0 = jl0Var.D0.additional_methods.get((i7 - arrayList.size()) - i10);
                        jl0Var2.U = zk0Var;
                        jl0Var.presentFragment(jl0Var2);
                        return;
                    } else if (i7 == arrayList2.size() - 1) {
                        org.telegram.ui.jl0 jl0Var3 = new org.telegram.ui.jl0(jl0Var.f48390c1, jl0Var.D0, jl0Var.O0, jl0Var.P0, 2, jl0Var.F0, jl0Var.H0, jl0Var.I0, null, jl0Var.f48423y0, jl0Var.J0, jl0Var.V0, null, jl0Var.f48414s0, jl0Var.X0);
                        jl0Var3.f48392d1 = jl0Var.f48392d1;
                        jl0Var3.f48395e1 = jl0Var.f48395e1;
                        jl0Var3.U = zk0Var;
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
