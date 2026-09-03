package org.telegram.ui.Components;
public final class a60 {
    public final int f23326a;
    public final int f23327b;

    public a60(int i10, int i11) {
        this.f23326a = i10;
        this.f23327b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a60.class == obj.getClass()) {
            a60 a60Var = (a60) obj;
            if (this.f23326a == a60Var.f23326a && this.f23327b == a60Var.f23327b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f23326a * 31) + this.f23327b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IntSize(");
        sb.append(this.f23326a);
        sb.append(", ");
        return android.support.v4.media.a.m(this.f23327b, ")", sb);
    }
}
