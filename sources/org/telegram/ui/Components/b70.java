package org.telegram.ui.Components;
public final class b70 {
    public final int f24871a;
    public final int f24872b;

    public b70(int i10, int i11) {
        this.f24871a = i10;
        this.f24872b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b70.class == obj.getClass()) {
            b70 b70Var = (b70) obj;
            if (this.f24871a == b70Var.f24871a && this.f24872b == b70Var.f24872b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f24871a * 31) + this.f24872b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IntSize(");
        sb2.append(this.f24871a);
        sb2.append(", ");
        return a1.g.o(this.f24872b, ")", sb2);
    }
}
