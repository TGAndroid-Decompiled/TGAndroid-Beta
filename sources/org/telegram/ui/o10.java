package org.telegram.ui;
public final class o10 {
    public long f40399a;
    public int f40400b;

    public o10(int i10, long j3) {
        this.f40399a = j3;
        this.f40400b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o10.class == obj.getClass()) {
            o10 o10Var = (o10) obj;
            if (this.f40399a == o10Var.f40399a && this.f40400b == o10Var.f40400b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f40400b;
    }
}
