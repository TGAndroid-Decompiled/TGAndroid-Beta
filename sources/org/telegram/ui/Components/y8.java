package org.telegram.ui.Components;

import j$.util.Objects;
public final class y8 {
    public int f30141a;
    public boolean f30142b;
    public int f30143c;
    public int d;
    public int e;
    public int f30144f;

    public final y8 a() {
        ?? obj = new Object();
        obj.f30143c = this.f30143c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f30144f = this.f30144f;
        obj.f30142b = this.f30142b;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y8)) {
            return false;
        }
        y8 y8Var = (y8) obj;
        if (this.f30143c == y8Var.f30143c && this.d == y8Var.d && this.e == y8Var.e && this.f30144f == y8Var.f30144f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f30141a), Integer.valueOf(this.f30143c), Integer.valueOf(this.d), Integer.valueOf(this.e), Integer.valueOf(this.f30144f));
    }
}
