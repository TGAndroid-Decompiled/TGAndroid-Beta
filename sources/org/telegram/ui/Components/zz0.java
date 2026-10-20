package org.telegram.ui.Components;
public final class zz0 {
    public final int f33073a;
    public final int f33074b;

    public zz0(int i10, int i11) {
        this.f33073a = i10;
        this.f33074b = i11;
    }

    public final int a() {
        return this.f33074b - this.f33073a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zz0.class != obj.getClass()) {
            return false;
        }
        zz0 zz0Var = (zz0) obj;
        if (this.f33074b == zz0Var.f33074b && this.f33073a == zz0Var.f33073a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f33073a * 31) + this.f33074b;
    }
}
