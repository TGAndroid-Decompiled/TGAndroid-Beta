package org.telegram.ui;

import j$.util.Objects;
public final class l7 extends wf.a {
    public r6 f40070c;
    public hh.a d;

    public final boolean equals(Object obj) {
        hh.a aVar;
        hh.a aVar2;
        r6 r6Var;
        r6 r6Var2;
        if (this == obj) {
            return true;
        }
        if (obj != null && l7.class == obj.getClass()) {
            l7 l7Var = (l7) obj;
            int i9 = this.f48814a;
            if (i9 == l7Var.f48814a) {
                if (i9 == 1 && (r6Var = this.f40070c) != null && (r6Var2 = l7Var.f40070c) != null) {
                    if (r6Var.f42274a == r6Var2.f42274a) {
                        return true;
                    }
                    return false;
                } else if (i9 == 2 && (aVar = this.d) != null && (aVar2 = l7Var.d) != null) {
                    return Objects.equals(aVar.f10780a, aVar2.f10780a);
                }
            }
        }
        return false;
    }
}
