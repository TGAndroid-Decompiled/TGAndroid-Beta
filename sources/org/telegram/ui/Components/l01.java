package org.telegram.ui.Components;
public final class l01 {
    public final int f27984a;
    public final int f27985b;

    public l01(int i10, int i11) {
        this.f27984a = i10;
        this.f27985b = i11;
    }

    public final int a() {
        return this.f27985b - this.f27984a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l01.class != obj.getClass()) {
            return false;
        }
        l01 l01Var = (l01) obj;
        if (this.f27985b == l01Var.f27985b && this.f27984a == l01Var.f27984a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f27984a * 31) + this.f27985b;
    }
}
