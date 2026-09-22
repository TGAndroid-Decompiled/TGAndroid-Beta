package org.telegram.ui;
public final class p10 {
    public long f36450a;
    public int f36451b;

    public p10(int i10, long j3) {
        this.f36450a = j3;
        this.f36451b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && p10.class == obj.getClass()) {
            p10 p10Var = (p10) obj;
            if (this.f36450a == p10Var.f36450a && this.f36451b == p10Var.f36451b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f36451b;
    }
}
