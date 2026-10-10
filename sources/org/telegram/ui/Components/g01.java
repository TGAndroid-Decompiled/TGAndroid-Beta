package org.telegram.ui.Components;
public final class g01 {
    public final int f26566a;
    public final int f26567b;

    public g01(int i10, int i11) {
        this.f26566a = i10;
        this.f26567b = i11;
    }

    public final int a() {
        return this.f26567b - this.f26566a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g01.class != obj.getClass()) {
            return false;
        }
        g01 g01Var = (g01) obj;
        if (this.f26567b == g01Var.f26567b && this.f26566a == g01Var.f26566a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f26566a * 31) + this.f26567b;
    }
}
