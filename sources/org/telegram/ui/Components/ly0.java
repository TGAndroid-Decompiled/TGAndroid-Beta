package org.telegram.ui.Components;
public final class ly0 {
    public final int f30584a;
    public final int f30585b;

    public ly0(int i9, int i10) {
        this.f30584a = i9;
        this.f30585b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ly0.class != obj.getClass()) {
            return false;
        }
        ly0 ly0Var = (ly0) obj;
        if (this.f30585b == ly0Var.f30585b && this.f30584a == ly0Var.f30584a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f30584a * 31) + this.f30585b;
    }
}
