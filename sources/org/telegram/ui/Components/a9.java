package org.telegram.ui.Components;

import j$.util.Objects;
public final class a9 {
    public int f24546a;
    public boolean f24547b;
    public int f24548c;
    public int d;
    public int e;
    public int f24549f;

    public final a9 a() {
        ?? obj = new Object();
        obj.f24548c = this.f24548c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f24549f = this.f24549f;
        obj.f24547b = this.f24547b;
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
        if (this.f24548c == a9Var.f24548c && this.d == a9Var.d && this.e == a9Var.e && this.f24549f == a9Var.f24549f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f24546a), Integer.valueOf(this.f24548c), Integer.valueOf(this.d), Integer.valueOf(this.e), Integer.valueOf(this.f24549f));
    }
}
