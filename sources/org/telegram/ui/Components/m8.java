package org.telegram.ui.Components;

import j$.util.Objects;
public final class m8 {
    public int f37161a;
    public boolean f37162b;
    public int f37163c;
    public int d;
    public int f37164e;
    public int f37165f;

    public final m8 a() {
        ?? obj = new Object();
        obj.f37163c = this.f37163c;
        obj.d = this.d;
        obj.f37164e = this.f37164e;
        obj.f37165f = this.f37165f;
        obj.f37162b = this.f37162b;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m8)) {
            return false;
        }
        m8 m8Var = (m8) obj;
        if (this.f37163c == m8Var.f37163c && this.d == m8Var.d && this.f37164e == m8Var.f37164e && this.f37165f == m8Var.f37165f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f37161a), Integer.valueOf(this.f37163c), Integer.valueOf(this.d), Integer.valueOf(this.f37164e), Integer.valueOf(this.f37165f));
    }
}
