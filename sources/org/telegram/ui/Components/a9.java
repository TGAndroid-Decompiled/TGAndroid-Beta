package org.telegram.ui.Components;

import j$.util.Objects;
public final class a9 {
    public int f24549a;
    public boolean f24550b;
    public int f24551c;
    public int d;
    public int e;
    public int f24552f;

    public final a9 a() {
        ?? obj = new Object();
        obj.f24551c = this.f24551c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f24552f = this.f24552f;
        obj.f24550b = this.f24550b;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a9)) {
            return false;
        }
        a9 a9Var = (a9) obj;
        if (this.f24551c == a9Var.f24551c && this.d == a9Var.d && this.e == a9Var.e && this.f24552f == a9Var.f24552f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f24549a), Integer.valueOf(this.f24551c), Integer.valueOf(this.d), Integer.valueOf(this.e), Integer.valueOf(this.f24552f));
    }
}
