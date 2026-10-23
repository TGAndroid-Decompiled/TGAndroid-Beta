package org.telegram.ui;
public final class a10 {
    public long f35546a;
    public int f35547b;

    public a10(int i10, long j10) {
        this.f35546a = j10;
        this.f35547b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a10.class == obj.getClass()) {
            a10 a10Var = (a10) obj;
            if (this.f35546a == a10Var.f35546a && this.f35547b == a10Var.f35547b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f35547b;
    }
}
