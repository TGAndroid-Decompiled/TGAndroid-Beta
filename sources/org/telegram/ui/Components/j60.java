package org.telegram.ui.Components;
public final class j60 {
    public final int f25293a;
    public final int f25294b;

    public j60(int i10, int i11) {
        this.f25293a = i10;
        this.f25294b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j60.class == obj.getClass()) {
            j60 j60Var = (j60) obj;
            if (this.f25293a == j60Var.f25293a && this.f25294b == j60Var.f25294b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f25293a * 31) + this.f25294b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IntSize(");
        sb2.append(this.f25293a);
        sb2.append(", ");
        return a4.a.n(this.f25294b, ")", sb2);
    }
}
