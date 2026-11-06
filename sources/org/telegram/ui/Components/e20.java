package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class e20 implements Runnable {
    public final int f33099a;
    public final g20 f33100b;
    public final String f33101c;
    public final int d;

    public e20(g20 g20Var, String str, int i7, int i10) {
        this.f33099a = i10;
        this.f33100b = g20Var;
        this.f33101c = str;
        this.d = i7;
    }

    @Override
    public final void run() {
        long j3;
        switch (this.f33099a) {
            case 0:
                g20 g20Var = this.f33100b;
                String str = this.f33101c;
                int i7 = this.d;
                if (g20Var.f33804e != null) {
                    g20Var.f33804e = null;
                    org.telegram.messenger.g0.h3(new e20(g20Var, str, i7, 1));
                    return;
                }
                return;
            default:
                g20 g20Var2 = this.f33100b;
                String str2 = this.f33101c;
                int i10 = this.d;
                ArrayList arrayList = null;
                g20Var2.f33804e = null;
                if (!org.telegram.messenger.t3.T(g20Var2.f33810x.M1) && g20Var2.f33810x.N1 != null) {
                    arrayList = new ArrayList(g20Var2.f33810x.N1.participants.participants);
                }
                ArrayList arrayList2 = arrayList;
                if (arrayList2 != null) {
                    Utilities.f21335g.c(new ai.a1(g20Var2, str2, i10, arrayList2, 24));
                } else {
                    g20Var2.h = false;
                }
                jg.z1 z1Var = g20Var2.d;
                boolean w10 = org.telegram.messenger.t3.w(3, g20Var2.f33810x.M1);
                if (org.telegram.messenger.t3.T(g20Var2.f33810x.M1)) {
                    j3 = g20Var2.f33810x.M1.f26952id;
                } else {
                    j3 = 0;
                }
                z1Var.g(str2, w10, false, true, false, j3, false, 2, i10);
                return;
        }
    }
}
