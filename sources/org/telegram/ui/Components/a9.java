package org.telegram.ui.Components;

import j$.util.Objects;
public final class a9 {
    public int f24479a;
    public boolean f24480b;
    public int f24481c;
    public int d;
    public int f24482e;
    public int f24483f;

    public final a9 a() {
        ?? obj = new Object();
        obj.f24481c = this.f24481c;
        obj.d = this.d;
        obj.f24482e = this.f24482e;
        obj.f24483f = this.f24483f;
        obj.f24480b = this.f24480b;
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
        if (this.f24481c == a9Var.f24481c && this.d == a9Var.d && this.f24482e == a9Var.f24482e && this.f24483f == a9Var.f24483f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f24479a), Integer.valueOf(this.f24481c), Integer.valueOf(this.d), Integer.valueOf(this.f24482e), Integer.valueOf(this.f24483f));
    }
}
