package org.telegram.ui.Components;

import j$.util.Objects;
public final class u8 {
    public int f40290a;
    public boolean f40291b;
    public int f40292c;
    public int d;
    public int f40293e;
    public int f40294f;

    public final u8 a() {
        ?? obj = new Object();
        obj.f40292c = this.f40292c;
        obj.d = this.d;
        obj.f40293e = this.f40293e;
        obj.f40294f = this.f40294f;
        obj.f40291b = this.f40291b;
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
        if (this.f40292c == u8Var.f40292c && this.d == u8Var.d && this.f40293e == u8Var.f40293e && this.f40294f == u8Var.f40294f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f40290a), Integer.valueOf(this.f40292c), Integer.valueOf(this.d), Integer.valueOf(this.f40293e), Integer.valueOf(this.f40294f));
    }
}
