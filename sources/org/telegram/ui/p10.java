package org.telegram.ui;
public final class p10 {
    public long f39381a;
    public int f39382b;

    public p10(int i10, long j3) {
        this.f39381a = j3;
        this.f39382b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && p10.class == obj.getClass()) {
            p10 p10Var = (p10) obj;
            if (this.f39381a == p10Var.f39381a && this.f39382b == p10Var.f39382b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f39382b;
    }
}
