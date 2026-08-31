package org.telegram.ui.Components;
public final class iz0 {
    public final int f27934a;
    public final int f27935b;

    public iz0(int i10, int i11) {
        this.f27934a = i10;
        this.f27935b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || iz0.class != obj.getClass()) {
            return false;
        }
        iz0 iz0Var = (iz0) obj;
        if (this.f27935b == iz0Var.f27935b && this.f27934a == iz0Var.f27934a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f27934a * 31) + this.f27935b;
    }
}
