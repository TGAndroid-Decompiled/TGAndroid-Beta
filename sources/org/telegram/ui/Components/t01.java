package org.telegram.ui.Components;

import j$.util.Objects;
import java.util.ArrayList;
public final class t01 implements org.telegram.messenger.s10 {
    public final f11 f39875a;
    public final String f39876b;
    public final long f39877c;
    public final Boolean d;

    public t01(f11 f11Var, String str, long j3, Boolean bool) {
        this.f39875a = f11Var;
        this.f39876b = str;
        this.f39877c = j3;
        this.d = bool;
    }

    @Override
    public final void a(Object obj, Object obj2, Object obj3) {
        ArrayList arrayList = (ArrayList) obj;
        org.telegram.messenger.d00 d00Var = (org.telegram.messenger.d00) obj2;
        Integer num = (Integer) obj3;
        f11 f11Var = this.f39875a;
        ArrayList arrayList2 = f11Var.N;
        boolean z10 = false;
        f11Var.O = 0;
        if (this.f39876b.equals(f11Var.M)) {
            if (this.f39877c == f11Var.V) {
                if (Objects.equals(this.d, f11Var.W)) {
                    arrayList2.addAll(arrayList);
                    f11Var.Q = d00Var;
                    f11Var.R = (d00Var == null || arrayList2.size() >= num.intValue()) ? true : true;
                    f11Var.n();
                }
            }
        }
    }
}
