package org.telegram.ui;
public final class l10 {
    public long f35173a;
    public int f35174b;

    public l10(int i10, long j3) {
        this.f35173a = j3;
        this.f35174b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l10.class == obj.getClass()) {
            l10 l10Var = (l10) obj;
            if (this.f35173a == l10Var.f35173a && this.f35174b == l10Var.f35174b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f35174b;
    }
}
