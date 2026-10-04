package org.telegram.ui.Components;

import j$.util.Objects;
public final class a9 {
    public int f24484a;
    public boolean f24485b;
    public int f24486c;
    public int d;
    public int f24487e;
    public int f24488f;

    public final a9 a() {
        ?? obj = new Object();
        obj.f24486c = this.f24486c;
        obj.d = this.d;
        obj.f24487e = this.f24487e;
        obj.f24488f = this.f24488f;
        obj.f24485b = this.f24485b;
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
        if (this.f24486c == a9Var.f24486c && this.d == a9Var.d && this.f24487e == a9Var.f24487e && this.f24488f == a9Var.f24488f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f24484a), Integer.valueOf(this.f24486c), Integer.valueOf(this.d), Integer.valueOf(this.f24487e), Integer.valueOf(this.f24488f));
    }
}
