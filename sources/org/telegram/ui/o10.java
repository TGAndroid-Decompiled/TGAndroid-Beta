package org.telegram.ui;
public final class o10 {
    public long f40397a;
    public int f40398b;

    public o10(int i10, long j3) {
        this.f40397a = j3;
        this.f40398b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o10.class == obj.getClass()) {
            o10 o10Var = (o10) obj;
            if (this.f40397a == o10Var.f40397a && this.f40398b == o10Var.f40398b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f40398b;
    }
}
