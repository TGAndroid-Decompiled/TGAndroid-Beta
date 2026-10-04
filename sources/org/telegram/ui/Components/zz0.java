package org.telegram.ui.Components;
public final class zz0 {
    public final int f33686a;
    public final int f33687b;

    public zz0(int i10, int i11) {
        this.f33686a = i10;
        this.f33687b = i11;
    }

    public final int a() {
        return this.f33687b - this.f33686a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zz0.class != obj.getClass()) {
            return false;
        }
        zz0 zz0Var = (zz0) obj;
        if (this.f33687b == zz0Var.f33687b && this.f33686a == zz0Var.f33686a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f33686a * 31) + this.f33687b;
    }
}
