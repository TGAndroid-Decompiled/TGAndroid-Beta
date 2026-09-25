package org.telegram.ui.Components;
public final class hk0 extends og.a {
    public final zg.o0 f24797c;

    public hk0(int i10, zg.o0 o0Var) {
        super(i10, false);
        this.f24797c = o0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && hk0.class == obj.getClass()) {
            hk0 hk0Var = (hk0) obj;
            int i10 = this.f15715a;
            int i11 = hk0Var.f15715a;
            if (i10 == i11 && (i10 == 0 || i10 == 3)) {
                zg.o0 o0Var = this.f24797c;
                if (o0Var != null && o0Var.equals(hk0Var.f24797c)) {
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
