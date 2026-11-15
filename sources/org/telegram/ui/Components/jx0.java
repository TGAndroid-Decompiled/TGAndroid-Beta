package org.telegram.ui.Components;
public final class jx0 {
    public final int f36188a;
    public final int f36189b;

    public jx0(int i7, int i10) {
        this.f36188a = i7;
        this.f36189b = i10;
    }

    public final int a() {
        return this.f36189b - this.f36188a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || jx0.class != obj.getClass()) {
            return false;
        }
        jx0 jx0Var = (jx0) obj;
        if (this.f36189b == jx0Var.f36189b && this.f36188a == jx0Var.f36188a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f36188a * 31) + this.f36189b;
    }
}
