package org.telegram.ui;
public final class n10 {
    public long f40144a;
    public int f40145b;

    public n10(int i10, long j3) {
        this.f40144a = j3;
        this.f40145b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && n10.class == obj.getClass()) {
            n10 n10Var = (n10) obj;
            if (this.f40144a == n10Var.f40144a && this.f40145b == n10Var.f40145b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f40145b;
    }
}
