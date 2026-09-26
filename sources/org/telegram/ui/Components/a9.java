package org.telegram.ui.Components;

import j$.util.Objects;
public final class a9 {
    public int f22631a;
    public boolean f22632b;
    public int f22633c;
    public int d;
    public int e;
    public int f22634f;

    public final a9 a() {
        ?? obj = new Object();
        obj.f22633c = this.f22633c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f22634f = this.f22634f;
        obj.f22632b = this.f22632b;
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
        if (this.f22633c == a9Var.f22633c && this.d == a9Var.d && this.e == a9Var.e && this.f22634f == a9Var.f22634f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f22631a), Integer.valueOf(this.f22633c), Integer.valueOf(this.d), Integer.valueOf(this.e), Integer.valueOf(this.f22634f));
    }
}
