package org.telegram.ui.Components;

import j$.util.Objects;
public final class d9 {
    public int f24012a;
    public boolean f24013b;
    public int f24014c;
    public int d;
    public int e;
    public int f24015f;

    public final d9 a() {
        ?? obj = new Object();
        obj.f24014c = this.f24014c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f24015f = this.f24015f;
        obj.f24013b = this.f24013b;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d9)) {
            return false;
        }
        d9 d9Var = (d9) obj;
        if (this.f24014c == d9Var.f24014c && this.d == d9Var.d && this.e == d9Var.e && this.f24015f == d9Var.f24015f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f24012a), Integer.valueOf(this.f24014c), Integer.valueOf(this.d), Integer.valueOf(this.e), Integer.valueOf(this.f24015f));
    }
}
