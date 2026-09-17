package org.telegram.ui.Components;

import j$.util.Objects;
public final class b9 {
    public int f24600a;
    public boolean f24601b;
    public int f24602c;
    public int d;
    public int f24603e;
    public int f24604f;

    public final b9 a() {
        ?? obj = new Object();
        obj.f24602c = this.f24602c;
        obj.d = this.d;
        obj.f24603e = this.f24603e;
        obj.f24604f = this.f24604f;
        obj.f24601b = this.f24601b;
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
        if (this.f24602c == b9Var.f24602c && this.d == b9Var.d && this.f24603e == b9Var.f24603e && this.f24604f == b9Var.f24604f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f24600a), Integer.valueOf(this.f24602c), Integer.valueOf(this.d), Integer.valueOf(this.f24603e), Integer.valueOf(this.f24604f));
    }
}
