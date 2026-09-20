package org.telegram.ui.Components;
public final class gk0 extends og.a {
    public final zg.o0 f24383c;

    public gk0(int i10, zg.o0 o0Var) {
        super(i10, false);
        this.f24383c = o0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && gk0.class == obj.getClass()) {
            gk0 gk0Var = (gk0) obj;
            int i10 = this.f15704a;
            int i11 = gk0Var.f15704a;
            if (i10 == i11 && (i10 == 0 || i10 == 3)) {
                zg.o0 o0Var = this.f24383c;
                if (o0Var != null && o0Var.equals(gk0Var.f24383c)) {
                    return true;
                }
                return false;
            } else if (i10 == i11) {
                return true;
            }
        }
        return false;
    }
}
