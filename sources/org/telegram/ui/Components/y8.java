package org.telegram.ui.Components;

import j$.util.Objects;
public final class y8 {
    public int f32840a;
    public boolean f32841b;
    public int f32842c;
    public int d;
    public int e;
    public int f32843f;

    public final y8 a() {
        ?? obj = new Object();
        obj.f32842c = this.f32842c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f32843f = this.f32843f;
        obj.f32841b = this.f32841b;
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
        if (this.f32842c == y8Var.f32842c && this.d == y8Var.d && this.e == y8Var.e && this.f32843f == y8Var.f32843f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f32840a), Integer.valueOf(this.f32842c), Integer.valueOf(this.d), Integer.valueOf(this.e), Integer.valueOf(this.f32843f));
    }
}
