package org.telegram.ui.Components;

import j$.util.Objects;
public final class z8 {
    public int f30842a;
    public boolean f30843b;
    public int f30844c;
    public int d;
    public int e;
    public int f30845f;

    public final z8 a() {
        ?? obj = new Object();
        obj.f30844c = this.f30844c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f30845f = this.f30845f;
        obj.f30843b = this.f30843b;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z8)) {
            return false;
        }
        z8 z8Var = (z8) obj;
        if (this.f30844c == z8Var.f30844c && this.d == z8Var.d && this.e == z8Var.e && this.f30845f == z8Var.f30845f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f30842a), Integer.valueOf(this.f30844c), Integer.valueOf(this.d), Integer.valueOf(this.e), Integer.valueOf(this.f30845f));
    }
}
