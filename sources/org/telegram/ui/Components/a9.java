package org.telegram.ui.Components;

import j$.util.Objects;
public final class a9 {
    public int f24515a;
    public boolean f24516b;
    public int f24517c;
    public int d;
    public int e;
    public int f24518f;

    public final a9 a() {
        ?? obj = new Object();
        obj.f24517c = this.f24517c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f24518f = this.f24518f;
        obj.f24516b = this.f24516b;
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
        if (this.f24517c == a9Var.f24517c && this.d == a9Var.d && this.e == a9Var.e && this.f24518f == a9Var.f24518f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f24515a), Integer.valueOf(this.f24517c), Integer.valueOf(this.d), Integer.valueOf(this.e), Integer.valueOf(this.f24518f));
    }
}
