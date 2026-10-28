package org.telegram.ui.Components;
public final class w60 {
    public final int f34460a;
    public final int f34461b;

    public w60(int i10, int i11) {
        this.f34460a = i10;
        this.f34461b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && w60.class == obj.getClass()) {
            w60 w60Var = (w60) obj;
            if (this.f34460a == w60Var.f34460a && this.f34461b == w60Var.f34461b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f34460a * 31) + this.f34461b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IntSize(");
        sb2.append(this.f34460a);
        sb2.append(", ");
        return a1.g.n(this.f34461b, ")", sb2);
    }
}
