package org.telegram.ui;

import j$.util.Objects;
public final class fk0 extends cg.b {
    public int f36808c;
    public int d;
    public CharSequence f36809e;
    public CharSequence f36810f;
    public lk0 f36811g;
    public int h;
    public boolean f36812i;

    public static fk0 b(int i10, String str, boolean z4) {
        ?? bVar = new cg.b(1, true);
        bVar.f36808c = i10;
        bVar.f36809e = str;
        bVar.f36812i = z4;
        return bVar;
    }

    public static fk0 c(int i10, String str, String str2) {
        ?? bVar = new cg.b(5, true);
        bVar.f36808c = i10;
        bVar.f36809e = str;
        bVar.f36810f = str2;
        return bVar;
    }

    public static fk0 d(int i10, String str) {
        ?? bVar = new cg.b(4, true);
        bVar.f36808c = i10;
        bVar.f36809e = str;
        return bVar;
    }

    @Override
    public final boolean a(cg.b bVar) {
        if (this != bVar) {
            if (fk0.class == bVar.getClass()) {
                fk0 fk0Var = (fk0) bVar;
                if (this.f36808c == fk0Var.f36808c && this.d == fk0Var.d && this.h == fk0Var.h && this.f36812i == fk0Var.f36812i && Objects.equals(this.f36809e, fk0Var.f36809e) && Objects.equals(this.f36810f, fk0Var.f36810f) && this.f36811g == fk0Var.f36811g) {
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
            if (this.f36808c == fk0Var.f36808c && this.h == fk0Var.h && ((this.f2505a == 8 || (this.d == fk0Var.d && Objects.equals(this.f36809e, fk0Var.f36809e) && (this.f2505a == 6 || Objects.equals(this.f36810f, fk0Var.f36810f)))) && this.f36811g == fk0Var.f36811g)) {
                return true;
            }
        }
        return false;
    }
}
