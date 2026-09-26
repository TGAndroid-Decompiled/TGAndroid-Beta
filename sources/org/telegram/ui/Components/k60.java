package org.telegram.ui.Components;
public final class k60 {
    public final int f25640a;
    public final int f25641b;

    public k60(int i10, int i11) {
        this.f25640a = i10;
        this.f25641b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && k60.class == obj.getClass()) {
            k60 k60Var = (k60) obj;
            if (this.f25640a == k60Var.f25640a && this.f25641b == k60Var.f25641b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f25640a * 31) + this.f25641b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IntSize(");
        sb2.append(this.f25640a);
        sb2.append(", ");
        return a4.a.o(this.f25641b, ")", sb2);
    }
}
