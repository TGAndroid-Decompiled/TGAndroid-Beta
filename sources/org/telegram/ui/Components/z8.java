package org.telegram.ui.Components;

import j$.util.Objects;
public final class z8 {
    public int f29613a;
    public boolean f29614b;
    public int f29615c;
    public int d;
    public int e;
    public int f29616f;

    public final z8 a() {
        ?? obj = new Object();
        obj.f29615c = this.f29615c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f29616f = this.f29616f;
        obj.f29614b = this.f29614b;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z8)) {
            return false;
        }
        z8 z8Var = (z8) obj;
        if (this.f29615c == z8Var.f29615c && this.d == z8Var.d && this.e == z8Var.e && this.f29616f == z8Var.f29616f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f29613a), Integer.valueOf(this.f29615c), Integer.valueOf(this.d), Integer.valueOf(this.e), Integer.valueOf(this.f29616f));
    }
}
