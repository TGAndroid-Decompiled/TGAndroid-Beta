package org.telegram.ui.Components;

import j$.util.Objects;
public final class u8 {
    public int f40272a;
    public boolean f40273b;
    public int f40274c;
    public int d;
    public int f40275e;
    public int f40276f;

    public final u8 a() {
        ?? obj = new Object();
        obj.f40274c = this.f40274c;
        obj.d = this.d;
        obj.f40275e = this.f40275e;
        obj.f40276f = this.f40276f;
        obj.f40273b = this.f40273b;
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
        if (this.f40274c == u8Var.f40274c && this.d == u8Var.d && this.f40275e == u8Var.f40275e && this.f40276f == u8Var.f40276f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f40272a), Integer.valueOf(this.f40274c), Integer.valueOf(this.d), Integer.valueOf(this.f40275e), Integer.valueOf(this.f40276f));
    }
}
