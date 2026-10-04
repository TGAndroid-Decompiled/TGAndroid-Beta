package org.telegram.ui;
public final class p10 {
    public long f39310a;
    public int f39311b;

    public p10(int i10, long j3) {
        this.f39310a = j3;
        this.f39311b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && p10.class == obj.getClass()) {
            p10 p10Var = (p10) obj;
            if (this.f39310a == p10Var.f39310a && this.f39311b == p10Var.f39311b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f39311b;
    }
}
