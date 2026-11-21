package org.telegram.ui.Components;

import j$.util.Objects;
import java.util.ArrayList;
public final class v01 implements org.telegram.messenger.s10 {
    public final h11 f40629a;
    public final String f40630b;
    public final long f40631c;
    public final Boolean d;

    public v01(h11 h11Var, String str, long j3, Boolean bool) {
        this.f40629a = h11Var;
        this.f40630b = str;
        this.f40631c = j3;
        this.d = bool;
    }

    @Override
    public final void a(Object obj, Object obj2, Object obj3) {
        ArrayList arrayList = (ArrayList) obj;
        org.telegram.messenger.d00 d00Var = (org.telegram.messenger.d00) obj2;
        Integer num = (Integer) obj3;
        h11 h11Var = this.f40629a;
        ArrayList arrayList2 = h11Var.N;
        boolean z10 = false;
        h11Var.O = 0;
        if (this.f40630b.equals(h11Var.M)) {
            if (this.f40631c == h11Var.V) {
                if (Objects.equals(this.d, h11Var.W)) {
                    arrayList2.addAll(arrayList);
                    h11Var.Q = d00Var;
                    h11Var.R = (d00Var == null || arrayList2.size() >= num.intValue()) ? true : true;
                    h11Var.n();
                }
            }
        }
    }
}
