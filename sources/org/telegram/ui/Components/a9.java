package org.telegram.ui.Components;

import j$.util.Objects;
public final class a9 {
    public int f22385a;
    public boolean f22386b;
    public int f22387c;
    public int d;
    public int e;
    public int f22388f;

    public final a9 a() {
        ?? obj = new Object();
        obj.f22387c = this.f22387c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f22388f = this.f22388f;
        obj.f22386b = this.f22386b;
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
        if (this.f22387c == a9Var.f22387c && this.d == a9Var.d && this.e == a9Var.e && this.f22388f == a9Var.f22388f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f22385a), Integer.valueOf(this.f22387c), Integer.valueOf(this.d), Integer.valueOf(this.e), Integer.valueOf(this.f22388f));
    }
}
