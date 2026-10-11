package org.telegram.ui;
public final class n10 {
    public long f40110a;
    public int f40111b;

    public n10(int i10, long j3) {
        this.f40110a = j3;
        this.f40111b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && n10.class == obj.getClass()) {
            n10 n10Var = (n10) obj;
            if (this.f40110a == n10Var.f40110a && this.f40111b == n10Var.f40111b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f40111b;
    }
}
