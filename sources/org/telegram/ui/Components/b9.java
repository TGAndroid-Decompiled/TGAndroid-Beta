package org.telegram.ui.Components;

import j$.util.Objects;
public final class b9 {
    public int f24599a;
    public boolean f24600b;
    public int f24601c;
    public int d;
    public int f24602e;
    public int f24603f;

    public final b9 a() {
        ?? obj = new Object();
        obj.f24601c = this.f24601c;
        obj.d = this.d;
        obj.f24602e = this.f24602e;
        obj.f24603f = this.f24603f;
        obj.f24600b = this.f24600b;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b9)) {
            return false;
        }
        b9 b9Var = (b9) obj;
        if (this.f24601c == b9Var.f24601c && this.d == b9Var.d && this.f24602e == b9Var.f24602e && this.f24603f == b9Var.f24603f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f24599a), Integer.valueOf(this.f24601c), Integer.valueOf(this.d), Integer.valueOf(this.f24602e), Integer.valueOf(this.f24603f));
    }
}
