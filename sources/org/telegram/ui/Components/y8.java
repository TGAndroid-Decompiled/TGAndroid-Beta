package org.telegram.ui.Components;

import j$.util.Objects;
public final class y8 {
    public int f30138a;
    public boolean f30139b;
    public int f30140c;
    public int d;
    public int e;
    public int f30141f;

    public final y8 a() {
        ?? obj = new Object();
        obj.f30140c = this.f30140c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f30141f = this.f30141f;
        obj.f30139b = this.f30139b;
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
        if (this.f30140c == y8Var.f30140c && this.d == y8Var.d && this.e == y8Var.e && this.f30141f == y8Var.f30141f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f30138a), Integer.valueOf(this.f30140c), Integer.valueOf(this.d), Integer.valueOf(this.e), Integer.valueOf(this.f30141f));
    }
}
