package org.telegram.ui.Components;
public final class qx0 {
    public final int f38934a;
    public final int f38935b;

    public qx0(int i7, int i10) {
        this.f38934a = i7;
        this.f38935b = i10;
    }

    public final int a() {
        return this.f38935b - this.f38934a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || qx0.class != obj.getClass()) {
            return false;
        }
        qx0 qx0Var = (qx0) obj;
        if (this.f38935b == qx0Var.f38935b && this.f38934a == qx0Var.f38934a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f38934a * 31) + this.f38935b;
    }
}
