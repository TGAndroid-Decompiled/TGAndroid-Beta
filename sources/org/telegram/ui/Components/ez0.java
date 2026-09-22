package org.telegram.ui.Components;
public final class ez0 {
    public final int f23764a;
    public final int f23765b;

    public ez0(int i10, int i11) {
        this.f23764a = i10;
        this.f23765b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ez0.class != obj.getClass()) {
            return false;
        }
        ez0 ez0Var = (ez0) obj;
        if (this.f23765b == ez0Var.f23765b && this.f23764a == ez0Var.f23764a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f23764a * 31) + this.f23765b;
    }
}
