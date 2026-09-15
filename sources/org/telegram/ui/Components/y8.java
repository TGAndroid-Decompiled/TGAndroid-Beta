package org.telegram.ui.Components;

import j$.util.Objects;
public final class y8 {
    public int f30173a;
    public boolean f30174b;
    public int f30175c;
    public int d;
    public int e;
    public int f30176f;

    public final y8 a() {
        ?? obj = new Object();
        obj.f30175c = this.f30175c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f30176f = this.f30176f;
        obj.f30174b = this.f30174b;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y8)) {
            return false;
        }
        y8 y8Var = (y8) obj;
        if (this.f30175c == y8Var.f30175c && this.d == y8Var.d && this.e == y8Var.e && this.f30176f == y8Var.f30176f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f30173a), Integer.valueOf(this.f30175c), Integer.valueOf(this.d), Integer.valueOf(this.e), Integer.valueOf(this.f30176f));
    }
}
