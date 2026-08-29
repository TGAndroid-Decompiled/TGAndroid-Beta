package org.telegram.ui.Components;
public final class wj0 extends zf.a {
    public final kg.q0 f34434c;

    public wj0(int i10, kg.q0 q0Var) {
        super(i10, false);
        this.f34434c = q0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && wj0.class == obj.getClass()) {
            wj0 wj0Var = (wj0) obj;
            int i10 = this.f50845a;
            int i11 = wj0Var.f50845a;
            if (i10 == i11 && (i10 == 0 || i10 == 3)) {
                kg.q0 q0Var = this.f34434c;
                if (q0Var != null && q0Var.equals(wj0Var.f34434c)) {
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
