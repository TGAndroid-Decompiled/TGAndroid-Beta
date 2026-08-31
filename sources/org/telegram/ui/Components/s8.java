package org.telegram.ui.Components;

import j$.util.Objects;
public final class s8 {
    public int f31004a;
    public boolean f31005b;
    public int f31006c;
    public int d;
    public int f31007e;
    public int f31008f;

    public final s8 a() {
        ?? obj = new Object();
        obj.f31006c = this.f31006c;
        obj.d = this.d;
        obj.f31007e = this.f31007e;
        obj.f31008f = this.f31008f;
        obj.f31005b = this.f31005b;
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
        if (this.f31006c == s8Var.f31006c && this.d == s8Var.d && this.f31007e == s8Var.f31007e && this.f31008f == s8Var.f31008f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f31004a), Integer.valueOf(this.f31006c), Integer.valueOf(this.d), Integer.valueOf(this.f31007e), Integer.valueOf(this.f31008f));
    }
}
