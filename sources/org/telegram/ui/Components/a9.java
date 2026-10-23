package org.telegram.ui.Components;

import j$.util.Objects;
public final class a9 {
    public int f24550a;
    public boolean f24551b;
    public int f24552c;
    public int d;
    public int e;
    public int f24553f;

    public final a9 a() {
        ?? obj = new Object();
        obj.f24552c = this.f24552c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f24553f = this.f24553f;
        obj.f24551b = this.f24551b;
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
        if (this.f24552c == a9Var.f24552c && this.d == a9Var.d && this.e == a9Var.e && this.f24553f == a9Var.f24553f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f24550a), Integer.valueOf(this.f24552c), Integer.valueOf(this.d), Integer.valueOf(this.e), Integer.valueOf(this.f24553f));
    }
}
