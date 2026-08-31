package org.telegram.ui.Components;
public final class b60 {
    public final int f25503a;
    public final int f25504b;

    public b60(int i10, int i11) {
        this.f25503a = i10;
        this.f25504b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b60.class == obj.getClass()) {
            b60 b60Var = (b60) obj;
            if (this.f25503a == b60Var.f25503a && this.f25504b == b60Var.f25504b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f25503a * 31) + this.f25504b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IntSize(");
        sb.append(this.f25503a);
        sb.append(", ");
        return android.support.v4.media.a.m(this.f25504b, ")", sb);
    }
}
