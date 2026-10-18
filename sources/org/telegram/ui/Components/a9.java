package org.telegram.ui.Components;

import j$.util.Objects;
public final class a9 {
    public int f24548a;
    public boolean f24549b;
    public int f24550c;
    public int d;
    public int e;
    public int f24551f;

    public final a9 a() {
        ?? obj = new Object();
        obj.f24550c = this.f24550c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f24551f = this.f24551f;
        obj.f24549b = this.f24549b;
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
        if (this.f24550c == a9Var.f24550c && this.d == a9Var.d && this.e == a9Var.e && this.f24551f == a9Var.f24551f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f24548a), Integer.valueOf(this.f24550c), Integer.valueOf(this.d), Integer.valueOf(this.e), Integer.valueOf(this.f24551f));
    }
}
