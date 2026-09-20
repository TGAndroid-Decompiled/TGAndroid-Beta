package org.telegram.ui;
public final class p10 {
    public long f36423a;
    public int f36424b;

    public p10(int i10, long j3) {
        this.f36423a = j3;
        this.f36424b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && p10.class == obj.getClass()) {
            p10 p10Var = (p10) obj;
            if (this.f36423a == p10Var.f36423a && this.f36424b == p10Var.f36424b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f36424b;
    }
}
