package org.telegram.ui.Components;
public final class b70 {
    public final int f24881a;
    public final int f24882b;

    public b70(int i10, int i11) {
        this.f24881a = i10;
        this.f24882b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b70.class == obj.getClass()) {
            b70 b70Var = (b70) obj;
            if (this.f24881a == b70Var.f24881a && this.f24882b == b70Var.f24882b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f24881a * 31) + this.f24882b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IntSize(");
        sb2.append(this.f24881a);
        sb2.append(", ");
        return a1.g.o(this.f24882b, ")", sb2);
    }
}
