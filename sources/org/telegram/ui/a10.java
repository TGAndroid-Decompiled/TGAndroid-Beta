package org.telegram.ui;
public final class a10 {
    public long f35547a;
    public int f35548b;

    public a10(int i10, long j10) {
        this.f35547a = j10;
        this.f35548b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a10.class == obj.getClass()) {
            a10 a10Var = (a10) obj;
            if (this.f35547a == a10Var.f35547a && this.f35548b == a10Var.f35548b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f35548b;
    }
}
