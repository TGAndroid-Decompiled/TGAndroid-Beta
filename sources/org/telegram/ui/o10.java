package org.telegram.ui;
public final class o10 {
    public long f40443a;
    public int f40444b;

    public o10(int i10, long j3) {
        this.f40443a = j3;
        this.f40444b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o10.class == obj.getClass()) {
            o10 o10Var = (o10) obj;
            if (this.f40443a == o10Var.f40443a && this.f40444b == o10Var.f40444b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f40444b;
    }
}
