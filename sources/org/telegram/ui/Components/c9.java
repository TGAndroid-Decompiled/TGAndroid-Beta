package org.telegram.ui.Components;

import j$.util.Objects;
public final class c9 {
    public int f25262a;
    public boolean f25263b;
    public int f25264c;
    public int d;
    public int f25265e;
    public int f25266f;

    public final c9 a() {
        ?? obj = new Object();
        obj.f25264c = this.f25264c;
        obj.d = this.d;
        obj.f25265e = this.f25265e;
        obj.f25266f = this.f25266f;
        obj.f25263b = this.f25263b;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c9)) {
            return false;
        }
        c9 c9Var = (c9) obj;
        if (this.f25264c == c9Var.f25264c && this.d == c9Var.d && this.f25265e == c9Var.f25265e && this.f25266f == c9Var.f25266f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f25262a), Integer.valueOf(this.f25264c), Integer.valueOf(this.d), Integer.valueOf(this.f25265e), Integer.valueOf(this.f25266f));
    }
}
