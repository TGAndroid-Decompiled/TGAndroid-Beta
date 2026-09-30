package org.telegram.ui;
public final class l10 {
    public long f35188a;
    public int f35189b;

    public l10(int i10, long j3) {
        this.f35188a = j3;
        this.f35189b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l10.class == obj.getClass()) {
            l10 l10Var = (l10) obj;
            if (this.f35188a == l10Var.f35188a && this.f35189b == l10Var.f35189b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f35189b;
    }
}
