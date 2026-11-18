package org.telegram.ui.Components;
public final class f50 {
    public final int f34946a;
    public final int f34947b;

    public f50(int i7, int i10) {
        this.f34946a = i7;
        this.f34947b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f50.class == obj.getClass()) {
            f50 f50Var = (f50) obj;
            if (this.f34946a == f50Var.f34946a && this.f34947b == f50Var.f34947b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f34946a * 31) + this.f34947b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IntSize(");
        sb2.append(this.f34946a);
        sb2.append(", ");
        return a8.p0.n(this.f34947b, ")", sb2);
    }
}
