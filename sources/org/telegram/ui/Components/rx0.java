package org.telegram.ui.Components;
public final class rx0 {
    public final int f39431a;
    public final int f39432b;

    public rx0(int i7, int i10) {
        this.f39431a = i7;
        this.f39432b = i10;
    }

    public final int a() {
        return this.f39432b - this.f39431a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || rx0.class != obj.getClass()) {
            return false;
        }
        rx0 rx0Var = (rx0) obj;
        if (this.f39432b == rx0Var.f39432b && this.f39431a == rx0Var.f39431a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f39431a * 31) + this.f39432b;
    }
}
