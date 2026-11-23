package org.telegram.ui.Components;

import j$.util.Objects;
import java.util.ArrayList;
public final class u01 implements org.telegram.messenger.t10 {
    public final g11 f40184a;
    public final String f40185b;
    public final long f40186c;
    public final Boolean d;

    public u01(g11 g11Var, String str, long j3, Boolean bool) {
        this.f40184a = g11Var;
        this.f40185b = str;
        this.f40186c = j3;
        this.d = bool;
    }

    @Override
    public final void a(Object obj, Object obj2, Object obj3) {
        ArrayList arrayList = (ArrayList) obj;
        org.telegram.messenger.e00 e00Var = (org.telegram.messenger.e00) obj2;
        Integer num = (Integer) obj3;
        g11 g11Var = this.f40184a;
        ArrayList arrayList2 = g11Var.N;
        boolean z10 = false;
        g11Var.O = 0;
        if (this.f40185b.equals(g11Var.M)) {
            if (this.f40186c == g11Var.V) {
                if (Objects.equals(this.d, g11Var.W)) {
                    arrayList2.addAll(arrayList);
                    g11Var.Q = e00Var;
                    g11Var.R = (e00Var == null || arrayList2.size() >= num.intValue()) ? true : true;
                    g11Var.n();
                }
            }
        }
    }
}
