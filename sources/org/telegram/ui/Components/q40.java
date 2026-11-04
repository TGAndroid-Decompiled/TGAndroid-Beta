package org.telegram.ui.Components;
public final class q40 {
    public final int f37341a;
    public final int f37342b;

    public q40(int i3, int i10) {
        this.f37341a = i3;
        this.f37342b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q40.class == obj.getClass()) {
            q40 q40Var = (q40) obj;
            if (this.f37341a == q40Var.f37341a && this.f37342b == q40Var.f37342b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f37341a * 31) + this.f37342b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IntSize(");
        sb2.append(this.f37341a);
        sb2.append(", ");
        return a1.g.o(this.f37342b, ")", sb2);
    }
}
