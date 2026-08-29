package org.telegram.ui.Components;

import j$.util.Objects;
public final class x8 {
    public int f34648a;
    public boolean f34649b;
    public int f34650c;
    public int d;
    public int f34651e;
    public int f34652f;

    public final x8 a() {
        ?? obj = new Object();
        obj.f34650c = this.f34650c;
        obj.d = this.d;
        obj.f34651e = this.f34651e;
        obj.f34652f = this.f34652f;
        obj.f34649b = this.f34649b;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x8)) {
            return false;
        }
        x8 x8Var = (x8) obj;
        if (this.f34650c == x8Var.f34650c && this.d == x8Var.d && this.f34651e == x8Var.f34651e && this.f34652f == x8Var.f34652f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f34648a), Integer.valueOf(this.f34650c), Integer.valueOf(this.d), Integer.valueOf(this.f34651e), Integer.valueOf(this.f34652f));
    }
}
