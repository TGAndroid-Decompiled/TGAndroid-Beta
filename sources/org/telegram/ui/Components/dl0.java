package org.telegram.ui.Components;
public final class dl0 extends og.a {
    public final zg.n0 f25626c;

    public dl0(int i10, zg.n0 n0Var) {
        super(i10, false);
        this.f25626c = n0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && dl0.class == obj.getClass()) {
            dl0 dl0Var = (dl0) obj;
            int i10 = this.f17175a;
            int i11 = dl0Var.f17175a;
            if (i10 == i11 && (i10 == 0 || i10 == 3)) {
                zg.n0 n0Var = this.f25626c;
                if (n0Var != null && n0Var.equals(dl0Var.f25626c)) {
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
