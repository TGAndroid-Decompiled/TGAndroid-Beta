package org.telegram.ui.Components;

import j$.util.Objects;
public final class a9 {
    public int f22617a;
    public boolean f22618b;
    public int f22619c;
    public int d;
    public int e;
    public int f22620f;

    public final a9 a() {
        ?? obj = new Object();
        obj.f22619c = this.f22619c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f22620f = this.f22620f;
        obj.f22618b = this.f22618b;
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
        if (this.f22619c == a9Var.f22619c && this.d == a9Var.d && this.e == a9Var.e && this.f22620f == a9Var.f22620f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f22617a), Integer.valueOf(this.f22619c), Integer.valueOf(this.d), Integer.valueOf(this.e), Integer.valueOf(this.f22620f));
    }
}
