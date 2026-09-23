package org.telegram.ui;
public final class m10 {
    public long f35122a;
    public int f35123b;

    public m10(int i10, long j3) {
        this.f35122a = j3;
        this.f35123b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m10.class == obj.getClass()) {
            m10 m10Var = (m10) obj;
            if (this.f35122a == m10Var.f35122a && this.f35123b == m10Var.f35123b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f35123b;
    }
}
