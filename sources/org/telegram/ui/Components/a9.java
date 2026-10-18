package org.telegram.ui.Components;

import j$.util.Objects;
public final class a9 {
    public int f24541a;
    public boolean f24542b;
    public int f24543c;
    public int d;
    public int e;
    public int f24544f;

    public final a9 a() {
        ?? obj = new Object();
        obj.f24543c = this.f24543c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f24544f = this.f24544f;
        obj.f24542b = this.f24542b;
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
        if (this.f24543c == a9Var.f24543c && this.d == a9Var.d && this.e == a9Var.e && this.f24544f == a9Var.f24544f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f24541a), Integer.valueOf(this.f24543c), Integer.valueOf(this.d), Integer.valueOf(this.e), Integer.valueOf(this.f24544f));
    }
}
