package org.telegram.ui.Components;
public final class fx0 {
    public final int f33709a;
    public final int f33710b;

    public fx0(int i7, int i10) {
        this.f33709a = i7;
        this.f33710b = i10;
    }

    public final int a() {
        return this.f33710b - this.f33709a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || fx0.class != obj.getClass()) {
            return false;
        }
        fx0 fx0Var = (fx0) obj;
        if (this.f33710b == fx0Var.f33710b && this.f33709a == fx0Var.f33709a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f33709a * 31) + this.f33710b;
    }
}
