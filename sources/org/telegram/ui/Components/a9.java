package org.telegram.ui.Components;

import j$.util.Objects;
public final class a9 {
    public int f22570a;
    public boolean f22571b;
    public int f22572c;
    public int d;
    public int e;
    public int f22573f;

    public final a9 a() {
        ?? obj = new Object();
        obj.f22572c = this.f22572c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f22573f = this.f22573f;
        obj.f22571b = this.f22571b;
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
        if (this.f22572c == a9Var.f22572c && this.d == a9Var.d && this.e == a9Var.e && this.f22573f == a9Var.f22573f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f22570a), Integer.valueOf(this.f22572c), Integer.valueOf(this.d), Integer.valueOf(this.e), Integer.valueOf(this.f22573f));
    }
}
