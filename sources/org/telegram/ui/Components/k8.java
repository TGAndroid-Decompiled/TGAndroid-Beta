package org.telegram.ui.Components;

import j$.util.Objects;
public final class k8 {
    public int f27768a;
    public boolean f27769b;
    public int f27770c;
    public int d;
    public int e;
    public int f27771f;

    public final k8 a() {
        ?? obj = new Object();
        obj.f27770c = this.f27770c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f27771f = this.f27771f;
        obj.f27769b = this.f27769b;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k8)) {
            return false;
        }
        k8 k8Var = (k8) obj;
        if (this.f27770c == k8Var.f27770c && this.d == k8Var.d && this.e == k8Var.e && this.f27771f == k8Var.f27771f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f27768a), Integer.valueOf(this.f27770c), Integer.valueOf(this.d), Integer.valueOf(this.e), Integer.valueOf(this.f27771f));
    }
}
