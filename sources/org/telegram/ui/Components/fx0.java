package org.telegram.ui.Components;
public final class fx0 {
    public final int f33880a;
    public final int f33881b;

    public fx0(int i3, int i10) {
        this.f33880a = i3;
        this.f33881b = i10;
    }

    public final int a() {
        return this.f33881b - this.f33880a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || fx0.class != obj.getClass()) {
            return false;
        }
        fx0 fx0Var = (fx0) obj;
        if (this.f33881b == fx0Var.f33881b && this.f33880a == fx0Var.f33880a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f33880a * 31) + this.f33881b;
    }
}
