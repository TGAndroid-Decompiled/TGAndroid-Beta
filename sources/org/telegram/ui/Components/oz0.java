package org.telegram.ui.Components;
public final class oz0 {
    public final int f27220a;
    public final int f27221b;

    public oz0(int i10, int i11) {
        this.f27220a = i10;
        this.f27221b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || oz0.class != obj.getClass()) {
            return false;
        }
        oz0 oz0Var = (oz0) obj;
        if (this.f27221b == oz0Var.f27221b && this.f27220a == oz0Var.f27220a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f27220a * 31) + this.f27221b;
    }
}
