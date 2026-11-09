package org.telegram.ui.Components;

import j$.util.Objects;
public final class p8 {
    public int f36939a;
    public boolean f36940b;
    public int f36941c;
    public int d;
    public int f36942e;
    public int f36943f;

    public final p8 a() {
        ?? obj = new Object();
        obj.f36941c = this.f36941c;
        obj.d = this.d;
        obj.f36942e = this.f36942e;
        obj.f36943f = this.f36943f;
        obj.f36940b = this.f36940b;
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
        if (this.f36941c == p8Var.f36941c && this.d == p8Var.d && this.f36942e == p8Var.f36942e && this.f36943f == p8Var.f36943f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f36939a), Integer.valueOf(this.f36941c), Integer.valueOf(this.d), Integer.valueOf(this.f36942e), Integer.valueOf(this.f36943f));
    }
}
