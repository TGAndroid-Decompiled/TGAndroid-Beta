package org.telegram.ui.Components;
public final class l60 {
    public final int f25932a;
    public final int f25933b;

    public l60(int i10, int i11) {
        this.f25932a = i10;
        this.f25933b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l60.class == obj.getClass()) {
            l60 l60Var = (l60) obj;
            if (this.f25932a == l60Var.f25932a && this.f25933b == l60Var.f25933b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f25932a * 31) + this.f25933b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IntSize(");
        sb2.append(this.f25932a);
        sb2.append(", ");
        return a4.a.o(this.f25933b, ")", sb2);
    }
}
