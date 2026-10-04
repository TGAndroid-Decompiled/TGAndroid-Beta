package org.telegram.ui.Components;

import j$.util.Objects;
public final class a9 {
    public int f24480a;
    public boolean f24481b;
    public int f24482c;
    public int d;
    public int f24483e;
    public int f24484f;

    public final a9 a() {
        ?? obj = new Object();
        obj.f24482c = this.f24482c;
        obj.d = this.d;
        obj.f24483e = this.f24483e;
        obj.f24484f = this.f24484f;
        obj.f24481b = this.f24481b;
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
        if (this.f24482c == a9Var.f24482c && this.d == a9Var.d && this.f24483e == a9Var.f24483e && this.f24484f == a9Var.f24484f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f24480a), Integer.valueOf(this.f24482c), Integer.valueOf(this.d), Integer.valueOf(this.f24483e), Integer.valueOf(this.f24484f));
    }
}
