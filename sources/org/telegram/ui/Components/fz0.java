package org.telegram.ui.Components;
public final class fz0 {
    public final int f24039a;
    public final int f24040b;

    public fz0(int i10, int i11) {
        this.f24039a = i10;
        this.f24040b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || fz0.class != obj.getClass()) {
            return false;
        }
        fz0 fz0Var = (fz0) obj;
        if (this.f24040b == fz0Var.f24040b && this.f24039a == fz0Var.f24039a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f24039a * 31) + this.f24040b;
    }
}
