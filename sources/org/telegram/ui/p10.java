package org.telegram.ui;
public final class p10 {
    public long f36388a;
    public int f36389b;

    public p10(int i10, long j3) {
        this.f36388a = j3;
        this.f36389b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && p10.class == obj.getClass()) {
            p10 p10Var = (p10) obj;
            if (this.f36388a == p10Var.f36388a && this.f36389b == p10Var.f36389b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f36389b;
    }
}
