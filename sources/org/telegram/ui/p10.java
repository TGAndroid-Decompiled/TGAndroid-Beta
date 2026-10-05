package org.telegram.ui;
public final class p10 {
    public long f39326a;
    public int f39327b;

    public p10(int i10, long j3) {
        this.f39326a = j3;
        this.f39327b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && p10.class == obj.getClass()) {
            p10 p10Var = (p10) obj;
            if (this.f39326a == p10Var.f39326a && this.f39327b == p10Var.f39327b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f39327b;
    }
}
