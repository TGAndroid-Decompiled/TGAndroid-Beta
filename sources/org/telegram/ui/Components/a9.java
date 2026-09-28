package org.telegram.ui.Components;

import j$.util.Objects;
public final class a9 {
    public int f22612a;
    public boolean f22613b;
    public int f22614c;
    public int d;
    public int e;
    public int f22615f;

    public final a9 a() {
        ?? obj = new Object();
        obj.f22614c = this.f22614c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f22615f = this.f22615f;
        obj.f22613b = this.f22613b;
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
        if (this.f22614c == a9Var.f22614c && this.d == a9Var.d && this.e == a9Var.e && this.f22615f == a9Var.f22615f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f22612a), Integer.valueOf(this.f22614c), Integer.valueOf(this.d), Integer.valueOf(this.e), Integer.valueOf(this.f22615f));
    }
}
