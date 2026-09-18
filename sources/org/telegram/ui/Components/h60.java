package org.telegram.ui.Components;
public final class h60 {
    public final int f24565a;
    public final int f24566b;

    public h60(int i10, int i11) {
        this.f24565a = i10;
        this.f24566b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && h60.class == obj.getClass()) {
            h60 h60Var = (h60) obj;
            if (this.f24565a == h60Var.f24565a && this.f24566b == h60Var.f24566b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f24565a * 31) + this.f24566b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IntSize(");
        sb2.append(this.f24565a);
        sb2.append(", ");
        return a4.a.n(this.f24566b, ")", sb2);
    }
}
