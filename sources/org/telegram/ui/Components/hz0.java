package org.telegram.ui.Components;
public final class hz0 {
    public final int f25525a;
    public final int f25526b;

    public hz0(int i10, int i11) {
        this.f25525a = i10;
        this.f25526b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || hz0.class != obj.getClass()) {
            return false;
        }
        hz0 hz0Var = (hz0) obj;
        if (this.f25526b == hz0Var.f25526b && this.f25525a == hz0Var.f25525a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f25525a * 31) + this.f25526b;
    }
}
