package org.telegram.ui.Components;

import j$.util.Objects;
public final class a9 {
    public int f22564a;
    public boolean f22565b;
    public int f22566c;
    public int d;
    public int e;
    public int f22567f;

    public final a9 a() {
        ?? obj = new Object();
        obj.f22566c = this.f22566c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f22567f = this.f22567f;
        obj.f22565b = this.f22565b;
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
        if (this.f22566c == a9Var.f22566c && this.d == a9Var.d && this.e == a9Var.e && this.f22567f == a9Var.f22567f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f22564a), Integer.valueOf(this.f22566c), Integer.valueOf(this.d), Integer.valueOf(this.e), Integer.valueOf(this.f22567f));
    }
}
