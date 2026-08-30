package org.telegram.ui.Components;

import j$.util.Objects;
public final class s8 {
    public int f28665a;
    public boolean f28666b;
    public int f28667c;
    public int d;
    public int e;
    public int f28668f;

    public final s8 a() {
        ?? obj = new Object();
        obj.f28667c = this.f28667c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f28668f = this.f28668f;
        obj.f28666b = this.f28666b;
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
        if (this.f28667c == s8Var.f28667c && this.d == s8Var.d && this.e == s8Var.e && this.f28668f == s8Var.f28668f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f28665a), Integer.valueOf(this.f28667c), Integer.valueOf(this.d), Integer.valueOf(this.e), Integer.valueOf(this.f28668f));
    }
}
