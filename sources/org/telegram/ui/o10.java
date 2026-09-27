package org.telegram.ui;
public final class o10 {
    public long f36121a;
    public int f36122b;

    public o10(int i10, long j3) {
        this.f36121a = j3;
        this.f36122b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o10.class == obj.getClass()) {
            o10 o10Var = (o10) obj;
            if (this.f36121a == o10Var.f36121a && this.f36122b == o10Var.f36122b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f36122b;
    }
}
