package org.telegram.ui.Components;

import j$.util.Objects;
public final class c9 {
    public int f25292a;
    public boolean f25293b;
    public int f25294c;
    public int d;
    public int f25295e;
    public int f25296f;

    public final c9 a() {
        ?? obj = new Object();
        obj.f25294c = this.f25294c;
        obj.d = this.d;
        obj.f25295e = this.f25295e;
        obj.f25296f = this.f25296f;
        obj.f25293b = this.f25293b;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c9)) {
            return false;
        }
        c9 c9Var = (c9) obj;
        if (this.f25294c == c9Var.f25294c && this.d == c9Var.d && this.f25295e == c9Var.f25295e && this.f25296f == c9Var.f25296f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f25292a), Integer.valueOf(this.f25294c), Integer.valueOf(this.d), Integer.valueOf(this.f25295e), Integer.valueOf(this.f25296f));
    }
}
