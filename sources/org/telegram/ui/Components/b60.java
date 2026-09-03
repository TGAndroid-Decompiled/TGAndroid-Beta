package org.telegram.ui.Components;
public final class b60 {
    public final int f25521a;
    public final int f25522b;

    public b60(int i10, int i11) {
        this.f25521a = i10;
        this.f25522b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b60.class == obj.getClass()) {
            b60 b60Var = (b60) obj;
            if (this.f25521a == b60Var.f25521a && this.f25522b == b60Var.f25522b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f25521a * 31) + this.f25522b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IntSize(");
        sb.append(this.f25521a);
        sb.append(", ");
        return android.support.v4.media.a.m(this.f25522b, ")", sb);
    }
}
