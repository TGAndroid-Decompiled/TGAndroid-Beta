package org.telegram.ui;

import j$.util.Objects;
public final class n7 extends sg.a {
    public t6 f47906c;
    public di.b d;

    public final boolean equals(Object obj) {
        di.b bVar;
        di.b bVar2;
        t6 t6Var;
        t6 t6Var2;
        if (this == obj) {
            return true;
        }
        if (obj != null && n7.class == obj.getClass()) {
            n7 n7Var = (n7) obj;
            int i3 = this.f54715a;
            if (i3 == n7Var.f54715a) {
                if (i3 == 1 && (t6Var = this.f47906c) != null && (t6Var2 = n7Var.f47906c) != null) {
                    if (t6Var.f49713a == t6Var2.f49713a) {
                        return true;
                    }
                    return false;
                } else if (i3 == 2 && (bVar = this.d) != null && (bVar2 = n7Var.d) != null) {
                    return Objects.equals(bVar.f9180a, bVar2.f9180a);
                }
            }
        }
        return false;
    }
}
