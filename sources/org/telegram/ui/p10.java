package org.telegram.ui;
public final class p10 {
    public long f36295a;
    public int f36296b;

    public p10(int i10, long j3) {
        this.f36295a = j3;
        this.f36296b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && p10.class == obj.getClass()) {
            p10 p10Var = (p10) obj;
            if (this.f36295a == p10Var.f36295a && this.f36296b == p10Var.f36296b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f36296b;
    }
}
