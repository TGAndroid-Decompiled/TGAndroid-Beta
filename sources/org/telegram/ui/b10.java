package org.telegram.ui;
public final class b10 {
    public long f37862a;
    public int f37863b;

    public b10(int i10, long j10) {
        this.f37862a = j10;
        this.f37863b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b10.class == obj.getClass()) {
            b10 b10Var = (b10) obj;
            if (this.f37862a == b10Var.f37862a && this.f37863b == b10Var.f37863b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f37863b;
    }
}
