package org.telegram.ui.Components;

import j$.util.Objects;
public final class a9 {
    public int f22613a;
    public boolean f22614b;
    public int f22615c;
    public int d;
    public int e;
    public int f22616f;

    public final a9 a() {
        ?? obj = new Object();
        obj.f22615c = this.f22615c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f22616f = this.f22616f;
        obj.f22614b = this.f22614b;
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
        if (this.f22615c == a9Var.f22615c && this.d == a9Var.d && this.e == a9Var.e && this.f22616f == a9Var.f22616f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f22613a), Integer.valueOf(this.f22615c), Integer.valueOf(this.d), Integer.valueOf(this.e), Integer.valueOf(this.f22616f));
    }
}
