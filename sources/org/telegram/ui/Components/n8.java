package org.telegram.ui.Components;

import j$.util.Objects;
public final class n8 {
    public int f36411a;
    public boolean f36412b;
    public int f36413c;
    public int d;
    public int f36414e;
    public int f36415f;

    public final n8 a() {
        ?? obj = new Object();
        obj.f36413c = this.f36413c;
        obj.d = this.d;
        obj.f36414e = this.f36414e;
        obj.f36415f = this.f36415f;
        obj.f36412b = this.f36412b;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n8)) {
            return false;
        }
        n8 n8Var = (n8) obj;
        if (this.f36413c == n8Var.f36413c && this.d == n8Var.d && this.f36414e == n8Var.f36414e && this.f36415f == n8Var.f36415f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f36411a), Integer.valueOf(this.f36413c), Integer.valueOf(this.d), Integer.valueOf(this.f36414e), Integer.valueOf(this.f36415f));
    }
}
