package org.telegram.ui.Components;
public final class zz0 {
    public final int f33074a;
    public final int f33075b;

    public zz0(int i10, int i11) {
        this.f33074a = i10;
        this.f33075b = i11;
    }

    public final int a() {
        return this.f33075b - this.f33074a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zz0.class != obj.getClass()) {
            return false;
        }
        zz0 zz0Var = (zz0) obj;
        if (this.f33075b == zz0Var.f33075b && this.f33074a == zz0Var.f33074a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f33074a * 31) + this.f33075b;
    }
}
