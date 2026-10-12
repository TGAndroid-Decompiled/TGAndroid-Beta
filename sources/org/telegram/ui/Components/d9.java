package org.telegram.ui.Components;

import j$.util.Objects;
public final class d9 {
    public int f24320a;
    public boolean f24321b;
    public int f24322c;
    public int d;
    public int e;
    public int f24323f;

    public final d9 a() {
        ?? obj = new Object();
        obj.f24322c = this.f24322c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f24323f = this.f24323f;
        obj.f24321b = this.f24321b;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d9)) {
            return false;
        }
        d9 d9Var = (d9) obj;
        if (this.f24322c == d9Var.f24322c && this.d == d9Var.d && this.e == d9Var.e && this.f24323f == d9Var.f24323f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f24320a), Integer.valueOf(this.f24322c), Integer.valueOf(this.d), Integer.valueOf(this.e), Integer.valueOf(this.f24323f));
    }
}
