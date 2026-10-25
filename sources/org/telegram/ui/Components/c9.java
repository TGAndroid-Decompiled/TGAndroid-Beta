package org.telegram.ui.Components;

import j$.util.Objects;
public final class c9 {
    public int f27091a;
    public boolean f27092b;
    public int f27093c;
    public int d;
    public int e;
    public int f27094f;

    public final c9 a() {
        ?? obj = new Object();
        obj.f27093c = this.f27093c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f27094f = this.f27094f;
        obj.f27092b = this.f27092b;
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
        if (this.f27093c == c9Var.f27093c && this.d == c9Var.d && this.e == c9Var.e && this.f27094f == c9Var.f27094f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f27091a), Integer.valueOf(this.f27093c), Integer.valueOf(this.d), Integer.valueOf(this.e), Integer.valueOf(this.f27094f));
    }
}
