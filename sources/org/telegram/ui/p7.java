package org.telegram.ui;

import j$.util.Objects;
public final class p7 extends og.a {
    public u6 f36340c;
    public zh.a d;

    public final boolean equals(Object obj) {
        zh.a aVar;
        zh.a aVar2;
        u6 u6Var;
        u6 u6Var2;
        if (this == obj) {
            return true;
        }
        if (obj != null && p7.class == obj.getClass()) {
            p7 p7Var = (p7) obj;
            int i10 = this.f15754a;
            if (i10 == p7Var.f15754a) {
                if (i10 == 1 && (u6Var = this.f36340c) != null && (u6Var2 = p7Var.f36340c) != null) {
                    if (u6Var.f38128a == u6Var2.f38128a) {
                        return true;
                    }
                    return false;
                } else if (i10 == 2 && (aVar = this.d) != null && (aVar2 = p7Var.d) != null) {
                    return Objects.equals(aVar.f49510a, aVar2.f49510a);
                }
            }
        }
        return false;
    }
}
