package org.telegram.ui.Components;

import j$.util.Objects;
public final class p8 {
    public int f36837a;
    public boolean f36838b;
    public int f36839c;
    public int d;
    public int f36840e;
    public int f36841f;

    public final p8 a() {
        ?? obj = new Object();
        obj.f36839c = this.f36839c;
        obj.d = this.d;
        obj.f36840e = this.f36840e;
        obj.f36841f = this.f36841f;
        obj.f36838b = this.f36838b;
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
        if (this.f36839c == p8Var.f36839c && this.d == p8Var.d && this.f36840e == p8Var.f36840e && this.f36841f == p8Var.f36841f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f36837a), Integer.valueOf(this.f36839c), Integer.valueOf(this.d), Integer.valueOf(this.f36840e), Integer.valueOf(this.f36841f));
    }
}
