package org.telegram.ui.Components;

import j$.util.Objects;
public final class u8 {
    public int f40250a;
    public boolean f40251b;
    public int f40252c;
    public int d;
    public int f40253e;
    public int f40254f;

    public final u8 a() {
        ?? obj = new Object();
        obj.f40252c = this.f40252c;
        obj.d = this.d;
        obj.f40253e = this.f40253e;
        obj.f40254f = this.f40254f;
        obj.f40251b = this.f40251b;
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
        if (this.f40252c == u8Var.f40252c && this.d == u8Var.d && this.f40253e == u8Var.f40253e && this.f40254f == u8Var.f40254f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f40250a), Integer.valueOf(this.f40252c), Integer.valueOf(this.d), Integer.valueOf(this.f40253e), Integer.valueOf(this.f40254f));
    }
}
