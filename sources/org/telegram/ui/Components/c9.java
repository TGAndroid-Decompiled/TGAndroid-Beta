package org.telegram.ui.Components;

import j$.util.Objects;
public final class c9 {
    public int f27093a;
    public boolean f27094b;
    public int f27095c;
    public int d;
    public int e;
    public int f27096f;

    public final c9 a() {
        ?? obj = new Object();
        obj.f27095c = this.f27095c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f27096f = this.f27096f;
        obj.f27094b = this.f27094b;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c9)) {
            return false;
        }
        c9 c9Var = (c9) obj;
        if (this.f27095c == c9Var.f27095c && this.d == c9Var.d && this.e == c9Var.e && this.f27096f == c9Var.f27096f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f27093a), Integer.valueOf(this.f27095c), Integer.valueOf(this.d), Integer.valueOf(this.e), Integer.valueOf(this.f27096f));
    }
}
