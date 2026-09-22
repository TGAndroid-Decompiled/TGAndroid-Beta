package org.telegram.ui;
public final class p10 {
    public long f36392a;
    public int f36393b;

    public p10(int i10, long j3) {
        this.f36392a = j3;
        this.f36393b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && p10.class == obj.getClass()) {
            p10 p10Var = (p10) obj;
            if (this.f36392a == p10Var.f36392a && this.f36393b == p10Var.f36393b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f36393b;
    }
}
