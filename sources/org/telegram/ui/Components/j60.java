package org.telegram.ui.Components;
public final class j60 {
    public final int f25261a;
    public final int f25262b;

    public j60(int i10, int i11) {
        this.f25261a = i10;
        this.f25262b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j60.class == obj.getClass()) {
            j60 j60Var = (j60) obj;
            if (this.f25261a == j60Var.f25261a && this.f25262b == j60Var.f25262b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f25261a * 31) + this.f25262b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IntSize(");
        sb2.append(this.f25261a);
        sb2.append(", ");
        return a4.a.o(this.f25262b, ")", sb2);
    }
}
