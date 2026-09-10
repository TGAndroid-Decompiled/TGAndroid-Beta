package org.telegram.ui.Components;
public final class qz0 {
    public final int f26499a;
    public final int f26500b;

    public qz0(int i10, int i11) {
        this.f26499a = i10;
        this.f26500b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || qz0.class != obj.getClass()) {
            return false;
        }
        qz0 qz0Var = (qz0) obj;
        if (this.f26500b == qz0Var.f26500b && this.f26499a == qz0Var.f26499a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f26499a * 31) + this.f26500b;
    }
}
