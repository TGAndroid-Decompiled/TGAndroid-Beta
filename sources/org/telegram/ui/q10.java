package org.telegram.ui;
public final class q10 {
    public long f41138a;
    public int f41139b;

    public q10(int i10, long j3) {
        this.f41138a = j3;
        this.f41139b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q10.class == obj.getClass()) {
            q10 q10Var = (q10) obj;
            if (this.f41138a == q10Var.f41138a && this.f41139b == q10Var.f41139b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f41139b;
    }
}
