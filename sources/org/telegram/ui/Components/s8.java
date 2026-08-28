package org.telegram.ui.Components;

import j$.util.Objects;
public final class s8 {
    public int f32391a;
    public boolean f32392b;
    public int f32393c;
    public int d;
    public int f32394e;
    public int f32395f;

    public final s8 a() {
        ?? obj = new Object();
        obj.f32393c = this.f32393c;
        obj.d = this.d;
        obj.f32394e = this.f32394e;
        obj.f32395f = this.f32395f;
        obj.f32392b = this.f32392b;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s8)) {
            return false;
        }
        s8 s8Var = (s8) obj;
        if (this.f32393c == s8Var.f32393c && this.d == s8Var.d && this.f32394e == s8Var.f32394e && this.f32395f == s8Var.f32395f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f32391a), Integer.valueOf(this.f32393c), Integer.valueOf(this.d), Integer.valueOf(this.f32394e), Integer.valueOf(this.f32395f));
    }
}
