package org.telegram.ui;
public final class m10 {
    public long f35953a;
    public int f35954b;

    public m10(int i10, long j10) {
        this.f35953a = j10;
        this.f35954b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m10.class == obj.getClass()) {
            m10 m10Var = (m10) obj;
            if (this.f35953a == m10Var.f35953a && this.f35954b == m10Var.f35954b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f35954b;
    }
}
