package org.telegram.ui;

import j$.util.Objects;
public final class l7 extends ng.a {
    public r6 f34548c;
    public yh.a d;

    public final boolean equals(Object obj) {
        yh.a aVar;
        yh.a aVar2;
        r6 r6Var;
        r6 r6Var2;
        if (this == obj) {
            return true;
        }
        if (obj != null && l7.class == obj.getClass()) {
            l7 l7Var = (l7) obj;
            int i10 = this.f14046a;
            if (i10 == l7Var.f14046a) {
                if (i10 == 1 && (r6Var = this.f34548c) != null && (r6Var2 = l7Var.f34548c) != null) {
                    if (r6Var.f36238a == r6Var2.f36238a) {
                        return true;
                    }
                    return false;
                } else if (i10 == 2 && (aVar = this.d) != null && (aVar2 = l7Var.d) != null) {
                    return Objects.equals(aVar.f47167a, aVar2.f47167a);
                }
            }
        }
        return false;
    }
}
