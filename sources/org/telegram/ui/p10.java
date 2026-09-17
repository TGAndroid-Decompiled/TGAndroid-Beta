package org.telegram.ui;
public final class p10 {
    public long f39382a;
    public int f39383b;

    public p10(int i10, long j3) {
        this.f39382a = j3;
        this.f39383b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && p10.class == obj.getClass()) {
            p10 p10Var = (p10) obj;
            if (this.f39382a == p10Var.f39382a && this.f39383b == p10Var.f39383b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f39383b;
    }
}
