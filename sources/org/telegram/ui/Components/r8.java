package org.telegram.ui.Components;

import j$.util.Objects;

public final class r8 {

    public int f32099a;

    public boolean f32100b;

    public int f32101c;
    public int d;

    public int f32102e;

    public int f32103f;

    public final r8 a() {
        r8 r8Var = new r8();
        r8Var.f32101c = this.f32101c;
        r8Var.d = this.d;
        r8Var.f32102e = this.f32102e;
        r8Var.f32103f = this.f32103f;
        r8Var.f32100b = this.f32100b;
        return r8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r8)) {
            return false;
        }
        r8 r8Var = (r8) obj;
        return this.f32101c == r8Var.f32101c && this.d == r8Var.d && this.f32102e == r8Var.f32102e && this.f32103f == r8Var.f32103f;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f32099a), Integer.valueOf(this.f32101c), Integer.valueOf(this.d), Integer.valueOf(this.f32102e), Integer.valueOf(this.f32103f));
    }
}
