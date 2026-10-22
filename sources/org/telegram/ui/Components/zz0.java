package org.telegram.ui.Components;
public final class zz0 {
    public final int f33077a;
    public final int f33078b;

    public zz0(int i10, int i11) {
        this.f33077a = i10;
        this.f33078b = i11;
    }

    public final int a() {
        return this.f33078b - this.f33077a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zz0.class != obj.getClass()) {
            return false;
        }
        zz0 zz0Var = (zz0) obj;
        if (this.f33078b == zz0Var.f33078b && this.f33077a == zz0Var.f33077a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f33077a * 31) + this.f33078b;
    }
}
