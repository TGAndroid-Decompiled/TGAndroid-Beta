package org.telegram.ui;

import j$.util.Objects;
public final class n7 extends og.a {
    public s6 f35829c;
    public zh.a d;

    public final boolean equals(Object obj) {
        zh.a aVar;
        zh.a aVar2;
        s6 s6Var;
        s6 s6Var2;
        if (this == obj) {
            return true;
        }
        if (obj != null && n7.class == obj.getClass()) {
            n7 n7Var = (n7) obj;
            int i10 = this.f15672a;
            if (i10 == n7Var.f15672a) {
                if (i10 == 1 && (s6Var = this.f35829c) != null && (s6Var2 = n7Var.f35829c) != null) {
                    if (s6Var.f37201a == s6Var2.f37201a) {
                        return true;
                    }
                    return false;
                } else if (i10 == 2 && (aVar = this.d) != null && (aVar2 = n7Var.d) != null) {
                    return Objects.equals(aVar.f49445a, aVar2.f49445a);
                }
            }
        }
        return false;
    }
}
