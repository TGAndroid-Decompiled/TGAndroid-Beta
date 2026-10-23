package org.telegram.ui.Components;

import j$.util.Objects;
public final class a9 {
    public int f24661a;
    public boolean f24662b;
    public int f24663c;
    public int d;
    public int e;
    public int f24664f;

    public final a9 a() {
        ?? obj = new Object();
        obj.f24663c = this.f24663c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f24664f = this.f24664f;
        obj.f24662b = this.f24662b;
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
        if (this.f24663c == a9Var.f24663c && this.d == a9Var.d && this.e == a9Var.e && this.f24664f == a9Var.f24664f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f24661a), Integer.valueOf(this.f24663c), Integer.valueOf(this.d), Integer.valueOf(this.e), Integer.valueOf(this.f24664f));
    }
}
