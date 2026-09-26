package org.telegram.ui.Components;
public final class j60 {
    public final int f25286a;
    public final int f25287b;

    public j60(int i10, int i11) {
        this.f25286a = i10;
        this.f25287b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j60.class == obj.getClass()) {
            j60 j60Var = (j60) obj;
            if (this.f25286a == j60Var.f25286a && this.f25287b == j60Var.f25287b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f25286a * 31) + this.f25287b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IntSize(");
        sb2.append(this.f25286a);
        sb2.append(", ");
        return a4.a.o(this.f25287b, ")", sb2);
    }
}
