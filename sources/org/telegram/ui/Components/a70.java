package org.telegram.ui.Components;
public final class a70 {
    public final int f24524a;
    public final int f24525b;

    public a70(int i10, int i11) {
        this.f24524a = i10;
        this.f24525b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a70.class == obj.getClass()) {
            a70 a70Var = (a70) obj;
            if (this.f24524a == a70Var.f24524a && this.f24525b == a70Var.f24525b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f24524a * 31) + this.f24525b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IntSize(");
        sb2.append(this.f24524a);
        sb2.append(", ");
        return a1.g.o(this.f24525b, ")", sb2);
    }
}
