package org.telegram.ui.Components;

import j$.util.Objects;
public final class y8 {
    public int f30170a;
    public boolean f30171b;
    public int f30172c;
    public int d;
    public int e;
    public int f30173f;

    public final y8 a() {
        ?? obj = new Object();
        obj.f30172c = this.f30172c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f30173f = this.f30173f;
        obj.f30171b = this.f30171b;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y8)) {
            return false;
        }
        y8 y8Var = (y8) obj;
        if (this.f30172c == y8Var.f30172c && this.d == y8Var.d && this.e == y8Var.e && this.f30173f == y8Var.f30173f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f30170a), Integer.valueOf(this.f30172c), Integer.valueOf(this.d), Integer.valueOf(this.e), Integer.valueOf(this.f30173f));
    }
}
