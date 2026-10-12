package org.telegram.ui.Components;

import j$.util.Objects;
public final class c9 {
    public int f24854a;
    public boolean f24855b;
    public int f24856c;
    public int d;
    public int f24857e;
    public int f24858f;

    public final c9 a() {
        ?? obj = new Object();
        obj.f24856c = this.f24856c;
        obj.d = this.d;
        obj.f24857e = this.f24857e;
        obj.f24858f = this.f24858f;
        obj.f24855b = this.f24855b;
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
        if (this.f24856c == c9Var.f24856c && this.d == c9Var.d && this.f24857e == c9Var.f24857e && this.f24858f == c9Var.f24858f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f24854a), Integer.valueOf(this.f24856c), Integer.valueOf(this.d), Integer.valueOf(this.f24857e), Integer.valueOf(this.f24858f));
    }
}
