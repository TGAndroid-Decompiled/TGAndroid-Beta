package org.telegram.ui.Components;
public final class j60 {
    public final int f25287a;
    public final int f25288b;

    public j60(int i10, int i11) {
        this.f25287a = i10;
        this.f25288b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j60.class == obj.getClass()) {
            j60 j60Var = (j60) obj;
            if (this.f25287a == j60Var.f25287a && this.f25288b == j60Var.f25288b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f25287a * 31) + this.f25288b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IntSize(");
        sb2.append(this.f25287a);
        sb2.append(", ");
        return a4.a.o(this.f25288b, ")", sb2);
    }
}
