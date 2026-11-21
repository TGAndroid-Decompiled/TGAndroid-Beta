package org.telegram.ui.Components;

import j$.util.Objects;
public final class u8 {
    public int f40297a;
    public boolean f40298b;
    public int f40299c;
    public int d;
    public int f40300e;
    public int f40301f;

    public final u8 a() {
        ?? obj = new Object();
        obj.f40299c = this.f40299c;
        obj.d = this.d;
        obj.f40300e = this.f40300e;
        obj.f40301f = this.f40301f;
        obj.f40298b = this.f40298b;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u8)) {
            return false;
        }
        u8 u8Var = (u8) obj;
        if (this.f40299c == u8Var.f40299c && this.d == u8Var.d && this.f40300e == u8Var.f40300e && this.f40301f == u8Var.f40301f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f40297a), Integer.valueOf(this.f40299c), Integer.valueOf(this.d), Integer.valueOf(this.f40300e), Integer.valueOf(this.f40301f));
    }
}
