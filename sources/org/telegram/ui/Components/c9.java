package org.telegram.ui.Components;

import j$.util.Objects;
public final class c9 {
    public int f27100a;
    public boolean f27101b;
    public int f27102c;
    public int d;
    public int e;
    public int f27103f;

    public final c9 a() {
        ?? obj = new Object();
        obj.f27102c = this.f27102c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f27103f = this.f27103f;
        obj.f27101b = this.f27101b;
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
        if (this.f27102c == c9Var.f27102c && this.d == c9Var.d && this.e == c9Var.e && this.f27103f == c9Var.f27103f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f27100a), Integer.valueOf(this.f27102c), Integer.valueOf(this.d), Integer.valueOf(this.e), Integer.valueOf(this.f27103f));
    }
}
