package org.telegram.ui.Components;

public final class ny0 {

    public final int f31061a;

    public final int f31062b;

    public ny0(int i10, int i11) {
        this.f31061a = i10;
        this.f31062b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ny0.class != obj.getClass()) {
            return false;
        }
        ny0 ny0Var = (ny0) obj;
        return this.f31062b == ny0Var.f31062b && this.f31061a == ny0Var.f31061a;
    }

    public final int hashCode() {
        return (this.f31061a * 31) + this.f31062b;
    }
}
