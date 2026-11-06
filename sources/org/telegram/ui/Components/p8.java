package org.telegram.ui.Components;

import j$.util.Objects;
public final class p8 {
    public int f36811a;
    public boolean f36812b;
    public int f36813c;
    public int d;
    public int f36814e;
    public int f36815f;

    public final p8 a() {
        ?? obj = new Object();
        obj.f36813c = this.f36813c;
        obj.d = this.d;
        obj.f36814e = this.f36814e;
        obj.f36815f = this.f36815f;
        obj.f36812b = this.f36812b;
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
        if (this.f36813c == p8Var.f36813c && this.d == p8Var.d && this.f36814e == p8Var.f36814e && this.f36815f == p8Var.f36815f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f36811a), Integer.valueOf(this.f36813c), Integer.valueOf(this.d), Integer.valueOf(this.f36814e), Integer.valueOf(this.f36815f));
    }
}
