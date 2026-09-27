package org.telegram.ui.Components;

import j$.util.Objects;
public final class a9 {
    public int f22616a;
    public boolean f22617b;
    public int f22618c;
    public int d;
    public int e;
    public int f22619f;

    public final a9 a() {
        ?? obj = new Object();
        obj.f22618c = this.f22618c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f22619f = this.f22619f;
        obj.f22617b = this.f22617b;
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
        if (this.f22618c == a9Var.f22618c && this.d == a9Var.d && this.e == a9Var.e && this.f22619f == a9Var.f22619f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f22616a), Integer.valueOf(this.f22618c), Integer.valueOf(this.d), Integer.valueOf(this.e), Integer.valueOf(this.f22619f));
    }
}
