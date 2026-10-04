package org.telegram.ui;
public final class p10 {
    public long f39311a;
    public int f39312b;

    public p10(int i10, long j3) {
        this.f39311a = j3;
        this.f39312b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && p10.class == obj.getClass()) {
            p10 p10Var = (p10) obj;
            if (this.f39311a == p10Var.f39311a && this.f39312b == p10Var.f39312b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f39312b;
    }
}
