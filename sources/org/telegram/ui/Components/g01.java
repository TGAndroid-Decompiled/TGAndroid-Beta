package org.telegram.ui.Components;
public final class g01 {
    public final int f26615a;
    public final int f26616b;

    public g01(int i10, int i11) {
        this.f26615a = i10;
        this.f26616b = i11;
    }

    public final int a() {
        return this.f26616b - this.f26615a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g01.class != obj.getClass()) {
            return false;
        }
        g01 g01Var = (g01) obj;
        if (this.f26616b == g01Var.f26616b && this.f26615a == g01Var.f26615a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f26615a * 31) + this.f26616b;
    }
}
