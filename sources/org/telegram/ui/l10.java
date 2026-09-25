package org.telegram.ui;
public final class l10 {
    public long f35206a;
    public int f35207b;

    public l10(int i10, long j3) {
        this.f35206a = j3;
        this.f35207b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l10.class == obj.getClass()) {
            l10 l10Var = (l10) obj;
            if (this.f35206a == l10Var.f35206a && this.f35207b == l10Var.f35207b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f35207b;
    }
}
