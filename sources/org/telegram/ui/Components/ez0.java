package org.telegram.ui.Components;
public final class ez0 {
    public final int f23765a;
    public final int f23766b;

    public ez0(int i10, int i11) {
        this.f23765a = i10;
        this.f23766b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ez0.class != obj.getClass()) {
            return false;
        }
        ez0 ez0Var = (ez0) obj;
        if (this.f23766b == ez0Var.f23766b && this.f23765a == ez0Var.f23765a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f23765a * 31) + this.f23766b;
    }
}
