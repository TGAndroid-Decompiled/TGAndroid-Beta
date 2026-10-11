package org.telegram.ui;

import j$.util.Objects;
public final class k7 extends og.a {
    public q6 f39216c;
    public zh.a d;

    public final boolean equals(Object obj) {
        zh.a aVar;
        zh.a aVar2;
        q6 q6Var;
        q6 q6Var2;
        if (this == obj) {
            return true;
        }
        if (obj != null && k7.class == obj.getClass()) {
            k7 k7Var = (k7) obj;
            int i10 = this.f17175a;
            if (i10 == k7Var.f17175a) {
                if (i10 == 1 && (q6Var = this.f39216c) != null && (q6Var2 = k7Var.f39216c) != null) {
                    if (q6Var.f41046a == q6Var2.f41046a) {
                        return true;
                    }
                    return false;
                } else if (i10 == 2 && (aVar = this.d) != null && (aVar2 = k7Var.d) != null) {
                    return Objects.equals(aVar.f54781a, aVar2.f54781a);
                }
            }
        }
        return false;
    }
}
