package org.telegram.ui.Components;

import j$.util.Objects;
public final class s8 {
    public int f28690a;
    public boolean f28691b;
    public int f28692c;
    public int d;
    public int e;
    public int f28693f;

    public final s8 a() {
        ?? obj = new Object();
        obj.f28692c = this.f28692c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f28693f = this.f28693f;
        obj.f28691b = this.f28691b;
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
        if (this.f28692c == s8Var.f28692c && this.d == s8Var.d && this.e == s8Var.e && this.f28693f == s8Var.f28693f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f28690a), Integer.valueOf(this.f28692c), Integer.valueOf(this.d), Integer.valueOf(this.e), Integer.valueOf(this.f28693f));
    }
}
