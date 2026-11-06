package org.telegram.ui.Components;

import j$.util.Objects;
public final class p8 {
    public int f36916a;
    public boolean f36917b;
    public int f36918c;
    public int d;
    public int f36919e;
    public int f36920f;

    public final p8 a() {
        ?? obj = new Object();
        obj.f36918c = this.f36918c;
        obj.d = this.d;
        obj.f36919e = this.f36919e;
        obj.f36920f = this.f36920f;
        obj.f36917b = this.f36917b;
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
        if (this.f36918c == p8Var.f36918c && this.d == p8Var.d && this.f36919e == p8Var.f36919e && this.f36920f == p8Var.f36920f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f36916a), Integer.valueOf(this.f36918c), Integer.valueOf(this.d), Integer.valueOf(this.f36919e), Integer.valueOf(this.f36920f));
    }
}
