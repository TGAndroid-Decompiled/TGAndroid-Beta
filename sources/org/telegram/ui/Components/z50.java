package org.telegram.ui.Components;
public final class z50 {
    public final int f30531a;
    public final int f30532b;

    public z50(int i10, int i11) {
        this.f30531a = i10;
        this.f30532b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && z50.class == obj.getClass()) {
            z50 z50Var = (z50) obj;
            if (this.f30531a == z50Var.f30531a && this.f30532b == z50Var.f30532b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f30531a * 31) + this.f30532b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IntSize(");
        sb2.append(this.f30531a);
        sb2.append(", ");
        return a4.a.o(this.f30532b, ")", sb2);
    }
}
