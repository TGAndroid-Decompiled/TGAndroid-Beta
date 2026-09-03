package org.telegram.ui.Components;

import j$.util.Objects;
public final class s8 {
    public int f31000a;
    public boolean f31001b;
    public int f31002c;
    public int d;
    public int f31003e;
    public int f31004f;

    public final s8 a() {
        ?? obj = new Object();
        obj.f31002c = this.f31002c;
        obj.d = this.d;
        obj.f31003e = this.f31003e;
        obj.f31004f = this.f31004f;
        obj.f31001b = this.f31001b;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s8)) {
            return false;
        }
        s8 s8Var = (s8) obj;
        if (this.f31002c == s8Var.f31002c && this.d == s8Var.d && this.f31003e == s8Var.f31003e && this.f31004f == s8Var.f31004f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f31000a), Integer.valueOf(this.f31002c), Integer.valueOf(this.d), Integer.valueOf(this.f31003e), Integer.valueOf(this.f31004f));
    }
}
