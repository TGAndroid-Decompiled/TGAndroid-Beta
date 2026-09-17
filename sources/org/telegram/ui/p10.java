package org.telegram.ui;
public final class p10 {
    public long f39409a;
    public int f39410b;

    public p10(int i10, long j3) {
        this.f39409a = j3;
        this.f39410b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && p10.class == obj.getClass()) {
            p10 p10Var = (p10) obj;
            if (this.f39409a == p10Var.f39409a && this.f39410b == p10Var.f39410b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f39410b;
    }
}
