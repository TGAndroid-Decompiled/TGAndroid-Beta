package org.telegram.ui.Components;
public final class ci0 extends sg.a {
    public final dh.n0 f32756c;

    public ci0(int i3, dh.n0 n0Var) {
        super(i3, false);
        this.f32756c = n0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ci0.class == obj.getClass()) {
            ci0 ci0Var = (ci0) obj;
            int i3 = this.f54715a;
            int i10 = ci0Var.f54715a;
            if (i3 == i10 && (i3 == 0 || i3 == 3)) {
                dh.n0 n0Var = this.f32756c;
                if (n0Var != null && n0Var.equals(ci0Var.f32756c)) {
                    return true;
                }
                return false;
            } else if (i3 == i10) {
                return true;
            }
        }
        return false;
    }
}
