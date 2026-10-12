package org.telegram.ui;
public final class q10 {
    public long f41140a;
    public int f41141b;

    public q10(int i10, long j3) {
        this.f41140a = j3;
        this.f41141b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q10.class == obj.getClass()) {
            q10 q10Var = (q10) obj;
            if (this.f41140a == q10Var.f41140a && this.f41141b == q10Var.f41141b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f41141b;
    }
}
