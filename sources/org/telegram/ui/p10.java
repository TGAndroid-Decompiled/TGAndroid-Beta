package org.telegram.ui;
public final class p10 {
    public long f39316a;
    public int f39317b;

    public p10(int i10, long j3) {
        this.f39316a = j3;
        this.f39317b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && p10.class == obj.getClass()) {
            p10 p10Var = (p10) obj;
            if (this.f39316a == p10Var.f39316a && this.f39317b == p10Var.f39317b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f39317b;
    }
}
