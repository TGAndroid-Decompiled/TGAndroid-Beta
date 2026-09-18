package org.telegram.ui;

import j$.util.Objects;
public final class o7 extends og.a {
    public t6 f36244c;
    public zh.a d;

    public final boolean equals(Object obj) {
        zh.a aVar;
        zh.a aVar2;
        t6 t6Var;
        t6 t6Var2;
        if (this == obj) {
            return true;
        }
        if (obj != null && o7.class == obj.getClass()) {
            o7 o7Var = (o7) obj;
            int i10 = this.f15543a;
            if (i10 == o7Var.f15543a) {
                if (i10 == 1 && (t6Var = this.f36244c) != null && (t6Var2 = o7Var.f36244c) != null) {
                    if (t6Var.f37672a == t6Var2.f37672a) {
                        return true;
                    }
                    return false;
                } else if (i10 == 2 && (aVar = this.d) != null && (aVar2 = o7Var.d) != null) {
                    return Objects.equals(aVar.f49222a, aVar2.f49222a);
                }
            }
        }
        return false;
    }
}
