package org.telegram.ui.Components;

import j$.util.Objects;
public final class c9 {
    public int f25147a;
    public boolean f25148b;
    public int f25149c;
    public int d;
    public int f25150e;
    public int f25151f;

    public final c9 a() {
        ?? obj = new Object();
        obj.f25149c = this.f25149c;
        obj.d = this.d;
        obj.f25150e = this.f25150e;
        obj.f25151f = this.f25151f;
        obj.f25148b = this.f25148b;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c9)) {
            return false;
        }
        c9 c9Var = (c9) obj;
        if (this.f25149c == c9Var.f25149c && this.d == c9Var.d && this.f25150e == c9Var.f25150e && this.f25151f == c9Var.f25151f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f25147a), Integer.valueOf(this.f25149c), Integer.valueOf(this.d), Integer.valueOf(this.f25150e), Integer.valueOf(this.f25151f));
    }
}
