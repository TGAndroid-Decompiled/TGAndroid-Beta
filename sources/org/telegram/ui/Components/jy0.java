package org.telegram.ui.Components;
public final class jy0 {
    public final int f27520a;
    public final int f27521b;

    public jy0(int i10, int i11) {
        this.f27520a = i10;
        this.f27521b = i11;
    }

    public final int a() {
        return this.f27521b - this.f27520a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || jy0.class != obj.getClass()) {
            return false;
        }
        jy0 jy0Var = (jy0) obj;
        if (this.f27521b == jy0Var.f27521b && this.f27520a == jy0Var.f27520a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f27520a * 31) + this.f27521b;
    }
}
