package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class a20 implements Runnable {
    public final int f31709a;
    public final c20 f31710b;
    public final String f31711c;
    public final int d;

    public a20(c20 c20Var, String str, int i3, int i10) {
        this.f31709a = i10;
        this.f31710b = c20Var;
        this.f31711c = str;
        this.d = i3;
    }

    @Override
    public final void run() {
        long j10;
        switch (this.f31709a) {
            case 0:
                c20 c20Var = this.f31710b;
                String str = this.f31711c;
                int i3 = this.d;
                if (c20Var.f32507e != null) {
                    c20Var.f32507e = null;
                    org.telegram.messenger.g0.h3(new a20(c20Var, str, i3, 1));
                    return;
                }
                return;
            default:
                c20 c20Var2 = this.f31710b;
                String str2 = this.f31711c;
                int i10 = this.d;
                ArrayList arrayList = null;
                c20Var2.f32507e = null;
                if (!org.telegram.messenger.t3.T(c20Var2.f32513x.N1) && c20Var2.f32513x.O1 != null) {
                    arrayList = new ArrayList(c20Var2.f32513x.O1.participants.participants);
                }
                ArrayList arrayList2 = arrayList;
                if (arrayList2 != null) {
                    Utilities.f21389g.c(new bi.q0(c20Var2, str2, i10, arrayList2, 25));
                } else {
                    c20Var2.h = false;
                }
                kg.v1 v1Var = c20Var2.d;
                boolean w10 = org.telegram.messenger.t3.w(3, c20Var2.f32513x.N1);
                if (org.telegram.messenger.t3.T(c20Var2.f32513x.N1)) {
                    j10 = c20Var2.f32513x.N1.f27001id;
                } else {
                    j10 = 0;
                }
                v1Var.g(str2, w10, false, true, false, j10, false, 2, i10);
                return;
        }
    }
}
