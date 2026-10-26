package org.telegram.ui.Components;
public final class k01 {
    public final int f29767a;
    public final int f29768b;

    public k01(int i10, int i11) {
        this.f29767a = i10;
        this.f29768b = i11;
    }

    public final int a() {
        return this.f29768b - this.f29767a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k01.class != obj.getClass()) {
            return false;
        }
        k01 k01Var = (k01) obj;
        if (this.f29768b == k01Var.f29768b && this.f29767a == k01Var.f29767a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f29767a * 31) + this.f29768b;
    }
}
