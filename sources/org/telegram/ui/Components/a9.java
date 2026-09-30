package org.telegram.ui.Components;

import j$.util.Objects;
public final class a9 {
    public int f22586a;
    public boolean f22587b;
    public int f22588c;
    public int d;
    public int e;
    public int f22589f;

    public final a9 a() {
        ?? obj = new Object();
        obj.f22588c = this.f22588c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f22589f = this.f22589f;
        obj.f22587b = this.f22587b;
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
        if (this.f22588c == a9Var.f22588c && this.d == a9Var.d && this.e == a9Var.e && this.f22589f == a9Var.f22589f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f22586a), Integer.valueOf(this.f22588c), Integer.valueOf(this.d), Integer.valueOf(this.e), Integer.valueOf(this.f22589f));
    }
}
