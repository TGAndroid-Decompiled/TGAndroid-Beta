package org.telegram.ui.Components;

import j$.util.Objects;
public final class u8 {
    public int f40289a;
    public boolean f40290b;
    public int f40291c;
    public int d;
    public int f40292e;
    public int f40293f;

    public final u8 a() {
        ?? obj = new Object();
        obj.f40291c = this.f40291c;
        obj.d = this.d;
        obj.f40292e = this.f40292e;
        obj.f40293f = this.f40293f;
        obj.f40290b = this.f40290b;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u8)) {
            return false;
        }
        u8 u8Var = (u8) obj;
        if (this.f40291c == u8Var.f40291c && this.d == u8Var.d && this.f40292e == u8Var.f40292e && this.f40293f == u8Var.f40293f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f40289a), Integer.valueOf(this.f40291c), Integer.valueOf(this.d), Integer.valueOf(this.f40292e), Integer.valueOf(this.f40293f));
    }
}
