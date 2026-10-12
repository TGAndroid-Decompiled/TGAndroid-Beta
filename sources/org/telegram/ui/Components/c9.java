package org.telegram.ui.Components;

import j$.util.Objects;
public final class c9 {
    public int f24859a;
    public boolean f24860b;
    public int f24861c;
    public int d;
    public int f24862e;
    public int f24863f;

    public final c9 a() {
        ?? obj = new Object();
        obj.f24861c = this.f24861c;
        obj.d = this.d;
        obj.f24862e = this.f24862e;
        obj.f24863f = this.f24863f;
        obj.f24860b = this.f24860b;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c9)) {
            return false;
        }
        c9 c9Var = (c9) obj;
        if (this.f24861c == c9Var.f24861c && this.d == c9Var.d && this.f24862e == c9Var.f24862e && this.f24863f == c9Var.f24863f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f24859a), Integer.valueOf(this.f24861c), Integer.valueOf(this.d), Integer.valueOf(this.f24862e), Integer.valueOf(this.f24863f));
    }
}
