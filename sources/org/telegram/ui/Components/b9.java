package org.telegram.ui.Components;

import j$.util.Objects;
public final class b9 {
    public int f24626a;
    public boolean f24627b;
    public int f24628c;
    public int d;
    public int f24629e;
    public int f24630f;

    public final b9 a() {
        ?? obj = new Object();
        obj.f24628c = this.f24628c;
        obj.d = this.d;
        obj.f24629e = this.f24629e;
        obj.f24630f = this.f24630f;
        obj.f24627b = this.f24627b;
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
        if (this.f24628c == b9Var.f24628c && this.d == b9Var.d && this.f24629e == b9Var.f24629e && this.f24630f == b9Var.f24630f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f24626a), Integer.valueOf(this.f24628c), Integer.valueOf(this.d), Integer.valueOf(this.f24629e), Integer.valueOf(this.f24630f));
    }
}
