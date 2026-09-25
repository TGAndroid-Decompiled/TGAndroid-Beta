package org.telegram.ui.Components;

import j$.util.Objects;
public final class a9 {
    public int f22632a;
    public boolean f22633b;
    public int f22634c;
    public int d;
    public int e;
    public int f22635f;

    public final a9 a() {
        ?? obj = new Object();
        obj.f22634c = this.f22634c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f22635f = this.f22635f;
        obj.f22633b = this.f22633b;
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
        if (this.f22634c == a9Var.f22634c && this.d == a9Var.d && this.e == a9Var.e && this.f22635f == a9Var.f22635f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f22632a), Integer.valueOf(this.f22634c), Integer.valueOf(this.d), Integer.valueOf(this.e), Integer.valueOf(this.f22635f));
    }
}
