package org.telegram.ui.Components;

public final class m50 {

    public final int f30565a;

    public final int f30566b;

    public m50(int i10, int i11) {
        this.f30565a = i10;
        this.f30566b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m50.class == obj.getClass()) {
            m50 m50Var = (m50) obj;
            if (this.f30565a == m50Var.f30565a && this.f30566b == m50Var.f30566b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f30565a * 31) + this.f30566b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IntSize(");
        sb2.append(this.f30565a);
        sb2.append(", ");
        return a9.p.k(this.f30566b, ")", sb2);
    }
}
