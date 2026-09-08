package org.telegram.ui;
public final class p10 {
    public long f39408a;
    public int f39409b;

    public p10(int i10, long j3) {
        this.f39408a = j3;
        this.f39409b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && p10.class == obj.getClass()) {
            p10 p10Var = (p10) obj;
            if (this.f39408a == p10Var.f39408a && this.f39409b == p10Var.f39409b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f39409b;
    }
}
