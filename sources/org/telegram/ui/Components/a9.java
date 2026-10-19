package org.telegram.ui.Components;

import j$.util.Objects;
public final class a9 {
    public int f24517a;
    public boolean f24518b;
    public int f24519c;
    public int d;
    public int e;
    public int f24520f;

    public final a9 a() {
        ?? obj = new Object();
        obj.f24519c = this.f24519c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f24520f = this.f24520f;
        obj.f24518b = this.f24518b;
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
        if (this.f24519c == a9Var.f24519c && this.d == a9Var.d && this.e == a9Var.e && this.f24520f == a9Var.f24520f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f24517a), Integer.valueOf(this.f24519c), Integer.valueOf(this.d), Integer.valueOf(this.e), Integer.valueOf(this.f24520f));
    }
}
