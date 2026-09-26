package org.telegram.ui;
public final class l10 {
    public long f35204a;
    public int f35205b;

    public l10(int i10, long j3) {
        this.f35204a = j3;
        this.f35205b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l10.class == obj.getClass()) {
            l10 l10Var = (l10) obj;
            if (this.f35204a == l10Var.f35204a && this.f35205b == l10Var.f35205b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f35205b;
    }
}
