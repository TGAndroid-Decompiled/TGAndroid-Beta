package org.telegram.ui.Components;

import j$.util.Objects;
public final class c9 {
    public int f25239a;
    public boolean f25240b;
    public int f25241c;
    public int d;
    public int f25242e;
    public int f25243f;

    public final c9 a() {
        ?? obj = new Object();
        obj.f25241c = this.f25241c;
        obj.d = this.d;
        obj.f25242e = this.f25242e;
        obj.f25243f = this.f25243f;
        obj.f25240b = this.f25240b;
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
        if (this.f25241c == c9Var.f25241c && this.d == c9Var.d && this.f25242e == c9Var.f25242e && this.f25243f == c9Var.f25243f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f25239a), Integer.valueOf(this.f25241c), Integer.valueOf(this.d), Integer.valueOf(this.f25242e), Integer.valueOf(this.f25243f));
    }
}
