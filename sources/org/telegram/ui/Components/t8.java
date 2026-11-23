package org.telegram.ui.Components;

import j$.util.Objects;
public final class t8 {
    public int f39854a;
    public boolean f39855b;
    public int f39856c;
    public int d;
    public int f39857e;
    public int f39858f;

    public final t8 a() {
        ?? obj = new Object();
        obj.f39856c = this.f39856c;
        obj.d = this.d;
        obj.f39857e = this.f39857e;
        obj.f39858f = this.f39858f;
        obj.f39855b = this.f39855b;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t8)) {
            return false;
        }
        t8 t8Var = (t8) obj;
        if (this.f39856c == t8Var.f39856c && this.d == t8Var.d && this.f39857e == t8Var.f39857e && this.f39858f == t8Var.f39858f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f39854a), Integer.valueOf(this.f39856c), Integer.valueOf(this.d), Integer.valueOf(this.f39857e), Integer.valueOf(this.f39858f));
    }
}
