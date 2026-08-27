package org.telegram.ui;

public final class a10 {

    public long f36332a;

    public int f36333b;

    public a10(int i10, long j10) {
        this.f36332a = j10;
        this.f36333b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a10.class == obj.getClass()) {
            a10 a10Var = (a10) obj;
            if (this.f36332a == a10Var.f36332a && this.f36333b == a10Var.f36333b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f36333b;
    }
}
