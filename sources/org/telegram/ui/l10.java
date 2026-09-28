package org.telegram.ui;
public final class l10 {
    public long f35205a;
    public int f35206b;

    public l10(int i10, long j3) {
        this.f35205a = j3;
        this.f35206b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l10.class == obj.getClass()) {
            l10 l10Var = (l10) obj;
            if (this.f35205a == l10Var.f35205a && this.f35206b == l10Var.f35206b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f35206b;
    }
}
