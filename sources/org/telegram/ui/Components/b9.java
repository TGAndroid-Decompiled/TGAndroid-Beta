package org.telegram.ui.Components;

import j$.util.Objects;
public final class b9 {
    public int f24627a;
    public boolean f24628b;
    public int f24629c;
    public int d;
    public int f24630e;
    public int f24631f;

    public final b9 a() {
        ?? obj = new Object();
        obj.f24629c = this.f24629c;
        obj.d = this.d;
        obj.f24630e = this.f24630e;
        obj.f24631f = this.f24631f;
        obj.f24628b = this.f24628b;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b9)) {
            return false;
        }
        b9 b9Var = (b9) obj;
        if (this.f24629c == b9Var.f24629c && this.d == b9Var.d && this.f24630e == b9Var.f24630e && this.f24631f == b9Var.f24631f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f24627a), Integer.valueOf(this.f24629c), Integer.valueOf(this.d), Integer.valueOf(this.f24630e), Integer.valueOf(this.f24631f));
    }
}
