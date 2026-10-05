package org.telegram.ui.Components;
public final class a01 {
    public final int f24403a;
    public final int f24404b;

    public a01(int i10, int i11) {
        this.f24403a = i10;
        this.f24404b = i11;
    }

    public final int a() {
        return this.f24404b - this.f24403a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a01.class != obj.getClass()) {
            return false;
        }
        a01 a01Var = (a01) obj;
        if (this.f24404b == a01Var.f24404b && this.f24403a == a01Var.f24403a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f24403a * 31) + this.f24404b;
    }
}
