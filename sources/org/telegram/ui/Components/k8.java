package org.telegram.ui.Components;

import j$.util.Objects;
public final class k8 {
    public int f27674a;
    public boolean f27675b;
    public int f27676c;
    public int d;
    public int e;
    public int f27677f;

    public final k8 a() {
        ?? obj = new Object();
        obj.f27676c = this.f27676c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f27677f = this.f27677f;
        obj.f27675b = this.f27675b;
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
        if (this.f27676c == k8Var.f27676c && this.d == k8Var.d && this.e == k8Var.e && this.f27677f == k8Var.f27677f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f27674a), Integer.valueOf(this.f27676c), Integer.valueOf(this.d), Integer.valueOf(this.e), Integer.valueOf(this.f27677f));
    }
}
