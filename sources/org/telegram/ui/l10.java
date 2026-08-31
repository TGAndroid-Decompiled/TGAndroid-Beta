package org.telegram.ui;
public final class l10 {
    public long f38557a;
    public int f38558b;

    public l10(int i10, long j10) {
        this.f38557a = j10;
        this.f38558b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l10.class == obj.getClass()) {
            l10 l10Var = (l10) obj;
            if (this.f38557a == l10Var.f38557a && this.f38558b == l10Var.f38558b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f38558b;
    }
}
