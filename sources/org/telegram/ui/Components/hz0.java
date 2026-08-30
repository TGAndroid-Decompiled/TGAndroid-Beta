package org.telegram.ui.Components;
public final class hz0 {
    public final int f25526a;
    public final int f25527b;

    public hz0(int i10, int i11) {
        this.f25526a = i10;
        this.f25527b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || hz0.class != obj.getClass()) {
            return false;
        }
        hz0 hz0Var = (hz0) obj;
        if (this.f25527b == hz0Var.f25527b && this.f25526a == hz0Var.f25526a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f25526a * 31) + this.f25527b;
    }
}
