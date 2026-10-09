package org.telegram.ui.Components;
public final class f01 {
    public final int f26205a;
    public final int f26206b;

    public f01(int i10, int i11) {
        this.f26205a = i10;
        this.f26206b = i11;
    }

    public final int a() {
        return this.f26206b - this.f26205a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f01.class != obj.getClass()) {
            return false;
        }
        f01 f01Var = (f01) obj;
        if (this.f26206b == f01Var.f26206b && this.f26205a == f01Var.f26205a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f26205a * 31) + this.f26206b;
    }
}
