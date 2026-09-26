package org.telegram.ui.Components;
public final class oz0 {
    public final int f27219a;
    public final int f27220b;

    public oz0(int i10, int i11) {
        this.f27219a = i10;
        this.f27220b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || oz0.class != obj.getClass()) {
            return false;
        }
        oz0 oz0Var = (oz0) obj;
        if (this.f27220b == oz0Var.f27220b && this.f27219a == oz0Var.f27219a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f27219a * 31) + this.f27220b;
    }
}
