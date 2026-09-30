package org.telegram.ui;
public final class l10 {
    public long f35294a;
    public int f35295b;

    public l10(int i10, long j3) {
        this.f35294a = j3;
        this.f35295b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l10.class == obj.getClass()) {
            l10 l10Var = (l10) obj;
            if (this.f35294a == l10Var.f35294a && this.f35295b == l10Var.f35295b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f35295b;
    }
}
