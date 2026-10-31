package org.telegram.ui.Components;
public final class k50 {
    public final int f27639a;
    public final int f27640b;

    public k50(int i10, int i11) {
        this.f27639a = i10;
        this.f27640b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && k50.class == obj.getClass()) {
            k50 k50Var = (k50) obj;
            if (this.f27639a == k50Var.f27639a && this.f27640b == k50Var.f27640b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f27639a * 31) + this.f27640b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IntSize(");
        sb2.append(this.f27639a);
        sb2.append(", ");
        return a1.g.p(sb2, this.f27640b, ")");
    }
}
