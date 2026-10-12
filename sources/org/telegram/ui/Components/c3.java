package org.telegram.ui.Components;

import android.content.Context;
import android.content.DialogInterface;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class c3 implements DialogInterface.OnClickListener {
    public final int f24793a;
    public final Object f24794b;
    public final Object f24795c;
    public final Object d;
    public final Object f24796e;

    public c3(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f24793a = i10;
        this.f24794b = obj;
        this.f24795c = obj2;
        this.d = obj3;
        this.f24796e = obj4;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        int i11;
        switch (this.f24793a) {
            case 0:
                Context context = (Context) this.f24795c;
                ai.d dVar = (ai.d) this.d;
                b3 b3Var = (b3) this.f24796e;
                int i12 = ((int[]) this.f24794b)[i10];
                if (i12 == 100) {
                    new s4(context, i12, dVar, b3Var).show();
                    return;
                } else {
                    b3Var.run(Integer.valueOf(i12), "");
                    return;
                }
            default:
                org.telegram.ui.xo0 xo0Var = (org.telegram.ui.xo0) this.f24794b;
                ArrayList arrayList = (ArrayList) this.d;
                ArrayList arrayList2 = (ArrayList) this.f24796e;
                org.telegram.ui.jo0 jo0Var = new org.telegram.ui.jo0(xo0Var, (Runnable) this.f24795c);
                TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard = xo0Var.f44130y0;
                if (tL_paymentSavedCredentialsCard == null && xo0Var.f44128x0 == null) {
                    i11 = 0;
                } else {
                    i11 = 1;
                }
                if ((tL_paymentSavedCredentialsCard == null && xo0Var.f44128x0 == null) || i10 != 0) {
                    if (i10 >= i11 && i10 < arrayList.size() + i11) {
                        TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard2 = (TLRPC.TL_paymentSavedCredentialsCard) arrayList.get(i10 - i11);
                        xo0Var.f44130y0 = tL_paymentSavedCredentialsCard2;
                        jo0Var.c(null, tL_paymentSavedCredentialsCard2.title, true, null, tL_paymentSavedCredentialsCard2);
                        return;
                    } else if (i10 < arrayList2.size() - 1) {
                        org.telegram.ui.xo0 xo0Var2 = new org.telegram.ui.xo0(xo0Var.f44095b1, xo0Var.C0, xo0Var.N0, xo0Var.O0, 2, xo0Var.E0, xo0Var.G0, xo0Var.H0, null, xo0Var.f44128x0, xo0Var.I0, xo0Var.U0, null, xo0Var.f44119r0, xo0Var.W0);
                        xo0Var2.f44098c1 = xo0Var.f44098c1;
                        xo0Var2.f44100d1 = xo0Var.f44100d1;
                        xo0Var2.F0 = xo0Var.C0.additional_methods.get((i10 - arrayList.size()) - i11);
                        xo0Var2.T = jo0Var;
                        xo0Var.presentFragment(xo0Var2);
                        return;
                    } else if (i10 == arrayList2.size() - 1) {
                        org.telegram.ui.xo0 xo0Var3 = new org.telegram.ui.xo0(xo0Var.f44095b1, xo0Var.C0, xo0Var.N0, xo0Var.O0, 2, xo0Var.E0, xo0Var.G0, xo0Var.H0, null, xo0Var.f44128x0, xo0Var.I0, xo0Var.U0, null, xo0Var.f44119r0, xo0Var.W0);
                        xo0Var3.f44098c1 = xo0Var.f44098c1;
                        xo0Var3.f44100d1 = xo0Var.f44100d1;
                        xo0Var3.T = jo0Var;
                        xo0Var.presentFragment(xo0Var3);
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }
}
