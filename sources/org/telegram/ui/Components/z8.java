package org.telegram.ui.Components;

import j$.util.Objects;
public final class z8 {
    public int f30775a;
    public boolean f30776b;
    public int f30777c;
    public int d;
    public int e;
    public int f30778f;

    public final z8 a() {
        ?? obj = new Object();
        obj.f30777c = this.f30777c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f30778f = this.f30778f;
        obj.f30776b = this.f30776b;
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
        if (this.f30777c == z8Var.f30777c && this.d == z8Var.d && this.e == z8Var.e && this.f30778f == z8Var.f30778f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f30775a), Integer.valueOf(this.f30777c), Integer.valueOf(this.d), Integer.valueOf(this.e), Integer.valueOf(this.f30778f));
    }
}
