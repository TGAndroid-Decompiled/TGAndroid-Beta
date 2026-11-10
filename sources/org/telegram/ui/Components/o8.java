package org.telegram.ui.Components;

import j$.util.Objects;
public final class o8 {
    public int f36533a;
    public boolean f36534b;
    public int f36535c;
    public int d;
    public int f36536e;
    public int f36537f;

    public final o8 a() {
        ?? obj = new Object();
        obj.f36535c = this.f36535c;
        obj.d = this.d;
        obj.f36536e = this.f36536e;
        obj.f36537f = this.f36537f;
        obj.f36534b = this.f36534b;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o8)) {
            return false;
        }
        o8 o8Var = (o8) obj;
        if (this.f36535c == o8Var.f36535c && this.d == o8Var.d && this.f36536e == o8Var.f36536e && this.f36537f == o8Var.f36537f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f36533a), Integer.valueOf(this.f36535c), Integer.valueOf(this.d), Integer.valueOf(this.f36536e), Integer.valueOf(this.f36537f));
    }
}
