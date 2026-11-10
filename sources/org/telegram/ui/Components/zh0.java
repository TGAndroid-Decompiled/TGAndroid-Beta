package org.telegram.ui.Components;
public final class zh0 extends rg.a {
    public final ch.o0 f41006c;

    public zh0(int i7, ch.o0 o0Var) {
        super(i7, false);
        this.f41006c = o0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zh0.class == obj.getClass()) {
            zh0 zh0Var = (zh0) obj;
            int i7 = this.f54543a;
            int i10 = zh0Var.f54543a;
            if (i7 == i10 && (i7 == 0 || i7 == 3)) {
                ch.o0 o0Var = this.f41006c;
                if (o0Var != null && o0Var.equals(zh0Var.f41006c)) {
                    return true;
                }
                return false;
            } else if (i7 == i10) {
                return true;
            }
        }
        return false;
    }
}
