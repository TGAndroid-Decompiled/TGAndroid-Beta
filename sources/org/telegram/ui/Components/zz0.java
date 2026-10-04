package org.telegram.ui.Components;
public final class zz0 {
    public final int f33680a;
    public final int f33681b;

    public zz0(int i10, int i11) {
        this.f33680a = i10;
        this.f33681b = i11;
    }

    public final int a() {
        return this.f33681b - this.f33680a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zz0.class != obj.getClass()) {
            return false;
        }
        zz0 zz0Var = (zz0) obj;
        if (this.f33681b == zz0Var.f33681b && this.f33680a == zz0Var.f33680a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f33680a * 31) + this.f33681b;
    }
}
