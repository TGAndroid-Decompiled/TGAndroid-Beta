package org.telegram.ui.Components;
public final class jx0 {
    public final int f36198a;
    public final int f36199b;

    public jx0(int i7, int i10) {
        this.f36198a = i7;
        this.f36199b = i10;
    }

    public final int a() {
        return this.f36199b - this.f36198a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || jx0.class != obj.getClass()) {
            return false;
        }
        jx0 jx0Var = (jx0) obj;
        if (this.f36199b == jx0Var.f36199b && this.f36198a == jx0Var.f36198a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f36198a * 31) + this.f36199b;
    }
}
