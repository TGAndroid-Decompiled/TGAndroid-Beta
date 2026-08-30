package org.telegram.ui.Components;
public final class z50 {
    public final int f31247a;
    public final int f31248b;

    public z50(int i10, int i11) {
        this.f31247a = i10;
        this.f31248b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && z50.class == obj.getClass()) {
            z50 z50Var = (z50) obj;
            if (this.f31247a == z50Var.f31247a && this.f31248b == z50Var.f31248b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f31247a * 31) + this.f31248b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IntSize(");
        sb.append(this.f31247a);
        sb.append(", ");
        return android.support.v4.media.a.m(this.f31248b, ")", sb);
    }
}
