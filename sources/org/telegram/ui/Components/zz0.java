package org.telegram.ui.Components;
public final class zz0 {
    public final int f33679a;
    public final int f33680b;

    public zz0(int i10, int i11) {
        this.f33679a = i10;
        this.f33680b = i11;
    }

    public final int a() {
        return this.f33680b - this.f33679a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zz0.class != obj.getClass()) {
            return false;
        }
        zz0 zz0Var = (zz0) obj;
        if (this.f33680b == zz0Var.f33680b && this.f33679a == zz0Var.f33679a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f33679a * 31) + this.f33680b;
    }
}
