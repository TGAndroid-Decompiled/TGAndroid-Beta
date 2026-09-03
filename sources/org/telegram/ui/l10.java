package org.telegram.ui;
public final class l10 {
    public long f38464a;
    public int f38465b;

    public l10(int i10, long j10) {
        this.f38464a = j10;
        this.f38465b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l10.class == obj.getClass()) {
            l10 l10Var = (l10) obj;
            if (this.f38464a == l10Var.f38464a && this.f38465b == l10Var.f38465b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f38465b;
    }
}
