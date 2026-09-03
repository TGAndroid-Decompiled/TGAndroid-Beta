package org.telegram.ui;

import j$.util.Objects;
public final class fk0 extends bg.b {
    public int f34099c;
    public int d;
    public CharSequence e;
    public CharSequence f34100f;
    public lk0 f34101g;
    public int h;
    public boolean f34102i;

    public static fk0 b(int i10, String str, boolean z4) {
        ?? bVar = new bg.b(1, true);
        bVar.f34099c = i10;
        bVar.e = str;
        bVar.f34102i = z4;
        return bVar;
    }

    public static fk0 c(int i10, String str, String str2) {
        ?? bVar = new bg.b(5, true);
        bVar.f34099c = i10;
        bVar.e = str;
        bVar.f34100f = str2;
        return bVar;
    }

    public static fk0 d(int i10, String str) {
        ?? bVar = new bg.b(4, true);
        bVar.f34099c = i10;
        bVar.e = str;
        return bVar;
    }

    @Override
    public final boolean a(bg.b bVar) {
        if (this != bVar) {
            if (fk0.class == bVar.getClass()) {
                fk0 fk0Var = (fk0) bVar;
                if (this.f34099c == fk0Var.f34099c && this.d == fk0Var.d && this.h == fk0Var.h && this.f34102i == fk0Var.f34102i && Objects.equals(this.e, fk0Var.e) && Objects.equals(this.f34100f, fk0Var.f34100f) && this.f34101g == fk0Var.f34101g) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && fk0.class == obj.getClass()) {
            fk0 fk0Var = (fk0) obj;
            if (this.f34099c == fk0Var.f34099c && this.h == fk0Var.h && ((this.f1830a == 8 || (this.d == fk0Var.d && Objects.equals(this.e, fk0Var.e) && (this.f1830a == 6 || Objects.equals(this.f34100f, fk0Var.f34100f)))) && this.f34101g == fk0Var.f34101g)) {
                return true;
            }
        }
        return false;
    }
}
