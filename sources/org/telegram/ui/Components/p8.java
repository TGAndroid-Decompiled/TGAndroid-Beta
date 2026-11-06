package org.telegram.ui.Components;

import j$.util.Objects;
public final class p8 {
    public int f36795a;
    public boolean f36796b;
    public int f36797c;
    public int d;
    public int f36798e;
    public int f36799f;

    public final p8 a() {
        ?? obj = new Object();
        obj.f36797c = this.f36797c;
        obj.d = this.d;
        obj.f36798e = this.f36798e;
        obj.f36799f = this.f36799f;
        obj.f36796b = this.f36796b;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p8)) {
            return false;
        }
        p8 p8Var = (p8) obj;
        if (this.f36797c == p8Var.f36797c && this.d == p8Var.d && this.f36798e == p8Var.f36798e && this.f36799f == p8Var.f36799f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f36795a), Integer.valueOf(this.f36797c), Integer.valueOf(this.d), Integer.valueOf(this.f36798e), Integer.valueOf(this.f36799f));
    }
}
