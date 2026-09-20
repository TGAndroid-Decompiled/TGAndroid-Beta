package org.telegram.ui.Components;
public final class g60 {
    public final int f24266a;
    public final int f24267b;

    public g60(int i10, int i11) {
        this.f24266a = i10;
        this.f24267b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && g60.class == obj.getClass()) {
            g60 g60Var = (g60) obj;
            if (this.f24266a == g60Var.f24266a && this.f24267b == g60Var.f24267b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f24266a * 31) + this.f24267b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IntSize(");
        sb2.append(this.f24266a);
        sb2.append(", ");
        return a4.a.n(this.f24267b, ")", sb2);
    }
}
