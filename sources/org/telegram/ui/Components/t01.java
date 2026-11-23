package org.telegram.ui.Components;

import j$.util.Objects;
import java.util.ArrayList;
public final class t01 implements org.telegram.messenger.r10 {
    public final f11 f39767a;
    public final String f39768b;
    public final long f39769c;
    public final Boolean d;

    public t01(f11 f11Var, String str, long j3, Boolean bool) {
        this.f39767a = f11Var;
        this.f39768b = str;
        this.f39769c = j3;
        this.d = bool;
    }

    @Override
    public final void a(Object obj, Object obj2, Object obj3) {
        ArrayList arrayList = (ArrayList) obj;
        org.telegram.messenger.c00 c00Var = (org.telegram.messenger.c00) obj2;
        Integer num = (Integer) obj3;
        f11 f11Var = this.f39767a;
        ArrayList arrayList2 = f11Var.N;
        boolean z10 = false;
        f11Var.O = 0;
        if (this.f39768b.equals(f11Var.M)) {
            if (this.f39769c == f11Var.V) {
                if (Objects.equals(this.d, f11Var.W)) {
                    arrayList2.addAll(arrayList);
                    f11Var.Q = c00Var;
                    f11Var.R = (c00Var == null || arrayList2.size() >= num.intValue()) ? true : true;
                    f11Var.n();
                }
            }
        }
    }
}
