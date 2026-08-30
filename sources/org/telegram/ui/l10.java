package org.telegram.ui;
public final class l10 {
    public long f35872a;
    public int f35873b;

    public l10(int i10, long j10) {
        this.f35872a = j10;
        this.f35873b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l10.class == obj.getClass()) {
            l10 l10Var = (l10) obj;
            if (this.f35872a == l10Var.f35872a && this.f35873b == l10Var.f35873b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f35873b;
    }
}
