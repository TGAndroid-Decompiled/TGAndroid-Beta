package org.telegram.ui.Components;

import j$.util.Objects;
public final class a9 {
    public int f22614a;
    public boolean f22615b;
    public int f22616c;
    public int d;
    public int e;
    public int f22617f;

    public final a9 a() {
        ?? obj = new Object();
        obj.f22616c = this.f22616c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f22617f = this.f22617f;
        obj.f22615b = this.f22615b;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a9)) {
            return false;
        }
        a9 a9Var = (a9) obj;
        if (this.f22616c == a9Var.f22616c && this.d == a9Var.d && this.e == a9Var.e && this.f22617f == a9Var.f22617f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f22614a), Integer.valueOf(this.f22616c), Integer.valueOf(this.d), Integer.valueOf(this.e), Integer.valueOf(this.f22617f));
    }
}
