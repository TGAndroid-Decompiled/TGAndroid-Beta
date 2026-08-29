package org.telegram.ui.Components;
public final class wy0 {
    public final int f34515a;
    public final int f34516b;

    public wy0(int i10, int i11) {
        this.f34515a = i10;
        this.f34516b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || wy0.class != obj.getClass()) {
            return false;
        }
        wy0 wy0Var = (wy0) obj;
        if (this.f34516b == wy0Var.f34516b && this.f34515a == wy0Var.f34515a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f34515a * 31) + this.f34516b;
    }
}
